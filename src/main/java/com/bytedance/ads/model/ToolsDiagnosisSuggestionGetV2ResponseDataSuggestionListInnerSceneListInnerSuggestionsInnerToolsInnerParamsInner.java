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
import com.bytedance.ads.model.ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInnerParamValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner {
  public static final String SERIALIZED_NAME_PARAM_NAME = "param_name";
  @SerializedName(SERIALIZED_NAME_PARAM_NAME)
  private String paramName = null;

  public static final String SERIALIZED_NAME_PARAM_VALUE = "param_value";
  @SerializedName(SERIALIZED_NAME_PARAM_VALUE)
  private ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInnerParamValue paramValue = null;

  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner() {
  }

  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner paramName(String paramName) {
    
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


  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner paramValue(ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInnerParamValue paramValue) {
    
    this.paramValue = paramValue;
    return this;
  }

   /**
   * Get paramValue
   * @return paramValue
  **/
  @javax.annotation.Nullable
  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInnerParamValue getParamValue() {
    return paramValue;
  }


  public void setParamValue(ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInnerParamValue paramValue) {
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
    ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner toolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner = (ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner) o;
    return Objects.equals(this.paramName, toolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner.paramName) &&
        Objects.equals(this.paramValue, toolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner.paramValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramName, paramValue);
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
    sb.append("class ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner {\n");
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
       if (!ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner
  */
  public static ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInnerSuggestionsInnerToolsInnerParamsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

