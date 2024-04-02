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
@JsonAdapter(ProjectListV30DataListAudienceAwemeFanTimeScope.Adapter.class)
public enum ProjectListV30DataListAudienceAwemeFanTimeScope {
  
  FIFTEEN_DAYS("FIFTEEN_DAYS"),
  
  SIXTY_DAYS("SIXTY_DAYS"),
  
  THIRTY_DAYS("THIRTY_DAYS");

  private String value;

  ProjectListV30DataListAudienceAwemeFanTimeScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListAudienceAwemeFanTimeScope fromValue(String value) {
    for (ProjectListV30DataListAudienceAwemeFanTimeScope b : ProjectListV30DataListAudienceAwemeFanTimeScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListAudienceAwemeFanTimeScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListAudienceAwemeFanTimeScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListAudienceAwemeFanTimeScope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListAudienceAwemeFanTimeScope.fromValue(value);
    }
  }
}

