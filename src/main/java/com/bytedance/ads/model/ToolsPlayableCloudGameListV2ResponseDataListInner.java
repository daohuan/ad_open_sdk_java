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
import com.bytedance.ads.model.ToolsPlayableCloudGameListV2DataListAdStatus;
import com.bytedance.ads.model.ToolsPlayableCloudGameListV2DataListOrientation;
import com.bytedance.ads.model.ToolsPlayableCloudGameListV2DataListStatus;
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
 * ToolsPlayableCloudGameListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class ToolsPlayableCloudGameListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_STATUS = "ad_status";
  @SerializedName(SERIALIZED_NAME_AD_STATUS)
  private ToolsPlayableCloudGameListV2DataListAdStatus adStatus = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_TIME_END = "effective_time_end";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_TIME_END)
  private String effectiveTimeEnd = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_TIME_START = "effective_time_start";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_TIME_START)
  private String effectiveTimeStart = null;

  public static final String SERIALIZED_NAME_GAME_ID = "game_id";
  @SerializedName(SERIALIZED_NAME_GAME_ID)
  private String gameId = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_ORIENTATION = "orientation";
  @SerializedName(SERIALIZED_NAME_ORIENTATION)
  private ToolsPlayableCloudGameListV2DataListOrientation orientation = null;

  public static final String SERIALIZED_NAME_PREVIEW_URL = "preview_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private String previewUrl = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsPlayableCloudGameListV2DataListStatus status = null;

  public static final String SERIALIZED_NAME_TRIAL_TIME = "trial_time";
  @SerializedName(SERIALIZED_NAME_TRIAL_TIME)
  private Long trialTime = null;

  public ToolsPlayableCloudGameListV2ResponseDataListInner() {
  }

  public ToolsPlayableCloudGameListV2ResponseDataListInner adStatus(ToolsPlayableCloudGameListV2DataListAdStatus adStatus) {
    
    this.adStatus = adStatus;
    return this;
  }

   /**
   * Get adStatus
   * @return adStatus
  **/
  @javax.annotation.Nullable
  public ToolsPlayableCloudGameListV2DataListAdStatus getAdStatus() {
    return adStatus;
  }


  public void setAdStatus(ToolsPlayableCloudGameListV2DataListAdStatus adStatus) {
    this.adStatus = adStatus;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner effectiveTimeEnd(String effectiveTimeEnd) {
    
    this.effectiveTimeEnd = effectiveTimeEnd;
    return this;
  }

   /**
   * 
   * @return effectiveTimeEnd
  **/
  @javax.annotation.Nullable
  public String getEffectiveTimeEnd() {
    return effectiveTimeEnd;
  }


  public void setEffectiveTimeEnd(String effectiveTimeEnd) {
    this.effectiveTimeEnd = effectiveTimeEnd;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner effectiveTimeStart(String effectiveTimeStart) {
    
    this.effectiveTimeStart = effectiveTimeStart;
    return this;
  }

   /**
   * 
   * @return effectiveTimeStart
  **/
  @javax.annotation.Nullable
  public String getEffectiveTimeStart() {
    return effectiveTimeStart;
  }


  public void setEffectiveTimeStart(String effectiveTimeStart) {
    this.effectiveTimeStart = effectiveTimeStart;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner gameId(String gameId) {
    
    this.gameId = gameId;
    return this;
  }

   /**
   * 
   * @return gameId
  **/
  @javax.annotation.Nullable
  public String getGameId() {
    return gameId;
  }


  public void setGameId(String gameId) {
    this.gameId = gameId;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner orientation(ToolsPlayableCloudGameListV2DataListOrientation orientation) {
    
    this.orientation = orientation;
    return this;
  }

   /**
   * Get orientation
   * @return orientation
  **/
  @javax.annotation.Nullable
  public ToolsPlayableCloudGameListV2DataListOrientation getOrientation() {
    return orientation;
  }


  public void setOrientation(ToolsPlayableCloudGameListV2DataListOrientation orientation) {
    this.orientation = orientation;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner previewUrl(String previewUrl) {
    
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * 
   * @return previewUrl
  **/
  @javax.annotation.Nullable
  public String getPreviewUrl() {
    return previewUrl;
  }


  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner status(ToolsPlayableCloudGameListV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsPlayableCloudGameListV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsPlayableCloudGameListV2DataListStatus status) {
    this.status = status;
  }


  public ToolsPlayableCloudGameListV2ResponseDataListInner trialTime(Long trialTime) {
    
    this.trialTime = trialTime;
    return this;
  }

   /**
   * 
   * @return trialTime
  **/
  @javax.annotation.Nullable
  public Long getTrialTime() {
    return trialTime;
  }


  public void setTrialTime(Long trialTime) {
    this.trialTime = trialTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPlayableCloudGameListV2ResponseDataListInner toolsPlayableCloudGameListV2ResponseDataListInner = (ToolsPlayableCloudGameListV2ResponseDataListInner) o;
    return Objects.equals(this.adStatus, toolsPlayableCloudGameListV2ResponseDataListInner.adStatus) &&
        Objects.equals(this.advertiserId, toolsPlayableCloudGameListV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.createTime, toolsPlayableCloudGameListV2ResponseDataListInner.createTime) &&
        Objects.equals(this.effectiveTimeEnd, toolsPlayableCloudGameListV2ResponseDataListInner.effectiveTimeEnd) &&
        Objects.equals(this.effectiveTimeStart, toolsPlayableCloudGameListV2ResponseDataListInner.effectiveTimeStart) &&
        Objects.equals(this.gameId, toolsPlayableCloudGameListV2ResponseDataListInner.gameId) &&
        Objects.equals(this.id, toolsPlayableCloudGameListV2ResponseDataListInner.id) &&
        Objects.equals(this.modifyTime, toolsPlayableCloudGameListV2ResponseDataListInner.modifyTime) &&
        Objects.equals(this.name, toolsPlayableCloudGameListV2ResponseDataListInner.name) &&
        Objects.equals(this.orientation, toolsPlayableCloudGameListV2ResponseDataListInner.orientation) &&
        Objects.equals(this.previewUrl, toolsPlayableCloudGameListV2ResponseDataListInner.previewUrl) &&
        Objects.equals(this.status, toolsPlayableCloudGameListV2ResponseDataListInner.status) &&
        Objects.equals(this.trialTime, toolsPlayableCloudGameListV2ResponseDataListInner.trialTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adStatus, advertiserId, createTime, effectiveTimeEnd, effectiveTimeStart, gameId, id, modifyTime, name, orientation, previewUrl, status, trialTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPlayableCloudGameListV2ResponseDataListInner {\n");
    sb.append("    adStatus: ").append(toIndentedString(adStatus)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    effectiveTimeEnd: ").append(toIndentedString(effectiveTimeEnd)).append("\n");
    sb.append("    effectiveTimeStart: ").append(toIndentedString(effectiveTimeStart)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trialTime: ").append(toIndentedString(trialTime)).append("\n");
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
    openapiFields.add("ad_status");
    openapiFields.add("advertiser_id");
    openapiFields.add("create_time");
    openapiFields.add("effective_time_end");
    openapiFields.add("effective_time_start");
    openapiFields.add("game_id");
    openapiFields.add("id");
    openapiFields.add("modify_time");
    openapiFields.add("name");
    openapiFields.add("orientation");
    openapiFields.add("preview_url");
    openapiFields.add("status");
    openapiFields.add("trial_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPlayableCloudGameListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPlayableCloudGameListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPlayableCloudGameListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPlayableCloudGameListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPlayableCloudGameListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPlayableCloudGameListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPlayableCloudGameListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPlayableCloudGameListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPlayableCloudGameListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPlayableCloudGameListV2ResponseDataListInner
  */
  public static ToolsPlayableCloudGameListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPlayableCloudGameListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsPlayableCloudGameListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

