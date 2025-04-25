package com.sulake.dsa.template;

import com.fasterxml.jackson.annotation.JsonProperty;

/** DTO for 4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_11_qualitative.csv */
public class QualitativeTemplateRow {
    @JsonProperty("Applicability")
    public String applicability;
    @JsonProperty("Service")
    public String service;
    @JsonProperty("Reporting period")
    public String reportingPeriod;
    @JsonProperty("Indicator")
    public String indicator;
    @JsonProperty("Value")
    public String value;
}
