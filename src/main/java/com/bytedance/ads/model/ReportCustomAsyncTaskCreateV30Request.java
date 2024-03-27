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
import com.bytedance.ads.model.ReportCustomAsyncTaskCreateV30DataTopic;
import com.bytedance.ads.model.ReportCustomAsyncTaskCreateV30RequestFiltersInner;
import com.bytedance.ads.model.ReportCustomAsyncTaskCreateV30RequestOrderByInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ReportCustomAsyncTaskCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ReportCustomAsyncTaskCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DATA_TOPIC = "data_topic";
  @SerializedName(SERIALIZED_NAME_DATA_TOPIC)
  private ReportCustomAsyncTaskCreateV30DataTopic dataTopic = null;

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<String> dimensions = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<ReportCustomAsyncTaskCreateV30RequestFiltersInner> filters = null;

  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<String> metrics = null;

  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<ReportCustomAsyncTaskCreateV30RequestOrderByInner> orderBy = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName = null;

  public ReportCustomAsyncTaskCreateV30Request() {
  }

  public ReportCustomAsyncTaskCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ReportCustomAsyncTaskCreateV30Request dataTopic(ReportCustomAsyncTaskCreateV30DataTopic dataTopic) {
    
    this.dataTopic = dataTopic;
    return this;
  }

   /**
   * Get dataTopic
   * @return dataTopic
  **/
  @javax.annotation.Nonnull
  public ReportCustomAsyncTaskCreateV30DataTopic getDataTopic() {
    return dataTopic;
  }


  public void setDataTopic(ReportCustomAsyncTaskCreateV30DataTopic dataTopic) {
    this.dataTopic = dataTopic;
  }


  public ReportCustomAsyncTaskCreateV30Request dimensions(List<String> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public ReportCustomAsyncTaskCreateV30Request addDimensionsItem(String dimensionsItem) {
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
  @javax.annotation.Nonnull
  public List<String> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<String> dimensions) {
    this.dimensions = dimensions;
  }


  public ReportCustomAsyncTaskCreateV30Request endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nonnull
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ReportCustomAsyncTaskCreateV30Request filters(List<ReportCustomAsyncTaskCreateV30RequestFiltersInner> filters) {
    
    this.filters = filters;
    return this;
  }

  public ReportCustomAsyncTaskCreateV30Request addFiltersItem(ReportCustomAsyncTaskCreateV30RequestFiltersInner filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * 
   * @return filters
  **/
  @javax.annotation.Nonnull
  public List<ReportCustomAsyncTaskCreateV30RequestFiltersInner> getFilters() {
    return filters;
  }


  public void setFilters(List<ReportCustomAsyncTaskCreateV30RequestFiltersInner> filters) {
    this.filters = filters;
  }


  public ReportCustomAsyncTaskCreateV30Request force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * 
   * @return force
  **/
  @javax.annotation.Nullable
  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }


  public ReportCustomAsyncTaskCreateV30Request metrics(List<String> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public ReportCustomAsyncTaskCreateV30Request addMetricsItem(String metricsItem) {
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
  @javax.annotation.Nonnull
  public List<String> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }


  public ReportCustomAsyncTaskCreateV30Request orderBy(List<ReportCustomAsyncTaskCreateV30RequestOrderByInner> orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

  public ReportCustomAsyncTaskCreateV30Request addOrderByItem(ReportCustomAsyncTaskCreateV30RequestOrderByInner orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

   /**
   * 
   * @return orderBy
  **/
  @javax.annotation.Nonnull
  public List<ReportCustomAsyncTaskCreateV30RequestOrderByInner> getOrderBy() {
    return orderBy;
  }


  public void setOrderBy(List<ReportCustomAsyncTaskCreateV30RequestOrderByInner> orderBy) {
    this.orderBy = orderBy;
  }


  public ReportCustomAsyncTaskCreateV30Request startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nonnull
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ReportCustomAsyncTaskCreateV30Request taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * 
   * @return taskName
  **/
  @javax.annotation.Nonnull
  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCustomAsyncTaskCreateV30Request reportCustomAsyncTaskCreateV30Request = (ReportCustomAsyncTaskCreateV30Request) o;
    return Objects.equals(this.advertiserId, reportCustomAsyncTaskCreateV30Request.advertiserId) &&
        Objects.equals(this.dataTopic, reportCustomAsyncTaskCreateV30Request.dataTopic) &&
        Objects.equals(this.dimensions, reportCustomAsyncTaskCreateV30Request.dimensions) &&
        Objects.equals(this.endTime, reportCustomAsyncTaskCreateV30Request.endTime) &&
        Objects.equals(this.filters, reportCustomAsyncTaskCreateV30Request.filters) &&
        Objects.equals(this.force, reportCustomAsyncTaskCreateV30Request.force) &&
        Objects.equals(this.metrics, reportCustomAsyncTaskCreateV30Request.metrics) &&
        Objects.equals(this.orderBy, reportCustomAsyncTaskCreateV30Request.orderBy) &&
        Objects.equals(this.startTime, reportCustomAsyncTaskCreateV30Request.startTime) &&
        Objects.equals(this.taskName, reportCustomAsyncTaskCreateV30Request.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, dataTopic, dimensions, endTime, filters, force, metrics, orderBy, startTime, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCustomAsyncTaskCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    dataTopic: ").append(toIndentedString(dataTopic)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("data_topic");
    openapiFields.add("dimensions");
    openapiFields.add("end_time");
    openapiFields.add("filters");
    openapiFields.add("force");
    openapiFields.add("metrics");
    openapiFields.add("order_by");
    openapiFields.add("start_time");
    openapiFields.add("task_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("data_topic");
    openapiRequiredFields.add("dimensions");
    openapiRequiredFields.add("end_time");
    openapiRequiredFields.add("filters");
    openapiRequiredFields.add("metrics");
    openapiRequiredFields.add("order_by");
    openapiRequiredFields.add("start_time");
    openapiRequiredFields.add("task_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomAsyncTaskCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomAsyncTaskCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomAsyncTaskCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomAsyncTaskCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomAsyncTaskCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ReportCustomAsyncTaskCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomAsyncTaskCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomAsyncTaskCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomAsyncTaskCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ReportCustomAsyncTaskCreateV30Request
  */
  public static ReportCustomAsyncTaskCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomAsyncTaskCreateV30Request.class);
  }

 /**
  * Convert an instance of ReportCustomAsyncTaskCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

