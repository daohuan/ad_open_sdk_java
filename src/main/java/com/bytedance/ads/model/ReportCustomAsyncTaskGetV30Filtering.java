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
import com.bytedance.ads.model.ReportCustomAsyncTaskGetV30FilteringDataTopics;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class ReportCustomAsyncTaskGetV30Filtering {
  public static final String SERIALIZED_NAME_DATA_TOPICS = "data_topics";
  @SerializedName(SERIALIZED_NAME_DATA_TOPICS)
  private List<ReportCustomAsyncTaskGetV30FilteringDataTopics> dataTopics = null;

  public static final String SERIALIZED_NAME_TASK_IDS = "task_ids";
  @SerializedName(SERIALIZED_NAME_TASK_IDS)
  private List<Long> taskIds = null;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName = null;

  public ReportCustomAsyncTaskGetV30Filtering() {
  }

  public ReportCustomAsyncTaskGetV30Filtering dataTopics(List<ReportCustomAsyncTaskGetV30FilteringDataTopics> dataTopics) {
    
    this.dataTopics = dataTopics;
    return this;
  }

  public ReportCustomAsyncTaskGetV30Filtering addDataTopicsItem(ReportCustomAsyncTaskGetV30FilteringDataTopics dataTopicsItem) {
    if (this.dataTopics == null) {
      this.dataTopics = new ArrayList<>();
    }
    this.dataTopics.add(dataTopicsItem);
    return this;
  }

   /**
   * 
   * @return dataTopics
  **/
  @javax.annotation.Nullable
  public List<ReportCustomAsyncTaskGetV30FilteringDataTopics> getDataTopics() {
    return dataTopics;
  }


  public void setDataTopics(List<ReportCustomAsyncTaskGetV30FilteringDataTopics> dataTopics) {
    this.dataTopics = dataTopics;
  }


  public ReportCustomAsyncTaskGetV30Filtering taskIds(List<Long> taskIds) {
    
    this.taskIds = taskIds;
    return this;
  }

  public ReportCustomAsyncTaskGetV30Filtering addTaskIdsItem(Long taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

   /**
   * 
   * @return taskIds
  **/
  @javax.annotation.Nullable
  public List<Long> getTaskIds() {
    return taskIds;
  }


  public void setTaskIds(List<Long> taskIds) {
    this.taskIds = taskIds;
  }


  public ReportCustomAsyncTaskGetV30Filtering taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * 
   * @return taskName
  **/
  @javax.annotation.Nullable
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
    ReportCustomAsyncTaskGetV30Filtering reportCustomAsyncTaskGetV30Filtering = (ReportCustomAsyncTaskGetV30Filtering) o;
    return Objects.equals(this.dataTopics, reportCustomAsyncTaskGetV30Filtering.dataTopics) &&
        Objects.equals(this.taskIds, reportCustomAsyncTaskGetV30Filtering.taskIds) &&
        Objects.equals(this.taskName, reportCustomAsyncTaskGetV30Filtering.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTopics, taskIds, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCustomAsyncTaskGetV30Filtering {\n");
    sb.append("    dataTopics: ").append(toIndentedString(dataTopics)).append("\n");
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
    openapiFields.add("data_topics");
    openapiFields.add("task_ids");
    openapiFields.add("task_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomAsyncTaskGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomAsyncTaskGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomAsyncTaskGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomAsyncTaskGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomAsyncTaskGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, ReportCustomAsyncTaskGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomAsyncTaskGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomAsyncTaskGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomAsyncTaskGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportCustomAsyncTaskGetV30Filtering
  */
  public static ReportCustomAsyncTaskGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomAsyncTaskGetV30Filtering.class);
  }

 /**
  * Convert an instance of ReportCustomAsyncTaskGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

