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
@JsonAdapter(QianchuanReportMaterialGetV10FilteringCarouselSource.Adapter.class)
public enum QianchuanReportMaterialGetV10FilteringCarouselSource {
  
  AWEME("AWEME"),
  
  E_COMMERCE("E_COMMERCE"),
  
  JI_CHUANG("JI_CHUANG");

  private String value;

  QianchuanReportMaterialGetV10FilteringCarouselSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportMaterialGetV10FilteringCarouselSource fromValue(String value) {
    for (QianchuanReportMaterialGetV10FilteringCarouselSource b : QianchuanReportMaterialGetV10FilteringCarouselSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportMaterialGetV10FilteringCarouselSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportMaterialGetV10FilteringCarouselSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportMaterialGetV10FilteringCarouselSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportMaterialGetV10FilteringCarouselSource.fromValue(value);
    }
  }
}

