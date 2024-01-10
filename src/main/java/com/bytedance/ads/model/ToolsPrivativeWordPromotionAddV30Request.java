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
import com.bytedance.ads.model.ToolsPrivativeWordPromotionAddV30RequestPromotionListInner;
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
 * ToolsPrivativeWordPromotionAddV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class ToolsPrivativeWordPromotionAddV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_PROMOTION_LIST = "promotion_list";
  @SerializedName(SERIALIZED_NAME_PROMOTION_LIST)
  private List<ToolsPrivativeWordPromotionAddV30RequestPromotionListInner> promotionList = null;

  public ToolsPrivativeWordPromotionAddV30Request() {
  }

  public ToolsPrivativeWordPromotionAddV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsPrivativeWordPromotionAddV30Request promotionList(List<ToolsPrivativeWordPromotionAddV30RequestPromotionListInner> promotionList) {
    
    this.promotionList = promotionList;
    return this;
  }

  public ToolsPrivativeWordPromotionAddV30Request addPromotionListItem(ToolsPrivativeWordPromotionAddV30RequestPromotionListInner promotionListItem) {
    if (this.promotionList == null) {
      this.promotionList = new ArrayList<>();
    }
    this.promotionList.add(promotionListItem);
    return this;
  }

   /**
   * 项目列表
   * @return promotionList
  **/
  @javax.annotation.Nonnull
  public List<ToolsPrivativeWordPromotionAddV30RequestPromotionListInner> getPromotionList() {
    return promotionList;
  }


  public void setPromotionList(List<ToolsPrivativeWordPromotionAddV30RequestPromotionListInner> promotionList) {
    this.promotionList = promotionList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordPromotionAddV30Request toolsPrivativeWordPromotionAddV30Request = (ToolsPrivativeWordPromotionAddV30Request) o;
    return Objects.equals(this.advertiserId, toolsPrivativeWordPromotionAddV30Request.advertiserId) &&
        Objects.equals(this.promotionList, toolsPrivativeWordPromotionAddV30Request.promotionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, promotionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordPromotionAddV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    promotionList: ").append(toIndentedString(promotionList)).append("\n");
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
    openapiFields.add("promotion_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("promotion_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordPromotionAddV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordPromotionAddV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordPromotionAddV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordPromotionAddV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordPromotionAddV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordPromotionAddV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordPromotionAddV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordPromotionAddV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordPromotionAddV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordPromotionAddV30Request
  */
  public static ToolsPrivativeWordPromotionAddV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordPromotionAddV30Request.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordPromotionAddV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

