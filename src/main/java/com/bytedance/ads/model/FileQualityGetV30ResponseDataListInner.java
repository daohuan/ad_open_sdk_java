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
import com.bytedance.ads.model.FileQualityGetV30DataListStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * FileQualityGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class FileQualityGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ERRMSG = "errmsg";
  @SerializedName(SERIALIZED_NAME_ERRMSG)
  private String errmsg = null;

  public static final String SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL = "is_first_publish_material";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL)
  private Boolean isFirstPublishMaterial = null;

  public static final String SERIALIZED_NAME_IS_SIMILAR_EXPECTED_QUEUE_MATERIAL = "is_similar_expected_queue_material";
  @SerializedName(SERIALIZED_NAME_IS_SIMILAR_EXPECTED_QUEUE_MATERIAL)
  private Boolean isSimilarExpectedQueueMaterial = null;

  public static final String SERIALIZED_NAME_IS_SIMILAR_QUEUE_MATERIAL = "is_similar_queue_material";
  @SerializedName(SERIALIZED_NAME_IS_SIMILAR_QUEUE_MATERIAL)
  private Boolean isSimilarQueueMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FileQualityGetV30DataListStatus status = null;

  public FileQualityGetV30ResponseDataListInner() {
  }

  public FileQualityGetV30ResponseDataListInner errmsg(String errmsg) {
    
    this.errmsg = errmsg;
    return this;
  }

   /**
   * 
   * @return errmsg
  **/
  @javax.annotation.Nullable
  public String getErrmsg() {
    return errmsg;
  }


  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }


  public FileQualityGetV30ResponseDataListInner isFirstPublishMaterial(Boolean isFirstPublishMaterial) {
    
    this.isFirstPublishMaterial = isFirstPublishMaterial;
    return this;
  }

   /**
   * 是否是首发素材
   * @return isFirstPublishMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsFirstPublishMaterial() {
    return isFirstPublishMaterial;
  }


  public void setIsFirstPublishMaterial(Boolean isFirstPublishMaterial) {
    this.isFirstPublishMaterial = isFirstPublishMaterial;
  }


  public FileQualityGetV30ResponseDataListInner isSimilarExpectedQueueMaterial(Boolean isSimilarExpectedQueueMaterial) {
    
    this.isSimilarExpectedQueueMaterial = isSimilarExpectedQueueMaterial;
    return this;
  }

   /**
   * 是否同质化素材风险-未投放预计排队素材
   * @return isSimilarExpectedQueueMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsSimilarExpectedQueueMaterial() {
    return isSimilarExpectedQueueMaterial;
  }


  public void setIsSimilarExpectedQueueMaterial(Boolean isSimilarExpectedQueueMaterial) {
    this.isSimilarExpectedQueueMaterial = isSimilarExpectedQueueMaterial;
  }


  public FileQualityGetV30ResponseDataListInner isSimilarQueueMaterial(Boolean isSimilarQueueMaterial) {
    
    this.isSimilarQueueMaterial = isSimilarQueueMaterial;
    return this;
  }

   /**
   * 是否同质化素材风险-排队投放素材
   * @return isSimilarQueueMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsSimilarQueueMaterial() {
    return isSimilarQueueMaterial;
  }


  public void setIsSimilarQueueMaterial(Boolean isSimilarQueueMaterial) {
    this.isSimilarQueueMaterial = isSimilarQueueMaterial;
  }


  public FileQualityGetV30ResponseDataListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileQualityGetV30ResponseDataListInner status(FileQualityGetV30DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public FileQualityGetV30DataListStatus getStatus() {
    return status;
  }


  public void setStatus(FileQualityGetV30DataListStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileQualityGetV30ResponseDataListInner fileQualityGetV30ResponseDataListInner = (FileQualityGetV30ResponseDataListInner) o;
    return Objects.equals(this.errmsg, fileQualityGetV30ResponseDataListInner.errmsg) &&
        Objects.equals(this.isFirstPublishMaterial, fileQualityGetV30ResponseDataListInner.isFirstPublishMaterial) &&
        Objects.equals(this.isSimilarExpectedQueueMaterial, fileQualityGetV30ResponseDataListInner.isSimilarExpectedQueueMaterial) &&
        Objects.equals(this.isSimilarQueueMaterial, fileQualityGetV30ResponseDataListInner.isSimilarQueueMaterial) &&
        Objects.equals(this.materialId, fileQualityGetV30ResponseDataListInner.materialId) &&
        Objects.equals(this.status, fileQualityGetV30ResponseDataListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errmsg, isFirstPublishMaterial, isSimilarExpectedQueueMaterial, isSimilarQueueMaterial, materialId, status);
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
    sb.append("class FileQualityGetV30ResponseDataListInner {\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    isFirstPublishMaterial: ").append(toIndentedString(isFirstPublishMaterial)).append("\n");
    sb.append("    isSimilarExpectedQueueMaterial: ").append(toIndentedString(isSimilarExpectedQueueMaterial)).append("\n");
    sb.append("    isSimilarQueueMaterial: ").append(toIndentedString(isSimilarQueueMaterial)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("errmsg");
    openapiFields.add("is_first_publish_material");
    openapiFields.add("is_similar_expected_queue_material");
    openapiFields.add("is_similar_queue_material");
    openapiFields.add("material_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errmsg");
    openapiRequiredFields.add("material_id");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileQualityGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileQualityGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileQualityGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileQualityGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileQualityGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, FileQualityGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileQualityGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileQualityGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileQualityGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to FileQualityGetV30ResponseDataListInner
  */
  public static FileQualityGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileQualityGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of FileQualityGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

