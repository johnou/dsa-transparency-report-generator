package com.sulake.dsa.processor;

import java.util.List;
import java.util.ListIterator;

import com.sulake.dsa.ExportMain;
import com.sulake.dsa.template.SummaryTemplateRow;

import static com.sulake.dsa.ExportMain.SERVICE_PROVIDER;

/**
 * Processor for SummaryTemplateRow rows.
 */
public class SummaryProcessor implements RowProcessor<SummaryTemplateRow> {

    @Override
    public void process(List<SummaryTemplateRow> rows, String service) {
        ListIterator<SummaryTemplateRow> rowListIterator = rows.listIterator();

        while (rowListIterator.hasNext()) {
            SummaryTemplateRow row = rowListIterator.next();
            row.service = service;
            switch (row.indicator) {
                case "Name of the service provider":
                    row.value = SERVICE_PROVIDER;
                    break;
                case "Date of the publication of the report":
                    row.value = ExportMain.DATE_OF_PUBLICATION_OF_THE_REPORT;
                    break;
                case "Date of the publication of the latest previous report":
                    row.value = ExportMain.DATE_OF_PUBLICATION_OF_THE_LATEST_PREVIOUS_REPORT;
                    break;
                case "Starting date of reporting period":
                    row.value = ExportMain.REPORT_START_DATE;
                    break;
                case "Ending date of reporting period":
                    row.value = ExportMain.REPORT_END_DATE;
                    break;
            }
        }
    }
}
