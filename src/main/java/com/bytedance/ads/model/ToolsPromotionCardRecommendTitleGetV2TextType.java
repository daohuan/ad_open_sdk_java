/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@JsonAdapter(ToolsPromotionCardRecommendTitleGetV2TextType.Adapter.class)
public enum ToolsPromotionCardRecommendTitleGetV2TextType {
  
  PROMOTION("PROMOTION"),
  
  CALL_TO_ACTION("CALL_TO_ACTION"),
  
  CARD_TITLE("CARD_TITLE");

  private String value;

  ToolsPromotionCardRecommendTitleGetV2TextType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPromotionCardRecommendTitleGetV2TextType fromValue(String value) {
    for (ToolsPromotionCardRecommendTitleGetV2TextType b : ToolsPromotionCardRecommendTitleGetV2TextType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPromotionCardRecommendTitleGetV2TextType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPromotionCardRecommendTitleGetV2TextType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPromotionCardRecommendTitleGetV2TextType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPromotionCardRecommendTitleGetV2TextType.fromValue(value);
    }
  }
}

