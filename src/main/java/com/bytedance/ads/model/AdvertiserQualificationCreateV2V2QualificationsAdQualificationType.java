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
@JsonAdapter(AdvertiserQualificationCreateV2V2QualificationsAdQualificationType.Adapter.class)
public enum AdvertiserQualificationCreateV2V2QualificationsAdQualificationType {
  
  AUTHORIZATION("AUTHORIZATION"),
  
  CERTIFY("CERTIFY"),
  
  TRADEMARK_CERT("TRADEMARK_CERT"),
  
  AD_DATA_CERT("AD_DATA_CERT"),
  
  INSPECT_REPORT("INSPECT_REPORT");

  private String value;

  AdvertiserQualificationCreateV2V2QualificationsAdQualificationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserQualificationCreateV2V2QualificationsAdQualificationType fromValue(String value) {
    for (AdvertiserQualificationCreateV2V2QualificationsAdQualificationType b : AdvertiserQualificationCreateV2V2QualificationsAdQualificationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserQualificationCreateV2V2QualificationsAdQualificationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserQualificationCreateV2V2QualificationsAdQualificationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserQualificationCreateV2V2QualificationsAdQualificationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserQualificationCreateV2V2QualificationsAdQualificationType.fromValue(value);
    }
  }
}

