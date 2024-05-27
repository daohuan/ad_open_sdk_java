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
import com.bytedance.ads.model.ClueCouponCreateV2ActivityType;
import com.bytedance.ads.model.ClueCouponCreateV2RequestCoupon;
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
 * ClueCouponCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ClueCouponCreateV2Request {
  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activity_type";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private ClueCouponCreateV2ActivityType activityType = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BIND_FORM_ID = "bind_form_id";
  @SerializedName(SERIALIZED_NAME_BIND_FORM_ID)
  private Long bindFormId = null;

  public static final String SERIALIZED_NAME_COUPON = "coupon";
  @SerializedName(SERIALIZED_NAME_COUPON)
  private ClueCouponCreateV2RequestCoupon coupon = null;

  public ClueCouponCreateV2Request() {
  }

  public ClueCouponCreateV2Request activityType(ClueCouponCreateV2ActivityType activityType) {
    
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @javax.annotation.Nonnull
  public ClueCouponCreateV2ActivityType getActivityType() {
    return activityType;
  }


  public void setActivityType(ClueCouponCreateV2ActivityType activityType) {
    this.activityType = activityType;
  }


  public ClueCouponCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ClueCouponCreateV2Request bindFormId(Long bindFormId) {
    
    this.bindFormId = bindFormId;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 9223372036854775807
   * @return bindFormId
  **/
  @javax.annotation.Nullable
  public Long getBindFormId() {
    return bindFormId;
  }


  public void setBindFormId(Long bindFormId) {
    this.bindFormId = bindFormId;
  }


  public ClueCouponCreateV2Request coupon(ClueCouponCreateV2RequestCoupon coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Get coupon
   * @return coupon
  **/
  @javax.annotation.Nullable
  public ClueCouponCreateV2RequestCoupon getCoupon() {
    return coupon;
  }


  public void setCoupon(ClueCouponCreateV2RequestCoupon coupon) {
    this.coupon = coupon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponCreateV2Request clueCouponCreateV2Request = (ClueCouponCreateV2Request) o;
    return Objects.equals(this.activityType, clueCouponCreateV2Request.activityType) &&
        Objects.equals(this.advertiserId, clueCouponCreateV2Request.advertiserId) &&
        Objects.equals(this.bindFormId, clueCouponCreateV2Request.bindFormId) &&
        Objects.equals(this.coupon, clueCouponCreateV2Request.coupon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityType, advertiserId, bindFormId, coupon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponCreateV2Request {\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    bindFormId: ").append(toIndentedString(bindFormId)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
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
    openapiFields.add("activity_type");
    openapiFields.add("advertiser_id");
    openapiFields.add("bind_form_id");
    openapiFields.add("coupon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("activity_type");
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ClueCouponCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ClueCouponCreateV2Request
  */
  public static ClueCouponCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponCreateV2Request.class);
  }

 /**
  * Convert an instance of ClueCouponCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

