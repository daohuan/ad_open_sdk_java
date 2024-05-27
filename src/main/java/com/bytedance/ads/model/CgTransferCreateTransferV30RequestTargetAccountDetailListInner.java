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
import com.bytedance.ads.model.CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner;
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
 * CgTransferCreateTransferV30RequestTargetAccountDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class CgTransferCreateTransferV30RequestTargetAccountDetailListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_TRANSFER_CAPITAL_DETAIL_LIST = "transfer_capital_detail_list";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CAPITAL_DETAIL_LIST)
  private List<CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner> transferCapitalDetailList = null;

  public CgTransferCreateTransferV30RequestTargetAccountDetailListInner() {
  }

  public CgTransferCreateTransferV30RequestTargetAccountDetailListInner accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 目标账户id
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public CgTransferCreateTransferV30RequestTargetAccountDetailListInner transferCapitalDetailList(List<CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner> transferCapitalDetailList) {
    
    this.transferCapitalDetailList = transferCapitalDetailList;
    return this;
  }

  public CgTransferCreateTransferV30RequestTargetAccountDetailListInner addTransferCapitalDetailListItem(CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner transferCapitalDetailListItem) {
    if (this.transferCapitalDetailList == null) {
      this.transferCapitalDetailList = new ArrayList<>();
    }
    this.transferCapitalDetailList.add(transferCapitalDetailListItem);
    return this;
  }

   /**
   * 锚定账户与目标账户转账资金列表
   * @return transferCapitalDetailList
  **/
  @javax.annotation.Nonnull
  public List<CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner> getTransferCapitalDetailList() {
    return transferCapitalDetailList;
  }


  public void setTransferCapitalDetailList(List<CgTransferCreateTransferV30RequestTargetAccountDetailListInnerTransferCapitalDetailListInner> transferCapitalDetailList) {
    this.transferCapitalDetailList = transferCapitalDetailList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferCreateTransferV30RequestTargetAccountDetailListInner cgTransferCreateTransferV30RequestTargetAccountDetailListInner = (CgTransferCreateTransferV30RequestTargetAccountDetailListInner) o;
    return Objects.equals(this.accountId, cgTransferCreateTransferV30RequestTargetAccountDetailListInner.accountId) &&
        Objects.equals(this.transferCapitalDetailList, cgTransferCreateTransferV30RequestTargetAccountDetailListInner.transferCapitalDetailList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transferCapitalDetailList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferCreateTransferV30RequestTargetAccountDetailListInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transferCapitalDetailList: ").append(toIndentedString(transferCapitalDetailList)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("transfer_capital_detail_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("transfer_capital_detail_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferCreateTransferV30RequestTargetAccountDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferCreateTransferV30RequestTargetAccountDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferCreateTransferV30RequestTargetAccountDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferCreateTransferV30RequestTargetAccountDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferCreateTransferV30RequestTargetAccountDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferCreateTransferV30RequestTargetAccountDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferCreateTransferV30RequestTargetAccountDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferCreateTransferV30RequestTargetAccountDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferCreateTransferV30RequestTargetAccountDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferCreateTransferV30RequestTargetAccountDetailListInner
  */
  public static CgTransferCreateTransferV30RequestTargetAccountDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferCreateTransferV30RequestTargetAccountDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferCreateTransferV30RequestTargetAccountDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

