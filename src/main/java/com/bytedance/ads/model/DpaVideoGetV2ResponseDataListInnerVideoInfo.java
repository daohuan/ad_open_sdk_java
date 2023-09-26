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
import com.bytedance.ads.model.DpaVideoGetV2DataListVideoInfoImageMode;
import com.bytedance.ads.model.DpaVideoGetV2DataListVideoInfoStatus;
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
public class DpaVideoGetV2ResponseDataListInnerVideoInfo {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private DpaVideoGetV2DataListVideoInfoImageMode imageMode = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DpaVideoGetV2DataListVideoInfoStatus status = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public DpaVideoGetV2ResponseDataListInnerVideoInfo() {
  }

  public DpaVideoGetV2ResponseDataListInnerVideoInfo height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public DpaVideoGetV2ResponseDataListInnerVideoInfo imageMode(DpaVideoGetV2DataListVideoInfoImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public DpaVideoGetV2DataListVideoInfoImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(DpaVideoGetV2DataListVideoInfoImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public DpaVideoGetV2ResponseDataListInnerVideoInfo status(DpaVideoGetV2DataListVideoInfoStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public DpaVideoGetV2DataListVideoInfoStatus getStatus() {
    return status;
  }


  public void setStatus(DpaVideoGetV2DataListVideoInfoStatus status) {
    this.status = status;
  }


  public DpaVideoGetV2ResponseDataListInnerVideoInfo videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public DpaVideoGetV2ResponseDataListInnerVideoInfo width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaVideoGetV2ResponseDataListInnerVideoInfo dpaVideoGetV2ResponseDataListInnerVideoInfo = (DpaVideoGetV2ResponseDataListInnerVideoInfo) o;
    return Objects.equals(this.height, dpaVideoGetV2ResponseDataListInnerVideoInfo.height) &&
        Objects.equals(this.imageMode, dpaVideoGetV2ResponseDataListInnerVideoInfo.imageMode) &&
        Objects.equals(this.status, dpaVideoGetV2ResponseDataListInnerVideoInfo.status) &&
        Objects.equals(this.videoId, dpaVideoGetV2ResponseDataListInnerVideoInfo.videoId) &&
        Objects.equals(this.width, dpaVideoGetV2ResponseDataListInnerVideoInfo.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, imageMode, status, videoId, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaVideoGetV2ResponseDataListInnerVideoInfo {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("image_mode");
    openapiFields.add("status");
    openapiFields.add("video_id");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaVideoGetV2ResponseDataListInnerVideoInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaVideoGetV2ResponseDataListInnerVideoInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaVideoGetV2ResponseDataListInnerVideoInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaVideoGetV2ResponseDataListInnerVideoInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaVideoGetV2ResponseDataListInnerVideoInfo>() {
           @Override
           public void write(JsonWriter out, DpaVideoGetV2ResponseDataListInnerVideoInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaVideoGetV2ResponseDataListInnerVideoInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaVideoGetV2ResponseDataListInnerVideoInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaVideoGetV2ResponseDataListInnerVideoInfo
  * @throws IOException if the JSON string is invalid with respect to DpaVideoGetV2ResponseDataListInnerVideoInfo
  */
  public static DpaVideoGetV2ResponseDataListInnerVideoInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaVideoGetV2ResponseDataListInnerVideoInfo.class);
  }

 /**
  * Convert an instance of DpaVideoGetV2ResponseDataListInnerVideoInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

