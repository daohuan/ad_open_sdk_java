/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
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
@JsonAdapter(ToolsBidsSuggestV30Pricing.Adapter.class)
public enum ToolsBidsSuggestV30Pricing {
  
  CPC("PRICING_CPC"),
  
  CPM("PRICING_CPM"),
  
  OCPC("PRICING_OCPC"),
  
  OCPM("PRICING_OCPM");

  private String value;

  ToolsBidsSuggestV30Pricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidsSuggestV30Pricing fromValue(String value) {
    for (ToolsBidsSuggestV30Pricing b : ToolsBidsSuggestV30Pricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidsSuggestV30Pricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidsSuggestV30Pricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidsSuggestV30Pricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidsSuggestV30Pricing.fromValue(value);
    }
  }
}

