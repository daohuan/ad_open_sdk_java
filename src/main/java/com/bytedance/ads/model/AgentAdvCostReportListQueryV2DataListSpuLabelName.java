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
@JsonAdapter(AgentAdvCostReportListQueryV2DataListSpuLabelName.Adapter.class)
public enum AgentAdvCostReportListQueryV2DataListSpuLabelName {
  
  BRAND_CONVERSION("BRAND_CONVERSION"),
  
  BRAND_EXPOSURE("BRAND_EXPOSURE"),
  
  BRAND_GRASS("BRAND_GRASS"),
  
  CONCENTRATING_RESOURCE("CONCENTRATING_RESOURCE"),
  
  STAR_RESOURCE("STAR_RESOURCE");

  private String value;

  AgentAdvCostReportListQueryV2DataListSpuLabelName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvCostReportListQueryV2DataListSpuLabelName fromValue(String value) {
    for (AgentAdvCostReportListQueryV2DataListSpuLabelName b : AgentAdvCostReportListQueryV2DataListSpuLabelName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentAdvCostReportListQueryV2DataListSpuLabelName> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvCostReportListQueryV2DataListSpuLabelName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvCostReportListQueryV2DataListSpuLabelName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvCostReportListQueryV2DataListSpuLabelName.fromValue(value);
    }
  }
}

