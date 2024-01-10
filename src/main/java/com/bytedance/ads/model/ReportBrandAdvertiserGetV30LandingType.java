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
@JsonAdapter(ReportBrandAdvertiserGetV30LandingType.Adapter.class)
public enum ReportBrandAdvertiserGetV30LandingType {
  
  NUMBER_1(1l),
  
  NUMBER_10(10l),
  
  NUMBER_11(11l),
  
  NUMBER_12(12l),
  
  NUMBER_13(13l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_5(5l),
  
  NUMBER_6(6l),
  
  NUMBER_7(7l),
  
  NUMBER_8(8l),
  
  NUMBER_9(9l);

  private Long value;

  ReportBrandAdvertiserGetV30LandingType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportBrandAdvertiserGetV30LandingType fromValue(Long value) {
    for (ReportBrandAdvertiserGetV30LandingType b : ReportBrandAdvertiserGetV30LandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportBrandAdvertiserGetV30LandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportBrandAdvertiserGetV30LandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportBrandAdvertiserGetV30LandingType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ReportBrandAdvertiserGetV30LandingType.fromValue(value);
    }
  }
}

