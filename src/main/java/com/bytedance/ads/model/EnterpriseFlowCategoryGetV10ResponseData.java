/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EnterpriseFlowCategoryGetV10ResponseDataListInner;
import com.bytedance.ads.model.EnterpriseFlowCategoryGetV10ResponseDataTotalMetrics;
import com.bytedance.ads.model.EnterpriseFlowCategoryGetV10ResponseDataTotalRatio;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class EnterpriseFlowCategoryGetV10ResponseData {
  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<EnterpriseFlowCategoryGetV10ResponseDataListInner> _list = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount = null;

  public static final String SERIALIZED_NAME_TOTAL_METRICS = "total_metrics";
  @SerializedName(SERIALIZED_NAME_TOTAL_METRICS)
  private EnterpriseFlowCategoryGetV10ResponseDataTotalMetrics totalMetrics = null;

  public static final String SERIALIZED_NAME_TOTAL_RATIO = "total_ratio";
  @SerializedName(SERIALIZED_NAME_TOTAL_RATIO)
  private EnterpriseFlowCategoryGetV10ResponseDataTotalRatio totalRatio = null;

  public EnterpriseFlowCategoryGetV10ResponseData() {
  }

  public EnterpriseFlowCategoryGetV10ResponseData _list(List<EnterpriseFlowCategoryGetV10ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public EnterpriseFlowCategoryGetV10ResponseData addListItem(EnterpriseFlowCategoryGetV10ResponseDataListInner _listItem) {
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
  public List<EnterpriseFlowCategoryGetV10ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<EnterpriseFlowCategoryGetV10ResponseDataListInner> _list) {
    this._list = _list;
  }


  public EnterpriseFlowCategoryGetV10ResponseData offset(Long offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * 
   * @return offset
  **/
  @javax.annotation.Nullable
  public Long getOffset() {
    return offset;
  }


  public void setOffset(Long offset) {
    this.offset = offset;
  }


  public EnterpriseFlowCategoryGetV10ResponseData totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public EnterpriseFlowCategoryGetV10ResponseData totalMetrics(EnterpriseFlowCategoryGetV10ResponseDataTotalMetrics totalMetrics) {
    
    this.totalMetrics = totalMetrics;
    return this;
  }

   /**
   * Get totalMetrics
   * @return totalMetrics
  **/
  @javax.annotation.Nullable
  public EnterpriseFlowCategoryGetV10ResponseDataTotalMetrics getTotalMetrics() {
    return totalMetrics;
  }


  public void setTotalMetrics(EnterpriseFlowCategoryGetV10ResponseDataTotalMetrics totalMetrics) {
    this.totalMetrics = totalMetrics;
  }


  public EnterpriseFlowCategoryGetV10ResponseData totalRatio(EnterpriseFlowCategoryGetV10ResponseDataTotalRatio totalRatio) {
    
    this.totalRatio = totalRatio;
    return this;
  }

   /**
   * Get totalRatio
   * @return totalRatio
  **/
  @javax.annotation.Nullable
  public EnterpriseFlowCategoryGetV10ResponseDataTotalRatio getTotalRatio() {
    return totalRatio;
  }


  public void setTotalRatio(EnterpriseFlowCategoryGetV10ResponseDataTotalRatio totalRatio) {
    this.totalRatio = totalRatio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseFlowCategoryGetV10ResponseData enterpriseFlowCategoryGetV10ResponseData = (EnterpriseFlowCategoryGetV10ResponseData) o;
    return Objects.equals(this._list, enterpriseFlowCategoryGetV10ResponseData._list) &&
        Objects.equals(this.offset, enterpriseFlowCategoryGetV10ResponseData.offset) &&
        Objects.equals(this.totalCount, enterpriseFlowCategoryGetV10ResponseData.totalCount) &&
        Objects.equals(this.totalMetrics, enterpriseFlowCategoryGetV10ResponseData.totalMetrics) &&
        Objects.equals(this.totalRatio, enterpriseFlowCategoryGetV10ResponseData.totalRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list, offset, totalCount, totalMetrics, totalRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseFlowCategoryGetV10ResponseData {\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalMetrics: ").append(toIndentedString(totalMetrics)).append("\n");
    sb.append("    totalRatio: ").append(toIndentedString(totalRatio)).append("\n");
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
    openapiFields.add("list");
    openapiFields.add("offset");
    openapiFields.add("total_count");
    openapiFields.add("total_metrics");
    openapiFields.add("total_ratio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseFlowCategoryGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseFlowCategoryGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseFlowCategoryGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseFlowCategoryGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseFlowCategoryGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, EnterpriseFlowCategoryGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseFlowCategoryGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseFlowCategoryGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseFlowCategoryGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to EnterpriseFlowCategoryGetV10ResponseData
  */
  public static EnterpriseFlowCategoryGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseFlowCategoryGetV10ResponseData.class);
  }

 /**
  * Convert an instance of EnterpriseFlowCategoryGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

