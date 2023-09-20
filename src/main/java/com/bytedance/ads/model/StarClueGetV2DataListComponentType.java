/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
  
  LINK("LINK"),
  
  ENTERPRISE_DOWNLOAD("ENTERPRISE_DOWNLOAD"),
  
  MICROAPP_ANCHOR("MICROAPP_ANCHOR"),
  
  ENTERPRISE_CAR("ENTERPRISE_CAR"),
  
  ANCHOR_HOME("ANCHOR_HOME"),
  
  POI("POI"),
  
  ENTERPRISE_WEDDING_PHOTO("ENTERPRISE_WEDDING_PHOTO"),
  
  ENTERPRISE_DOWNLOAD_APP("ENTERPRISE_DOWNLOAD_APP"),
  
  VARIETY_ANCHOR("VARIETY_ANCHOR"),
  
  ANCHOR_MOVIE("ANCHOR_MOVIE"),
  
  ENTERPRISE_ORDER_SERVICE("ENTERPRISE_ORDER_SERVICE"),
  
  ENTERPRISE_SALON("ENTERPRISE_SALON"),
  
  ANCHOR_ESTATE_SERVICE("ANCHOR_ESTATE_SERVICE"),
  
  BRAND_ANCHOR("BRAND_ANCHOR"),
  
  ANCHOR_MICRO_APP_POI("ANCHOR_MICRO_APP_POI"),
  
  ALL("ALL"),
  
  ANCHOR_E_GAME("ANCHOR_E_GAME"),
  
  ANCHOR_XIGUA("ANCHOR_XIGUA"),
  
  ENTERPRISE_MICRO_APP("ENTERPRISE_MICRO_APP"),
  
  CART("CART"),
  
  LIVE_ORDER_COMPONENT("LIVE_ORDER_COMPONENT"),
  
  ANCHOR_TELECOM("ANCHOR_TELECOM"),
  
  ENTERPRISE_NOVEL("ENTERPRISE_NOVEL"),
  
  ANCHOR_CAR("ANCHOR_CAR"),
  
  ANCHOR_INSURANCE("ANCHOR_INSURANCE"),
  
  ENTERPRISE_COUPON("ENTERPRISE_COUPON"),
  
  GAME_ANCHOR("GAME_ANCHOR"),
  
  ANCHOR_INVESTMENT("ANCHOR_INVESTMENT"),
  
  ANCHOR_TOURISM("ANCHOR_TOURISM"),
  
  ENTERPRISE_ECOM("ENTERPRISE_ECOM"),
  
  ANCHOR_DOWNLOAD("ANCHOR_DOWNLOAD"),
  
  ANCHOR_ECOM("ANCHOR_ECOM"),
  
  ANCHOR_EDUCATION("ANCHOR_EDUCATION");

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
