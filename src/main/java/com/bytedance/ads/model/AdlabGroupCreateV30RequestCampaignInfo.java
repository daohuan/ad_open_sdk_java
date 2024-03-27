/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum;
import com.bytedance.ads.model.AdlabGroupCreateV30CampaignInfoLandingType;
import com.bytedance.ads.model.AdlabGroupCreateV30CampaignInfoMarketingPurpose;
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
 * 广告组维度信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class AdlabGroupCreateV30RequestCampaignInfo {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_DELIVERY_RELATED_NUM = "delivery_related_num";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RELATED_NUM)
  private AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum deliveryRelatedNum = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private AdlabGroupCreateV30CampaignInfoLandingType landingType = null;

  public static final String SERIALIZED_NAME_MARKETING_PURPOSE = "marketing_purpose";
  @SerializedName(SERIALIZED_NAME_MARKETING_PURPOSE)
  private AdlabGroupCreateV30CampaignInfoMarketingPurpose marketingPurpose = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public AdlabGroupCreateV30RequestCampaignInfo() {
  }

  public AdlabGroupCreateV30RequestCampaignInfo budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 广告组预算，单位：元 限制范围：300 &lt;&#x3D; budget &lt;&#x3D; 9999999.99
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public AdlabGroupCreateV30RequestCampaignInfo deliveryRelatedNum(AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum deliveryRelatedNum) {
    
    this.deliveryRelatedNum = deliveryRelatedNum;
    return this;
  }

   /**
   * Get deliveryRelatedNum
   * @return deliveryRelatedNum
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum getDeliveryRelatedNum() {
    return deliveryRelatedNum;
  }


  public void setDeliveryRelatedNum(AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum deliveryRelatedNum) {
    this.deliveryRelatedNum = deliveryRelatedNum;
  }


  public AdlabGroupCreateV30RequestCampaignInfo landingType(AdlabGroupCreateV30CampaignInfoLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30CampaignInfoLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(AdlabGroupCreateV30CampaignInfoLandingType landingType) {
    this.landingType = landingType;
  }


  public AdlabGroupCreateV30RequestCampaignInfo marketingPurpose(AdlabGroupCreateV30CampaignInfoMarketingPurpose marketingPurpose) {
    
    this.marketingPurpose = marketingPurpose;
    return this;
  }

   /**
   * Get marketingPurpose
   * @return marketingPurpose
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30CampaignInfoMarketingPurpose getMarketingPurpose() {
    return marketingPurpose;
  }


  public void setMarketingPurpose(AdlabGroupCreateV30CampaignInfoMarketingPurpose marketingPurpose) {
    this.marketingPurpose = marketingPurpose;
  }


  public AdlabGroupCreateV30RequestCampaignInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 广告组(管家项目)名称，不允许超过100个字
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupCreateV30RequestCampaignInfo adlabGroupCreateV30RequestCampaignInfo = (AdlabGroupCreateV30RequestCampaignInfo) o;
    return Objects.equals(this.budget, adlabGroupCreateV30RequestCampaignInfo.budget) &&
        Objects.equals(this.deliveryRelatedNum, adlabGroupCreateV30RequestCampaignInfo.deliveryRelatedNum) &&
        Objects.equals(this.landingType, adlabGroupCreateV30RequestCampaignInfo.landingType) &&
        Objects.equals(this.marketingPurpose, adlabGroupCreateV30RequestCampaignInfo.marketingPurpose) &&
        Objects.equals(this.name, adlabGroupCreateV30RequestCampaignInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, deliveryRelatedNum, landingType, marketingPurpose, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30RequestCampaignInfo {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    deliveryRelatedNum: ").append(toIndentedString(deliveryRelatedNum)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    marketingPurpose: ").append(toIndentedString(marketingPurpose)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("delivery_related_num");
    openapiFields.add("landing_type");
    openapiFields.add("marketing_purpose");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("landing_type");
    openapiRequiredFields.add("marketing_purpose");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupCreateV30RequestCampaignInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30RequestCampaignInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30RequestCampaignInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30RequestCampaignInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30RequestCampaignInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30RequestCampaignInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30RequestCampaignInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30RequestCampaignInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30RequestCampaignInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30RequestCampaignInfo
  */
  public static AdlabGroupCreateV30RequestCampaignInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30RequestCampaignInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30RequestCampaignInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

