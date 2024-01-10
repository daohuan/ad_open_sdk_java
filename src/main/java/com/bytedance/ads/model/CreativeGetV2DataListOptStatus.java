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
@JsonAdapter(CreativeGetV2DataListOptStatus.Adapter.class)
public enum CreativeGetV2DataListOptStatus {
  
  DISABLE("CREATIVE_STATUS_DISABLE"),
  
  ENABLE("CREATIVE_STATUS_ENABLE"),
  
  OTHER("CREATIVE_STATUS_OTHER"),
  
  QUOTA_LIMIT("CREATIVE_STATUS_QUOTA_LIMIT");

  private String value;

  CreativeGetV2DataListOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeGetV2DataListOptStatus fromValue(String value) {
    for (CreativeGetV2DataListOptStatus b : CreativeGetV2DataListOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeGetV2DataListOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeGetV2DataListOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeGetV2DataListOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeGetV2DataListOptStatus.fromValue(value);
    }
  }
}

