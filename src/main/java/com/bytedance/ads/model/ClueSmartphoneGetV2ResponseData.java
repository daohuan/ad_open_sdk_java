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
import com.bytedance.ads.model.AgentAdvertiserSelectV2ResponseDataPageInfo;
import com.bytedance.ads.model.ClueSmartphoneGetV2ResponseDataListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class ClueSmartphoneGetV2ResponseData {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<ClueSmartphoneGetV2ResponseDataListInner> _list = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private AgentAdvertiserSelectV2ResponseDataPageInfo pageInfo = null;

  public ClueSmartphoneGetV2ResponseData() {
  }

  public ClueSmartphoneGetV2ResponseData key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ClueSmartphoneGetV2ResponseData _list(List<ClueSmartphoneGetV2ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public ClueSmartphoneGetV2ResponseData addListItem(ClueSmartphoneGetV2ResponseDataListInner _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * 
   * @return _list
  **/
  @javax.annotation.Nullable
  public List<ClueSmartphoneGetV2ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<ClueSmartphoneGetV2ResponseDataListInner> _list) {
    this._list = _list;
  }


  public ClueSmartphoneGetV2ResponseData pageInfo(AgentAdvertiserSelectV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public AgentAdvertiserSelectV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(AgentAdvertiserSelectV2ResponseDataPageInfo pageInfo) {
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
    ClueSmartphoneGetV2ResponseData clueSmartphoneGetV2ResponseData = (ClueSmartphoneGetV2ResponseData) o;
    return Objects.equals(this.key, clueSmartphoneGetV2ResponseData.key) &&
        Objects.equals(this._list, clueSmartphoneGetV2ResponseData._list) &&
        Objects.equals(this.pageInfo, clueSmartphoneGetV2ResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, _list, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueSmartphoneGetV2ResponseData {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueSmartphoneGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueSmartphoneGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueSmartphoneGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueSmartphoneGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueSmartphoneGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ClueSmartphoneGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueSmartphoneGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueSmartphoneGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueSmartphoneGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ClueSmartphoneGetV2ResponseData
  */
  public static ClueSmartphoneGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueSmartphoneGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ClueSmartphoneGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

