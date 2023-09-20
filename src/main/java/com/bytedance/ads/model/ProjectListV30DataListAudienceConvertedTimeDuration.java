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
@JsonAdapter(ProjectListV30DataListAudienceConvertedTimeDuration.Adapter.class)
public enum ProjectListV30DataListAudienceConvertedTimeDuration {
  
  NONE("NONE"),
  
  ONE_MONTH("ONE_MONTH"),
  
  SEVEN_DAY("SEVEN_DAY"),
  
  SIX_MONTH("SIX_MONTH"),
  
  THREE_MONTH("THREE_MONTH"),
  
  TODAY("TODAY"),
  
  TWELVE_MONTH("TWELVE_MONTH");

  private String value;

  ProjectListV30DataListAudienceConvertedTimeDuration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListAudienceConvertedTimeDuration fromValue(String value) {
    for (ProjectListV30DataListAudienceConvertedTimeDuration b : ProjectListV30DataListAudienceConvertedTimeDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListAudienceConvertedTimeDuration> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListAudienceConvertedTimeDuration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListAudienceConvertedTimeDuration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListAudienceConvertedTimeDuration.fromValue(value);
    }
  }
}

