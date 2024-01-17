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
@JsonAdapter(AdlabGroupUpdateV30AdInfoScheduleType.Adapter.class)
public enum AdlabGroupUpdateV30AdInfoScheduleType {
  
  FROM_NOW("SCHEDULE_FROM_NOW"),
  
  START_END("SCHEDULE_START_END");

  private String value;

  AdlabGroupUpdateV30AdInfoScheduleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupUpdateV30AdInfoScheduleType fromValue(String value) {
    for (AdlabGroupUpdateV30AdInfoScheduleType b : AdlabGroupUpdateV30AdInfoScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdlabGroupUpdateV30AdInfoScheduleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupUpdateV30AdInfoScheduleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupUpdateV30AdInfoScheduleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupUpdateV30AdInfoScheduleType.fromValue(value);
    }
  }
}
