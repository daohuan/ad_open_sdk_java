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
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoTrackUrlSettingTrackUrlType;
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
 * 监测链接设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private List<String> actionTrackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private List<String> trackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUP_ID = "track_url_group_id";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUP_ID)
  private Long trackUrlGroupId = null;

  public static final String SERIALIZED_NAME_TRACK_URL_TYPE = "track_url_type";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_TYPE)
  private AdlabGroupUpdateV30AdInfoTrackUrlSettingTrackUrlType trackUrlType = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL = "video_play_done_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL)
  private List<String> videoPlayDoneTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL = "video_play_effective_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL)
  private List<String> videoPlayEffectiveTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL = "video_play_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL)
  private List<String> videoPlayTrackUrl = null;

  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting() {
  }

  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting actionTrackUrl(List<String> actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting addActionTrackUrlItem(String actionTrackUrlItem) {
    if (this.actionTrackUrl == null) {
      this.actionTrackUrl = new ArrayList<>();
    }
    this.actionTrackUrl.add(actionTrackUrlItem);
    return this;
  }

   /**
   * 点击（监测链接），只允许传入1个
   * @return actionTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting trackUrl(List<String> trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting addTrackUrlItem(String trackUrlItem) {
    if (this.trackUrl == null) {
      this.trackUrl = new ArrayList<>();
    }
    this.trackUrl.add(trackUrlItem);
    return this;
  }

   /**
   * 展示（监测链接），只允许传入1个
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(List<String> trackUrl) {
    this.trackUrl = trackUrl;
  }


  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting trackUrlGroupId(Long trackUrlGroupId) {
    
    this.trackUrlGroupId = trackUrlGroupId;
    return this;
  }

   /**
   * 监测链接组id 当 track_url_type&#x3D;EXISTED时必填
   * @return trackUrlGroupId
  **/
  @javax.annotation.Nullable
  public Long getTrackUrlGroupId() {
    return trackUrlGroupId;
  }


  public void setTrackUrlGroupId(Long trackUrlGroupId) {
    this.trackUrlGroupId = trackUrlGroupId;
  }


  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting trackUrlType(AdlabGroupUpdateV30AdInfoTrackUrlSettingTrackUrlType trackUrlType) {
    
    this.trackUrlType = trackUrlType;
    return this;
  }

   /**
   * Get trackUrlType
   * @return trackUrlType
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30AdInfoTrackUrlSettingTrackUrlType getTrackUrlType() {
    return trackUrlType;
  }


  public void setTrackUrlType(AdlabGroupUpdateV30AdInfoTrackUrlSettingTrackUrlType trackUrlType) {
    this.trackUrlType = trackUrlType;
  }


  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting videoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting addVideoPlayDoneTrackUrlItem(String videoPlayDoneTrackUrlItem) {
    if (this.videoPlayDoneTrackUrl == null) {
      this.videoPlayDoneTrackUrl = new ArrayList<>();
    }
    this.videoPlayDoneTrackUrl.add(videoPlayDoneTrackUrlItem);
    return this;
  }

   /**
   * 视频播完（监测链接），只允许传入1个 投放范围为穿山甲时暂不支持设置此链接
   * @return videoPlayDoneTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayDoneTrackUrl() {
    return videoPlayDoneTrackUrl;
  }


  public void setVideoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
  }


  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting videoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting addVideoPlayEffectiveTrackUrlItem(String videoPlayEffectiveTrackUrlItem) {
    if (this.videoPlayEffectiveTrackUrl == null) {
      this.videoPlayEffectiveTrackUrl = new ArrayList<>();
    }
    this.videoPlayEffectiveTrackUrl.add(videoPlayEffectiveTrackUrlItem);
    return this;
  }

   /**
   * 视频有效播放（监测链接），只允许传入1个 投放范围为穿山甲时暂不支持设置此链接
   * @return videoPlayEffectiveTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayEffectiveTrackUrl() {
    return videoPlayEffectiveTrackUrl;
  }


  public void setVideoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
  }


  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting videoPlayTrackUrl(List<String> videoPlayTrackUrl) {
    
    this.videoPlayTrackUrl = videoPlayTrackUrl;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting addVideoPlayTrackUrlItem(String videoPlayTrackUrlItem) {
    if (this.videoPlayTrackUrl == null) {
      this.videoPlayTrackUrl = new ArrayList<>();
    }
    this.videoPlayTrackUrl.add(videoPlayTrackUrlItem);
    return this;
  }

   /**
   * 视频开始播放（监测链接），只允许传入1个 投放范围为穿山甲时暂不支持设置此链接
   * @return videoPlayTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayTrackUrl() {
    return videoPlayTrackUrl;
  }


  public void setVideoPlayTrackUrl(List<String> videoPlayTrackUrl) {
    this.videoPlayTrackUrl = videoPlayTrackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting adlabGroupUpdateV30RequestAdInfoTrackUrlSetting = (AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting) o;
    return Objects.equals(this.actionTrackUrl, adlabGroupUpdateV30RequestAdInfoTrackUrlSetting.actionTrackUrl) &&
        Objects.equals(this.trackUrl, adlabGroupUpdateV30RequestAdInfoTrackUrlSetting.trackUrl) &&
        Objects.equals(this.trackUrlGroupId, adlabGroupUpdateV30RequestAdInfoTrackUrlSetting.trackUrlGroupId) &&
        Objects.equals(this.trackUrlType, adlabGroupUpdateV30RequestAdInfoTrackUrlSetting.trackUrlType) &&
        Objects.equals(this.videoPlayDoneTrackUrl, adlabGroupUpdateV30RequestAdInfoTrackUrlSetting.videoPlayDoneTrackUrl) &&
        Objects.equals(this.videoPlayEffectiveTrackUrl, adlabGroupUpdateV30RequestAdInfoTrackUrlSetting.videoPlayEffectiveTrackUrl) &&
        Objects.equals(this.videoPlayTrackUrl, adlabGroupUpdateV30RequestAdInfoTrackUrlSetting.videoPlayTrackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, trackUrl, trackUrlGroupId, trackUrlType, videoPlayDoneTrackUrl, videoPlayEffectiveTrackUrl, videoPlayTrackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
    sb.append("    trackUrlGroupId: ").append(toIndentedString(trackUrlGroupId)).append("\n");
    sb.append("    trackUrlType: ").append(toIndentedString(trackUrlType)).append("\n");
    sb.append("    videoPlayDoneTrackUrl: ").append(toIndentedString(videoPlayDoneTrackUrl)).append("\n");
    sb.append("    videoPlayEffectiveTrackUrl: ").append(toIndentedString(videoPlayEffectiveTrackUrl)).append("\n");
    sb.append("    videoPlayTrackUrl: ").append(toIndentedString(videoPlayTrackUrl)).append("\n");
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
    openapiFields.add("action_track_url");
    openapiFields.add("track_url");
    openapiFields.add("track_url_group_id");
    openapiFields.add("track_url_type");
    openapiFields.add("video_play_done_track_url");
    openapiFields.add("video_play_effective_track_url");
    openapiFields.add("video_play_track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting
  */
  public static AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

