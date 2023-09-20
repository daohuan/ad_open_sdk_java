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
@JsonAdapter(ReportAdGetV2DataListLandingType.Adapter.class)
public enum ReportAdGetV2DataListLandingType {
  
  LIVE("LIVE"),
  
  LINK("LINK"),
  
  ARTICLE("ARTICLE"),
  
  APP("APP"),
  
  AWEME("AWEME"),
  
  DPA("DPA"),
  
  QUICK_APP("QUICK_APP"),
  
  STORE("STORE"),
  
  SHOP("SHOP"),
  
  GOODS("GOODS");

  private String value;

  ReportAdGetV2DataListLandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2DataListLandingType fromValue(String value) {
    for (ReportAdGetV2DataListLandingType b : ReportAdGetV2DataListLandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2DataListLandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2DataListLandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2DataListLandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2DataListLandingType.fromValue(value);
    }
  }
}

