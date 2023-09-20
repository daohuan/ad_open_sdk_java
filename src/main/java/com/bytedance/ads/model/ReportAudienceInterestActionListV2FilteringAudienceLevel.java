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
@JsonAdapter(ReportAudienceInterestActionListV2FilteringAudienceLevel.Adapter.class)
public enum ReportAudienceInterestActionListV2FilteringAudienceLevel {
  
  FOURTH_LEVEL("FOURTH_LEVEL"),
  
  FIRST_LEVEL("FIRST_LEVEL"),
  
  THIRD_LEVEL("THIRD_LEVEL"),
  
  KEYWORD_AWEME("KEYWORD_AWEME"),
  
  SECOND_LEVEL("SECOND_LEVEL");

  private String value;

  ReportAudienceInterestActionListV2FilteringAudienceLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAudienceInterestActionListV2FilteringAudienceLevel fromValue(String value) {
    for (ReportAudienceInterestActionListV2FilteringAudienceLevel b : ReportAudienceInterestActionListV2FilteringAudienceLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAudienceInterestActionListV2FilteringAudienceLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAudienceInterestActionListV2FilteringAudienceLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAudienceInterestActionListV2FilteringAudienceLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAudienceInterestActionListV2FilteringAudienceLevel.fromValue(value);
    }
  }
}

