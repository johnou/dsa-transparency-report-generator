package com.sulake.dsa.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.sulake.dsa.template.NoticeTemplateRow;

import static com.sulake.dsa.ExportMain.REPORT_PERIOD;

/**
 * Processor for NoticeTemplateRow rows.
 */
public class NoticesProcessor implements RowProcessor<NoticeTemplateRow> {
    @Override
    public void process(List<NoticeTemplateRow> rows, String service) {
        ListIterator<NoticeTemplateRow> rowListIterator = rows.listIterator();

        String currentCategory = null;
        NoticeTemplateRow currentCategoryRow = null;
        NoticeTemplateRow totalRow = null;

        List<Long> medianTimeToActionPerCategory = new ArrayList<>();
        List<Long> medianTimeForTotal = new ArrayList<>();

        while (rowListIterator.hasNext()) {
            NoticeTemplateRow row = rowListIterator.next();
            row.service = service;
            row.reportingPeriod = REPORT_PERIOD;
            if ("TOTAL".equals(row.categoryOfIllegalContent)) {
                totalRow = row;
            }
            if (row.categoryOfIllegalContent.startsWith("STATEMENT_CATEGORY_")) {
                currentCategory = row.categoryOfIllegalContent;
                currentCategoryRow = row;
                medianTimeToActionPerCategory.clear();
            }
            if (row.categoryOfIllegalContent.startsWith("KEYWORD_")) {
                // grouped by dsaCategory + keyword + other
            }

            if ("KEYWORD_OTHER".equals(row.categoryOfIllegalContent)) {
                if ("Text to detail the \"Other\" keyword.".equals(row.descriptionOfSubCategoryOther)) {
                    System.out.println("Inserting new row..");
                    // dynamically insert new row for other keyword
                    NoticeTemplateRow newRow = new NoticeTemplateRow();
                    newRow.applicability = row.applicability;
                    newRow.categoryOfIllegalContent = row.categoryOfIllegalContent;
                    newRow.descriptionOfSubCategoryOther = row.descriptionOfSubCategoryOther;
                    rowListIterator.add(newRow);
                    rowListIterator.previous(); // process the new row
                }
                row.descriptionOfSubCategoryOther = "foo";
            }
        }
    }
}
