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
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataOptStatus;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataStatus;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataAdInfo;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataCampaignInfo;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataCreativeInfo;
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
 * 管家项目id
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataData {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_INFO = "ad_info";
  @SerializedName(SERIALIZED_NAME_AD_INFO)
  private AdlabGroupDetailV30ResponseDataDataAdInfo adInfo = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_INFO = "campaign_info";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_INFO)
  private AdlabGroupDetailV30ResponseDataDataCampaignInfo campaignInfo = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_INFO = "creative_info";
  @SerializedName(SERIALIZED_NAME_CREATIVE_INFO)
  private AdlabGroupDetailV30ResponseDataDataCreativeInfo creativeInfo = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private AdlabGroupDetailV30DataDataOptStatus optStatus = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdlabGroupDetailV30DataDataStatus status = null;

  public AdlabGroupDetailV30ResponseDataData() {
  }

  public AdlabGroupDetailV30ResponseDataData adId(Long adId) {
    
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


  public AdlabGroupDetailV30ResponseDataData adInfo(AdlabGroupDetailV30ResponseDataDataAdInfo adInfo) {
    
    this.adInfo = adInfo;
    return this;
  }

   /**
   * Get adInfo
   * @return adInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30ResponseDataDataAdInfo getAdInfo() {
    return adInfo;
  }


  public void setAdInfo(AdlabGroupDetailV30ResponseDataDataAdInfo adInfo) {
    this.adInfo = adInfo;
  }


  public AdlabGroupDetailV30ResponseDataData campaignId(Long campaignId) {
    
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


  public AdlabGroupDetailV30ResponseDataData campaignInfo(AdlabGroupDetailV30ResponseDataDataCampaignInfo campaignInfo) {
    
    this.campaignInfo = campaignInfo;
    return this;
  }

   /**
   * Get campaignInfo
   * @return campaignInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30ResponseDataDataCampaignInfo getCampaignInfo() {
    return campaignInfo;
  }


  public void setCampaignInfo(AdlabGroupDetailV30ResponseDataDataCampaignInfo campaignInfo) {
    this.campaignInfo = campaignInfo;
  }


  public AdlabGroupDetailV30ResponseDataData creativeId(Long creativeId) {
    
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


  public AdlabGroupDetailV30ResponseDataData creativeInfo(AdlabGroupDetailV30ResponseDataDataCreativeInfo creativeInfo) {
    
    this.creativeInfo = creativeInfo;
    return this;
  }

   /**
   * Get creativeInfo
   * @return creativeInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30ResponseDataDataCreativeInfo getCreativeInfo() {
    return creativeInfo;
  }


  public void setCreativeInfo(AdlabGroupDetailV30ResponseDataDataCreativeInfo creativeInfo) {
    this.creativeInfo = creativeInfo;
  }


  public AdlabGroupDetailV30ResponseDataData id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 项目id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public AdlabGroupDetailV30ResponseDataData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 项目名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AdlabGroupDetailV30ResponseDataData optStatus(AdlabGroupDetailV30DataDataOptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataOptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(AdlabGroupDetailV30DataDataOptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public AdlabGroupDetailV30ResponseDataData status(AdlabGroupDetailV30DataDataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataStatus getStatus() {
    return status;
  }


  public void setStatus(AdlabGroupDetailV30DataDataStatus status) {
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
    AdlabGroupDetailV30ResponseDataData adlabGroupDetailV30ResponseDataData = (AdlabGroupDetailV30ResponseDataData) o;
    return Objects.equals(this.adId, adlabGroupDetailV30ResponseDataData.adId) &&
        Objects.equals(this.adInfo, adlabGroupDetailV30ResponseDataData.adInfo) &&
        Objects.equals(this.campaignId, adlabGroupDetailV30ResponseDataData.campaignId) &&
        Objects.equals(this.campaignInfo, adlabGroupDetailV30ResponseDataData.campaignInfo) &&
        Objects.equals(this.creativeId, adlabGroupDetailV30ResponseDataData.creativeId) &&
        Objects.equals(this.creativeInfo, adlabGroupDetailV30ResponseDataData.creativeInfo) &&
        Objects.equals(this.id, adlabGroupDetailV30ResponseDataData.id) &&
        Objects.equals(this.name, adlabGroupDetailV30ResponseDataData.name) &&
        Objects.equals(this.optStatus, adlabGroupDetailV30ResponseDataData.optStatus) &&
        Objects.equals(this.status, adlabGroupDetailV30ResponseDataData.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adInfo, campaignId, campaignInfo, creativeId, creativeInfo, id, name, optStatus, status);
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
    sb.append("class AdlabGroupDetailV30ResponseDataData {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adInfo: ").append(toIndentedString(adInfo)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignInfo: ").append(toIndentedString(campaignInfo)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    creativeInfo: ").append(toIndentedString(creativeInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("opt_status");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("campaign_id");
    openapiRequiredFields.add("campaign_info");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("opt_status");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupDetailV30ResponseDataData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataData>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataData
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataData
  */
  public static AdlabGroupDetailV30ResponseDataData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataData.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

