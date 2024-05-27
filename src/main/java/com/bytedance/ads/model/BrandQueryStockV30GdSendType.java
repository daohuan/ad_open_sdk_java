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
@JsonAdapter(BrandQueryStockV30GdSendType.Adapter.class)
public enum BrandQueryStockV30GdSendType {
  
  CTR("CTR"),
  
  FANS_INCR("FANS_INCR"),
  
  FORM("FORM"),
  
  HOISTING("HOISTING"),
  
  INTERACTIVE("INTERACTIVE"),
  
  PLANT_GRASS("PLANT_GRASS"),
  
  SEQUENCE("SEQUENCE");

  private String value;

  BrandQueryStockV30GdSendType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandQueryStockV30GdSendType fromValue(String value) {
    for (BrandQueryStockV30GdSendType b : BrandQueryStockV30GdSendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandQueryStockV30GdSendType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandQueryStockV30GdSendType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandQueryStockV30GdSendType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandQueryStockV30GdSendType.fromValue(value);
    }
  }
}

