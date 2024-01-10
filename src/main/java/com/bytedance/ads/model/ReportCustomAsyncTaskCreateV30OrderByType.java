/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
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
@JsonAdapter(ReportCustomAsyncTaskCreateV30OrderByType.Adapter.class)
public enum ReportCustomAsyncTaskCreateV30OrderByType {
  
  ASC("ASC"),
  
  DESC("DESC");

  private String value;

  ReportCustomAsyncTaskCreateV30OrderByType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCustomAsyncTaskCreateV30OrderByType fromValue(String value) {
    for (ReportCustomAsyncTaskCreateV30OrderByType b : ReportCustomAsyncTaskCreateV30OrderByType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCustomAsyncTaskCreateV30OrderByType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCustomAsyncTaskCreateV30OrderByType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCustomAsyncTaskCreateV30OrderByType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCustomAsyncTaskCreateV30OrderByType.fromValue(value);
    }
  }
}

