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
@JsonAdapter(BrandAdGetV30DataAdsEnableMerchantIntention.Adapter.class)
public enum BrandAdGetV30DataAdsEnableMerchantIntention {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  BrandAdGetV30DataAdsEnableMerchantIntention(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAdGetV30DataAdsEnableMerchantIntention fromValue(Long value) {
    for (BrandAdGetV30DataAdsEnableMerchantIntention b : BrandAdGetV30DataAdsEnableMerchantIntention.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandAdGetV30DataAdsEnableMerchantIntention> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAdGetV30DataAdsEnableMerchantIntention enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAdGetV30DataAdsEnableMerchantIntention read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return BrandAdGetV30DataAdsEnableMerchantIntention.fromValue(value);
    }
  }
}

