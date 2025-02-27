/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@JsonAdapter(AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum.Adapter.class)
public enum AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum {
  
  DEFAULT_NOT("CAMPAIGN_DPA_DEFAULT_NOT"),
  
  SINGLE_DELIVERY("CAMPAIGN_DPA_SINGLE_DELIVERY");

  private String value;

  AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum fromValue(String value) {
    for (AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum b : AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum.fromValue(value);
    }
  }
}

