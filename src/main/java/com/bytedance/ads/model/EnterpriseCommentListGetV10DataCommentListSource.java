/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@JsonAdapter(EnterpriseCommentListGetV10DataCommentListSource.Adapter.class)
public enum EnterpriseCommentListGetV10DataCommentListSource {
  
  PERFORM("FROM_PERFORM"),
  
  BRAND("FROM_BRAND"),
  
  NATURAL("FROM_NATURAL"),
  
  OTHER("FROM_OTHER"),
  
  DOUPLUS("FROM_DOUPLUS");

  private String value;

  EnterpriseCommentListGetV10DataCommentListSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseCommentListGetV10DataCommentListSource fromValue(String value) {
    for (EnterpriseCommentListGetV10DataCommentListSource b : EnterpriseCommentListGetV10DataCommentListSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseCommentListGetV10DataCommentListSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseCommentListGetV10DataCommentListSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseCommentListGetV10DataCommentListSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseCommentListGetV10DataCommentListSource.fromValue(value);
    }
  }
}

