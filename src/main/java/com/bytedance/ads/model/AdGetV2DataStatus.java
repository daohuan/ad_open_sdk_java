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
@JsonAdapter(AdGetV2DataStatus.Adapter.class)
public enum AdGetV2DataStatus {
  
  DISABLE("AD_STATUS_DISABLE"),
  
  AWEME_ACCOUNT_PUNISHED("AD_STATUS_AWEME_ACCOUNT_PUNISHED"),
  
  DATA_ERROR("AD_STATUS_DATA_ERROR"),
  
  BUDGET_EXCEED("AD_STATUS_BUDGET_EXCEED"),
  
  AUDIT_STATUS_ERROR("AD_STATUS_AUDIT_STATUS_ERROR"),
  
  NO_SCHEDULE("AD_STATUS_NO_SCHEDULE"),
  
  DELETE("AD_STATUS_DELETE"),
  
  PRODUCT_OFFLINE("AD_STATUS_PRODUCT_OFFLINE"),
  
  BALANCE_EXCEED("AD_STATUS_BALANCE_EXCEED"),
  
  FROZEN("AD_STATUS_FROZEN"),
  
  DISABLE_BY_QUOTA("AD_STATUS_DISABLE_BY_QUOTA"),
  
  REAUDIT("AD_STATUS_REAUDIT"),
  
  DRAFT("AD_STATUS_DRAFT"),
  
  DELIVERY_OK("AD_STATUS_DELIVERY_OK"),
  
  SOME_DELIVERY_OK("AD_STATUS_SOME_DELIVERY_OK"),
  
  PRE_OFFLINE_BUDGET("AD_STATUS_PRE_OFFLINE_BUDGET"),
  
  EXTERNAL_URL_DISABLE("AD_STATUS_EXTERNAL_URL_DISABLE"),
  
  AUDIT_DENY("AD_STATUS_AUDIT_DENY"),
  
  CAMPAIGN_EXCEED("AD_STATUS_CAMPAIGN_EXCEED"),
  
  NOT_START("AD_STATUS_NOT_START"),
  
  DSP_AD_DISABLE("AD_STATUS_DSP_AD_DISABLE"),
  
  LIVE_CANNOT_LAUNCH("AD_STATUS_LIVE_CANNOT_LAUNCH"),
  
  ADVERTISER_PRE_OFFLINE_BUDGET("AD_STATUS_ADVERTISER_PRE_OFFLINE_BUDGET"),
  
  AWEME_ACCOUNT_DISABLED("AD_STATUS_AWEME_ACCOUNT_DISABLED"),
  
  CANNOT_EDIT("AD_STATUS_CANNOT_EDIT"),
  
  LIVE_ROOM_OFF("AD_STATUS_LIVE_ROOM_OFF"),
  
  DONE("AD_STATUS_DONE"),
  
  CREATE("AD_STATUS_CREATE"),
  
  PRE_ONLINE("AD_STATUS_PRE_ONLINE"),
  
  AUDIT("AD_STATUS_AUDIT"),
  
  CAMPAIGN_DISABLE("AD_STATUS_CAMPAIGN_DISABLE"),
  
  ADVERTISER_BUDGET_EXCEED("AD_STATUS_ADVERTISER_BUDGET_EXCEED"),
  
  CAMPAIGN_PRE_OFFLINE_BUDGET("AD_STATUS_CAMPAIGN_PRE_OFFLINE_BUDGET");

  private String value;

  AdGetV2DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataStatus fromValue(String value) {
    for (AdGetV2DataStatus b : AdGetV2DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataStatus.fromValue(value);
    }
  }
}

