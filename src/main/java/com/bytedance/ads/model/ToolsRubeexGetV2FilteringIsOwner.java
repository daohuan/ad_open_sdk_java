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
@JsonAdapter(ToolsRubeexGetV2FilteringIsOwner.Adapter.class)
public enum ToolsRubeexGetV2FilteringIsOwner {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  ToolsRubeexGetV2FilteringIsOwner(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsRubeexGetV2FilteringIsOwner fromValue(Long value) {
    for (ToolsRubeexGetV2FilteringIsOwner b : ToolsRubeexGetV2FilteringIsOwner.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsRubeexGetV2FilteringIsOwner> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsRubeexGetV2FilteringIsOwner enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsRubeexGetV2FilteringIsOwner read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsRubeexGetV2FilteringIsOwner.fromValue(value);
    }
  }
}

