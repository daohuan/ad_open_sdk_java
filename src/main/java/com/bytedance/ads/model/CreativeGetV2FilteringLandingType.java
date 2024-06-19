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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(CreativeGetV2FilteringLandingType.Adapter.class)
public enum CreativeGetV2FilteringLandingType {
  
  APP("APP"),
  
  ARTICLE("ARTICLE"),
  
  AWEME("AWEME"),
  
  BRAND_EXTERNAL("BRAND_EXTERNAL"),
  
  DPA("DPA"),
  
  GOODS("GOODS"),
  
  LINK("LINK"),
  
  LIVE("LIVE"),
  
  MICRO_GAME("MICRO_GAME"),
  
  QUICK_APP("QUICK_APP"),
  
  SHOP("SHOP"),
  
  STORE("STORE");

  private String value;

  CreativeGetV2FilteringLandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeGetV2FilteringLandingType fromValue(String value) {
    for (CreativeGetV2FilteringLandingType b : CreativeGetV2FilteringLandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeGetV2FilteringLandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeGetV2FilteringLandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeGetV2FilteringLandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeGetV2FilteringLandingType.fromValue(value);
    }
  }
}

