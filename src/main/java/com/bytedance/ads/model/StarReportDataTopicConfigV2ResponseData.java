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
import com.bytedance.ads.model.StarReportDataTopicConfigV2ResponseDataStatInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class StarReportDataTopicConfigV2ResponseData {
  public static final String SERIALIZED_NAME_STAT = "stat";
  @SerializedName(SERIALIZED_NAME_STAT)
  private List<StarReportDataTopicConfigV2ResponseDataStatInner> stat = null;

  public StarReportDataTopicConfigV2ResponseData() {
  }

  public StarReportDataTopicConfigV2ResponseData stat(List<StarReportDataTopicConfigV2ResponseDataStatInner> stat) {
    
    this.stat = stat;
    return this;
  }

  public StarReportDataTopicConfigV2ResponseData addStatItem(StarReportDataTopicConfigV2ResponseDataStatInner statItem) {
    if (this.stat == null) {
      this.stat = new ArrayList<>();
    }
    this.stat.add(statItem);
    return this;
  }

   /**
   * 对应请求的数据主题数组
   * @return stat
  **/
  @javax.annotation.Nullable
  public List<StarReportDataTopicConfigV2ResponseDataStatInner> getStat() {
    return stat;
  }


  public void setStat(List<StarReportDataTopicConfigV2ResponseDataStatInner> stat) {
    this.stat = stat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportDataTopicConfigV2ResponseData starReportDataTopicConfigV2ResponseData = (StarReportDataTopicConfigV2ResponseData) o;
    return Objects.equals(this.stat, starReportDataTopicConfigV2ResponseData.stat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stat);
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
    sb.append("class StarReportDataTopicConfigV2ResponseData {\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
    openapiFields.add("stat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportDataTopicConfigV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportDataTopicConfigV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportDataTopicConfigV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportDataTopicConfigV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportDataTopicConfigV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarReportDataTopicConfigV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportDataTopicConfigV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportDataTopicConfigV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportDataTopicConfigV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarReportDataTopicConfigV2ResponseData
  */
  public static StarReportDataTopicConfigV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportDataTopicConfigV2ResponseData.class);
  }

 /**
  * Convert an instance of StarReportDataTopicConfigV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

