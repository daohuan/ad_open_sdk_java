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
import com.bytedance.ads.model.FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes;
import com.bytedance.ads.model.FileVideoMaterialClearTaskCreateV2ClearTaskParamsMaterialSource;
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
 * 任务参数
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class FileVideoMaterialClearTaskCreateV2RequestClearTaskParams {
  public static final String SERIALIZED_NAME_CLEAR_MATERIAL_TYPES = "clear_material_types";
  @SerializedName(SERIALIZED_NAME_CLEAR_MATERIAL_TYPES)
  private List<FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes> clearMaterialTypes = null;

  public static final String SERIALIZED_NAME_CONVERT = "convert";
  @SerializedName(SERIALIZED_NAME_CONVERT)
  private Long convert = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_CREATE_TIME_UPPER = "create_time_upper";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_UPPER)
  private String createTimeUpper = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_MATERIAL_SOURCE = "material_source";
  @SerializedName(SERIALIZED_NAME_MATERIAL_SOURCE)
  private FileVideoMaterialClearTaskCreateV2ClearTaskParamsMaterialSource materialSource = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams() {
  }

  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams clearMaterialTypes(List<FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes> clearMaterialTypes) {
    
    this.clearMaterialTypes = clearMaterialTypes;
    return this;
  }

  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams addClearMaterialTypesItem(FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes clearMaterialTypesItem) {
    if (this.clearMaterialTypes == null) {
      this.clearMaterialTypes = new ArrayList<>();
    }
    this.clearMaterialTypes.add(clearMaterialTypesItem);
    return this;
  }

   /**
   * 清理素材类型， 允许值： INEFFICIENT_MATERIAL低效素材； SIMILAR_MATERIAL 同质化挤压严重素材； SIMILAR_QUEUE_MATERIAL 同质化排队素材;
   * @return clearMaterialTypes
  **/
  @javax.annotation.Nullable
  public List<FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes> getClearMaterialTypes() {
    return clearMaterialTypes;
  }


  public void setClearMaterialTypes(List<FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes> clearMaterialTypes) {
    this.clearMaterialTypes = clearMaterialTypes;
  }


  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams convert(Long convert) {
    
    this.convert = convert;
    return this;
  }

   /**
   * 累积转化数@PM补充描述是UPPER值
   * @return convert
  **/
  @javax.annotation.Nullable
  public Long getConvert() {
    return convert;
  }


  public void setConvert(Long convert) {
    this.convert = convert;
  }


  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 累积消耗@PM补充描述是UPPER值
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams createTimeUpper(String createTimeUpper) {
    
    this.createTimeUpper = createTimeUpper;
    return this;
  }

   /**
   * 清理创建时间\&quot;yyyy-mm-dd\&quot;之前的素材，包括这一天
   * @return createTimeUpper
  **/
  @javax.annotation.Nullable
  public String getCreateTimeUpper() {
    return createTimeUpper;
  }


  public void setCreateTimeUpper(String createTimeUpper) {
    this.createTimeUpper = createTimeUpper;
  }


  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 数据统计结束时间\&quot;yyyy-mm-dd\&quot;
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 待清理素材列表，单次最多支持100个
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams materialSource(FileVideoMaterialClearTaskCreateV2ClearTaskParamsMaterialSource materialSource) {
    
    this.materialSource = materialSource;
    return this;
  }

   /**
   * Get materialSource
   * @return materialSource
  **/
  @javax.annotation.Nonnull
  public FileVideoMaterialClearTaskCreateV2ClearTaskParamsMaterialSource getMaterialSource() {
    return materialSource;
  }


  public void setMaterialSource(FileVideoMaterialClearTaskCreateV2ClearTaskParamsMaterialSource materialSource) {
    this.materialSource = materialSource;
  }


  public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 数据统计开始时间\&quot;yyyy-mm-dd\&quot;
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoMaterialClearTaskCreateV2RequestClearTaskParams fileVideoMaterialClearTaskCreateV2RequestClearTaskParams = (FileVideoMaterialClearTaskCreateV2RequestClearTaskParams) o;
    return Objects.equals(this.clearMaterialTypes, fileVideoMaterialClearTaskCreateV2RequestClearTaskParams.clearMaterialTypes) &&
        Objects.equals(this.convert, fileVideoMaterialClearTaskCreateV2RequestClearTaskParams.convert) &&
        Objects.equals(this.cost, fileVideoMaterialClearTaskCreateV2RequestClearTaskParams.cost) &&
        Objects.equals(this.createTimeUpper, fileVideoMaterialClearTaskCreateV2RequestClearTaskParams.createTimeUpper) &&
        Objects.equals(this.endTime, fileVideoMaterialClearTaskCreateV2RequestClearTaskParams.endTime) &&
        Objects.equals(this.materialIds, fileVideoMaterialClearTaskCreateV2RequestClearTaskParams.materialIds) &&
        Objects.equals(this.materialSource, fileVideoMaterialClearTaskCreateV2RequestClearTaskParams.materialSource) &&
        Objects.equals(this.startTime, fileVideoMaterialClearTaskCreateV2RequestClearTaskParams.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearMaterialTypes, convert, cost, createTimeUpper, endTime, materialIds, materialSource, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVideoMaterialClearTaskCreateV2RequestClearTaskParams {\n");
    sb.append("    clearMaterialTypes: ").append(toIndentedString(clearMaterialTypes)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    createTimeUpper: ").append(toIndentedString(createTimeUpper)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    materialSource: ").append(toIndentedString(materialSource)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("clear_material_types");
    openapiFields.add("convert");
    openapiFields.add("cost");
    openapiFields.add("create_time_upper");
    openapiFields.add("end_time");
    openapiFields.add("material_ids");
    openapiFields.add("material_source");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_source");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoMaterialClearTaskCreateV2RequestClearTaskParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoMaterialClearTaskCreateV2RequestClearTaskParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoMaterialClearTaskCreateV2RequestClearTaskParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoMaterialClearTaskCreateV2RequestClearTaskParams.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoMaterialClearTaskCreateV2RequestClearTaskParams>() {
           @Override
           public void write(JsonWriter out, FileVideoMaterialClearTaskCreateV2RequestClearTaskParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoMaterialClearTaskCreateV2RequestClearTaskParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoMaterialClearTaskCreateV2RequestClearTaskParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoMaterialClearTaskCreateV2RequestClearTaskParams
  * @throws IOException if the JSON string is invalid with respect to FileVideoMaterialClearTaskCreateV2RequestClearTaskParams
  */
  public static FileVideoMaterialClearTaskCreateV2RequestClearTaskParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoMaterialClearTaskCreateV2RequestClearTaskParams.class);
  }

 /**
  * Convert an instance of FileVideoMaterialClearTaskCreateV2RequestClearTaskParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

