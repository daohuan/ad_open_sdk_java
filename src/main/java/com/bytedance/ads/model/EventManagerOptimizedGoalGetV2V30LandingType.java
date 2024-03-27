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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(EventManagerOptimizedGoalGetV2V30LandingType.Adapter.class)
public enum EventManagerOptimizedGoalGetV2V30LandingType {
  
  APP("APP"),
  
  DPA("DPA"),
  
  LINK("LINK"),
  
  MICRO_GAME("MICRO_GAME"),
  
  NATIVE_ACTION("NATIVE_ACTION"),
  
  QUICK_APP("QUICK_APP"),
  
  SHOP("SHOP");

  private String value;

  EventManagerOptimizedGoalGetV2V30LandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerOptimizedGoalGetV2V30LandingType fromValue(String value) {
    for (EventManagerOptimizedGoalGetV2V30LandingType b : EventManagerOptimizedGoalGetV2V30LandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventManagerOptimizedGoalGetV2V30LandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerOptimizedGoalGetV2V30LandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerOptimizedGoalGetV2V30LandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerOptimizedGoalGetV2V30LandingType.fromValue(value);
    }
  }
}

