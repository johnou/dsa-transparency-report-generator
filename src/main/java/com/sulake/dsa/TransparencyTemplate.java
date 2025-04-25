package com.sulake.dsa;

import com.sulake.dsa.processor.*;
import com.sulake.dsa.template.*;

public enum TransparencyTemplate {
    SUMMARY(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_1_summary.csv",
            SummaryTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_1_summary.csv",
            new SummaryProcessor()
    ),
    CATEGORIES_NAMES(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_2_categories_names.csv",
            CategoriesNamesTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_2_categories_names.csv",
            new CategoriesNamesProcessor()
    ),
    MEMBER_STATES_ORDERS(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_3_member_states_orders.csv",
            MemberStatesOrdersTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_3_member_states_orders.csv",
            new MemberStatesOrdersProcessor()
    ),
    NOTICES(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_4_notices.csv",
            NoticeTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_4_notices.csv",
            new NoticesProcessor()
    ),
    OWN_INITIATIVE_ILLEGAL(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_5_own_initiative_illegal.csv",
            OwnInitiativeIllegalTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_5_own_initiative_illegal.csv",
            new OwnInitiativeIllegalProcessor()
    ),
    OWN_INITIATIVE_TC(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_6_own_initiative_TC.csv",
            OwnInitiativeTCTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_6_own_initiative_TC.csv",
            new OwnInitiativeTCProcessor()
    ),
    APPEALS_AND_RECIDIVISM(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_7_appeals_and_recidivism.csv",
            AppealsAndRecidivismTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_7_appeals_and_recidivism.csv",
            new AppealsAndRecidivismProcessor()
    ),
    AUTOMATED_MEANS(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_8_automated_means.csv",
            AutomatedMeansTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_8_automated_means.csv",
            new AutomatedMeansProcessor()
    ),
    HUMAN_RESOURCES(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_9_human_resources.csv",
            HumanResourcesTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_9_human_resources.csv",
            new HumanResourcesProcessor()
    ),
    AMAR(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_10_AMAR.csv",
            AMARTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_10_AMAR.csv",
            new AMARProcessor()
    ),
    QUALITATIVE(
            "4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_11_qualitative.csv",
            QualitativeTemplateRow.class,
            "EN_Annex_I__%s_Transparency_Reports_CSV_Part_11_qualitative.csv",
            new QualitativeProcessor()
    );

    private final String resourcePath;
    private final Class<?> dtoClass;
    private final String outputPattern;
    private final RowProcessor<?> processor;

    TransparencyTemplate(String resourcePath, Class<?> dtoClass, String outputPattern, RowProcessor<?> processor) {
        this.resourcePath = resourcePath;
        this.dtoClass = dtoClass;
        this.outputPattern = outputPattern;
        this.processor = processor;
    }

    @SuppressWarnings("unchecked")
    public <T> Class<T> getDtoClass() {
        return (Class<T>) dtoClass;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public String formatOutputFile(String service) {
        return String.format(outputPattern, service.replace(" ", "_"));
    }

    @SuppressWarnings("unchecked")
    public <T> RowProcessor<T> getProcessor() {
        return (RowProcessor<T>) processor;
    }
}
