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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * 综合得分
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat {
  public static final String SERIALIZED_NAME_CONVERT_SCORE = "convert_score";
  @SerializedName(SERIALIZED_NAME_CONVERT_SCORE)
  private Long convertScore = null;

  public static final String SERIALIZED_NAME_SEED_SCORE = "seed_score";
  @SerializedName(SERIALIZED_NAME_SEED_SCORE)
  private Long seedScore = null;

  public static final String SERIALIZED_NAME_SPREAD_SCORE = "spread_score";
  @SerializedName(SERIALIZED_NAME_SPREAD_SCORE)
  private Long spreadScore = null;

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat() {
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat convertScore(Long convertScore) {
    
    this.convertScore = convertScore;
    return this;
  }

   /**
   * 转化表现
   * @return convertScore
  **/
  @javax.annotation.Nullable
  public Long getConvertScore() {
    return convertScore;
  }


  public void setConvertScore(Long convertScore) {
    this.convertScore = convertScore;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat seedScore(Long seedScore) {
    
    this.seedScore = seedScore;
    return this;
  }

   /**
   * 种草表现
   * @return seedScore
  **/
  @javax.annotation.Nullable
  public Long getSeedScore() {
    return seedScore;
  }


  public void setSeedScore(Long seedScore) {
    this.seedScore = seedScore;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat spreadScore(Long spreadScore) {
    
    this.spreadScore = spreadScore;
    return this;
  }

   /**
   * 传播表现分
   * @return spreadScore
  **/
  @javax.annotation.Nullable
  public Long getSpreadScore() {
    return spreadScore;
  }


  public void setSpreadScore(Long spreadScore) {
    this.spreadScore = spreadScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat starReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat = (StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat) o;
    return Objects.equals(this.convertScore, starReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat.convertScore) &&
        Objects.equals(this.seedScore, starReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat.seedScore) &&
        Objects.equals(this.spreadScore, starReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat.spreadScore);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertScore, seedScore, spreadScore);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat {\n");
    sb.append("    convertScore: ").append(toIndentedString(convertScore)).append("\n");
    sb.append("    seedScore: ").append(toIndentedString(seedScore)).append("\n");
    sb.append("    spreadScore: ").append(toIndentedString(spreadScore)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("convert_score");
    openapiFields.add("seed_score");
    openapiFields.add("spread_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat
  */
  public static StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerWorthScoreStat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

