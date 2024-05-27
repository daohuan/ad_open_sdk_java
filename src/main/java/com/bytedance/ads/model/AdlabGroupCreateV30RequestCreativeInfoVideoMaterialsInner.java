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
import com.bytedance.ads.model.AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerImageInfoInner;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerVideoInfo;
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
 * AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner {
  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private List<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerImageInfoInner> imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerVideoInfo videoInfo = null;

  public AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner() {
  }

  public AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner imageInfo(List<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerImageInfoInner> imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

  public AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner addImageInfoItem(AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerImageInfoInner imageInfoItem) {
    if (this.imageInfo == null) {
      this.imageInfo = new ArrayList<>();
    }
    this.imageInfo.add(imageInfoItem);
    return this;
  }

   /**
   * 视频封面信息
   * @return imageInfo
  **/
  @javax.annotation.Nonnull
  public List<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerImageInfoInner> getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(List<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerImageInfoInner> imageInfo) {
    this.imageInfo = imageInfo;
  }


  public AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner imageMode(AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner videoInfo(AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInnerVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner adlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner = (AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner) o;
    return Objects.equals(this.imageInfo, adlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, adlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner.imageMode) &&
        Objects.equals(this.videoInfo, adlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfo, imageMode, videoInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner {\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_info");
    openapiRequiredFields.add("image_mode");
    openapiRequiredFields.add("video_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner
  */
  public static AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

