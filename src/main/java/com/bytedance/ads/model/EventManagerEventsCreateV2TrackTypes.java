/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(EventManagerEventsCreateV2TrackTypes.Adapter.class)
public enum EventManagerEventsCreateV2TrackTypes {
  
  JSSDK("JSSDK"),
  
  XPATH("XPATH"),
  
  APPLICATION_API("APPLICATION_API"),
  
  EXTERNAL_API("EXTERNAL_API"),
  
  APPLICATION_SDK("APPLICATION_SDK"),
  
  MINI_PROGRAME_SDK("MINI_PROGRAME_SDK"),
  
  MINI_PROGRAME_API("MINI_PROGRAME_API"),
  
  OFFLINE_CALLBACK("OFFLINE_CALLBACK"),
  
  OFFLINE_API("OFFLINE_API"),
  
  APPLOG("APPLOG"),
  
  TETRIS("TETRIS"),
  
  TETRIS_FE("TETRIS_FE"),
  
  FLY_FISH("FLY_FISH"),
  
  E_CHAT("E_CHAT"),
  
  QUICK_APP_API("QUICK_APP_API");

  private String value;

  EventManagerEventsCreateV2TrackTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerEventsCreateV2TrackTypes fromValue(String value) {
    for (EventManagerEventsCreateV2TrackTypes b : EventManagerEventsCreateV2TrackTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventManagerEventsCreateV2TrackTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerEventsCreateV2TrackTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerEventsCreateV2TrackTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerEventsCreateV2TrackTypes.fromValue(value);
    }
  }
}
