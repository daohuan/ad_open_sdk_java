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
@JsonAdapter(DouplusOrderListV30DataOrderListAdListBidMode.Adapter.class)
public enum DouplusOrderListV30DataOrderListAdListBidMode {
  
  Enum_保播放("保播放"),
  
  Enum_保转化("保转化"),
  
  Enum_自动出价("自动出价");

  private String value;

  DouplusOrderListV30DataOrderListAdListBidMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderListV30DataOrderListAdListBidMode fromValue(String value) {
    for (DouplusOrderListV30DataOrderListAdListBidMode b : DouplusOrderListV30DataOrderListAdListBidMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DouplusOrderListV30DataOrderListAdListBidMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderListV30DataOrderListAdListBidMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderListV30DataOrderListAdListBidMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderListV30DataOrderListAdListBidMode.fromValue(value);
    }
  }
}

