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
@JsonAdapter(ToolsKeywordsBidRatioCreateV30DataConflictDimension.Adapter.class)
public enum ToolsKeywordsBidRatioCreateV30DataConflictDimension {
  
  ADVERTISER("ADVERTISER"),
  
  PROJECT("PROJECT");

  private String value;

  ToolsKeywordsBidRatioCreateV30DataConflictDimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsKeywordsBidRatioCreateV30DataConflictDimension fromValue(String value) {
    for (ToolsKeywordsBidRatioCreateV30DataConflictDimension b : ToolsKeywordsBidRatioCreateV30DataConflictDimension.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsKeywordsBidRatioCreateV30DataConflictDimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsKeywordsBidRatioCreateV30DataConflictDimension enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsKeywordsBidRatioCreateV30DataConflictDimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsKeywordsBidRatioCreateV30DataConflictDimension.fromValue(value);
    }
  }
}

