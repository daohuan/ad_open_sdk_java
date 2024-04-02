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
import com.bytedance.ads.model.QianchuanAdCreateV10DeliverySettingBudgetMode;
import com.bytedance.ads.model.QianchuanAdCreateV10DeliverySettingDeepBidType;
import com.bytedance.ads.model.QianchuanAdCreateV10DeliverySettingDeepExternalAction;
import com.bytedance.ads.model.QianchuanAdCreateV10DeliverySettingExternalAction;
import com.bytedance.ads.model.QianchuanAdCreateV10DeliverySettingLiveScheduleType;
import com.bytedance.ads.model.QianchuanAdCreateV10DeliverySettingQcpxMode;
import com.bytedance.ads.model.QianchuanAdCreateV10DeliverySettingSmartBidType;
import com.bytedance.ads.model.QianchuanAdCreateV10DeliverySettingVideoScheduleType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class QianchuanAdCreateV10RequestDeliverySetting {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private QianchuanAdCreateV10DeliverySettingBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_BID_TYPE = "deep_bid_type";
  @SerializedName(SERIALIZED_NAME_DEEP_BID_TYPE)
  private QianchuanAdCreateV10DeliverySettingDeepBidType deepBidType = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private QianchuanAdCreateV10DeliverySettingDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private QianchuanAdCreateV10DeliverySettingExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_GRAB_FIRST_SCREEN_BID_ADJUST_RATE = "grab_first_screen_bid_adjust_rate";
  @SerializedName(SERIALIZED_NAME_GRAB_FIRST_SCREEN_BID_ADJUST_RATE)
  private Long grabFirstScreenBidAdjustRate = null;

  public static final String SERIALIZED_NAME_GRAB_FIRST_SCREEN_SWITCH = "grab_first_screen_switch";
  @SerializedName(SERIALIZED_NAME_GRAB_FIRST_SCREEN_SWITCH)
  private Boolean grabFirstScreenSwitch = null;

  public static final String SERIALIZED_NAME_LIVE_SCHEDULE_TYPE = "live_schedule_type";
  @SerializedName(SERIALIZED_NAME_LIVE_SCHEDULE_TYPE)
  private QianchuanAdCreateV10DeliverySettingLiveScheduleType liveScheduleType = null;

  public static final String SERIALIZED_NAME_PRODUCT_NEW_OPEN = "product_new_open";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NEW_OPEN)
  private Boolean productNewOpen = null;

  public static final String SERIALIZED_NAME_QCPX_MODE = "qcpx_mode";
  @SerializedName(SERIALIZED_NAME_QCPX_MODE)
  private QianchuanAdCreateV10DeliverySettingQcpxMode qcpxMode = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_FIXED_RANGE = "schedule_fixed_range";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_FIXED_RANGE)
  private Long scheduleFixedRange = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private QianchuanAdCreateV10DeliverySettingSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE = "video_schedule_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE)
  private QianchuanAdCreateV10DeliverySettingVideoScheduleType videoScheduleType = null;

  public QianchuanAdCreateV10RequestDeliverySetting() {
  }

  public QianchuanAdCreateV10RequestDeliverySetting budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public QianchuanAdCreateV10RequestDeliverySetting budgetMode(QianchuanAdCreateV10DeliverySettingBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nonnull
  public QianchuanAdCreateV10DeliverySettingBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(QianchuanAdCreateV10DeliverySettingBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public QianchuanAdCreateV10RequestDeliverySetting cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public QianchuanAdCreateV10RequestDeliverySetting deepBidType(QianchuanAdCreateV10DeliverySettingDeepBidType deepBidType) {
    
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10DeliverySettingDeepBidType getDeepBidType() {
    return deepBidType;
  }


  public void setDeepBidType(QianchuanAdCreateV10DeliverySettingDeepBidType deepBidType) {
    this.deepBidType = deepBidType;
  }


  public QianchuanAdCreateV10RequestDeliverySetting deepExternalAction(QianchuanAdCreateV10DeliverySettingDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10DeliverySettingDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(QianchuanAdCreateV10DeliverySettingDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public QianchuanAdCreateV10RequestDeliverySetting endTime(String endTime) {
    
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


  public QianchuanAdCreateV10RequestDeliverySetting externalAction(QianchuanAdCreateV10DeliverySettingExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nonnull
  public QianchuanAdCreateV10DeliverySettingExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(QianchuanAdCreateV10DeliverySettingExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public QianchuanAdCreateV10RequestDeliverySetting grabFirstScreenBidAdjustRate(Long grabFirstScreenBidAdjustRate) {
    
    this.grabFirstScreenBidAdjustRate = grabFirstScreenBidAdjustRate;
    return this;
  }

   /**
   * 抢首屏ROI目标降低幅度
   * @return grabFirstScreenBidAdjustRate
  **/
  @javax.annotation.Nullable
  public Long getGrabFirstScreenBidAdjustRate() {
    return grabFirstScreenBidAdjustRate;
  }


  public void setGrabFirstScreenBidAdjustRate(Long grabFirstScreenBidAdjustRate) {
    this.grabFirstScreenBidAdjustRate = grabFirstScreenBidAdjustRate;
  }


  public QianchuanAdCreateV10RequestDeliverySetting grabFirstScreenSwitch(Boolean grabFirstScreenSwitch) {
    
    this.grabFirstScreenSwitch = grabFirstScreenSwitch;
    return this;
  }

   /**
   * 抢首屏开关
   * @return grabFirstScreenSwitch
  **/
  @javax.annotation.Nullable
  public Boolean getGrabFirstScreenSwitch() {
    return grabFirstScreenSwitch;
  }


  public void setGrabFirstScreenSwitch(Boolean grabFirstScreenSwitch) {
    this.grabFirstScreenSwitch = grabFirstScreenSwitch;
  }


  public QianchuanAdCreateV10RequestDeliverySetting liveScheduleType(QianchuanAdCreateV10DeliverySettingLiveScheduleType liveScheduleType) {
    
    this.liveScheduleType = liveScheduleType;
    return this;
  }

   /**
   * Get liveScheduleType
   * @return liveScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10DeliverySettingLiveScheduleType getLiveScheduleType() {
    return liveScheduleType;
  }


  public void setLiveScheduleType(QianchuanAdCreateV10DeliverySettingLiveScheduleType liveScheduleType) {
    this.liveScheduleType = liveScheduleType;
  }


  public QianchuanAdCreateV10RequestDeliverySetting productNewOpen(Boolean productNewOpen) {
    
    this.productNewOpen = productNewOpen;
    return this;
  }

   /**
   * 
   * @return productNewOpen
  **/
  @javax.annotation.Nullable
  public Boolean getProductNewOpen() {
    return productNewOpen;
  }


  public void setProductNewOpen(Boolean productNewOpen) {
    this.productNewOpen = productNewOpen;
  }


  public QianchuanAdCreateV10RequestDeliverySetting qcpxMode(QianchuanAdCreateV10DeliverySettingQcpxMode qcpxMode) {
    
    this.qcpxMode = qcpxMode;
    return this;
  }

   /**
   * Get qcpxMode
   * @return qcpxMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10DeliverySettingQcpxMode getQcpxMode() {
    return qcpxMode;
  }


  public void setQcpxMode(QianchuanAdCreateV10DeliverySettingQcpxMode qcpxMode) {
    this.qcpxMode = qcpxMode;
  }


  public QianchuanAdCreateV10RequestDeliverySetting roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }


  public QianchuanAdCreateV10RequestDeliverySetting scheduleFixedRange(Long scheduleFixedRange) {
    
    this.scheduleFixedRange = scheduleFixedRange;
    return this;
  }

   /**
   * 
   * minimum: 1800
   * maximum: 86400
   * @return scheduleFixedRange
  **/
  @javax.annotation.Nullable
  public Long getScheduleFixedRange() {
    return scheduleFixedRange;
  }


  public void setScheduleFixedRange(Long scheduleFixedRange) {
    this.scheduleFixedRange = scheduleFixedRange;
  }


  public QianchuanAdCreateV10RequestDeliverySetting scheduleTime(String scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * 
   * @return scheduleTime
  **/
  @javax.annotation.Nullable
  public String getScheduleTime() {
    return scheduleTime;
  }


  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }


  public QianchuanAdCreateV10RequestDeliverySetting smartBidType(QianchuanAdCreateV10DeliverySettingSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nonnull
  public QianchuanAdCreateV10DeliverySettingSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(QianchuanAdCreateV10DeliverySettingSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public QianchuanAdCreateV10RequestDeliverySetting startTime(String startTime) {
    
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


  public QianchuanAdCreateV10RequestDeliverySetting videoScheduleType(QianchuanAdCreateV10DeliverySettingVideoScheduleType videoScheduleType) {
    
    this.videoScheduleType = videoScheduleType;
    return this;
  }

   /**
   * Get videoScheduleType
   * @return videoScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10DeliverySettingVideoScheduleType getVideoScheduleType() {
    return videoScheduleType;
  }


  public void setVideoScheduleType(QianchuanAdCreateV10DeliverySettingVideoScheduleType videoScheduleType) {
    this.videoScheduleType = videoScheduleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestDeliverySetting qianchuanAdCreateV10RequestDeliverySetting = (QianchuanAdCreateV10RequestDeliverySetting) o;
    return Objects.equals(this.budget, qianchuanAdCreateV10RequestDeliverySetting.budget) &&
        Objects.equals(this.budgetMode, qianchuanAdCreateV10RequestDeliverySetting.budgetMode) &&
        Objects.equals(this.cpaBid, qianchuanAdCreateV10RequestDeliverySetting.cpaBid) &&
        Objects.equals(this.deepBidType, qianchuanAdCreateV10RequestDeliverySetting.deepBidType) &&
        Objects.equals(this.deepExternalAction, qianchuanAdCreateV10RequestDeliverySetting.deepExternalAction) &&
        Objects.equals(this.endTime, qianchuanAdCreateV10RequestDeliverySetting.endTime) &&
        Objects.equals(this.externalAction, qianchuanAdCreateV10RequestDeliverySetting.externalAction) &&
        Objects.equals(this.grabFirstScreenBidAdjustRate, qianchuanAdCreateV10RequestDeliverySetting.grabFirstScreenBidAdjustRate) &&
        Objects.equals(this.grabFirstScreenSwitch, qianchuanAdCreateV10RequestDeliverySetting.grabFirstScreenSwitch) &&
        Objects.equals(this.liveScheduleType, qianchuanAdCreateV10RequestDeliverySetting.liveScheduleType) &&
        Objects.equals(this.productNewOpen, qianchuanAdCreateV10RequestDeliverySetting.productNewOpen) &&
        Objects.equals(this.qcpxMode, qianchuanAdCreateV10RequestDeliverySetting.qcpxMode) &&
        Objects.equals(this.roiGoal, qianchuanAdCreateV10RequestDeliverySetting.roiGoal) &&
        Objects.equals(this.scheduleFixedRange, qianchuanAdCreateV10RequestDeliverySetting.scheduleFixedRange) &&
        Objects.equals(this.scheduleTime, qianchuanAdCreateV10RequestDeliverySetting.scheduleTime) &&
        Objects.equals(this.smartBidType, qianchuanAdCreateV10RequestDeliverySetting.smartBidType) &&
        Objects.equals(this.startTime, qianchuanAdCreateV10RequestDeliverySetting.startTime) &&
        Objects.equals(this.videoScheduleType, qianchuanAdCreateV10RequestDeliverySetting.videoScheduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetMode, cpaBid, deepBidType, deepExternalAction, endTime, externalAction, grabFirstScreenBidAdjustRate, grabFirstScreenSwitch, liveScheduleType, productNewOpen, qcpxMode, roiGoal, scheduleFixedRange, scheduleTime, smartBidType, startTime, videoScheduleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestDeliverySetting {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    grabFirstScreenBidAdjustRate: ").append(toIndentedString(grabFirstScreenBidAdjustRate)).append("\n");
    sb.append("    grabFirstScreenSwitch: ").append(toIndentedString(grabFirstScreenSwitch)).append("\n");
    sb.append("    liveScheduleType: ").append(toIndentedString(liveScheduleType)).append("\n");
    sb.append("    productNewOpen: ").append(toIndentedString(productNewOpen)).append("\n");
    sb.append("    qcpxMode: ").append(toIndentedString(qcpxMode)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleFixedRange: ").append(toIndentedString(scheduleFixedRange)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
    sb.append("    smartBidType: ").append(toIndentedString(smartBidType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    videoScheduleType: ").append(toIndentedString(videoScheduleType)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("cpa_bid");
    openapiFields.add("deep_bid_type");
    openapiFields.add("deep_external_action");
    openapiFields.add("end_time");
    openapiFields.add("external_action");
    openapiFields.add("grab_first_screen_bid_adjust_rate");
    openapiFields.add("grab_first_screen_switch");
    openapiFields.add("live_schedule_type");
    openapiFields.add("product_new_open");
    openapiFields.add("qcpx_mode");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_fixed_range");
    openapiFields.add("schedule_time");
    openapiFields.add("smart_bid_type");
    openapiFields.add("start_time");
    openapiFields.add("video_schedule_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("budget_mode");
    openapiRequiredFields.add("external_action");
    openapiRequiredFields.add("smart_bid_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestDeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestDeliverySetting
  */
  public static QianchuanAdCreateV10RequestDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestDeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

