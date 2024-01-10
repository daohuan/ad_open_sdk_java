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
@JsonAdapter(ToolsAdConvertQueryV2DataListExternalActionsConvertDataType.Adapter.class)
public enum ToolsAdConvertQueryV2DataListExternalActionsConvertDataType {
  
  LESS_THAN_HUNDRED("AD_CONVERT_DATA_TYPE_LESS_THAN_HUNDRED"),
  
  PER_TIMES("AD_CONVERT_DATA_TYPE_PER_TIMES"),
  
  EVERY_ONE("AD_CONVERT_DATA_TYPE_EVERY_ONE"),
  
  ONLY_ONE("AD_CONVERT_DATA_TYPE_ONLY_ONE"),
  
  EVERY_ONE_NEW("AD_CONVERT_DATA_TYPE_EVERY_ONE_NEW"),
  
  LESS_THAN_TEN("AD_CONVERT_DATA_TYPE_LESS_THAN_TEN");

  private String value;

  ToolsAdConvertQueryV2DataListExternalActionsConvertDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertQueryV2DataListExternalActionsConvertDataType fromValue(String value) {
    for (ToolsAdConvertQueryV2DataListExternalActionsConvertDataType b : ToolsAdConvertQueryV2DataListExternalActionsConvertDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertQueryV2DataListExternalActionsConvertDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertQueryV2DataListExternalActionsConvertDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertQueryV2DataListExternalActionsConvertDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertQueryV2DataListExternalActionsConvertDataType.fromValue(value);
    }
  }
}

