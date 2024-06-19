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
@JsonAdapter(DpaClueProductListV2DataProductsStatus.Adapter.class)
public enum DpaClueProductListV2DataProductsStatus {
  
  OFFLINE("STATUS_OFFLINE"),
  
  ONLINE("STATUS_ONLINE");

  private String value;

  DpaClueProductListV2DataProductsStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaClueProductListV2DataProductsStatus fromValue(String value) {
    for (DpaClueProductListV2DataProductsStatus b : DpaClueProductListV2DataProductsStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DpaClueProductListV2DataProductsStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaClueProductListV2DataProductsStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaClueProductListV2DataProductsStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaClueProductListV2DataProductsStatus.fromValue(value);
    }
  }
}

