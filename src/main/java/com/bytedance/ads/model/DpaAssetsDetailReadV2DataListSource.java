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
@JsonAdapter(DpaAssetsDetailReadV2DataListSource.Adapter.class)
public enum DpaAssetsDetailReadV2DataListSource {
  
  AUTO("AUTO"),
  
  MANUAL("MANUAL");

  private String value;

  DpaAssetsDetailReadV2DataListSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaAssetsDetailReadV2DataListSource fromValue(String value) {
    for (DpaAssetsDetailReadV2DataListSource b : DpaAssetsDetailReadV2DataListSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpaAssetsDetailReadV2DataListSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaAssetsDetailReadV2DataListSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaAssetsDetailReadV2DataListSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaAssetsDetailReadV2DataListSource.fromValue(value);
    }
  }
}

