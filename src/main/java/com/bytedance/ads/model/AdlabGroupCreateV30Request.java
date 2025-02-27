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
import com.bytedance.ads.model.AdlabGroupCreateV30RequestAdInfo;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestCampaignInfo;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestCreativeInfo;
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
 * AdlabGroupCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class AdlabGroupCreateV30Request {
  public static final String SERIALIZED_NAME_AD_INFO = "ad_info";
  @SerializedName(SERIALIZED_NAME_AD_INFO)
  private AdlabGroupCreateV30RequestAdInfo adInfo = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_INFO = "campaign_info";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_INFO)
  private AdlabGroupCreateV30RequestCampaignInfo campaignInfo = null;

  public static final String SERIALIZED_NAME_CREATIVE_INFO = "creative_info";
  @SerializedName(SERIALIZED_NAME_CREATIVE_INFO)
  private AdlabGroupCreateV30RequestCreativeInfo creativeInfo = null;

  public AdlabGroupCreateV30Request() {
  }

  public AdlabGroupCreateV30Request adInfo(AdlabGroupCreateV30RequestAdInfo adInfo) {
    
    this.adInfo = adInfo;
    return this;
  }

   /**
   * Get adInfo
   * @return adInfo
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30RequestAdInfo getAdInfo() {
    return adInfo;
  }


  public void setAdInfo(AdlabGroupCreateV30RequestAdInfo adInfo) {
    this.adInfo = adInfo;
  }


  public AdlabGroupCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdlabGroupCreateV30Request campaignInfo(AdlabGroupCreateV30RequestCampaignInfo campaignInfo) {
    
    this.campaignInfo = campaignInfo;
    return this;
  }

   /**
   * Get campaignInfo
   * @return campaignInfo
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30RequestCampaignInfo getCampaignInfo() {
    return campaignInfo;
  }


  public void setCampaignInfo(AdlabGroupCreateV30RequestCampaignInfo campaignInfo) {
    this.campaignInfo = campaignInfo;
  }


  public AdlabGroupCreateV30Request creativeInfo(AdlabGroupCreateV30RequestCreativeInfo creativeInfo) {
    
    this.creativeInfo = creativeInfo;
    return this;
  }

   /**
   * Get creativeInfo
   * @return creativeInfo
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30RequestCreativeInfo getCreativeInfo() {
    return creativeInfo;
  }


  public void setCreativeInfo(AdlabGroupCreateV30RequestCreativeInfo creativeInfo) {
    this.creativeInfo = creativeInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupCreateV30Request adlabGroupCreateV30Request = (AdlabGroupCreateV30Request) o;
    return Objects.equals(this.adInfo, adlabGroupCreateV30Request.adInfo) &&
        Objects.equals(this.advertiserId, adlabGroupCreateV30Request.advertiserId) &&
        Objects.equals(this.campaignInfo, adlabGroupCreateV30Request.campaignInfo) &&
        Objects.equals(this.creativeInfo, adlabGroupCreateV30Request.creativeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adInfo, advertiserId, campaignInfo, creativeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30Request {\n");
    sb.append("    adInfo: ").append(toIndentedString(adInfo)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignInfo: ").append(toIndentedString(campaignInfo)).append("\n");
    sb.append("    creativeInfo: ").append(toIndentedString(creativeInfo)).append("\n");
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
    openapiFields.add("ad_info");
    openapiFields.add("advertiser_id");
    openapiFields.add("campaign_info");
    openapiFields.add("creative_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_info");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("campaign_info");
    openapiRequiredFields.add("creative_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30Request>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30Request
  */
  public static AdlabGroupCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30Request.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

