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
@JsonAdapter(FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes.Adapter.class)
public enum FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes {
  
  INEFFICIENT_MATERIAL("INEFFICIENT_MATERIAL"),
  
  SIMILAR_MATERIAL("SIMILAR_MATERIAL"),
  
  SIMILAR_QUEUE_MATERIAL("SIMILAR_QUEUE_MATERIAL");

  private String value;

  FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes fromValue(String value) {
    for (FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes b : FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes.fromValue(value);
    }
  }
}

