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
import com.bytedance.ads.model.ReportCustomConfigGetV30DataListDataTopic;
import com.bytedance.ads.model.ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner;
import com.bytedance.ads.model.ReportCustomConfigGetV30ResponseDataListInnerMetricsInner;
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
 * ReportCustomConfigGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class ReportCustomConfigGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_DATA_TOPIC = "data_topic";
  @SerializedName(SERIALIZED_NAME_DATA_TOPIC)
  private ReportCustomConfigGetV30DataListDataTopic dataTopic = null;

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner> dimensions = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<ReportCustomConfigGetV30ResponseDataListInnerMetricsInner> metrics = null;

  public ReportCustomConfigGetV30ResponseDataListInner() {
  }

  public ReportCustomConfigGetV30ResponseDataListInner dataTopic(ReportCustomConfigGetV30DataListDataTopic dataTopic) {
    
    this.dataTopic = dataTopic;
    return this;
  }

   /**
   * Get dataTopic
   * @return dataTopic
  **/
  @javax.annotation.Nullable
  public ReportCustomConfigGetV30DataListDataTopic getDataTopic() {
    return dataTopic;
  }


  public void setDataTopic(ReportCustomConfigGetV30DataListDataTopic dataTopic) {
    this.dataTopic = dataTopic;
  }


  public ReportCustomConfigGetV30ResponseDataListInner dimensions(List<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public ReportCustomConfigGetV30ResponseDataListInner addDimensionsItem(ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * 
   * @return dimensions
  **/
  @javax.annotation.Nullable
  public List<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner> dimensions) {
    this.dimensions = dimensions;
  }


  public ReportCustomConfigGetV30ResponseDataListInner metrics(List<ReportCustomConfigGetV30ResponseDataListInnerMetricsInner> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public ReportCustomConfigGetV30ResponseDataListInner addMetricsItem(ReportCustomConfigGetV30ResponseDataListInnerMetricsInner metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * 
   * @return metrics
  **/
  @javax.annotation.Nullable
  public List<ReportCustomConfigGetV30ResponseDataListInnerMetricsInner> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<ReportCustomConfigGetV30ResponseDataListInnerMetricsInner> metrics) {
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
    ReportCustomConfigGetV30ResponseDataListInner reportCustomConfigGetV30ResponseDataListInner = (ReportCustomConfigGetV30ResponseDataListInner) o;
    return Objects.equals(this.dataTopic, reportCustomConfigGetV30ResponseDataListInner.dataTopic) &&
        Objects.equals(this.dimensions, reportCustomConfigGetV30ResponseDataListInner.dimensions) &&
        Objects.equals(this.metrics, reportCustomConfigGetV30ResponseDataListInner.metrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTopic, dimensions, metrics);
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
    sb.append("class ReportCustomConfigGetV30ResponseDataListInner {\n");
    sb.append("    dataTopic: ").append(toIndentedString(dataTopic)).append("\n");
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
    openapiFields.add("data_topic");
    openapiFields.add("dimensions");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomConfigGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomConfigGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomConfigGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomConfigGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomConfigGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportCustomConfigGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomConfigGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomConfigGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomConfigGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportCustomConfigGetV30ResponseDataListInner
  */
  public static ReportCustomConfigGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomConfigGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportCustomConfigGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

