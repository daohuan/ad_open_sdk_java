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
@JsonAdapter(ToolsQuotaGetV2DeliveryRange.Adapter.class)
public enum ToolsQuotaGetV2DeliveryRange {
  
  DEFAULT("DEFAULT"),
  
  UNION("UNION");

  private String value;

  ToolsQuotaGetV2DeliveryRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsQuotaGetV2DeliveryRange fromValue(String value) {
    for (ToolsQuotaGetV2DeliveryRange b : ToolsQuotaGetV2DeliveryRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsQuotaGetV2DeliveryRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsQuotaGetV2DeliveryRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsQuotaGetV2DeliveryRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsQuotaGetV2DeliveryRange.fromValue(value);
    }
  }
}

