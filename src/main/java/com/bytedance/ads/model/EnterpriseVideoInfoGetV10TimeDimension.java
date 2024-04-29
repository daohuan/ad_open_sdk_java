/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
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
@JsonAdapter(EnterpriseVideoInfoGetV10TimeDimension.Adapter.class)
public enum EnterpriseVideoInfoGetV10TimeDimension {
  
  SUM("SUM"),
  
  DAILY("DAILY");

  private String value;

  EnterpriseVideoInfoGetV10TimeDimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseVideoInfoGetV10TimeDimension fromValue(String value) {
    for (EnterpriseVideoInfoGetV10TimeDimension b : EnterpriseVideoInfoGetV10TimeDimension.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseVideoInfoGetV10TimeDimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseVideoInfoGetV10TimeDimension enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseVideoInfoGetV10TimeDimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseVideoInfoGetV10TimeDimension.fromValue(value);
    }
  }
}

