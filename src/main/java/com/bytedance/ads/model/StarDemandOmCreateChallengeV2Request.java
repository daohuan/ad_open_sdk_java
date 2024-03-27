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
import com.bytedance.ads.model.StarDemandOmCreateChallengeV2RequestChallengeInfo;
import com.bytedance.ads.model.StarDemandOmCreateChallengeV2RequestDemandInfo;
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
 * StarDemandOmCreateChallengeV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class StarDemandOmCreateChallengeV2Request {
  public static final String SERIALIZED_NAME_CHALLENGE_INFO = "challenge_info";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_INFO)
  private StarDemandOmCreateChallengeV2RequestChallengeInfo challengeInfo = null;

  public static final String SERIALIZED_NAME_DEMAND_INFO = "demand_info";
  @SerializedName(SERIALIZED_NAME_DEMAND_INFO)
  private StarDemandOmCreateChallengeV2RequestDemandInfo demandInfo = null;

  public static final String SERIALIZED_NAME_DEVELOPER_ID = "developer_id";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
  private Long developerId = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarDemandOmCreateChallengeV2Request() {
  }

  public StarDemandOmCreateChallengeV2Request challengeInfo(StarDemandOmCreateChallengeV2RequestChallengeInfo challengeInfo) {
    
    this.challengeInfo = challengeInfo;
    return this;
  }

   /**
   * Get challengeInfo
   * @return challengeInfo
  **/
  @javax.annotation.Nonnull
  public StarDemandOmCreateChallengeV2RequestChallengeInfo getChallengeInfo() {
    return challengeInfo;
  }


  public void setChallengeInfo(StarDemandOmCreateChallengeV2RequestChallengeInfo challengeInfo) {
    this.challengeInfo = challengeInfo;
  }


  public StarDemandOmCreateChallengeV2Request demandInfo(StarDemandOmCreateChallengeV2RequestDemandInfo demandInfo) {
    
    this.demandInfo = demandInfo;
    return this;
  }

   /**
   * Get demandInfo
   * @return demandInfo
  **/
  @javax.annotation.Nonnull
  public StarDemandOmCreateChallengeV2RequestDemandInfo getDemandInfo() {
    return demandInfo;
  }


  public void setDemandInfo(StarDemandOmCreateChallengeV2RequestDemandInfo demandInfo) {
    this.demandInfo = demandInfo;
  }


  public StarDemandOmCreateChallengeV2Request developerId(Long developerId) {
    
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


  public StarDemandOmCreateChallengeV2Request starId(Long starId) {
    
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
    StarDemandOmCreateChallengeV2Request starDemandOmCreateChallengeV2Request = (StarDemandOmCreateChallengeV2Request) o;
    return Objects.equals(this.challengeInfo, starDemandOmCreateChallengeV2Request.challengeInfo) &&
        Objects.equals(this.demandInfo, starDemandOmCreateChallengeV2Request.demandInfo) &&
        Objects.equals(this.developerId, starDemandOmCreateChallengeV2Request.developerId) &&
        Objects.equals(this.starId, starDemandOmCreateChallengeV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeInfo, demandInfo, developerId, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmCreateChallengeV2Request {\n");
    sb.append("    challengeInfo: ").append(toIndentedString(challengeInfo)).append("\n");
    sb.append("    demandInfo: ").append(toIndentedString(demandInfo)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
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
    openapiFields.add("challenge_info");
    openapiFields.add("demand_info");
    openapiFields.add("developer_id");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("challenge_info");
    openapiRequiredFields.add("demand_info");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmCreateChallengeV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmCreateChallengeV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmCreateChallengeV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmCreateChallengeV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmCreateChallengeV2Request>() {
           @Override
           public void write(JsonWriter out, StarDemandOmCreateChallengeV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmCreateChallengeV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmCreateChallengeV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmCreateChallengeV2Request
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmCreateChallengeV2Request
  */
  public static StarDemandOmCreateChallengeV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmCreateChallengeV2Request.class);
  }

 /**
  * Convert an instance of StarDemandOmCreateChallengeV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

