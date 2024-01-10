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
@JsonAdapter(NativeAnchorUpdateV30AnchorInfoGameAnchorGameType.Adapter.class)
public enum NativeAnchorUpdateV30AnchorInfoGameAnchorGameType {
  
  GENERAL("GENERAL"),
  
  MICRO_GAME("MICRO_GAME");

  private String value;

  NativeAnchorUpdateV30AnchorInfoGameAnchorGameType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorUpdateV30AnchorInfoGameAnchorGameType fromValue(String value) {
    for (NativeAnchorUpdateV30AnchorInfoGameAnchorGameType b : NativeAnchorUpdateV30AnchorInfoGameAnchorGameType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NativeAnchorUpdateV30AnchorInfoGameAnchorGameType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorUpdateV30AnchorInfoGameAnchorGameType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorUpdateV30AnchorInfoGameAnchorGameType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorUpdateV30AnchorInfoGameAnchorGameType.fromValue(value);
    }
  }
}

