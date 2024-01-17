/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
 * AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner {
  public static final String SERIALIZED_NAME_WORD_ID = "word_id";
  @SerializedName(SERIALIZED_NAME_WORD_ID)
  private Long wordId = null;

  public AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner() {
  }

  public AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner wordId(Long wordId) {
    
    this.wordId = wordId;
    return this;
  }

   /**
   * 词包id
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
    AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner adlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner = (AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner) o;
    return Objects.equals(this.wordId, adlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner.wordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner {\n");
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
    openapiFields.add("word_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner
  */
  public static AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInnerWordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
