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
@JsonAdapter(AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType.Adapter.class)
public enum AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType {
  
  CLIENT_SEND("CLIENT_SEND"),
  
  SERVER_SEND("SERVER_SEND");

  private String value;

  AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType fromValue(String value) {
    for (AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType b : AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupCreateV30AdInfoTrackUrlSettingTrackUrlSendType.fromValue(value);
    }
  }
}

