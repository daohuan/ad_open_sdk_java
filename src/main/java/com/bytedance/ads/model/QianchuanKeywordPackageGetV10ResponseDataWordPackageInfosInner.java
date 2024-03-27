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
import com.bytedance.ads.model.QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner {
  public static final String SERIALIZED_NAME_DEGREE = "degree";
  @SerializedName(SERIALIZED_NAME_DEGREE)
  private Long degree = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_KEYWORD_INFOS = "keyword_infos";
  @SerializedName(SERIALIZED_NAME_KEYWORD_INFOS)
  private List<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner> keywordInfos = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SEARCH_SUM = "search_sum";
  @SerializedName(SERIALIZED_NAME_SEARCH_SUM)
  private Long searchSum = null;

  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner() {
  }

  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner degree(Long degree) {
    
    this.degree = degree;
    return this;
  }

   /**
   * 
   * @return degree
  **/
  @javax.annotation.Nullable
  public Long getDegree() {
    return degree;
  }


  public void setDegree(Long degree) {
    this.degree = degree;
  }


  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner keywordInfos(List<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner> keywordInfos) {
    
    this.keywordInfos = keywordInfos;
    return this;
  }

  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner addKeywordInfosItem(QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner keywordInfosItem) {
    if (this.keywordInfos == null) {
      this.keywordInfos = new ArrayList<>();
    }
    this.keywordInfos.add(keywordInfosItem);
    return this;
  }

   /**
   * 
   * @return keywordInfos
  **/
  @javax.annotation.Nullable
  public List<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner> getKeywordInfos() {
    return keywordInfos;
  }


  public void setKeywordInfos(List<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner> keywordInfos) {
    this.keywordInfos = keywordInfos;
  }


  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner searchSum(Long searchSum) {
    
    this.searchSum = searchSum;
    return this;
  }

   /**
   * 
   * @return searchSum
  **/
  @javax.annotation.Nullable
  public Long getSearchSum() {
    return searchSum;
  }


  public void setSearchSum(Long searchSum) {
    this.searchSum = searchSum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner = (QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner) o;
    return Objects.equals(this.degree, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner.degree) &&
        Objects.equals(this.id, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner.id) &&
        Objects.equals(this.keywordInfos, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner.keywordInfos) &&
        Objects.equals(this.name, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner.name) &&
        Objects.equals(this.searchSum, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner.searchSum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(degree, id, keywordInfos, name, searchSum);
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
    sb.append("class QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner {\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keywordInfos: ").append(toIndentedString(keywordInfos)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    searchSum: ").append(toIndentedString(searchSum)).append("\n");
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
    openapiFields.add("degree");
    openapiFields.add("id");
    openapiFields.add("keyword_infos");
    openapiFields.add("name");
    openapiFields.add("search_sum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner
  */
  public static QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

