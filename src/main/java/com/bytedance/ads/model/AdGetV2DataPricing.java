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
@JsonAdapter(AdGetV2DataPricing.Adapter.class)
public enum AdGetV2DataPricing {
  
  OCPM("PRICING_OCPM"),
  
  CPV("PRICING_CPV"),
  
  CPM("PRICING_CPM"),
  
  OCPC("PRICING_OCPC"),
  
  CPA("PRICING_CPA"),
  
  CPC_OCPM("PRICING_CPC_OCPM"),
  
  CPC("PRICING_CPC");

  private String value;

  AdGetV2DataPricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataPricing fromValue(String value) {
    for (AdGetV2DataPricing b : AdGetV2DataPricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataPricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataPricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataPricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataPricing.fromValue(value);
    }
  }
}

