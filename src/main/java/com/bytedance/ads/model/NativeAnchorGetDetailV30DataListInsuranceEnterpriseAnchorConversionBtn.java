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
@JsonAdapter(NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn.Adapter.class)
public enum NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn {
  
  BUY_NOW("BUY_NOW"),
  
  FREE_RECEIVE("FREE_RECEIVE"),
  
  IMPROVE_NOW("IMPROVE_NOW"),
  
  VIEW_DETIALS("VIEW_DETIALS");

  private String value;

  NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn fromValue(String value) {
    for (NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn b : NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn.fromValue(value);
    }
  }
}

