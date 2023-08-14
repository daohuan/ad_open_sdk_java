/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.10
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
@JsonAdapter(ProjectCreateV30DeliveryRangeUnionVideoType.Adapter.class)
public enum ProjectCreateV30DeliveryRangeUnionVideoType {
  
  ORIGINAL_VIDEO("ORIGINAL_VIDEO"),
  
  REWARDED_VIDEO("REWARDED_VIDEO"),
  
  SPLASH_VIDEO("SPLASH_VIDEO");

  private String value;

  ProjectCreateV30DeliveryRangeUnionVideoType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30DeliveryRangeUnionVideoType fromValue(String value) {
    for (ProjectCreateV30DeliveryRangeUnionVideoType b : ProjectCreateV30DeliveryRangeUnionVideoType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30DeliveryRangeUnionVideoType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30DeliveryRangeUnionVideoType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30DeliveryRangeUnionVideoType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCreateV30DeliveryRangeUnionVideoType.fromValue(value);
    }
  }
}

