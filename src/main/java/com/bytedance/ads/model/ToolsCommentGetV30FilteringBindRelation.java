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
@JsonAdapter(ToolsCommentGetV30FilteringBindRelation.Adapter.class)
public enum ToolsCommentGetV30FilteringBindRelation {
  
  ALL("ALL"),
  
  BIND_AWEME("BIND_AWEME"),
  
  VIRTUAL_AWEME("VIRTUAL_AWEME");

  private String value;

  ToolsCommentGetV30FilteringBindRelation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCommentGetV30FilteringBindRelation fromValue(String value) {
    for (ToolsCommentGetV30FilteringBindRelation b : ToolsCommentGetV30FilteringBindRelation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsCommentGetV30FilteringBindRelation> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCommentGetV30FilteringBindRelation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCommentGetV30FilteringBindRelation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCommentGetV30FilteringBindRelation.fromValue(value);
    }
  }
}

