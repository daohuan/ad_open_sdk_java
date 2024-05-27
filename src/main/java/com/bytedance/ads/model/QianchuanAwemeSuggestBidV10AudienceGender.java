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
@JsonAdapter(QianchuanAwemeSuggestBidV10AudienceGender.Adapter.class)
public enum QianchuanAwemeSuggestBidV10AudienceGender {
  
  FEMALE("GENDER_FEMALE"),
  
  MALE("GENDER_MALE");

  private String value;

  QianchuanAwemeSuggestBidV10AudienceGender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeSuggestBidV10AudienceGender fromValue(String value) {
    for (QianchuanAwemeSuggestBidV10AudienceGender b : QianchuanAwemeSuggestBidV10AudienceGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeSuggestBidV10AudienceGender> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeSuggestBidV10AudienceGender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeSuggestBidV10AudienceGender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeSuggestBidV10AudienceGender.fromValue(value);
    }
  }
}

