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
import com.bytedance.ads.model.StarReportOrderOverviewGetV2ResponseDataComment;
import com.bytedance.ads.model.StarReportOrderOverviewGetV2ResponseDataConvert;
import com.bytedance.ads.model.StarReportOrderOverviewGetV2ResponseDataCostEffectiveness;
import com.bytedance.ads.model.StarReportOrderOverviewGetV2ResponseDataCreative;
import com.bytedance.ads.model.StarReportOrderOverviewGetV2ResponseDataSpread;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class StarReportOrderOverviewGetV2ResponseData {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private StarReportOrderOverviewGetV2ResponseDataComment comment = null;

  public static final String SERIALIZED_NAME_CONVERT = "convert";
  @SerializedName(SERIALIZED_NAME_CONVERT)
  private StarReportOrderOverviewGetV2ResponseDataConvert convert = null;

  public static final String SERIALIZED_NAME_COST_EFFECTIVENESS = "cost_effectiveness";
  @SerializedName(SERIALIZED_NAME_COST_EFFECTIVENESS)
  private StarReportOrderOverviewGetV2ResponseDataCostEffectiveness costEffectiveness = null;

  public static final String SERIALIZED_NAME_CREATIVE = "creative";
  @SerializedName(SERIALIZED_NAME_CREATIVE)
  private StarReportOrderOverviewGetV2ResponseDataCreative creative = null;

  public static final String SERIALIZED_NAME_SPREAD = "spread";
  @SerializedName(SERIALIZED_NAME_SPREAD)
  private StarReportOrderOverviewGetV2ResponseDataSpread spread = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public StarReportOrderOverviewGetV2ResponseData() {
  }

  public StarReportOrderOverviewGetV2ResponseData comment(StarReportOrderOverviewGetV2ResponseDataComment comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  public StarReportOrderOverviewGetV2ResponseDataComment getComment() {
    return comment;
  }


  public void setComment(StarReportOrderOverviewGetV2ResponseDataComment comment) {
    this.comment = comment;
  }


  public StarReportOrderOverviewGetV2ResponseData convert(StarReportOrderOverviewGetV2ResponseDataConvert convert) {
    
    this.convert = convert;
    return this;
  }

   /**
   * Get convert
   * @return convert
  **/
  @javax.annotation.Nullable
  public StarReportOrderOverviewGetV2ResponseDataConvert getConvert() {
    return convert;
  }


  public void setConvert(StarReportOrderOverviewGetV2ResponseDataConvert convert) {
    this.convert = convert;
  }


  public StarReportOrderOverviewGetV2ResponseData costEffectiveness(StarReportOrderOverviewGetV2ResponseDataCostEffectiveness costEffectiveness) {
    
    this.costEffectiveness = costEffectiveness;
    return this;
  }

   /**
   * Get costEffectiveness
   * @return costEffectiveness
  **/
  @javax.annotation.Nullable
  public StarReportOrderOverviewGetV2ResponseDataCostEffectiveness getCostEffectiveness() {
    return costEffectiveness;
  }


  public void setCostEffectiveness(StarReportOrderOverviewGetV2ResponseDataCostEffectiveness costEffectiveness) {
    this.costEffectiveness = costEffectiveness;
  }


  public StarReportOrderOverviewGetV2ResponseData creative(StarReportOrderOverviewGetV2ResponseDataCreative creative) {
    
    this.creative = creative;
    return this;
  }

   /**
   * Get creative
   * @return creative
  **/
  @javax.annotation.Nullable
  public StarReportOrderOverviewGetV2ResponseDataCreative getCreative() {
    return creative;
  }


  public void setCreative(StarReportOrderOverviewGetV2ResponseDataCreative creative) {
    this.creative = creative;
  }


  public StarReportOrderOverviewGetV2ResponseData spread(StarReportOrderOverviewGetV2ResponseDataSpread spread) {
    
    this.spread = spread;
    return this;
  }

   /**
   * Get spread
   * @return spread
  **/
  @javax.annotation.Nullable
  public StarReportOrderOverviewGetV2ResponseDataSpread getSpread() {
    return spread;
  }


  public void setSpread(StarReportOrderOverviewGetV2ResponseDataSpread spread) {
    this.spread = spread;
  }


  public StarReportOrderOverviewGetV2ResponseData updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewGetV2ResponseData starReportOrderOverviewGetV2ResponseData = (StarReportOrderOverviewGetV2ResponseData) o;
    return Objects.equals(this.comment, starReportOrderOverviewGetV2ResponseData.comment) &&
        Objects.equals(this.convert, starReportOrderOverviewGetV2ResponseData.convert) &&
        Objects.equals(this.costEffectiveness, starReportOrderOverviewGetV2ResponseData.costEffectiveness) &&
        Objects.equals(this.creative, starReportOrderOverviewGetV2ResponseData.creative) &&
        Objects.equals(this.spread, starReportOrderOverviewGetV2ResponseData.spread) &&
        Objects.equals(this.updateTime, starReportOrderOverviewGetV2ResponseData.updateTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, convert, costEffectiveness, creative, spread, updateTime);
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
    sb.append("class StarReportOrderOverviewGetV2ResponseData {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    costEffectiveness: ").append(toIndentedString(costEffectiveness)).append("\n");
    sb.append("    creative: ").append(toIndentedString(creative)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("convert");
    openapiFields.add("cost_effectiveness");
    openapiFields.add("creative");
    openapiFields.add("spread");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewGetV2ResponseData
  */
  public static StarReportOrderOverviewGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewGetV2ResponseData.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

