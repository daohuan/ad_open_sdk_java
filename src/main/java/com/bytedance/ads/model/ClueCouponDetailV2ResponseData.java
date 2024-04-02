/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponDetailV2DataActivityType;
import com.bytedance.ads.model.ClueCouponDetailV2ResponseDataCoupon;
import com.bytedance.ads.model.ClueCouponDetailV2ResponseDataForm;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ClueCouponDetailV2ResponseData {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private Long activityId = null;

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activity_type";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private ClueCouponDetailV2DataActivityType activityType = null;

  public static final String SERIALIZED_NAME_COUPON = "coupon";
  @SerializedName(SERIALIZED_NAME_COUPON)
  private ClueCouponDetailV2ResponseDataCoupon coupon = null;

  public static final String SERIALIZED_NAME_FORM = "form";
  @SerializedName(SERIALIZED_NAME_FORM)
  private ClueCouponDetailV2ResponseDataForm form = null;

  public ClueCouponDetailV2ResponseData() {
  }

  public ClueCouponDetailV2ResponseData activityId(Long activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 
   * @return activityId
  **/
  @javax.annotation.Nullable
  public Long getActivityId() {
    return activityId;
  }


  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  public ClueCouponDetailV2ResponseData activityType(ClueCouponDetailV2DataActivityType activityType) {
    
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataActivityType getActivityType() {
    return activityType;
  }


  public void setActivityType(ClueCouponDetailV2DataActivityType activityType) {
    this.activityType = activityType;
  }


  public ClueCouponDetailV2ResponseData coupon(ClueCouponDetailV2ResponseDataCoupon coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Get coupon
   * @return coupon
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2ResponseDataCoupon getCoupon() {
    return coupon;
  }


  public void setCoupon(ClueCouponDetailV2ResponseDataCoupon coupon) {
    this.coupon = coupon;
  }


  public ClueCouponDetailV2ResponseData form(ClueCouponDetailV2ResponseDataForm form) {
    
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2ResponseDataForm getForm() {
    return form;
  }


  public void setForm(ClueCouponDetailV2ResponseDataForm form) {
    this.form = form;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponDetailV2ResponseData clueCouponDetailV2ResponseData = (ClueCouponDetailV2ResponseData) o;
    return Objects.equals(this.activityId, clueCouponDetailV2ResponseData.activityId) &&
        Objects.equals(this.activityType, clueCouponDetailV2ResponseData.activityType) &&
        Objects.equals(this.coupon, clueCouponDetailV2ResponseData.coupon) &&
        Objects.equals(this.form, clueCouponDetailV2ResponseData.form);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityType, coupon, form);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponDetailV2ResponseData {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("activity_type");
    openapiFields.add("coupon");
    openapiFields.add("form");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponDetailV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponDetailV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponDetailV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponDetailV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponDetailV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ClueCouponDetailV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponDetailV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponDetailV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponDetailV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ClueCouponDetailV2ResponseData
  */
  public static ClueCouponDetailV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponDetailV2ResponseData.class);
  }

 /**
  * Convert an instance of ClueCouponDetailV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

