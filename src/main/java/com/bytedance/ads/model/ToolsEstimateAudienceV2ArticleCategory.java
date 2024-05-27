/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
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
@JsonAdapter(ToolsEstimateAudienceV2ArticleCategory.Adapter.class)
public enum ToolsEstimateAudienceV2ArticleCategory {
  
  COLLECTION("COLLECTION"),
  
  BUSINESS("BUSINESS"),
  
  HEALTH("HEALTH"),
  
  LOCAL("LOCAL"),
  
  STORIES("STORIES"),
  
  PARENTING("PARENTING"),
  
  HISTORY("HISTORY"),
  
  FREAK("FREAK"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  LAWS("LAWS"),
  
  GOVERNMENT("GOVERNMENT"),
  
  PETS("PETS"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  FASHION("FASHION"),
  
  EDUCATION("EDUCATION"),
  
  TIPS("TIPS"),
  
  ANIMATION("ANIMATION"),
  
  MILITARY("MILITARY"),
  
  ESSAY("ESSAY"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  TRAVEL("TRAVEL"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  REGIMEN("REGIMEN"),
  
  SPORTS("SPORTS"),
  
  DIGITAL("DIGITAL"),
  
  MOVIE("MOVIE"),
  
  AMUSEMENT("AMUSEMENT"),
  
  EXPLORE("EXPLORE"),
  
  CULTURE("CULTURE"),
  
  SCIENCE("SCIENCE"),
  
  CONSTELLATION("CONSTELLATION"),
  
  CARS("CARS"),
  
  FINANCE("FINANCE"),
  
  EMOTION("EMOTION"),
  
  SOCIETY("SOCIETY"),
  
  COMICS("COMICS"),
  
  HOME("HOME"),
  
  DESIGN("DESIGN"),
  
  GRADUATES("GRADUATES"),
  
  GAMES("GAMES"),
  
  ESTATE("ESTATE"),
  
  WORKPLACE("WORKPLACE"),
  
  RUMOR_CRACKER("RUMOR_CRACKER"),
  
  GOURMET("GOURMET");

  private String value;

  ToolsEstimateAudienceV2ArticleCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2ArticleCategory fromValue(String value) {
    for (ToolsEstimateAudienceV2ArticleCategory b : ToolsEstimateAudienceV2ArticleCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2ArticleCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2ArticleCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2ArticleCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEstimateAudienceV2ArticleCategory.fromValue(value);
    }
  }
}

