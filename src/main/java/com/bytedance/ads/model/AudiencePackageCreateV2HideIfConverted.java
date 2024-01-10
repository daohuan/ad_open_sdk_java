/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
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
@JsonAdapter(AudiencePackageCreateV2HideIfConverted.Adapter.class)
public enum AudiencePackageCreateV2HideIfConverted {
  
  ADVERTISER("ADVERTISER"),
  
  CUSTOMER("CUSTOMER"),
  
  ORGANIZATION("ORGANIZATION"),
  
  CAMPAIGN("CAMPAIGN"),
  
  APP("APP"),
  
  NO_EXCLUDE("NO_EXCLUDE"),
  
  AD("AD");

  private String value;

  AudiencePackageCreateV2HideIfConverted(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2HideIfConverted fromValue(String value) {
    for (AudiencePackageCreateV2HideIfConverted b : AudiencePackageCreateV2HideIfConverted.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2HideIfConverted> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2HideIfConverted enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2HideIfConverted read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2HideIfConverted.fromValue(value);
    }
  }
}

