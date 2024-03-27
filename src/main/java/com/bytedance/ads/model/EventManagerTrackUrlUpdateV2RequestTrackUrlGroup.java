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
 * 监测链接组信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class EventManagerTrackUrlUpdateV2RequestTrackUrlGroup {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private String actionTrackUrl = null;

  public static final String SERIALIZED_NAME_ACTIVE_TRACK_URL = "active_track_url";
  @SerializedName(SERIALIZED_NAME_ACTIVE_TRACK_URL)
  private String activeTrackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private String trackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUP_ID = "track_url_group_id";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUP_ID)
  private Long trackUrlGroupId = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUP_NAME = "track_url_group_name";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUP_NAME)
  private String trackUrlGroupName = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL = "video_play_done_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL)
  private String videoPlayDoneTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL = "video_play_effective_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL)
  private String videoPlayEffectiveTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL = "video_play_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL)
  private String videoPlayTrackUrl = null;

  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup() {
  }

  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup actionTrackUrl(String actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

   /**
   * 点击（监测链接）只允许传入1个
   * @return actionTrackUrl
  **/
  @javax.annotation.Nonnull
  public String getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(String actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup activeTrackUrl(String activeTrackUrl) {
    
    this.activeTrackUrl = activeTrackUrl;
    return this;
  }

   /**
   * 激活监测
   * @return activeTrackUrl
  **/
  @javax.annotation.Nullable
  public String getActiveTrackUrl() {
    return activeTrackUrl;
  }


  public void setActiveTrackUrl(String activeTrackUrl) {
    this.activeTrackUrl = activeTrackUrl;
  }


  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup trackUrl(String trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

   /**
   * 展示（监测链接）
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public String getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(String trackUrl) {
    this.trackUrl = trackUrl;
  }


  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup trackUrlGroupId(Long trackUrlGroupId) {
    
    this.trackUrlGroupId = trackUrlGroupId;
    return this;
  }

   /**
   * 监测链接组ID
   * @return trackUrlGroupId
  **/
  @javax.annotation.Nonnull
  public Long getTrackUrlGroupId() {
    return trackUrlGroupId;
  }


  public void setTrackUrlGroupId(Long trackUrlGroupId) {
    this.trackUrlGroupId = trackUrlGroupId;
  }


  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup trackUrlGroupName(String trackUrlGroupName) {
    
    this.trackUrlGroupName = trackUrlGroupName;
    return this;
  }

   /**
   * 监测链接组名称 应用资产必填
   * @return trackUrlGroupName
  **/
  @javax.annotation.Nullable
  public String getTrackUrlGroupName() {
    return trackUrlGroupName;
  }


  public void setTrackUrlGroupName(String trackUrlGroupName) {
    this.trackUrlGroupName = trackUrlGroupName;
  }


  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup videoPlayDoneTrackUrl(String videoPlayDoneTrackUrl) {
    
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

   /**
   * 视频播完（监测链接），只允许传入1个
   * @return videoPlayDoneTrackUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayDoneTrackUrl() {
    return videoPlayDoneTrackUrl;
  }


  public void setVideoPlayDoneTrackUrl(String videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
  }


  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup videoPlayEffectiveTrackUrl(String videoPlayEffectiveTrackUrl) {
    
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

   /**
   * 视频有效播放（监测链接），只允许传入1个
   * @return videoPlayEffectiveTrackUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayEffectiveTrackUrl() {
    return videoPlayEffectiveTrackUrl;
  }


  public void setVideoPlayEffectiveTrackUrl(String videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
  }


  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup videoPlayTrackUrl(String videoPlayTrackUrl) {
    
    this.videoPlayTrackUrl = videoPlayTrackUrl;
    return this;
  }

   /**
   * 视频播放（监测链接），只允许传入1个
   * @return videoPlayTrackUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayTrackUrl() {
    return videoPlayTrackUrl;
  }


  public void setVideoPlayTrackUrl(String videoPlayTrackUrl) {
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
    EventManagerTrackUrlUpdateV2RequestTrackUrlGroup eventManagerTrackUrlUpdateV2RequestTrackUrlGroup = (EventManagerTrackUrlUpdateV2RequestTrackUrlGroup) o;
    return Objects.equals(this.actionTrackUrl, eventManagerTrackUrlUpdateV2RequestTrackUrlGroup.actionTrackUrl) &&
        Objects.equals(this.activeTrackUrl, eventManagerTrackUrlUpdateV2RequestTrackUrlGroup.activeTrackUrl) &&
        Objects.equals(this.trackUrl, eventManagerTrackUrlUpdateV2RequestTrackUrlGroup.trackUrl) &&
        Objects.equals(this.trackUrlGroupId, eventManagerTrackUrlUpdateV2RequestTrackUrlGroup.trackUrlGroupId) &&
        Objects.equals(this.trackUrlGroupName, eventManagerTrackUrlUpdateV2RequestTrackUrlGroup.trackUrlGroupName) &&
        Objects.equals(this.videoPlayDoneTrackUrl, eventManagerTrackUrlUpdateV2RequestTrackUrlGroup.videoPlayDoneTrackUrl) &&
        Objects.equals(this.videoPlayEffectiveTrackUrl, eventManagerTrackUrlUpdateV2RequestTrackUrlGroup.videoPlayEffectiveTrackUrl) &&
        Objects.equals(this.videoPlayTrackUrl, eventManagerTrackUrlUpdateV2RequestTrackUrlGroup.videoPlayTrackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, activeTrackUrl, trackUrl, trackUrlGroupId, trackUrlGroupName, videoPlayDoneTrackUrl, videoPlayEffectiveTrackUrl, videoPlayTrackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerTrackUrlUpdateV2RequestTrackUrlGroup {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    activeTrackUrl: ").append(toIndentedString(activeTrackUrl)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
    sb.append("    trackUrlGroupId: ").append(toIndentedString(trackUrlGroupId)).append("\n");
    sb.append("    trackUrlGroupName: ").append(toIndentedString(trackUrlGroupName)).append("\n");
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
    openapiFields.add("active_track_url");
    openapiFields.add("track_url");
    openapiFields.add("track_url_group_id");
    openapiFields.add("track_url_group_name");
    openapiFields.add("video_play_done_track_url");
    openapiFields.add("video_play_effective_track_url");
    openapiFields.add("video_play_track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action_track_url");
    openapiRequiredFields.add("track_url_group_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerTrackUrlUpdateV2RequestTrackUrlGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerTrackUrlUpdateV2RequestTrackUrlGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerTrackUrlUpdateV2RequestTrackUrlGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerTrackUrlUpdateV2RequestTrackUrlGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerTrackUrlUpdateV2RequestTrackUrlGroup>() {
           @Override
           public void write(JsonWriter out, EventManagerTrackUrlUpdateV2RequestTrackUrlGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerTrackUrlUpdateV2RequestTrackUrlGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerTrackUrlUpdateV2RequestTrackUrlGroup
  * @throws IOException if the JSON string is invalid with respect to EventManagerTrackUrlUpdateV2RequestTrackUrlGroup
  */
  public static EventManagerTrackUrlUpdateV2RequestTrackUrlGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerTrackUrlUpdateV2RequestTrackUrlGroup.class);
  }

 /**
  * Convert an instance of EventManagerTrackUrlUpdateV2RequestTrackUrlGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

