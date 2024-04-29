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
import com.bytedance.ads.model.AdlabGroupCreateV30CreativeInfoImageMaterialsImageMode;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner;
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
 * AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner {
  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private List<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner> imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private AdlabGroupCreateV30CreativeInfoImageMaterialsImageMode imageMode = null;

  public AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner() {
  }

  public AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner imageInfo(List<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner> imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

  public AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner addImageInfoItem(AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner imageInfoItem) {
    if (this.imageInfo == null) {
      this.imageInfo = new ArrayList<>();
    }
    this.imageInfo.add(imageInfoItem);
    return this;
  }

   /**
   * 图片信息
   * @return imageInfo
  **/
  @javax.annotation.Nonnull
  public List<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner> getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(List<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner> imageInfo) {
    this.imageInfo = imageInfo;
  }


  public AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner imageMode(AdlabGroupCreateV30CreativeInfoImageMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30CreativeInfoImageMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(AdlabGroupCreateV30CreativeInfoImageMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner adlabGroupCreateV30RequestCreativeInfoImageMaterialsInner = (AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner) o;
    return Objects.equals(this.imageInfo, adlabGroupCreateV30RequestCreativeInfoImageMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, adlabGroupCreateV30RequestCreativeInfoImageMaterialsInner.imageMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfo, imageMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner {\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
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
    openapiFields.add("image_info");
    openapiFields.add("image_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_info");
    openapiRequiredFields.add("image_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner
  */
  public static AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

