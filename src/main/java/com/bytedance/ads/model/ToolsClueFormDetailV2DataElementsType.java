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
@JsonAdapter(ToolsClueFormDetailV2DataElementsType.Adapter.class)
public enum ToolsClueFormDetailV2DataElementsType {
  
  CALCULATOR("CALCULATOR"),
  
  CHECKBOX("CHECKBOX"),
  
  CITY("CITY"),
  
  DATE("DATE"),
  
  EMAIL("EMAIL"),
  
  NAME("NAME"),
  
  NUMBER("NUMBER"),
  
  RADIO("RADIO"),
  
  SELECT("SELECT"),
  
  SEX("SEX"),
  
  TELEPHONE("TELEPHONE"),
  
  TEXT("TEXT"),
  
  TEXTAREA("TEXTAREA");

  private String value;

  ToolsClueFormDetailV2DataElementsType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueFormDetailV2DataElementsType fromValue(String value) {
    for (ToolsClueFormDetailV2DataElementsType b : ToolsClueFormDetailV2DataElementsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueFormDetailV2DataElementsType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueFormDetailV2DataElementsType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueFormDetailV2DataElementsType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueFormDetailV2DataElementsType.fromValue(value);
    }
  }
}

