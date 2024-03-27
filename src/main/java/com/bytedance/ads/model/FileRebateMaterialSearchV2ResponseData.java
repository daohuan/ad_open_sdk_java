/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileRebateMaterialSearchV2ResponseDataCursorInfo;
import com.bytedance.ads.model.FileRebateMaterialSearchV2ResponseDataMaterialsInner;
import com.bytedance.ads.model.FileRebateMaterialSearchV2ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class FileRebateMaterialSearchV2ResponseData {
  public static final String SERIALIZED_NAME_CURSOR_INFO = "cursor_info";
  @SerializedName(SERIALIZED_NAME_CURSOR_INFO)
  private FileRebateMaterialSearchV2ResponseDataCursorInfo cursorInfo = null;

  public static final String SERIALIZED_NAME_MATERIALS = "materials";
  @SerializedName(SERIALIZED_NAME_MATERIALS)
  private List<FileRebateMaterialSearchV2ResponseDataMaterialsInner> materials = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private FileRebateMaterialSearchV2ResponseDataPageInfo pageInfo = null;

  public FileRebateMaterialSearchV2ResponseData() {
  }

  public FileRebateMaterialSearchV2ResponseData cursorInfo(FileRebateMaterialSearchV2ResponseDataCursorInfo cursorInfo) {
    
    this.cursorInfo = cursorInfo;
    return this;
  }

   /**
   * Get cursorInfo
   * @return cursorInfo
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialSearchV2ResponseDataCursorInfo getCursorInfo() {
    return cursorInfo;
  }


  public void setCursorInfo(FileRebateMaterialSearchV2ResponseDataCursorInfo cursorInfo) {
    this.cursorInfo = cursorInfo;
  }


  public FileRebateMaterialSearchV2ResponseData materials(List<FileRebateMaterialSearchV2ResponseDataMaterialsInner> materials) {
    
    this.materials = materials;
    return this;
  }

  public FileRebateMaterialSearchV2ResponseData addMaterialsItem(FileRebateMaterialSearchV2ResponseDataMaterialsInner materialsItem) {
    if (this.materials == null) {
      this.materials = new ArrayList<>();
    }
    this.materials.add(materialsItem);
    return this;
  }

   /**
   * 
   * @return materials
  **/
  @javax.annotation.Nullable
  public List<FileRebateMaterialSearchV2ResponseDataMaterialsInner> getMaterials() {
    return materials;
  }


  public void setMaterials(List<FileRebateMaterialSearchV2ResponseDataMaterialsInner> materials) {
    this.materials = materials;
  }


  public FileRebateMaterialSearchV2ResponseData pageInfo(FileRebateMaterialSearchV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialSearchV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(FileRebateMaterialSearchV2ResponseDataPageInfo pageInfo) {
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
    FileRebateMaterialSearchV2ResponseData fileRebateMaterialSearchV2ResponseData = (FileRebateMaterialSearchV2ResponseData) o;
    return Objects.equals(this.cursorInfo, fileRebateMaterialSearchV2ResponseData.cursorInfo) &&
        Objects.equals(this.materials, fileRebateMaterialSearchV2ResponseData.materials) &&
        Objects.equals(this.pageInfo, fileRebateMaterialSearchV2ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorInfo, materials, pageInfo);
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
    sb.append("class FileRebateMaterialSearchV2ResponseData {\n");
    sb.append("    cursorInfo: ").append(toIndentedString(cursorInfo)).append("\n");
    sb.append("    materials: ").append(toIndentedString(materials)).append("\n");
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
    openapiFields.add("cursor_info");
    openapiFields.add("materials");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateMaterialSearchV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateMaterialSearchV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateMaterialSearchV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateMaterialSearchV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateMaterialSearchV2ResponseData>() {
           @Override
           public void write(JsonWriter out, FileRebateMaterialSearchV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateMaterialSearchV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateMaterialSearchV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateMaterialSearchV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to FileRebateMaterialSearchV2ResponseData
  */
  public static FileRebateMaterialSearchV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateMaterialSearchV2ResponseData.class);
  }

 /**
  * Convert an instance of FileRebateMaterialSearchV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

