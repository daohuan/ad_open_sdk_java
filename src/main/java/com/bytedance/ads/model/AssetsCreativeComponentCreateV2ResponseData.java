/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class AssetsCreativeComponentCreateV2ResponseData {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public AssetsCreativeComponentCreateV2ResponseData() {
  }

  public AssetsCreativeComponentCreateV2ResponseData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AssetsCreativeComponentCreateV2ResponseData componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * 
   * @return componentId
  **/
  @javax.annotation.Nullable
  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public AssetsCreativeComponentCreateV2ResponseData createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AssetsCreativeComponentCreateV2ResponseData modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public AssetsCreativeComponentCreateV2ResponseData status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsCreativeComponentCreateV2ResponseData assetsCreativeComponentCreateV2ResponseData = (AssetsCreativeComponentCreateV2ResponseData) o;
    return Objects.equals(this.advertiserId, assetsCreativeComponentCreateV2ResponseData.advertiserId) &&
        Objects.equals(this.componentId, assetsCreativeComponentCreateV2ResponseData.componentId) &&
        Objects.equals(this.createTime, assetsCreativeComponentCreateV2ResponseData.createTime) &&
        Objects.equals(this.modifyTime, assetsCreativeComponentCreateV2ResponseData.modifyTime) &&
        Objects.equals(this.status, assetsCreativeComponentCreateV2ResponseData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, componentId, createTime, modifyTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsCreativeComponentCreateV2ResponseData {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("component_id");
    openapiFields.add("create_time");
    openapiFields.add("modify_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetsCreativeComponentCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetsCreativeComponentCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetsCreativeComponentCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetsCreativeComponentCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetsCreativeComponentCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AssetsCreativeComponentCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetsCreativeComponentCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetsCreativeComponentCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetsCreativeComponentCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AssetsCreativeComponentCreateV2ResponseData
  */
  public static AssetsCreativeComponentCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetsCreativeComponentCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of AssetsCreativeComponentCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

