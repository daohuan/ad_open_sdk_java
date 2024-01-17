/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ClueCouponGetV2ResponseDataListInnerCouponUserLimit {
  public static final String SERIALIZED_NAME_DAY_LIMIT = "day_limit";
  @SerializedName(SERIALIZED_NAME_DAY_LIMIT)
  private Long dayLimit = null;

  public static final String SERIALIZED_NAME_TOTAL_LIMIT = "total_limit";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIMIT)
  private Long totalLimit = null;

  public ClueCouponGetV2ResponseDataListInnerCouponUserLimit() {
  }

  public ClueCouponGetV2ResponseDataListInnerCouponUserLimit dayLimit(Long dayLimit) {
    
    this.dayLimit = dayLimit;
    return this;
  }

   /**
   * 
   * @return dayLimit
  **/
  @javax.annotation.Nullable
  public Long getDayLimit() {
    return dayLimit;
  }


  public void setDayLimit(Long dayLimit) {
    this.dayLimit = dayLimit;
  }


  public ClueCouponGetV2ResponseDataListInnerCouponUserLimit totalLimit(Long totalLimit) {
    
    this.totalLimit = totalLimit;
    return this;
  }

   /**
   * 
   * @return totalLimit
  **/
  @javax.annotation.Nullable
  public Long getTotalLimit() {
    return totalLimit;
  }


  public void setTotalLimit(Long totalLimit) {
    this.totalLimit = totalLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponGetV2ResponseDataListInnerCouponUserLimit clueCouponGetV2ResponseDataListInnerCouponUserLimit = (ClueCouponGetV2ResponseDataListInnerCouponUserLimit) o;
    return Objects.equals(this.dayLimit, clueCouponGetV2ResponseDataListInnerCouponUserLimit.dayLimit) &&
        Objects.equals(this.totalLimit, clueCouponGetV2ResponseDataListInnerCouponUserLimit.totalLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayLimit, totalLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponGetV2ResponseDataListInnerCouponUserLimit {\n");
    sb.append("    dayLimit: ").append(toIndentedString(dayLimit)).append("\n");
    sb.append("    totalLimit: ").append(toIndentedString(totalLimit)).append("\n");
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
    openapiFields.add("day_limit");
    openapiFields.add("total_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponGetV2ResponseDataListInnerCouponUserLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponGetV2ResponseDataListInnerCouponUserLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponGetV2ResponseDataListInnerCouponUserLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponGetV2ResponseDataListInnerCouponUserLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponGetV2ResponseDataListInnerCouponUserLimit>() {
           @Override
           public void write(JsonWriter out, ClueCouponGetV2ResponseDataListInnerCouponUserLimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponGetV2ResponseDataListInnerCouponUserLimit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponGetV2ResponseDataListInnerCouponUserLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponGetV2ResponseDataListInnerCouponUserLimit
  * @throws IOException if the JSON string is invalid with respect to ClueCouponGetV2ResponseDataListInnerCouponUserLimit
  */
  public static ClueCouponGetV2ResponseDataListInnerCouponUserLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponGetV2ResponseDataListInnerCouponUserLimit.class);
  }

 /**
  * Convert an instance of ClueCouponGetV2ResponseDataListInnerCouponUserLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
