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
import com.bytedance.ads.model.QianchuanReportAdGetV10FilteringCampaignScene;
import com.bytedance.ads.model.QianchuanReportAdGetV10FilteringMarketingGoal;
import com.bytedance.ads.model.QianchuanReportAdGetV10FilteringMarketingScene;
import com.bytedance.ads.model.QianchuanReportAdGetV10FilteringOrderPlatform;
import com.bytedance.ads.model.QianchuanReportAdGetV10FilteringSmartBidType;
import com.bytedance.ads.model.QianchuanReportAdGetV10FilteringStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
public class QianchuanReportAdGetV10Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_SCENE = "campaign_scene";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_SCENE)
  private QianchuanReportAdGetV10FilteringCampaignScene campaignScene = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanReportAdGetV10FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanReportAdGetV10FilteringMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_ORDER_PLATFORM = "order_platform";
  @SerializedName(SERIALIZED_NAME_ORDER_PLATFORM)
  private QianchuanReportAdGetV10FilteringOrderPlatform orderPlatform = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private QianchuanReportAdGetV10FilteringSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanReportAdGetV10FilteringStatus status = null;

  public QianchuanReportAdGetV10Filtering() {
  }

  public QianchuanReportAdGetV10Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public QianchuanReportAdGetV10Filtering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public QianchuanReportAdGetV10Filtering campaignScene(QianchuanReportAdGetV10FilteringCampaignScene campaignScene) {
    
    this.campaignScene = campaignScene;
    return this;
  }

   /**
   * Get campaignScene
   * @return campaignScene
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdGetV10FilteringCampaignScene getCampaignScene() {
    return campaignScene;
  }


  public void setCampaignScene(QianchuanReportAdGetV10FilteringCampaignScene campaignScene) {
    this.campaignScene = campaignScene;
  }


  public QianchuanReportAdGetV10Filtering marketingGoal(QianchuanReportAdGetV10FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanReportAdGetV10FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanReportAdGetV10FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanReportAdGetV10Filtering marketingScene(QianchuanReportAdGetV10FilteringMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdGetV10FilteringMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanReportAdGetV10FilteringMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanReportAdGetV10Filtering orderPlatform(QianchuanReportAdGetV10FilteringOrderPlatform orderPlatform) {
    
    this.orderPlatform = orderPlatform;
    return this;
  }

   /**
   * Get orderPlatform
   * @return orderPlatform
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdGetV10FilteringOrderPlatform getOrderPlatform() {
    return orderPlatform;
  }


  public void setOrderPlatform(QianchuanReportAdGetV10FilteringOrderPlatform orderPlatform) {
    this.orderPlatform = orderPlatform;
  }


  public QianchuanReportAdGetV10Filtering smartBidType(QianchuanReportAdGetV10FilteringSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdGetV10FilteringSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(QianchuanReportAdGetV10FilteringSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public QianchuanReportAdGetV10Filtering status(QianchuanReportAdGetV10FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdGetV10FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanReportAdGetV10FilteringStatus status) {
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
    QianchuanReportAdGetV10Filtering qianchuanReportAdGetV10Filtering = (QianchuanReportAdGetV10Filtering) o;
    return Objects.equals(this.adIds, qianchuanReportAdGetV10Filtering.adIds) &&
        Objects.equals(this.campaignScene, qianchuanReportAdGetV10Filtering.campaignScene) &&
        Objects.equals(this.marketingGoal, qianchuanReportAdGetV10Filtering.marketingGoal) &&
        Objects.equals(this.marketingScene, qianchuanReportAdGetV10Filtering.marketingScene) &&
        Objects.equals(this.orderPlatform, qianchuanReportAdGetV10Filtering.orderPlatform) &&
        Objects.equals(this.smartBidType, qianchuanReportAdGetV10Filtering.smartBidType) &&
        Objects.equals(this.status, qianchuanReportAdGetV10Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, campaignScene, marketingGoal, marketingScene, orderPlatform, smartBidType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanReportAdGetV10Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    campaignScene: ").append(toIndentedString(campaignScene)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    orderPlatform: ").append(toIndentedString(orderPlatform)).append("\n");
    sb.append("    smartBidType: ").append(toIndentedString(smartBidType)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("campaign_scene");
    openapiFields.add("marketing_goal");
    openapiFields.add("marketing_scene");
    openapiFields.add("order_platform");
    openapiFields.add("smart_bid_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportAdGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportAdGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportAdGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportAdGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportAdGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanReportAdGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportAdGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportAdGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportAdGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportAdGetV10Filtering
  */
  public static QianchuanReportAdGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportAdGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanReportAdGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

