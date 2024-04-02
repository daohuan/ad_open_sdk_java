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
import com.bytedance.ads.model.ToolsSiteCreateV2RequestBricksInnerEventsInnerBehavior;
import com.bytedance.ads.model.ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger;
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
 * ToolsSiteCreateV2RequestBricksInnerEventsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ToolsSiteCreateV2RequestBricksInnerEventsInner {
  public static final String SERIALIZED_NAME_BEHAVIOR = "behavior";
  @SerializedName(SERIALIZED_NAME_BEHAVIOR)
  private ToolsSiteCreateV2RequestBricksInnerEventsInnerBehavior behavior = null;

  public static final String SERIALIZED_NAME_TRIGGER = "trigger";
  @SerializedName(SERIALIZED_NAME_TRIGGER)
  private ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger trigger = null;

  public ToolsSiteCreateV2RequestBricksInnerEventsInner() {
  }

  public ToolsSiteCreateV2RequestBricksInnerEventsInner behavior(ToolsSiteCreateV2RequestBricksInnerEventsInnerBehavior behavior) {
    
    this.behavior = behavior;
    return this;
  }

   /**
   * Get behavior
   * @return behavior
  **/
  @javax.annotation.Nullable
  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehavior getBehavior() {
    return behavior;
  }


  public void setBehavior(ToolsSiteCreateV2RequestBricksInnerEventsInnerBehavior behavior) {
    this.behavior = behavior;
  }


  public ToolsSiteCreateV2RequestBricksInnerEventsInner trigger(ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger trigger) {
    
    this.trigger = trigger;
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @javax.annotation.Nullable
  public ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger getTrigger() {
    return trigger;
  }


  public void setTrigger(ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger trigger) {
    this.trigger = trigger;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteCreateV2RequestBricksInnerEventsInner toolsSiteCreateV2RequestBricksInnerEventsInner = (ToolsSiteCreateV2RequestBricksInnerEventsInner) o;
    return Objects.equals(this.behavior, toolsSiteCreateV2RequestBricksInnerEventsInner.behavior) &&
        Objects.equals(this.trigger, toolsSiteCreateV2RequestBricksInnerEventsInner.trigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behavior, trigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteCreateV2RequestBricksInnerEventsInner {\n");
    sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
    openapiFields.add("behavior");
    openapiFields.add("trigger");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteCreateV2RequestBricksInnerEventsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteCreateV2RequestBricksInnerEventsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteCreateV2RequestBricksInnerEventsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteCreateV2RequestBricksInnerEventsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteCreateV2RequestBricksInnerEventsInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteCreateV2RequestBricksInnerEventsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteCreateV2RequestBricksInnerEventsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteCreateV2RequestBricksInnerEventsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteCreateV2RequestBricksInnerEventsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteCreateV2RequestBricksInnerEventsInner
  */
  public static ToolsSiteCreateV2RequestBricksInnerEventsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteCreateV2RequestBricksInnerEventsInner.class);
  }

 /**
  * Convert an instance of ToolsSiteCreateV2RequestBricksInnerEventsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

