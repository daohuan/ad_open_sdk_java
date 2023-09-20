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
@JsonAdapter(ReportCampaignGetV2DataListAc.Adapter.class)
public enum ReportCampaignGetV2DataListAc {
  
  Enum_4G("4G"),
  
  UNKNOWN("unknown"),
  
  Enum_2G("2G"),
  
  Enum_3G("3G"),
  
  Enum_5G("5G"),
  
  WIFI("WIFI");

  private String value;

  ReportCampaignGetV2DataListAc(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2DataListAc fromValue(String value) {
    for (ReportCampaignGetV2DataListAc b : ReportCampaignGetV2DataListAc.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2DataListAc> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2DataListAc enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2DataListAc read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2DataListAc.fromValue(value);
    }
  }
}

