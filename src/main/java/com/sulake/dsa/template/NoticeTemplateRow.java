package com.sulake.dsa.template;

import com.fasterxml.jackson.annotation.JsonProperty;

/** DTO for 4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_4_notices.csv */
public class NoticeTemplateRow {
    @JsonProperty("Applicability")
    public String applicability;
    @JsonProperty("Service")
    public String service;
    @JsonProperty("Reporting period")
    public String reportingPeriod;
    @JsonProperty("Category of illegal content")
    public String categoryOfIllegalContent;
    @JsonProperty("Description of the sub-category \"Other\"")
    public String descriptionOfSubCategoryOther;
    @JsonProperty("Number of notices received")
    public long numberOfNoticesReceived;
    @JsonProperty("Number of notices received from Trusted flaggers")
    public long numberOfNoticesReceivedFromTrustedFlaggers;
    @JsonProperty("Number of specific items of information included in the total number of notices")
    public long numberOfSpecificItemsIncluded;
    @JsonProperty("Number of specific items of information included in the total number of notices by Trusted Flaggers (Trusted Flagger notices)")
    public long numberOfSpecificItemsFromTrusted;
    @JsonProperty("Median time to take action")
    public String getMedianTimeToAction() {
        return String.format("%.2f", medianTimeToAction);
    }
    public float medianTimeToAction;
    @JsonProperty("Median time to take action (Trusted Flagger notices)")
    public String getMedianTimeToActionTrusted() {
        return String.format("%.2f", medianTimeToActionTrusted);
    }
    public float medianTimeToActionTrusted;
    @JsonProperty("Number of actions taken on the basis of the law")
    public long numberOfActionsTakenByLaw;
    @JsonProperty("Number of actions taken on the basis of the law (Trusted Flagger notices)")
    public long numberOfActionsTakenByLawTrusted;
    @JsonProperty("Number of actions taken on the basis of the terms and conditions of the service")
    public long numberOfActionsTakenByTOS;
    @JsonProperty("Number of actions taken on the basis of the terms and conditions of the service (Trusted Flagger notices)")
    public long numberOfActionsTakenByTOSTrusted;
    @JsonProperty("Contextual information on Number of notices received")
    public String contextualInfoNotices;
    @JsonProperty("Contextual information on Number of notices received from Trusted flaggers")
    public String contextualInfoNoticesTrusted;
    @JsonProperty("Contextual information on Number of specific items of information included in the total number of notices")
    public String contextualInfoItems;
    @JsonProperty("Contextual information on Number of specific items of information included in the total number of notices by Trusted Flaggers (Trusted Flagger notices)")
    public String contextualInfoItemsTrusted;
    @JsonProperty("Contextual information on Median time to take action")
    public String contextualInfoActionTime;
    @JsonProperty("Contextual information on Median time to take action (Trusted Flagger notices)")
    public String contextualInfoActionTimeTrusted;
    @JsonProperty("Contextual information on Number of actions taken on the basis of the law")
    public String contextualInfoLaw;
    @JsonProperty("Contextual information on Number of actions taken on the basis of the law (Trusted Flagger notices)")
    public String contextualInfoLawTrusted;
    @JsonProperty("Contextual information on Number of actions taken on the basis of the terms and conditions of the service")
    public String contextualInfoTOS;
    @JsonProperty("Contextual information on Number of actions taken on the basis of the terms and conditions of the service (Trusted Flagger notices)")
    public String contextualInfoTOSTrusted;

    public String getCategoryOfIllegalContent() {
        return categoryOfIllegalContent;
    }

    public String getDescriptionOfSubCategoryOther() {
        return descriptionOfSubCategoryOther;
    }

    public void setNumberOfNoticesReceived(long v) {
        this.numberOfNoticesReceived = v;
    }

    public void setNumberOfNoticesReceivedFromTrustedFlaggers(long v) {
        this.numberOfNoticesReceivedFromTrustedFlaggers = v;
    }

    public void setNumberOfSpecificItemsIncluded(long v) {
        this.numberOfSpecificItemsIncluded = v;
    }

    public void setNumberOfSpecificItemsFromTrusted(long v) {
        this.numberOfSpecificItemsFromTrusted = v;
    }

    public void setNumberOfActionsTakenByLaw(long v) {
        this.numberOfActionsTakenByLaw = v;
    }

    public void setNumberOfActionsTakenByTOS(long v) {
        this.numberOfActionsTakenByTOS = v;
    }
}
