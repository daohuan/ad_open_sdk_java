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
@JsonAdapter(ToolsBidSuggestV2FilterOwnAwemeFans.Adapter.class)
public enum ToolsBidSuggestV2FilterOwnAwemeFans {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  ToolsBidSuggestV2FilterOwnAwemeFans(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2FilterOwnAwemeFans fromValue(Long value) {
    for (ToolsBidSuggestV2FilterOwnAwemeFans b : ToolsBidSuggestV2FilterOwnAwemeFans.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2FilterOwnAwemeFans> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2FilterOwnAwemeFans enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2FilterOwnAwemeFans read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsBidSuggestV2FilterOwnAwemeFans.fromValue(value);
    }
  }
}

