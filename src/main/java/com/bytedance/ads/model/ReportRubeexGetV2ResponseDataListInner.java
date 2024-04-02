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
import com.bytedance.ads.model.ReportRubeexGetV2ResponseDataListInnerDimensions;
import com.bytedance.ads.model.ReportRubeexGetV2ResponseDataListInnerMetrics;
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
 * ReportRubeexGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ReportRubeexGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private ReportRubeexGetV2ResponseDataListInnerDimensions dimensions = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private ReportRubeexGetV2ResponseDataListInnerMetrics metrics = null;

  public ReportRubeexGetV2ResponseDataListInner() {
  }

  public ReportRubeexGetV2ResponseDataListInner dimensions(ReportRubeexGetV2ResponseDataListInnerDimensions dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @javax.annotation.Nullable
  public ReportRubeexGetV2ResponseDataListInnerDimensions getDimensions() {
    return dimensions;
  }


  public void setDimensions(ReportRubeexGetV2ResponseDataListInnerDimensions dimensions) {
    this.dimensions = dimensions;
  }


  public ReportRubeexGetV2ResponseDataListInner metrics(ReportRubeexGetV2ResponseDataListInnerMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  public ReportRubeexGetV2ResponseDataListInnerMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(ReportRubeexGetV2ResponseDataListInnerMetrics metrics) {
    this.metrics = metrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRubeexGetV2ResponseDataListInner reportRubeexGetV2ResponseDataListInner = (ReportRubeexGetV2ResponseDataListInner) o;
    return Objects.equals(this.dimensions, reportRubeexGetV2ResponseDataListInner.dimensions) &&
        Objects.equals(this.metrics, reportRubeexGetV2ResponseDataListInner.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRubeexGetV2ResponseDataListInner {\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
    openapiFields.add("dimensions");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRubeexGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRubeexGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRubeexGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRubeexGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRubeexGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportRubeexGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRubeexGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRubeexGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRubeexGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportRubeexGetV2ResponseDataListInner
  */
  public static ReportRubeexGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRubeexGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportRubeexGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

