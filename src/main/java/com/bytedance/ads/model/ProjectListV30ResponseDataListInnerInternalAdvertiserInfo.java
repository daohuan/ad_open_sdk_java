/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectListV30DataListInternalAdvertiserInfoClassify;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class ProjectListV30ResponseDataListInnerInternalAdvertiserInfo {
  public static final String SERIALIZED_NAME_ADVERTISING_VOLUME = "advertising_volume";
  @SerializedName(SERIALIZED_NAME_ADVERTISING_VOLUME)
  private Long advertisingVolume = null;

  public static final String SERIALIZED_NAME_CLASSIFY = "classify";
  @SerializedName(SERIALIZED_NAME_CLASSIFY)
  private ProjectListV30DataListInternalAdvertiserInfoClassify classify = null;

  public static final String SERIALIZED_NAME_ITEM_NUMBER = "item_number";
  @SerializedName(SERIALIZED_NAME_ITEM_NUMBER)
  private String itemNumber = null;

  public ProjectListV30ResponseDataListInnerInternalAdvertiserInfo() {
  }

  public ProjectListV30ResponseDataListInnerInternalAdvertiserInfo advertisingVolume(Long advertisingVolume) {
    
    this.advertisingVolume = advertisingVolume;
    return this;
  }

   /**
   * 
   * @return advertisingVolume
  **/
  @javax.annotation.Nullable
  public Long getAdvertisingVolume() {
    return advertisingVolume;
  }


  public void setAdvertisingVolume(Long advertisingVolume) {
    this.advertisingVolume = advertisingVolume;
  }


  public ProjectListV30ResponseDataListInnerInternalAdvertiserInfo classify(ProjectListV30DataListInternalAdvertiserInfoClassify classify) {
    
    this.classify = classify;
    return this;
  }

   /**
   * Get classify
   * @return classify
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListInternalAdvertiserInfoClassify getClassify() {
    return classify;
  }


  public void setClassify(ProjectListV30DataListInternalAdvertiserInfoClassify classify) {
    this.classify = classify;
  }


  public ProjectListV30ResponseDataListInnerInternalAdvertiserInfo itemNumber(String itemNumber) {
    
    this.itemNumber = itemNumber;
    return this;
  }

   /**
   * 
   * @return itemNumber
  **/
  @javax.annotation.Nullable
  public String getItemNumber() {
    return itemNumber;
  }


  public void setItemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectListV30ResponseDataListInnerInternalAdvertiserInfo projectListV30ResponseDataListInnerInternalAdvertiserInfo = (ProjectListV30ResponseDataListInnerInternalAdvertiserInfo) o;
    return Objects.equals(this.advertisingVolume, projectListV30ResponseDataListInnerInternalAdvertiserInfo.advertisingVolume) &&
        Objects.equals(this.classify, projectListV30ResponseDataListInnerInternalAdvertiserInfo.classify) &&
        Objects.equals(this.itemNumber, projectListV30ResponseDataListInnerInternalAdvertiserInfo.itemNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertisingVolume, classify, itemNumber);
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
    sb.append("class ProjectListV30ResponseDataListInnerInternalAdvertiserInfo {\n");
    sb.append("    advertisingVolume: ").append(toIndentedString(advertisingVolume)).append("\n");
    sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
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
    openapiFields.add("advertising_volume");
    openapiFields.add("classify");
    openapiFields.add("item_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectListV30ResponseDataListInnerInternalAdvertiserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectListV30ResponseDataListInnerInternalAdvertiserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectListV30ResponseDataListInnerInternalAdvertiserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectListV30ResponseDataListInnerInternalAdvertiserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectListV30ResponseDataListInnerInternalAdvertiserInfo>() {
           @Override
           public void write(JsonWriter out, ProjectListV30ResponseDataListInnerInternalAdvertiserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectListV30ResponseDataListInnerInternalAdvertiserInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectListV30ResponseDataListInnerInternalAdvertiserInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectListV30ResponseDataListInnerInternalAdvertiserInfo
  * @throws IOException if the JSON string is invalid with respect to ProjectListV30ResponseDataListInnerInternalAdvertiserInfo
  */
  public static ProjectListV30ResponseDataListInnerInternalAdvertiserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectListV30ResponseDataListInnerInternalAdvertiserInfo.class);
  }

 /**
  * Convert an instance of ProjectListV30ResponseDataListInnerInternalAdvertiserInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

