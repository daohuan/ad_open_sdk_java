/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
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
@JsonAdapter(ToolsDiagnosisSuggestionGetV2Scenes.Adapter.class)
public enum ToolsDiagnosisSuggestionGetV2Scenes {
  
  CLEAN("CLEAN"),
  
  POTENTIAL("POTENTIAL");

  private String value;

  ToolsDiagnosisSuggestionGetV2Scenes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsDiagnosisSuggestionGetV2Scenes fromValue(String value) {
    for (ToolsDiagnosisSuggestionGetV2Scenes b : ToolsDiagnosisSuggestionGetV2Scenes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsDiagnosisSuggestionGetV2Scenes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsDiagnosisSuggestionGetV2Scenes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsDiagnosisSuggestionGetV2Scenes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsDiagnosisSuggestionGetV2Scenes.fromValue(value);
    }
  }
}

