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
@JsonAdapter(CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType.Adapter.class)
public enum CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType {
  
  IMAGE("Image"),
  
  TEXT("Text");

  private String value;

  CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType fromValue(String value) {
    for (CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType b : CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeAutoGenerateConfigV2CreateV2StrategyDataStrategyStateStateType.fromValue(value);
    }
  }
}

