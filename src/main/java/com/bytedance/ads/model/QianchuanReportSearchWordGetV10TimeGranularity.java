/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
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
@JsonAdapter(QianchuanReportSearchWordGetV10TimeGranularity.Adapter.class)
public enum QianchuanReportSearchWordGetV10TimeGranularity {
  
  DAILY("TIME_GRANULARITY_DAILY"),
  
  WEEK("TIME_GRANULARITY_WEEK");

  private String value;

  QianchuanReportSearchWordGetV10TimeGranularity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportSearchWordGetV10TimeGranularity fromValue(String value) {
    for (QianchuanReportSearchWordGetV10TimeGranularity b : QianchuanReportSearchWordGetV10TimeGranularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportSearchWordGetV10TimeGranularity> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportSearchWordGetV10TimeGranularity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportSearchWordGetV10TimeGranularity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportSearchWordGetV10TimeGranularity.fromValue(value);
    }
  }
}

