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
@JsonAdapter(QianchuanAdUpdateV10AudienceAc.Adapter.class)
public enum QianchuanAdUpdateV10AudienceAc {
  
  Enum_2G("2G"),
  
  Enum_3G("3G"),
  
  Enum_4G("4G"),
  
  Enum_5G("5G"),
  
  WIFI("WIFI");

  private String value;

  QianchuanAdUpdateV10AudienceAc(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdUpdateV10AudienceAc fromValue(String value) {
    for (QianchuanAdUpdateV10AudienceAc b : QianchuanAdUpdateV10AudienceAc.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdUpdateV10AudienceAc> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdUpdateV10AudienceAc enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdUpdateV10AudienceAc read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdUpdateV10AudienceAc.fromValue(value);
    }
  }
}

