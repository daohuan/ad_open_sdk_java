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
@JsonAdapter(ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType.Adapter.class)
public enum ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType {
  
  TYPE_NATIVE_PROMOTION("AD_CONVERT_TYPE_NATIVE_PROMOTION"),
  
  SOURCE_TYPE_OPEN_URL("AD_CONVERT_SOURCE_TYPE_OPEN_URL"),
  
  SOURCE_TYPE_JS("AD_CONVERT_SOURCE_TYPE_JS"),
  
  SOURCE_TYPE_H5_API("AD_CONVERT_SOURCE_TYPE_H5_API"),
  
  SOURCE_TYPE_APP_DOWNLOAD("AD_CONVERT_SOURCE_TYPE_APP_DOWNLOAD"),
  
  SOURCE_TYPE_MULTI_CONVERT("AD_CONVERT_SOURCE_TYPE_MULTI_CONVERT"),
  
  TYPE_MICRO_APP_SDK("AD_CONVERT_TYPE_MICRO_APP_SDK"),
  
  SOURCE_TYPE_CPS_GAME("AD_CONVERT_SOURCE_TYPE_CPS_GAME"),
  
  TYPE_MICRO_APP_API("AD_CONVERT_TYPE_MICRO_APP_API"),
  
  SOURCE_TYPE_CONFIG("AD_CONVERT_SOURCE_TYPE_CONFIG"),
  
  SOURCE_TYPE_INTERNAL("AD_CONVERT_SOURCE_TYPE_INTERNAL"),
  
  SOURCE_TYPE_NORMAL_APP_DOWNLOAD("AD_CONVERT_SOURCE_TYPE_NORMAL_APP_DOWNLOAD"),
  
  SOURCE_TYPE_APP_API_TEMAI("AD_CONVERT_SOURCE_TYPE_APP_API_TEMAI"),
  
  SOURCE_TYPE_API("AD_CONVERT_SOURCE_TYPE_API"),
  
  SOURCE_TYPE_XPATH("AD_CONVERT_SOURCE_TYPE_XPATH"),
  
  SOURCE_TYPE_SDK("AD_CONVERT_SOURCE_TYPE_SDK");

  private String value;

  ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType fromValue(String value) {
    for (ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType b : ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType.fromValue(value);
    }
  }
}

