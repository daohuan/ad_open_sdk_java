/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
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
@JsonAdapter(ToolsInterestActionId2wordV2TagType.Adapter.class)
public enum ToolsInterestActionId2wordV2TagType {
  
  CATEGORY("CATEGORY"),
  
  KEYWORD("KEYWORD");

  private String value;

  ToolsInterestActionId2wordV2TagType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsInterestActionId2wordV2TagType fromValue(String value) {
    for (ToolsInterestActionId2wordV2TagType b : ToolsInterestActionId2wordV2TagType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsInterestActionId2wordV2TagType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsInterestActionId2wordV2TagType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsInterestActionId2wordV2TagType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsInterestActionId2wordV2TagType.fromValue(value);
    }
  }
}

