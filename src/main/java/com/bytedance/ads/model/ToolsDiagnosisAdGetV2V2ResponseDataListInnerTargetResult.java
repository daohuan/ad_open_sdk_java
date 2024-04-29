/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult {
  public static final String SERIALIZED_NAME_AUD_NUM = "aud_num";
  @SerializedName(SERIALIZED_NAME_AUD_NUM)
  private Double audNum = null;

  public static final String SERIALIZED_NAME_MATCH_PASS_RATE = "match_pass_rate";
  @SerializedName(SERIALIZED_NAME_MATCH_PASS_RATE)
  private Double matchPassRate = null;

  public static final String SERIALIZED_NAME_OTHER_PASS_RATE = "other_pass_rate";
  @SerializedName(SERIALIZED_NAME_OTHER_PASS_RATE)
  private Double otherPassRate = null;

  public static final String SERIALIZED_NAME_PRECISION = "precision";
  @SerializedName(SERIALIZED_NAME_PRECISION)
  private Double precision = null;

  public static final String SERIALIZED_NAME_TARGETING_CONCLUSION_DETAIL = "targeting_conclusion_detail";
  @SerializedName(SERIALIZED_NAME_TARGETING_CONCLUSION_DETAIL)
  private String targetingConclusionDetail = null;

  public static final String SERIALIZED_NAME_TARGETING_CONCLUSION_TAG = "targeting_conclusion_tag";
  @SerializedName(SERIALIZED_NAME_TARGETING_CONCLUSION_TAG)
  private String targetingConclusionTag = null;

  public static final String SERIALIZED_NAME_TARGETING_SUGGESTION = "targeting_suggestion";
  @SerializedName(SERIALIZED_NAME_TARGETING_SUGGESTION)
  private List<String> targetingSuggestion = null;

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult() {
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult audNum(Double audNum) {
    
    this.audNum = audNum;
    return this;
  }

   /**
   * 
   * @return audNum
  **/
  @javax.annotation.Nullable
  public Double getAudNum() {
    return audNum;
  }


  public void setAudNum(Double audNum) {
    this.audNum = audNum;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult matchPassRate(Double matchPassRate) {
    
    this.matchPassRate = matchPassRate;
    return this;
  }

   /**
   * 
   * @return matchPassRate
  **/
  @javax.annotation.Nullable
  public Double getMatchPassRate() {
    return matchPassRate;
  }


  public void setMatchPassRate(Double matchPassRate) {
    this.matchPassRate = matchPassRate;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult otherPassRate(Double otherPassRate) {
    
    this.otherPassRate = otherPassRate;
    return this;
  }

   /**
   * 
   * @return otherPassRate
  **/
  @javax.annotation.Nullable
  public Double getOtherPassRate() {
    return otherPassRate;
  }


  public void setOtherPassRate(Double otherPassRate) {
    this.otherPassRate = otherPassRate;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult precision(Double precision) {
    
    this.precision = precision;
    return this;
  }

   /**
   * 
   * @return precision
  **/
  @javax.annotation.Nullable
  public Double getPrecision() {
    return precision;
  }


  public void setPrecision(Double precision) {
    this.precision = precision;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult targetingConclusionDetail(String targetingConclusionDetail) {
    
    this.targetingConclusionDetail = targetingConclusionDetail;
    return this;
  }

   /**
   * 
   * @return targetingConclusionDetail
  **/
  @javax.annotation.Nullable
  public String getTargetingConclusionDetail() {
    return targetingConclusionDetail;
  }


  public void setTargetingConclusionDetail(String targetingConclusionDetail) {
    this.targetingConclusionDetail = targetingConclusionDetail;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult targetingConclusionTag(String targetingConclusionTag) {
    
    this.targetingConclusionTag = targetingConclusionTag;
    return this;
  }

   /**
   * 
   * @return targetingConclusionTag
  **/
  @javax.annotation.Nullable
  public String getTargetingConclusionTag() {
    return targetingConclusionTag;
  }


  public void setTargetingConclusionTag(String targetingConclusionTag) {
    this.targetingConclusionTag = targetingConclusionTag;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult targetingSuggestion(List<String> targetingSuggestion) {
    
    this.targetingSuggestion = targetingSuggestion;
    return this;
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult addTargetingSuggestionItem(String targetingSuggestionItem) {
    if (this.targetingSuggestion == null) {
      this.targetingSuggestion = new ArrayList<>();
    }
    this.targetingSuggestion.add(targetingSuggestionItem);
    return this;
  }

   /**
   * 
   * @return targetingSuggestion
  **/
  @javax.annotation.Nullable
  public List<String> getTargetingSuggestion() {
    return targetingSuggestion;
  }


  public void setTargetingSuggestion(List<String> targetingSuggestion) {
    this.targetingSuggestion = targetingSuggestion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult toolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult = (ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult) o;
    return Objects.equals(this.audNum, toolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.audNum) &&
        Objects.equals(this.matchPassRate, toolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.matchPassRate) &&
        Objects.equals(this.otherPassRate, toolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.otherPassRate) &&
        Objects.equals(this.precision, toolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.precision) &&
        Objects.equals(this.targetingConclusionDetail, toolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.targetingConclusionDetail) &&
        Objects.equals(this.targetingConclusionTag, toolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.targetingConclusionTag) &&
        Objects.equals(this.targetingSuggestion, toolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.targetingSuggestion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audNum, matchPassRate, otherPassRate, precision, targetingConclusionDetail, targetingConclusionTag, targetingSuggestion);
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
    sb.append("class ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult {\n");
    sb.append("    audNum: ").append(toIndentedString(audNum)).append("\n");
    sb.append("    matchPassRate: ").append(toIndentedString(matchPassRate)).append("\n");
    sb.append("    otherPassRate: ").append(toIndentedString(otherPassRate)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    targetingConclusionDetail: ").append(toIndentedString(targetingConclusionDetail)).append("\n");
    sb.append("    targetingConclusionTag: ").append(toIndentedString(targetingConclusionTag)).append("\n");
    sb.append("    targetingSuggestion: ").append(toIndentedString(targetingSuggestion)).append("\n");
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
    openapiFields.add("aud_num");
    openapiFields.add("match_pass_rate");
    openapiFields.add("other_pass_rate");
    openapiFields.add("precision");
    openapiFields.add("targeting_conclusion_detail");
    openapiFields.add("targeting_conclusion_tag");
    openapiFields.add("targeting_suggestion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult
  */
  public static ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerTargetResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

