/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(AdConvertOptimizedTargetGetV30AdType.Adapter.class)
public enum AdConvertOptimizedTargetGetV30AdType {
  
  ALL("ALL");

  private String value;

  AdConvertOptimizedTargetGetV30AdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdConvertOptimizedTargetGetV30AdType fromValue(String value) {
    for (AdConvertOptimizedTargetGetV30AdType b : AdConvertOptimizedTargetGetV30AdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdConvertOptimizedTargetGetV30AdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdConvertOptimizedTargetGetV30AdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdConvertOptimizedTargetGetV30AdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdConvertOptimizedTargetGetV30AdType.fromValue(value);
    }
  }
}
