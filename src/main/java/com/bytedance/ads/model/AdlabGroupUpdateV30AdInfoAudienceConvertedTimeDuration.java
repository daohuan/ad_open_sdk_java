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
@JsonAdapter(AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration.Adapter.class)
public enum AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration {
  
  NONE("NONE"),
  
  ONE_MONTH("ONE_MONTH"),
  
  SEVEN_DAY("SEVEN_DAY"),
  
  SIX_MONTH("SIX_MONTH"),
  
  THREE_MONTH("THREE_MONTH"),
  
  TODAY("TODAY"),
  
  TWELVE_MONTH("TWELVE_MONTH");

  private String value;

  AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration fromValue(String value) {
    for (AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration b : AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration.fromValue(value);
    }
  }
}

