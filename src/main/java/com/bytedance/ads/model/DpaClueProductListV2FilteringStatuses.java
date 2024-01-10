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
@JsonAdapter(DpaClueProductListV2FilteringStatuses.Adapter.class)
public enum DpaClueProductListV2FilteringStatuses {
  
  OFFLINE("STATUS_OFFLINE"),
  
  ONLINE("STATUS_ONLINE");

  private String value;

  DpaClueProductListV2FilteringStatuses(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaClueProductListV2FilteringStatuses fromValue(String value) {
    for (DpaClueProductListV2FilteringStatuses b : DpaClueProductListV2FilteringStatuses.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpaClueProductListV2FilteringStatuses> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaClueProductListV2FilteringStatuses enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaClueProductListV2FilteringStatuses read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaClueProductListV2FilteringStatuses.fromValue(value);
    }
  }
}

