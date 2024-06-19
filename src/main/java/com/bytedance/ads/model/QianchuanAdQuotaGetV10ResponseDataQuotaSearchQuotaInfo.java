/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * 在投计划数限额信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo {
  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Long totalNum = null;

  public QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo() {
  }

  public QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo totalNum(Long totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * 总在投计划限额
   * @return totalNum
  **/
  @javax.annotation.Nullable
  public Long getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Long totalNum) {
    this.totalNum = totalNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo qianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo = (QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo) o;
    return Objects.equals(this.totalNum, qianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo.totalNum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNum);
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
    sb.append("class QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo {\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
    openapiFields.add("total_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo
  */
  public static QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo.class);
  }

 /**
  * Convert an instance of QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

