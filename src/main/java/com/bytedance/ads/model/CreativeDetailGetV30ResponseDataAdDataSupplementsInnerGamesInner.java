/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeDetailGetV30DataAdDataSupplementsGamesOrientation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_ORIENTATION = "orientation";
  @SerializedName(SERIALIZED_NAME_ORIENTATION)
  private CreativeDetailGetV30DataAdDataSupplementsGamesOrientation orientation = null;

  public CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner() {
  }

  public CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner orientation(CreativeDetailGetV30DataAdDataSupplementsGamesOrientation orientation) {
    
    this.orientation = orientation;
    return this;
  }

   /**
   * Get orientation
   * @return orientation
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataAdDataSupplementsGamesOrientation getOrientation() {
    return orientation;
  }


  public void setOrientation(CreativeDetailGetV30DataAdDataSupplementsGamesOrientation orientation) {
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
    CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner creativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner = (CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner) o;
    return Objects.equals(this.id, creativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner.id) &&
        Objects.equals(this.orientation, creativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner.orientation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orientation);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner
  */
  public static CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataAdDataSupplementsInnerGamesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

