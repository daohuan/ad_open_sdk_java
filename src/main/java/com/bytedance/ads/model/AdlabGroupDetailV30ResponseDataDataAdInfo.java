/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAdTarget;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAppType;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoDeepBidType;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoDeepExternalAction;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoDownloadMode;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoDownloadType;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoExternalAction;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoPricing;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoScheduleType;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataAdInfoAudience;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataDataAdInfo {
  public static final String SERIALIZED_NAME_AD_TARGET = "ad_target";
  @SerializedName(SERIALIZED_NAME_AD_TARGET)
  private AdlabGroupDetailV30DataDataAdInfoAdTarget adTarget = null;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private AdlabGroupDetailV30DataDataAdInfoAppType appType = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private AdlabGroupDetailV30ResponseDataDataAdInfoAudience audience = null;

  public static final String SERIALIZED_NAME_CONVERT_ID = "convert_id";
  @SerializedName(SERIALIZED_NAME_CONVERT_ID)
  private Long convertId = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_BID_TYPE = "deep_bid_type";
  @SerializedName(SERIALIZED_NAME_DEEP_BID_TYPE)
  private AdlabGroupDetailV30DataDataAdInfoDeepBidType deepBidType = null;

  public static final String SERIALIZED_NAME_DEEP_CPA_BID = "deep_cpa_bid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPA_BID)
  private Double deepCpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private AdlabGroupDetailV30DataDataAdInfoDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_DELIVERY_RANGE = "delivery_range";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RANGE)
  private AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange deliveryRange = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_MODE = "download_mode";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_MODE)
  private AdlabGroupDetailV30DataDataAdInfoDownloadMode downloadMode = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_TYPE = "download_type";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_TYPE)
  private AdlabGroupDetailV30DataDataAdInfoDownloadType downloadType = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private AdlabGroupDetailV30DataDataAdInfoExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private String _package = null;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private AdlabGroupDetailV30DataDataAdInfoPricing pricing = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner> productInfo = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private AdlabGroupDetailV30DataDataAdInfoScheduleType scheduleType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_TRACK_URL_SETTING = "track_url_setting";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_SETTING)
  private AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting trackUrlSetting = null;

  public static final String SERIALIZED_NAME_WEEK_SCHEDULE = "week_schedule";
  @SerializedName(SERIALIZED_NAME_WEEK_SCHEDULE)
  private List<List<Long>> weekSchedule = null;

  public AdlabGroupDetailV30ResponseDataDataAdInfo() {
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfo adTarget(AdlabGroupDetailV30DataDataAdInfoAdTarget adTarget) {
    
    this.adTarget = adTarget;
    return this;
  }

   /**
   * Get adTarget
   * @return adTarget
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoAdTarget getAdTarget() {
    return adTarget;
  }


  public void setAdTarget(AdlabGroupDetailV30DataDataAdInfoAdTarget adTarget) {
    this.adTarget = adTarget;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo appType(AdlabGroupDetailV30DataDataAdInfoAppType appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoAppType getAppType() {
    return appType;
  }


  public void setAppType(AdlabGroupDetailV30DataDataAdInfoAppType appType) {
    this.appType = appType;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo audience(AdlabGroupDetailV30ResponseDataDataAdInfoAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience getAudience() {
    return audience;
  }


  public void setAudience(AdlabGroupDetailV30ResponseDataDataAdInfoAudience audience) {
    this.audience = audience;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo convertId(Long convertId) {
    
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


  public AdlabGroupDetailV30ResponseDataDataAdInfo cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 目标转化出价/预期成本
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo deepBidType(AdlabGroupDetailV30DataDataAdInfoDeepBidType deepBidType) {
    
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoDeepBidType getDeepBidType() {
    return deepBidType;
  }


  public void setDeepBidType(AdlabGroupDetailV30DataDataAdInfoDeepBidType deepBidType) {
    this.deepBidType = deepBidType;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo deepCpaBid(Double deepCpaBid) {
    
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


  public AdlabGroupDetailV30ResponseDataDataAdInfo deepExternalAction(AdlabGroupDetailV30DataDataAdInfoDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(AdlabGroupDetailV30DataDataAdInfoDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo deliveryRange(AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange deliveryRange) {
    
    this.deliveryRange = deliveryRange;
    return this;
  }

   /**
   * Get deliveryRange
   * @return deliveryRange
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange getDeliveryRange() {
    return deliveryRange;
  }


  public void setDeliveryRange(AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange deliveryRange) {
    this.deliveryRange = deliveryRange;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo downloadMode(AdlabGroupDetailV30DataDataAdInfoDownloadMode downloadMode) {
    
    this.downloadMode = downloadMode;
    return this;
  }

   /**
   * Get downloadMode
   * @return downloadMode
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoDownloadMode getDownloadMode() {
    return downloadMode;
  }


  public void setDownloadMode(AdlabGroupDetailV30DataDataAdInfoDownloadMode downloadMode) {
    this.downloadMode = downloadMode;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo downloadType(AdlabGroupDetailV30DataDataAdInfoDownloadType downloadType) {
    
    this.downloadType = downloadType;
    return this;
  }

   /**
   * Get downloadType
   * @return downloadType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoDownloadType getDownloadType() {
    return downloadType;
  }


  public void setDownloadType(AdlabGroupDetailV30DataDataAdInfoDownloadType downloadType) {
    this.downloadType = downloadType;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo downloadUrl(String downloadUrl) {
    
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


  public AdlabGroupDetailV30ResponseDataDataAdInfo endTime(String endTime) {
    
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


  public AdlabGroupDetailV30ResponseDataDataAdInfo externalAction(AdlabGroupDetailV30DataDataAdInfoExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(AdlabGroupDetailV30DataDataAdInfoExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo openUrl(String openUrl) {
    
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


  public AdlabGroupDetailV30ResponseDataDataAdInfo _package(String _package) {
    
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


  public AdlabGroupDetailV30ResponseDataDataAdInfo pricing(AdlabGroupDetailV30DataDataAdInfoPricing pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoPricing getPricing() {
    return pricing;
  }


  public void setPricing(AdlabGroupDetailV30DataDataAdInfoPricing pricing) {
    this.pricing = pricing;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo productInfo(List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner> productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfo addProductInfoItem(AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner productInfoItem) {
    if (this.productInfo == null) {
      this.productInfo = new ArrayList<>();
    }
    this.productInfo.add(productInfoItem);
    return this;
  }

   /**
   * 商品信息
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner> getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner> productInfo) {
    this.productInfo = productInfo;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo roiGoal(Double roiGoal) {
    
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


  public AdlabGroupDetailV30ResponseDataDataAdInfo scheduleType(AdlabGroupDetailV30DataDataAdInfoScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(AdlabGroupDetailV30DataDataAdInfoScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo startTime(String startTime) {
    
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


  public AdlabGroupDetailV30ResponseDataDataAdInfo trackUrlSetting(AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting trackUrlSetting) {
    
    this.trackUrlSetting = trackUrlSetting;
    return this;
  }

   /**
   * Get trackUrlSetting
   * @return trackUrlSetting
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting getTrackUrlSetting() {
    return trackUrlSetting;
  }


  public void setTrackUrlSetting(AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting trackUrlSetting) {
    this.trackUrlSetting = trackUrlSetting;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfo weekSchedule(List<List<Long>> weekSchedule) {
    
    this.weekSchedule = weekSchedule;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfo addWeekScheduleItem(List<Long> weekScheduleItem) {
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
    AdlabGroupDetailV30ResponseDataDataAdInfo adlabGroupDetailV30ResponseDataDataAdInfo = (AdlabGroupDetailV30ResponseDataDataAdInfo) o;
    return Objects.equals(this.adTarget, adlabGroupDetailV30ResponseDataDataAdInfo.adTarget) &&
        Objects.equals(this.appType, adlabGroupDetailV30ResponseDataDataAdInfo.appType) &&
        Objects.equals(this.audience, adlabGroupDetailV30ResponseDataDataAdInfo.audience) &&
        Objects.equals(this.convertId, adlabGroupDetailV30ResponseDataDataAdInfo.convertId) &&
        Objects.equals(this.cpaBid, adlabGroupDetailV30ResponseDataDataAdInfo.cpaBid) &&
        Objects.equals(this.deepBidType, adlabGroupDetailV30ResponseDataDataAdInfo.deepBidType) &&
        Objects.equals(this.deepCpaBid, adlabGroupDetailV30ResponseDataDataAdInfo.deepCpaBid) &&
        Objects.equals(this.deepExternalAction, adlabGroupDetailV30ResponseDataDataAdInfo.deepExternalAction) &&
        Objects.equals(this.deliveryRange, adlabGroupDetailV30ResponseDataDataAdInfo.deliveryRange) &&
        Objects.equals(this.downloadMode, adlabGroupDetailV30ResponseDataDataAdInfo.downloadMode) &&
        Objects.equals(this.downloadType, adlabGroupDetailV30ResponseDataDataAdInfo.downloadType) &&
        Objects.equals(this.downloadUrl, adlabGroupDetailV30ResponseDataDataAdInfo.downloadUrl) &&
        Objects.equals(this.endTime, adlabGroupDetailV30ResponseDataDataAdInfo.endTime) &&
        Objects.equals(this.externalAction, adlabGroupDetailV30ResponseDataDataAdInfo.externalAction) &&
        Objects.equals(this.openUrl, adlabGroupDetailV30ResponseDataDataAdInfo.openUrl) &&
        Objects.equals(this._package, adlabGroupDetailV30ResponseDataDataAdInfo._package) &&
        Objects.equals(this.pricing, adlabGroupDetailV30ResponseDataDataAdInfo.pricing) &&
        Objects.equals(this.productInfo, adlabGroupDetailV30ResponseDataDataAdInfo.productInfo) &&
        Objects.equals(this.roiGoal, adlabGroupDetailV30ResponseDataDataAdInfo.roiGoal) &&
        Objects.equals(this.scheduleType, adlabGroupDetailV30ResponseDataDataAdInfo.scheduleType) &&
        Objects.equals(this.startTime, adlabGroupDetailV30ResponseDataDataAdInfo.startTime) &&
        Objects.equals(this.trackUrlSetting, adlabGroupDetailV30ResponseDataDataAdInfo.trackUrlSetting) &&
        Objects.equals(this.weekSchedule, adlabGroupDetailV30ResponseDataDataAdInfo.weekSchedule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adTarget, appType, audience, convertId, cpaBid, deepBidType, deepCpaBid, deepExternalAction, deliveryRange, downloadMode, downloadType, downloadUrl, endTime, externalAction, openUrl, _package, pricing, productInfo, roiGoal, scheduleType, startTime, trackUrlSetting, weekSchedule);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataAdInfo {\n");
    sb.append("    adTarget: ").append(toIndentedString(adTarget)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
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
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
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
    openapiFields.add("pricing");
    openapiFields.add("product_info");
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
       if (!AdlabGroupDetailV30ResponseDataDataAdInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataAdInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataAdInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataAdInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataAdInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataAdInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataAdInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataAdInfo
  */
  public static AdlabGroupDetailV30ResponseDataDataAdInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataAdInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataAdInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

