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
@JsonAdapter(DouplusOrderCreateV30TargetingAge.Adapter.class)
public enum DouplusOrderCreateV30TargetingAge {
  
  Enum_18_23("AGE_BETWEEN_18_23"),
  
  Enum_24_30("AGE_BETWEEN_24_30"),
  
  Enum_31_40("AGE_BETWEEN_31_40"),
  
  Enum_41_49("AGE_BETWEEN_41_49");

  private String value;

  DouplusOrderCreateV30TargetingAge(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderCreateV30TargetingAge fromValue(String value) {
    for (DouplusOrderCreateV30TargetingAge b : DouplusOrderCreateV30TargetingAge.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DouplusOrderCreateV30TargetingAge> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderCreateV30TargetingAge enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderCreateV30TargetingAge read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderCreateV30TargetingAge.fromValue(value);
    }
  }
}

