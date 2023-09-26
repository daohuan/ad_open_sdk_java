/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class QianchuanAwemeEstimateProfitV10ResponseData {
  public static final String SERIALIZED_NAME_MAX_PROFIT = "max_profit";
  @SerializedName(SERIALIZED_NAME_MAX_PROFIT)
  private Long maxProfit = null;

  public static final String SERIALIZED_NAME_MIN_PROFIT = "min_profit";
  @SerializedName(SERIALIZED_NAME_MIN_PROFIT)
  private Long minProfit = null;

  public QianchuanAwemeEstimateProfitV10ResponseData() {
  }

  public QianchuanAwemeEstimateProfitV10ResponseData maxProfit(Long maxProfit) {
    
    this.maxProfit = maxProfit;
    return this;
  }

   /**
   * 
   * @return maxProfit
  **/
  @javax.annotation.Nullable
  public Long getMaxProfit() {
    return maxProfit;
  }


  public void setMaxProfit(Long maxProfit) {
    this.maxProfit = maxProfit;
  }


  public QianchuanAwemeEstimateProfitV10ResponseData minProfit(Long minProfit) {
    
    this.minProfit = minProfit;
    return this;
  }

   /**
   * 
   * @return minProfit
  **/
  @javax.annotation.Nullable
  public Long getMinProfit() {
    return minProfit;
  }


  public void setMinProfit(Long minProfit) {
    this.minProfit = minProfit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeEstimateProfitV10ResponseData qianchuanAwemeEstimateProfitV10ResponseData = (QianchuanAwemeEstimateProfitV10ResponseData) o;
    return Objects.equals(this.maxProfit, qianchuanAwemeEstimateProfitV10ResponseData.maxProfit) &&
        Objects.equals(this.minProfit, qianchuanAwemeEstimateProfitV10ResponseData.minProfit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxProfit, minProfit);
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
    sb.append("class QianchuanAwemeEstimateProfitV10ResponseData {\n");
    sb.append("    maxProfit: ").append(toIndentedString(maxProfit)).append("\n");
    sb.append("    minProfit: ").append(toIndentedString(minProfit)).append("\n");
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
    openapiFields.add("max_profit");
    openapiFields.add("min_profit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("min_profit");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeEstimateProfitV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeEstimateProfitV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeEstimateProfitV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeEstimateProfitV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeEstimateProfitV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeEstimateProfitV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeEstimateProfitV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeEstimateProfitV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeEstimateProfitV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeEstimateProfitV10ResponseData
  */
  public static QianchuanAwemeEstimateProfitV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeEstimateProfitV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAwemeEstimateProfitV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

