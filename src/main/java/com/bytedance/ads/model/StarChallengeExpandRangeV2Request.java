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
import com.bytedance.ads.model.StarChallengeExpandRangeV2RequestParticipateAuthorRange;
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
 * StarChallengeExpandRangeV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class StarChallengeExpandRangeV2Request {
  public static final String SERIALIZED_NAME_CHALLENGE_END_TIME = "challenge_end_time";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_END_TIME)
  private Long challengeEndTime = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_DEVELOPER_ID = "developer_id";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
  private Long developerId = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE = "participate_author_range";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE)
  private StarChallengeExpandRangeV2RequestParticipateAuthorRange participateAuthorRange = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarChallengeExpandRangeV2Request() {
  }

  public StarChallengeExpandRangeV2Request challengeEndTime(Long challengeEndTime) {
    
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


  public StarChallengeExpandRangeV2Request challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 
   * @return challengeTaskId
  **/
  @javax.annotation.Nonnull
  public Long getChallengeTaskId() {
    return challengeTaskId;
  }


  public void setChallengeTaskId(Long challengeTaskId) {
    this.challengeTaskId = challengeTaskId;
  }


  public StarChallengeExpandRangeV2Request developerId(Long developerId) {
    
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


  public StarChallengeExpandRangeV2Request participateAuthorRange(StarChallengeExpandRangeV2RequestParticipateAuthorRange participateAuthorRange) {
    
    this.participateAuthorRange = participateAuthorRange;
    return this;
  }

   /**
   * Get participateAuthorRange
   * @return participateAuthorRange
  **/
  @javax.annotation.Nullable
  public StarChallengeExpandRangeV2RequestParticipateAuthorRange getParticipateAuthorRange() {
    return participateAuthorRange;
  }


  public void setParticipateAuthorRange(StarChallengeExpandRangeV2RequestParticipateAuthorRange participateAuthorRange) {
    this.participateAuthorRange = participateAuthorRange;
  }


  public StarChallengeExpandRangeV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 
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
    StarChallengeExpandRangeV2Request starChallengeExpandRangeV2Request = (StarChallengeExpandRangeV2Request) o;
    return Objects.equals(this.challengeEndTime, starChallengeExpandRangeV2Request.challengeEndTime) &&
        Objects.equals(this.challengeTaskId, starChallengeExpandRangeV2Request.challengeTaskId) &&
        Objects.equals(this.developerId, starChallengeExpandRangeV2Request.developerId) &&
        Objects.equals(this.participateAuthorRange, starChallengeExpandRangeV2Request.participateAuthorRange) &&
        Objects.equals(this.starId, starChallengeExpandRangeV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeEndTime, challengeTaskId, developerId, participateAuthorRange, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarChallengeExpandRangeV2Request {\n");
    sb.append("    challengeEndTime: ").append(toIndentedString(challengeEndTime)).append("\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    participateAuthorRange: ").append(toIndentedString(participateAuthorRange)).append("\n");
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
    openapiFields.add("participate_author_range");
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
       if (!StarChallengeExpandRangeV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeExpandRangeV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeExpandRangeV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeExpandRangeV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeExpandRangeV2Request>() {
           @Override
           public void write(JsonWriter out, StarChallengeExpandRangeV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeExpandRangeV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeExpandRangeV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeExpandRangeV2Request
  * @throws IOException if the JSON string is invalid with respect to StarChallengeExpandRangeV2Request
  */
  public static StarChallengeExpandRangeV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeExpandRangeV2Request.class);
  }

 /**
  * Convert an instance of StarChallengeExpandRangeV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

