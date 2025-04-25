package com.sulake.dsa.template;

import com.fasterxml.jackson.annotation.JsonProperty;

/** DTO for 4_EN_Annex_I__Templates_for_Transparency_Reports_CSV_Part_3_member_states_orders.csv */
public class MemberStatesOrdersTemplateRow {
    @JsonProperty("Applicability")
    public String applicability;
    @JsonProperty("Service")
    public String service;
    @JsonProperty("Reporting period")
    public String reportingPeriod;
    @JsonProperty("Category of illegal content")
    public String categoryOfIllegalContent;
    @JsonProperty("Description of the sub-category \"Other\"")
    public String descriptionOfTheSubCategoryOther;
    @JsonProperty("Scope")
    public String scope;
    @JsonProperty("Number of orders to act against illegal content received")
    public long numberOfOrdersToActAgainstIllegalContentReceived;
    @JsonProperty("Number of specific items of information included in the total number of orders to act against illegal content")
    public long numberOfSpecificItemsOfInformationIncludedInTheTotalNumberOfOrdersToActAgainstIllegalContent;
    @JsonProperty("Median time to inform the authority of the receipt of the order to act against illegal content")
    public float medianTimeToInformTheAuthorityOfTheReceiptOfTheOrderToActAgainstIllegalContent;
    @JsonProperty("Median time to give effect to the order to act against illegal content")
    public float medianTimeToGiveEffectToTheOrderToActAgainstIllegalContent;
    @JsonProperty("Number of orders to provide information")
    public long numberOfOrdersToProvideInformation;
    @JsonProperty("Median time to inform the authority of the receipt of the order to provide information")
    public float medianTimeToInformTheAuthorityOfTheReceiptOfTheOrderToProvideInformation;
    @JsonProperty("Median time to give effect to the order to provide information")
    public float medianTimeToGiveEffectToTheOrderToProvideInformation;
    @JsonProperty("Contextual information on number of orders to act against illegal content received")
    public String contextualInformationOnNumberOfOrdersToActAgainstIllegalContentReceived;
    @JsonProperty("Contextual information on number of specific items of information included in the total number of orders to act against illegal content")
    public String contextualInformationOnNumberOfSpecificItemsOfInformationIncludedInTheTotalNumberOfOrdersToActAgainstIllegalContent;
    @JsonProperty("Contextual information on Median time to inform the authority of the receipt of the order to act against illegal content")
    public String contextualInformationOnMedianTimeToInformTheAuthorityOfTheReceiptOfTheOrderToActAgainstIllegalContent;
    @JsonProperty("Contextual information on Median time to give effect to the order to act against illegal content")
    public String contextualInformationOnMedianTimeToGiveEffectToTheOrderToActAgainstIllegalContent;
    @JsonProperty("Contextual information on Number of orders to provide information")
    public String contextualInformationOnNumberOfOrdersToProvideInformation;
    @JsonProperty("Contextual information on Median time to inform the authority of the receipt of the order to provide information")
    public String contextualInformationOnMedianTimeToInformTheAuthorityOfTheReceiptOfTheOrderToProvideInformation;
    @JsonProperty("Contextual information on Median time to give effect to the order to provide information")
    public String contextualInformationOnMedianTimeToGiveEffectToTheOrderToProvideInformation;
}
