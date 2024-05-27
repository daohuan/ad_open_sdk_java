/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
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
@JsonAdapter(QianchuanAdCreateV10DeliverySettingDeepExternalAction.Adapter.class)
public enum QianchuanAdCreateV10DeliverySettingDeepExternalAction {
  
  CARD_ACTIVE("AD_CONVERT_TYPE_CARD_ACTIVE"),
  
  LIVE_PAY_ROI("AD_CONVERT_TYPE_LIVE_PAY_ROI");

  private String value;

  QianchuanAdCreateV10DeliverySettingDeepExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdCreateV10DeliverySettingDeepExternalAction fromValue(String value) {
    for (QianchuanAdCreateV10DeliverySettingDeepExternalAction b : QianchuanAdCreateV10DeliverySettingDeepExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdCreateV10DeliverySettingDeepExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdCreateV10DeliverySettingDeepExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdCreateV10DeliverySettingDeepExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdCreateV10DeliverySettingDeepExternalAction.fromValue(value);
    }
  }
}

