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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataTrackUrl {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private List<String> actionTrackUrl = null;

  public static final String SERIALIZED_NAME_SHOW_TRACK_URL = "show_track_url";
  @SerializedName(SERIALIZED_NAME_SHOW_TRACK_URL)
  private List<String> showTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL = "video_play_effective_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL)
  private List<String> videoPlayEffectiveTrackUrl = null;

  public QianchuanAdDetailGetV10ResponseDataTrackUrl() {
  }

  public QianchuanAdDetailGetV10ResponseDataTrackUrl actionTrackUrl(List<String> actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataTrackUrl addActionTrackUrlItem(String actionTrackUrlItem) {
    if (this.actionTrackUrl == null) {
      this.actionTrackUrl = new ArrayList<>();
    }
    this.actionTrackUrl.add(actionTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return actionTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public QianchuanAdDetailGetV10ResponseDataTrackUrl showTrackUrl(List<String> showTrackUrl) {
    
    this.showTrackUrl = showTrackUrl;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataTrackUrl addShowTrackUrlItem(String showTrackUrlItem) {
    if (this.showTrackUrl == null) {
      this.showTrackUrl = new ArrayList<>();
    }
    this.showTrackUrl.add(showTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return showTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getShowTrackUrl() {
    return showTrackUrl;
  }


  public void setShowTrackUrl(List<String> showTrackUrl) {
    this.showTrackUrl = showTrackUrl;
  }


  public QianchuanAdDetailGetV10ResponseDataTrackUrl videoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataTrackUrl addVideoPlayEffectiveTrackUrlItem(String videoPlayEffectiveTrackUrlItem) {
    if (this.videoPlayEffectiveTrackUrl == null) {
      this.videoPlayEffectiveTrackUrl = new ArrayList<>();
    }
    this.videoPlayEffectiveTrackUrl.add(videoPlayEffectiveTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return videoPlayEffectiveTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayEffectiveTrackUrl() {
    return videoPlayEffectiveTrackUrl;
  }


  public void setVideoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdDetailGetV10ResponseDataTrackUrl qianchuanAdDetailGetV10ResponseDataTrackUrl = (QianchuanAdDetailGetV10ResponseDataTrackUrl) o;
    return Objects.equals(this.actionTrackUrl, qianchuanAdDetailGetV10ResponseDataTrackUrl.actionTrackUrl) &&
        Objects.equals(this.showTrackUrl, qianchuanAdDetailGetV10ResponseDataTrackUrl.showTrackUrl) &&
        Objects.equals(this.videoPlayEffectiveTrackUrl, qianchuanAdDetailGetV10ResponseDataTrackUrl.videoPlayEffectiveTrackUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, showTrackUrl, videoPlayEffectiveTrackUrl);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataTrackUrl {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    showTrackUrl: ").append(toIndentedString(showTrackUrl)).append("\n");
    sb.append("    videoPlayEffectiveTrackUrl: ").append(toIndentedString(videoPlayEffectiveTrackUrl)).append("\n");
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
    openapiFields.add("show_track_url");
    openapiFields.add("video_play_effective_track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataTrackUrl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataTrackUrl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataTrackUrl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataTrackUrl.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataTrackUrl>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataTrackUrl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataTrackUrl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataTrackUrl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataTrackUrl
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataTrackUrl
  */
  public static QianchuanAdDetailGetV10ResponseDataTrackUrl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataTrackUrl.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataTrackUrl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

