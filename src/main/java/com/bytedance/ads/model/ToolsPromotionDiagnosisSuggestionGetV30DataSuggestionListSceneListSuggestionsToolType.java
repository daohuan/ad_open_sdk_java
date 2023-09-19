/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
@JsonAdapter(ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType.Adapter.class)
public enum ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType {
  
  ACTION("ACTION"),
  
  TEXT("TEXT");

  private String value;

  ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType fromValue(String value) {
    for (ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType b : ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListSuggestionsToolType.fromValue(value);
    }
  }
}
