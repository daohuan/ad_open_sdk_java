/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInner;
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
 * ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner {
  public static final String SERIALIZED_NAME_CONVERT_TYPE = "convert_type";
  @SerializedName(SERIALIZED_NAME_CONVERT_TYPE)
  private ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType convertType = null;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTIONS = "external_actions";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTIONS)
  private List<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInner> externalActions = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize = null;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER = "total_number";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER)
  private Long totalNumber = null;

  public static final String SERIALIZED_NAME_TOTAL_PAGE = "total_page";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE)
  private Long totalPage = null;

  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner() {
  }

  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner convertType(ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType convertType) {
    
    this.convertType = convertType;
    return this;
  }

   /**
   * Get convertType
   * @return convertType
  **/
  @javax.annotation.Nullable
  public ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType getConvertType() {
    return convertType;
  }


  public void setConvertType(ToolsAdConvertOptimizedTargetGetV2DataListConvertsConvertType convertType) {
    this.convertType = convertType;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * 
   * @return disabled
  **/
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner externalActions(List<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInner> externalActions) {
    
    this.externalActions = externalActions;
    return this;
  }

  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner addExternalActionsItem(ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInner externalActionsItem) {
    if (this.externalActions == null) {
      this.externalActions = new ArrayList<>();
    }
    this.externalActions.add(externalActionsItem);
    return this;
  }

   /**
   * 
   * @return externalActions
  **/
  @javax.annotation.Nullable
  public List<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInner> getExternalActions() {
    return externalActions;
  }


  public void setExternalActions(List<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInnerExternalActionsInner> externalActions) {
    this.externalActions = externalActions;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * 
   * @return page
  **/
  @javax.annotation.Nullable
  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }


  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner totalNumber(Long totalNumber) {
    
    this.totalNumber = totalNumber;
    return this;
  }

   /**
   * 
   * @return totalNumber
  **/
  @javax.annotation.Nullable
  public Long getTotalNumber() {
    return totalNumber;
  }


  public void setTotalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner totalPage(Long totalPage) {
    
    this.totalPage = totalPage;
    return this;
  }

   /**
   * 
   * @return totalPage
  **/
  @javax.annotation.Nullable
  public Long getTotalPage() {
    return totalPage;
  }


  public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner = (ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner) o;
    return Objects.equals(this.convertType, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.convertType) &&
        Objects.equals(this.disabled, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.disabled) &&
        Objects.equals(this.externalActions, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.externalActions) &&
        Objects.equals(this.page, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.page) &&
        Objects.equals(this.pageSize, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.pageSize) &&
        Objects.equals(this.totalNumber, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.totalNumber) &&
        Objects.equals(this.totalPage, toolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.totalPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertType, disabled, externalActions, page, pageSize, totalNumber, totalPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner {\n");
    sb.append("    convertType: ").append(toIndentedString(convertType)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    externalActions: ").append(toIndentedString(externalActions)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
    sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
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
    openapiFields.add("convert_type");
    openapiFields.add("disabled");
    openapiFields.add("external_actions");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("total_number");
    openapiFields.add("total_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner>() {
           @Override
           public void write(JsonWriter out, ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner
  */
  public static ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner.class);
  }

 /**
  * Convert an instance of ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

