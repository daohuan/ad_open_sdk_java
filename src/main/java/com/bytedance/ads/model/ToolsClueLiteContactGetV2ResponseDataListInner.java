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
import com.bytedance.ads.model.ToolsClueLiteContactGetV2DataListCallDirection;
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
 * ToolsClueLiteContactGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class ToolsClueLiteContactGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CALL_DIRECTION = "call_direction";
  @SerializedName(SERIALIZED_NAME_CALL_DIRECTION)
  private ToolsClueLiteContactGetV2DataListCallDirection callDirection = null;

  public static final String SERIALIZED_NAME_CALL_DURATION = "call_duration";
  @SerializedName(SERIALIZED_NAME_CALL_DURATION)
  private Long callDuration = null;

  public static final String SERIALIZED_NAME_CALLEE_NUMBER = "callee_number";
  @SerializedName(SERIALIZED_NAME_CALLEE_NUMBER)
  private String calleeNumber = null;

  public static final String SERIALIZED_NAME_CALLER_NUMBER = "caller_number";
  @SerializedName(SERIALIZED_NAME_CALLER_NUMBER)
  private String callerNumber = null;

  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private Long clueId = null;

  public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private String contactId = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration = null;

  public static final String SERIALIZED_NAME_END_STATE_SHOW_CODE = "end_state_show_code";
  @SerializedName(SERIALIZED_NAME_END_STATE_SHOW_CODE)
  private Long endStateShowCode = null;

  public static final String SERIALIZED_NAME_END_STATE_SHOW_MSG = "end_state_show_msg";
  @SerializedName(SERIALIZED_NAME_END_STATE_SHOW_MSG)
  private String endStateShowMsg = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIRTUAL_NUMBER = "virtual_number";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NUMBER)
  private String virtualNumber = null;

  public ToolsClueLiteContactGetV2ResponseDataListInner() {
  }

  public ToolsClueLiteContactGetV2ResponseDataListInner callDirection(ToolsClueLiteContactGetV2DataListCallDirection callDirection) {
    
    this.callDirection = callDirection;
    return this;
  }

   /**
   * Get callDirection
   * @return callDirection
  **/
  @javax.annotation.Nullable
  public ToolsClueLiteContactGetV2DataListCallDirection getCallDirection() {
    return callDirection;
  }


  public void setCallDirection(ToolsClueLiteContactGetV2DataListCallDirection callDirection) {
    this.callDirection = callDirection;
  }


  public ToolsClueLiteContactGetV2ResponseDataListInner callDuration(Long callDuration) {
    
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


  public ToolsClueLiteContactGetV2ResponseDataListInner calleeNumber(String calleeNumber) {
    
    this.calleeNumber = calleeNumber;
    return this;
  }

   /**
   * 
   * @return calleeNumber
  **/
  @javax.annotation.Nullable
  public String getCalleeNumber() {
    return calleeNumber;
  }


  public void setCalleeNumber(String calleeNumber) {
    this.calleeNumber = calleeNumber;
  }


  public ToolsClueLiteContactGetV2ResponseDataListInner callerNumber(String callerNumber) {
    
    this.callerNumber = callerNumber;
    return this;
  }

   /**
   * 
   * @return callerNumber
  **/
  @javax.annotation.Nullable
  public String getCallerNumber() {
    return callerNumber;
  }


  public void setCallerNumber(String callerNumber) {
    this.callerNumber = callerNumber;
  }


  public ToolsClueLiteContactGetV2ResponseDataListInner clueId(Long clueId) {
    
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


  public ToolsClueLiteContactGetV2ResponseDataListInner contactId(String contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * 
   * @return contactId
  **/
  @javax.annotation.Nullable
  public String getContactId() {
    return contactId;
  }


  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  public ToolsClueLiteContactGetV2ResponseDataListInner duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 
   * @return duration
  **/
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ToolsClueLiteContactGetV2ResponseDataListInner endStateShowCode(Long endStateShowCode) {
    
    this.endStateShowCode = endStateShowCode;
    return this;
  }

   /**
   * 
   * @return endStateShowCode
  **/
  @javax.annotation.Nullable
  public Long getEndStateShowCode() {
    return endStateShowCode;
  }


  public void setEndStateShowCode(Long endStateShowCode) {
    this.endStateShowCode = endStateShowCode;
  }


  public ToolsClueLiteContactGetV2ResponseDataListInner endStateShowMsg(String endStateShowMsg) {
    
    this.endStateShowMsg = endStateShowMsg;
    return this;
  }

   /**
   * 
   * @return endStateShowMsg
  **/
  @javax.annotation.Nullable
  public String getEndStateShowMsg() {
    return endStateShowMsg;
  }


  public void setEndStateShowMsg(String endStateShowMsg) {
    this.endStateShowMsg = endStateShowMsg;
  }


  public ToolsClueLiteContactGetV2ResponseDataListInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsClueLiteContactGetV2ResponseDataListInner startTime(String startTime) {
    
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


  public ToolsClueLiteContactGetV2ResponseDataListInner virtualNumber(String virtualNumber) {
    
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
    ToolsClueLiteContactGetV2ResponseDataListInner toolsClueLiteContactGetV2ResponseDataListInner = (ToolsClueLiteContactGetV2ResponseDataListInner) o;
    return Objects.equals(this.callDirection, toolsClueLiteContactGetV2ResponseDataListInner.callDirection) &&
        Objects.equals(this.callDuration, toolsClueLiteContactGetV2ResponseDataListInner.callDuration) &&
        Objects.equals(this.calleeNumber, toolsClueLiteContactGetV2ResponseDataListInner.calleeNumber) &&
        Objects.equals(this.callerNumber, toolsClueLiteContactGetV2ResponseDataListInner.callerNumber) &&
        Objects.equals(this.clueId, toolsClueLiteContactGetV2ResponseDataListInner.clueId) &&
        Objects.equals(this.contactId, toolsClueLiteContactGetV2ResponseDataListInner.contactId) &&
        Objects.equals(this.duration, toolsClueLiteContactGetV2ResponseDataListInner.duration) &&
        Objects.equals(this.endStateShowCode, toolsClueLiteContactGetV2ResponseDataListInner.endStateShowCode) &&
        Objects.equals(this.endStateShowMsg, toolsClueLiteContactGetV2ResponseDataListInner.endStateShowMsg) &&
        Objects.equals(this.endTime, toolsClueLiteContactGetV2ResponseDataListInner.endTime) &&
        Objects.equals(this.startTime, toolsClueLiteContactGetV2ResponseDataListInner.startTime) &&
        Objects.equals(this.virtualNumber, toolsClueLiteContactGetV2ResponseDataListInner.virtualNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(callDirection, callDuration, calleeNumber, callerNumber, clueId, contactId, duration, endStateShowCode, endStateShowMsg, endTime, startTime, virtualNumber);
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
    sb.append("class ToolsClueLiteContactGetV2ResponseDataListInner {\n");
    sb.append("    callDirection: ").append(toIndentedString(callDirection)).append("\n");
    sb.append("    callDuration: ").append(toIndentedString(callDuration)).append("\n");
    sb.append("    calleeNumber: ").append(toIndentedString(calleeNumber)).append("\n");
    sb.append("    callerNumber: ").append(toIndentedString(callerNumber)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endStateShowCode: ").append(toIndentedString(endStateShowCode)).append("\n");
    sb.append("    endStateShowMsg: ").append(toIndentedString(endStateShowMsg)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
    openapiFields.add("call_direction");
    openapiFields.add("call_duration");
    openapiFields.add("callee_number");
    openapiFields.add("caller_number");
    openapiFields.add("clue_id");
    openapiFields.add("contact_id");
    openapiFields.add("duration");
    openapiFields.add("end_state_show_code");
    openapiFields.add("end_state_show_msg");
    openapiFields.add("end_time");
    openapiFields.add("start_time");
    openapiFields.add("virtual_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueLiteContactGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueLiteContactGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueLiteContactGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueLiteContactGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueLiteContactGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueLiteContactGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueLiteContactGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueLiteContactGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueLiteContactGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueLiteContactGetV2ResponseDataListInner
  */
  public static ToolsClueLiteContactGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueLiteContactGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsClueLiteContactGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

