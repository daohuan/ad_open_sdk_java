/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
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
@JsonAdapter(ToolsBidSuggestV2DeviceBrand.Adapter.class)
public enum ToolsBidSuggestV2DeviceBrand {
  
  SAMSUNG("SAMSUNG"),
  
  SONY("SONY"),
  
  NOKIA("NOKIA"),
  
  CHINAMOBILE("CHINAMOBILE"),
  
  LETV("LETV"),
  
  Enum_360("360"),
  
  MOTO("MOTO"),
  
  LG("LG"),
  
  ZTE("ZTE"),
  
  APPLE("APPLE"),
  
  XIAOMI("XIAOMI"),
  
  COOLPAD("COOLPAD"),
  
  MEIZU("MEIZU"),
  
  LENOVO("LENOVO"),
  
  GOOGLE("GOOGLE"),
  
  HTC("HTC"),
  
  SMARTISAN("SMARTISAN"),
  
  QIKU("QIKU"),
  
  NUBIA("NUBIA"),
  
  OPPO("OPPO"),
  
  HONOR("HONOR"),
  
  PEPPER("PEPPER"),
  
  ONEPLUS("ONEPLUS"),
  
  TCL("TCL"),
  
  VIVO("VIVO"),
  
  HUAWEI("HUAWEI"),
  
  HISENSE("HISENSE"),
  
  GIONEE("GIONEE");

  private String value;

  ToolsBidSuggestV2DeviceBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2DeviceBrand fromValue(String value) {
    for (ToolsBidSuggestV2DeviceBrand b : ToolsBidSuggestV2DeviceBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2DeviceBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2DeviceBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2DeviceBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2DeviceBrand.fromValue(value);
    }
  }
}

