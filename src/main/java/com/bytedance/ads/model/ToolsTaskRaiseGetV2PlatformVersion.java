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
@JsonAdapter(ToolsTaskRaiseGetV2PlatformVersion.Adapter.class)
public enum ToolsTaskRaiseGetV2PlatformVersion {
  
  V2("V2");

  private String value;

  ToolsTaskRaiseGetV2PlatformVersion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsTaskRaiseGetV2PlatformVersion fromValue(String value) {
    for (ToolsTaskRaiseGetV2PlatformVersion b : ToolsTaskRaiseGetV2PlatformVersion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsTaskRaiseGetV2PlatformVersion> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsTaskRaiseGetV2PlatformVersion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsTaskRaiseGetV2PlatformVersion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsTaskRaiseGetV2PlatformVersion.fromValue(value);
    }
  }
}

