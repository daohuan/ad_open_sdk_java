/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
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
@JsonAdapter(ToolsEstimateAudienceV2DpaLocalAudience.Adapter.class)
public enum ToolsEstimateAudienceV2DpaLocalAudience {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  ToolsEstimateAudienceV2DpaLocalAudience(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2DpaLocalAudience fromValue(Long value) {
    for (ToolsEstimateAudienceV2DpaLocalAudience b : ToolsEstimateAudienceV2DpaLocalAudience.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2DpaLocalAudience> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2DpaLocalAudience enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2DpaLocalAudience read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsEstimateAudienceV2DpaLocalAudience.fromValue(value);
    }
  }
}

