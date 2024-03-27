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
import com.bytedance.ads.model.AdlabGroupUpdateStatusV30RequestDataInner;
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
 * AdlabGroupUpdateStatusV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class AdlabGroupUpdateStatusV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<AdlabGroupUpdateStatusV30RequestDataInner> data = null;

  public AdlabGroupUpdateStatusV30Request() {
  }

  public AdlabGroupUpdateStatusV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * minimum: 1
   * maximum: -9223372036854775616
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdlabGroupUpdateStatusV30Request data(List<AdlabGroupUpdateStatusV30RequestDataInner> data) {
    
    this.data = data;
    return this;
  }

  public AdlabGroupUpdateStatusV30Request addDataItem(AdlabGroupUpdateStatusV30RequestDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 项目信息
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<AdlabGroupUpdateStatusV30RequestDataInner> getData() {
    return data;
  }


  public void setData(List<AdlabGroupUpdateStatusV30RequestDataInner> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupUpdateStatusV30Request adlabGroupUpdateStatusV30Request = (AdlabGroupUpdateStatusV30Request) o;
    return Objects.equals(this.advertiserId, adlabGroupUpdateStatusV30Request.advertiserId) &&
        Objects.equals(this.data, adlabGroupUpdateStatusV30Request.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupUpdateStatusV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("data");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupUpdateStatusV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateStatusV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateStatusV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateStatusV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateStatusV30Request>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateStatusV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateStatusV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateStatusV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateStatusV30Request
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateStatusV30Request
  */
  public static AdlabGroupUpdateStatusV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateStatusV30Request.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateStatusV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

