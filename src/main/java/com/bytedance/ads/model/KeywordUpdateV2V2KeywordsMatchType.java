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
@JsonAdapter(KeywordUpdateV2V2KeywordsMatchType.Adapter.class)
public enum KeywordUpdateV2V2KeywordsMatchType {
  
  PRECISION("PRECISION"),
  
  EXTENSIVE("EXTENSIVE"),
  
  PHRASE("PHRASE");

  private String value;

  KeywordUpdateV2V2KeywordsMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordUpdateV2V2KeywordsMatchType fromValue(String value) {
    for (KeywordUpdateV2V2KeywordsMatchType b : KeywordUpdateV2V2KeywordsMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeywordUpdateV2V2KeywordsMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordUpdateV2V2KeywordsMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordUpdateV2V2KeywordsMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordUpdateV2V2KeywordsMatchType.fromValue(value);
    }
  }
}

