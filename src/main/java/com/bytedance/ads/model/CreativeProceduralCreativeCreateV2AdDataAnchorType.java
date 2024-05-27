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
@JsonAdapter(CreativeProceduralCreativeCreateV2AdDataAnchorType.Adapter.class)
public enum CreativeProceduralCreativeCreateV2AdDataAnchorType {
  
  INSURANCE("INSURANCE"),
  
  APP_INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  ONLINE_SUBSCRIBE("ONLINE_SUBSCRIBE"),
  
  SHOPPING_CART("SHOPPING_CART"),
  
  APP_SHOP("APP_SHOP"),
  
  PRIVATE_CHAT("PRIVATE_CHAT"),
  
  APP_GAME("APP_GAME");

  private String value;

  CreativeProceduralCreativeCreateV2AdDataAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeCreateV2AdDataAnchorType fromValue(String value) {
    for (CreativeProceduralCreativeCreateV2AdDataAnchorType b : CreativeProceduralCreativeCreateV2AdDataAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeCreateV2AdDataAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeCreateV2AdDataAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeCreateV2AdDataAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeProceduralCreativeCreateV2AdDataAnchorType.fromValue(value);
    }
  }
}

