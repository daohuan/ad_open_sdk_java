/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
@JsonAdapter(ToolsPreAuditGetV2DataListStatus.Adapter.class)
public enum ToolsPreAuditGetV2DataListStatus {
  
  AUDITING("AUDITING"),
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDIT_FAILED("AUDIT_FAILED"),
  
  AUDIT_REJECTED("AUDIT_REJECTED");

  private String value;

  ToolsPreAuditGetV2DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPreAuditGetV2DataListStatus fromValue(String value) {
    for (ToolsPreAuditGetV2DataListStatus b : ToolsPreAuditGetV2DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPreAuditGetV2DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPreAuditGetV2DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPreAuditGetV2DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPreAuditGetV2DataListStatus.fromValue(value);
    }
  }
}

