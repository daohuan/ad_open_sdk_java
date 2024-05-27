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
@JsonAdapter(ReportAdGetV2DataListPricingCategory.Adapter.class)
public enum ReportAdGetV2DataListPricingCategory {
  
  FREE("PRICING_CATEGORY_FREE"),
  
  NOC("PRICING_CATEGORY_NOC"),
  
  BRAND_AND_PRICING("PRICING_CATEGORY_BRAND_AND_PRICING"),
  
  BRAND("PRICING_CATEGORY_BRAND"),
  
  BID("PRICING_CATEGORY_BID");

  private String value;

  ReportAdGetV2DataListPricingCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2DataListPricingCategory fromValue(String value) {
    for (ReportAdGetV2DataListPricingCategory b : ReportAdGetV2DataListPricingCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2DataListPricingCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2DataListPricingCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2DataListPricingCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2DataListPricingCategory.fromValue(value);
    }
  }
}

