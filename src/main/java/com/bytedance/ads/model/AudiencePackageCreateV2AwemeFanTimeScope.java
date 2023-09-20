/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(AudiencePackageCreateV2AwemeFanTimeScope.Adapter.class)
public enum AudiencePackageCreateV2AwemeFanTimeScope {
  
  SIXTY_DAYS("SIXTY_DAYS"),
  
  THIRTY_DAYS("THIRTY_DAYS"),
  
  FIFTEEN_DAYS("FIFTEEN_DAYS");

  private String value;

  AudiencePackageCreateV2AwemeFanTimeScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2AwemeFanTimeScope fromValue(String value) {
    for (AudiencePackageCreateV2AwemeFanTimeScope b : AudiencePackageCreateV2AwemeFanTimeScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2AwemeFanTimeScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2AwemeFanTimeScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2AwemeFanTimeScope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2AwemeFanTimeScope.fromValue(value);
    }
  }
}
