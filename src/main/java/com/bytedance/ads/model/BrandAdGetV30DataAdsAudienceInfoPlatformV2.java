/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
@JsonAdapter(BrandAdGetV30DataAdsAudienceInfoPlatformV2.Adapter.class)
public enum BrandAdGetV30DataAdsAudienceInfoPlatformV2 {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_5(5l);

  private Long value;

  BrandAdGetV30DataAdsAudienceInfoPlatformV2(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAdGetV30DataAdsAudienceInfoPlatformV2 fromValue(Long value) {
    for (BrandAdGetV30DataAdsAudienceInfoPlatformV2 b : BrandAdGetV30DataAdsAudienceInfoPlatformV2.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandAdGetV30DataAdsAudienceInfoPlatformV2> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAdGetV30DataAdsAudienceInfoPlatformV2 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAdGetV30DataAdsAudienceInfoPlatformV2 read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return BrandAdGetV30DataAdsAudienceInfoPlatformV2.fromValue(value);
    }
  }
}

