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
@JsonAdapter(BrandCampaignGetV30CampaignStatus.Adapter.class)
public enum BrandCampaignGetV30CampaignStatus {
  
  NUMBER_1(1l),
  
  NUMBER_10(10l),
  
  NUMBER_11(11l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_5(5l),
  
  NUMBER_6(6l),
  
  NUMBER_7(7l),
  
  NUMBER_8(8l),
  
  NUMBER_9(9l);

  private Long value;

  BrandCampaignGetV30CampaignStatus(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandCampaignGetV30CampaignStatus fromValue(Long value) {
    for (BrandCampaignGetV30CampaignStatus b : BrandCampaignGetV30CampaignStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandCampaignGetV30CampaignStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandCampaignGetV30CampaignStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandCampaignGetV30CampaignStatus read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return BrandCampaignGetV30CampaignStatus.fromValue(value);
    }
  }
}

