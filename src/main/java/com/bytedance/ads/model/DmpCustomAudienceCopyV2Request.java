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
 * DmpCustomAudienceCopyV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class DmpCustomAudienceCopyV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CUSTOM_AUDIENCE_ID = "custom_audience_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AUDIENCE_ID)
  private Long customAudienceId = null;

  public static final String SERIALIZED_NAME_TO_ADVERTISER_ID = "to_advertiser_id";
  @SerializedName(SERIALIZED_NAME_TO_ADVERTISER_ID)
  private Long toAdvertiserId = null;

  public DmpCustomAudienceCopyV2Request() {
  }

  public DmpCustomAudienceCopyV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 人群包所属广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DmpCustomAudienceCopyV2Request customAudienceId(Long customAudienceId) {
    
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * 人群包ID
   * @return customAudienceId
  **/
  @javax.annotation.Nonnull
  public Long getCustomAudienceId() {
    return customAudienceId;
  }


  public void setCustomAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
  }


  public DmpCustomAudienceCopyV2Request toAdvertiserId(Long toAdvertiserId) {
    
    this.toAdvertiserId = toAdvertiserId;
    return this;
  }

   /**
   * 推送广告主ID（云图虚拟广告主ID，即virtual_adv_id）
   * @return toAdvertiserId
  **/
  @javax.annotation.Nonnull
  public Long getToAdvertiserId() {
    return toAdvertiserId;
  }


  public void setToAdvertiserId(Long toAdvertiserId) {
    this.toAdvertiserId = toAdvertiserId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpCustomAudienceCopyV2Request dmpCustomAudienceCopyV2Request = (DmpCustomAudienceCopyV2Request) o;
    return Objects.equals(this.advertiserId, dmpCustomAudienceCopyV2Request.advertiserId) &&
        Objects.equals(this.customAudienceId, dmpCustomAudienceCopyV2Request.customAudienceId) &&
        Objects.equals(this.toAdvertiserId, dmpCustomAudienceCopyV2Request.toAdvertiserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, customAudienceId, toAdvertiserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpCustomAudienceCopyV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    toAdvertiserId: ").append(toIndentedString(toAdvertiserId)).append("\n");
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
    openapiFields.add("custom_audience_id");
    openapiFields.add("to_advertiser_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("custom_audience_id");
    openapiRequiredFields.add("to_advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpCustomAudienceCopyV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpCustomAudienceCopyV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpCustomAudienceCopyV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpCustomAudienceCopyV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpCustomAudienceCopyV2Request>() {
           @Override
           public void write(JsonWriter out, DmpCustomAudienceCopyV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpCustomAudienceCopyV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpCustomAudienceCopyV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpCustomAudienceCopyV2Request
  * @throws IOException if the JSON string is invalid with respect to DmpCustomAudienceCopyV2Request
  */
  public static DmpCustomAudienceCopyV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpCustomAudienceCopyV2Request.class);
  }

 /**
  * Convert an instance of DmpCustomAudienceCopyV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

