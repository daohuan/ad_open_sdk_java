/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
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
@JsonAdapter(AgentInfoV2DataRole.Adapter.class)
public enum AgentInfoV2DataRole {
  
  ADVERTISER("ROLE_ADVERTISER"),
  
  AGENT("ROLE_AGENT"),
  
  AGENT_SYSTEM_ACCOUNT("ROLE_AGENT_SYSTEM_ACCOUNT"),
  
  HOTSOON_PROMOTION_ADVERTISER("ROLE_HOTSOON_PROMOTION_ADVERTISER"),
  
  ADMIN("ROLE_ADMIN"),
  
  ADVERTISER_SYSTEM_ACCOUNT("ROLE_ADVERTISER_SYSTEM_ACCOUNT"),
  
  HOTSOON_ADVERTISER("ROLE_HOTSOON_ADVERTISER"),
  
  DSP_ADVERTISER("ROLE_DSP_ADVERTISER"),
  
  ADVERTISER_ABSTRACT("ROLE_ADVERTISER_ABSTRACT"),
  
  LITE_ADVERTISER("ROLE_LITE_ADVERTISER"),
  
  PGC_ADVERTISER("ROLE_PGC_ADVERTISER"),
  
  ECP_INTERNAL_ADVERTISER("ROLE_ECP_INTERNAL_ADVERTISER"),
  
  ECP_CHILD_ADVERTISER("ROLE_ECP_CHILD_ADVERTISER"),
  
  MAJORDOMO("ROLE_MAJORDOMO"),
  
  AWEME_PROMOTION_ADVERTISER("ROLE_AWEME_PROMOTION_ADVERTISER"),
  
  CHILD_ADVERTISER("ROLE_CHILD_ADVERTISER"),
  
  DOUDIAN_ADVERTISER("ROLE_DOUDIAN_ADVERTISER"),
  
  INTERNAL_ADV("ROLE_INTERNAL_ADV"),
  
  ECP_ADVERTISER("ROLE_ECP_ADVERTISER"),
  
  CHILD_AGENT("ROLE_CHILD_AGENT"),
  
  AGENT_ABSTRACT("ROLE_AGENT_ABSTRACT");

  private String value;

  AgentInfoV2DataRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentInfoV2DataRole fromValue(String value) {
    for (AgentInfoV2DataRole b : AgentInfoV2DataRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentInfoV2DataRole> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentInfoV2DataRole enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentInfoV2DataRole read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentInfoV2DataRole.fromValue(value);
    }
  }
}

