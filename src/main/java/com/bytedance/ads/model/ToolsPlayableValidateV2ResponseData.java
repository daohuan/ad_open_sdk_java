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
import com.bytedance.ads.model.ToolsPlayableValidateV2DataPlayableOrientation;
import com.bytedance.ads.model.ToolsPlayableValidateV2DataStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ToolsPlayableValidateV2ResponseData {
  public static final String SERIALIZED_NAME_FAIL_MESSAGE = "fail_message";
  @SerializedName(SERIALIZED_NAME_FAIL_MESSAGE)
  private String failMessage = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ID = "playable_id";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ID)
  private Long playableId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ORIENTATION = "playable_orientation";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ORIENTATION)
  private ToolsPlayableValidateV2DataPlayableOrientation playableOrientation = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsPlayableValidateV2DataStatus status = null;

  public ToolsPlayableValidateV2ResponseData() {
  }

  public ToolsPlayableValidateV2ResponseData failMessage(String failMessage) {
    
    this.failMessage = failMessage;
    return this;
  }

   /**
   * 验证失败原因
   * @return failMessage
  **/
  @javax.annotation.Nullable
  public String getFailMessage() {
    return failMessage;
  }


  public void setFailMessage(String failMessage) {
    this.failMessage = failMessage;
  }


  public ToolsPlayableValidateV2ResponseData playableId(Long playableId) {
    
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


  public ToolsPlayableValidateV2ResponseData playableOrientation(ToolsPlayableValidateV2DataPlayableOrientation playableOrientation) {
    
    this.playableOrientation = playableOrientation;
    return this;
  }

   /**
   * Get playableOrientation
   * @return playableOrientation
  **/
  @javax.annotation.Nullable
  public ToolsPlayableValidateV2DataPlayableOrientation getPlayableOrientation() {
    return playableOrientation;
  }


  public void setPlayableOrientation(ToolsPlayableValidateV2DataPlayableOrientation playableOrientation) {
    this.playableOrientation = playableOrientation;
  }


  public ToolsPlayableValidateV2ResponseData playableUrl(String playableUrl) {
    
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


  public ToolsPlayableValidateV2ResponseData status(ToolsPlayableValidateV2DataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsPlayableValidateV2DataStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsPlayableValidateV2DataStatus status) {
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
    ToolsPlayableValidateV2ResponseData toolsPlayableValidateV2ResponseData = (ToolsPlayableValidateV2ResponseData) o;
    return Objects.equals(this.failMessage, toolsPlayableValidateV2ResponseData.failMessage) &&
        Objects.equals(this.playableId, toolsPlayableValidateV2ResponseData.playableId) &&
        Objects.equals(this.playableOrientation, toolsPlayableValidateV2ResponseData.playableOrientation) &&
        Objects.equals(this.playableUrl, toolsPlayableValidateV2ResponseData.playableUrl) &&
        Objects.equals(this.status, toolsPlayableValidateV2ResponseData.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failMessage, playableId, playableOrientation, playableUrl, status);
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
    sb.append("class ToolsPlayableValidateV2ResponseData {\n");
    sb.append("    failMessage: ").append(toIndentedString(failMessage)).append("\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
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
    openapiFields.add("fail_message");
    openapiFields.add("playable_id");
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
       if (!ToolsPlayableValidateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPlayableValidateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPlayableValidateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPlayableValidateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPlayableValidateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsPlayableValidateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPlayableValidateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPlayableValidateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPlayableValidateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsPlayableValidateV2ResponseData
  */
  public static ToolsPlayableValidateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPlayableValidateV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsPlayableValidateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

