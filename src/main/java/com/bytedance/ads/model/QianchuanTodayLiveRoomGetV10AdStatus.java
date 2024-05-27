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
@JsonAdapter(QianchuanTodayLiveRoomGetV10AdStatus.Adapter.class)
public enum QianchuanTodayLiveRoomGetV10AdStatus {
  
  ALL("ALL"),
  
  DELIVERY_OK("DELIVERY_OK"),
  
  NO_DELIVERY("NO_DELIVERY");

  private String value;

  QianchuanTodayLiveRoomGetV10AdStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanTodayLiveRoomGetV10AdStatus fromValue(String value) {
    for (QianchuanTodayLiveRoomGetV10AdStatus b : QianchuanTodayLiveRoomGetV10AdStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanTodayLiveRoomGetV10AdStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanTodayLiveRoomGetV10AdStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanTodayLiveRoomGetV10AdStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanTodayLiveRoomGetV10AdStatus.fromValue(value);
    }
  }
}

