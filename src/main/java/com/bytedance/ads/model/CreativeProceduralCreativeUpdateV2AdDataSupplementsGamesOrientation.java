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
@JsonAdapter(CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation.Adapter.class)
public enum CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation {
  
  HORIZONTAL("HORIZONTAL"),
  
  VERTICAL("VERTICAL");

  private String value;

  CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation fromValue(String value) {
    for (CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation b : CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation.fromValue(value);
    }
  }
}

