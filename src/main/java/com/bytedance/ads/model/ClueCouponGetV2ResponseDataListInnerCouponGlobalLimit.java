/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit {
  public static final String SERIALIZED_NAME_DAY_LIMIT = "day_limit";
  @SerializedName(SERIALIZED_NAME_DAY_LIMIT)
  private Long dayLimit = null;

  public static final String SERIALIZED_NAME_TOTAL_LIMIT = "total_limit";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIMIT)
  private Long totalLimit = null;

  public ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit() {
  }

  public ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit dayLimit(Long dayLimit) {
    
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


  public ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit totalLimit(Long totalLimit) {
    
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
    ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit clueCouponGetV2ResponseDataListInnerCouponGlobalLimit = (ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit) o;
    return Objects.equals(this.dayLimit, clueCouponGetV2ResponseDataListInnerCouponGlobalLimit.dayLimit) &&
        Objects.equals(this.totalLimit, clueCouponGetV2ResponseDataListInnerCouponGlobalLimit.totalLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayLimit, totalLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit {\n");
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
       if (!ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit>() {
           @Override
           public void write(JsonWriter out, ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit
  * @throws IOException if the JSON string is invalid with respect to ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit
  */
  public static ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit.class);
  }

 /**
  * Convert an instance of ClueCouponGetV2ResponseDataListInnerCouponGlobalLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

