/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@JsonAdapter(ToolsAdRaiseSetV2OptType.Adapter.class)
public enum ToolsAdRaiseSetV2OptType {
  
  STOP_RAISE("STOP_RAISE"),
  
  CLICK_RAISE("CLICK_RAISE");

  private String value;

  ToolsAdRaiseSetV2OptType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdRaiseSetV2OptType fromValue(String value) {
    for (ToolsAdRaiseSetV2OptType b : ToolsAdRaiseSetV2OptType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdRaiseSetV2OptType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdRaiseSetV2OptType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdRaiseSetV2OptType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdRaiseSetV2OptType.fromValue(value);
    }
  }
}

