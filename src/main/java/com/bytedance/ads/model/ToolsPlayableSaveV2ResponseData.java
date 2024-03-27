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
import com.bytedance.ads.model.ToolsPlayableSaveV2DataPlayableOrientation;
import com.bytedance.ads.model.ToolsPlayableSaveV2DataStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolsPlayableSaveV2ResponseData {
  public static final String SERIALIZED_NAME_PLAYABLE_ID = "playable_id";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ID)
  private Long playableId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_NAME = "playable_name";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_NAME)
  private String playableName = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ORIENTATION = "playable_orientation";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ORIENTATION)
  private ToolsPlayableSaveV2DataPlayableOrientation playableOrientation = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsPlayableSaveV2DataStatus status = null;

  public ToolsPlayableSaveV2ResponseData() {
  }

  public ToolsPlayableSaveV2ResponseData playableId(Long playableId) {
    
    this.playableId = playableId;
    return this;
  }

   /**
   * 试玩素材ID 
   * @return playableId
  **/
  @javax.annotation.Nullable
  public Long getPlayableId() {
    return playableId;
  }


  public void setPlayableId(Long playableId) {
    this.playableId = playableId;
  }


  public ToolsPlayableSaveV2ResponseData playableName(String playableName) {
    
    this.playableName = playableName;
    return this;
  }

   /**
   * 试玩素材名
   * @return playableName
  **/
  @javax.annotation.Nullable
  public String getPlayableName() {
    return playableName;
  }


  public void setPlayableName(String playableName) {
    this.playableName = playableName;
  }


  public ToolsPlayableSaveV2ResponseData playableOrientation(ToolsPlayableSaveV2DataPlayableOrientation playableOrientation) {
    
    this.playableOrientation = playableOrientation;
    return this;
  }

   /**
   * Get playableOrientation
   * @return playableOrientation
  **/
  @javax.annotation.Nullable
  public ToolsPlayableSaveV2DataPlayableOrientation getPlayableOrientation() {
    return playableOrientation;
  }


  public void setPlayableOrientation(ToolsPlayableSaveV2DataPlayableOrientation playableOrientation) {
    this.playableOrientation = playableOrientation;
  }


  public ToolsPlayableSaveV2ResponseData playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 试玩素材url
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public ToolsPlayableSaveV2ResponseData status(ToolsPlayableSaveV2DataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsPlayableSaveV2DataStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsPlayableSaveV2DataStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPlayableSaveV2ResponseData toolsPlayableSaveV2ResponseData = (ToolsPlayableSaveV2ResponseData) o;
    return Objects.equals(this.playableId, toolsPlayableSaveV2ResponseData.playableId) &&
        Objects.equals(this.playableName, toolsPlayableSaveV2ResponseData.playableName) &&
        Objects.equals(this.playableOrientation, toolsPlayableSaveV2ResponseData.playableOrientation) &&
        Objects.equals(this.playableUrl, toolsPlayableSaveV2ResponseData.playableUrl) &&
        Objects.equals(this.status, toolsPlayableSaveV2ResponseData.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(playableId, playableName, playableOrientation, playableUrl, status);
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
    sb.append("class ToolsPlayableSaveV2ResponseData {\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
    sb.append("    playableName: ").append(toIndentedString(playableName)).append("\n");
    sb.append("    playableOrientation: ").append(toIndentedString(playableOrientation)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("playable_id");
    openapiFields.add("playable_name");
    openapiFields.add("playable_orientation");
    openapiFields.add("playable_url");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPlayableSaveV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPlayableSaveV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPlayableSaveV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPlayableSaveV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPlayableSaveV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsPlayableSaveV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPlayableSaveV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPlayableSaveV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPlayableSaveV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsPlayableSaveV2ResponseData
  */
  public static ToolsPlayableSaveV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPlayableSaveV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsPlayableSaveV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

