/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue;
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
 * ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner {
  public static final String SERIALIZED_NAME_PARAM_NAME = "param_name";
  @SerializedName(SERIALIZED_NAME_PARAM_NAME)
  private String paramName = null;

  public static final String SERIALIZED_NAME_PARAM_VALUE = "param_value";
  @SerializedName(SERIALIZED_NAME_PARAM_VALUE)
  private ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue paramValue = null;

  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner() {
  }

  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner paramName(String paramName) {
    
    this.paramName = paramName;
    return this;
  }

   /**
   * 
   * @return paramName
  **/
  @javax.annotation.Nullable
  public String getParamName() {
    return paramName;
  }


  public void setParamName(String paramName) {
    this.paramName = paramName;
  }


  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner paramValue(ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue paramValue) {
    
    this.paramValue = paramValue;
    return this;
  }

   /**
   * Get paramValue
   * @return paramValue
  **/
  @javax.annotation.Nullable
  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue getParamValue() {
    return paramValue;
  }


  public void setParamValue(ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue paramValue) {
    this.paramValue = paramValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner = (ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner) o;
    return Objects.equals(this.paramName, toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner.paramName) &&
        Objects.equals(this.paramValue, toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner.paramValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramName, paramValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner {\n");
    sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
    sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
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
    openapiFields.add("param_name");
    openapiFields.add("param_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner
  */
  public static ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
