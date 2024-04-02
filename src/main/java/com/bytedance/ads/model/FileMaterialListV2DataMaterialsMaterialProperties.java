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
@JsonAdapter(FileMaterialListV2DataMaterialsMaterialProperties.Adapter.class)
public enum FileMaterialListV2DataMaterialsMaterialProperties {
  
  AD_HIGH_QUALITY_MATERIAL("AD_HIGH_QUALITY_MATERIAL"),
  
  AD_LOW_QUALITY_MATERIAL("AD_LOW_QUALITY_MATERIAL"),
  
  AIGC("AIGC"),
  
  ECP_HIGH_QUALITY_MATERIAL("ECP_HIGH_QUALITY_MATERIAL"),
  
  ECP_LOW_QUALITY_MATERIAL("ECP_LOW_QUALITY_MATERIAL"),
  
  FIRST_PUBLISH_MATERIAL("FIRST_PUBLISH_MATERIAL"),
  
  INEFFICIENT_MATERIAL("INEFFICIENT_MATERIAL"),
  
  SIMILAR_MATERIAL("SIMILAR_MATERIAL"),
  
  SIMILAR_QUEUE_MATERIAL("SIMILAR_QUEUE_MATERIAL");

  private String value;

  FileMaterialListV2DataMaterialsMaterialProperties(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileMaterialListV2DataMaterialsMaterialProperties fromValue(String value) {
    for (FileMaterialListV2DataMaterialsMaterialProperties b : FileMaterialListV2DataMaterialsMaterialProperties.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FileMaterialListV2DataMaterialsMaterialProperties> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileMaterialListV2DataMaterialsMaterialProperties enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileMaterialListV2DataMaterialsMaterialProperties read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileMaterialListV2DataMaterialsMaterialProperties.fromValue(value);
    }
  }
}

