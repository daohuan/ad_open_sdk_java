/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus {
  public static final String SERIALIZED_NAME_AD_SYNC_ORIGIN = "ad_sync_origin";
  @SerializedName(SERIALIZED_NAME_AD_SYNC_ORIGIN)
  private Long adSyncOrigin = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTO_SYNC = "auto_sync";
  @SerializedName(SERIALIZED_NAME_AUTO_SYNC)
  private Long autoSync = null;

  public static final String SERIALIZED_NAME_DOU_PLUS_UID = "dou_plus_uid";
  @SerializedName(SERIALIZED_NAME_DOU_PLUS_UID)
  private Long douPlusUid = null;

  public static final String SERIALIZED_NAME_PRODUCT_LINK = "product_link";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINK)
  private String productLink = null;

  public static final String SERIALIZED_NAME_PRODUCT_PICS = "product_pics";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PICS)
  private List<String> productPics = null;

  public static final String SERIALIZED_NAME_SYNC_DURATION = "sync_duration";
  @SerializedName(SERIALIZED_NAME_SYNC_DURATION)
  private Long syncDuration = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus adSyncOrigin(Long adSyncOrigin) {
    
    this.adSyncOrigin = adSyncOrigin;
    return this;
  }

   /**
   * 
   * @return adSyncOrigin
  **/
  @javax.annotation.Nullable
  public Long getAdSyncOrigin() {
    return adSyncOrigin;
  }


  public void setAdSyncOrigin(Long adSyncOrigin) {
    this.adSyncOrigin = adSyncOrigin;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus autoSync(Long autoSync) {
    
    this.autoSync = autoSync;
    return this;
  }

   /**
   * 
   * @return autoSync
  **/
  @javax.annotation.Nullable
  public Long getAutoSync() {
    return autoSync;
  }


  public void setAutoSync(Long autoSync) {
    this.autoSync = autoSync;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus douPlusUid(Long douPlusUid) {
    
    this.douPlusUid = douPlusUid;
    return this;
  }

   /**
   * 
   * @return douPlusUid
  **/
  @javax.annotation.Nullable
  public Long getDouPlusUid() {
    return douPlusUid;
  }


  public void setDouPlusUid(Long douPlusUid) {
    this.douPlusUid = douPlusUid;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus productLink(String productLink) {
    
    this.productLink = productLink;
    return this;
  }

   /**
   * 
   * @return productLink
  **/
  @javax.annotation.Nullable
  public String getProductLink() {
    return productLink;
  }


  public void setProductLink(String productLink) {
    this.productLink = productLink;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus productPics(List<String> productPics) {
    
    this.productPics = productPics;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus addProductPicsItem(String productPicsItem) {
    if (this.productPics == null) {
      this.productPics = new ArrayList<>();
    }
    this.productPics.add(productPicsItem);
    return this;
  }

   /**
   * 
   * @return productPics
  **/
  @javax.annotation.Nullable
  public List<String> getProductPics() {
    return productPics;
  }


  public void setProductPics(List<String> productPics) {
    this.productPics = productPics;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus syncDuration(Long syncDuration) {
    
    this.syncDuration = syncDuration;
    return this;
  }

   /**
   * 
   * @return syncDuration
  **/
  @javax.annotation.Nullable
  public Long getSyncDuration() {
    return syncDuration;
  }


  public void setSyncDuration(Long syncDuration) {
    this.syncDuration = syncDuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus = (StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus) o;
    return Objects.equals(this.adSyncOrigin, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.adSyncOrigin) &&
        Objects.equals(this.advertiserId, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.advertiserId) &&
        Objects.equals(this.autoSync, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.autoSync) &&
        Objects.equals(this.douPlusUid, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.douPlusUid) &&
        Objects.equals(this.productLink, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.productLink) &&
        Objects.equals(this.productPics, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.productPics) &&
        Objects.equals(this.syncDuration, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.syncDuration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSyncOrigin, advertiserId, autoSync, douPlusUid, productLink, productPics, syncDuration);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus {\n");
    sb.append("    adSyncOrigin: ").append(toIndentedString(adSyncOrigin)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoSync: ").append(toIndentedString(autoSync)).append("\n");
    sb.append("    douPlusUid: ").append(toIndentedString(douPlusUid)).append("\n");
    sb.append("    productLink: ").append(toIndentedString(productLink)).append("\n");
    sb.append("    productPics: ").append(toIndentedString(productPics)).append("\n");
    sb.append("    syncDuration: ").append(toIndentedString(syncDuration)).append("\n");
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
    openapiFields.add("ad_sync_origin");
    openapiFields.add("advertiser_id");
    openapiFields.add("auto_sync");
    openapiFields.add("dou_plus_uid");
    openapiFields.add("product_link");
    openapiFields.add("product_pics");
    openapiFields.add("sync_duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

