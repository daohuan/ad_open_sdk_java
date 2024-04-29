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
import com.bytedance.ads.model.KeywordCreateV2V2ResponseDataErrorListInner;
import com.bytedance.ads.model.KeywordCreateV2V2ResponseDataSuccessListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class KeywordCreateV2V2ResponseData {
  public static final String SERIALIZED_NAME_ERROR_LIST = "error_list";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<KeywordCreateV2V2ResponseDataErrorListInner> errorList = null;

  public static final String SERIALIZED_NAME_SUCCESS_LIST = "success_list";
  @SerializedName(SERIALIZED_NAME_SUCCESS_LIST)
  private List<KeywordCreateV2V2ResponseDataSuccessListInner> successList = null;

  public KeywordCreateV2V2ResponseData() {
  }

  public KeywordCreateV2V2ResponseData errorList(List<KeywordCreateV2V2ResponseDataErrorListInner> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public KeywordCreateV2V2ResponseData addErrorListItem(KeywordCreateV2V2ResponseDataErrorListInner errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * 
   * @return errorList
  **/
  @javax.annotation.Nullable
  public List<KeywordCreateV2V2ResponseDataErrorListInner> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<KeywordCreateV2V2ResponseDataErrorListInner> errorList) {
    this.errorList = errorList;
  }


  public KeywordCreateV2V2ResponseData successList(List<KeywordCreateV2V2ResponseDataSuccessListInner> successList) {
    
    this.successList = successList;
    return this;
  }

  public KeywordCreateV2V2ResponseData addSuccessListItem(KeywordCreateV2V2ResponseDataSuccessListInner successListItem) {
    if (this.successList == null) {
      this.successList = new ArrayList<>();
    }
    this.successList.add(successListItem);
    return this;
  }

   /**
   * 
   * @return successList
  **/
  @javax.annotation.Nullable
  public List<KeywordCreateV2V2ResponseDataSuccessListInner> getSuccessList() {
    return successList;
  }


  public void setSuccessList(List<KeywordCreateV2V2ResponseDataSuccessListInner> successList) {
    this.successList = successList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordCreateV2V2ResponseData keywordCreateV2V2ResponseData = (KeywordCreateV2V2ResponseData) o;
    return Objects.equals(this.errorList, keywordCreateV2V2ResponseData.errorList) &&
        Objects.equals(this.successList, keywordCreateV2V2ResponseData.successList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList, successList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordCreateV2V2ResponseData {\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    successList: ").append(toIndentedString(successList)).append("\n");
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
    openapiFields.add("error_list");
    openapiFields.add("success_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordCreateV2V2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordCreateV2V2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordCreateV2V2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordCreateV2V2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordCreateV2V2ResponseData>() {
           @Override
           public void write(JsonWriter out, KeywordCreateV2V2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeywordCreateV2V2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeywordCreateV2V2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeywordCreateV2V2ResponseData
  * @throws IOException if the JSON string is invalid with respect to KeywordCreateV2V2ResponseData
  */
  public static KeywordCreateV2V2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordCreateV2V2ResponseData.class);
  }

 /**
  * Convert an instance of KeywordCreateV2V2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

