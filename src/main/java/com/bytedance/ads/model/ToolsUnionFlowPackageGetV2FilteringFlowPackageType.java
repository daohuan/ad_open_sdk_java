/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
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
@JsonAdapter(ToolsUnionFlowPackageGetV2FilteringFlowPackageType.Adapter.class)
public enum ToolsUnionFlowPackageGetV2FilteringFlowPackageType {
  
  CUSTOMIZE("CUSTOMIZE"),
  
  FEATURED("FEATURED"),
  
  SYSTEM("SYSTEM");

  private String value;

  ToolsUnionFlowPackageGetV2FilteringFlowPackageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsUnionFlowPackageGetV2FilteringFlowPackageType fromValue(String value) {
    for (ToolsUnionFlowPackageGetV2FilteringFlowPackageType b : ToolsUnionFlowPackageGetV2FilteringFlowPackageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsUnionFlowPackageGetV2FilteringFlowPackageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsUnionFlowPackageGetV2FilteringFlowPackageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsUnionFlowPackageGetV2FilteringFlowPackageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsUnionFlowPackageGetV2FilteringFlowPackageType.fromValue(value);
    }
  }
}

