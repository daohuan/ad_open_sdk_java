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
import com.bytedance.ads.model.ProjectScheduleTimeUpdateV30ResponseDataErrorsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class ProjectScheduleTimeUpdateV30ResponseData {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ProjectScheduleTimeUpdateV30ResponseDataErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "project_ids";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<Long> projectIds = null;

  public ProjectScheduleTimeUpdateV30ResponseData() {
  }

  public ProjectScheduleTimeUpdateV30ResponseData errors(List<ProjectScheduleTimeUpdateV30ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public ProjectScheduleTimeUpdateV30ResponseData addErrorsItem(ProjectScheduleTimeUpdateV30ResponseDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 更新失败的项目ID列表
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<ProjectScheduleTimeUpdateV30ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<ProjectScheduleTimeUpdateV30ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }


  public ProjectScheduleTimeUpdateV30ResponseData projectIds(List<Long> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public ProjectScheduleTimeUpdateV30ResponseData addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * 更新成功的项目ID集合
   * @return projectIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectScheduleTimeUpdateV30ResponseData projectScheduleTimeUpdateV30ResponseData = (ProjectScheduleTimeUpdateV30ResponseData) o;
    return Objects.equals(this.errors, projectScheduleTimeUpdateV30ResponseData.errors) &&
        Objects.equals(this.projectIds, projectScheduleTimeUpdateV30ResponseData.projectIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, projectIds);
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
    sb.append("class ProjectScheduleTimeUpdateV30ResponseData {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("project_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectScheduleTimeUpdateV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectScheduleTimeUpdateV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectScheduleTimeUpdateV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectScheduleTimeUpdateV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectScheduleTimeUpdateV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ProjectScheduleTimeUpdateV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectScheduleTimeUpdateV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectScheduleTimeUpdateV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectScheduleTimeUpdateV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ProjectScheduleTimeUpdateV30ResponseData
  */
  public static ProjectScheduleTimeUpdateV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectScheduleTimeUpdateV30ResponseData.class);
  }

 /**
  * Convert an instance of ProjectScheduleTimeUpdateV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

