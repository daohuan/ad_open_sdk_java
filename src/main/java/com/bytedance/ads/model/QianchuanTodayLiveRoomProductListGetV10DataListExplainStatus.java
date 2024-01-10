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
@JsonAdapter(QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus.Adapter.class)
public enum QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus {
  
  BEINGEXPLAIN("BEINGEXPLAIN"),
  
  HASEXPLAIN("HASEXPLAIN"),
  
  UNEXPLAIN("UNEXPLAIN");

  private String value;

  QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus fromValue(String value) {
    for (QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus b : QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanTodayLiveRoomProductListGetV10DataListExplainStatus.fromValue(value);
    }
  }
}

