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
@JsonAdapter(ToolsPreAuditSendV2DataListType.Adapter.class)
public enum ToolsPreAuditSendV2DataListType {
  
  IMG("IMG"),
  
  SITE("SITE"),
  
  TITLE("TITLE"),
  
  VIDEO("VIDEO");

  private String value;

  ToolsPreAuditSendV2DataListType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPreAuditSendV2DataListType fromValue(String value) {
    for (ToolsPreAuditSendV2DataListType b : ToolsPreAuditSendV2DataListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPreAuditSendV2DataListType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPreAuditSendV2DataListType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPreAuditSendV2DataListType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPreAuditSendV2DataListType.fromValue(value);
    }
  }
}

