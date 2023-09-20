/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
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
@JsonAdapter(NativeAnchorGetV30DataListAnchorType.Adapter.class)
public enum NativeAnchorGetV30DataListAnchorType {
  
  APP_GAME("APP_GAME"),
  
  APP_INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  APP_SHOP("APP_SHOP"),
  
  INSURANCE("INSURANCE"),
  
  MICRO_APP("MICRO_APP"),
  
  ONLINE_SUBSCRIBE("ONLINE_SUBSCRIBE"),
  
  PRIVATE_CHAT("PRIVATE_CHAT"),
  
  SHOPPING_CART("SHOPPING_CART");

  private String value;

  NativeAnchorGetV30DataListAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorGetV30DataListAnchorType fromValue(String value) {
    for (NativeAnchorGetV30DataListAnchorType b : NativeAnchorGetV30DataListAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NativeAnchorGetV30DataListAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorGetV30DataListAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorGetV30DataListAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorGetV30DataListAnchorType.fromValue(value);
    }
  }
}

