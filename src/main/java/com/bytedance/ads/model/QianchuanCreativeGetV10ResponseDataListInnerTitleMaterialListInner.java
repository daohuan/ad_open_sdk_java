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
import com.bytedance.ads.model.QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialDynamicWordsInner;
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
 * QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner {
  public static final String SERIALIZED_NAME_DYNAMIC_WORDS = "dynamic_words";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_WORDS)
  private List<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialDynamicWordsInner> dynamicWords = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner() {
  }

  public QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner dynamicWords(List<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialDynamicWordsInner> dynamicWords) {
    
    this.dynamicWords = dynamicWords;
    return this;
  }

  public QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner addDynamicWordsItem(QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialDynamicWordsInner dynamicWordsItem) {
    if (this.dynamicWords == null) {
      this.dynamicWords = new ArrayList<>();
    }
    this.dynamicWords.add(dynamicWordsItem);
    return this;
  }

   /**
   * 
   * @return dynamicWords
  **/
  @javax.annotation.Nullable
  public List<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialDynamicWordsInner> getDynamicWords() {
    return dynamicWords;
  }


  public void setDynamicWords(List<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialDynamicWordsInner> dynamicWords) {
    this.dynamicWords = dynamicWords;
  }


  public QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner qianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner = (QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner) o;
    return Objects.equals(this.dynamicWords, qianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner.dynamicWords) &&
        Objects.equals(this.title, qianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicWords, title);
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
    sb.append("class QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner {\n");
    sb.append("    dynamicWords: ").append(toIndentedString(dynamicWords)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("dynamic_words");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner
  */
  public static QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner.class);
  }

 /**
  * Convert an instance of QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

