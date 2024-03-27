/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
@JsonAdapter(QianchuanCreativeGetV10DataListVideoMaterialListImageMode.Adapter.class)
public enum QianchuanCreativeGetV10DataListVideoMaterialListImageMode {
  
  AWEME_LIVE_ROOM("AWEME_LIVE_ROOM"),
  
  LARGE("LARGE"),
  
  LARGE_VERTICAL("LARGE_VERTICAL"),
  
  SMALL("SMALL"),
  
  UNION_SPLASH("UNION_SPLASH"),
  
  VIDEO_LARGE("VIDEO_LARGE"),
  
  VIDEO_VERTICAL("VIDEO_VERTICAL");

  private String value;

  QianchuanCreativeGetV10DataListVideoMaterialListImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanCreativeGetV10DataListVideoMaterialListImageMode fromValue(String value) {
    for (QianchuanCreativeGetV10DataListVideoMaterialListImageMode b : QianchuanCreativeGetV10DataListVideoMaterialListImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanCreativeGetV10DataListVideoMaterialListImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanCreativeGetV10DataListVideoMaterialListImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanCreativeGetV10DataListVideoMaterialListImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanCreativeGetV10DataListVideoMaterialListImageMode.fromValue(value);
    }
  }
}

