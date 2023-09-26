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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * CreativeAdMetricsV2ResponseDataStatsValue
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class CreativeAdMetricsV2ResponseDataStatsValue {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_DERIVED_COST = "derived_cost";
  @SerializedName(SERIALIZED_NAME_DERIVED_COST)
  private Double derivedCost = null;

  public static final String SERIALIZED_NAME_DERIVED_PERCENT = "derived_percent";
  @SerializedName(SERIALIZED_NAME_DERIVED_PERCENT)
  private Double derivedPercent = null;

  public static final String SERIALIZED_NAME_TOTAL_COST = "total_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_COST)
  private Double totalCost = null;

  public CreativeAdMetricsV2ResponseDataStatsValue() {
  }

  public CreativeAdMetricsV2ResponseDataStatsValue adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 广告计划 ID
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public CreativeAdMetricsV2ResponseDataStatsValue derivedCost(Double derivedCost) {
    
    this.derivedCost = derivedCost;
    return this;
  }

   /**
   * 派生消耗（单位：元）
   * @return derivedCost
  **/
  @javax.annotation.Nullable
  public Double getDerivedCost() {
    return derivedCost;
  }


  public void setDerivedCost(Double derivedCost) {
    this.derivedCost = derivedCost;
  }


  public CreativeAdMetricsV2ResponseDataStatsValue derivedPercent(Double derivedPercent) {
    
    this.derivedPercent = derivedPercent;
    return this;
  }

   /**
   * 派生消耗占比
   * @return derivedPercent
  **/
  @javax.annotation.Nullable
  public Double getDerivedPercent() {
    return derivedPercent;
  }


  public void setDerivedPercent(Double derivedPercent) {
    this.derivedPercent = derivedPercent;
  }


  public CreativeAdMetricsV2ResponseDataStatsValue totalCost(Double totalCost) {
    
    this.totalCost = totalCost;
    return this;
  }

   /**
   * 总计消耗（单位：元）
   * @return totalCost
  **/
  @javax.annotation.Nullable
  public Double getTotalCost() {
    return totalCost;
  }


  public void setTotalCost(Double totalCost) {
    this.totalCost = totalCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAdMetricsV2ResponseDataStatsValue creativeAdMetricsV2ResponseDataStatsValue = (CreativeAdMetricsV2ResponseDataStatsValue) o;
    return Objects.equals(this.adId, creativeAdMetricsV2ResponseDataStatsValue.adId) &&
        Objects.equals(this.derivedCost, creativeAdMetricsV2ResponseDataStatsValue.derivedCost) &&
        Objects.equals(this.derivedPercent, creativeAdMetricsV2ResponseDataStatsValue.derivedPercent) &&
        Objects.equals(this.totalCost, creativeAdMetricsV2ResponseDataStatsValue.totalCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, derivedCost, derivedPercent, totalCost);
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
    sb.append("class CreativeAdMetricsV2ResponseDataStatsValue {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    derivedCost: ").append(toIndentedString(derivedCost)).append("\n");
    sb.append("    derivedPercent: ").append(toIndentedString(derivedPercent)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
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
    openapiFields.add("derived_cost");
    openapiFields.add("derived_percent");
    openapiFields.add("total_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeAdMetricsV2ResponseDataStatsValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeAdMetricsV2ResponseDataStatsValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeAdMetricsV2ResponseDataStatsValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeAdMetricsV2ResponseDataStatsValue.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeAdMetricsV2ResponseDataStatsValue>() {
           @Override
           public void write(JsonWriter out, CreativeAdMetricsV2ResponseDataStatsValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeAdMetricsV2ResponseDataStatsValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeAdMetricsV2ResponseDataStatsValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeAdMetricsV2ResponseDataStatsValue
  * @throws IOException if the JSON string is invalid with respect to CreativeAdMetricsV2ResponseDataStatsValue
  */
  public static CreativeAdMetricsV2ResponseDataStatsValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeAdMetricsV2ResponseDataStatsValue.class);
  }

 /**
  * Convert an instance of CreativeAdMetricsV2ResponseDataStatsValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

