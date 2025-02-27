/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAdConvertQueryV2DataListConvertType;
import com.bytedance.ads.model.ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInner;
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
 * ToolsAdConvertQueryV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class ToolsAdConvertQueryV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CONVERT_TYPE = "convert_type";
  @SerializedName(SERIALIZED_NAME_CONVERT_TYPE)
  private ToolsAdConvertQueryV2DataListConvertType convertType = null;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTIONS = "external_actions";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTIONS)
  private List<ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInner> externalActions = null;

  public ToolsAdConvertQueryV2ResponseDataListInner() {
  }

  public ToolsAdConvertQueryV2ResponseDataListInner convertType(ToolsAdConvertQueryV2DataListConvertType convertType) {
    
    this.convertType = convertType;
    return this;
  }

   /**
   * Get convertType
   * @return convertType
  **/
  @javax.annotation.Nullable
  public ToolsAdConvertQueryV2DataListConvertType getConvertType() {
    return convertType;
  }


  public void setConvertType(ToolsAdConvertQueryV2DataListConvertType convertType) {
    this.convertType = convertType;
  }


  public ToolsAdConvertQueryV2ResponseDataListInner disabled(Boolean disabled) {
    
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


  public ToolsAdConvertQueryV2ResponseDataListInner externalActions(List<ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInner> externalActions) {
    
    this.externalActions = externalActions;
    return this;
  }

  public ToolsAdConvertQueryV2ResponseDataListInner addExternalActionsItem(ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInner externalActionsItem) {
    if (this.externalActions == null) {
      this.externalActions = new ArrayList<>();
    }
    this.externalActions.add(externalActionsItem);
    return this;
  }

   /**
   * 
   * @return externalActions
  **/
  @javax.annotation.Nullable
  public List<ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInner> getExternalActions() {
    return externalActions;
  }


  public void setExternalActions(List<ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInner> externalActions) {
    this.externalActions = externalActions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdConvertQueryV2ResponseDataListInner toolsAdConvertQueryV2ResponseDataListInner = (ToolsAdConvertQueryV2ResponseDataListInner) o;
    return Objects.equals(this.convertType, toolsAdConvertQueryV2ResponseDataListInner.convertType) &&
        Objects.equals(this.disabled, toolsAdConvertQueryV2ResponseDataListInner.disabled) &&
        Objects.equals(this.externalActions, toolsAdConvertQueryV2ResponseDataListInner.externalActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertType, disabled, externalActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdConvertQueryV2ResponseDataListInner {\n");
    sb.append("    convertType: ").append(toIndentedString(convertType)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    externalActions: ").append(toIndentedString(externalActions)).append("\n");
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
    openapiFields.add("convert_type");
    openapiFields.add("disabled");
    openapiFields.add("external_actions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdConvertQueryV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdConvertQueryV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdConvertQueryV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdConvertQueryV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdConvertQueryV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAdConvertQueryV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdConvertQueryV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdConvertQueryV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdConvertQueryV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAdConvertQueryV2ResponseDataListInner
  */
  public static ToolsAdConvertQueryV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdConvertQueryV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAdConvertQueryV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

