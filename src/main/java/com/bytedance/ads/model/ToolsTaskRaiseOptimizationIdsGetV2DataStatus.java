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
@JsonAdapter(ToolsTaskRaiseOptimizationIdsGetV2DataStatus.Adapter.class)
public enum ToolsTaskRaiseOptimizationIdsGetV2DataStatus {
  
  DISABLERAISE("DISABLERAISE"),
  
  ENABLERAISE("ENABLERAISE"),
  
  RAISING("RAISING");

  private String value;

  ToolsTaskRaiseOptimizationIdsGetV2DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsTaskRaiseOptimizationIdsGetV2DataStatus fromValue(String value) {
    for (ToolsTaskRaiseOptimizationIdsGetV2DataStatus b : ToolsTaskRaiseOptimizationIdsGetV2DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsTaskRaiseOptimizationIdsGetV2DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsTaskRaiseOptimizationIdsGetV2DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsTaskRaiseOptimizationIdsGetV2DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsTaskRaiseOptimizationIdsGetV2DataStatus.fromValue(value);
    }
  }
}

