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
@JsonAdapter(ClueCouponDetailV2DataFormElementsElementType.Adapter.class)
public enum ClueCouponDetailV2DataFormElementsElementType {
  
  EMAIL("EMAIL"),
  
  CALCULATOR("CALCULATOR"),
  
  TELEPHONE("TELEPHONE"),
  
  TEXTAREA("TEXTAREA"),
  
  CHECKBOX("CHECKBOX"),
  
  NUMBER("NUMBER"),
  
  RADIO("RADIO"),
  
  NAME("NAME"),
  
  DATE("DATE"),
  
  CITY("CITY"),
  
  SELECT("SELECT"),
  
  SEX("SEX"),
  
  TEXT("TEXT");

  private String value;

  ClueCouponDetailV2DataFormElementsElementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponDetailV2DataFormElementsElementType fromValue(String value) {
    for (ClueCouponDetailV2DataFormElementsElementType b : ClueCouponDetailV2DataFormElementsElementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponDetailV2DataFormElementsElementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponDetailV2DataFormElementsElementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponDetailV2DataFormElementsElementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponDetailV2DataFormElementsElementType.fromValue(value);
    }
  }
}

