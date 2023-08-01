/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.1
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
@JsonAdapter(PromotionListV30FilteringStatus.Adapter.class)
public enum PromotionListV30FilteringStatus {
  
  ALL("ALL"),
  
  AUDIT("AUDIT"),
  
  AUDIT_DENY("AUDIT_DENY"),
  
  AWEME_ACCOUNT_DISABLED("AWEME_ACCOUNT_DISABLED"),
  
  AWEME_ANCHOR_DISABLED("AWEME_ANCHOR_DISABLED"),
  
  DELETED("DELETED"),
  
  DISABLED("DISABLED"),
  
  DISABLE_BY_QUOTA("DISABLE_BY_QUOTA"),
  
  FROZEN("FROZEN"),
  
  LIVE_ROOM_OFF("LIVE_ROOM_OFF"),
  
  NOT_DELETED("NOT_DELETED"),
  
  NO_SCHEDULE("NO_SCHEDULE"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  OFFLINE_BUDGET("OFFLINE_BUDGET"),
  
  OK("OK"),
  
  PREOFFLINE_BUDGET("PREOFFLINE_BUDGET"),
  
  PRODUCT_OFFLINE("PRODUCT_OFFLINE"),
  
  PROJECT_DISABLED("PROJECT_DISABLED"),
  
  PROJECT_OFFLINE_BUDGET("PROJECT_OFFLINE_BUDGET"),
  
  PROJECT_PREOFFLINE_BUDGET("PROJECT_PREOFFLINE_BUDGET"),
  
  REAUDIT("REAUDIT"),
  
  TIME_DONE("TIME_DONE"),
  
  TIME_NO_REACH("TIME_NO_REACH");

  private String value;

  PromotionListV30FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30FilteringStatus fromValue(String value) {
    for (PromotionListV30FilteringStatus b : PromotionListV30FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionListV30FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30FilteringStatus.fromValue(value);
    }
  }
}

