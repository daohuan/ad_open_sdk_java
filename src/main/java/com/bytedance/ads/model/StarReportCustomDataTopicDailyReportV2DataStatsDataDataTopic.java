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
@JsonAdapter(StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic.Adapter.class)
public enum StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic {
  
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

  StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic fromValue(String value) {
    for (StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic b : StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic.fromValue(value);
    }
  }
}

