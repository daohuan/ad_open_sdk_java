/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueContactLogListV2DataListCallDirection;
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
 * ToolsClueContactLogListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class ToolsClueContactLogListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private String agentId = null;

  public static final String SERIALIZED_NAME_CALL_DIRECTION = "call_direction";
  @SerializedName(SERIALIZED_NAME_CALL_DIRECTION)
  private ToolsClueContactLogListV2DataListCallDirection callDirection = null;

  public static final String SERIALIZED_NAME_CALL_DURATION = "call_duration";
  @SerializedName(SERIALIZED_NAME_CALL_DURATION)
  private Double callDuration = null;

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

  public static final String SERIALIZED_NAME_CONTACT_TYPE = "contact_type";
  @SerializedName(SERIALIZED_NAME_CONTACT_TYPE)
  private Integer contactType = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

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

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId = null;

  public static final String SERIALIZED_NAME_VIRTUAL_NUMBER = "virtual_number";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NUMBER)
  private String virtualNumber = null;

  public ToolsClueContactLogListV2ResponseDataListInner() {
  }

  public ToolsClueContactLogListV2ResponseDataListInner agentId(String agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 坐席ID
   * @return agentId
  **/
  @javax.annotation.Nullable
  public String getAgentId() {
    return agentId;
  }


  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public ToolsClueContactLogListV2ResponseDataListInner callDirection(ToolsClueContactLogListV2DataListCallDirection callDirection) {
    
    this.callDirection = callDirection;
    return this;
  }

   /**
   * Get callDirection
   * @return callDirection
  **/
  @javax.annotation.Nullable
  public ToolsClueContactLogListV2DataListCallDirection getCallDirection() {
    return callDirection;
  }


  public void setCallDirection(ToolsClueContactLogListV2DataListCallDirection callDirection) {
    this.callDirection = callDirection;
  }


  public ToolsClueContactLogListV2ResponseDataListInner callDuration(Double callDuration) {
    
    this.callDuration = callDuration;
    return this;
  }

   /**
   * 呼叫时长 （注：呼叫时长不包含通话时长）
   * @return callDuration
  **/
  @javax.annotation.Nullable
  public Double getCallDuration() {
    return callDuration;
  }


  public void setCallDuration(Double callDuration) {
    this.callDuration = callDuration;
  }


  public ToolsClueContactLogListV2ResponseDataListInner calleeNumber(String calleeNumber) {
    
    this.calleeNumber = calleeNumber;
    return this;
  }

   /**
   * 被叫号码
   * @return calleeNumber
  **/
  @javax.annotation.Nullable
  public String getCalleeNumber() {
    return calleeNumber;
  }


  public void setCalleeNumber(String calleeNumber) {
    this.calleeNumber = calleeNumber;
  }


  public ToolsClueContactLogListV2ResponseDataListInner callerNumber(String callerNumber) {
    
    this.callerNumber = callerNumber;
    return this;
  }

   /**
   * 主叫号码
   * @return callerNumber
  **/
  @javax.annotation.Nullable
  public String getCallerNumber() {
    return callerNumber;
  }


  public void setCallerNumber(String callerNumber) {
    this.callerNumber = callerNumber;
  }


  public ToolsClueContactLogListV2ResponseDataListInner clueId(Long clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 线索ID
   * @return clueId
  **/
  @javax.annotation.Nullable
  public Long getClueId() {
    return clueId;
  }


  public void setClueId(Long clueId) {
    this.clueId = clueId;
  }


  public ToolsClueContactLogListV2ResponseDataListInner contactId(String contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * 通话记录ID
   * @return contactId
  **/
  @javax.annotation.Nullable
  public String getContactId() {
    return contactId;
  }


  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  public ToolsClueContactLogListV2ResponseDataListInner contactType(Integer contactType) {
    
    this.contactType = contactType;
    return this;
  }

   /**
   * 通话类型
   * @return contactType
  **/
  @javax.annotation.Nullable
  public Integer getContactType() {
    return contactType;
  }


  public void setContactType(Integer contactType) {
    this.contactType = contactType;
  }


  public ToolsClueContactLogListV2ResponseDataListInner duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 通话时长
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public ToolsClueContactLogListV2ResponseDataListInner endStateShowCode(Long endStateShowCode) {
    
    this.endStateShowCode = endStateShowCode;
    return this;
  }

   /**
   * 通话结束状态
   * @return endStateShowCode
  **/
  @javax.annotation.Nullable
  public Long getEndStateShowCode() {
    return endStateShowCode;
  }


  public void setEndStateShowCode(Long endStateShowCode) {
    this.endStateShowCode = endStateShowCode;
  }


  public ToolsClueContactLogListV2ResponseDataListInner endStateShowMsg(String endStateShowMsg) {
    
    this.endStateShowMsg = endStateShowMsg;
    return this;
  }

   /**
   * 通话状态信息
   * @return endStateShowMsg
  **/
  @javax.annotation.Nullable
  public String getEndStateShowMsg() {
    return endStateShowMsg;
  }


  public void setEndStateShowMsg(String endStateShowMsg) {
    this.endStateShowMsg = endStateShowMsg;
  }


  public ToolsClueContactLogListV2ResponseDataListInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsClueContactLogListV2ResponseDataListInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ToolsClueContactLogListV2ResponseDataListInner userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 员工ID
   * @return userId
  **/
  @javax.annotation.Nullable
  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public ToolsClueContactLogListV2ResponseDataListInner virtualNumber(String virtualNumber) {
    
    this.virtualNumber = virtualNumber;
    return this;
  }

   /**
   * 中间号
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
    ToolsClueContactLogListV2ResponseDataListInner toolsClueContactLogListV2ResponseDataListInner = (ToolsClueContactLogListV2ResponseDataListInner) o;
    return Objects.equals(this.agentId, toolsClueContactLogListV2ResponseDataListInner.agentId) &&
        Objects.equals(this.callDirection, toolsClueContactLogListV2ResponseDataListInner.callDirection) &&
        Objects.equals(this.callDuration, toolsClueContactLogListV2ResponseDataListInner.callDuration) &&
        Objects.equals(this.calleeNumber, toolsClueContactLogListV2ResponseDataListInner.calleeNumber) &&
        Objects.equals(this.callerNumber, toolsClueContactLogListV2ResponseDataListInner.callerNumber) &&
        Objects.equals(this.clueId, toolsClueContactLogListV2ResponseDataListInner.clueId) &&
        Objects.equals(this.contactId, toolsClueContactLogListV2ResponseDataListInner.contactId) &&
        Objects.equals(this.contactType, toolsClueContactLogListV2ResponseDataListInner.contactType) &&
        Objects.equals(this.duration, toolsClueContactLogListV2ResponseDataListInner.duration) &&
        Objects.equals(this.endStateShowCode, toolsClueContactLogListV2ResponseDataListInner.endStateShowCode) &&
        Objects.equals(this.endStateShowMsg, toolsClueContactLogListV2ResponseDataListInner.endStateShowMsg) &&
        Objects.equals(this.endTime, toolsClueContactLogListV2ResponseDataListInner.endTime) &&
        Objects.equals(this.startTime, toolsClueContactLogListV2ResponseDataListInner.startTime) &&
        Objects.equals(this.userId, toolsClueContactLogListV2ResponseDataListInner.userId) &&
        Objects.equals(this.virtualNumber, toolsClueContactLogListV2ResponseDataListInner.virtualNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, callDirection, callDuration, calleeNumber, callerNumber, clueId, contactId, contactType, duration, endStateShowCode, endStateShowMsg, endTime, startTime, userId, virtualNumber);
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
    sb.append("class ToolsClueContactLogListV2ResponseDataListInner {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    callDirection: ").append(toIndentedString(callDirection)).append("\n");
    sb.append("    callDuration: ").append(toIndentedString(callDuration)).append("\n");
    sb.append("    calleeNumber: ").append(toIndentedString(calleeNumber)).append("\n");
    sb.append("    callerNumber: ").append(toIndentedString(callerNumber)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endStateShowCode: ").append(toIndentedString(endStateShowCode)).append("\n");
    sb.append("    endStateShowMsg: ").append(toIndentedString(endStateShowMsg)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("call_direction");
    openapiFields.add("call_duration");
    openapiFields.add("callee_number");
    openapiFields.add("caller_number");
    openapiFields.add("clue_id");
    openapiFields.add("contact_id");
    openapiFields.add("contact_type");
    openapiFields.add("duration");
    openapiFields.add("end_state_show_code");
    openapiFields.add("end_state_show_msg");
    openapiFields.add("end_time");
    openapiFields.add("start_time");
    openapiFields.add("user_id");
    openapiFields.add("virtual_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueContactLogListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueContactLogListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueContactLogListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueContactLogListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueContactLogListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueContactLogListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueContactLogListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueContactLogListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueContactLogListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueContactLogListV2ResponseDataListInner
  */
  public static ToolsClueContactLogListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueContactLogListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsClueContactLogListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

