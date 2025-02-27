/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@JsonAdapter(QianchuanCreativeGetV10DataListStatus.Adapter.class)
public enum QianchuanCreativeGetV10DataListStatus {
  
  ADVERTISER_OFFLINE_BUDGET("ADVERTISER_OFFLINE_BUDGET"),
  
  ADVERTISER_PRE_OFFLINE_BUDGET("ADVERTISER_PRE_OFFLINE_BUDGET"),
  
  AD_AUDIT("AD_AUDIT"),
  
  AD_DISABLE("AD_DISABLE"),
  
  AD_EXTERNAL_URL_DISABLE("AD_EXTERNAL_URL_DISABLE"),
  
  AD_OFFLINE_AUDIT("AD_OFFLINE_AUDIT"),
  
  AD_OFFLINE_BUDGET("AD_OFFLINE_BUDGET"),
  
  AD_PRE_OFFLINE_BUDGET("AD_PRE_OFFLINE_BUDGET"),
  
  AD_REAUDIT("AD_REAUDIT"),
  
  AUDIT("AUDIT"),
  
  AWEME_ITEM_DISABLED("AWEME_ITEM_DISABLED"),
  
  CAMPAIGN_DISABLE("CAMPAIGN_DISABLE"),
  
  CAMPAIGN_OFFLINE_BUDGET("CAMPAIGN_OFFLINE_BUDGET"),
  
  CAMPAIGN_PRE_OFFLINE_BUDGET("CAMPAIGN_PRE_OFFLINE_BUDGET"),
  
  CREATE("CREATE"),
  
  DELETE("DELETE"),
  
  DELIVERY_OK("DELIVERY_OK"),
  
  DISABLE("DISABLE"),
  
  ERROR("ERROR"),
  
  FROZEN("FROZEN"),
  
  LIVE_CAN_NOT_LAUNCH("LIVE_CAN_NOT_LAUNCH"),
  
  NO_SCHEDULE("NO_SCHEDULE"),
  
  OFFLINE_AUDIT("OFFLINE_AUDIT"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  PRE_ONLINE("PRE_ONLINE"),
  
  REAUDIT("REAUDIT"),
  
  TIME_DONE("TIME_DONE"),
  
  TIME_NO_REACH("TIME_NO_REACH");

  private String value;

  QianchuanCreativeGetV10DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanCreativeGetV10DataListStatus fromValue(String value) {
    for (QianchuanCreativeGetV10DataListStatus b : QianchuanCreativeGetV10DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanCreativeGetV10DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanCreativeGetV10DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanCreativeGetV10DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanCreativeGetV10DataListStatus.fromValue(value);
    }
  }
}

