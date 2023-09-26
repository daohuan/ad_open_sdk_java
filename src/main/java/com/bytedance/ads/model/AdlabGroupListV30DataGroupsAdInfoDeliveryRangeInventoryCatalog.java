/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
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
@JsonAdapter(AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog.Adapter.class)
public enum AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog {
  
  MANUAL("MANUAL"),
  
  SCENE("SCENE"),
  
  SMART("SMART"),
  
  UNIVERSAL("UNIVERSAL"),
  
  UNIVERSAL_SMART("UNIVERSAL_SMART");

  private String value;

  AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog fromValue(String value) {
    for (AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog b : AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupListV30DataGroupsAdInfoDeliveryRangeInventoryCatalog.fromValue(value);
    }
  }
}

