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
@JsonAdapter(ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus.Adapter.class)
public enum ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus {
  
  DISABLE_RAISE("DISABLE_RAISE"),
  
  ENABLE_PRERAISE("ENABLE_PRERAISE"),
  
  ENABLE_RAISE("ENABLE_RAISE"),
  
  FINISH_RAISE("FINISH_RAISE"),
  
  HAS_PRERAISE("HAS_PRERAISE"),
  
  RAISING("RAISING");

  private String value;

  ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus fromValue(String value) {
    for (ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus b : ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus.fromValue(value);
    }
  }
}

