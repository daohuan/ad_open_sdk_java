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
 * 快应用资产信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class EventManagerAssetsCreateV2RequestQuickAppAsset {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName = null;

  public EventManagerAssetsCreateV2RequestQuickAppAsset() {
  }

  public EventManagerAssetsCreateV2RequestQuickAppAsset name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 快应用名称，长度限制为20，一个字符长度为1
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EventManagerAssetsCreateV2RequestQuickAppAsset packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 快应用包名，长度限制为140
   * @return packageName
  **/
  @javax.annotation.Nonnull
  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAssetsCreateV2RequestQuickAppAsset eventManagerAssetsCreateV2RequestQuickAppAsset = (EventManagerAssetsCreateV2RequestQuickAppAsset) o;
    return Objects.equals(this.name, eventManagerAssetsCreateV2RequestQuickAppAsset.name) &&
        Objects.equals(this.packageName, eventManagerAssetsCreateV2RequestQuickAppAsset.packageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, packageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerAssetsCreateV2RequestQuickAppAsset {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("package_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("package_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAssetsCreateV2RequestQuickAppAsset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAssetsCreateV2RequestQuickAppAsset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAssetsCreateV2RequestQuickAppAsset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAssetsCreateV2RequestQuickAppAsset.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAssetsCreateV2RequestQuickAppAsset>() {
           @Override
           public void write(JsonWriter out, EventManagerAssetsCreateV2RequestQuickAppAsset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAssetsCreateV2RequestQuickAppAsset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAssetsCreateV2RequestQuickAppAsset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAssetsCreateV2RequestQuickAppAsset
  * @throws IOException if the JSON string is invalid with respect to EventManagerAssetsCreateV2RequestQuickAppAsset
  */
  public static EventManagerAssetsCreateV2RequestQuickAppAsset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAssetsCreateV2RequestQuickAppAsset.class);
  }

 /**
  * Convert an instance of EventManagerAssetsCreateV2RequestQuickAppAsset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

