/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsMicroAppListV30FilteringAuditStatus;
import com.bytedance.ads.model.ToolsMicroAppListV30FilteringCreateTime;
import com.bytedance.ads.model.ToolsMicroAppListV30FilteringSearchType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class ToolsMicroAppListV30Filtering {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private ToolsMicroAppListV30FilteringAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private ToolsMicroAppListV30FilteringCreateTime createTime = null;

  public static final String SERIALIZED_NAME_SEARCH_KEY = "search_key";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEY)
  private String searchKey = null;

  public static final String SERIALIZED_NAME_SEARCH_TYPE = "search_type";
  @SerializedName(SERIALIZED_NAME_SEARCH_TYPE)
  private ToolsMicroAppListV30FilteringSearchType searchType = null;

  public ToolsMicroAppListV30Filtering() {
  }

  public ToolsMicroAppListV30Filtering auditStatus(ToolsMicroAppListV30FilteringAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30FilteringAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(ToolsMicroAppListV30FilteringAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public ToolsMicroAppListV30Filtering createTime(ToolsMicroAppListV30FilteringCreateTime createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30FilteringCreateTime getCreateTime() {
    return createTime;
  }


  public void setCreateTime(ToolsMicroAppListV30FilteringCreateTime createTime) {
    this.createTime = createTime;
  }


  public ToolsMicroAppListV30Filtering searchKey(String searchKey) {
    
    this.searchKey = searchKey;
    return this;
  }

   /**
   * 
   * @return searchKey
  **/
  @javax.annotation.Nullable
  public String getSearchKey() {
    return searchKey;
  }


  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }


  public ToolsMicroAppListV30Filtering searchType(ToolsMicroAppListV30FilteringSearchType searchType) {
    
    this.searchType = searchType;
    return this;
  }

   /**
   * Get searchType
   * @return searchType
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30FilteringSearchType getSearchType() {
    return searchType;
  }


  public void setSearchType(ToolsMicroAppListV30FilteringSearchType searchType) {
    this.searchType = searchType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsMicroAppListV30Filtering toolsMicroAppListV30Filtering = (ToolsMicroAppListV30Filtering) o;
    return Objects.equals(this.auditStatus, toolsMicroAppListV30Filtering.auditStatus) &&
        Objects.equals(this.createTime, toolsMicroAppListV30Filtering.createTime) &&
        Objects.equals(this.searchKey, toolsMicroAppListV30Filtering.searchKey) &&
        Objects.equals(this.searchType, toolsMicroAppListV30Filtering.searchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, createTime, searchKey, searchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsMicroAppListV30Filtering {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("create_time");
    openapiFields.add("search_key");
    openapiFields.add("search_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsMicroAppListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsMicroAppListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsMicroAppListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsMicroAppListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsMicroAppListV30Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsMicroAppListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsMicroAppListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsMicroAppListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsMicroAppListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsMicroAppListV30Filtering
  */
  public static ToolsMicroAppListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsMicroAppListV30Filtering.class);
  }

 /**
  * Convert an instance of ToolsMicroAppListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

