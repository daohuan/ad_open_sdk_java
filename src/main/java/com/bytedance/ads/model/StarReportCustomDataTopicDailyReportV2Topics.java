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
@JsonAdapter(StarReportCustomDataTopicDailyReportV2Topics.Adapter.class)
public enum StarReportCustomDataTopicDailyReportV2Topics {
  
  BASIC_DATA("BASIC_DATA"),
  
  CONVERT_DATA("CONVERT_DATA"),
  
  FLOW_DATA("FLOW_DATA"),
  
  RECOMMEND_DATA("RECOMMEND_DATA"),
  
  SEARCH_DATA("SEARCH_DATA");

  private String value;

  StarReportCustomDataTopicDailyReportV2Topics(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarReportCustomDataTopicDailyReportV2Topics fromValue(String value) {
    for (StarReportCustomDataTopicDailyReportV2Topics b : StarReportCustomDataTopicDailyReportV2Topics.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarReportCustomDataTopicDailyReportV2Topics> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarReportCustomDataTopicDailyReportV2Topics enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarReportCustomDataTopicDailyReportV2Topics read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarReportCustomDataTopicDailyReportV2Topics.fromValue(value);
    }
  }
}

