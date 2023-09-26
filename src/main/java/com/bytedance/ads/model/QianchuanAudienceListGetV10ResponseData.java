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
import com.bytedance.ads.model.QianchuanAudienceListGetV10ResponseDataAudiencesListInner;
import com.bytedance.ads.model.QianchuanAudienceListGetV10ResponseDataPageInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class QianchuanAudienceListGetV10ResponseData {
  public static final String SERIALIZED_NAME_AUDIENCES_LIST = "audiences_list";
  @SerializedName(SERIALIZED_NAME_AUDIENCES_LIST)
  private List<QianchuanAudienceListGetV10ResponseDataAudiencesListInner> audiencesList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanAudienceListGetV10ResponseDataPageInfo pageInfo = null;

  public QianchuanAudienceListGetV10ResponseData() {
  }

  public QianchuanAudienceListGetV10ResponseData audiencesList(List<QianchuanAudienceListGetV10ResponseDataAudiencesListInner> audiencesList) {
    
    this.audiencesList = audiencesList;
    return this;
  }

  public QianchuanAudienceListGetV10ResponseData addAudiencesListItem(QianchuanAudienceListGetV10ResponseDataAudiencesListInner audiencesListItem) {
    if (this.audiencesList == null) {
      this.audiencesList = new ArrayList<>();
    }
    this.audiencesList.add(audiencesListItem);
    return this;
  }

   /**
   * 
   * @return audiencesList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAudienceListGetV10ResponseDataAudiencesListInner> getAudiencesList() {
    return audiencesList;
  }


  public void setAudiencesList(List<QianchuanAudienceListGetV10ResponseDataAudiencesListInner> audiencesList) {
    this.audiencesList = audiencesList;
  }


  public QianchuanAudienceListGetV10ResponseData pageInfo(QianchuanAudienceListGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAudienceListGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanAudienceListGetV10ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAudienceListGetV10ResponseData qianchuanAudienceListGetV10ResponseData = (QianchuanAudienceListGetV10ResponseData) o;
    return Objects.equals(this.audiencesList, qianchuanAudienceListGetV10ResponseData.audiencesList) &&
        Objects.equals(this.pageInfo, qianchuanAudienceListGetV10ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiencesList, pageInfo);
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
    sb.append("class QianchuanAudienceListGetV10ResponseData {\n");
    sb.append("    audiencesList: ").append(toIndentedString(audiencesList)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("audiences_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAudienceListGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAudienceListGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAudienceListGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAudienceListGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAudienceListGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAudienceListGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAudienceListGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAudienceListGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAudienceListGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAudienceListGetV10ResponseData
  */
  public static QianchuanAudienceListGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAudienceListGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAudienceListGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

