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
public class ToolsNoBidSuggestBidV2ResponseData {
  public static final String SERIALIZED_NAME_ESTIMATED_CONVERT_NUM_MAX = "estimated_convert_num_max";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_CONVERT_NUM_MAX)
  private Long estimatedConvertNumMax = null;

  public static final String SERIALIZED_NAME_ESTIMATED_CONVERT_NUM_MIN = "estimated_convert_num_min";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_CONVERT_NUM_MIN)
  private Long estimatedConvertNumMin = null;

  public static final String SERIALIZED_NAME_SUGGEST_BID_MAX = "suggest_bid_max";
  @SerializedName(SERIALIZED_NAME_SUGGEST_BID_MAX)
  private Double suggestBidMax = null;

  public static final String SERIALIZED_NAME_SUGGEST_BID_MIN = "suggest_bid_min";
  @SerializedName(SERIALIZED_NAME_SUGGEST_BID_MIN)
  private Double suggestBidMin = null;

  public ToolsNoBidSuggestBidV2ResponseData() {
  }

  public ToolsNoBidSuggestBidV2ResponseData estimatedConvertNumMax(Long estimatedConvertNumMax) {
    
    this.estimatedConvertNumMax = estimatedConvertNumMax;
    return this;
  }

   /**
   * 
   * @return estimatedConvertNumMax
  **/
  @javax.annotation.Nullable
  public Long getEstimatedConvertNumMax() {
    return estimatedConvertNumMax;
  }


  public void setEstimatedConvertNumMax(Long estimatedConvertNumMax) {
    this.estimatedConvertNumMax = estimatedConvertNumMax;
  }


  public ToolsNoBidSuggestBidV2ResponseData estimatedConvertNumMin(Long estimatedConvertNumMin) {
    
    this.estimatedConvertNumMin = estimatedConvertNumMin;
    return this;
  }

   /**
   * 
   * @return estimatedConvertNumMin
  **/
  @javax.annotation.Nullable
  public Long getEstimatedConvertNumMin() {
    return estimatedConvertNumMin;
  }


  public void setEstimatedConvertNumMin(Long estimatedConvertNumMin) {
    this.estimatedConvertNumMin = estimatedConvertNumMin;
  }


  public ToolsNoBidSuggestBidV2ResponseData suggestBidMax(Double suggestBidMax) {
    
    this.suggestBidMax = suggestBidMax;
    return this;
  }

   /**
   * 
   * @return suggestBidMax
  **/
  @javax.annotation.Nullable
  public Double getSuggestBidMax() {
    return suggestBidMax;
  }


  public void setSuggestBidMax(Double suggestBidMax) {
    this.suggestBidMax = suggestBidMax;
  }


  public ToolsNoBidSuggestBidV2ResponseData suggestBidMin(Double suggestBidMin) {
    
    this.suggestBidMin = suggestBidMin;
    return this;
  }

   /**
   * 
   * @return suggestBidMin
  **/
  @javax.annotation.Nullable
  public Double getSuggestBidMin() {
    return suggestBidMin;
  }


  public void setSuggestBidMin(Double suggestBidMin) {
    this.suggestBidMin = suggestBidMin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsNoBidSuggestBidV2ResponseData toolsNoBidSuggestBidV2ResponseData = (ToolsNoBidSuggestBidV2ResponseData) o;
    return Objects.equals(this.estimatedConvertNumMax, toolsNoBidSuggestBidV2ResponseData.estimatedConvertNumMax) &&
        Objects.equals(this.estimatedConvertNumMin, toolsNoBidSuggestBidV2ResponseData.estimatedConvertNumMin) &&
        Objects.equals(this.suggestBidMax, toolsNoBidSuggestBidV2ResponseData.suggestBidMax) &&
        Objects.equals(this.suggestBidMin, toolsNoBidSuggestBidV2ResponseData.suggestBidMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedConvertNumMax, estimatedConvertNumMin, suggestBidMax, suggestBidMin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsNoBidSuggestBidV2ResponseData {\n");
    sb.append("    estimatedConvertNumMax: ").append(toIndentedString(estimatedConvertNumMax)).append("\n");
    sb.append("    estimatedConvertNumMin: ").append(toIndentedString(estimatedConvertNumMin)).append("\n");
    sb.append("    suggestBidMax: ").append(toIndentedString(suggestBidMax)).append("\n");
    sb.append("    suggestBidMin: ").append(toIndentedString(suggestBidMin)).append("\n");
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
    openapiFields.add("estimated_convert_num_max");
    openapiFields.add("estimated_convert_num_min");
    openapiFields.add("suggest_bid_max");
    openapiFields.add("suggest_bid_min");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsNoBidSuggestBidV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsNoBidSuggestBidV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsNoBidSuggestBidV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsNoBidSuggestBidV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsNoBidSuggestBidV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsNoBidSuggestBidV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsNoBidSuggestBidV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsNoBidSuggestBidV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsNoBidSuggestBidV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsNoBidSuggestBidV2ResponseData
  */
  public static ToolsNoBidSuggestBidV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsNoBidSuggestBidV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsNoBidSuggestBidV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

