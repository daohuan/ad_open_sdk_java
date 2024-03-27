/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
@JsonAdapter(ReportRtaGetV2ReportType.Adapter.class)
public enum ReportRtaGetV2ReportType {
  
  AD_RTA_PLATFORM("AD_RTA_PLATFORM"),
  
  CREATIVE_RTA_PLATFORM("CREATIVE_RTA_PLATFORM"),
  
  ADVERTISER_RTA("ADVERTISER_RTA"),
  
  CAMPAIGN_RTA_PLATFORM("CAMPAIGN_RTA_PLATFORM"),
  
  CREATIVE_RTA("CREATIVE_RTA"),
  
  ADVERTISER_RTA_PLATFORM("ADVERTISER_RTA_PLATFORM"),
  
  AD_RTA("AD_RTA"),
  
  CAMPAIGN_RTA("CAMPAIGN_RTA");

  private String value;

  ReportRtaGetV2ReportType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportRtaGetV2ReportType fromValue(String value) {
    for (ReportRtaGetV2ReportType b : ReportRtaGetV2ReportType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportRtaGetV2ReportType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportRtaGetV2ReportType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportRtaGetV2ReportType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportRtaGetV2ReportType.fromValue(value);
    }
  }
}

