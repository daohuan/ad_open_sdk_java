/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType;
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
 * CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner {
  public static final String SERIALIZED_NAME_STATE_KEY = "state_key";
  @SerializedName(SERIALIZED_NAME_STATE_KEY)
  private String stateKey = null;

  public static final String SERIALIZED_NAME_STATE_TYPE = "state_type";
  @SerializedName(SERIALIZED_NAME_STATE_TYPE)
  private CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType stateType = null;

  public static final String SERIALIZED_NAME_STATE_VALUE = "state_value";
  @SerializedName(SERIALIZED_NAME_STATE_VALUE)
  private String stateValue = null;

  public CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner() {
  }

  public CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner stateKey(String stateKey) {
    
    this.stateKey = stateKey;
    return this;
  }

   /**
   * 配置项key
   * @return stateKey
  **/
  @javax.annotation.Nonnull
  public String getStateKey() {
    return stateKey;
  }


  public void setStateKey(String stateKey) {
    this.stateKey = stateKey;
  }


  public CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner stateType(CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType stateType) {
    
    this.stateType = stateType;
    return this;
  }

   /**
   * Get stateType
   * @return stateType
  **/
  @javax.annotation.Nonnull
  public CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType getStateType() {
    return stateType;
  }


  public void setStateType(CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType stateType) {
    this.stateType = stateType;
  }


  public CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner stateValue(String stateValue) {
    
    this.stateValue = stateValue;
    return this;
  }

   /**
   * 配置项值
   * @return stateValue
  **/
  @javax.annotation.Nullable
  public String getStateValue() {
    return stateValue;
  }


  public void setStateValue(String stateValue) {
    this.stateValue = stateValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner creativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner = (CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner) o;
    return Objects.equals(this.stateKey, creativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner.stateKey) &&
        Objects.equals(this.stateType, creativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner.stateType) &&
        Objects.equals(this.stateValue, creativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner.stateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateKey, stateType, stateValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner {\n");
    sb.append("    stateKey: ").append(toIndentedString(stateKey)).append("\n");
    sb.append("    stateType: ").append(toIndentedString(stateType)).append("\n");
    sb.append("    stateValue: ").append(toIndentedString(stateValue)).append("\n");
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
    openapiFields.add("state_key");
    openapiFields.add("state_type");
    openapiFields.add("state_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("state_key");
    openapiRequiredFields.add("state_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner>() {
           @Override
           public void write(JsonWriter out, CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner
  * @throws IOException if the JSON string is invalid with respect to CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner
  */
  public static CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner.class);
  }

 /**
  * Convert an instance of CreativeAutoGenerateConfigV2CreateV2RequestStrategyDataInnerStrategyStateInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

