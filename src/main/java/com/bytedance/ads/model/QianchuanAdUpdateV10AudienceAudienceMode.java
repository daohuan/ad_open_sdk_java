/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
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
@JsonAdapter(QianchuanAdUpdateV10AudienceAudienceMode.Adapter.class)
public enum QianchuanAdUpdateV10AudienceAudienceMode {
  
  AUTO("AUTO"),
  
  AUTO_ORIENTATION("AUTO_ORIENTATION"),
  
  CUSTOM("CUSTOM"),
  
  NONE("NONE"),
  
  ORIENTATION_PACKAGE("ORIENTATION_PACKAGE");

  private String value;

  QianchuanAdUpdateV10AudienceAudienceMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdUpdateV10AudienceAudienceMode fromValue(String value) {
    for (QianchuanAdUpdateV10AudienceAudienceMode b : QianchuanAdUpdateV10AudienceAudienceMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdUpdateV10AudienceAudienceMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdUpdateV10AudienceAudienceMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdUpdateV10AudienceAudienceMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdUpdateV10AudienceAudienceMode.fromValue(value);
    }
  }
}

