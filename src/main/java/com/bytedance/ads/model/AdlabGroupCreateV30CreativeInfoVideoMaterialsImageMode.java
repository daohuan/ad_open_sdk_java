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
@JsonAdapter(AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode.Adapter.class)
public enum AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode {
  
  VIDEO("CREATIVE_IMAGE_MODE_VIDEO"),
  
  VIDEO_VERTICAL("CREATIVE_IMAGE_MODE_VIDEO_VERTICAL");

  private String value;

  AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode fromValue(String value) {
    for (AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode b : AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupCreateV30CreativeInfoVideoMaterialsImageMode.fromValue(value);
    }
  }
}

