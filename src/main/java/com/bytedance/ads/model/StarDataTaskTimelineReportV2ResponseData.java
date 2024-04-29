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
import com.bytedance.ads.model.StarDataTaskTimelineReportV2ResponseDataProjectDataValue;
import com.bytedance.ads.model.StarDataTaskTimelineReportV2ResponseDataTaskDataValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class StarDataTaskTimelineReportV2ResponseData {
  public static final String SERIALIZED_NAME_PROJECT_DATA = "project_data";
  @SerializedName(SERIALIZED_NAME_PROJECT_DATA)
  private Map<String, StarDataTaskTimelineReportV2ResponseDataProjectDataValue> projectData = null;

  public static final String SERIALIZED_NAME_TASK_DATA = "task_data";
  @SerializedName(SERIALIZED_NAME_TASK_DATA)
  private Map<String, StarDataTaskTimelineReportV2ResponseDataTaskDataValue> taskData = null;

  public StarDataTaskTimelineReportV2ResponseData() {
  }

  public StarDataTaskTimelineReportV2ResponseData projectData(Map<String, StarDataTaskTimelineReportV2ResponseDataProjectDataValue> projectData) {
    
    this.projectData = projectData;
    return this;
  }

  public StarDataTaskTimelineReportV2ResponseData putProjectDataItem(String key, StarDataTaskTimelineReportV2ResponseDataProjectDataValue projectDataItem) {
    if (this.projectData == null) {
      this.projectData = new HashMap<>();
    }
    this.projectData.put(key, projectDataItem);
    return this;
  }

   /**
   * 项目数据
   * @return projectData
  **/
  @javax.annotation.Nullable
  public Map<String, StarDataTaskTimelineReportV2ResponseDataProjectDataValue> getProjectData() {
    return projectData;
  }


  public void setProjectData(Map<String, StarDataTaskTimelineReportV2ResponseDataProjectDataValue> projectData) {
    this.projectData = projectData;
  }


  public StarDataTaskTimelineReportV2ResponseData taskData(Map<String, StarDataTaskTimelineReportV2ResponseDataTaskDataValue> taskData) {
    
    this.taskData = taskData;
    return this;
  }

  public StarDataTaskTimelineReportV2ResponseData putTaskDataItem(String key, StarDataTaskTimelineReportV2ResponseDataTaskDataValue taskDataItem) {
    if (this.taskData == null) {
      this.taskData = new HashMap<>();
    }
    this.taskData.put(key, taskDataItem);
    return this;
  }

   /**
   * 任务数据
   * @return taskData
  **/
  @javax.annotation.Nullable
  public Map<String, StarDataTaskTimelineReportV2ResponseDataTaskDataValue> getTaskData() {
    return taskData;
  }


  public void setTaskData(Map<String, StarDataTaskTimelineReportV2ResponseDataTaskDataValue> taskData) {
    this.taskData = taskData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDataTaskTimelineReportV2ResponseData starDataTaskTimelineReportV2ResponseData = (StarDataTaskTimelineReportV2ResponseData) o;
    return Objects.equals(this.projectData, starDataTaskTimelineReportV2ResponseData.projectData) &&
        Objects.equals(this.taskData, starDataTaskTimelineReportV2ResponseData.taskData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectData, taskData);
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
    sb.append("class StarDataTaskTimelineReportV2ResponseData {\n");
    sb.append("    projectData: ").append(toIndentedString(projectData)).append("\n");
    sb.append("    taskData: ").append(toIndentedString(taskData)).append("\n");
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
    openapiFields.add("project_data");
    openapiFields.add("task_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDataTaskTimelineReportV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDataTaskTimelineReportV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDataTaskTimelineReportV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDataTaskTimelineReportV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDataTaskTimelineReportV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarDataTaskTimelineReportV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDataTaskTimelineReportV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDataTaskTimelineReportV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDataTaskTimelineReportV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarDataTaskTimelineReportV2ResponseData
  */
  public static StarDataTaskTimelineReportV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDataTaskTimelineReportV2ResponseData.class);
  }

 /**
  * Convert an instance of StarDataTaskTimelineReportV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

