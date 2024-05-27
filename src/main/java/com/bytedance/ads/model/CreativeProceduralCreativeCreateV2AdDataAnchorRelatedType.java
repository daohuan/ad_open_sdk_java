/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
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
@JsonAdapter(CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType.Adapter.class)
public enum CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType {
  
  AUTO("AUTO"),
  
  OFF("OFF"),
  
  SELECT("SELECT");

  private String value;

  CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType fromValue(String value) {
    for (CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType b : CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeProceduralCreativeCreateV2AdDataAnchorRelatedType.fromValue(value);
    }
  }
}

