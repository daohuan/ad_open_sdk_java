/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
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
@JsonAdapter(BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType.Adapter.class)
public enum BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_47(47l),
  
  NUMBER_18(18l),
  
  NUMBER_44(44l),
  
  NUMBER_14(14l),
  
  NUMBER_48(48l),
  
  NUMBER_49(49l),
  
  NUMBER_50(50l),
  
  NUMBER_25(25l);

  private Long value;

  BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType fromValue(Long value) {
    for (BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType b : BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType.fromValue(value);
    }
  }
}

