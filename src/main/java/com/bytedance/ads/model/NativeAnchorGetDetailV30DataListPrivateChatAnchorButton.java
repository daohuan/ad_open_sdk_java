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
@JsonAdapter(NativeAnchorGetDetailV30DataListPrivateChatAnchorButton.Adapter.class)
public enum NativeAnchorGetDetailV30DataListPrivateChatAnchorButton {
  
  PRIVATE_MESSAGE("PRIVATE_MESSAGE"),
  
  CONSULT_NOW("CONSULT_NOW"),
  
  CONSULT_ADVISOR("CONSULT_ADVISOR"),
  
  CONSULT_DESIGNER("CONSULT_DESIGNER"),
  
  ASK_TEACHER("ASK_TEACHER");

  private String value;

  NativeAnchorGetDetailV30DataListPrivateChatAnchorButton(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorGetDetailV30DataListPrivateChatAnchorButton fromValue(String value) {
    for (NativeAnchorGetDetailV30DataListPrivateChatAnchorButton b : NativeAnchorGetDetailV30DataListPrivateChatAnchorButton.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NativeAnchorGetDetailV30DataListPrivateChatAnchorButton> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorGetDetailV30DataListPrivateChatAnchorButton enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorGetDetailV30DataListPrivateChatAnchorButton read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorGetDetailV30DataListPrivateChatAnchorButton.fromValue(value);
    }
  }
}

