/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
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
 * CarouselDeleteV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class CarouselDeleteV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_IDS = "carousel_ids";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_IDS)
  private List<Long> carouselIds = null;

  public CarouselDeleteV2Request() {
  }

  public CarouselDeleteV2Request advertiserId(Long advertiserId) {
    
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


  public CarouselDeleteV2Request carouselIds(List<Long> carouselIds) {
    
    this.carouselIds = carouselIds;
    return this;
  }

  public CarouselDeleteV2Request addCarouselIdsItem(Long carouselIdsItem) {
    if (this.carouselIds == null) {
      this.carouselIds = new ArrayList<>();
    }
    this.carouselIds.add(carouselIdsItem);
    return this;
  }

   /**
   * 图集 id
   * @return carouselIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getCarouselIds() {
    return carouselIds;
  }


  public void setCarouselIds(List<Long> carouselIds) {
    this.carouselIds = carouselIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselDeleteV2Request carouselDeleteV2Request = (CarouselDeleteV2Request) o;
    return Objects.equals(this.advertiserId, carouselDeleteV2Request.advertiserId) &&
        Objects.equals(this.carouselIds, carouselDeleteV2Request.carouselIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, carouselIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselDeleteV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    carouselIds: ").append(toIndentedString(carouselIds)).append("\n");
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
    openapiFields.add("carousel_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("carousel_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselDeleteV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselDeleteV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselDeleteV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselDeleteV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselDeleteV2Request>() {
           @Override
           public void write(JsonWriter out, CarouselDeleteV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselDeleteV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselDeleteV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselDeleteV2Request
  * @throws IOException if the JSON string is invalid with respect to CarouselDeleteV2Request
  */
  public static CarouselDeleteV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselDeleteV2Request.class);
  }

 /**
  * Convert an instance of CarouselDeleteV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

