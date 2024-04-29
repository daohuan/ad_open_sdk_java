/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
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
@JsonAdapter(AdlabGroupDetailV30DataDataAdInfoAdTarget.Adapter.class)
public enum AdlabGroupDetailV30DataDataAdInfoAdTarget {
  
  CONSERVATIVE("SMART_BID_CONSERVATIVE"),
  
  CUSTOM("SMART_BID_CUSTOM");

  private String value;

  AdlabGroupDetailV30DataDataAdInfoAdTarget(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataAdInfoAdTarget fromValue(String value) {
    for (AdlabGroupDetailV30DataDataAdInfoAdTarget b : AdlabGroupDetailV30DataDataAdInfoAdTarget.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataAdInfoAdTarget> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataAdInfoAdTarget enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataAdInfoAdTarget read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataAdInfoAdTarget.fromValue(value);
    }
  }
}

