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
@JsonAdapter(AudiencePackageUpdateV2Ac.Adapter.class)
public enum AudiencePackageUpdateV2Ac {
  
  Enum_4G("4G"),
  
  Enum_2G("2G"),
  
  WIFI("WIFI"),
  
  Enum_3G("3G");

  private String value;

  AudiencePackageUpdateV2Ac(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageUpdateV2Ac fromValue(String value) {
    for (AudiencePackageUpdateV2Ac b : AudiencePackageUpdateV2Ac.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageUpdateV2Ac> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageUpdateV2Ac enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageUpdateV2Ac read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageUpdateV2Ac.fromValue(value);
    }
  }
}

