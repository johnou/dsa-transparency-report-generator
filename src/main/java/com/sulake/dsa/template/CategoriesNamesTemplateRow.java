package com.sulake.dsa.template;

import com.fasterxml.jackson.annotation.JsonProperty;

/** DTO for 4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_2_categories_names.csv */
public class CategoriesNamesTemplateRow {
    @JsonProperty("Category label")
    public String categoryLabel;
    @JsonProperty("Category description")
    public String categoryDescription;
    @JsonProperty("Category of illegal content / incompatible with the terms and conditions")
    public String categoryOfIllegalContentIncompatibleWithTheTermsAndConditions;
    @JsonProperty("Contextual information")
    public String contextualInformation;
}
