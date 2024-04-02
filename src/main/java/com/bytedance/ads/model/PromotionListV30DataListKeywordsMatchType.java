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
@JsonAdapter(PromotionListV30DataListKeywordsMatchType.Adapter.class)
public enum PromotionListV30DataListKeywordsMatchType {
  
  EXTENSIVE("EXTENSIVE"),
  
  PHRASE("PHRASE"),
  
  PRECISION("PRECISION");

  private String value;

  PromotionListV30DataListKeywordsMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListKeywordsMatchType fromValue(String value) {
    for (PromotionListV30DataListKeywordsMatchType b : PromotionListV30DataListKeywordsMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListKeywordsMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListKeywordsMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListKeywordsMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListKeywordsMatchType.fromValue(value);
    }
  }
}

