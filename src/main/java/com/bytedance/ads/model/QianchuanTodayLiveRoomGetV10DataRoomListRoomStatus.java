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
@JsonAdapter(QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus.Adapter.class)
public enum QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus {
  
  ALL("ALL"),
  
  FINISH("FINISH"),
  
  LIVING("LIVING"),
  
  PAUSE("PAUSE"),
  
  PREPARE("PREPARE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus fromValue(String value) {
    for (QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus b : QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanTodayLiveRoomGetV10DataRoomListRoomStatus.fromValue(value);
    }
  }
}

