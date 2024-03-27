/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
@JsonAdapter(StarReportDataTopicConfigV2DataStatDataTopic.Adapter.class)
public enum StarReportDataTopicConfigV2DataStatDataTopic {
  
  BASIC_DATA("BASIC_DATA"),
  
  COMMENT_DATA("COMMENT_DATA"),
  
  CONVERT_DATA("CONVERT_DATA"),
  
  DY_SHOP_DATA("DY_SHOP_DATA"),
  
  FLOW_DATA("FLOW_DATA"),
  
  INDEX_SCORE_DATA("INDEX_SCORE_DATA"),
  
  RECOMMEND_DATA("RECOMMEND_DATA"),
  
  SEARCH_DATA("SEARCH_DATA"),
  
  USER_DISTRIBUTION_DATA("USER_DISTRIBUTION_DATA");

  private String value;

  StarReportDataTopicConfigV2DataStatDataTopic(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarReportDataTopicConfigV2DataStatDataTopic fromValue(String value) {
    for (StarReportDataTopicConfigV2DataStatDataTopic b : StarReportDataTopicConfigV2DataStatDataTopic.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarReportDataTopicConfigV2DataStatDataTopic> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarReportDataTopicConfigV2DataStatDataTopic enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarReportDataTopicConfigV2DataStatDataTopic read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarReportDataTopicConfigV2DataStatDataTopic.fromValue(value);
    }
  }
}

