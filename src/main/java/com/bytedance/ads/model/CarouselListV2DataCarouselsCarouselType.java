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
@JsonAdapter(CarouselListV2DataCarouselsCarouselType.Adapter.class)
public enum CarouselListV2DataCarouselsCarouselType {
  
  INFORMATION_FLOW_IMAGE("INFORMATION_FLOW_IMAGE"),
  
  SEARCH_DISPLAY_WINDOW_IMAGE("SEARCH_DISPLAY_WINDOW_IMAGE"),
  
  TOUTIAO_SEARCH_AD_IMAGE("TOUTIAO_SEARCH_AD_IMAGE");

  private String value;

  CarouselListV2DataCarouselsCarouselType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CarouselListV2DataCarouselsCarouselType fromValue(String value) {
    for (CarouselListV2DataCarouselsCarouselType b : CarouselListV2DataCarouselsCarouselType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CarouselListV2DataCarouselsCarouselType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CarouselListV2DataCarouselsCarouselType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CarouselListV2DataCarouselsCarouselType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CarouselListV2DataCarouselsCarouselType.fromValue(value);
    }
  }
}

