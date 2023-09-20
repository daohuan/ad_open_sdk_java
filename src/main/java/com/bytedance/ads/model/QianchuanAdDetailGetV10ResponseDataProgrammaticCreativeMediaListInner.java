/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataProgrammaticCreativeMediaListImageMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T19:34:37.792107567+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanAdDetailGetV10DataProgrammaticCreativeMediaListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IS_AUTO_GENERATE = "is_auto_generate";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_GENERATE)
  private Long isAutoGenerate = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner() {
  }

  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner imageMode(QianchuanAdDetailGetV10DataProgrammaticCreativeMediaListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataProgrammaticCreativeMediaListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanAdDetailGetV10DataProgrammaticCreativeMediaListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner isAutoGenerate(Long isAutoGenerate) {
    
    this.isAutoGenerate = isAutoGenerate;
    return this;
  }

   /**
   * 
   * @return isAutoGenerate
  **/
  @javax.annotation.Nullable
  public Long getIsAutoGenerate() {
    return isAutoGenerate;
  }


  public void setIsAutoGenerate(Long isAutoGenerate) {
    this.isAutoGenerate = isAutoGenerate;
  }


  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner videoCoverId(String videoCoverId) {
    
    this.videoCoverId = videoCoverId;
    return this;
  }

   /**
   * 
   * @return videoCoverId
  **/
  @javax.annotation.Nullable
  public String getVideoCoverId() {
    return videoCoverId;
  }


  public void setVideoCoverId(String videoCoverId) {
    this.videoCoverId = videoCoverId;
  }


  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner videoId(String videoId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner = (QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner) o;
    return Objects.equals(this.awemeItemId, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.awemeItemId) &&
        Objects.equals(this.imageIds, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.imageIds) &&
        Objects.equals(this.imageMode, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.imageMode) &&
        Objects.equals(this.isAutoGenerate, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.isAutoGenerate) &&
        Objects.equals(this.title, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.title) &&
        Objects.equals(this.videoCoverId, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.videoCoverId) &&
        Objects.equals(this.videoId, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, imageIds, imageMode, isAutoGenerate, title, videoCoverId, videoId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    isAutoGenerate: ").append(toIndentedString(isAutoGenerate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoCoverId: ").append(toIndentedString(videoCoverId)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("image_ids");
    openapiFields.add("image_mode");
    openapiFields.add("is_auto_generate");
    openapiFields.add("title");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner
  */
  public static QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeMediaListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

