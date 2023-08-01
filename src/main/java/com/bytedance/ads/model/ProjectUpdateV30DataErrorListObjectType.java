/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.1
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
@JsonAdapter(ProjectUpdateV30DataErrorListObjectType.Adapter.class)
public enum ProjectUpdateV30DataErrorListObjectType {
  
  BUDGET("BUDGET"),
  
  PROJECT_SETTING("PROJECT_SETTING"),
  
  PROMOTION_BUDGET("PROMOTION_BUDGET"),
  
  PROMOTION_MATERIAL("PROMOTION_MATERIAL"),
  
  PROMOTION_SETTING("PROMOTION_SETTING");

  private String value;

  ProjectUpdateV30DataErrorListObjectType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30DataErrorListObjectType fromValue(String value) {
    for (ProjectUpdateV30DataErrorListObjectType b : ProjectUpdateV30DataErrorListObjectType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30DataErrorListObjectType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30DataErrorListObjectType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30DataErrorListObjectType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectUpdateV30DataErrorListObjectType.fromValue(value);
    }
  }
}

