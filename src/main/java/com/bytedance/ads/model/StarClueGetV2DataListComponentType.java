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
@JsonAdapter(StarClueGetV2DataListComponentType.Adapter.class)
public enum StarClueGetV2DataListComponentType {
  
  ANCHOR_MICRO_APP_POI("ANCHOR_MICRO_APP_POI"),
  
  ANCHOR_E_GAME("ANCHOR_E_GAME"),
  
  ANCHOR_MOVIE("ANCHOR_MOVIE"),
  
  CART("CART"),
  
  ENTERPRISE_COUPON("ENTERPRISE_COUPON"),
  
  VARIETY_ANCHOR("VARIETY_ANCHOR"),
  
  BRAND_ANCHOR("BRAND_ANCHOR"),
  
  ENTERPRISE_MICRO_APP("ENTERPRISE_MICRO_APP"),
  
  ENTERPRISE_ORDER_SERVICE("ENTERPRISE_ORDER_SERVICE"),
  
  ANCHOR_XIGUA("ANCHOR_XIGUA"),
  
  ENTERPRISE_SALON("ENTERPRISE_SALON"),
  
  ENTERPRISE_DOWNLOAD("ENTERPRISE_DOWNLOAD"),
  
  ENTERPRISE_NOVEL("ENTERPRISE_NOVEL"),
  
  ENTERPRISE_WEDDING_PHOTO("ENTERPRISE_WEDDING_PHOTO"),
  
  ANCHOR_ESTATE_SERVICE("ANCHOR_ESTATE_SERVICE"),
  
  ANCHOR_TELECOM("ANCHOR_TELECOM"),
  
  ANCHOR_INSURANCE("ANCHOR_INSURANCE"),
  
  ANCHOR_TOURISM("ANCHOR_TOURISM"),
  
  ANCHOR_EDUCATION("ANCHOR_EDUCATION"),
  
  ANCHOR_DOWNLOAD("ANCHOR_DOWNLOAD"),
  
  POI("POI"),
  
  ANCHOR_ECOM("ANCHOR_ECOM"),
  
  ANCHOR_CAR("ANCHOR_CAR"),
  
  ENTERPRISE_DOWNLOAD_APP("ENTERPRISE_DOWNLOAD_APP"),
  
  GAME_ANCHOR("GAME_ANCHOR"),
  
  LINK("LINK"),
  
  LIVE_ORDER_COMPONENT("LIVE_ORDER_COMPONENT"),
  
  ANCHOR_HOME("ANCHOR_HOME"),
  
  ENTERPRISE_CAR("ENTERPRISE_CAR"),
  
  ENTERPRISE_ECOM("ENTERPRISE_ECOM"),
  
  MICROAPP_ANCHOR("MICROAPP_ANCHOR"),
  
  ANCHOR_INVESTMENT("ANCHOR_INVESTMENT"),
  
  ALL("ALL");

  private String value;

  StarClueGetV2DataListComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarClueGetV2DataListComponentType fromValue(String value) {
    for (StarClueGetV2DataListComponentType b : StarClueGetV2DataListComponentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarClueGetV2DataListComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarClueGetV2DataListComponentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarClueGetV2DataListComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarClueGetV2DataListComponentType.fromValue(value);
    }
  }
}

