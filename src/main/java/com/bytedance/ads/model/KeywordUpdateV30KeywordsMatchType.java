/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
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
@JsonAdapter(KeywordUpdateV30KeywordsMatchType.Adapter.class)
public enum KeywordUpdateV30KeywordsMatchType {
  
  EXTENSIVE("EXTENSIVE"),
  
  PHRASE("PHRASE"),
  
  PRECISION("PRECISION");

  private String value;

  KeywordUpdateV30KeywordsMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordUpdateV30KeywordsMatchType fromValue(String value) {
    for (KeywordUpdateV30KeywordsMatchType b : KeywordUpdateV30KeywordsMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeywordUpdateV30KeywordsMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordUpdateV30KeywordsMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordUpdateV30KeywordsMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordUpdateV30KeywordsMatchType.fromValue(value);
    }
  }
}

