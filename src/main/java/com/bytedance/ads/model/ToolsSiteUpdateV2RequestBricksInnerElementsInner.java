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
 * ToolsSiteUpdateV2RequestBricksInnerElementsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsSiteUpdateV2RequestBricksInnerElementsInner {
  public static final String SERIALIZED_NAME_ALLOW_EMPTY = "allow_empty";
  @SerializedName(SERIALIZED_NAME_ALLOW_EMPTY)
  private Long allowEmpty = null;

  public static final String SERIALIZED_NAME_IS_UNIQUE = "is_unique";
  @SerializedName(SERIALIZED_NAME_IS_UNIQUE)
  private Long isUnique = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public ToolsSiteUpdateV2RequestBricksInnerElementsInner() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerElementsInner allowEmpty(Long allowEmpty) {
    
    this.allowEmpty = allowEmpty;
    return this;
  }

   /**
   * 
   * @return allowEmpty
  **/
  @javax.annotation.Nullable
  public Long getAllowEmpty() {
    return allowEmpty;
  }


  public void setAllowEmpty(Long allowEmpty) {
    this.allowEmpty = allowEmpty;
  }


  public ToolsSiteUpdateV2RequestBricksInnerElementsInner isUnique(Long isUnique) {
    
    this.isUnique = isUnique;
    return this;
  }

   /**
   * 
   * @return isUnique
  **/
  @javax.annotation.Nullable
  public Long getIsUnique() {
    return isUnique;
  }


  public void setIsUnique(Long isUnique) {
    this.isUnique = isUnique;
  }


  public ToolsSiteUpdateV2RequestBricksInnerElementsInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ToolsSiteUpdateV2RequestBricksInnerElementsInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerElementsInner toolsSiteUpdateV2RequestBricksInnerElementsInner = (ToolsSiteUpdateV2RequestBricksInnerElementsInner) o;
    return Objects.equals(this.allowEmpty, toolsSiteUpdateV2RequestBricksInnerElementsInner.allowEmpty) &&
        Objects.equals(this.isUnique, toolsSiteUpdateV2RequestBricksInnerElementsInner.isUnique) &&
        Objects.equals(this.label, toolsSiteUpdateV2RequestBricksInnerElementsInner.label) &&
        Objects.equals(this.type, toolsSiteUpdateV2RequestBricksInnerElementsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmpty, isUnique, label, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerElementsInner {\n");
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("allow_empty");
    openapiFields.add("is_unique");
    openapiFields.add("label");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerElementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerElementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerElementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerElementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerElementsInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerElementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerElementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerElementsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerElementsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerElementsInner
  */
  public static ToolsSiteUpdateV2RequestBricksInnerElementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerElementsInner.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerElementsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
