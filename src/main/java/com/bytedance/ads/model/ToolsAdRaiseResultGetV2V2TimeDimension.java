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
@JsonAdapter(ToolsAdRaiseResultGetV2V2TimeDimension.Adapter.class)
public enum ToolsAdRaiseResultGetV2V2TimeDimension {
  
  SUM("SUM"),
  
  HOURLY("HOURLY");

  private String value;

  ToolsAdRaiseResultGetV2V2TimeDimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdRaiseResultGetV2V2TimeDimension fromValue(String value) {
    for (ToolsAdRaiseResultGetV2V2TimeDimension b : ToolsAdRaiseResultGetV2V2TimeDimension.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdRaiseResultGetV2V2TimeDimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdRaiseResultGetV2V2TimeDimension enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdRaiseResultGetV2V2TimeDimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdRaiseResultGetV2V2TimeDimension.fromValue(value);
    }
  }
}

