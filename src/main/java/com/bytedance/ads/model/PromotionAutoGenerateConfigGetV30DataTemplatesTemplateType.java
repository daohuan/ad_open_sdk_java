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
@JsonAdapter(PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType.Adapter.class)
public enum PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType {
  
  HORIZONTAL_TO_VERTICAL_DYNAMIC_BACK_VIDEO("HORIZONTAL_TO_VERTICAL_DYNAMIC_BACK_VIDEO"),
  
  VERTICAL_TO_HORIZONTAL_DYNAMIC_BACK_VIDEO("VERTICAL_TO_HORIZONTAL_DYNAMIC_BACK_VIDEO"),
  
  VERTICAL_TO_HORIZONTAL_STATIC_BACK_VIDEO("VERTICAL_TO_HORIZONTAL_STATIC_BACK_VIDEO");

  private String value;

  PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType fromValue(String value) {
    for (PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType b : PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionAutoGenerateConfigGetV30DataTemplatesTemplateType.fromValue(value);
    }
  }
}

