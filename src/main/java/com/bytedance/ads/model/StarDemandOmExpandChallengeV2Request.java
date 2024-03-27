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
import com.bytedance.ads.model.StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange;
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
 * StarDemandOmExpandChallengeV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class StarDemandOmExpandChallengeV2Request {
  public static final String SERIALIZED_NAME_CHALLENGE_END_TIME = "challenge_end_time";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_END_TIME)
  private Long challengeEndTime = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_DEVELOPER_ID = "developer_id";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
  private Long developerId = null;

  public static final String SERIALIZED_NAME_OM_PARTICIPATE_AUTHOR_RANGE = "om_participate_author_range";
  @SerializedName(SERIALIZED_NAME_OM_PARTICIPATE_AUTHOR_RANGE)
  private StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange omParticipateAuthorRange = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarDemandOmExpandChallengeV2Request() {
  }

  public StarDemandOmExpandChallengeV2Request challengeEndTime(Long challengeEndTime) {
    
    this.challengeEndTime = challengeEndTime;
    return this;
  }

   /**
   * 
   * @return challengeEndTime
  **/
  @javax.annotation.Nullable
  public Long getChallengeEndTime() {
    return challengeEndTime;
  }


  public void setChallengeEndTime(Long challengeEndTime) {
    this.challengeEndTime = challengeEndTime;
  }


  public StarDemandOmExpandChallengeV2Request challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 任务ID 19位数字
   * @return challengeTaskId
  **/
  @javax.annotation.Nonnull
  public Long getChallengeTaskId() {
    return challengeTaskId;
  }


  public void setChallengeTaskId(Long challengeTaskId) {
    this.challengeTaskId = challengeTaskId;
  }


  public StarDemandOmExpandChallengeV2Request developerId(Long developerId) {
    
    this.developerId = developerId;
    return this;
  }

   /**
   * 
   * @return developerId
  **/
  @javax.annotation.Nullable
  public Long getDeveloperId() {
    return developerId;
  }


  public void setDeveloperId(Long developerId) {
    this.developerId = developerId;
  }


  public StarDemandOmExpandChallengeV2Request omParticipateAuthorRange(StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange omParticipateAuthorRange) {
    
    this.omParticipateAuthorRange = omParticipateAuthorRange;
    return this;
  }

   /**
   * Get omParticipateAuthorRange
   * @return omParticipateAuthorRange
  **/
  @javax.annotation.Nullable
  public StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange getOmParticipateAuthorRange() {
    return omParticipateAuthorRange;
  }


  public void setOmParticipateAuthorRange(StarDemandOmExpandChallengeV2RequestOmParticipateAuthorRange omParticipateAuthorRange) {
    this.omParticipateAuthorRange = omParticipateAuthorRange;
  }


  public StarDemandOmExpandChallengeV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 客户星图ID
   * @return starId
  **/
  @javax.annotation.Nonnull
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmExpandChallengeV2Request starDemandOmExpandChallengeV2Request = (StarDemandOmExpandChallengeV2Request) o;
    return Objects.equals(this.challengeEndTime, starDemandOmExpandChallengeV2Request.challengeEndTime) &&
        Objects.equals(this.challengeTaskId, starDemandOmExpandChallengeV2Request.challengeTaskId) &&
        Objects.equals(this.developerId, starDemandOmExpandChallengeV2Request.developerId) &&
        Objects.equals(this.omParticipateAuthorRange, starDemandOmExpandChallengeV2Request.omParticipateAuthorRange) &&
        Objects.equals(this.starId, starDemandOmExpandChallengeV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeEndTime, challengeTaskId, developerId, omParticipateAuthorRange, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmExpandChallengeV2Request {\n");
    sb.append("    challengeEndTime: ").append(toIndentedString(challengeEndTime)).append("\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    omParticipateAuthorRange: ").append(toIndentedString(omParticipateAuthorRange)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("challenge_end_time");
    openapiFields.add("challenge_task_id");
    openapiFields.add("developer_id");
    openapiFields.add("om_participate_author_range");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("challenge_task_id");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmExpandChallengeV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmExpandChallengeV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmExpandChallengeV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmExpandChallengeV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmExpandChallengeV2Request>() {
           @Override
           public void write(JsonWriter out, StarDemandOmExpandChallengeV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmExpandChallengeV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmExpandChallengeV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmExpandChallengeV2Request
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmExpandChallengeV2Request
  */
  public static StarDemandOmExpandChallengeV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmExpandChallengeV2Request.class);
  }

 /**
  * Convert an instance of StarDemandOmExpandChallengeV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

