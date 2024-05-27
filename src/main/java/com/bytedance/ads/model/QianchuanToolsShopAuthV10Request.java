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
import com.bytedance.ads.model.QianchuanToolsShopAuthV10ShopAuthTimeType;
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
 * QianchuanToolsShopAuthV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class QianchuanToolsShopAuthV10Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_SHOP_AUTH_TIME_TYPE = "shop_auth_time_type";
  @SerializedName(SERIALIZED_NAME_SHOP_AUTH_TIME_TYPE)
  private QianchuanToolsShopAuthV10ShopAuthTimeType shopAuthTimeType = null;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private Long shopId = null;

  public QianchuanToolsShopAuthV10Request() {
  }

  public QianchuanToolsShopAuthV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanToolsShopAuthV10Request endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public QianchuanToolsShopAuthV10Request shopAuthTimeType(QianchuanToolsShopAuthV10ShopAuthTimeType shopAuthTimeType) {
    
    this.shopAuthTimeType = shopAuthTimeType;
    return this;
  }

   /**
   * Get shopAuthTimeType
   * @return shopAuthTimeType
  **/
  @javax.annotation.Nonnull
  public QianchuanToolsShopAuthV10ShopAuthTimeType getShopAuthTimeType() {
    return shopAuthTimeType;
  }


  public void setShopAuthTimeType(QianchuanToolsShopAuthV10ShopAuthTimeType shopAuthTimeType) {
    this.shopAuthTimeType = shopAuthTimeType;
  }


  public QianchuanToolsShopAuthV10Request shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 
   * @return shopId
  **/
  @javax.annotation.Nonnull
  public Long getShopId() {
    return shopId;
  }


  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanToolsShopAuthV10Request qianchuanToolsShopAuthV10Request = (QianchuanToolsShopAuthV10Request) o;
    return Objects.equals(this.advertiserId, qianchuanToolsShopAuthV10Request.advertiserId) &&
        Objects.equals(this.endTime, qianchuanToolsShopAuthV10Request.endTime) &&
        Objects.equals(this.shopAuthTimeType, qianchuanToolsShopAuthV10Request.shopAuthTimeType) &&
        Objects.equals(this.shopId, qianchuanToolsShopAuthV10Request.shopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, endTime, shopAuthTimeType, shopId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanToolsShopAuthV10Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    shopAuthTimeType: ").append(toIndentedString(shopAuthTimeType)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("shop_auth_time_type");
    openapiFields.add("shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("shop_auth_time_type");
    openapiRequiredFields.add("shop_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsShopAuthV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsShopAuthV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsShopAuthV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsShopAuthV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsShopAuthV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsShopAuthV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsShopAuthV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsShopAuthV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsShopAuthV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsShopAuthV10Request
  */
  public static QianchuanToolsShopAuthV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsShopAuthV10Request.class);
  }

 /**
  * Convert an instance of QianchuanToolsShopAuthV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

