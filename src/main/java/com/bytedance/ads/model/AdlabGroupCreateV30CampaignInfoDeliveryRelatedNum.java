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
@JsonAdapter(AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum.Adapter.class)
public enum AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum {
  
  DEFAULT_NOT("CAMPAIGN_DPA_DEFAULT_NOT"),
  
  SINGLE_DELIVERY("CAMPAIGN_DPA_SINGLE_DELIVERY");

  private String value;

  AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum fromValue(String value) {
    for (AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum b : AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupCreateV30CampaignInfoDeliveryRelatedNum.fromValue(value);
    }
  }
}

