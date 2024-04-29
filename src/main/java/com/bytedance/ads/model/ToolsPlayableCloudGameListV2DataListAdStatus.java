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
@JsonAdapter(ToolsPlayableCloudGameListV2DataListAdStatus.Adapter.class)
public enum ToolsPlayableCloudGameListV2DataListAdStatus {
  
  DELETE("DELETE"),
  
  UNUSED("UNUSED"),
  
  INUSE("INUSE");

  private String value;

  ToolsPlayableCloudGameListV2DataListAdStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPlayableCloudGameListV2DataListAdStatus fromValue(String value) {
    for (ToolsPlayableCloudGameListV2DataListAdStatus b : ToolsPlayableCloudGameListV2DataListAdStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPlayableCloudGameListV2DataListAdStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPlayableCloudGameListV2DataListAdStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPlayableCloudGameListV2DataListAdStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPlayableCloudGameListV2DataListAdStatus.fromValue(value);
    }
  }
}

