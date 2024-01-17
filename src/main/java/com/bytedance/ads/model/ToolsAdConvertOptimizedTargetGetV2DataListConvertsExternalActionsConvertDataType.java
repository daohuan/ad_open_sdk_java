/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType.Adapter.class)
public enum ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType {
  
  EVERY_ONE_NEW("AD_CONVERT_DATA_TYPE_EVERY_ONE_NEW"),
  
  PER_TIMES("AD_CONVERT_DATA_TYPE_PER_TIMES"),
  
  EVERY_ONE("AD_CONVERT_DATA_TYPE_EVERY_ONE"),
  
  LESS_THAN_TEN("AD_CONVERT_DATA_TYPE_LESS_THAN_TEN"),
  
  ONLY_ONE("AD_CONVERT_DATA_TYPE_ONLY_ONE"),
  
  LESS_THAN_HUNDRED("AD_CONVERT_DATA_TYPE_LESS_THAN_HUNDRED");

  private String value;

  ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType fromValue(String value) {
    for (ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType b : ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertOptimizedTargetGetV2DataListConvertsExternalActionsConvertDataType.fromValue(value);
    }
  }
}
