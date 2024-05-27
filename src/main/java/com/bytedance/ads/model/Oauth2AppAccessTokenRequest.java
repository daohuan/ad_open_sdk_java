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
 * Oauth2AppAccessTokenRequest
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class Oauth2AppAccessTokenRequest {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Long appId = null;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret = null;

  public Oauth2AppAccessTokenRequest() {
  }

  public Oauth2AppAccessTokenRequest appId(Long appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 应用ID
   * @return appId
  **/
  @javax.annotation.Nonnull
  public Long getAppId() {
    return appId;
  }


  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public Oauth2AppAccessTokenRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * 应用秘钥
   * @return secret
  **/
  @javax.annotation.Nonnull
  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2AppAccessTokenRequest oauth2AppAccessTokenRequest = (Oauth2AppAccessTokenRequest) o;
    return Objects.equals(this.appId, oauth2AppAccessTokenRequest.appId) &&
        Objects.equals(this.secret, oauth2AppAccessTokenRequest.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Oauth2AppAccessTokenRequest {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("secret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("secret");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Oauth2AppAccessTokenRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Oauth2AppAccessTokenRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Oauth2AppAccessTokenRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Oauth2AppAccessTokenRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Oauth2AppAccessTokenRequest>() {
           @Override
           public void write(JsonWriter out, Oauth2AppAccessTokenRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Oauth2AppAccessTokenRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Oauth2AppAccessTokenRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Oauth2AppAccessTokenRequest
  * @throws IOException if the JSON string is invalid with respect to Oauth2AppAccessTokenRequest
  */
  public static Oauth2AppAccessTokenRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Oauth2AppAccessTokenRequest.class);
  }

 /**
  * Convert an instance of Oauth2AppAccessTokenRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

