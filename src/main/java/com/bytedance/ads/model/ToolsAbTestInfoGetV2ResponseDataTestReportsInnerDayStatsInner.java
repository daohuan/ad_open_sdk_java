/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetrics;
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
 * ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetrics metrics = null;

  public static final String SERIALIZED_NAME_OBJECT_ID = "object_id";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private Long objectId = null;

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner() {
  }

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 数据统计日期
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner metrics(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetrics metrics) {
    this.metrics = metrics;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner objectId(Long objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * 实验对象ID
   * @return objectId
  **/
  @javax.annotation.Nullable
  public Long getObjectId() {
    return objectId;
  }


  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner toolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner = (ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner) o;
    return Objects.equals(this.date, toolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner.date) &&
        Objects.equals(this.metrics, toolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner.metrics) &&
        Objects.equals(this.objectId, toolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner.objectId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, metrics, objectId);
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
    sb.append("class ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("metrics");
    openapiFields.add("object_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner
  */
  public static ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner.class);
  }

 /**
  * Convert an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

