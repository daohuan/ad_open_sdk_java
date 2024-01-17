/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(BudgetGroupListV30FilteringDeliveryType.Adapter.class)
public enum BudgetGroupListV30FilteringDeliveryType {
  
  MANUAL("MANUAL"),
  
  PROCEDURAL("PROCEDURAL");

  private String value;

  BudgetGroupListV30FilteringDeliveryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BudgetGroupListV30FilteringDeliveryType fromValue(String value) {
    for (BudgetGroupListV30FilteringDeliveryType b : BudgetGroupListV30FilteringDeliveryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BudgetGroupListV30FilteringDeliveryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BudgetGroupListV30FilteringDeliveryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BudgetGroupListV30FilteringDeliveryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BudgetGroupListV30FilteringDeliveryType.fromValue(value);
    }
  }
}
