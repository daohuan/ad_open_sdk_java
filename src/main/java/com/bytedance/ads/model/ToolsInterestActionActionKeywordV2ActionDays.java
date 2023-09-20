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
@JsonAdapter(ToolsInterestActionActionKeywordV2ActionDays.Adapter.class)
public enum ToolsInterestActionActionKeywordV2ActionDays {
  
  NUMBER_15(15l),
  
  NUMBER_180(180l),
  
  NUMBER_30(30l),
  
  NUMBER_365(365l),
  
  NUMBER_60(60l),
  
  NUMBER_7(7l),
  
  NUMBER_90(90l);

  private Long value;

  ToolsInterestActionActionKeywordV2ActionDays(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsInterestActionActionKeywordV2ActionDays fromValue(Long value) {
    for (ToolsInterestActionActionKeywordV2ActionDays b : ToolsInterestActionActionKeywordV2ActionDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsInterestActionActionKeywordV2ActionDays> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsInterestActionActionKeywordV2ActionDays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsInterestActionActionKeywordV2ActionDays read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsInterestActionActionKeywordV2ActionDays.fromValue(value);
    }
  }
}

