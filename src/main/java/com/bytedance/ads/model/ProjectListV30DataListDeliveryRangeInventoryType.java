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
@JsonAdapter(ProjectListV30DataListDeliveryRangeInventoryType.Adapter.class)
public enum ProjectListV30DataListDeliveryRangeInventoryType {
  
  INVENTORY_AUTOMOBILE("INVENTORY_AUTOMOBILE"),
  
  INVENTORY_AWEME_FEED("INVENTORY_AWEME_FEED"),
  
  INVENTORY_BEAUTY("INVENTORY_BEAUTY"),
  
  INVENTORY_FACE_U("INVENTORY_FACE_U"),
  
  INVENTORY_FEED("INVENTORY_FEED"),
  
  INVENTORY_HOMED_AGGREGATE("INVENTORY_HOMED_AGGREGATE"),
  
  INVENTORY_HOTSOON_FEED("INVENTORY_HOTSOON_FEED"),
  
  INVENTORY_PIPIXIA("INVENTORY_PIPIXIA"),
  
  INVENTORY_SEARCH("INVENTORY_SEARCH"),
  
  INVENTORY_STUDY("INVENTORY_STUDY"),
  
  INVENTORY_TOMATO_NOVEL("INVENTORY_TOMATO_NOVEL"),
  
  INVENTORY_UNION_SLOT("INVENTORY_UNION_SLOT"),
  
  INVENTORY_UNIVERSAL("INVENTORY_UNIVERSAL"),
  
  INVENTORY_VIDEO_FEED("INVENTORY_VIDEO_FEED"),
  
  UNION_BOUTIQUE_GAME("UNION_BOUTIQUE_GAME");

  private String value;

  ProjectListV30DataListDeliveryRangeInventoryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListDeliveryRangeInventoryType fromValue(String value) {
    for (ProjectListV30DataListDeliveryRangeInventoryType b : ProjectListV30DataListDeliveryRangeInventoryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListDeliveryRangeInventoryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListDeliveryRangeInventoryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListDeliveryRangeInventoryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListDeliveryRangeInventoryType.fromValue(value);
    }
  }
}

