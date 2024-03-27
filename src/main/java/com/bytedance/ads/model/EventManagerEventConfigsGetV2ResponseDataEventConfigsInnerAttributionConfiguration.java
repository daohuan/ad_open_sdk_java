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
 * 属性配置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration {
  public static final String SERIALIZED_NAME_ATTRIBUTION_WINDOW = "attribution_window";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTION_WINDOW)
  private Long attributionWindow = null;

  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration() {
  }

  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration attributionWindow(Long attributionWindow) {
    
    this.attributionWindow = attributionWindow;
    return this;
  }

   /**
   * 归因窗口
   * @return attributionWindow
  **/
  @javax.annotation.Nullable
  public Long getAttributionWindow() {
    return attributionWindow;
  }


  public void setAttributionWindow(Long attributionWindow) {
    this.attributionWindow = attributionWindow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration eventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration = (EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration) o;
    return Objects.equals(this.attributionWindow, eventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration.attributionWindow);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionWindow);
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
    sb.append("class EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration {\n");
    sb.append("    attributionWindow: ").append(toIndentedString(attributionWindow)).append("\n");
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
    openapiFields.add("attribution_window");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration>() {
           @Override
           public void write(JsonWriter out, EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration
  * @throws IOException if the JSON string is invalid with respect to EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration
  */
  public static EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration.class);
  }

 /**
  * Convert an instance of EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

