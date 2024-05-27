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
import com.bytedance.ads.model.AdvertiserQualificationCreateV2V2QualificationType;
import com.bytedance.ads.model.AdvertiserQualificationCreateV2V2RequestQualificationsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AdvertiserQualificationCreateV2V2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class AdvertiserQualificationCreateV2V2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_TYPE = "qualification_type";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_TYPE)
  private AdvertiserQualificationCreateV2V2QualificationType qualificationType = null;

  public static final String SERIALIZED_NAME_QUALIFICATIONS = "qualifications";
  @SerializedName(SERIALIZED_NAME_QUALIFICATIONS)
  private List<AdvertiserQualificationCreateV2V2RequestQualificationsInner> qualifications = null;

  public AdvertiserQualificationCreateV2V2Request() {
  }

  public AdvertiserQualificationCreateV2V2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserQualificationCreateV2V2Request qualificationType(AdvertiserQualificationCreateV2V2QualificationType qualificationType) {
    
    this.qualificationType = qualificationType;
    return this;
  }

   /**
   * Get qualificationType
   * @return qualificationType
  **/
  @javax.annotation.Nonnull
  public AdvertiserQualificationCreateV2V2QualificationType getQualificationType() {
    return qualificationType;
  }


  public void setQualificationType(AdvertiserQualificationCreateV2V2QualificationType qualificationType) {
    this.qualificationType = qualificationType;
  }


  public AdvertiserQualificationCreateV2V2Request qualifications(List<AdvertiserQualificationCreateV2V2RequestQualificationsInner> qualifications) {
    
    this.qualifications = qualifications;
    return this;
  }

  public AdvertiserQualificationCreateV2V2Request addQualificationsItem(AdvertiserQualificationCreateV2V2RequestQualificationsInner qualificationsItem) {
    if (this.qualifications == null) {
      this.qualifications = new ArrayList<>();
    }
    this.qualifications.add(qualificationsItem);
    return this;
  }

   /**
   * 
   * @return qualifications
  **/
  @javax.annotation.Nonnull
  public List<AdvertiserQualificationCreateV2V2RequestQualificationsInner> getQualifications() {
    return qualifications;
  }


  public void setQualifications(List<AdvertiserQualificationCreateV2V2RequestQualificationsInner> qualifications) {
    this.qualifications = qualifications;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserQualificationCreateV2V2Request advertiserQualificationCreateV2V2Request = (AdvertiserQualificationCreateV2V2Request) o;
    return Objects.equals(this.advertiserId, advertiserQualificationCreateV2V2Request.advertiserId) &&
        Objects.equals(this.qualificationType, advertiserQualificationCreateV2V2Request.qualificationType) &&
        Objects.equals(this.qualifications, advertiserQualificationCreateV2V2Request.qualifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, qualificationType, qualifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserQualificationCreateV2V2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
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
    openapiFields.add("qualification_type");
    openapiFields.add("qualifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("qualification_type");
    openapiRequiredFields.add("qualifications");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationCreateV2V2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationCreateV2V2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationCreateV2V2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationCreateV2V2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationCreateV2V2Request>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationCreateV2V2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationCreateV2V2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationCreateV2V2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationCreateV2V2Request
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationCreateV2V2Request
  */
  public static AdvertiserQualificationCreateV2V2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationCreateV2V2Request.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationCreateV2V2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

