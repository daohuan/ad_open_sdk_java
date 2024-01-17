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
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsDeepExternalActionsDeepExternalAction;
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
 * ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner {
  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsDeepExternalActionsDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_NAME = "deep_external_name";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_NAME)
  private String deepExternalName = null;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = null;

  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner() {
  }

  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner deepExternalAction(ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsDeepExternalActionsDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsDeepExternalActionsDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsDeepExternalActionsDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner deepExternalName(String deepExternalName) {
    
    this.deepExternalName = deepExternalName;
    return this;
  }

   /**
   * 
   * @return deepExternalName
  **/
  @javax.annotation.Nullable
  public String getDeepExternalName() {
    return deepExternalName;
  }


  public void setDeepExternalName(String deepExternalName) {
    this.deepExternalName = deepExternalName;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * 
   * @return disabled
  **/
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner = (ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner) o;
    return Objects.equals(this.deepExternalAction, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner.deepExternalAction) &&
        Objects.equals(this.deepExternalName, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner.deepExternalName) &&
        Objects.equals(this.disabled, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deepExternalAction, deepExternalName, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner {\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    deepExternalName: ").append(toIndentedString(deepExternalName)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
    openapiFields.add("deep_external_action");
    openapiFields.add("deep_external_name");
    openapiFields.add("disabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner>() {
           @Override
           public void write(JsonWriter out, ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner
  */
  public static ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner.class);
  }

 /**
  * Convert an instance of ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInnerDeepExternalActionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
