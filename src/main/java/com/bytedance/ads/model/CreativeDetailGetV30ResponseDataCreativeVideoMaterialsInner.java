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
import com.bytedance.ads.model.CreativeDetailGetV30DataCreativeVideoMaterialsDpaVideoTemplateType;
import com.bytedance.ads.model.CreativeDetailGetV30DataCreativeVideoMaterialsImageMode;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerImageInfo;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerVideoInfo;
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
 * CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_DPA_VIDEO_TASK_IDS = "dpa_video_task_ids";
  @SerializedName(SERIALIZED_NAME_DPA_VIDEO_TASK_IDS)
  private List<String> dpaVideoTaskIds = null;

  public static final String SERIALIZED_NAME_DPA_VIDEO_TEMPLATE_TYPE = "dpa_video_template_type";
  @SerializedName(SERIALIZED_NAME_DPA_VIDEO_TEMPLATE_TYPE)
  private CreativeDetailGetV30DataCreativeVideoMaterialsDpaVideoTemplateType dpaVideoTemplateType = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerImageInfo imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeDetailGetV30DataCreativeVideoMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerVideoInfo videoInfo = null;

  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner() {
  }

  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 抖音短视频ID
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner dpaVideoTaskIds(List<String> dpaVideoTaskIds) {
    
    this.dpaVideoTaskIds = dpaVideoTaskIds;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner addDpaVideoTaskIdsItem(String dpaVideoTaskIdsItem) {
    if (this.dpaVideoTaskIds == null) {
      this.dpaVideoTaskIds = new ArrayList<>();
    }
    this.dpaVideoTaskIds.add(dpaVideoTaskIdsItem);
    return this;
  }

   /**
   * 自定义商品库视频模板ID
   * @return dpaVideoTaskIds
  **/
  @javax.annotation.Nullable
  public List<String> getDpaVideoTaskIds() {
    return dpaVideoTaskIds;
  }


  public void setDpaVideoTaskIds(List<String> dpaVideoTaskIds) {
    this.dpaVideoTaskIds = dpaVideoTaskIds;
  }


  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner dpaVideoTemplateType(CreativeDetailGetV30DataCreativeVideoMaterialsDpaVideoTemplateType dpaVideoTemplateType) {
    
    this.dpaVideoTemplateType = dpaVideoTemplateType;
    return this;
  }

   /**
   * Get dpaVideoTemplateType
   * @return dpaVideoTemplateType
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataCreativeVideoMaterialsDpaVideoTemplateType getDpaVideoTemplateType() {
    return dpaVideoTemplateType;
  }


  public void setDpaVideoTemplateType(CreativeDetailGetV30DataCreativeVideoMaterialsDpaVideoTemplateType dpaVideoTemplateType) {
    this.dpaVideoTemplateType = dpaVideoTemplateType;
  }


  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner imageInfo(CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }


  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner imageMode(CreativeDetailGetV30DataCreativeVideoMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataCreativeVideoMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeDetailGetV30DataCreativeVideoMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner videoInfo(CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInnerVideoInfo videoInfo) {
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
    CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner creativeDetailGetV30ResponseDataCreativeVideoMaterialsInner = (CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner) o;
    return Objects.equals(this.awemeItemId, creativeDetailGetV30ResponseDataCreativeVideoMaterialsInner.awemeItemId) &&
        Objects.equals(this.dpaVideoTaskIds, creativeDetailGetV30ResponseDataCreativeVideoMaterialsInner.dpaVideoTaskIds) &&
        Objects.equals(this.dpaVideoTemplateType, creativeDetailGetV30ResponseDataCreativeVideoMaterialsInner.dpaVideoTemplateType) &&
        Objects.equals(this.imageInfo, creativeDetailGetV30ResponseDataCreativeVideoMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, creativeDetailGetV30ResponseDataCreativeVideoMaterialsInner.imageMode) &&
        Objects.equals(this.videoInfo, creativeDetailGetV30ResponseDataCreativeVideoMaterialsInner.videoInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, dpaVideoTaskIds, dpaVideoTemplateType, imageInfo, imageMode, videoInfo);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    dpaVideoTaskIds: ").append(toIndentedString(dpaVideoTaskIds)).append("\n");
    sb.append("    dpaVideoTemplateType: ").append(toIndentedString(dpaVideoTemplateType)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("dpa_video_task_ids");
    openapiFields.add("dpa_video_template_type");
    openapiFields.add("image_info");
    openapiFields.add("image_mode");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner
  */
  public static CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
