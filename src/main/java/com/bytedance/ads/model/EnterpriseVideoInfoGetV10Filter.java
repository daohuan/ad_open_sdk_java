/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class EnterpriseVideoInfoGetV10Filter {
  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId = null;

  public EnterpriseVideoInfoGetV10Filter() {
  }

  public EnterpriseVideoInfoGetV10Filter openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 
   * @return openId
  **/
  @javax.annotation.Nullable
  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseVideoInfoGetV10Filter enterpriseVideoInfoGetV10Filter = (EnterpriseVideoInfoGetV10Filter) o;
    return Objects.equals(this.openId, enterpriseVideoInfoGetV10Filter.openId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseVideoInfoGetV10Filter {\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
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
    openapiFields.add("open_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseVideoInfoGetV10Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseVideoInfoGetV10Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseVideoInfoGetV10Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseVideoInfoGetV10Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseVideoInfoGetV10Filter>() {
           @Override
           public void write(JsonWriter out, EnterpriseVideoInfoGetV10Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseVideoInfoGetV10Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseVideoInfoGetV10Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseVideoInfoGetV10Filter
  * @throws IOException if the JSON string is invalid with respect to EnterpriseVideoInfoGetV10Filter
  */
  public static EnterpriseVideoInfoGetV10Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseVideoInfoGetV10Filter.class);
  }

 /**
  * Convert an instance of EnterpriseVideoInfoGetV10Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
