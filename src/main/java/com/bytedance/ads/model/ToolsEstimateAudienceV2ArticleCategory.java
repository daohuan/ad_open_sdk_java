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
@JsonAdapter(ToolsEstimateAudienceV2ArticleCategory.Adapter.class)
public enum ToolsEstimateAudienceV2ArticleCategory {
  
  CULTURE("CULTURE"),
  
  REGIMEN("REGIMEN"),
  
  SPORTS("SPORTS"),
  
  EMOTION("EMOTION"),
  
  SCIENCE("SCIENCE"),
  
  TECHNOLOGY("TECHNOLOGY"),
  
  WEIGHT_LOSING("WEIGHT_LOSING"),
  
  EDUCATION("EDUCATION"),
  
  DESIGN("DESIGN"),
  
  PARENTING("PARENTING"),
  
  FINANCE("FINANCE"),
  
  GAMES("GAMES"),
  
  GRADUATES("GRADUATES"),
  
  ANIMATION("ANIMATION"),
  
  CARS("CARS"),
  
  WORKPLACE("WORKPLACE"),
  
  TRAVEL("TRAVEL"),
  
  PETS("PETS"),
  
  SOCIETY("SOCIETY"),
  
  AMUSEMENT("AMUSEMENT"),
  
  LAWS("LAWS"),
  
  COMICS("COMICS"),
  
  FASHION("FASHION"),
  
  FREAK("FREAK"),
  
  HEALTH("HEALTH"),
  
  MOVIE("MOVIE"),
  
  ESSAY("ESSAY"),
  
  DIGITAL("DIGITAL"),
  
  HOME("HOME"),
  
  BUSINESS("BUSINESS"),
  
  EXPLORE("EXPLORE"),
  
  ENTERTAINMENT("ENTERTAINMENT"),
  
  GOVERNMENT("GOVERNMENT"),
  
  MILITARY("MILITARY"),
  
  PHOTOGRAPHY("PHOTOGRAPHY"),
  
  LOCAL("LOCAL"),
  
  HISTORY("HISTORY"),
  
  STORIES("STORIES"),
  
  INTERNATIONAL("INTERNATIONAL"),
  
  GOURMET("GOURMET"),
  
  ESTATE("ESTATE"),
  
  TIPS("TIPS"),
  
  COLLECTION("COLLECTION"),
  
  CONSTELLATION("CONSTELLATION"),
  
  RUMOR_CRACKER("RUMOR_CRACKER");

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

