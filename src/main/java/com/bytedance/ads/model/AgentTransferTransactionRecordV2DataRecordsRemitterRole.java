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
@JsonAdapter(AgentTransferTransactionRecordV2DataRecordsRemitterRole.Adapter.class)
public enum AgentTransferTransactionRecordV2DataRecordsRemitterRole {
  
  ADVERTISER("ROLE_ADVERTISER"),
  
  ADVERTISER_SYSTEM_ACCOUNT("ROLE_ADVERTISER_SYSTEM_ACCOUNT"),
  
  AGENT("ROLE_AGENT"),
  
  AGENT_SYSTEM_ACCOUNT("ROLE_AGENT_SYSTEM_ACCOUNT"),
  
  CHILD_AGENT("ROLE_CHILD_AGENT"),
  
  ECP_VIRTUAL_ADVERTISER("ROLE_ECP_VIRTUAL_ADVERTISER"),
  
  LOCAL_LIFE_VIRTUAL_ADVERTISER("ROLE_LOCAL_LIFE_VIRTUAL_ADVERTISER"),
  
  VIRTAUL_ADVERTISER("ROLE_VIRTAUL_ADVERTISER");

  private String value;

  AgentTransferTransactionRecordV2DataRecordsRemitterRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentTransferTransactionRecordV2DataRecordsRemitterRole fromValue(String value) {
    for (AgentTransferTransactionRecordV2DataRecordsRemitterRole b : AgentTransferTransactionRecordV2DataRecordsRemitterRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentTransferTransactionRecordV2DataRecordsRemitterRole> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentTransferTransactionRecordV2DataRecordsRemitterRole enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentTransferTransactionRecordV2DataRecordsRemitterRole read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentTransferTransactionRecordV2DataRecordsRemitterRole.fromValue(value);
    }
  }
}

