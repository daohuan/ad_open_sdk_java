/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner;
import com.bytedance.ads.model.ToolsClueRefundViewGetV2ResponseDataShowTimeDetails;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ToolsClueRefundViewGetV2ResponseData {
  public static final String SERIALIZED_NAME_FULL_REFUND_TERMS = "full_refund_terms";
  @SerializedName(SERIALIZED_NAME_FULL_REFUND_TERMS)
  private List<String> fullRefundTerms = null;

  public static final String SERIALIZED_NAME_GLOBAL_REFUND_RESULT = "global_refund_result";
  @SerializedName(SERIALIZED_NAME_GLOBAL_REFUND_RESULT)
  private Long globalRefundResult = null;

  public static final String SERIALIZED_NAME_GLOBAL_REFUND_RESULT_REASON = "global_refund_result_reason";
  @SerializedName(SERIALIZED_NAME_GLOBAL_REFUND_RESULT_REASON)
  private List<String> globalRefundResultReason = null;

  public static final String SERIALIZED_NAME_GLOBAL_REFUND_RESULT_TEXT = "global_refund_result_text";
  @SerializedName(SERIALIZED_NAME_GLOBAL_REFUND_RESULT_TEXT)
  private String globalRefundResultText = null;

  public static final String SERIALIZED_NAME_SHOW_OUTER_STAGES = "show_outer_stages";
  @SerializedName(SERIALIZED_NAME_SHOW_OUTER_STAGES)
  private List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner> showOuterStages = null;

  public static final String SERIALIZED_NAME_SHOW_REFUND_VIEW = "show_refund_view";
  @SerializedName(SERIALIZED_NAME_SHOW_REFUND_VIEW)
  private Boolean showRefundView = null;

  public static final String SERIALIZED_NAME_SHOW_TIME_DETAILS = "show_time_details";
  @SerializedName(SERIALIZED_NAME_SHOW_TIME_DETAILS)
  private ToolsClueRefundViewGetV2ResponseDataShowTimeDetails showTimeDetails = null;

  public ToolsClueRefundViewGetV2ResponseData() {
  }

  public ToolsClueRefundViewGetV2ResponseData fullRefundTerms(List<String> fullRefundTerms) {
    
    this.fullRefundTerms = fullRefundTerms;
    return this;
  }

  public ToolsClueRefundViewGetV2ResponseData addFullRefundTermsItem(String fullRefundTermsItem) {
    if (this.fullRefundTerms == null) {
      this.fullRefundTerms = new ArrayList<>();
    }
    this.fullRefundTerms.add(fullRefundTermsItem);
    return this;
  }

   /**
   * 完整的反馈要求说明
   * @return fullRefundTerms
  **/
  @javax.annotation.Nullable
  public List<String> getFullRefundTerms() {
    return fullRefundTerms;
  }


  public void setFullRefundTerms(List<String> fullRefundTerms) {
    this.fullRefundTerms = fullRefundTerms;
  }


  public ToolsClueRefundViewGetV2ResponseData globalRefundResult(Long globalRefundResult) {
    
    this.globalRefundResult = globalRefundResult;
    return this;
  }

   /**
   * 赔付结果&lt;br&gt;0:\&quot;赔付状态待确认\&quot;&lt;br&gt;1:\&quot;不可赔付\&quot;&lt;br&gt;2:“可赔付” 
   * @return globalRefundResult
  **/
  @javax.annotation.Nullable
  public Long getGlobalRefundResult() {
    return globalRefundResult;
  }


  public void setGlobalRefundResult(Long globalRefundResult) {
    this.globalRefundResult = globalRefundResult;
  }


  public ToolsClueRefundViewGetV2ResponseData globalRefundResultReason(List<String> globalRefundResultReason) {
    
    this.globalRefundResultReason = globalRefundResultReason;
    return this;
  }

  public ToolsClueRefundViewGetV2ResponseData addGlobalRefundResultReasonItem(String globalRefundResultReasonItem) {
    if (this.globalRefundResultReason == null) {
      this.globalRefundResultReason = new ArrayList<>();
    }
    this.globalRefundResultReason.add(globalRefundResultReasonItem);
    return this;
  }

   /**
   * 原因：&lt;br&gt;[ &lt;br&gt;\&quot;线索落入 24小时 内存在「已接通」电话，不满足无效线索条件，不支持赔付。\&quot;&lt;br&gt;],&lt;br&gt;// \&quot;24小时内 没打够次数，不支持赔付。\&quot; 等
   * @return globalRefundResultReason
  **/
  @javax.annotation.Nullable
  public List<String> getGlobalRefundResultReason() {
    return globalRefundResultReason;
  }


  public void setGlobalRefundResultReason(List<String> globalRefundResultReason) {
    this.globalRefundResultReason = globalRefundResultReason;
  }


  public ToolsClueRefundViewGetV2ResponseData globalRefundResultText(String globalRefundResultText) {
    
    this.globalRefundResultText = globalRefundResultText;
    return this;
  }

   /**
   * 赔付状态描述：\&quot;赔付状态待确认\&quot;，\&quot;不可赔付\&quot;，\&quot;可赔付\&quot;
   * @return globalRefundResultText
  **/
  @javax.annotation.Nullable
  public String getGlobalRefundResultText() {
    return globalRefundResultText;
  }


  public void setGlobalRefundResultText(String globalRefundResultText) {
    this.globalRefundResultText = globalRefundResultText;
  }


  public ToolsClueRefundViewGetV2ResponseData showOuterStages(List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner> showOuterStages) {
    
    this.showOuterStages = showOuterStages;
    return this;
  }

  public ToolsClueRefundViewGetV2ResponseData addShowOuterStagesItem(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner showOuterStagesItem) {
    if (this.showOuterStages == null) {
      this.showOuterStages = new ArrayList<>();
    }
    this.showOuterStages.add(showOuterStagesItem);
    return this;
  }

   /**
   * 对应返款视图上表现的大阶段，如下
   * @return showOuterStages
  **/
  @javax.annotation.Nullable
  public List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner> getShowOuterStages() {
    return showOuterStages;
  }


  public void setShowOuterStages(List<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInner> showOuterStages) {
    this.showOuterStages = showOuterStages;
  }


  public ToolsClueRefundViewGetV2ResponseData showRefundView(Boolean showRefundView) {
    
    this.showRefundView = showRefundView;
    return this;
  }

   /**
   * 是否展示返款视图
   * @return showRefundView
  **/
  @javax.annotation.Nullable
  public Boolean getShowRefundView() {
    return showRefundView;
  }


  public void setShowRefundView(Boolean showRefundView) {
    this.showRefundView = showRefundView;
  }


  public ToolsClueRefundViewGetV2ResponseData showTimeDetails(ToolsClueRefundViewGetV2ResponseDataShowTimeDetails showTimeDetails) {
    
    this.showTimeDetails = showTimeDetails;
    return this;
  }

   /**
   * Get showTimeDetails
   * @return showTimeDetails
  **/
  @javax.annotation.Nullable
  public ToolsClueRefundViewGetV2ResponseDataShowTimeDetails getShowTimeDetails() {
    return showTimeDetails;
  }


  public void setShowTimeDetails(ToolsClueRefundViewGetV2ResponseDataShowTimeDetails showTimeDetails) {
    this.showTimeDetails = showTimeDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRefundViewGetV2ResponseData toolsClueRefundViewGetV2ResponseData = (ToolsClueRefundViewGetV2ResponseData) o;
    return Objects.equals(this.fullRefundTerms, toolsClueRefundViewGetV2ResponseData.fullRefundTerms) &&
        Objects.equals(this.globalRefundResult, toolsClueRefundViewGetV2ResponseData.globalRefundResult) &&
        Objects.equals(this.globalRefundResultReason, toolsClueRefundViewGetV2ResponseData.globalRefundResultReason) &&
        Objects.equals(this.globalRefundResultText, toolsClueRefundViewGetV2ResponseData.globalRefundResultText) &&
        Objects.equals(this.showOuterStages, toolsClueRefundViewGetV2ResponseData.showOuterStages) &&
        Objects.equals(this.showRefundView, toolsClueRefundViewGetV2ResponseData.showRefundView) &&
        Objects.equals(this.showTimeDetails, toolsClueRefundViewGetV2ResponseData.showTimeDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullRefundTerms, globalRefundResult, globalRefundResultReason, globalRefundResultText, showOuterStages, showRefundView, showTimeDetails);
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
    sb.append("class ToolsClueRefundViewGetV2ResponseData {\n");
    sb.append("    fullRefundTerms: ").append(toIndentedString(fullRefundTerms)).append("\n");
    sb.append("    globalRefundResult: ").append(toIndentedString(globalRefundResult)).append("\n");
    sb.append("    globalRefundResultReason: ").append(toIndentedString(globalRefundResultReason)).append("\n");
    sb.append("    globalRefundResultText: ").append(toIndentedString(globalRefundResultText)).append("\n");
    sb.append("    showOuterStages: ").append(toIndentedString(showOuterStages)).append("\n");
    sb.append("    showRefundView: ").append(toIndentedString(showRefundView)).append("\n");
    sb.append("    showTimeDetails: ").append(toIndentedString(showTimeDetails)).append("\n");
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
    openapiFields.add("full_refund_terms");
    openapiFields.add("global_refund_result");
    openapiFields.add("global_refund_result_reason");
    openapiFields.add("global_refund_result_text");
    openapiFields.add("show_outer_stages");
    openapiFields.add("show_refund_view");
    openapiFields.add("show_time_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundViewGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundViewGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundViewGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundViewGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundViewGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundViewGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundViewGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundViewGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundViewGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundViewGetV2ResponseData
  */
  public static ToolsClueRefundViewGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundViewGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsClueRefundViewGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

