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
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoAdTarget;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoAppType;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoDeepBidType;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoDeepExternalAction;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoDownloadMode;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoDownloadType;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoExternalAction;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoScheduleType;
import com.bytedance.ads.model.AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience;
import com.bytedance.ads.model.AdlabGroupListV30ResponseDataGroupsInnerAdInfoDeliveryRange;
import com.bytedance.ads.model.AdlabGroupListV30ResponseDataGroupsInnerAdInfoTrackUrlSetting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 广告计划维度信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class AdlabGroupListV30ResponseDataGroupsInnerAdInfo {
  public static final String SERIALIZED_NAME_AD_TARGET = "ad_target";
  @SerializedName(SERIALIZED_NAME_AD_TARGET)
  private AdlabGroupListV30DataGroupsAdInfoAdTarget adTarget = null;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private AdlabGroupListV30DataGroupsAdInfoAppType appType = null;

  public static final String SERIALIZED_NAME_ASSETS_IDS = "assets_ids";
  @SerializedName(SERIALIZED_NAME_ASSETS_IDS)
  private List<Long> assetsIds = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience audience = null;

  public static final String SERIALIZED_NAME_CONVERT_ID = "convert_id";
  @SerializedName(SERIALIZED_NAME_CONVERT_ID)
  private Long convertId = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_BID_TYPE = "deep_bid_type";
  @SerializedName(SERIALIZED_NAME_DEEP_BID_TYPE)
  private AdlabGroupListV30DataGroupsAdInfoDeepBidType deepBidType = null;

  public static final String SERIALIZED_NAME_DEEP_CPA_BID = "deep_cpa_bid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPA_BID)
  private Double deepCpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private AdlabGroupListV30DataGroupsAdInfoDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_DELIVERY_RANGE = "delivery_range";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RANGE)
  private AdlabGroupListV30ResponseDataGroupsInnerAdInfoDeliveryRange deliveryRange = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_MODE = "download_mode";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_MODE)
  private AdlabGroupListV30DataGroupsAdInfoDownloadMode downloadMode = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_TYPE = "download_type";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_TYPE)
  private AdlabGroupListV30DataGroupsAdInfoDownloadType downloadType = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private AdlabGroupListV30DataGroupsAdInfoExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private String _package = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private AdlabGroupListV30DataGroupsAdInfoScheduleType scheduleType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_TRACK_URL_SETTING = "track_url_setting";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_SETTING)
  private AdlabGroupListV30ResponseDataGroupsInnerAdInfoTrackUrlSetting trackUrlSetting = null;

  public static final String SERIALIZED_NAME_WEEK_SCHEDULE = "week_schedule";
  @SerializedName(SERIALIZED_NAME_WEEK_SCHEDULE)
  private List<List<Long>> weekSchedule = null;

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo() {
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo adTarget(AdlabGroupListV30DataGroupsAdInfoAdTarget adTarget) {
    
    this.adTarget = adTarget;
    return this;
  }

   /**
   * Get adTarget
   * @return adTarget
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoAdTarget getAdTarget() {
    return adTarget;
  }


  public void setAdTarget(AdlabGroupListV30DataGroupsAdInfoAdTarget adTarget) {
    this.adTarget = adTarget;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo appType(AdlabGroupListV30DataGroupsAdInfoAppType appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoAppType getAppType() {
    return appType;
  }


  public void setAppType(AdlabGroupListV30DataGroupsAdInfoAppType appType) {
    this.appType = appType;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo assetsIds(List<Long> assetsIds) {
    
    this.assetsIds = assetsIds;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo addAssetsIdsItem(Long assetsIdsItem) {
    if (this.assetsIds == null) {
      this.assetsIds = new ArrayList<>();
    }
    this.assetsIds.add(assetsIdsItem);
    return this;
  }

   /**
   * 资产id
   * @return assetsIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAssetsIds() {
    return assetsIds;
  }


  public void setAssetsIds(List<Long> assetsIds) {
    this.assetsIds = assetsIds;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo audience(AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience getAudience() {
    return audience;
  }


  public void setAudience(AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience audience) {
    this.audience = audience;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo convertId(Long convertId) {
    
    this.convertId = convertId;
    return this;
  }

   /**
   * 自定义转化目标
   * @return convertId
  **/
  @javax.annotation.Nullable
  public Long getConvertId() {
    return convertId;
  }


  public void setConvertId(Long convertId) {
    this.convertId = convertId;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 目标转化出价
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo deepBidType(AdlabGroupListV30DataGroupsAdInfoDeepBidType deepBidType) {
    
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoDeepBidType getDeepBidType() {
    return deepBidType;
  }


  public void setDeepBidType(AdlabGroupListV30DataGroupsAdInfoDeepBidType deepBidType) {
    this.deepBidType = deepBidType;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo deepCpaBid(Double deepCpaBid) {
    
    this.deepCpaBid = deepCpaBid;
    return this;
  }

   /**
   * 深度优化出价
   * @return deepCpaBid
  **/
  @javax.annotation.Nullable
  public Double getDeepCpaBid() {
    return deepCpaBid;
  }


  public void setDeepCpaBid(Double deepCpaBid) {
    this.deepCpaBid = deepCpaBid;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo deepExternalAction(AdlabGroupListV30DataGroupsAdInfoDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(AdlabGroupListV30DataGroupsAdInfoDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo deliveryRange(AdlabGroupListV30ResponseDataGroupsInnerAdInfoDeliveryRange deliveryRange) {
    
    this.deliveryRange = deliveryRange;
    return this;
  }

   /**
   * Get deliveryRange
   * @return deliveryRange
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoDeliveryRange getDeliveryRange() {
    return deliveryRange;
  }


  public void setDeliveryRange(AdlabGroupListV30ResponseDataGroupsInnerAdInfoDeliveryRange deliveryRange) {
    this.deliveryRange = deliveryRange;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo downloadMode(AdlabGroupListV30DataGroupsAdInfoDownloadMode downloadMode) {
    
    this.downloadMode = downloadMode;
    return this;
  }

   /**
   * Get downloadMode
   * @return downloadMode
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoDownloadMode getDownloadMode() {
    return downloadMode;
  }


  public void setDownloadMode(AdlabGroupListV30DataGroupsAdInfoDownloadMode downloadMode) {
    this.downloadMode = downloadMode;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo downloadType(AdlabGroupListV30DataGroupsAdInfoDownloadType downloadType) {
    
    this.downloadType = downloadType;
    return this;
  }

   /**
   * Get downloadType
   * @return downloadType
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoDownloadType getDownloadType() {
    return downloadType;
  }


  public void setDownloadType(AdlabGroupListV30DataGroupsAdInfoDownloadType downloadType) {
    this.downloadType = downloadType;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 下载链接
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 投放结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo externalAction(AdlabGroupListV30DataGroupsAdInfoExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(AdlabGroupListV30DataGroupsAdInfoExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 直达链接
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo _package(String _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * 应用包名
   * @return _package
  **/
  @javax.annotation.Nullable
  public String getPackage() {
    return _package;
  }


  public void setPackage(String _package) {
    this._package = _package;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 深度转化ROI系数
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo scheduleType(AdlabGroupListV30DataGroupsAdInfoScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(AdlabGroupListV30DataGroupsAdInfoScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 投放起始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo trackUrlSetting(AdlabGroupListV30ResponseDataGroupsInnerAdInfoTrackUrlSetting trackUrlSetting) {
    
    this.trackUrlSetting = trackUrlSetting;
    return this;
  }

   /**
   * Get trackUrlSetting
   * @return trackUrlSetting
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoTrackUrlSetting getTrackUrlSetting() {
    return trackUrlSetting;
  }


  public void setTrackUrlSetting(AdlabGroupListV30ResponseDataGroupsInnerAdInfoTrackUrlSetting trackUrlSetting) {
    this.trackUrlSetting = trackUrlSetting;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo weekSchedule(List<List<Long>> weekSchedule) {
    
    this.weekSchedule = weekSchedule;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo addWeekScheduleItem(List<Long> weekScheduleItem) {
    if (this.weekSchedule == null) {
      this.weekSchedule = new ArrayList<>();
    }
    this.weekSchedule.add(weekScheduleItem);
    return this;
  }

   /**
   * 投放时段
   * @return weekSchedule
  **/
  @javax.annotation.Nullable
  public List<List<Long>> getWeekSchedule() {
    return weekSchedule;
  }


  public void setWeekSchedule(List<List<Long>> weekSchedule) {
    this.weekSchedule = weekSchedule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupListV30ResponseDataGroupsInnerAdInfo adlabGroupListV30ResponseDataGroupsInnerAdInfo = (AdlabGroupListV30ResponseDataGroupsInnerAdInfo) o;
    return Objects.equals(this.adTarget, adlabGroupListV30ResponseDataGroupsInnerAdInfo.adTarget) &&
        Objects.equals(this.appType, adlabGroupListV30ResponseDataGroupsInnerAdInfo.appType) &&
        Objects.equals(this.assetsIds, adlabGroupListV30ResponseDataGroupsInnerAdInfo.assetsIds) &&
        Objects.equals(this.audience, adlabGroupListV30ResponseDataGroupsInnerAdInfo.audience) &&
        Objects.equals(this.convertId, adlabGroupListV30ResponseDataGroupsInnerAdInfo.convertId) &&
        Objects.equals(this.cpaBid, adlabGroupListV30ResponseDataGroupsInnerAdInfo.cpaBid) &&
        Objects.equals(this.deepBidType, adlabGroupListV30ResponseDataGroupsInnerAdInfo.deepBidType) &&
        Objects.equals(this.deepCpaBid, adlabGroupListV30ResponseDataGroupsInnerAdInfo.deepCpaBid) &&
        Objects.equals(this.deepExternalAction, adlabGroupListV30ResponseDataGroupsInnerAdInfo.deepExternalAction) &&
        Objects.equals(this.deliveryRange, adlabGroupListV30ResponseDataGroupsInnerAdInfo.deliveryRange) &&
        Objects.equals(this.downloadMode, adlabGroupListV30ResponseDataGroupsInnerAdInfo.downloadMode) &&
        Objects.equals(this.downloadType, adlabGroupListV30ResponseDataGroupsInnerAdInfo.downloadType) &&
        Objects.equals(this.downloadUrl, adlabGroupListV30ResponseDataGroupsInnerAdInfo.downloadUrl) &&
        Objects.equals(this.endTime, adlabGroupListV30ResponseDataGroupsInnerAdInfo.endTime) &&
        Objects.equals(this.externalAction, adlabGroupListV30ResponseDataGroupsInnerAdInfo.externalAction) &&
        Objects.equals(this.openUrl, adlabGroupListV30ResponseDataGroupsInnerAdInfo.openUrl) &&
        Objects.equals(this._package, adlabGroupListV30ResponseDataGroupsInnerAdInfo._package) &&
        Objects.equals(this.roiGoal, adlabGroupListV30ResponseDataGroupsInnerAdInfo.roiGoal) &&
        Objects.equals(this.scheduleType, adlabGroupListV30ResponseDataGroupsInnerAdInfo.scheduleType) &&
        Objects.equals(this.startTime, adlabGroupListV30ResponseDataGroupsInnerAdInfo.startTime) &&
        Objects.equals(this.trackUrlSetting, adlabGroupListV30ResponseDataGroupsInnerAdInfo.trackUrlSetting) &&
        Objects.equals(this.weekSchedule, adlabGroupListV30ResponseDataGroupsInnerAdInfo.weekSchedule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adTarget, appType, assetsIds, audience, convertId, cpaBid, deepBidType, deepCpaBid, deepExternalAction, deliveryRange, downloadMode, downloadType, downloadUrl, endTime, externalAction, openUrl, _package, roiGoal, scheduleType, startTime, trackUrlSetting, weekSchedule);
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
    sb.append("class AdlabGroupListV30ResponseDataGroupsInnerAdInfo {\n");
    sb.append("    adTarget: ").append(toIndentedString(adTarget)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    assetsIds: ").append(toIndentedString(assetsIds)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    convertId: ").append(toIndentedString(convertId)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpaBid: ").append(toIndentedString(deepCpaBid)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    deliveryRange: ").append(toIndentedString(deliveryRange)).append("\n");
    sb.append("    downloadMode: ").append(toIndentedString(downloadMode)).append("\n");
    sb.append("    downloadType: ").append(toIndentedString(downloadType)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    trackUrlSetting: ").append(toIndentedString(trackUrlSetting)).append("\n");
    sb.append("    weekSchedule: ").append(toIndentedString(weekSchedule)).append("\n");
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
    openapiFields.add("ad_target");
    openapiFields.add("app_type");
    openapiFields.add("assets_ids");
    openapiFields.add("audience");
    openapiFields.add("convert_id");
    openapiFields.add("cpa_bid");
    openapiFields.add("deep_bid_type");
    openapiFields.add("deep_cpa_bid");
    openapiFields.add("deep_external_action");
    openapiFields.add("delivery_range");
    openapiFields.add("download_mode");
    openapiFields.add("download_type");
    openapiFields.add("download_url");
    openapiFields.add("end_time");
    openapiFields.add("external_action");
    openapiFields.add("open_url");
    openapiFields.add("package");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_type");
    openapiFields.add("start_time");
    openapiFields.add("track_url_setting");
    openapiFields.add("week_schedule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupListV30ResponseDataGroupsInnerAdInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupListV30ResponseDataGroupsInnerAdInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupListV30ResponseDataGroupsInnerAdInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupListV30ResponseDataGroupsInnerAdInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupListV30ResponseDataGroupsInnerAdInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupListV30ResponseDataGroupsInnerAdInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupListV30ResponseDataGroupsInnerAdInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupListV30ResponseDataGroupsInnerAdInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupListV30ResponseDataGroupsInnerAdInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupListV30ResponseDataGroupsInnerAdInfo
  */
  public static AdlabGroupListV30ResponseDataGroupsInnerAdInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupListV30ResponseDataGroupsInnerAdInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupListV30ResponseDataGroupsInnerAdInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

