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
@JsonAdapter(ToolsAdminInfoV2DataDistrictsSubDistrictsLevel.Adapter.class)
public enum ToolsAdminInfoV2DataDistrictsSubDistrictsLevel {
  
  FOUR_LEVEL("FOUR_LEVEL"),
  
  NONE("NONE"),
  
  ONE_LEVEL("ONE_LEVEL"),
  
  THREE_LEVEL("THREE_LEVEL"),
  
  TWO_LEVEL("TWO_LEVEL");

  private String value;

  ToolsAdminInfoV2DataDistrictsSubDistrictsLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdminInfoV2DataDistrictsSubDistrictsLevel fromValue(String value) {
    for (ToolsAdminInfoV2DataDistrictsSubDistrictsLevel b : ToolsAdminInfoV2DataDistrictsSubDistrictsLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAdminInfoV2DataDistrictsSubDistrictsLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdminInfoV2DataDistrictsSubDistrictsLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdminInfoV2DataDistrictsSubDistrictsLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdminInfoV2DataDistrictsSubDistrictsLevel.fromValue(value);
    }
  }
}

