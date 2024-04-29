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
import com.bytedance.ads.model.NativeAnchorCreateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit;
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
 * NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner {
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
  private NativeAnchorCreateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit giftUnit = null;

  public NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner() {
  }

  public NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner giftAmount(Long giftAmount) {
    
    this.giftAmount = giftAmount;
    return this;
  }

   /**
   * 礼品数量，0～6
   * @return giftAmount
  **/
  @javax.annotation.Nullable
  public Long getGiftAmount() {
    return giftAmount;
  }


  public void setGiftAmount(Long giftAmount) {
    this.giftAmount = giftAmount;
  }


  public NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner giftImageUrl(String giftImageUrl) {
    
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


  public NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner giftName(String giftName) {
    
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


  public NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner giftUnit(NativeAnchorCreateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit giftUnit) {
    
    this.giftUnit = giftUnit;
    return this;
  }

   /**
   * Get giftUnit
   * @return giftUnit
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit getGiftUnit() {
    return giftUnit;
  }


  public void setGiftUnit(NativeAnchorCreateV30AnchorInfoGameAnchorGamePackageListGiftGiftUnit giftUnit) {
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
    NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner nativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner = (NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner) o;
    return Objects.equals(this.giftAmount, nativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.giftAmount) &&
        Objects.equals(this.giftImageUrl, nativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.giftImageUrl) &&
        Objects.equals(this.giftName, nativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.giftName) &&
        Objects.equals(this.giftUnit, nativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.giftUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftAmount, giftImageUrl, giftName, giftUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner {\n");
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
       if (!NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner>() {
           @Override
           public void write(JsonWriter out, NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner
  */
  public static NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner.class);
  }

 /**
  * Convert an instance of NativeAnchorCreateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

