/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupUpdateV30CreativeInfoImageMaterialsImageMode;
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner;
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
 * AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner {
  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private List<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner> imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private AdlabGroupUpdateV30CreativeInfoImageMaterialsImageMode imageMode = null;

  public AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner() {
  }

  public AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner imageInfo(List<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner> imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

  public AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner addImageInfoItem(AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner imageInfoItem) {
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
  public List<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner> getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(List<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInnerImageInfoInner> imageInfo) {
    this.imageInfo = imageInfo;
  }


  public AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner imageMode(AdlabGroupUpdateV30CreativeInfoImageMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public AdlabGroupUpdateV30CreativeInfoImageMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(AdlabGroupUpdateV30CreativeInfoImageMaterialsImageMode imageMode) {
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
    AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner adlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner = (AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner) o;
    return Objects.equals(this.imageInfo, adlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, adlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner.imageMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfo, imageMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner {\n");
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
       if (!AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner
  */
  public static AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

