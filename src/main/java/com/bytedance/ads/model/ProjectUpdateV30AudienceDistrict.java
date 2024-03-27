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
@JsonAdapter(ProjectUpdateV30AudienceDistrict.Adapter.class)
public enum ProjectUpdateV30AudienceDistrict {
  
  BUSINESS_DISTRICT("BUSINESS_DISTRICT"),
  
  NONE("NONE"),
  
  OVERSEA("OVERSEA"),
  
  REGION("REGION");

  private String value;

  ProjectUpdateV30AudienceDistrict(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30AudienceDistrict fromValue(String value) {
    for (ProjectUpdateV30AudienceDistrict b : ProjectUpdateV30AudienceDistrict.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30AudienceDistrict> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30AudienceDistrict enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30AudienceDistrict read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectUpdateV30AudienceDistrict.fromValue(value);
    }
  }
}

