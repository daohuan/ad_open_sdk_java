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
@JsonAdapter(ToolsIndustryGetV2Level.Adapter.class)
public enum ToolsIndustryGetV2Level {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l);

  private Long value;

  ToolsIndustryGetV2Level(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsIndustryGetV2Level fromValue(Long value) {
    for (ToolsIndustryGetV2Level b : ToolsIndustryGetV2Level.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsIndustryGetV2Level> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsIndustryGetV2Level enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsIndustryGetV2Level read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsIndustryGetV2Level.fromValue(value);
    }
  }
}

