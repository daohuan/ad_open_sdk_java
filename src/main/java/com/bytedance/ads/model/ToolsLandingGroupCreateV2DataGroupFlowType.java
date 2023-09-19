/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
@JsonAdapter(ToolsLandingGroupCreateV2DataGroupFlowType.Adapter.class)
public enum ToolsLandingGroupCreateV2DataGroupFlowType {
  
  AVERAGE("FLOW_DISTRIBUTION_TYPE_AVERAGE"),
  
  INTELLIGENCE("FLOW_DISTRIBUTION_TYPE_INTELLIGENCE");

  private String value;

  ToolsLandingGroupCreateV2DataGroupFlowType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsLandingGroupCreateV2DataGroupFlowType fromValue(String value) {
    for (ToolsLandingGroupCreateV2DataGroupFlowType b : ToolsLandingGroupCreateV2DataGroupFlowType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsLandingGroupCreateV2DataGroupFlowType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsLandingGroupCreateV2DataGroupFlowType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsLandingGroupCreateV2DataGroupFlowType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsLandingGroupCreateV2DataGroupFlowType.fromValue(value);
    }
  }
}
