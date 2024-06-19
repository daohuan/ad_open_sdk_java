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
@JsonAdapter(SubscribeAccountsListV30Statuses.Adapter.class)
public enum SubscribeAccountsListV30Statuses {
  
  OK("OK"),
  
  PENDING("PENDING"),
  
  UNAUTHORIZED("UNAUTHORIZED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SubscribeAccountsListV30Statuses(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubscribeAccountsListV30Statuses fromValue(String value) {
    for (SubscribeAccountsListV30Statuses b : SubscribeAccountsListV30Statuses.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SubscribeAccountsListV30Statuses> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubscribeAccountsListV30Statuses enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SubscribeAccountsListV30Statuses read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SubscribeAccountsListV30Statuses.fromValue(value);
    }
  }
}

