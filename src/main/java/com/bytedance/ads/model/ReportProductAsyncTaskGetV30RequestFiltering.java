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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ReportProductAsyncTaskGetV30RequestFiltering {
  public static final String SERIALIZED_NAME_TASK_IDS = "task_ids";
  @SerializedName(SERIALIZED_NAME_TASK_IDS)
  private List<Long> taskIds = null;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName = null;

  public ReportProductAsyncTaskGetV30RequestFiltering() {
  }

  public ReportProductAsyncTaskGetV30RequestFiltering taskIds(List<Long> taskIds) {
    
    this.taskIds = taskIds;
    return this;
  }

  public ReportProductAsyncTaskGetV30RequestFiltering addTaskIdsItem(Long taskIdsItem) {
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


  public ReportProductAsyncTaskGetV30RequestFiltering taskName(String taskName) {
    
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
    ReportProductAsyncTaskGetV30RequestFiltering reportProductAsyncTaskGetV30RequestFiltering = (ReportProductAsyncTaskGetV30RequestFiltering) o;
    return Objects.equals(this.taskIds, reportProductAsyncTaskGetV30RequestFiltering.taskIds) &&
        Objects.equals(this.taskName, reportProductAsyncTaskGetV30RequestFiltering.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskIds, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportProductAsyncTaskGetV30RequestFiltering {\n");
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
    openapiFields.add("task_ids");
    openapiFields.add("task_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportProductAsyncTaskGetV30RequestFiltering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportProductAsyncTaskGetV30RequestFiltering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportProductAsyncTaskGetV30RequestFiltering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportProductAsyncTaskGetV30RequestFiltering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportProductAsyncTaskGetV30RequestFiltering>() {
           @Override
           public void write(JsonWriter out, ReportProductAsyncTaskGetV30RequestFiltering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportProductAsyncTaskGetV30RequestFiltering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportProductAsyncTaskGetV30RequestFiltering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportProductAsyncTaskGetV30RequestFiltering
  * @throws IOException if the JSON string is invalid with respect to ReportProductAsyncTaskGetV30RequestFiltering
  */
  public static ReportProductAsyncTaskGetV30RequestFiltering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportProductAsyncTaskGetV30RequestFiltering.class);
  }

 /**
  * Convert an instance of ReportProductAsyncTaskGetV30RequestFiltering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
