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
import com.bytedance.ads.model.EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType;
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
 * 小程序信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class EventManagerAssetsCreateV2RequestMiniProgramAsset {
  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM_ID = "mini_program_id";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM_ID)
  private String miniProgramId = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM_NAME = "mini_program_name";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM_NAME)
  private String miniProgramName = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM_TYPE = "mini_program_type";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM_TYPE)
  private EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType miniProgramType = null;

  public EventManagerAssetsCreateV2RequestMiniProgramAsset() {
  }

  public EventManagerAssetsCreateV2RequestMiniProgramAsset instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 小程序instance_id
   * @return instanceId
  **/
  @javax.annotation.Nonnull
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public EventManagerAssetsCreateV2RequestMiniProgramAsset miniProgramId(String miniProgramId) {
    
    this.miniProgramId = miniProgramId;
    return this;
  }

   /**
   * 小程序appId
   * @return miniProgramId
  **/
  @javax.annotation.Nonnull
  public String getMiniProgramId() {
    return miniProgramId;
  }


  public void setMiniProgramId(String miniProgramId) {
    this.miniProgramId = miniProgramId;
  }


  public EventManagerAssetsCreateV2RequestMiniProgramAsset miniProgramName(String miniProgramName) {
    
    this.miniProgramName = miniProgramName;
    return this;
  }

   /**
   * 小程序的名称
   * @return miniProgramName
  **/
  @javax.annotation.Nonnull
  public String getMiniProgramName() {
    return miniProgramName;
  }


  public void setMiniProgramName(String miniProgramName) {
    this.miniProgramName = miniProgramName;
  }


  public EventManagerAssetsCreateV2RequestMiniProgramAsset miniProgramType(EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType miniProgramType) {
    
    this.miniProgramType = miniProgramType;
    return this;
  }

   /**
   * Get miniProgramType
   * @return miniProgramType
  **/
  @javax.annotation.Nonnull
  public EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType getMiniProgramType() {
    return miniProgramType;
  }


  public void setMiniProgramType(EventManagerAssetsCreateV2MiniProgramAssetMiniProgramType miniProgramType) {
    this.miniProgramType = miniProgramType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAssetsCreateV2RequestMiniProgramAsset eventManagerAssetsCreateV2RequestMiniProgramAsset = (EventManagerAssetsCreateV2RequestMiniProgramAsset) o;
    return Objects.equals(this.instanceId, eventManagerAssetsCreateV2RequestMiniProgramAsset.instanceId) &&
        Objects.equals(this.miniProgramId, eventManagerAssetsCreateV2RequestMiniProgramAsset.miniProgramId) &&
        Objects.equals(this.miniProgramName, eventManagerAssetsCreateV2RequestMiniProgramAsset.miniProgramName) &&
        Objects.equals(this.miniProgramType, eventManagerAssetsCreateV2RequestMiniProgramAsset.miniProgramType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, miniProgramId, miniProgramName, miniProgramType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerAssetsCreateV2RequestMiniProgramAsset {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    miniProgramId: ").append(toIndentedString(miniProgramId)).append("\n");
    sb.append("    miniProgramName: ").append(toIndentedString(miniProgramName)).append("\n");
    sb.append("    miniProgramType: ").append(toIndentedString(miniProgramType)).append("\n");
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
    openapiFields.add("instance_id");
    openapiFields.add("mini_program_id");
    openapiFields.add("mini_program_name");
    openapiFields.add("mini_program_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("instance_id");
    openapiRequiredFields.add("mini_program_id");
    openapiRequiredFields.add("mini_program_name");
    openapiRequiredFields.add("mini_program_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAssetsCreateV2RequestMiniProgramAsset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAssetsCreateV2RequestMiniProgramAsset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAssetsCreateV2RequestMiniProgramAsset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAssetsCreateV2RequestMiniProgramAsset.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAssetsCreateV2RequestMiniProgramAsset>() {
           @Override
           public void write(JsonWriter out, EventManagerAssetsCreateV2RequestMiniProgramAsset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAssetsCreateV2RequestMiniProgramAsset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAssetsCreateV2RequestMiniProgramAsset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAssetsCreateV2RequestMiniProgramAsset
  * @throws IOException if the JSON string is invalid with respect to EventManagerAssetsCreateV2RequestMiniProgramAsset
  */
  public static EventManagerAssetsCreateV2RequestMiniProgramAsset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAssetsCreateV2RequestMiniProgramAsset.class);
  }

 /**
  * Convert an instance of EventManagerAssetsCreateV2RequestMiniProgramAsset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

