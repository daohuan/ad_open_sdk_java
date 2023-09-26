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
@JsonAdapter(ToolsRtaStatusUpdateV2Status.Adapter.class)
public enum ToolsRtaStatusUpdateV2Status {
  
  ENABLE("ENABLE"),
  
  DISABLE("DISABLE");

  private String value;

  ToolsRtaStatusUpdateV2Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsRtaStatusUpdateV2Status fromValue(String value) {
    for (ToolsRtaStatusUpdateV2Status b : ToolsRtaStatusUpdateV2Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsRtaStatusUpdateV2Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsRtaStatusUpdateV2Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsRtaStatusUpdateV2Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsRtaStatusUpdateV2Status.fromValue(value);
    }
  }
}

