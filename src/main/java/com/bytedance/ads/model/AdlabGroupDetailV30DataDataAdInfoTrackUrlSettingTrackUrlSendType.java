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
@JsonAdapter(AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType.Adapter.class)
public enum AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType {
  
  CLIENT_SEND("CLIENT_SEND"),
  
  SERVER_SEND("SERVER_SEND");

  private String value;

  AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType fromValue(String value) {
    for (AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType b : AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType.fromValue(value);
    }
  }
}

