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
@JsonAdapter(QianchuanCreativeGetV10DataListTitleMaterialTitleType.Adapter.class)
public enum QianchuanCreativeGetV10DataListTitleMaterialTitleType {
  
  AWEME_CAROUSEL("AWEME_CAROUSEL"),
  
  COMMODITY_CARD("COMMODITY_CARD"),
  
  CUSTOM("CUSTOM");

  private String value;

  QianchuanCreativeGetV10DataListTitleMaterialTitleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanCreativeGetV10DataListTitleMaterialTitleType fromValue(String value) {
    for (QianchuanCreativeGetV10DataListTitleMaterialTitleType b : QianchuanCreativeGetV10DataListTitleMaterialTitleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanCreativeGetV10DataListTitleMaterialTitleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanCreativeGetV10DataListTitleMaterialTitleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanCreativeGetV10DataListTitleMaterialTitleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanCreativeGetV10DataListTitleMaterialTitleType.fromValue(value);
    }
  }
}

