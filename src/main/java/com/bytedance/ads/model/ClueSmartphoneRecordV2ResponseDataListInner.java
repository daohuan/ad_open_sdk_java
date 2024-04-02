/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
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
 * ClueSmartphoneRecordV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ClueSmartphoneRecordV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_CALL_DURATION = "call_duration";
  @SerializedName(SERIALIZED_NAME_CALL_DURATION)
  private Long callDuration = null;

  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private Long clueId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_REAL_DURATION = "real_duration";
  @SerializedName(SERIALIZED_NAME_REAL_DURATION)
  private Long realDuration = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Long siteId = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIRTUAL_NUMBER = "virtual_number";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NUMBER)
  private String virtualNumber = null;

  public ClueSmartphoneRecordV2ResponseDataListInner() {
  }

  public ClueSmartphoneRecordV2ResponseDataListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ClueSmartphoneRecordV2ResponseDataListInner callDuration(Long callDuration) {
    
    this.callDuration = callDuration;
    return this;
  }

   /**
   * 
   * @return callDuration
  **/
  @javax.annotation.Nullable
  public Long getCallDuration() {
    return callDuration;
  }


  public void setCallDuration(Long callDuration) {
    this.callDuration = callDuration;
  }


  public ClueSmartphoneRecordV2ResponseDataListInner clueId(Long clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 
   * @return clueId
  **/
  @javax.annotation.Nullable
  public Long getClueId() {
    return clueId;
  }


  public void setClueId(Long clueId) {
    this.clueId = clueId;
  }


  public ClueSmartphoneRecordV2ResponseDataListInner createTime(String createTime) {
    
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


  public ClueSmartphoneRecordV2ResponseDataListInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueSmartphoneRecordV2ResponseDataListInner realDuration(Long realDuration) {
    
    this.realDuration = realDuration;
    return this;
  }

   /**
   * 
   * @return realDuration
  **/
  @javax.annotation.Nullable
  public Long getRealDuration() {
    return realDuration;
  }


  public void setRealDuration(Long realDuration) {
    this.realDuration = realDuration;
  }


  public ClueSmartphoneRecordV2ResponseDataListInner siteId(Long siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 
   * @return siteId
  **/
  @javax.annotation.Nullable
  public Long getSiteId() {
    return siteId;
  }


  public void setSiteId(Long siteId) {
    this.siteId = siteId;
  }


  public ClueSmartphoneRecordV2ResponseDataListInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ClueSmartphoneRecordV2ResponseDataListInner virtualNumber(String virtualNumber) {
    
    this.virtualNumber = virtualNumber;
    return this;
  }

   /**
   * 
   * @return virtualNumber
  **/
  @javax.annotation.Nullable
  public String getVirtualNumber() {
    return virtualNumber;
  }


  public void setVirtualNumber(String virtualNumber) {
    this.virtualNumber = virtualNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueSmartphoneRecordV2ResponseDataListInner clueSmartphoneRecordV2ResponseDataListInner = (ClueSmartphoneRecordV2ResponseDataListInner) o;
    return Objects.equals(this.adId, clueSmartphoneRecordV2ResponseDataListInner.adId) &&
        Objects.equals(this.callDuration, clueSmartphoneRecordV2ResponseDataListInner.callDuration) &&
        Objects.equals(this.clueId, clueSmartphoneRecordV2ResponseDataListInner.clueId) &&
        Objects.equals(this.createTime, clueSmartphoneRecordV2ResponseDataListInner.createTime) &&
        Objects.equals(this.instanceId, clueSmartphoneRecordV2ResponseDataListInner.instanceId) &&
        Objects.equals(this.realDuration, clueSmartphoneRecordV2ResponseDataListInner.realDuration) &&
        Objects.equals(this.siteId, clueSmartphoneRecordV2ResponseDataListInner.siteId) &&
        Objects.equals(this.startTime, clueSmartphoneRecordV2ResponseDataListInner.startTime) &&
        Objects.equals(this.virtualNumber, clueSmartphoneRecordV2ResponseDataListInner.virtualNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, callDuration, clueId, createTime, instanceId, realDuration, siteId, startTime, virtualNumber);
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
    sb.append("class ClueSmartphoneRecordV2ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    callDuration: ").append(toIndentedString(callDuration)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    realDuration: ").append(toIndentedString(realDuration)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    virtualNumber: ").append(toIndentedString(virtualNumber)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("call_duration");
    openapiFields.add("clue_id");
    openapiFields.add("create_time");
    openapiFields.add("instance_id");
    openapiFields.add("real_duration");
    openapiFields.add("site_id");
    openapiFields.add("start_time");
    openapiFields.add("virtual_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueSmartphoneRecordV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueSmartphoneRecordV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueSmartphoneRecordV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueSmartphoneRecordV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueSmartphoneRecordV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ClueSmartphoneRecordV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueSmartphoneRecordV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueSmartphoneRecordV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueSmartphoneRecordV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ClueSmartphoneRecordV2ResponseDataListInner
  */
  public static ClueSmartphoneRecordV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueSmartphoneRecordV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ClueSmartphoneRecordV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

