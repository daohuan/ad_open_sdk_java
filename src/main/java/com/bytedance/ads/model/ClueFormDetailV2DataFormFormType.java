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
@JsonAdapter(ClueFormDetailV2DataFormFormType.Adapter.class)
public enum ClueFormDetailV2DataFormFormType {
  
  ADVANCED_CREATIVE_FORM("ADVANCED_CREATIVE_FORM"),
  
  NATIVE_FORM("NATIVE_FORM"),
  
  NORMAL_FORM("NORMAL_FORM");

  private String value;

  ClueFormDetailV2DataFormFormType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueFormDetailV2DataFormFormType fromValue(String value) {
    for (ClueFormDetailV2DataFormFormType b : ClueFormDetailV2DataFormFormType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueFormDetailV2DataFormFormType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueFormDetailV2DataFormFormType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueFormDetailV2DataFormFormType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueFormDetailV2DataFormFormType.fromValue(value);
    }
  }
}

