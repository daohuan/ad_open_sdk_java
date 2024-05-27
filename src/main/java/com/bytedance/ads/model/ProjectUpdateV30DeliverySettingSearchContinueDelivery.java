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
@JsonAdapter(ProjectUpdateV30DeliverySettingSearchContinueDelivery.Adapter.class)
public enum ProjectUpdateV30DeliverySettingSearchContinueDelivery {
  
  OFF("OFF"),
  
  ON("ON");

  private String value;

  ProjectUpdateV30DeliverySettingSearchContinueDelivery(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30DeliverySettingSearchContinueDelivery fromValue(String value) {
    for (ProjectUpdateV30DeliverySettingSearchContinueDelivery b : ProjectUpdateV30DeliverySettingSearchContinueDelivery.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30DeliverySettingSearchContinueDelivery> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30DeliverySettingSearchContinueDelivery enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30DeliverySettingSearchContinueDelivery read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectUpdateV30DeliverySettingSearchContinueDelivery.fromValue(value);
    }
  }
}
