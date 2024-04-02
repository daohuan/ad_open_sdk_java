/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
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
@JsonAdapter(CreativeTemplateDetailGetV2DataTemplatePos.Adapter.class)
public enum CreativeTemplateDetailGetV2DataTemplatePos {
  
  CENTER("Center"),
  
  CUSTOM("Custom");

  private String value;

  CreativeTemplateDetailGetV2DataTemplatePos(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeTemplateDetailGetV2DataTemplatePos fromValue(String value) {
    for (CreativeTemplateDetailGetV2DataTemplatePos b : CreativeTemplateDetailGetV2DataTemplatePos.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeTemplateDetailGetV2DataTemplatePos> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeTemplateDetailGetV2DataTemplatePos enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeTemplateDetailGetV2DataTemplatePos read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeTemplateDetailGetV2DataTemplatePos.fromValue(value);
    }
  }
}

