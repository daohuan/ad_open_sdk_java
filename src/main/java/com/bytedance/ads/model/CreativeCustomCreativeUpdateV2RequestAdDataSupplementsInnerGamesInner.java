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
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation;
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
 * CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_ORIENTATION = "orientation";
  @SerializedName(SERIALIZED_NAME_ORIENTATION)
  private CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation orientation = null;

  public CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner() {
  }

  public CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner orientation(CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation orientation) {
    
    this.orientation = orientation;
    return this;
  }

   /**
   * Get orientation
   * @return orientation
  **/
  @javax.annotation.Nonnull
  public CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation getOrientation() {
    return orientation;
  }


  public void setOrientation(CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation orientation) {
    this.orientation = orientation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner creativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner = (CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner) o;
    return Objects.equals(this.id, creativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.id) &&
        Objects.equals(this.orientation, creativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.orientation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orientation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("orientation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("orientation");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner
  */
  public static CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

