/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
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
@JsonAdapter(StarDemandOrderListV2DataListUniversalOrderStatus.Adapter.class)
public enum StarDemandOrderListV2DataListUniversalOrderStatus {
  
  ALL("ALL"),
  
  CANCELED("CANCELED"),
  
  FINISHED("FINISHED"),
  
  ONGOING("ONGOING"),
  
  RECEIVEING("RECEIVEING"),
  
  WAIT_EVALUATE("WAIT_EVALUATE"),
  
  WAIT_PAYMENT("WAIT_PAYMENT");

  private String value;

  StarDemandOrderListV2DataListUniversalOrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandOrderListV2DataListUniversalOrderStatus fromValue(String value) {
    for (StarDemandOrderListV2DataListUniversalOrderStatus b : StarDemandOrderListV2DataListUniversalOrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarDemandOrderListV2DataListUniversalOrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandOrderListV2DataListUniversalOrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandOrderListV2DataListUniversalOrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandOrderListV2DataListUniversalOrderStatus.fromValue(value);
    }
  }
}

