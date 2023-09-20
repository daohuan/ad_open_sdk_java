/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(ClueCouponUpdateV2Status.Adapter.class)
public enum ClueCouponUpdateV2Status {
  
  AUDIT_FAIL("AUDIT_FAIL"),
  
  AUDIT_DOING("AUDIT_DOING"),
  
  DELETED("DELETED"),
  
  UNAUDITED("UNAUDITED"),
  
  OFFLINE("OFFLINE"),
  
  NORMAL("NORMAL"),
  
  PAUSE("PAUSE");

  private String value;

  ClueCouponUpdateV2Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponUpdateV2Status fromValue(String value) {
    for (ClueCouponUpdateV2Status b : ClueCouponUpdateV2Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ClueCouponUpdateV2Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponUpdateV2Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponUpdateV2Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponUpdateV2Status.fromValue(value);
    }
  }
}
