/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
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
 * DpaAssetV2DetailReadV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class DpaAssetV2DetailReadV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ASSET_IDS = "asset_ids";
  @SerializedName(SERIALIZED_NAME_ASSET_IDS)
  private List<Long> assetIds = null;

  public static final String SERIALIZED_NAME_UNIQUE_PRODUCT_IDS = "unique_product_ids";
  @SerializedName(SERIALIZED_NAME_UNIQUE_PRODUCT_IDS)
  private List<Long> uniqueProductIds = null;

  public DpaAssetV2DetailReadV2Request() {
  }

  public DpaAssetV2DetailReadV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DpaAssetV2DetailReadV2Request assetIds(List<Long> assetIds) {
    
    this.assetIds = assetIds;
    return this;
  }

  public DpaAssetV2DetailReadV2Request addAssetIdsItem(Long assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * 投放条件ID, 最多允许传入100个
   * @return assetIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAssetIds() {
    return assetIds;
  }


  public void setAssetIds(List<Long> assetIds) {
    this.assetIds = assetIds;
  }


  public DpaAssetV2DetailReadV2Request uniqueProductIds(List<Long> uniqueProductIds) {
    
    this.uniqueProductIds = uniqueProductIds;
    return this;
  }

  public DpaAssetV2DetailReadV2Request addUniqueProductIdsItem(Long uniqueProductIdsItem) {
    if (this.uniqueProductIds == null) {
      this.uniqueProductIds = new ArrayList<>();
    }
    this.uniqueProductIds.add(uniqueProductIdsItem);
    return this;
  }

   /**
   * 投放条件对应的线索商品ID, 最多允许传入100个
   * @return uniqueProductIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getUniqueProductIds() {
    return uniqueProductIds;
  }


  public void setUniqueProductIds(List<Long> uniqueProductIds) {
    this.uniqueProductIds = uniqueProductIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaAssetV2DetailReadV2Request dpaAssetV2DetailReadV2Request = (DpaAssetV2DetailReadV2Request) o;
    return Objects.equals(this.advertiserId, dpaAssetV2DetailReadV2Request.advertiserId) &&
        Objects.equals(this.assetIds, dpaAssetV2DetailReadV2Request.assetIds) &&
        Objects.equals(this.uniqueProductIds, dpaAssetV2DetailReadV2Request.uniqueProductIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, assetIds, uniqueProductIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaAssetV2DetailReadV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    uniqueProductIds: ").append(toIndentedString(uniqueProductIds)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("asset_ids");
    openapiFields.add("unique_product_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("asset_ids");
    openapiRequiredFields.add("unique_product_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaAssetV2DetailReadV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaAssetV2DetailReadV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaAssetV2DetailReadV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaAssetV2DetailReadV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaAssetV2DetailReadV2Request>() {
           @Override
           public void write(JsonWriter out, DpaAssetV2DetailReadV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaAssetV2DetailReadV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaAssetV2DetailReadV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaAssetV2DetailReadV2Request
  * @throws IOException if the JSON string is invalid with respect to DpaAssetV2DetailReadV2Request
  */
  public static DpaAssetV2DetailReadV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaAssetV2DetailReadV2Request.class);
  }

 /**
  * Convert an instance of DpaAssetV2DetailReadV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

