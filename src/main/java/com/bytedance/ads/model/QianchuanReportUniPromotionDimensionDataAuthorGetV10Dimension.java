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
@JsonAdapter(QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension.Adapter.class)
public enum QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension {
  
  DAILY("TIME_GRANULARITY_DAILY"),
  
  HOURLY("TIME_GRANULARITY_HOURLY");

  private String value;

  QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension fromValue(String value) {
    for (QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension b : QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportUniPromotionDimensionDataAuthorGetV10Dimension.fromValue(value);
    }
  }
}

