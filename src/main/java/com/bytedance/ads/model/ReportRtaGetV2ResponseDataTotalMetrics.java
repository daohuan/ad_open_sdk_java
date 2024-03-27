/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ReportRtaGetV2ResponseDataTotalMetrics {
  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private Long clickCnt = null;

  public static final String SERIALIZED_NAME_CONVERT_CNT = "convert_cnt";
  @SerializedName(SERIALIZED_NAME_CONVERT_CNT)
  private Long convertCnt = null;

  public static final String SERIALIZED_NAME_SHOW_CNT = "show_cnt";
  @SerializedName(SERIALIZED_NAME_SHOW_CNT)
  private Long showCnt = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public ReportRtaGetV2ResponseDataTotalMetrics() {
  }

  public ReportRtaGetV2ResponseDataTotalMetrics clickCnt(Long clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * 
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  public Long getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(Long clickCnt) {
    this.clickCnt = clickCnt;
  }


  public ReportRtaGetV2ResponseDataTotalMetrics convertCnt(Long convertCnt) {
    
    this.convertCnt = convertCnt;
    return this;
  }

   /**
   * 
   * @return convertCnt
  **/
  @javax.annotation.Nullable
  public Long getConvertCnt() {
    return convertCnt;
  }


  public void setConvertCnt(Long convertCnt) {
    this.convertCnt = convertCnt;
  }


  public ReportRtaGetV2ResponseDataTotalMetrics showCnt(Long showCnt) {
    
    this.showCnt = showCnt;
    return this;
  }

   /**
   * 
   * @return showCnt
  **/
  @javax.annotation.Nullable
  public Long getShowCnt() {
    return showCnt;
  }


  public void setShowCnt(Long showCnt) {
    this.showCnt = showCnt;
  }


  public ReportRtaGetV2ResponseDataTotalMetrics statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRtaGetV2ResponseDataTotalMetrics reportRtaGetV2ResponseDataTotalMetrics = (ReportRtaGetV2ResponseDataTotalMetrics) o;
    return Objects.equals(this.clickCnt, reportRtaGetV2ResponseDataTotalMetrics.clickCnt) &&
        Objects.equals(this.convertCnt, reportRtaGetV2ResponseDataTotalMetrics.convertCnt) &&
        Objects.equals(this.showCnt, reportRtaGetV2ResponseDataTotalMetrics.showCnt) &&
        Objects.equals(this.statCost, reportRtaGetV2ResponseDataTotalMetrics.statCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickCnt, convertCnt, showCnt, statCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRtaGetV2ResponseDataTotalMetrics {\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    convertCnt: ").append(toIndentedString(convertCnt)).append("\n");
    sb.append("    showCnt: ").append(toIndentedString(showCnt)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
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
    openapiFields.add("click_cnt");
    openapiFields.add("convert_cnt");
    openapiFields.add("show_cnt");
    openapiFields.add("stat_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRtaGetV2ResponseDataTotalMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRtaGetV2ResponseDataTotalMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRtaGetV2ResponseDataTotalMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRtaGetV2ResponseDataTotalMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRtaGetV2ResponseDataTotalMetrics>() {
           @Override
           public void write(JsonWriter out, ReportRtaGetV2ResponseDataTotalMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRtaGetV2ResponseDataTotalMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRtaGetV2ResponseDataTotalMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRtaGetV2ResponseDataTotalMetrics
  * @throws IOException if the JSON string is invalid with respect to ReportRtaGetV2ResponseDataTotalMetrics
  */
  public static ReportRtaGetV2ResponseDataTotalMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRtaGetV2ResponseDataTotalMetrics.class);
  }

 /**
  * Convert an instance of ReportRtaGetV2ResponseDataTotalMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

