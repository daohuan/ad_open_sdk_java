/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
@JsonAdapter(AdGetV2DataDeliveryPhase.Adapter.class)
public enum AdGetV2DataDeliveryPhase {
  
  FIRST_PHASE("FIRST_PHASE"),
  
  SECOND_PHASE("SECOND_PHASE");

  private String value;

  AdGetV2DataDeliveryPhase(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataDeliveryPhase fromValue(String value) {
    for (AdGetV2DataDeliveryPhase b : AdGetV2DataDeliveryPhase.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataDeliveryPhase> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataDeliveryPhase enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataDeliveryPhase read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataDeliveryPhase.fromValue(value);
    }
  }
}

