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
@JsonAdapter(BrandQueryStockV30ScheduleInfoStockIncreasePackageType.Adapter.class)
public enum BrandQueryStockV30ScheduleInfoStockIncreasePackageType {
  
  NONE("NONE"),
  
  PLUS("PLUS"),
  
  PRO("PRO");

  private String value;

  BrandQueryStockV30ScheduleInfoStockIncreasePackageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandQueryStockV30ScheduleInfoStockIncreasePackageType fromValue(String value) {
    for (BrandQueryStockV30ScheduleInfoStockIncreasePackageType b : BrandQueryStockV30ScheduleInfoStockIncreasePackageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandQueryStockV30ScheduleInfoStockIncreasePackageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandQueryStockV30ScheduleInfoStockIncreasePackageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandQueryStockV30ScheduleInfoStockIncreasePackageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandQueryStockV30ScheduleInfoStockIncreasePackageType.fromValue(value);
    }
  }
}

