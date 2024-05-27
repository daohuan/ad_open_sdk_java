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
 * 舆情占比
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution {
  public static final String SERIALIZED_NAME_NEG_CNT = "neg_cnt";
  @SerializedName(SERIALIZED_NAME_NEG_CNT)
  private Long negCnt = null;

  public static final String SERIALIZED_NAME_NEG_RATE = "neg_rate";
  @SerializedName(SERIALIZED_NAME_NEG_RATE)
  private Double negRate = null;

  public static final String SERIALIZED_NAME_NEU_CNT = "neu_cnt";
  @SerializedName(SERIALIZED_NAME_NEU_CNT)
  private Long neuCnt = null;

  public static final String SERIALIZED_NAME_NEU_RATE = "neu_rate";
  @SerializedName(SERIALIZED_NAME_NEU_RATE)
  private Double neuRate = null;

  public static final String SERIALIZED_NAME_POS_CNT = "pos_cnt";
  @SerializedName(SERIALIZED_NAME_POS_CNT)
  private Long posCnt = null;

  public static final String SERIALIZED_NAME_POS_RATE = "pos_rate";
  @SerializedName(SERIALIZED_NAME_POS_RATE)
  private Double posRate = null;

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution() {
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution negCnt(Long negCnt) {
    
    this.negCnt = negCnt;
    return this;
  }

   /**
   * 评论舆情负向
   * @return negCnt
  **/
  @javax.annotation.Nullable
  public Long getNegCnt() {
    return negCnt;
  }


  public void setNegCnt(Long negCnt) {
    this.negCnt = negCnt;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution negRate(Double negRate) {
    
    this.negRate = negRate;
    return this;
  }

   /**
   * 负向表现
   * @return negRate
  **/
  @javax.annotation.Nullable
  public Double getNegRate() {
    return negRate;
  }


  public void setNegRate(Double negRate) {
    this.negRate = negRate;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution neuCnt(Long neuCnt) {
    
    this.neuCnt = neuCnt;
    return this;
  }

   /**
   * 评论舆情中立
   * @return neuCnt
  **/
  @javax.annotation.Nullable
  public Long getNeuCnt() {
    return neuCnt;
  }


  public void setNeuCnt(Long neuCnt) {
    this.neuCnt = neuCnt;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution neuRate(Double neuRate) {
    
    this.neuRate = neuRate;
    return this;
  }

   /**
   * 中立表现
   * @return neuRate
  **/
  @javax.annotation.Nullable
  public Double getNeuRate() {
    return neuRate;
  }


  public void setNeuRate(Double neuRate) {
    this.neuRate = neuRate;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution posCnt(Long posCnt) {
    
    this.posCnt = posCnt;
    return this;
  }

   /**
   * 评论舆情正向
   * @return posCnt
  **/
  @javax.annotation.Nullable
  public Long getPosCnt() {
    return posCnt;
  }


  public void setPosCnt(Long posCnt) {
    this.posCnt = posCnt;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution posRate(Double posRate) {
    
    this.posRate = posRate;
    return this;
  }

   /**
   * 正向表现
   * @return posRate
  **/
  @javax.annotation.Nullable
  public Double getPosRate() {
    return posRate;
  }


  public void setPosRate(Double posRate) {
    this.posRate = posRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution = (StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution) o;
    return Objects.equals(this.negCnt, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution.negCnt) &&
        Objects.equals(this.negRate, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution.negRate) &&
        Objects.equals(this.neuCnt, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution.neuCnt) &&
        Objects.equals(this.neuRate, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution.neuRate) &&
        Objects.equals(this.posCnt, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution.posCnt) &&
        Objects.equals(this.posRate, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution.posRate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(negCnt, negRate, neuCnt, neuRate, posCnt, posRate);
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
    sb.append("class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution {\n");
    sb.append("    negCnt: ").append(toIndentedString(negCnt)).append("\n");
    sb.append("    negRate: ").append(toIndentedString(negRate)).append("\n");
    sb.append("    neuCnt: ").append(toIndentedString(neuCnt)).append("\n");
    sb.append("    neuRate: ").append(toIndentedString(neuRate)).append("\n");
    sb.append("    posCnt: ").append(toIndentedString(posCnt)).append("\n");
    sb.append("    posRate: ").append(toIndentedString(posRate)).append("\n");
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
    openapiFields.add("neg_cnt");
    openapiFields.add("neg_rate");
    openapiFields.add("neu_cnt");
    openapiFields.add("neu_rate");
    openapiFields.add("pos_cnt");
    openapiFields.add("pos_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution
  */
  public static StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatEmotionDistribution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

