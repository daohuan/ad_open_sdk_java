/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorUpdateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit;
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
 * NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner {
  public static final String SERIALIZED_NAME_GIFT_AMOUNT = "gift_amount";
  @SerializedName(SERIALIZED_NAME_GIFT_AMOUNT)
  private Long giftAmount = null;

  public static final String SERIALIZED_NAME_GIFT_IMAGE_URL = "gift_image_url";
  @SerializedName(SERIALIZED_NAME_GIFT_IMAGE_URL)
  private String giftImageUrl = null;

  public static final String SERIALIZED_NAME_GIFT_NAME = "gift_name";
  @SerializedName(SERIALIZED_NAME_GIFT_NAME)
  private String giftName = null;

  public static final String SERIALIZED_NAME_GIFT_UNIT = "gift_unit";
  @SerializedName(SERIALIZED_NAME_GIFT_UNIT)
  private NativeAnchorUpdateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit giftUnit = null;

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner() {
  }

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner giftAmount(Long giftAmount) {
    
    this.giftAmount = giftAmount;
    return this;
  }

   /**
   * 礼品数量，0～6位数字
   * @return giftAmount
  **/
  @javax.annotation.Nullable
  public Long getGiftAmount() {
    return giftAmount;
  }


  public void setGiftAmount(Long giftAmount) {
    this.giftAmount = giftAmount;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner giftImageUrl(String giftImageUrl) {
    
    this.giftImageUrl = giftImageUrl;
    return this;
  }

   /**
   * 礼品图片
   * @return giftImageUrl
  **/
  @javax.annotation.Nullable
  public String getGiftImageUrl() {
    return giftImageUrl;
  }


  public void setGiftImageUrl(String giftImageUrl) {
    this.giftImageUrl = giftImageUrl;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner giftName(String giftName) {
    
    this.giftName = giftName;
    return this;
  }

   /**
   * 礼品名称，字符限制0～8
   * @return giftName
  **/
  @javax.annotation.Nullable
  public String getGiftName() {
    return giftName;
  }


  public void setGiftName(String giftName) {
    this.giftName = giftName;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner giftUnit(NativeAnchorUpdateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit giftUnit) {
    
    this.giftUnit = giftUnit;
    return this;
  }

   /**
   * Get giftUnit
   * @return giftUnit
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit getGiftUnit() {
    return giftUnit;
  }


  public void setGiftUnit(NativeAnchorUpdateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit giftUnit) {
    this.giftUnit = giftUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner = (NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner) o;
    return Objects.equals(this.giftAmount, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.giftAmount) &&
        Objects.equals(this.giftImageUrl, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.giftImageUrl) &&
        Objects.equals(this.giftName, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.giftName) &&
        Objects.equals(this.giftUnit, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.giftUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftAmount, giftImageUrl, giftName, giftUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner {\n");
    sb.append("    giftAmount: ").append(toIndentedString(giftAmount)).append("\n");
    sb.append("    giftImageUrl: ").append(toIndentedString(giftImageUrl)).append("\n");
    sb.append("    giftName: ").append(toIndentedString(giftName)).append("\n");
    sb.append("    giftUnit: ").append(toIndentedString(giftUnit)).append("\n");
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
    openapiFields.add("gift_amount");
    openapiFields.add("gift_image_url");
    openapiFields.add("gift_name");
    openapiFields.add("gift_unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner>() {
           @Override
           public void write(JsonWriter out, NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner
  */
  public static NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.class);
  }

 /**
  * Convert an instance of NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

