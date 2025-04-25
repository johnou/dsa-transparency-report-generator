package com.sulake.dsa.template;

import com.fasterxml.jackson.annotation.JsonProperty;

/** DTO for 4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_8_automated_means.csv */
public class AutomatedMeansTemplateRow {
    @JsonProperty("Applicability")
    public String applicability;
    @JsonProperty("Service")
    public String service;
    @JsonProperty("Reporting period")
    public String reportingPeriod;
    @JsonProperty("Section")
    public String section;
    @JsonProperty("Indicator")
    public String indicator;
    @JsonProperty("Scope")
    public String scope;
    @JsonProperty("Value")
    public String value;
    @JsonProperty("Contextual Information")
    public String contextualInformation;
}
