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
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsOptStatus;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsStatus;
import com.bytedance.ads.model.AdlabGroupListV30ResponseDataGroupsInnerAdInfo;
import com.bytedance.ads.model.AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo;
import com.bytedance.ads.model.AdlabGroupListV30ResponseDataGroupsInnerCreativeInfo;
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
 * AdlabGroupListV30ResponseDataGroupsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class AdlabGroupListV30ResponseDataGroupsInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_INFO = "ad_info";
  @SerializedName(SERIALIZED_NAME_AD_INFO)
  private AdlabGroupListV30ResponseDataGroupsInnerAdInfo adInfo = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_INFO = "campaign_info";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_INFO)
  private AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo campaignInfo = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_INFO = "creative_info";
  @SerializedName(SERIALIZED_NAME_CREATIVE_INFO)
  private AdlabGroupListV30ResponseDataGroupsInnerCreativeInfo creativeInfo = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private AdlabGroupListV30DataGroupsOptStatus optStatus = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdlabGroupListV30DataGroupsStatus status = null;

  public AdlabGroupListV30ResponseDataGroupsInner() {
  }

  public AdlabGroupListV30ResponseDataGroupsInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划id
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public AdlabGroupListV30ResponseDataGroupsInner adInfo(AdlabGroupListV30ResponseDataGroupsInnerAdInfo adInfo) {
    
    this.adInfo = adInfo;
    return this;
  }

   /**
   * Get adInfo
   * @return adInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30ResponseDataGroupsInnerAdInfo getAdInfo() {
    return adInfo;
  }


  public void setAdInfo(AdlabGroupListV30ResponseDataGroupsInnerAdInfo adInfo) {
    this.adInfo = adInfo;
  }


  public AdlabGroupListV30ResponseDataGroupsInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组id
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public AdlabGroupListV30ResponseDataGroupsInner campaignInfo(AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo campaignInfo) {
    
    this.campaignInfo = campaignInfo;
    return this;
  }

   /**
   * Get campaignInfo
   * @return campaignInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo getCampaignInfo() {
    return campaignInfo;
  }


  public void setCampaignInfo(AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo campaignInfo) {
    this.campaignInfo = campaignInfo;
  }


  public AdlabGroupListV30ResponseDataGroupsInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 创意id
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public AdlabGroupListV30ResponseDataGroupsInner creativeInfo(AdlabGroupListV30ResponseDataGroupsInnerCreativeInfo creativeInfo) {
    
    this.creativeInfo = creativeInfo;
    return this;
  }

   /**
   * Get creativeInfo
   * @return creativeInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30ResponseDataGroupsInnerCreativeInfo getCreativeInfo() {
    return creativeInfo;
  }


  public void setCreativeInfo(AdlabGroupListV30ResponseDataGroupsInnerCreativeInfo creativeInfo) {
    this.creativeInfo = creativeInfo;
  }


  public AdlabGroupListV30ResponseDataGroupsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 管家项目id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public AdlabGroupListV30ResponseDataGroupsInner optStatus(AdlabGroupListV30DataGroupsOptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsOptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(AdlabGroupListV30DataGroupsOptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public AdlabGroupListV30ResponseDataGroupsInner status(AdlabGroupListV30DataGroupsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsStatus getStatus() {
    return status;
  }


  public void setStatus(AdlabGroupListV30DataGroupsStatus status) {
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
    AdlabGroupListV30ResponseDataGroupsInner adlabGroupListV30ResponseDataGroupsInner = (AdlabGroupListV30ResponseDataGroupsInner) o;
    return Objects.equals(this.adId, adlabGroupListV30ResponseDataGroupsInner.adId) &&
        Objects.equals(this.adInfo, adlabGroupListV30ResponseDataGroupsInner.adInfo) &&
        Objects.equals(this.campaignId, adlabGroupListV30ResponseDataGroupsInner.campaignId) &&
        Objects.equals(this.campaignInfo, adlabGroupListV30ResponseDataGroupsInner.campaignInfo) &&
        Objects.equals(this.creativeId, adlabGroupListV30ResponseDataGroupsInner.creativeId) &&
        Objects.equals(this.creativeInfo, adlabGroupListV30ResponseDataGroupsInner.creativeInfo) &&
        Objects.equals(this.id, adlabGroupListV30ResponseDataGroupsInner.id) &&
        Objects.equals(this.optStatus, adlabGroupListV30ResponseDataGroupsInner.optStatus) &&
        Objects.equals(this.status, adlabGroupListV30ResponseDataGroupsInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adInfo, campaignId, campaignInfo, creativeId, creativeInfo, id, optStatus, status);
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
    sb.append("class AdlabGroupListV30ResponseDataGroupsInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adInfo: ").append(toIndentedString(adInfo)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignInfo: ").append(toIndentedString(campaignInfo)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    creativeInfo: ").append(toIndentedString(creativeInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("ad_info");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_info");
    openapiFields.add("creative_id");
    openapiFields.add("creative_info");
    openapiFields.add("id");
    openapiFields.add("opt_status");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupListV30ResponseDataGroupsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupListV30ResponseDataGroupsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupListV30ResponseDataGroupsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupListV30ResponseDataGroupsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupListV30ResponseDataGroupsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupListV30ResponseDataGroupsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupListV30ResponseDataGroupsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupListV30ResponseDataGroupsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupListV30ResponseDataGroupsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupListV30ResponseDataGroupsInner
  */
  public static AdlabGroupListV30ResponseDataGroupsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupListV30ResponseDataGroupsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupListV30ResponseDataGroupsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

