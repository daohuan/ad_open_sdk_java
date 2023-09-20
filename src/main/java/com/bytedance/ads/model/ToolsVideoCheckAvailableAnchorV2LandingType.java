/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
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
@JsonAdapter(ToolsVideoCheckAvailableAnchorV2LandingType.Adapter.class)
public enum ToolsVideoCheckAvailableAnchorV2LandingType {
  
  APP("APP");

  private String value;

  ToolsVideoCheckAvailableAnchorV2LandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsVideoCheckAvailableAnchorV2LandingType fromValue(String value) {
    for (ToolsVideoCheckAvailableAnchorV2LandingType b : ToolsVideoCheckAvailableAnchorV2LandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsVideoCheckAvailableAnchorV2LandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsVideoCheckAvailableAnchorV2LandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsVideoCheckAvailableAnchorV2LandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsVideoCheckAvailableAnchorV2LandingType.fromValue(value);
    }
  }
}

