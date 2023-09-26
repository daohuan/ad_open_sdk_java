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
import com.bytedance.ads.model.DmpDataSourceReadV2ResponseDataDataListInner;
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
public class DmpDataSourceReadV2ResponseData {
  public static final String SERIALIZED_NAME_DATA_LIST = "data_list";
  @SerializedName(SERIALIZED_NAME_DATA_LIST)
  private List<DmpDataSourceReadV2ResponseDataDataListInner> dataList = null;

  public DmpDataSourceReadV2ResponseData() {
  }

  public DmpDataSourceReadV2ResponseData dataList(List<DmpDataSourceReadV2ResponseDataDataListInner> dataList) {
    
    this.dataList = dataList;
    return this;
  }

  public DmpDataSourceReadV2ResponseData addDataListItem(DmpDataSourceReadV2ResponseDataDataListInner dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * 
   * @return dataList
  **/
  @javax.annotation.Nullable
  public List<DmpDataSourceReadV2ResponseDataDataListInner> getDataList() {
    return dataList;
  }


  public void setDataList(List<DmpDataSourceReadV2ResponseDataDataListInner> dataList) {
    this.dataList = dataList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpDataSourceReadV2ResponseData dmpDataSourceReadV2ResponseData = (DmpDataSourceReadV2ResponseData) o;
    return Objects.equals(this.dataList, dmpDataSourceReadV2ResponseData.dataList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpDataSourceReadV2ResponseData {\n");
    sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
    openapiFields.add("data_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpDataSourceReadV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpDataSourceReadV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpDataSourceReadV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpDataSourceReadV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpDataSourceReadV2ResponseData>() {
           @Override
           public void write(JsonWriter out, DmpDataSourceReadV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpDataSourceReadV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpDataSourceReadV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpDataSourceReadV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to DmpDataSourceReadV2ResponseData
  */
  public static DmpDataSourceReadV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpDataSourceReadV2ResponseData.class);
  }

 /**
  * Convert an instance of DmpDataSourceReadV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

