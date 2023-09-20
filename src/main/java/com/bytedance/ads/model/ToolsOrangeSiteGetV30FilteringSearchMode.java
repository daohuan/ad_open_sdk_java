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
@JsonAdapter(ToolsOrangeSiteGetV30FilteringSearchMode.Adapter.class)
public enum ToolsOrangeSiteGetV30FilteringSearchMode {
  
  ALL("ALL"),
  
  OTHER("OTHER"),
  
  OUR("OUR");

  private String value;

  ToolsOrangeSiteGetV30FilteringSearchMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsOrangeSiteGetV30FilteringSearchMode fromValue(String value) {
    for (ToolsOrangeSiteGetV30FilteringSearchMode b : ToolsOrangeSiteGetV30FilteringSearchMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsOrangeSiteGetV30FilteringSearchMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsOrangeSiteGetV30FilteringSearchMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsOrangeSiteGetV30FilteringSearchMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsOrangeSiteGetV30FilteringSearchMode.fromValue(value);
    }
  }
}

