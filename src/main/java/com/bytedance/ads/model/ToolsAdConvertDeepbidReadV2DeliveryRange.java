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
@JsonAdapter(ToolsAdConvertDeepbidReadV2DeliveryRange.Adapter.class)
public enum ToolsAdConvertDeepbidReadV2DeliveryRange {
  
  DEFAULT("DEFAULT"),
  
  UNIVERSAL("UNIVERSAL"),
  
  UNION("UNION");

  private String value;

  ToolsAdConvertDeepbidReadV2DeliveryRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertDeepbidReadV2DeliveryRange fromValue(String value) {
    for (ToolsAdConvertDeepbidReadV2DeliveryRange b : ToolsAdConvertDeepbidReadV2DeliveryRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertDeepbidReadV2DeliveryRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertDeepbidReadV2DeliveryRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertDeepbidReadV2DeliveryRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertDeepbidReadV2DeliveryRange.fromValue(value);
    }
  }
}

