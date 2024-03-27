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
@JsonAdapter(CreativeProceduralCreativeUpdateV2AdDataAnchorType.Adapter.class)
public enum CreativeProceduralCreativeUpdateV2AdDataAnchorType {
  
  APP_INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  APP_SHOP("APP_SHOP"),
  
  ONLINE_SUBSCRIBE("ONLINE_SUBSCRIBE"),
  
  SHOPPING_CART("SHOPPING_CART"),
  
  APP_GAME("APP_GAME"),
  
  PRIVATE_CHAT("PRIVATE_CHAT"),
  
  INSURANCE("INSURANCE");

  private String value;

  CreativeProceduralCreativeUpdateV2AdDataAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeUpdateV2AdDataAnchorType fromValue(String value) {
    for (CreativeProceduralCreativeUpdateV2AdDataAnchorType b : CreativeProceduralCreativeUpdateV2AdDataAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeUpdateV2AdDataAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeUpdateV2AdDataAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeUpdateV2AdDataAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeProceduralCreativeUpdateV2AdDataAnchorType.fromValue(value);
    }
  }
}

