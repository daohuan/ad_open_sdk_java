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
import com.bytedance.ads.model.StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements;
import com.bytedance.ads.model.StardeliveryTaskUpdateV30RequestTaskContactInfo;
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
 * StardeliveryTaskUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class StardeliveryTaskUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTHOR_TASK_NAME = "author_task_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_TASK_NAME)
  private String authorTaskName = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ID = "star_task_id";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ID)
  private Long starTaskId = null;

  public static final String SERIALIZED_NAME_STAR_TASK_MATERIALS_REQUIREMENTS = "star_task_materials_requirements";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_MATERIALS_REQUIREMENTS)
  private StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements starTaskMaterialsRequirements = null;

  public static final String SERIALIZED_NAME_STAR_TASK_NAME = "star_task_name";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_NAME)
  private String starTaskName = null;

  public static final String SERIALIZED_NAME_TASK_AVATAR_ID = "task_avatar_id";
  @SerializedName(SERIALIZED_NAME_TASK_AVATAR_ID)
  private String taskAvatarId = null;

  public static final String SERIALIZED_NAME_TASK_CONTACT_INFO = "task_contact_info";
  @SerializedName(SERIALIZED_NAME_TASK_CONTACT_INFO)
  private StardeliveryTaskUpdateV30RequestTaskContactInfo taskContactInfo = null;

  public static final String SERIALIZED_NAME_TASK_HEAD_IMAGE_ID = "task_head_image_id";
  @SerializedName(SERIALIZED_NAME_TASK_HEAD_IMAGE_ID)
  private String taskHeadImageId = null;

  public static final String SERIALIZED_NAME_TASK_PRODUCT_INTRODUCTION = "task_product_introduction";
  @SerializedName(SERIALIZED_NAME_TASK_PRODUCT_INTRODUCTION)
  private String taskProductIntroduction = null;

  public static final String SERIALIZED_NAME_TASK_PRODUCT_NAME = "task_product_name";
  @SerializedName(SERIALIZED_NAME_TASK_PRODUCT_NAME)
  private String taskProductName = null;

  public StardeliveryTaskUpdateV30Request() {
  }

  public StardeliveryTaskUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StardeliveryTaskUpdateV30Request authorTaskName(String authorTaskName) {
    
    this.authorTaskName = authorTaskName;
    return this;
  }

   /**
   * 
   * @return authorTaskName
  **/
  @javax.annotation.Nonnull
  public String getAuthorTaskName() {
    return authorTaskName;
  }


  public void setAuthorTaskName(String authorTaskName) {
    this.authorTaskName = authorTaskName;
  }


  public StardeliveryTaskUpdateV30Request starTaskId(Long starTaskId) {
    
    this.starTaskId = starTaskId;
    return this;
  }

   /**
   * 
   * @return starTaskId
  **/
  @javax.annotation.Nonnull
  public Long getStarTaskId() {
    return starTaskId;
  }


  public void setStarTaskId(Long starTaskId) {
    this.starTaskId = starTaskId;
  }


  public StardeliveryTaskUpdateV30Request starTaskMaterialsRequirements(StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements starTaskMaterialsRequirements) {
    
    this.starTaskMaterialsRequirements = starTaskMaterialsRequirements;
    return this;
  }

   /**
   * Get starTaskMaterialsRequirements
   * @return starTaskMaterialsRequirements
  **/
  @javax.annotation.Nonnull
  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements getStarTaskMaterialsRequirements() {
    return starTaskMaterialsRequirements;
  }


  public void setStarTaskMaterialsRequirements(StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements starTaskMaterialsRequirements) {
    this.starTaskMaterialsRequirements = starTaskMaterialsRequirements;
  }


  public StardeliveryTaskUpdateV30Request starTaskName(String starTaskName) {
    
    this.starTaskName = starTaskName;
    return this;
  }

   /**
   * 
   * @return starTaskName
  **/
  @javax.annotation.Nonnull
  public String getStarTaskName() {
    return starTaskName;
  }


  public void setStarTaskName(String starTaskName) {
    this.starTaskName = starTaskName;
  }


  public StardeliveryTaskUpdateV30Request taskAvatarId(String taskAvatarId) {
    
    this.taskAvatarId = taskAvatarId;
    return this;
  }

   /**
   * 
   * @return taskAvatarId
  **/
  @javax.annotation.Nonnull
  public String getTaskAvatarId() {
    return taskAvatarId;
  }


  public void setTaskAvatarId(String taskAvatarId) {
    this.taskAvatarId = taskAvatarId;
  }


  public StardeliveryTaskUpdateV30Request taskContactInfo(StardeliveryTaskUpdateV30RequestTaskContactInfo taskContactInfo) {
    
    this.taskContactInfo = taskContactInfo;
    return this;
  }

   /**
   * Get taskContactInfo
   * @return taskContactInfo
  **/
  @javax.annotation.Nonnull
  public StardeliveryTaskUpdateV30RequestTaskContactInfo getTaskContactInfo() {
    return taskContactInfo;
  }


  public void setTaskContactInfo(StardeliveryTaskUpdateV30RequestTaskContactInfo taskContactInfo) {
    this.taskContactInfo = taskContactInfo;
  }


  public StardeliveryTaskUpdateV30Request taskHeadImageId(String taskHeadImageId) {
    
    this.taskHeadImageId = taskHeadImageId;
    return this;
  }

   /**
   * 
   * @return taskHeadImageId
  **/
  @javax.annotation.Nonnull
  public String getTaskHeadImageId() {
    return taskHeadImageId;
  }


  public void setTaskHeadImageId(String taskHeadImageId) {
    this.taskHeadImageId = taskHeadImageId;
  }


  public StardeliveryTaskUpdateV30Request taskProductIntroduction(String taskProductIntroduction) {
    
    this.taskProductIntroduction = taskProductIntroduction;
    return this;
  }

   /**
   * 
   * @return taskProductIntroduction
  **/
  @javax.annotation.Nonnull
  public String getTaskProductIntroduction() {
    return taskProductIntroduction;
  }


  public void setTaskProductIntroduction(String taskProductIntroduction) {
    this.taskProductIntroduction = taskProductIntroduction;
  }


  public StardeliveryTaskUpdateV30Request taskProductName(String taskProductName) {
    
    this.taskProductName = taskProductName;
    return this;
  }

   /**
   * 
   * @return taskProductName
  **/
  @javax.annotation.Nonnull
  public String getTaskProductName() {
    return taskProductName;
  }


  public void setTaskProductName(String taskProductName) {
    this.taskProductName = taskProductName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskUpdateV30Request stardeliveryTaskUpdateV30Request = (StardeliveryTaskUpdateV30Request) o;
    return Objects.equals(this.advertiserId, stardeliveryTaskUpdateV30Request.advertiserId) &&
        Objects.equals(this.authorTaskName, stardeliveryTaskUpdateV30Request.authorTaskName) &&
        Objects.equals(this.starTaskId, stardeliveryTaskUpdateV30Request.starTaskId) &&
        Objects.equals(this.starTaskMaterialsRequirements, stardeliveryTaskUpdateV30Request.starTaskMaterialsRequirements) &&
        Objects.equals(this.starTaskName, stardeliveryTaskUpdateV30Request.starTaskName) &&
        Objects.equals(this.taskAvatarId, stardeliveryTaskUpdateV30Request.taskAvatarId) &&
        Objects.equals(this.taskContactInfo, stardeliveryTaskUpdateV30Request.taskContactInfo) &&
        Objects.equals(this.taskHeadImageId, stardeliveryTaskUpdateV30Request.taskHeadImageId) &&
        Objects.equals(this.taskProductIntroduction, stardeliveryTaskUpdateV30Request.taskProductIntroduction) &&
        Objects.equals(this.taskProductName, stardeliveryTaskUpdateV30Request.taskProductName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, authorTaskName, starTaskId, starTaskMaterialsRequirements, starTaskName, taskAvatarId, taskContactInfo, taskHeadImageId, taskProductIntroduction, taskProductName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    authorTaskName: ").append(toIndentedString(authorTaskName)).append("\n");
    sb.append("    starTaskId: ").append(toIndentedString(starTaskId)).append("\n");
    sb.append("    starTaskMaterialsRequirements: ").append(toIndentedString(starTaskMaterialsRequirements)).append("\n");
    sb.append("    starTaskName: ").append(toIndentedString(starTaskName)).append("\n");
    sb.append("    taskAvatarId: ").append(toIndentedString(taskAvatarId)).append("\n");
    sb.append("    taskContactInfo: ").append(toIndentedString(taskContactInfo)).append("\n");
    sb.append("    taskHeadImageId: ").append(toIndentedString(taskHeadImageId)).append("\n");
    sb.append("    taskProductIntroduction: ").append(toIndentedString(taskProductIntroduction)).append("\n");
    sb.append("    taskProductName: ").append(toIndentedString(taskProductName)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("author_task_name");
    openapiFields.add("star_task_id");
    openapiFields.add("star_task_materials_requirements");
    openapiFields.add("star_task_name");
    openapiFields.add("task_avatar_id");
    openapiFields.add("task_contact_info");
    openapiFields.add("task_head_image_id");
    openapiFields.add("task_product_introduction");
    openapiFields.add("task_product_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("author_task_name");
    openapiRequiredFields.add("star_task_id");
    openapiRequiredFields.add("star_task_materials_requirements");
    openapiRequiredFields.add("star_task_name");
    openapiRequiredFields.add("task_avatar_id");
    openapiRequiredFields.add("task_contact_info");
    openapiRequiredFields.add("task_head_image_id");
    openapiRequiredFields.add("task_product_introduction");
    openapiRequiredFields.add("task_product_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskUpdateV30Request
  */
  public static StardeliveryTaskUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskUpdateV30Request.class);
  }

 /**
  * Convert an instance of StardeliveryTaskUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

