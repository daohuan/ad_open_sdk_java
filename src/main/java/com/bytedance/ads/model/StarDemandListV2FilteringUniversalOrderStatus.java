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
@JsonAdapter(StarDemandListV2FilteringUniversalOrderStatus.Adapter.class)
public enum StarDemandListV2FilteringUniversalOrderStatus {
  
  ONGOING("ONGOING"),
  
  WAIT_PAYMENT("WAIT_PAYMENT"),
  
  CANCELED("CANCELED"),
  
  ALL("ALL"),
  
  FINISHED("FINISHED"),
  
  RECEIVEING("RECEIVEING"),
  
  WAIT_EVALUATE("WAIT_EVALUATE");

  private String value;

  StarDemandListV2FilteringUniversalOrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandListV2FilteringUniversalOrderStatus fromValue(String value) {
    for (StarDemandListV2FilteringUniversalOrderStatus b : StarDemandListV2FilteringUniversalOrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandListV2FilteringUniversalOrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandListV2FilteringUniversalOrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandListV2FilteringUniversalOrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandListV2FilteringUniversalOrderStatus.fromValue(value);
    }
  }
}

