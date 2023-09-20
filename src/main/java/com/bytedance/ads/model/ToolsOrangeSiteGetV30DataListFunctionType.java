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
@JsonAdapter(ToolsOrangeSiteGetV30DataListFunctionType.Adapter.class)
public enum ToolsOrangeSiteGetV30DataListFunctionType {
  
  NEW_MODULAR("SITE_FUNC_TYPE_NEW_MODULAR"),
  
  NORMAL("SITE_FUNC_TYPE_NORMAL");

  private String value;

  ToolsOrangeSiteGetV30DataListFunctionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsOrangeSiteGetV30DataListFunctionType fromValue(String value) {
    for (ToolsOrangeSiteGetV30DataListFunctionType b : ToolsOrangeSiteGetV30DataListFunctionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsOrangeSiteGetV30DataListFunctionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsOrangeSiteGetV30DataListFunctionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsOrangeSiteGetV30DataListFunctionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsOrangeSiteGetV30DataListFunctionType.fromValue(value);
    }
  }
}

