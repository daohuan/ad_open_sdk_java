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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ToolsAdRaiseEstimateGetV2ResponseData {
  public static final String SERIALIZED_NAME_ESTIMATE_NUM = "estimate_num";
  @SerializedName(SERIALIZED_NAME_ESTIMATE_NUM)
  private Long estimateNum = null;

  public ToolsAdRaiseEstimateGetV2ResponseData() {
  }

  public ToolsAdRaiseEstimateGetV2ResponseData estimateNum(Long estimateNum) {
    
    this.estimateNum = estimateNum;
    return this;
  }

   /**
   * 
   * @return estimateNum
  **/
  @javax.annotation.Nullable
  public Long getEstimateNum() {
    return estimateNum;
  }


  public void setEstimateNum(Long estimateNum) {
    this.estimateNum = estimateNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdRaiseEstimateGetV2ResponseData toolsAdRaiseEstimateGetV2ResponseData = (ToolsAdRaiseEstimateGetV2ResponseData) o;
    return Objects.equals(this.estimateNum, toolsAdRaiseEstimateGetV2ResponseData.estimateNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdRaiseEstimateGetV2ResponseData {\n");
    sb.append("    estimateNum: ").append(toIndentedString(estimateNum)).append("\n");
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
    openapiFields.add("estimate_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("estimate_num");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdRaiseEstimateGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdRaiseEstimateGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdRaiseEstimateGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdRaiseEstimateGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdRaiseEstimateGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAdRaiseEstimateGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdRaiseEstimateGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdRaiseEstimateGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdRaiseEstimateGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAdRaiseEstimateGetV2ResponseData
  */
  public static ToolsAdRaiseEstimateGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdRaiseEstimateGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAdRaiseEstimateGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

