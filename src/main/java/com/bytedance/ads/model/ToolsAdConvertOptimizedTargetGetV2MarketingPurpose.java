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
@JsonAdapter(ToolsAdConvertOptimizedTargetGetV2MarketingPurpose.Adapter.class)
public enum ToolsAdConvertOptimizedTargetGetV2MarketingPurpose {
  
  INTENTION("INTENTION"),
  
  ACKNOWLEDGE("ACKNOWLEDGE"),
  
  CONVERSION("CONVERSION"),
  
  UNLIMITED("UNLIMITED");

  private String value;

  ToolsAdConvertOptimizedTargetGetV2MarketingPurpose(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertOptimizedTargetGetV2MarketingPurpose fromValue(String value) {
    for (ToolsAdConvertOptimizedTargetGetV2MarketingPurpose b : ToolsAdConvertOptimizedTargetGetV2MarketingPurpose.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertOptimizedTargetGetV2MarketingPurpose> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertOptimizedTargetGetV2MarketingPurpose enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertOptimizedTargetGetV2MarketingPurpose read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertOptimizedTargetGetV2MarketingPurpose.fromValue(value);
    }
  }
}

