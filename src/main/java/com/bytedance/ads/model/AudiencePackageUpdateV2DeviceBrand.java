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
@JsonAdapter(AudiencePackageUpdateV2DeviceBrand.Adapter.class)
public enum AudiencePackageUpdateV2DeviceBrand {
  
  QIKU("QIKU"),
  
  OPPO("OPPO"),
  
  MOTO("MOTO"),
  
  SAMSUNG("SAMSUNG"),
  
  HTC("HTC"),
  
  CHINAMOBILE("CHINAMOBILE"),
  
  XIAOMI("XIAOMI"),
  
  ONEPLUS("ONEPLUS"),
  
  HUAWEI("HUAWEI"),
  
  COOLPAD("COOLPAD"),
  
  HONOR("HONOR"),
  
  ZTE("ZTE"),
  
  TCL("TCL"),
  
  NOKIA("NOKIA"),
  
  APPLE("APPLE"),
  
  MEIZU("MEIZU"),
  
  LENOVO("LENOVO"),
  
  LG("LG"),
  
  VIVO("VIVO"),
  
  PEPPER("PEPPER"),
  
  Enum_360("360"),
  
  GOOGLE("GOOGLE"),
  
  SONY("SONY"),
  
  HISENSE("HISENSE"),
  
  SMARTISAN("SMARTISAN"),
  
  LETV("LETV"),
  
  GIONEE("GIONEE"),
  
  NUBIA("NUBIA");

  private String value;

  AudiencePackageUpdateV2DeviceBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageUpdateV2DeviceBrand fromValue(String value) {
    for (AudiencePackageUpdateV2DeviceBrand b : AudiencePackageUpdateV2DeviceBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageUpdateV2DeviceBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageUpdateV2DeviceBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageUpdateV2DeviceBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageUpdateV2DeviceBrand.fromValue(value);
    }
  }
}

