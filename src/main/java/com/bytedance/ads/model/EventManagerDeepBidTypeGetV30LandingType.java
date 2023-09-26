/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
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
@JsonAdapter(EventManagerDeepBidTypeGetV30LandingType.Adapter.class)
public enum EventManagerDeepBidTypeGetV30LandingType {
  
  APP("APP"),
  
  ARTICLE("ARTICLE"),
  
  BRAND_EXTERNAL("BRAND_EXTERNAL"),
  
  DPA("DPA"),
  
  GOODS("GOODS"),
  
  LINK("LINK"),
  
  LIVE("LIVE"),
  
  MICRO_GAME("MICRO_GAME"),
  
  NATIVE_ACTION("NATIVE_ACTION"),
  
  QUICK_APP("QUICK_APP"),
  
  SHOP("SHOP"),
  
  STORE("STORE");

  private String value;

  EventManagerDeepBidTypeGetV30LandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerDeepBidTypeGetV30LandingType fromValue(String value) {
    for (EventManagerDeepBidTypeGetV30LandingType b : EventManagerDeepBidTypeGetV30LandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventManagerDeepBidTypeGetV30LandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerDeepBidTypeGetV30LandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerDeepBidTypeGetV30LandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerDeepBidTypeGetV30LandingType.fromValue(value);
    }
  }
}

