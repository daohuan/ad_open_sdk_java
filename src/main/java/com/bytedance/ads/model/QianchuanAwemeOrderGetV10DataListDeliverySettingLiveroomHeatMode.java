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
@JsonAdapter(QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode.Adapter.class)
public enum QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode {
  
  ROOM("BY_ROOM"),
  
  VIDEO("BY_VIDEO");

  private String value;

  QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode fromValue(String value) {
    for (QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode b : QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode.fromValue(value);
    }
  }
}

