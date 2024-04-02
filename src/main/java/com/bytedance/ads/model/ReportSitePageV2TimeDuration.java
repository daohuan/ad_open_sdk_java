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
@JsonAdapter(ReportSitePageV2TimeDuration.Adapter.class)
public enum ReportSitePageV2TimeDuration {
  
  DAY("DAY"),
  
  THREE_DAYS("THREE_DAYS"),
  
  WEEK("WEEK"),
  
  MONTH("MONTH");

  private String value;

  ReportSitePageV2TimeDuration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportSitePageV2TimeDuration fromValue(String value) {
    for (ReportSitePageV2TimeDuration b : ReportSitePageV2TimeDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportSitePageV2TimeDuration> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportSitePageV2TimeDuration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportSitePageV2TimeDuration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportSitePageV2TimeDuration.fromValue(value);
    }
  }
}

