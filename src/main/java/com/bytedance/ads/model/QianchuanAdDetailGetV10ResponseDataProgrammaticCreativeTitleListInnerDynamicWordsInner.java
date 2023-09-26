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
 * QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner {
  public static final String SERIALIZED_NAME_DEFAULT_WORD = "default_word";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WORD)
  private String defaultWord = null;

  public static final String SERIALIZED_NAME_DICT_NAME = "dict_name";
  @SerializedName(SERIALIZED_NAME_DICT_NAME)
  private String dictName = null;

  public static final String SERIALIZED_NAME_WORD_ID = "word_id";
  @SerializedName(SERIALIZED_NAME_WORD_ID)
  private Long wordId = null;

  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner() {
  }

  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner defaultWord(String defaultWord) {
    
    this.defaultWord = defaultWord;
    return this;
  }

   /**
   * 
   * @return defaultWord
  **/
  @javax.annotation.Nullable
  public String getDefaultWord() {
    return defaultWord;
  }


  public void setDefaultWord(String defaultWord) {
    this.defaultWord = defaultWord;
  }


  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner dictName(String dictName) {
    
    this.dictName = dictName;
    return this;
  }

   /**
   * 
   * @return dictName
  **/
  @javax.annotation.Nullable
  public String getDictName() {
    return dictName;
  }


  public void setDictName(String dictName) {
    this.dictName = dictName;
  }


  public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner wordId(Long wordId) {
    
    this.wordId = wordId;
    return this;
  }

   /**
   * 
   * @return wordId
  **/
  @javax.annotation.Nullable
  public Long getWordId() {
    return wordId;
  }


  public void setWordId(Long wordId) {
    this.wordId = wordId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner = (QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner) o;
    return Objects.equals(this.defaultWord, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner.defaultWord) &&
        Objects.equals(this.dictName, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner.dictName) &&
        Objects.equals(this.wordId, qianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner.wordId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWord, dictName, wordId);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner {\n");
    sb.append("    defaultWord: ").append(toIndentedString(defaultWord)).append("\n");
    sb.append("    dictName: ").append(toIndentedString(dictName)).append("\n");
    sb.append("    wordId: ").append(toIndentedString(wordId)).append("\n");
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
    openapiFields.add("default_word");
    openapiFields.add("dict_name");
    openapiFields.add("word_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner
  */
  public static QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataProgrammaticCreativeTitleListInnerDynamicWordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

