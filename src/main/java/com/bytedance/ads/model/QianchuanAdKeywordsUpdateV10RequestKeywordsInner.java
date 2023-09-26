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
import com.bytedance.ads.model.QianchuanAdKeywordsUpdateV10KeywordsMatchType;
import com.bytedance.ads.model.QianchuanAdKeywordsUpdateV10KeywordsStatusType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * QianchuanAdKeywordsUpdateV10RequestKeywordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class QianchuanAdKeywordsUpdateV10RequestKeywordsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private QianchuanAdKeywordsUpdateV10KeywordsMatchType matchType = null;

  public static final String SERIALIZED_NAME_STATUS_TYPE = "status_type";
  @SerializedName(SERIALIZED_NAME_STATUS_TYPE)
  private QianchuanAdKeywordsUpdateV10KeywordsStatusType statusType = null;

  public QianchuanAdKeywordsUpdateV10RequestKeywordsInner() {
  }

  public QianchuanAdKeywordsUpdateV10RequestKeywordsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 关键词ID
   * minimum: 1
   * maximum: 9223372036854775807
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanAdKeywordsUpdateV10RequestKeywordsInner matchType(QianchuanAdKeywordsUpdateV10KeywordsMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  public QianchuanAdKeywordsUpdateV10KeywordsMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(QianchuanAdKeywordsUpdateV10KeywordsMatchType matchType) {
    this.matchType = matchType;
  }


  public QianchuanAdKeywordsUpdateV10RequestKeywordsInner statusType(QianchuanAdKeywordsUpdateV10KeywordsStatusType statusType) {
    
    this.statusType = statusType;
    return this;
  }

   /**
   * Get statusType
   * @return statusType
  **/
  @javax.annotation.Nullable
  public QianchuanAdKeywordsUpdateV10KeywordsStatusType getStatusType() {
    return statusType;
  }


  public void setStatusType(QianchuanAdKeywordsUpdateV10KeywordsStatusType statusType) {
    this.statusType = statusType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdKeywordsUpdateV10RequestKeywordsInner qianchuanAdKeywordsUpdateV10RequestKeywordsInner = (QianchuanAdKeywordsUpdateV10RequestKeywordsInner) o;
    return Objects.equals(this.id, qianchuanAdKeywordsUpdateV10RequestKeywordsInner.id) &&
        Objects.equals(this.matchType, qianchuanAdKeywordsUpdateV10RequestKeywordsInner.matchType) &&
        Objects.equals(this.statusType, qianchuanAdKeywordsUpdateV10RequestKeywordsInner.statusType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, matchType, statusType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdKeywordsUpdateV10RequestKeywordsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("match_type");
    openapiFields.add("status_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdKeywordsUpdateV10RequestKeywordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdKeywordsUpdateV10RequestKeywordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdKeywordsUpdateV10RequestKeywordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdKeywordsUpdateV10RequestKeywordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdKeywordsUpdateV10RequestKeywordsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdKeywordsUpdateV10RequestKeywordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdKeywordsUpdateV10RequestKeywordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdKeywordsUpdateV10RequestKeywordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdKeywordsUpdateV10RequestKeywordsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdKeywordsUpdateV10RequestKeywordsInner
  */
  public static QianchuanAdKeywordsUpdateV10RequestKeywordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdKeywordsUpdateV10RequestKeywordsInner.class);
  }

 /**
  * Convert an instance of QianchuanAdKeywordsUpdateV10RequestKeywordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

