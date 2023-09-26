/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult;
import com.bytedance.ads.model.ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult;
import com.bytedance.ads.model.ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult;
import com.bytedance.ads.model.ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult;
import com.bytedance.ads.model.ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult;
import com.bytedance.ads.model.ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult;
import com.bytedance.ads.model.ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * ToolsDiagnosisAdGetV2V2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class ToolsDiagnosisAdGetV2V2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BID_RESULT = "bid_result";
  @SerializedName(SERIALIZED_NAME_BID_RESULT)
  private ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult bidResult = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_RESULT = "budget_result";
  @SerializedName(SERIALIZED_NAME_BUDGET_RESULT)
  private ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult budgetResult = null;

  public static final String SERIALIZED_NAME_COST_BIAS = "cost_bias";
  @SerializedName(SERIALIZED_NAME_COST_BIAS)
  private Double costBias = null;

  public static final String SERIALIZED_NAME_CTR_RESULT = "ctr_result";
  @SerializedName(SERIALIZED_NAME_CTR_RESULT)
  private ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult ctrResult = null;

  public static final String SERIALIZED_NAME_CVR_RESULT = "cvr_result";
  @SerializedName(SERIALIZED_NAME_CVR_RESULT)
  private ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult cvrResult = null;

  public static final String SERIALIZED_NAME_DIAGNOSIS_TIME = "diagnosis_time";
  @SerializedName(SERIALIZED_NAME_DIAGNOSIS_TIME)
  private Long diagnosisTime = null;

  public static final String SERIALIZED_NAME_DIFFERENCE_RATIO_SHOW = "difference_ratio_show";
  @SerializedName(SERIALIZED_NAME_DIFFERENCE_RATIO_SHOW)
  private Double differenceRatioShow = null;

  public static final String SERIALIZED_NAME_MATURE_SHOW = "mature_show";
  @SerializedName(SERIALIZED_NAME_MATURE_SHOW)
  private Double matureShow = null;

  public static final String SERIALIZED_NAME_POTENTIAL_RESULT = "potential_result";
  @SerializedName(SERIALIZED_NAME_POTENTIAL_RESULT)
  private ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult potentialResult = null;

  public static final String SERIALIZED_NAME_QUALITY_RESULT = "quality_result";
  @SerializedName(SERIALIZED_NAME_QUALITY_RESULT)
  private ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult qualityResult = null;

  public static final String SERIALIZED_NAME_REC_SUGGESTION_CONTENT = "rec_suggestion_content";
  @SerializedName(SERIALIZED_NAME_REC_SUGGESTION_CONTENT)
  private String recSuggestionContent = null;

  public static final String SERIALIZED_NAME_REC_SUGGESTION_MODE = "rec_suggestion_mode";
  @SerializedName(SERIALIZED_NAME_REC_SUGGESTION_MODE)
  private String recSuggestionMode = null;

  public static final String SERIALIZED_NAME_REC_SUGGESTION_REASON = "rec_suggestion_reason";
  @SerializedName(SERIALIZED_NAME_REC_SUGGESTION_REASON)
  private String recSuggestionReason = null;

  public static final String SERIALIZED_NAME_SCENE_DESC = "scene_desc";
  @SerializedName(SERIALIZED_NAME_SCENE_DESC)
  private String sceneDesc = null;

  public static final String SERIALIZED_NAME_SCENE_TEXT = "scene_text";
  @SerializedName(SERIALIZED_NAME_SCENE_TEXT)
  private String sceneText = null;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Long show = null;

  public static final String SERIALIZED_NAME_SIMILAR_RATIO_SHOW = "similar_ratio_show";
  @SerializedName(SERIALIZED_NAME_SIMILAR_RATIO_SHOW)
  private Double similarRatioShow = null;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private List<String> summary = null;

  public static final String SERIALIZED_NAME_TARGET_RESULT = "target_result";
  @SerializedName(SERIALIZED_NAME_TARGET_RESULT)
  private ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult targetResult = null;

  public ToolsDiagnosisAdGetV2V2ResponseDataListInner() {
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * 
   * @return adName
  **/
  @javax.annotation.Nullable
  public String getAdName() {
    return adName;
  }


  public void setAdName(String adName) {
    this.adName = adName;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner bidResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult bidResult) {
    
    this.bidResult = bidResult;
    return this;
  }

   /**
   * Get bidResult
   * @return bidResult
  **/
  @javax.annotation.Nullable
  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult getBidResult() {
    return bidResult;
  }


  public void setBidResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult bidResult) {
    this.bidResult = bidResult;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner budgetResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult budgetResult) {
    
    this.budgetResult = budgetResult;
    return this;
  }

   /**
   * Get budgetResult
   * @return budgetResult
  **/
  @javax.annotation.Nullable
  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult getBudgetResult() {
    return budgetResult;
  }


  public void setBudgetResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult budgetResult) {
    this.budgetResult = budgetResult;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner costBias(Double costBias) {
    
    this.costBias = costBias;
    return this;
  }

   /**
   * 
   * @return costBias
  **/
  @javax.annotation.Nullable
  public Double getCostBias() {
    return costBias;
  }


  public void setCostBias(Double costBias) {
    this.costBias = costBias;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner ctrResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult ctrResult) {
    
    this.ctrResult = ctrResult;
    return this;
  }

   /**
   * Get ctrResult
   * @return ctrResult
  **/
  @javax.annotation.Nullable
  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult getCtrResult() {
    return ctrResult;
  }


  public void setCtrResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult ctrResult) {
    this.ctrResult = ctrResult;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner cvrResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult cvrResult) {
    
    this.cvrResult = cvrResult;
    return this;
  }

   /**
   * Get cvrResult
   * @return cvrResult
  **/
  @javax.annotation.Nullable
  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult getCvrResult() {
    return cvrResult;
  }


  public void setCvrResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult cvrResult) {
    this.cvrResult = cvrResult;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner diagnosisTime(Long diagnosisTime) {
    
    this.diagnosisTime = diagnosisTime;
    return this;
  }

   /**
   * 
   * @return diagnosisTime
  **/
  @javax.annotation.Nullable
  public Long getDiagnosisTime() {
    return diagnosisTime;
  }


  public void setDiagnosisTime(Long diagnosisTime) {
    this.diagnosisTime = diagnosisTime;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner differenceRatioShow(Double differenceRatioShow) {
    
    this.differenceRatioShow = differenceRatioShow;
    return this;
  }

   /**
   * 
   * @return differenceRatioShow
  **/
  @javax.annotation.Nullable
  public Double getDifferenceRatioShow() {
    return differenceRatioShow;
  }


  public void setDifferenceRatioShow(Double differenceRatioShow) {
    this.differenceRatioShow = differenceRatioShow;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner matureShow(Double matureShow) {
    
    this.matureShow = matureShow;
    return this;
  }

   /**
   * 
   * @return matureShow
  **/
  @javax.annotation.Nullable
  public Double getMatureShow() {
    return matureShow;
  }


  public void setMatureShow(Double matureShow) {
    this.matureShow = matureShow;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner potentialResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult potentialResult) {
    
    this.potentialResult = potentialResult;
    return this;
  }

   /**
   * Get potentialResult
   * @return potentialResult
  **/
  @javax.annotation.Nullable
  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult getPotentialResult() {
    return potentialResult;
  }


  public void setPotentialResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult potentialResult) {
    this.potentialResult = potentialResult;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner qualityResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult qualityResult) {
    
    this.qualityResult = qualityResult;
    return this;
  }

   /**
   * Get qualityResult
   * @return qualityResult
  **/
  @javax.annotation.Nullable
  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult getQualityResult() {
    return qualityResult;
  }


  public void setQualityResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult qualityResult) {
    this.qualityResult = qualityResult;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner recSuggestionContent(String recSuggestionContent) {
    
    this.recSuggestionContent = recSuggestionContent;
    return this;
  }

   /**
   * 
   * @return recSuggestionContent
  **/
  @javax.annotation.Nullable
  public String getRecSuggestionContent() {
    return recSuggestionContent;
  }


  public void setRecSuggestionContent(String recSuggestionContent) {
    this.recSuggestionContent = recSuggestionContent;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner recSuggestionMode(String recSuggestionMode) {
    
    this.recSuggestionMode = recSuggestionMode;
    return this;
  }

   /**
   * 
   * @return recSuggestionMode
  **/
  @javax.annotation.Nullable
  public String getRecSuggestionMode() {
    return recSuggestionMode;
  }


  public void setRecSuggestionMode(String recSuggestionMode) {
    this.recSuggestionMode = recSuggestionMode;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner recSuggestionReason(String recSuggestionReason) {
    
    this.recSuggestionReason = recSuggestionReason;
    return this;
  }

   /**
   * 
   * @return recSuggestionReason
  **/
  @javax.annotation.Nullable
  public String getRecSuggestionReason() {
    return recSuggestionReason;
  }


  public void setRecSuggestionReason(String recSuggestionReason) {
    this.recSuggestionReason = recSuggestionReason;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner sceneDesc(String sceneDesc) {
    
    this.sceneDesc = sceneDesc;
    return this;
  }

   /**
   * 
   * @return sceneDesc
  **/
  @javax.annotation.Nullable
  public String getSceneDesc() {
    return sceneDesc;
  }


  public void setSceneDesc(String sceneDesc) {
    this.sceneDesc = sceneDesc;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner sceneText(String sceneText) {
    
    this.sceneText = sceneText;
    return this;
  }

   /**
   * 
   * @return sceneText
  **/
  @javax.annotation.Nullable
  public String getSceneText() {
    return sceneText;
  }


  public void setSceneText(String sceneText) {
    this.sceneText = sceneText;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner show(Long show) {
    
    this.show = show;
    return this;
  }

   /**
   * 
   * @return show
  **/
  @javax.annotation.Nullable
  public Long getShow() {
    return show;
  }


  public void setShow(Long show) {
    this.show = show;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner similarRatioShow(Double similarRatioShow) {
    
    this.similarRatioShow = similarRatioShow;
    return this;
  }

   /**
   * 
   * @return similarRatioShow
  **/
  @javax.annotation.Nullable
  public Double getSimilarRatioShow() {
    return similarRatioShow;
  }


  public void setSimilarRatioShow(Double similarRatioShow) {
    this.similarRatioShow = similarRatioShow;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner summary(List<String> summary) {
    
    this.summary = summary;
    return this;
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInner addSummaryItem(String summaryItem) {
    if (this.summary == null) {
      this.summary = new ArrayList<>();
    }
    this.summary.add(summaryItem);
    return this;
  }

   /**
   * 
   * @return summary
  **/
  @javax.annotation.Nullable
  public List<String> getSummary() {
    return summary;
  }


  public void setSummary(List<String> summary) {
    this.summary = summary;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInner targetResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult targetResult) {
    
    this.targetResult = targetResult;
    return this;
  }

   /**
   * Get targetResult
   * @return targetResult
  **/
  @javax.annotation.Nullable
  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult getTargetResult() {
    return targetResult;
  }


  public void setTargetResult(ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult targetResult) {
    this.targetResult = targetResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisAdGetV2V2ResponseDataListInner toolsDiagnosisAdGetV2V2ResponseDataListInner = (ToolsDiagnosisAdGetV2V2ResponseDataListInner) o;
    return Objects.equals(this.adId, toolsDiagnosisAdGetV2V2ResponseDataListInner.adId) &&
        Objects.equals(this.adName, toolsDiagnosisAdGetV2V2ResponseDataListInner.adName) &&
        Objects.equals(this.bid, toolsDiagnosisAdGetV2V2ResponseDataListInner.bid) &&
        Objects.equals(this.bidResult, toolsDiagnosisAdGetV2V2ResponseDataListInner.bidResult) &&
        Objects.equals(this.budget, toolsDiagnosisAdGetV2V2ResponseDataListInner.budget) &&
        Objects.equals(this.budgetResult, toolsDiagnosisAdGetV2V2ResponseDataListInner.budgetResult) &&
        Objects.equals(this.costBias, toolsDiagnosisAdGetV2V2ResponseDataListInner.costBias) &&
        Objects.equals(this.ctrResult, toolsDiagnosisAdGetV2V2ResponseDataListInner.ctrResult) &&
        Objects.equals(this.cvrResult, toolsDiagnosisAdGetV2V2ResponseDataListInner.cvrResult) &&
        Objects.equals(this.diagnosisTime, toolsDiagnosisAdGetV2V2ResponseDataListInner.diagnosisTime) &&
        Objects.equals(this.differenceRatioShow, toolsDiagnosisAdGetV2V2ResponseDataListInner.differenceRatioShow) &&
        Objects.equals(this.matureShow, toolsDiagnosisAdGetV2V2ResponseDataListInner.matureShow) &&
        Objects.equals(this.potentialResult, toolsDiagnosisAdGetV2V2ResponseDataListInner.potentialResult) &&
        Objects.equals(this.qualityResult, toolsDiagnosisAdGetV2V2ResponseDataListInner.qualityResult) &&
        Objects.equals(this.recSuggestionContent, toolsDiagnosisAdGetV2V2ResponseDataListInner.recSuggestionContent) &&
        Objects.equals(this.recSuggestionMode, toolsDiagnosisAdGetV2V2ResponseDataListInner.recSuggestionMode) &&
        Objects.equals(this.recSuggestionReason, toolsDiagnosisAdGetV2V2ResponseDataListInner.recSuggestionReason) &&
        Objects.equals(this.sceneDesc, toolsDiagnosisAdGetV2V2ResponseDataListInner.sceneDesc) &&
        Objects.equals(this.sceneText, toolsDiagnosisAdGetV2V2ResponseDataListInner.sceneText) &&
        Objects.equals(this.show, toolsDiagnosisAdGetV2V2ResponseDataListInner.show) &&
        Objects.equals(this.similarRatioShow, toolsDiagnosisAdGetV2V2ResponseDataListInner.similarRatioShow) &&
        Objects.equals(this.summary, toolsDiagnosisAdGetV2V2ResponseDataListInner.summary) &&
        Objects.equals(this.targetResult, toolsDiagnosisAdGetV2V2ResponseDataListInner.targetResult);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adName, bid, bidResult, budget, budgetResult, costBias, ctrResult, cvrResult, diagnosisTime, differenceRatioShow, matureShow, potentialResult, qualityResult, recSuggestionContent, recSuggestionMode, recSuggestionReason, sceneDesc, sceneText, show, similarRatioShow, summary, targetResult);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsDiagnosisAdGetV2V2ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidResult: ").append(toIndentedString(bidResult)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetResult: ").append(toIndentedString(budgetResult)).append("\n");
    sb.append("    costBias: ").append(toIndentedString(costBias)).append("\n");
    sb.append("    ctrResult: ").append(toIndentedString(ctrResult)).append("\n");
    sb.append("    cvrResult: ").append(toIndentedString(cvrResult)).append("\n");
    sb.append("    diagnosisTime: ").append(toIndentedString(diagnosisTime)).append("\n");
    sb.append("    differenceRatioShow: ").append(toIndentedString(differenceRatioShow)).append("\n");
    sb.append("    matureShow: ").append(toIndentedString(matureShow)).append("\n");
    sb.append("    potentialResult: ").append(toIndentedString(potentialResult)).append("\n");
    sb.append("    qualityResult: ").append(toIndentedString(qualityResult)).append("\n");
    sb.append("    recSuggestionContent: ").append(toIndentedString(recSuggestionContent)).append("\n");
    sb.append("    recSuggestionMode: ").append(toIndentedString(recSuggestionMode)).append("\n");
    sb.append("    recSuggestionReason: ").append(toIndentedString(recSuggestionReason)).append("\n");
    sb.append("    sceneDesc: ").append(toIndentedString(sceneDesc)).append("\n");
    sb.append("    sceneText: ").append(toIndentedString(sceneText)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    similarRatioShow: ").append(toIndentedString(similarRatioShow)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    targetResult: ").append(toIndentedString(targetResult)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ad_id");
    openapiFields.add("ad_name");
    openapiFields.add("bid");
    openapiFields.add("bid_result");
    openapiFields.add("budget");
    openapiFields.add("budget_result");
    openapiFields.add("cost_bias");
    openapiFields.add("ctr_result");
    openapiFields.add("cvr_result");
    openapiFields.add("diagnosis_time");
    openapiFields.add("difference_ratio_show");
    openapiFields.add("mature_show");
    openapiFields.add("potential_result");
    openapiFields.add("quality_result");
    openapiFields.add("rec_suggestion_content");
    openapiFields.add("rec_suggestion_mode");
    openapiFields.add("rec_suggestion_reason");
    openapiFields.add("scene_desc");
    openapiFields.add("scene_text");
    openapiFields.add("show");
    openapiFields.add("similar_ratio_show");
    openapiFields.add("summary");
    openapiFields.add("target_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisAdGetV2V2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisAdGetV2V2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisAdGetV2V2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisAdGetV2V2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisAdGetV2V2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisAdGetV2V2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisAdGetV2V2ResponseDataListInner
  */
  public static ToolsDiagnosisAdGetV2V2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisAdGetV2V2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

