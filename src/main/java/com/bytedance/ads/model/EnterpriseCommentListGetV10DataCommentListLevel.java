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
@JsonAdapter(EnterpriseCommentListGetV10DataCommentListLevel.Adapter.class)
public enum EnterpriseCommentListGetV10DataCommentListLevel {
  
  ONE("LEVEL_ONE"),
  
  TWO("LEVEL_TWO"),
  
  ALL("LEVEL_ALL");

  private String value;

  EnterpriseCommentListGetV10DataCommentListLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseCommentListGetV10DataCommentListLevel fromValue(String value) {
    for (EnterpriseCommentListGetV10DataCommentListLevel b : EnterpriseCommentListGetV10DataCommentListLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseCommentListGetV10DataCommentListLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseCommentListGetV10DataCommentListLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseCommentListGetV10DataCommentListLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseCommentListGetV10DataCommentListLevel.fromValue(value);
    }
  }
}

