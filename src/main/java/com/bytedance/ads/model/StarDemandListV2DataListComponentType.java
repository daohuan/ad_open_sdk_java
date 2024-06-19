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
@JsonAdapter(StarDemandListV2DataListComponentType.Adapter.class)
public enum StarDemandListV2DataListComponentType {
  
  VARIETY_ANCHOR("VARIETY_ANCHOR"),
  
  ANCHOR_EDUCATION("ANCHOR_EDUCATION"),
  
  ENTERPRISE_CAR("ENTERPRISE_CAR"),
  
  BRAND_ANCHOR("BRAND_ANCHOR"),
  
  ANCHOR_ESTATE_SERVICE("ANCHOR_ESTATE_SERVICE"),
  
  ANCHOR_MICRO_APP_POI("ANCHOR_MICRO_APP_POI"),
  
  ENTERPRISE_DOWNLOAD_APP("ENTERPRISE_DOWNLOAD_APP"),
  
  GAME_ANCHOR("GAME_ANCHOR"),
  
  ANCHOR_INSURANCE("ANCHOR_INSURANCE"),
  
  ENTERPRISE_NOVEL("ENTERPRISE_NOVEL"),
  
  ENTERPRISE_WEDDING_PHOTO("ENTERPRISE_WEDDING_PHOTO"),
  
  ENTERPRISE_MICRO_APP("ENTERPRISE_MICRO_APP"),
  
  ANCHOR_E_GAME("ANCHOR_E_GAME"),
  
  ANCHOR_XIGUA("ANCHOR_XIGUA"),
  
  CART("CART"),
  
  ANCHOR_HOME("ANCHOR_HOME"),
  
  ENTERPRISE_DOWNLOAD("ENTERPRISE_DOWNLOAD"),
  
  ANCHOR_MOVIE("ANCHOR_MOVIE"),
  
  ANCHOR_DOWNLOAD("ANCHOR_DOWNLOAD"),
  
  ANCHOR_CAR("ANCHOR_CAR"),
  
  ANCHOR_TOURISM("ANCHOR_TOURISM"),
  
  ENTERPRISE_SALON("ENTERPRISE_SALON"),
  
  ENTERPRISE_ECOM("ENTERPRISE_ECOM"),
  
  ENTERPRISE_COUPON("ENTERPRISE_COUPON"),
  
  ENTERPRISE_ORDER_SERVICE("ENTERPRISE_ORDER_SERVICE"),
  
  LINK("LINK"),
  
  ALL("ALL"),
  
  ANCHOR_ECOM("ANCHOR_ECOM"),
  
  LIVE_ORDER_COMPONENT("LIVE_ORDER_COMPONENT"),
  
  ANCHOR_INVESTMENT("ANCHOR_INVESTMENT"),
  
  POI("POI"),
  
  ANCHOR_TELECOM("ANCHOR_TELECOM"),
  
  MICROAPP_ANCHOR("MICROAPP_ANCHOR");

  private String value;

  StarDemandListV2DataListComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandListV2DataListComponentType fromValue(String value) {
    for (StarDemandListV2DataListComponentType b : StarDemandListV2DataListComponentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandListV2DataListComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandListV2DataListComponentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandListV2DataListComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandListV2DataListComponentType.fromValue(value);
    }
  }
}

