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
import com.bytedance.ads.model.CustomerCenterFundTransferSeqCreateV2TransferType;
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
 * CustomerCenterFundTransferSeqCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class CustomerCenterFundTransferSeqCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = null;

  public static final String SERIALIZED_NAME_TARGET_ADVERTISER_ID = "target_advertiser_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ADVERTISER_ID)
  private Long targetAdvertiserId = null;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE = "transfer_type";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE)
  private CustomerCenterFundTransferSeqCreateV2TransferType transferType = null;

  public CustomerCenterFundTransferSeqCreateV2Request() {
  }

  public CustomerCenterFundTransferSeqCreateV2Request advertiserId(Long advertiserId) {
    
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


  public CustomerCenterFundTransferSeqCreateV2Request amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @javax.annotation.Nonnull
  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public CustomerCenterFundTransferSeqCreateV2Request targetAdvertiserId(Long targetAdvertiserId) {
    
    this.targetAdvertiserId = targetAdvertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return targetAdvertiserId
  **/
  @javax.annotation.Nonnull
  public Long getTargetAdvertiserId() {
    return targetAdvertiserId;
  }


  public void setTargetAdvertiserId(Long targetAdvertiserId) {
    this.targetAdvertiserId = targetAdvertiserId;
  }


  public CustomerCenterFundTransferSeqCreateV2Request transferType(CustomerCenterFundTransferSeqCreateV2TransferType transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @javax.annotation.Nonnull
  public CustomerCenterFundTransferSeqCreateV2TransferType getTransferType() {
    return transferType;
  }


  public void setTransferType(CustomerCenterFundTransferSeqCreateV2TransferType transferType) {
    this.transferType = transferType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCenterFundTransferSeqCreateV2Request customerCenterFundTransferSeqCreateV2Request = (CustomerCenterFundTransferSeqCreateV2Request) o;
    return Objects.equals(this.advertiserId, customerCenterFundTransferSeqCreateV2Request.advertiserId) &&
        Objects.equals(this.amount, customerCenterFundTransferSeqCreateV2Request.amount) &&
        Objects.equals(this.targetAdvertiserId, customerCenterFundTransferSeqCreateV2Request.targetAdvertiserId) &&
        Objects.equals(this.transferType, customerCenterFundTransferSeqCreateV2Request.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, amount, targetAdvertiserId, transferType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCenterFundTransferSeqCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    targetAdvertiserId: ").append(toIndentedString(targetAdvertiserId)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("target_advertiser_id");
    openapiFields.add("transfer_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("target_advertiser_id");
    openapiRequiredFields.add("transfer_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerCenterFundTransferSeqCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerCenterFundTransferSeqCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerCenterFundTransferSeqCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerCenterFundTransferSeqCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerCenterFundTransferSeqCreateV2Request>() {
           @Override
           public void write(JsonWriter out, CustomerCenterFundTransferSeqCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerCenterFundTransferSeqCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerCenterFundTransferSeqCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerCenterFundTransferSeqCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to CustomerCenterFundTransferSeqCreateV2Request
  */
  public static CustomerCenterFundTransferSeqCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerCenterFundTransferSeqCreateV2Request.class);
  }

 /**
  * Convert an instance of CustomerCenterFundTransferSeqCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

