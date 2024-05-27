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
@JsonAdapter(AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong.Adapter.class)
public enum AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong {
  
  BELONG_ADVANCED_CREATIVE("BELONG_ADVANCED_CREATIVE"),
  
  BELONG_EXTERNAL_URL("BELONG_EXTERNAL_URL"),
  
  MICRO_APP("MICRO_APP");

  private String value;

  AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong fromValue(String value) {
    for (AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong b : AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsBelong.fromValue(value);
    }
  }
}

