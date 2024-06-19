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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class ToolsClueContactLogOverviewQueryV2ResponseData {
  public static final String SERIALIZED_NAME_CONNECTED_AVERAGE_DURATION = "connected_average_duration";
  @SerializedName(SERIALIZED_NAME_CONNECTED_AVERAGE_DURATION)
  private Long connectedAverageDuration = null;

  public static final String SERIALIZED_NAME_CONNECTED_CONTACT_LOG_CNT = "connected_contact_log_cnt";
  @SerializedName(SERIALIZED_NAME_CONNECTED_CONTACT_LOG_CNT)
  private Long connectedContactLogCnt = null;

  public static final String SERIALIZED_NAME_CONNECTED_CONTACT_LOG_RATE = "connected_contact_log_rate";
  @SerializedName(SERIALIZED_NAME_CONNECTED_CONTACT_LOG_RATE)
  private Double connectedContactLogRate = null;

  public static final String SERIALIZED_NAME_CONTACT_LOG_CNT = "contact_log_cnt";
  @SerializedName(SERIALIZED_NAME_CONTACT_LOG_CNT)
  private Long contactLogCnt = null;

  public static final String SERIALIZED_NAME_DEEP_TALK_CLUE_CNT = "deep_talk_clue_cnt";
  @SerializedName(SERIALIZED_NAME_DEEP_TALK_CLUE_CNT)
  private Long deepTalkClueCnt = null;

  public static final String SERIALIZED_NAME_DEEP_TALK_CONTACT_LOG_CNT = "deep_talk_contact_log_cnt";
  @SerializedName(SERIALIZED_NAME_DEEP_TALK_CONTACT_LOG_CNT)
  private Long deepTalkContactLogCnt = null;

  public static final String SERIALIZED_NAME_TOTAL_DURATION = "total_duration";
  @SerializedName(SERIALIZED_NAME_TOTAL_DURATION)
  private Long totalDuration = null;

  public static final String SERIALIZED_NAME_UNCONNECTED_AVERAGE_TRY_DURATION = "unconnected_average_try_duration";
  @SerializedName(SERIALIZED_NAME_UNCONNECTED_AVERAGE_TRY_DURATION)
  private Long unconnectedAverageTryDuration = null;

  public static final String SERIALIZED_NAME_UNCONNECTED_CONTACT_LOG_CNT = "unconnected_contact_log_cnt";
  @SerializedName(SERIALIZED_NAME_UNCONNECTED_CONTACT_LOG_CNT)
  private Long unconnectedContactLogCnt = null;

  public ToolsClueContactLogOverviewQueryV2ResponseData() {
  }

  public ToolsClueContactLogOverviewQueryV2ResponseData connectedAverageDuration(Long connectedAverageDuration) {
    
    this.connectedAverageDuration = connectedAverageDuration;
    return this;
  }

   /**
   * 接通话单平均通话时长。单位秒。时间粒度为话单创建时间。
   * @return connectedAverageDuration
  **/
  @javax.annotation.Nullable
  public Long getConnectedAverageDuration() {
    return connectedAverageDuration;
  }


  public void setConnectedAverageDuration(Long connectedAverageDuration) {
    this.connectedAverageDuration = connectedAverageDuration;
  }


  public ToolsClueContactLogOverviewQueryV2ResponseData connectedContactLogCnt(Long connectedContactLogCnt) {
    
    this.connectedContactLogCnt = connectedContactLogCnt;
    return this;
  }

   /**
   * 接通话单量。时间粒度为话单创建时间。
   * @return connectedContactLogCnt
  **/
  @javax.annotation.Nullable
  public Long getConnectedContactLogCnt() {
    return connectedContactLogCnt;
  }


  public void setConnectedContactLogCnt(Long connectedContactLogCnt) {
    this.connectedContactLogCnt = connectedContactLogCnt;
  }


  public ToolsClueContactLogOverviewQueryV2ResponseData connectedContactLogRate(Double connectedContactLogRate) {
    
    this.connectedContactLogRate = connectedContactLogRate;
    return this;
  }

   /**
   * 话单接通率。时间粒度为话单创建时间。
   * @return connectedContactLogRate
  **/
  @javax.annotation.Nullable
  public Double getConnectedContactLogRate() {
    return connectedContactLogRate;
  }


  public void setConnectedContactLogRate(Double connectedContactLogRate) {
    this.connectedContactLogRate = connectedContactLogRate;
  }


  public ToolsClueContactLogOverviewQueryV2ResponseData contactLogCnt(Long contactLogCnt) {
    
    this.contactLogCnt = contactLogCnt;
    return this;
  }

   /**
   * 总话单量。时间粒度为话单创建时间。
   * @return contactLogCnt
  **/
  @javax.annotation.Nullable
  public Long getContactLogCnt() {
    return contactLogCnt;
  }


  public void setContactLogCnt(Long contactLogCnt) {
    this.contactLogCnt = contactLogCnt;
  }


  public ToolsClueContactLogOverviewQueryV2ResponseData deepTalkClueCnt(Long deepTalkClueCnt) {
    
    this.deepTalkClueCnt = deepTalkClueCnt;
    return this;
  }

   /**
   * 深度沟通（通话时长大于3min）线索量。时间粒度为话单创建时间。
   * @return deepTalkClueCnt
  **/
  @javax.annotation.Nullable
  public Long getDeepTalkClueCnt() {
    return deepTalkClueCnt;
  }


  public void setDeepTalkClueCnt(Long deepTalkClueCnt) {
    this.deepTalkClueCnt = deepTalkClueCnt;
  }


  public ToolsClueContactLogOverviewQueryV2ResponseData deepTalkContactLogCnt(Long deepTalkContactLogCnt) {
    
    this.deepTalkContactLogCnt = deepTalkContactLogCnt;
    return this;
  }

   /**
   * 深度沟通（通话时长大于3min）话单量。时间粒度为话单创建时间。
   * @return deepTalkContactLogCnt
  **/
  @javax.annotation.Nullable
  public Long getDeepTalkContactLogCnt() {
    return deepTalkContactLogCnt;
  }


  public void setDeepTalkContactLogCnt(Long deepTalkContactLogCnt) {
    this.deepTalkContactLogCnt = deepTalkContactLogCnt;
  }


  public ToolsClueContactLogOverviewQueryV2ResponseData totalDuration(Long totalDuration) {
    
    this.totalDuration = totalDuration;
    return this;
  }

   /**
   * 通话总时长。单位秒。时间粒度为话单创建时间。
   * @return totalDuration
  **/
  @javax.annotation.Nullable
  public Long getTotalDuration() {
    return totalDuration;
  }


  public void setTotalDuration(Long totalDuration) {
    this.totalDuration = totalDuration;
  }


  public ToolsClueContactLogOverviewQueryV2ResponseData unconnectedAverageTryDuration(Long unconnectedAverageTryDuration) {
    
    this.unconnectedAverageTryDuration = unconnectedAverageTryDuration;
    return this;
  }

   /**
   * 未接通话单平均拨打时长。单位秒。时间粒度为话单创建时间。
   * @return unconnectedAverageTryDuration
  **/
  @javax.annotation.Nullable
  public Long getUnconnectedAverageTryDuration() {
    return unconnectedAverageTryDuration;
  }


  public void setUnconnectedAverageTryDuration(Long unconnectedAverageTryDuration) {
    this.unconnectedAverageTryDuration = unconnectedAverageTryDuration;
  }


  public ToolsClueContactLogOverviewQueryV2ResponseData unconnectedContactLogCnt(Long unconnectedContactLogCnt) {
    
    this.unconnectedContactLogCnt = unconnectedContactLogCnt;
    return this;
  }

   /**
   * 未接通话单量。时间粒度为话单创建时间。
   * @return unconnectedContactLogCnt
  **/
  @javax.annotation.Nullable
  public Long getUnconnectedContactLogCnt() {
    return unconnectedContactLogCnt;
  }


  public void setUnconnectedContactLogCnt(Long unconnectedContactLogCnt) {
    this.unconnectedContactLogCnt = unconnectedContactLogCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueContactLogOverviewQueryV2ResponseData toolsClueContactLogOverviewQueryV2ResponseData = (ToolsClueContactLogOverviewQueryV2ResponseData) o;
    return Objects.equals(this.connectedAverageDuration, toolsClueContactLogOverviewQueryV2ResponseData.connectedAverageDuration) &&
        Objects.equals(this.connectedContactLogCnt, toolsClueContactLogOverviewQueryV2ResponseData.connectedContactLogCnt) &&
        Objects.equals(this.connectedContactLogRate, toolsClueContactLogOverviewQueryV2ResponseData.connectedContactLogRate) &&
        Objects.equals(this.contactLogCnt, toolsClueContactLogOverviewQueryV2ResponseData.contactLogCnt) &&
        Objects.equals(this.deepTalkClueCnt, toolsClueContactLogOverviewQueryV2ResponseData.deepTalkClueCnt) &&
        Objects.equals(this.deepTalkContactLogCnt, toolsClueContactLogOverviewQueryV2ResponseData.deepTalkContactLogCnt) &&
        Objects.equals(this.totalDuration, toolsClueContactLogOverviewQueryV2ResponseData.totalDuration) &&
        Objects.equals(this.unconnectedAverageTryDuration, toolsClueContactLogOverviewQueryV2ResponseData.unconnectedAverageTryDuration) &&
        Objects.equals(this.unconnectedContactLogCnt, toolsClueContactLogOverviewQueryV2ResponseData.unconnectedContactLogCnt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectedAverageDuration, connectedContactLogCnt, connectedContactLogRate, contactLogCnt, deepTalkClueCnt, deepTalkContactLogCnt, totalDuration, unconnectedAverageTryDuration, unconnectedContactLogCnt);
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
    sb.append("class ToolsClueContactLogOverviewQueryV2ResponseData {\n");
    sb.append("    connectedAverageDuration: ").append(toIndentedString(connectedAverageDuration)).append("\n");
    sb.append("    connectedContactLogCnt: ").append(toIndentedString(connectedContactLogCnt)).append("\n");
    sb.append("    connectedContactLogRate: ").append(toIndentedString(connectedContactLogRate)).append("\n");
    sb.append("    contactLogCnt: ").append(toIndentedString(contactLogCnt)).append("\n");
    sb.append("    deepTalkClueCnt: ").append(toIndentedString(deepTalkClueCnt)).append("\n");
    sb.append("    deepTalkContactLogCnt: ").append(toIndentedString(deepTalkContactLogCnt)).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
    sb.append("    unconnectedAverageTryDuration: ").append(toIndentedString(unconnectedAverageTryDuration)).append("\n");
    sb.append("    unconnectedContactLogCnt: ").append(toIndentedString(unconnectedContactLogCnt)).append("\n");
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
    openapiFields.add("connected_average_duration");
    openapiFields.add("connected_contact_log_cnt");
    openapiFields.add("connected_contact_log_rate");
    openapiFields.add("contact_log_cnt");
    openapiFields.add("deep_talk_clue_cnt");
    openapiFields.add("deep_talk_contact_log_cnt");
    openapiFields.add("total_duration");
    openapiFields.add("unconnected_average_try_duration");
    openapiFields.add("unconnected_contact_log_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueContactLogOverviewQueryV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueContactLogOverviewQueryV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueContactLogOverviewQueryV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueContactLogOverviewQueryV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueContactLogOverviewQueryV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsClueContactLogOverviewQueryV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueContactLogOverviewQueryV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueContactLogOverviewQueryV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueContactLogOverviewQueryV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsClueContactLogOverviewQueryV2ResponseData
  */
  public static ToolsClueContactLogOverviewQueryV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueContactLogOverviewQueryV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsClueContactLogOverviewQueryV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

