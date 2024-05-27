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
 * FileVideoPauseV2ResponseDataMaterialClearResultValue
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class FileVideoPauseV2ResponseDataMaterialClearResultValue {
  public static final String SERIALIZED_NAME_CREATIVE_FAILURE_LIST = "creative_failure_list";
  @SerializedName(SERIALIZED_NAME_CREATIVE_FAILURE_LIST)
  private List<Long> creativeFailureList = null;

  public static final String SERIALIZED_NAME_CREATIVE_SUCCESS_LIST = "creative_success_list";
  @SerializedName(SERIALIZED_NAME_CREATIVE_SUCCESS_LIST)
  private List<Long> creativeSuccessList = null;

  public static final String SERIALIZED_NAME_IS_CLEARED = "is_cleared";
  @SerializedName(SERIALIZED_NAME_IS_CLEARED)
  private Boolean isCleared = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg = null;

  public static final String SERIALIZED_NAME_PROMOTION_FAILURE_LIST = "promotion_failure_list";
  @SerializedName(SERIALIZED_NAME_PROMOTION_FAILURE_LIST)
  private List<Long> promotionFailureList = null;

  public static final String SERIALIZED_NAME_PROMOTION_SUCCESS_LIST = "promotion_success_list";
  @SerializedName(SERIALIZED_NAME_PROMOTION_SUCCESS_LIST)
  private List<Long> promotionSuccessList = null;

  public FileVideoPauseV2ResponseDataMaterialClearResultValue() {
  }

  public FileVideoPauseV2ResponseDataMaterialClearResultValue creativeFailureList(List<Long> creativeFailureList) {
    
    this.creativeFailureList = creativeFailureList;
    return this;
  }

  public FileVideoPauseV2ResponseDataMaterialClearResultValue addCreativeFailureListItem(Long creativeFailureListItem) {
    if (this.creativeFailureList == null) {
      this.creativeFailureList = new ArrayList<>();
    }
    this.creativeFailureList.add(creativeFailureListItem);
    return this;
  }

   /**
   * 清理失败的使用该素材的创意ID
   * @return creativeFailureList
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeFailureList() {
    return creativeFailureList;
  }


  public void setCreativeFailureList(List<Long> creativeFailureList) {
    this.creativeFailureList = creativeFailureList;
  }


  public FileVideoPauseV2ResponseDataMaterialClearResultValue creativeSuccessList(List<Long> creativeSuccessList) {
    
    this.creativeSuccessList = creativeSuccessList;
    return this;
  }

  public FileVideoPauseV2ResponseDataMaterialClearResultValue addCreativeSuccessListItem(Long creativeSuccessListItem) {
    if (this.creativeSuccessList == null) {
      this.creativeSuccessList = new ArrayList<>();
    }
    this.creativeSuccessList.add(creativeSuccessListItem);
    return this;
  }

   /**
   * 清理成功的使用该素材的创意ID
   * @return creativeSuccessList
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeSuccessList() {
    return creativeSuccessList;
  }


  public void setCreativeSuccessList(List<Long> creativeSuccessList) {
    this.creativeSuccessList = creativeSuccessList;
  }


  public FileVideoPauseV2ResponseDataMaterialClearResultValue isCleared(Boolean isCleared) {
    
    this.isCleared = isCleared;
    return this;
  }

   /**
   * 素材是否被清理（存在内部错误导致素材没有被清理）
   * @return isCleared
  **/
  @javax.annotation.Nullable
  public Boolean getIsCleared() {
    return isCleared;
  }


  public void setIsCleared(Boolean isCleared) {
    this.isCleared = isCleared;
  }


  public FileVideoPauseV2ResponseDataMaterialClearResultValue materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材id
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileVideoPauseV2ResponseDataMaterialClearResultValue msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 素材未被清理原因
   * @return msg
  **/
  @javax.annotation.Nullable
  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public FileVideoPauseV2ResponseDataMaterialClearResultValue promotionFailureList(List<Long> promotionFailureList) {
    
    this.promotionFailureList = promotionFailureList;
    return this;
  }

  public FileVideoPauseV2ResponseDataMaterialClearResultValue addPromotionFailureListItem(Long promotionFailureListItem) {
    if (this.promotionFailureList == null) {
      this.promotionFailureList = new ArrayList<>();
    }
    this.promotionFailureList.add(promotionFailureListItem);
    return this;
  }

   /**
   * 清理失败的使用该素材的广告ID
   * @return promotionFailureList
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionFailureList() {
    return promotionFailureList;
  }


  public void setPromotionFailureList(List<Long> promotionFailureList) {
    this.promotionFailureList = promotionFailureList;
  }


  public FileVideoPauseV2ResponseDataMaterialClearResultValue promotionSuccessList(List<Long> promotionSuccessList) {
    
    this.promotionSuccessList = promotionSuccessList;
    return this;
  }

  public FileVideoPauseV2ResponseDataMaterialClearResultValue addPromotionSuccessListItem(Long promotionSuccessListItem) {
    if (this.promotionSuccessList == null) {
      this.promotionSuccessList = new ArrayList<>();
    }
    this.promotionSuccessList.add(promotionSuccessListItem);
    return this;
  }

   /**
   * 清理成功的使用该素材的广告ID
   * @return promotionSuccessList
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionSuccessList() {
    return promotionSuccessList;
  }


  public void setPromotionSuccessList(List<Long> promotionSuccessList) {
    this.promotionSuccessList = promotionSuccessList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoPauseV2ResponseDataMaterialClearResultValue fileVideoPauseV2ResponseDataMaterialClearResultValue = (FileVideoPauseV2ResponseDataMaterialClearResultValue) o;
    return Objects.equals(this.creativeFailureList, fileVideoPauseV2ResponseDataMaterialClearResultValue.creativeFailureList) &&
        Objects.equals(this.creativeSuccessList, fileVideoPauseV2ResponseDataMaterialClearResultValue.creativeSuccessList) &&
        Objects.equals(this.isCleared, fileVideoPauseV2ResponseDataMaterialClearResultValue.isCleared) &&
        Objects.equals(this.materialId, fileVideoPauseV2ResponseDataMaterialClearResultValue.materialId) &&
        Objects.equals(this.msg, fileVideoPauseV2ResponseDataMaterialClearResultValue.msg) &&
        Objects.equals(this.promotionFailureList, fileVideoPauseV2ResponseDataMaterialClearResultValue.promotionFailureList) &&
        Objects.equals(this.promotionSuccessList, fileVideoPauseV2ResponseDataMaterialClearResultValue.promotionSuccessList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeFailureList, creativeSuccessList, isCleared, materialId, msg, promotionFailureList, promotionSuccessList);
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
    sb.append("class FileVideoPauseV2ResponseDataMaterialClearResultValue {\n");
    sb.append("    creativeFailureList: ").append(toIndentedString(creativeFailureList)).append("\n");
    sb.append("    creativeSuccessList: ").append(toIndentedString(creativeSuccessList)).append("\n");
    sb.append("    isCleared: ").append(toIndentedString(isCleared)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    promotionFailureList: ").append(toIndentedString(promotionFailureList)).append("\n");
    sb.append("    promotionSuccessList: ").append(toIndentedString(promotionSuccessList)).append("\n");
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
    openapiFields.add("creative_failure_list");
    openapiFields.add("creative_success_list");
    openapiFields.add("is_cleared");
    openapiFields.add("material_id");
    openapiFields.add("msg");
    openapiFields.add("promotion_failure_list");
    openapiFields.add("promotion_success_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("is_cleared");
    openapiRequiredFields.add("material_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoPauseV2ResponseDataMaterialClearResultValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoPauseV2ResponseDataMaterialClearResultValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoPauseV2ResponseDataMaterialClearResultValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoPauseV2ResponseDataMaterialClearResultValue.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoPauseV2ResponseDataMaterialClearResultValue>() {
           @Override
           public void write(JsonWriter out, FileVideoPauseV2ResponseDataMaterialClearResultValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoPauseV2ResponseDataMaterialClearResultValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoPauseV2ResponseDataMaterialClearResultValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoPauseV2ResponseDataMaterialClearResultValue
  * @throws IOException if the JSON string is invalid with respect to FileVideoPauseV2ResponseDataMaterialClearResultValue
  */
  public static FileVideoPauseV2ResponseDataMaterialClearResultValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoPauseV2ResponseDataMaterialClearResultValue.class);
  }

 /**
  * Convert an instance of FileVideoPauseV2ResponseDataMaterialClearResultValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

