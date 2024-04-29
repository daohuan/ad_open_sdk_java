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
@JsonAdapter(ToolsAdConvertDeepbidReadV2FlowControlMode.Adapter.class)
public enum ToolsAdConvertDeepbidReadV2FlowControlMode {
  
  FAST("FLOW_CONTROL_MODE_FAST"),
  
  TWO_PHASES("FLOW_CONTROL_MODE_TWO_PHASES"),
  
  BALANCE("FLOW_CONTROL_MODE_BALANCE"),
  
  HOURLY("FLOW_CONTROL_MODE_HOURLY"),
  
  SMOOTH("FLOW_CONTROL_MODE_SMOOTH");

  private String value;

  ToolsAdConvertDeepbidReadV2FlowControlMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertDeepbidReadV2FlowControlMode fromValue(String value) {
    for (ToolsAdConvertDeepbidReadV2FlowControlMode b : ToolsAdConvertDeepbidReadV2FlowControlMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertDeepbidReadV2FlowControlMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertDeepbidReadV2FlowControlMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertDeepbidReadV2FlowControlMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertDeepbidReadV2FlowControlMode.fromValue(value);
    }
  }
}

