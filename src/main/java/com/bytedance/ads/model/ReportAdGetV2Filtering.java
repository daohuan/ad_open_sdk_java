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
import com.bytedance.ads.model.ReportAdGetV2FilteringCampaignTypes;
import com.bytedance.ads.model.ReportAdGetV2FilteringCreativeMaterialModes;
import com.bytedance.ads.model.ReportAdGetV2FilteringDeliveryMode;
import com.bytedance.ads.model.ReportAdGetV2FilteringImageModes;
import com.bytedance.ads.model.ReportAdGetV2FilteringInventoryTypes;
import com.bytedance.ads.model.ReportAdGetV2FilteringLandingType;
import com.bytedance.ads.model.ReportAdGetV2FilteringLandingTypes;
import com.bytedance.ads.model.ReportAdGetV2FilteringPricing;
import com.bytedance.ads.model.ReportAdGetV2FilteringPricingCategories;
import com.bytedance.ads.model.ReportAdGetV2FilteringPricings;
import com.bytedance.ads.model.ReportAdGetV2FilteringStatus;
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
public class ReportAdGetV2Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPES = "campaign_types";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPES)
  private List<ReportAdGetV2FilteringCampaignTypes> campaignTypes = null;

  public static final String SERIALIZED_NAME_CREATIVE_IDS = "creative_ids";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IDS)
  private List<Long> creativeIds = null;

  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODES = "creative_material_modes";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODES)
  private List<ReportAdGetV2FilteringCreativeMaterialModes> creativeMaterialModes = null;

  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private List<ReportAdGetV2FilteringDeliveryMode> deliveryMode = null;

  public static final String SERIALIZED_NAME_IMAGE_MODES = "image_modes";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODES)
  private List<ReportAdGetV2FilteringImageModes> imageModes = null;

  public static final String SERIALIZED_NAME_INVENTORY_TYPES = "inventory_types";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPES)
  private List<ReportAdGetV2FilteringInventoryTypes> inventoryTypes = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private ReportAdGetV2FilteringLandingType landingType = null;

  public static final String SERIALIZED_NAME_LANDING_TYPES = "landing_types";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPES)
  private List<ReportAdGetV2FilteringLandingTypes> landingTypes = null;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private ReportAdGetV2FilteringPricing pricing = null;

  public static final String SERIALIZED_NAME_PRICING_CATEGORIES = "pricing_categories";
  @SerializedName(SERIALIZED_NAME_PRICING_CATEGORIES)
  private List<ReportAdGetV2FilteringPricingCategories> pricingCategories = null;

  public static final String SERIALIZED_NAME_PRICINGS = "pricings";
  @SerializedName(SERIALIZED_NAME_PRICINGS)
  private List<ReportAdGetV2FilteringPricings> pricings = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ReportAdGetV2FilteringStatus status = null;

  public ReportAdGetV2Filtering() {
  }

  public ReportAdGetV2Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public ReportAdGetV2Filtering addAdIdsItem(Long adIdsItem) {
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


  public ReportAdGetV2Filtering adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * 
   * @return adName
  **/
  @javax.annotation.Nullable
  public String getAdName() {
    return adName;
  }


  public void setAdName(String adName) {
    this.adName = adName;
  }


  public ReportAdGetV2Filtering campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public ReportAdGetV2Filtering campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportAdGetV2Filtering addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public ReportAdGetV2Filtering campaignTypes(List<ReportAdGetV2FilteringCampaignTypes> campaignTypes) {
    
    this.campaignTypes = campaignTypes;
    return this;
  }

  public ReportAdGetV2Filtering addCampaignTypesItem(ReportAdGetV2FilteringCampaignTypes campaignTypesItem) {
    if (this.campaignTypes == null) {
      this.campaignTypes = new ArrayList<>();
    }
    this.campaignTypes.add(campaignTypesItem);
    return this;
  }

   /**
   * 
   * @return campaignTypes
  **/
  @javax.annotation.Nullable
  public List<ReportAdGetV2FilteringCampaignTypes> getCampaignTypes() {
    return campaignTypes;
  }


  public void setCampaignTypes(List<ReportAdGetV2FilteringCampaignTypes> campaignTypes) {
    this.campaignTypes = campaignTypes;
  }


  public ReportAdGetV2Filtering creativeIds(List<Long> creativeIds) {
    
    this.creativeIds = creativeIds;
    return this;
  }

  public ReportAdGetV2Filtering addCreativeIdsItem(Long creativeIdsItem) {
    if (this.creativeIds == null) {
      this.creativeIds = new ArrayList<>();
    }
    this.creativeIds.add(creativeIdsItem);
    return this;
  }

   /**
   * 
   * @return creativeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeIds() {
    return creativeIds;
  }


  public void setCreativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
  }


  public ReportAdGetV2Filtering creativeMaterialModes(List<ReportAdGetV2FilteringCreativeMaterialModes> creativeMaterialModes) {
    
    this.creativeMaterialModes = creativeMaterialModes;
    return this;
  }

  public ReportAdGetV2Filtering addCreativeMaterialModesItem(ReportAdGetV2FilteringCreativeMaterialModes creativeMaterialModesItem) {
    if (this.creativeMaterialModes == null) {
      this.creativeMaterialModes = new ArrayList<>();
    }
    this.creativeMaterialModes.add(creativeMaterialModesItem);
    return this;
  }

   /**
   * 
   * @return creativeMaterialModes
  **/
  @javax.annotation.Nullable
  public List<ReportAdGetV2FilteringCreativeMaterialModes> getCreativeMaterialModes() {
    return creativeMaterialModes;
  }


  public void setCreativeMaterialModes(List<ReportAdGetV2FilteringCreativeMaterialModes> creativeMaterialModes) {
    this.creativeMaterialModes = creativeMaterialModes;
  }


  public ReportAdGetV2Filtering deliveryMode(List<ReportAdGetV2FilteringDeliveryMode> deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

  public ReportAdGetV2Filtering addDeliveryModeItem(ReportAdGetV2FilteringDeliveryMode deliveryModeItem) {
    if (this.deliveryMode == null) {
      this.deliveryMode = new ArrayList<>();
    }
    this.deliveryMode.add(deliveryModeItem);
    return this;
  }

   /**
   * 
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public List<ReportAdGetV2FilteringDeliveryMode> getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(List<ReportAdGetV2FilteringDeliveryMode> deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public ReportAdGetV2Filtering imageModes(List<ReportAdGetV2FilteringImageModes> imageModes) {
    
    this.imageModes = imageModes;
    return this;
  }

  public ReportAdGetV2Filtering addImageModesItem(ReportAdGetV2FilteringImageModes imageModesItem) {
    if (this.imageModes == null) {
      this.imageModes = new ArrayList<>();
    }
    this.imageModes.add(imageModesItem);
    return this;
  }

   /**
   * 
   * @return imageModes
  **/
  @javax.annotation.Nullable
  public List<ReportAdGetV2FilteringImageModes> getImageModes() {
    return imageModes;
  }


  public void setImageModes(List<ReportAdGetV2FilteringImageModes> imageModes) {
    this.imageModes = imageModes;
  }


  public ReportAdGetV2Filtering inventoryTypes(List<ReportAdGetV2FilteringInventoryTypes> inventoryTypes) {
    
    this.inventoryTypes = inventoryTypes;
    return this;
  }

  public ReportAdGetV2Filtering addInventoryTypesItem(ReportAdGetV2FilteringInventoryTypes inventoryTypesItem) {
    if (this.inventoryTypes == null) {
      this.inventoryTypes = new ArrayList<>();
    }
    this.inventoryTypes.add(inventoryTypesItem);
    return this;
  }

   /**
   * 
   * @return inventoryTypes
  **/
  @javax.annotation.Nullable
  public List<ReportAdGetV2FilteringInventoryTypes> getInventoryTypes() {
    return inventoryTypes;
  }


  public void setInventoryTypes(List<ReportAdGetV2FilteringInventoryTypes> inventoryTypes) {
    this.inventoryTypes = inventoryTypes;
  }


  public ReportAdGetV2Filtering landingType(ReportAdGetV2FilteringLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public ReportAdGetV2FilteringLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(ReportAdGetV2FilteringLandingType landingType) {
    this.landingType = landingType;
  }


  public ReportAdGetV2Filtering landingTypes(List<ReportAdGetV2FilteringLandingTypes> landingTypes) {
    
    this.landingTypes = landingTypes;
    return this;
  }

  public ReportAdGetV2Filtering addLandingTypesItem(ReportAdGetV2FilteringLandingTypes landingTypesItem) {
    if (this.landingTypes == null) {
      this.landingTypes = new ArrayList<>();
    }
    this.landingTypes.add(landingTypesItem);
    return this;
  }

   /**
   * 
   * @return landingTypes
  **/
  @javax.annotation.Nullable
  public List<ReportAdGetV2FilteringLandingTypes> getLandingTypes() {
    return landingTypes;
  }


  public void setLandingTypes(List<ReportAdGetV2FilteringLandingTypes> landingTypes) {
    this.landingTypes = landingTypes;
  }


  public ReportAdGetV2Filtering pricing(ReportAdGetV2FilteringPricing pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  public ReportAdGetV2FilteringPricing getPricing() {
    return pricing;
  }


  public void setPricing(ReportAdGetV2FilteringPricing pricing) {
    this.pricing = pricing;
  }


  public ReportAdGetV2Filtering pricingCategories(List<ReportAdGetV2FilteringPricingCategories> pricingCategories) {
    
    this.pricingCategories = pricingCategories;
    return this;
  }

  public ReportAdGetV2Filtering addPricingCategoriesItem(ReportAdGetV2FilteringPricingCategories pricingCategoriesItem) {
    if (this.pricingCategories == null) {
      this.pricingCategories = new ArrayList<>();
    }
    this.pricingCategories.add(pricingCategoriesItem);
    return this;
  }

   /**
   * 
   * @return pricingCategories
  **/
  @javax.annotation.Nullable
  public List<ReportAdGetV2FilteringPricingCategories> getPricingCategories() {
    return pricingCategories;
  }


  public void setPricingCategories(List<ReportAdGetV2FilteringPricingCategories> pricingCategories) {
    this.pricingCategories = pricingCategories;
  }


  public ReportAdGetV2Filtering pricings(List<ReportAdGetV2FilteringPricings> pricings) {
    
    this.pricings = pricings;
    return this;
  }

  public ReportAdGetV2Filtering addPricingsItem(ReportAdGetV2FilteringPricings pricingsItem) {
    if (this.pricings == null) {
      this.pricings = new ArrayList<>();
    }
    this.pricings.add(pricingsItem);
    return this;
  }

   /**
   * 
   * @return pricings
  **/
  @javax.annotation.Nullable
  public List<ReportAdGetV2FilteringPricings> getPricings() {
    return pricings;
  }


  public void setPricings(List<ReportAdGetV2FilteringPricings> pricings) {
    this.pricings = pricings;
  }


  public ReportAdGetV2Filtering status(ReportAdGetV2FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ReportAdGetV2FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(ReportAdGetV2FilteringStatus status) {
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
    ReportAdGetV2Filtering reportAdGetV2Filtering = (ReportAdGetV2Filtering) o;
    return Objects.equals(this.adIds, reportAdGetV2Filtering.adIds) &&
        Objects.equals(this.adName, reportAdGetV2Filtering.adName) &&
        Objects.equals(this.campaignId, reportAdGetV2Filtering.campaignId) &&
        Objects.equals(this.campaignIds, reportAdGetV2Filtering.campaignIds) &&
        Objects.equals(this.campaignTypes, reportAdGetV2Filtering.campaignTypes) &&
        Objects.equals(this.creativeIds, reportAdGetV2Filtering.creativeIds) &&
        Objects.equals(this.creativeMaterialModes, reportAdGetV2Filtering.creativeMaterialModes) &&
        Objects.equals(this.deliveryMode, reportAdGetV2Filtering.deliveryMode) &&
        Objects.equals(this.imageModes, reportAdGetV2Filtering.imageModes) &&
        Objects.equals(this.inventoryTypes, reportAdGetV2Filtering.inventoryTypes) &&
        Objects.equals(this.landingType, reportAdGetV2Filtering.landingType) &&
        Objects.equals(this.landingTypes, reportAdGetV2Filtering.landingTypes) &&
        Objects.equals(this.pricing, reportAdGetV2Filtering.pricing) &&
        Objects.equals(this.pricingCategories, reportAdGetV2Filtering.pricingCategories) &&
        Objects.equals(this.pricings, reportAdGetV2Filtering.pricings) &&
        Objects.equals(this.status, reportAdGetV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, adName, campaignId, campaignIds, campaignTypes, creativeIds, creativeMaterialModes, deliveryMode, imageModes, inventoryTypes, landingType, landingTypes, pricing, pricingCategories, pricings, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAdGetV2Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignTypes: ").append(toIndentedString(campaignTypes)).append("\n");
    sb.append("    creativeIds: ").append(toIndentedString(creativeIds)).append("\n");
    sb.append("    creativeMaterialModes: ").append(toIndentedString(creativeMaterialModes)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    imageModes: ").append(toIndentedString(imageModes)).append("\n");
    sb.append("    inventoryTypes: ").append(toIndentedString(inventoryTypes)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    landingTypes: ").append(toIndentedString(landingTypes)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    pricingCategories: ").append(toIndentedString(pricingCategories)).append("\n");
    sb.append("    pricings: ").append(toIndentedString(pricings)).append("\n");
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
    openapiFields.add("ad_name");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_ids");
    openapiFields.add("campaign_types");
    openapiFields.add("creative_ids");
    openapiFields.add("creative_material_modes");
    openapiFields.add("delivery_mode");
    openapiFields.add("image_modes");
    openapiFields.add("inventory_types");
    openapiFields.add("landing_type");
    openapiFields.add("landing_types");
    openapiFields.add("pricing");
    openapiFields.add("pricing_categories");
    openapiFields.add("pricings");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAdGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAdGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAdGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAdGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAdGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportAdGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAdGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAdGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAdGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportAdGetV2Filtering
  */
  public static ReportAdGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAdGetV2Filtering.class);
  }

 /**
  * Convert an instance of ReportAdGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

