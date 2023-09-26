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
import com.bytedance.ads.model.QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class QianchuanKeywordPackageGetV10ResponseData {
  public static final String SERIALIZED_NAME_WORD_PACKAGE_INFOS = "word_package_infos";
  @SerializedName(SERIALIZED_NAME_WORD_PACKAGE_INFOS)
  private List<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner> wordPackageInfos = null;

  public QianchuanKeywordPackageGetV10ResponseData() {
  }

  public QianchuanKeywordPackageGetV10ResponseData wordPackageInfos(List<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner> wordPackageInfos) {
    
    this.wordPackageInfos = wordPackageInfos;
    return this;
  }

  public QianchuanKeywordPackageGetV10ResponseData addWordPackageInfosItem(QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner wordPackageInfosItem) {
    if (this.wordPackageInfos == null) {
      this.wordPackageInfos = new ArrayList<>();
    }
    this.wordPackageInfos.add(wordPackageInfosItem);
    return this;
  }

   /**
   * 
   * @return wordPackageInfos
  **/
  @javax.annotation.Nullable
  public List<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner> getWordPackageInfos() {
    return wordPackageInfos;
  }


  public void setWordPackageInfos(List<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInner> wordPackageInfos) {
    this.wordPackageInfos = wordPackageInfos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanKeywordPackageGetV10ResponseData qianchuanKeywordPackageGetV10ResponseData = (QianchuanKeywordPackageGetV10ResponseData) o;
    return Objects.equals(this.wordPackageInfos, qianchuanKeywordPackageGetV10ResponseData.wordPackageInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordPackageInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanKeywordPackageGetV10ResponseData {\n");
    sb.append("    wordPackageInfos: ").append(toIndentedString(wordPackageInfos)).append("\n");
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
    openapiFields.add("word_package_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("word_package_infos");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanKeywordPackageGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanKeywordPackageGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanKeywordPackageGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanKeywordPackageGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanKeywordPackageGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanKeywordPackageGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanKeywordPackageGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanKeywordPackageGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanKeywordPackageGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanKeywordPackageGetV10ResponseData
  */
  public static QianchuanKeywordPackageGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanKeywordPackageGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanKeywordPackageGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

