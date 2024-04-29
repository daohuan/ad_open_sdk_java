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
@JsonAdapter(ReportAdGetV2FilteringStatus.Adapter.class)
public enum ReportAdGetV2FilteringStatus {
  
  ALL("AD_STATUS_ALL"),
  
  NOT_DELETE("AD_STATUS_NOT_DELETE"),
  
  AUDIT("AD_STATUS_AUDIT"),
  
  BUDGET_EXCEED("AD_STATUS_BUDGET_EXCEED"),
  
  CAMPAIGN_EXCEED("AD_STATUS_CAMPAIGN_EXCEED"),
  
  DELETE("AD_STATUS_DELETE"),
  
  BALANCE_EXCEED("AD_STATUS_BALANCE_EXCEED"),
  
  DISABLE("AD_STATUS_DISABLE"),
  
  NO_SCHEDULE("AD_STATUS_NO_SCHEDULE"),
  
  CAMPAIGN_DISABLE("AD_STATUS_CAMPAIGN_DISABLE"),
  
  DONE("AD_STATUS_DONE"),
  
  REAUDIT("AD_STATUS_REAUDIT"),
  
  NOT_START("AD_STATUS_NOT_START"),
  
  DELIVERY_OK("AD_STATUS_DELIVERY_OK"),
  
  CREATE("AD_STATUS_CREATE"),
  
  AUDIT_DENY("AD_STATUS_AUDIT_DENY");

  private String value;

  ReportAdGetV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2FilteringStatus fromValue(String value) {
    for (ReportAdGetV2FilteringStatus b : ReportAdGetV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2FilteringStatus.fromValue(value);
    }
  }
}

