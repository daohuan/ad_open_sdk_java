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
@JsonAdapter(ToolsTaskRaiseGetV2DataReportsRaiseMode.Adapter.class)
public enum ToolsTaskRaiseGetV2DataReportsRaiseMode {
  
  CUSTOM("CUSTOM"),
  
  STRONG("STRONG");

  private String value;

  ToolsTaskRaiseGetV2DataReportsRaiseMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsTaskRaiseGetV2DataReportsRaiseMode fromValue(String value) {
    for (ToolsTaskRaiseGetV2DataReportsRaiseMode b : ToolsTaskRaiseGetV2DataReportsRaiseMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsTaskRaiseGetV2DataReportsRaiseMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsTaskRaiseGetV2DataReportsRaiseMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsTaskRaiseGetV2DataReportsRaiseMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsTaskRaiseGetV2DataReportsRaiseMode.fromValue(value);
    }
  }
}

