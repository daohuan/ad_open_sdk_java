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
@JsonAdapter(ToolsUnionFlowPackagePromotionReportV30FilterLandingType.Adapter.class)
public enum ToolsUnionFlowPackagePromotionReportV30FilterLandingType {
  
  APP("APP"),
  
  DPA("DPA"),
  
  LINK("LINK"),
  
  MICRO_GAME("MICRO_GAME"),
  
  QUICK_APP("QUICK_APP"),
  
  SHOP("SHOP");

  private String value;

  ToolsUnionFlowPackagePromotionReportV30FilterLandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsUnionFlowPackagePromotionReportV30FilterLandingType fromValue(String value) {
    for (ToolsUnionFlowPackagePromotionReportV30FilterLandingType b : ToolsUnionFlowPackagePromotionReportV30FilterLandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsUnionFlowPackagePromotionReportV30FilterLandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsUnionFlowPackagePromotionReportV30FilterLandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsUnionFlowPackagePromotionReportV30FilterLandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsUnionFlowPackagePromotionReportV30FilterLandingType.fromValue(value);
    }
  }
}

