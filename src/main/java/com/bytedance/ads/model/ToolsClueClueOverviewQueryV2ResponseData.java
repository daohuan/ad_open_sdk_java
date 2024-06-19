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
public class ToolsClueClueOverviewQueryV2ResponseData {
  public static final String SERIALIZED_NAME_CALLED_CLUE_CNT = "called_clue_cnt";
  @SerializedName(SERIALIZED_NAME_CALLED_CLUE_CNT)
  private Long calledClueCnt = null;

  public static final String SERIALIZED_NAME_CALLED_CLUE_RATE = "called_clue_rate";
  @SerializedName(SERIALIZED_NAME_CALLED_CLUE_RATE)
  private Double calledClueRate = null;

  public static final String SERIALIZED_NAME_CALLED_FOUR_HOUR_CLUE_CNT = "called_four_hour_clue_cnt";
  @SerializedName(SERIALIZED_NAME_CALLED_FOUR_HOUR_CLUE_CNT)
  private Long calledFourHourClueCnt = null;

  public static final String SERIALIZED_NAME_CALLED_FOUR_HOUR_CLUE_RATE = "called_four_hour_clue_rate";
  @SerializedName(SERIALIZED_NAME_CALLED_FOUR_HOUR_CLUE_RATE)
  private Double calledFourHourClueRate = null;

  public static final String SERIALIZED_NAME_CALLED_TODAY_CLUE_CNT = "called_today_clue_cnt";
  @SerializedName(SERIALIZED_NAME_CALLED_TODAY_CLUE_CNT)
  private Long calledTodayClueCnt = null;

  public static final String SERIALIZED_NAME_CLUE_AVERAGE_CALL_INTERVAL = "clue_average_call_interval";
  @SerializedName(SERIALIZED_NAME_CLUE_AVERAGE_CALL_INTERVAL)
  private Double clueAverageCallInterval = null;

  public static final String SERIALIZED_NAME_CLUE_CNT = "clue_cnt";
  @SerializedName(SERIALIZED_NAME_CLUE_CNT)
  private Long clueCnt = null;

  public static final String SERIALIZED_NAME_CONNECTED_CLUE_CNT = "connected_clue_cnt";
  @SerializedName(SERIALIZED_NAME_CONNECTED_CLUE_CNT)
  private Long connectedClueCnt = null;

  public static final String SERIALIZED_NAME_CONNECTED_CLUE_RATE = "connected_clue_rate";
  @SerializedName(SERIALIZED_NAME_CONNECTED_CLUE_RATE)
  private Double connectedClueRate = null;

  public static final String SERIALIZED_NAME_CONNECTED_FOUR_HOUR_CLUE_CNT = "connected_four_hour_clue_cnt";
  @SerializedName(SERIALIZED_NAME_CONNECTED_FOUR_HOUR_CLUE_CNT)
  private Long connectedFourHourClueCnt = null;

  public static final String SERIALIZED_NAME_CONNECTED_FOUR_HOUR_CLUE_RATE = "connected_four_hour_clue_rate";
  @SerializedName(SERIALIZED_NAME_CONNECTED_FOUR_HOUR_CLUE_RATE)
  private Double connectedFourHourClueRate = null;

  public static final String SERIALIZED_NAME_CONNECTED_TODAY_CLUE_CNT = "connected_today_clue_cnt";
  @SerializedName(SERIALIZED_NAME_CONNECTED_TODAY_CLUE_CNT)
  private Long connectedTodayClueCnt = null;

  public static final String SERIALIZED_NAME_UNCONNECTED_CLUE_AVERAGE_CALL_TIMES = "unconnected_clue_average_call_times";
  @SerializedName(SERIALIZED_NAME_UNCONNECTED_CLUE_AVERAGE_CALL_TIMES)
  private Double unconnectedClueAverageCallTimes = null;

  public static final String SERIALIZED_NAME_UNCONNECTED_ONE_CALL_CLUE_CNT = "unconnected_one_call_clue_cnt";
  @SerializedName(SERIALIZED_NAME_UNCONNECTED_ONE_CALL_CLUE_CNT)
  private Long unconnectedOneCallClueCnt = null;

  public ToolsClueClueOverviewQueryV2ResponseData() {
  }

  public ToolsClueClueOverviewQueryV2ResponseData calledClueCnt(Long calledClueCnt) {
    
    this.calledClueCnt = calledClueCnt;
    return this;
  }

   /**
   * 拨打线索量。时间粒度为线索创建时间。
   * @return calledClueCnt
  **/
  @javax.annotation.Nullable
  public Long getCalledClueCnt() {
    return calledClueCnt;
  }


  public void setCalledClueCnt(Long calledClueCnt) {
    this.calledClueCnt = calledClueCnt;
  }


  public ToolsClueClueOverviewQueryV2ResponseData calledClueRate(Double calledClueRate) {
    
    this.calledClueRate = calledClueRate;
    return this;
  }

   /**
   * 线索拨打率。时间粒度为线索创建时间。
   * @return calledClueRate
  **/
  @javax.annotation.Nullable
  public Double getCalledClueRate() {
    return calledClueRate;
  }


  public void setCalledClueRate(Double calledClueRate) {
    this.calledClueRate = calledClueRate;
  }


  public ToolsClueClueOverviewQueryV2ResponseData calledFourHourClueCnt(Long calledFourHourClueCnt) {
    
    this.calledFourHourClueCnt = calledFourHourClueCnt;
    return this;
  }

   /**
   * 落入4h内拨打线索量。时间粒度为线索创建时间与话单创建时间。
   * @return calledFourHourClueCnt
  **/
  @javax.annotation.Nullable
  public Long getCalledFourHourClueCnt() {
    return calledFourHourClueCnt;
  }


  public void setCalledFourHourClueCnt(Long calledFourHourClueCnt) {
    this.calledFourHourClueCnt = calledFourHourClueCnt;
  }


  public ToolsClueClueOverviewQueryV2ResponseData calledFourHourClueRate(Double calledFourHourClueRate) {
    
    this.calledFourHourClueRate = calledFourHourClueRate;
    return this;
  }

   /**
   * 4h线索拨打率。时间粒度为线索创建时间与话单创建时间。
   * @return calledFourHourClueRate
  **/
  @javax.annotation.Nullable
  public Double getCalledFourHourClueRate() {
    return calledFourHourClueRate;
  }


  public void setCalledFourHourClueRate(Double calledFourHourClueRate) {
    this.calledFourHourClueRate = calledFourHourClueRate;
  }


  public ToolsClueClueOverviewQueryV2ResponseData calledTodayClueCnt(Long calledTodayClueCnt) {
    
    this.calledTodayClueCnt = calledTodayClueCnt;
    return this;
  }

   /**
   * 当天落入并拨打线索量。时间粒度为线索创建时间与话单创建时间。
   * @return calledTodayClueCnt
  **/
  @javax.annotation.Nullable
  public Long getCalledTodayClueCnt() {
    return calledTodayClueCnt;
  }


  public void setCalledTodayClueCnt(Long calledTodayClueCnt) {
    this.calledTodayClueCnt = calledTodayClueCnt;
  }


  public ToolsClueClueOverviewQueryV2ResponseData clueAverageCallInterval(Double clueAverageCallInterval) {
    
    this.clueAverageCallInterval = clueAverageCallInterval;
    return this;
  }

   /**
   * 线索平均跟进时效。时间粒度为线索创建时间。
   * @return clueAverageCallInterval
  **/
  @javax.annotation.Nullable
  public Double getClueAverageCallInterval() {
    return clueAverageCallInterval;
  }


  public void setClueAverageCallInterval(Double clueAverageCallInterval) {
    this.clueAverageCallInterval = clueAverageCallInterval;
  }


  public ToolsClueClueOverviewQueryV2ResponseData clueCnt(Long clueCnt) {
    
    this.clueCnt = clueCnt;
    return this;
  }

   /**
   * 落入线索量。时间粒度为线索创建时间。
   * @return clueCnt
  **/
  @javax.annotation.Nullable
  public Long getClueCnt() {
    return clueCnt;
  }


  public void setClueCnt(Long clueCnt) {
    this.clueCnt = clueCnt;
  }


  public ToolsClueClueOverviewQueryV2ResponseData connectedClueCnt(Long connectedClueCnt) {
    
    this.connectedClueCnt = connectedClueCnt;
    return this;
  }

   /**
   * 接通线索量。时间粒度为线索创建时间。
   * @return connectedClueCnt
  **/
  @javax.annotation.Nullable
  public Long getConnectedClueCnt() {
    return connectedClueCnt;
  }


  public void setConnectedClueCnt(Long connectedClueCnt) {
    this.connectedClueCnt = connectedClueCnt;
  }


  public ToolsClueClueOverviewQueryV2ResponseData connectedClueRate(Double connectedClueRate) {
    
    this.connectedClueRate = connectedClueRate;
    return this;
  }

   /**
   * 线索接通率。时间粒度为线索创建时间。
   * @return connectedClueRate
  **/
  @javax.annotation.Nullable
  public Double getConnectedClueRate() {
    return connectedClueRate;
  }


  public void setConnectedClueRate(Double connectedClueRate) {
    this.connectedClueRate = connectedClueRate;
  }


  public ToolsClueClueOverviewQueryV2ResponseData connectedFourHourClueCnt(Long connectedFourHourClueCnt) {
    
    this.connectedFourHourClueCnt = connectedFourHourClueCnt;
    return this;
  }

   /**
   * 落入4h内拨打且接通线索量。时间粒度为线索创建时间与话单创建时间。
   * @return connectedFourHourClueCnt
  **/
  @javax.annotation.Nullable
  public Long getConnectedFourHourClueCnt() {
    return connectedFourHourClueCnt;
  }


  public void setConnectedFourHourClueCnt(Long connectedFourHourClueCnt) {
    this.connectedFourHourClueCnt = connectedFourHourClueCnt;
  }


  public ToolsClueClueOverviewQueryV2ResponseData connectedFourHourClueRate(Double connectedFourHourClueRate) {
    
    this.connectedFourHourClueRate = connectedFourHourClueRate;
    return this;
  }

   /**
   * 4h线索接通率。时间粒度为线索创建时间与话单创建时间。
   * @return connectedFourHourClueRate
  **/
  @javax.annotation.Nullable
  public Double getConnectedFourHourClueRate() {
    return connectedFourHourClueRate;
  }


  public void setConnectedFourHourClueRate(Double connectedFourHourClueRate) {
    this.connectedFourHourClueRate = connectedFourHourClueRate;
  }


  public ToolsClueClueOverviewQueryV2ResponseData connectedTodayClueCnt(Long connectedTodayClueCnt) {
    
    this.connectedTodayClueCnt = connectedTodayClueCnt;
    return this;
  }

   /**
   * 当天落入并拨打且接通线索量。时间粒度为线索创建时间与话单创建时间。
   * @return connectedTodayClueCnt
  **/
  @javax.annotation.Nullable
  public Long getConnectedTodayClueCnt() {
    return connectedTodayClueCnt;
  }


  public void setConnectedTodayClueCnt(Long connectedTodayClueCnt) {
    this.connectedTodayClueCnt = connectedTodayClueCnt;
  }


  public ToolsClueClueOverviewQueryV2ResponseData unconnectedClueAverageCallTimes(Double unconnectedClueAverageCallTimes) {
    
    this.unconnectedClueAverageCallTimes = unconnectedClueAverageCallTimes;
    return this;
  }

   /**
   * 未接通线索平均拨打轮次。时间粒度为线索创建时间。
   * @return unconnectedClueAverageCallTimes
  **/
  @javax.annotation.Nullable
  public Double getUnconnectedClueAverageCallTimes() {
    return unconnectedClueAverageCallTimes;
  }


  public void setUnconnectedClueAverageCallTimes(Double unconnectedClueAverageCallTimes) {
    this.unconnectedClueAverageCallTimes = unconnectedClueAverageCallTimes;
  }


  public ToolsClueClueOverviewQueryV2ResponseData unconnectedOneCallClueCnt(Long unconnectedOneCallClueCnt) {
    
    this.unconnectedOneCallClueCnt = unconnectedOneCallClueCnt;
    return this;
  }

   /**
   * 拨打一次且未接通线索量。时间粒度为线索创建时间。
   * @return unconnectedOneCallClueCnt
  **/
  @javax.annotation.Nullable
  public Long getUnconnectedOneCallClueCnt() {
    return unconnectedOneCallClueCnt;
  }


  public void setUnconnectedOneCallClueCnt(Long unconnectedOneCallClueCnt) {
    this.unconnectedOneCallClueCnt = unconnectedOneCallClueCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueClueOverviewQueryV2ResponseData toolsClueClueOverviewQueryV2ResponseData = (ToolsClueClueOverviewQueryV2ResponseData) o;
    return Objects.equals(this.calledClueCnt, toolsClueClueOverviewQueryV2ResponseData.calledClueCnt) &&
        Objects.equals(this.calledClueRate, toolsClueClueOverviewQueryV2ResponseData.calledClueRate) &&
        Objects.equals(this.calledFourHourClueCnt, toolsClueClueOverviewQueryV2ResponseData.calledFourHourClueCnt) &&
        Objects.equals(this.calledFourHourClueRate, toolsClueClueOverviewQueryV2ResponseData.calledFourHourClueRate) &&
        Objects.equals(this.calledTodayClueCnt, toolsClueClueOverviewQueryV2ResponseData.calledTodayClueCnt) &&
        Objects.equals(this.clueAverageCallInterval, toolsClueClueOverviewQueryV2ResponseData.clueAverageCallInterval) &&
        Objects.equals(this.clueCnt, toolsClueClueOverviewQueryV2ResponseData.clueCnt) &&
        Objects.equals(this.connectedClueCnt, toolsClueClueOverviewQueryV2ResponseData.connectedClueCnt) &&
        Objects.equals(this.connectedClueRate, toolsClueClueOverviewQueryV2ResponseData.connectedClueRate) &&
        Objects.equals(this.connectedFourHourClueCnt, toolsClueClueOverviewQueryV2ResponseData.connectedFourHourClueCnt) &&
        Objects.equals(this.connectedFourHourClueRate, toolsClueClueOverviewQueryV2ResponseData.connectedFourHourClueRate) &&
        Objects.equals(this.connectedTodayClueCnt, toolsClueClueOverviewQueryV2ResponseData.connectedTodayClueCnt) &&
        Objects.equals(this.unconnectedClueAverageCallTimes, toolsClueClueOverviewQueryV2ResponseData.unconnectedClueAverageCallTimes) &&
        Objects.equals(this.unconnectedOneCallClueCnt, toolsClueClueOverviewQueryV2ResponseData.unconnectedOneCallClueCnt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(calledClueCnt, calledClueRate, calledFourHourClueCnt, calledFourHourClueRate, calledTodayClueCnt, clueAverageCallInterval, clueCnt, connectedClueCnt, connectedClueRate, connectedFourHourClueCnt, connectedFourHourClueRate, connectedTodayClueCnt, unconnectedClueAverageCallTimes, unconnectedOneCallClueCnt);
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
    sb.append("class ToolsClueClueOverviewQueryV2ResponseData {\n");
    sb.append("    calledClueCnt: ").append(toIndentedString(calledClueCnt)).append("\n");
    sb.append("    calledClueRate: ").append(toIndentedString(calledClueRate)).append("\n");
    sb.append("    calledFourHourClueCnt: ").append(toIndentedString(calledFourHourClueCnt)).append("\n");
    sb.append("    calledFourHourClueRate: ").append(toIndentedString(calledFourHourClueRate)).append("\n");
    sb.append("    calledTodayClueCnt: ").append(toIndentedString(calledTodayClueCnt)).append("\n");
    sb.append("    clueAverageCallInterval: ").append(toIndentedString(clueAverageCallInterval)).append("\n");
    sb.append("    clueCnt: ").append(toIndentedString(clueCnt)).append("\n");
    sb.append("    connectedClueCnt: ").append(toIndentedString(connectedClueCnt)).append("\n");
    sb.append("    connectedClueRate: ").append(toIndentedString(connectedClueRate)).append("\n");
    sb.append("    connectedFourHourClueCnt: ").append(toIndentedString(connectedFourHourClueCnt)).append("\n");
    sb.append("    connectedFourHourClueRate: ").append(toIndentedString(connectedFourHourClueRate)).append("\n");
    sb.append("    connectedTodayClueCnt: ").append(toIndentedString(connectedTodayClueCnt)).append("\n");
    sb.append("    unconnectedClueAverageCallTimes: ").append(toIndentedString(unconnectedClueAverageCallTimes)).append("\n");
    sb.append("    unconnectedOneCallClueCnt: ").append(toIndentedString(unconnectedOneCallClueCnt)).append("\n");
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
    openapiFields.add("called_clue_cnt");
    openapiFields.add("called_clue_rate");
    openapiFields.add("called_four_hour_clue_cnt");
    openapiFields.add("called_four_hour_clue_rate");
    openapiFields.add("called_today_clue_cnt");
    openapiFields.add("clue_average_call_interval");
    openapiFields.add("clue_cnt");
    openapiFields.add("connected_clue_cnt");
    openapiFields.add("connected_clue_rate");
    openapiFields.add("connected_four_hour_clue_cnt");
    openapiFields.add("connected_four_hour_clue_rate");
    openapiFields.add("connected_today_clue_cnt");
    openapiFields.add("unconnected_clue_average_call_times");
    openapiFields.add("unconnected_one_call_clue_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueClueOverviewQueryV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueClueOverviewQueryV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueClueOverviewQueryV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueClueOverviewQueryV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueClueOverviewQueryV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsClueClueOverviewQueryV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueClueOverviewQueryV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueClueOverviewQueryV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueClueOverviewQueryV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsClueClueOverviewQueryV2ResponseData
  */
  public static ToolsClueClueOverviewQueryV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueClueOverviewQueryV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsClueClueOverviewQueryV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

