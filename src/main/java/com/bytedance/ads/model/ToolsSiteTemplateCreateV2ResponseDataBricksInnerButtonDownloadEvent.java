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
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventIosLink;
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
 * downloadEvent事件行为描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent {
  public static final String SERIALIZED_NAME_ANDROID_LINK = "android_link";
  @SerializedName(SERIALIZED_NAME_ANDROID_LINK)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink androidLink = null;

  public static final String SERIALIZED_NAME_IOS_LINK = "ios_link";
  @SerializedName(SERIALIZED_NAME_IOS_LINK)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventIosLink iosLink = null;

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent() {
  }

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent androidLink(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink androidLink) {
    
    this.androidLink = androidLink;
    return this;
  }

   /**
   * Get androidLink
   * @return androidLink
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink getAndroidLink() {
    return androidLink;
  }


  public void setAndroidLink(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventAndroidLink androidLink) {
    this.androidLink = androidLink;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent iosLink(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventIosLink iosLink) {
    
    this.iosLink = iosLink;
    return this;
  }

   /**
   * Get iosLink
   * @return iosLink
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventIosLink getIosLink() {
    return iosLink;
  }


  public void setIosLink(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEventIosLink iosLink) {
    this.iosLink = iosLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent = (ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent) o;
    return Objects.equals(this.androidLink, toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent.androidLink) &&
        Objects.equals(this.iosLink, toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent.iosLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidLink, iosLink);
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
    sb.append("class ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent {\n");
    sb.append("    androidLink: ").append(toIndentedString(androidLink)).append("\n");
    sb.append("    iosLink: ").append(toIndentedString(iosLink)).append("\n");
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
    openapiFields.add("android_link");
    openapiFields.add("ios_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent
  */
  public static ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonDownloadEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

