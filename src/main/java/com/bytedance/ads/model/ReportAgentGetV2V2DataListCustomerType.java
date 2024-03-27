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
@JsonAdapter(ReportAgentGetV2V2DataListCustomerType.Adapter.class)
public enum ReportAgentGetV2V2DataListCustomerType {
  
  BRANCH("BRANCH"),
  
  LA("LA"),
  
  DSP("DSP"),
  
  REGION("REGION"),
  
  SMB_AGENT("SMB_AGENT"),
  
  INTERNET("INTERNET"),
  
  VERTICAL("VERTICAL"),
  
  VIRTUAL_LA("VIRTUAL_LA"),
  
  SELF_SERVICE("SELF_SERVICE"),
  
  VIRTUAL_KA("VIRTUAL_KA"),
  
  LA_AGENT("LA_AGENT"),
  
  VIRTUAL_CUS("VIRTUAL_CUS"),
  
  KA("KA"),
  
  I18N_AGENT("I18N_AGENT"),
  
  LOCAL("LOCAL"),
  
  KA_AGENT("KA_AGENT"),
  
  SMB("SMB"),
  
  VIRTUAL_SMB("VIRTUAL_SMB"),
  
  INTERNAL("INTERNAL"),
  
  I18N_ADV("I18N_ADV"),
  
  EXCHANGE("EXCHANGE"),
  
  GAME("GAME"),
  
  OVERSEA_VIRTUAL("OVERSEA_VIRTUAL");

  private String value;

  ReportAgentGetV2V2DataListCustomerType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAgentGetV2V2DataListCustomerType fromValue(String value) {
    for (ReportAgentGetV2V2DataListCustomerType b : ReportAgentGetV2V2DataListCustomerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAgentGetV2V2DataListCustomerType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAgentGetV2V2DataListCustomerType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAgentGetV2V2DataListCustomerType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAgentGetV2V2DataListCustomerType.fromValue(value);
    }
  }
}

