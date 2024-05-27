/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ToolsKeywordsProjectInfoGetV30ResponseData {
  public static final String SERIALIZED_NAME_PROJECT_INFO = "project_info";
  @SerializedName(SERIALIZED_NAME_PROJECT_INFO)
  private List<ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner> projectInfo = null;

  public ToolsKeywordsProjectInfoGetV30ResponseData() {
  }

  public ToolsKeywordsProjectInfoGetV30ResponseData projectInfo(List<ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner> projectInfo) {
    
    this.projectInfo = projectInfo;
    return this;
  }

  public ToolsKeywordsProjectInfoGetV30ResponseData addProjectInfoItem(ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner projectInfoItem) {
    if (this.projectInfo == null) {
      this.projectInfo = new ArrayList<>();
    }
    this.projectInfo.add(projectInfoItem);
    return this;
  }

   /**
   * 
   * @return projectInfo
  **/
  @javax.annotation.Nullable
  public List<ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner> getProjectInfo() {
    return projectInfo;
  }


  public void setProjectInfo(List<ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner> projectInfo) {
    this.projectInfo = projectInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsKeywordsProjectInfoGetV30ResponseData toolsKeywordsProjectInfoGetV30ResponseData = (ToolsKeywordsProjectInfoGetV30ResponseData) o;
    return Objects.equals(this.projectInfo, toolsKeywordsProjectInfoGetV30ResponseData.projectInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectInfo);
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
    sb.append("class ToolsKeywordsProjectInfoGetV30ResponseData {\n");
    sb.append("    projectInfo: ").append(toIndentedString(projectInfo)).append("\n");
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
    openapiFields.add("project_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsKeywordsProjectInfoGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsKeywordsProjectInfoGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsKeywordsProjectInfoGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsKeywordsProjectInfoGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsKeywordsProjectInfoGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsKeywordsProjectInfoGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsKeywordsProjectInfoGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsKeywordsProjectInfoGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsKeywordsProjectInfoGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsKeywordsProjectInfoGetV30ResponseData
  */
  public static ToolsKeywordsProjectInfoGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsKeywordsProjectInfoGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsKeywordsProjectInfoGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

