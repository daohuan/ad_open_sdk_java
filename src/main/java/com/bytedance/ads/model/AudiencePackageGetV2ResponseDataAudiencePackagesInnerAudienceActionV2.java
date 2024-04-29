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
import com.bytedance.ads.model.AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 {
  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private String actionCategories = null;

  public static final String SERIALIZED_NAME_ACTION_DAYS = "action_days";
  @SerializedName(SERIALIZED_NAME_ACTION_DAYS)
  private List<Long> actionDays = null;

  public static final String SERIALIZED_NAME_ACTION_SCENES = "action_scenes";
  @SerializedName(SERIALIZED_NAME_ACTION_SCENES)
  private List<AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes> actionScenes = null;

  public static final String SERIALIZED_NAME_VIDEO_ACTIONS = "video_actions";
  @SerializedName(SERIALIZED_NAME_VIDEO_ACTIONS)
  private String videoActions = null;

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2() {
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 actionCategories(String actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

   /**
   * 
   * @return actionCategories
  **/
  @javax.annotation.Nullable
  public String getActionCategories() {
    return actionCategories;
  }


  public void setActionCategories(String actionCategories) {
    this.actionCategories = actionCategories;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 actionDays(List<Long> actionDays) {
    
    this.actionDays = actionDays;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 addActionDaysItem(Long actionDaysItem) {
    if (this.actionDays == null) {
      this.actionDays = new ArrayList<>();
    }
    this.actionDays.add(actionDaysItem);
    return this;
  }

   /**
   * 
   * @return actionDays
  **/
  @javax.annotation.Nullable
  public List<Long> getActionDays() {
    return actionDays;
  }


  public void setActionDays(List<Long> actionDays) {
    this.actionDays = actionDays;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 actionScenes(List<AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes> actionScenes) {
    
    this.actionScenes = actionScenes;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 addActionScenesItem(AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes actionScenesItem) {
    if (this.actionScenes == null) {
      this.actionScenes = new ArrayList<>();
    }
    this.actionScenes.add(actionScenesItem);
    return this;
  }

   /**
   * 
   * @return actionScenes
  **/
  @javax.annotation.Nullable
  public List<AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes> getActionScenes() {
    return actionScenes;
  }


  public void setActionScenes(List<AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes> actionScenes) {
    this.actionScenes = actionScenes;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 videoActions(String videoActions) {
    
    this.videoActions = videoActions;
    return this;
  }

   /**
   * 
   * @return videoActions
  **/
  @javax.annotation.Nullable
  public String getVideoActions() {
    return videoActions;
  }


  public void setVideoActions(String videoActions) {
    this.videoActions = videoActions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 = (AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2) o;
    return Objects.equals(this.actionCategories, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2.actionCategories) &&
        Objects.equals(this.actionDays, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2.actionDays) &&
        Objects.equals(this.actionScenes, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2.actionScenes) &&
        Objects.equals(this.videoActions, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2.videoActions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCategories, actionDays, actionScenes, videoActions);
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
    sb.append("class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 {\n");
    sb.append("    actionCategories: ").append(toIndentedString(actionCategories)).append("\n");
    sb.append("    actionDays: ").append(toIndentedString(actionDays)).append("\n");
    sb.append("    actionScenes: ").append(toIndentedString(actionScenes)).append("\n");
    sb.append("    videoActions: ").append(toIndentedString(videoActions)).append("\n");
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
    openapiFields.add("action_categories");
    openapiFields.add("action_days");
    openapiFields.add("action_scenes");
    openapiFields.add("video_actions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2>() {
           @Override
           public void write(JsonWriter out, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2
  */
  public static AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2.class);
  }

 /**
  * Convert an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceActionV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

