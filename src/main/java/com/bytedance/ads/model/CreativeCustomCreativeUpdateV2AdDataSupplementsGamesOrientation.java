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
@JsonAdapter(CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation.Adapter.class)
public enum CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation {
  
  HORIZONTAL("HORIZONTAL"),
  
  VERTICAL("VERTICAL");

  private String value;

  CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation fromValue(String value) {
    for (CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation b : CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeCustomCreativeUpdateV2AdDataSupplementsGamesOrientation.fromValue(value);
    }
  }
}

