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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class CustomerCenterFundTransferSeqCreateV2ResponseData {
  public static final String SERIALIZED_NAME_TRANSACTION_SEQ = "transaction_seq";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_SEQ)
  private Long transactionSeq = null;

  public CustomerCenterFundTransferSeqCreateV2ResponseData() {
  }

  public CustomerCenterFundTransferSeqCreateV2ResponseData transactionSeq(Long transactionSeq) {
    
    this.transactionSeq = transactionSeq;
    return this;
  }

   /**
   * 
   * @return transactionSeq
  **/
  @javax.annotation.Nullable
  public Long getTransactionSeq() {
    return transactionSeq;
  }


  public void setTransactionSeq(Long transactionSeq) {
    this.transactionSeq = transactionSeq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCenterFundTransferSeqCreateV2ResponseData customerCenterFundTransferSeqCreateV2ResponseData = (CustomerCenterFundTransferSeqCreateV2ResponseData) o;
    return Objects.equals(this.transactionSeq, customerCenterFundTransferSeqCreateV2ResponseData.transactionSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCenterFundTransferSeqCreateV2ResponseData {\n");
    sb.append("    transactionSeq: ").append(toIndentedString(transactionSeq)).append("\n");
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
    openapiFields.add("transaction_seq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerCenterFundTransferSeqCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerCenterFundTransferSeqCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerCenterFundTransferSeqCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerCenterFundTransferSeqCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerCenterFundTransferSeqCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, CustomerCenterFundTransferSeqCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerCenterFundTransferSeqCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerCenterFundTransferSeqCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerCenterFundTransferSeqCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to CustomerCenterFundTransferSeqCreateV2ResponseData
  */
  public static CustomerCenterFundTransferSeqCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerCenterFundTransferSeqCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of CustomerCenterFundTransferSeqCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

