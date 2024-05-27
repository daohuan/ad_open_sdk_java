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
import com.bytedance.ads.model.NativeAnchorGetV30DataListAnchorShareType;
import com.bytedance.ads.model.NativeAnchorGetV30DataListAnchorType;
import com.bytedance.ads.model.NativeAnchorGetV30DataListSource;
import com.bytedance.ads.model.NativeAnchorGetV30DataListStatus;
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
 * NativeAnchorGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class NativeAnchorGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_NAME = "anchor_name";
  @SerializedName(SERIALIZED_NAME_ANCHOR_NAME)
  private String anchorName = null;

  public static final String SERIALIZED_NAME_ANCHOR_SHARE_TYPE = "anchor_share_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_SHARE_TYPE)
  private NativeAnchorGetV30DataListAnchorShareType anchorShareType = null;

  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private NativeAnchorGetV30DataListAnchorType anchorType = null;

  public static final String SERIALIZED_NAME_ANDROID_PACKAGE_NAME = "android_package_name";
  @SerializedName(SERIALIZED_NAME_ANDROID_PACKAGE_NAME)
  private String androidPackageName = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_IOS_PACKAGE_NAME = "ios_package_name";
  @SerializedName(SERIALIZED_NAME_IOS_PACKAGE_NAME)
  private String iosPackageName = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private NativeAnchorGetV30DataListSource source = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private NativeAnchorGetV30DataListStatus status = null;

  public NativeAnchorGetV30ResponseDataListInner() {
  }

  public NativeAnchorGetV30ResponseDataListInner anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public NativeAnchorGetV30ResponseDataListInner anchorName(String anchorName) {
    
    this.anchorName = anchorName;
    return this;
  }

   /**
   * 
   * @return anchorName
  **/
  @javax.annotation.Nullable
  public String getAnchorName() {
    return anchorName;
  }


  public void setAnchorName(String anchorName) {
    this.anchorName = anchorName;
  }


  public NativeAnchorGetV30ResponseDataListInner anchorShareType(NativeAnchorGetV30DataListAnchorShareType anchorShareType) {
    
    this.anchorShareType = anchorShareType;
    return this;
  }

   /**
   * Get anchorShareType
   * @return anchorShareType
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetV30DataListAnchorShareType getAnchorShareType() {
    return anchorShareType;
  }


  public void setAnchorShareType(NativeAnchorGetV30DataListAnchorShareType anchorShareType) {
    this.anchorShareType = anchorShareType;
  }


  public NativeAnchorGetV30ResponseDataListInner anchorType(NativeAnchorGetV30DataListAnchorType anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

   /**
   * Get anchorType
   * @return anchorType
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetV30DataListAnchorType getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(NativeAnchorGetV30DataListAnchorType anchorType) {
    this.anchorType = anchorType;
  }


  public NativeAnchorGetV30ResponseDataListInner androidPackageName(String androidPackageName) {
    
    this.androidPackageName = androidPackageName;
    return this;
  }

   /**
   * 
   * @return androidPackageName
  **/
  @javax.annotation.Nullable
  public String getAndroidPackageName() {
    return androidPackageName;
  }


  public void setAndroidPackageName(String androidPackageName) {
    this.androidPackageName = androidPackageName;
  }


  public NativeAnchorGetV30ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public NativeAnchorGetV30ResponseDataListInner iosPackageName(String iosPackageName) {
    
    this.iosPackageName = iosPackageName;
    return this;
  }

   /**
   * 
   * @return iosPackageName
  **/
  @javax.annotation.Nullable
  public String getIosPackageName() {
    return iosPackageName;
  }


  public void setIosPackageName(String iosPackageName) {
    this.iosPackageName = iosPackageName;
  }


  public NativeAnchorGetV30ResponseDataListInner source(NativeAnchorGetV30DataListSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetV30DataListSource getSource() {
    return source;
  }


  public void setSource(NativeAnchorGetV30DataListSource source) {
    this.source = source;
  }


  public NativeAnchorGetV30ResponseDataListInner status(NativeAnchorGetV30DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetV30DataListStatus getStatus() {
    return status;
  }


  public void setStatus(NativeAnchorGetV30DataListStatus status) {
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
    NativeAnchorGetV30ResponseDataListInner nativeAnchorGetV30ResponseDataListInner = (NativeAnchorGetV30ResponseDataListInner) o;
    return Objects.equals(this.anchorId, nativeAnchorGetV30ResponseDataListInner.anchorId) &&
        Objects.equals(this.anchorName, nativeAnchorGetV30ResponseDataListInner.anchorName) &&
        Objects.equals(this.anchorShareType, nativeAnchorGetV30ResponseDataListInner.anchorShareType) &&
        Objects.equals(this.anchorType, nativeAnchorGetV30ResponseDataListInner.anchorType) &&
        Objects.equals(this.androidPackageName, nativeAnchorGetV30ResponseDataListInner.androidPackageName) &&
        Objects.equals(this.createTime, nativeAnchorGetV30ResponseDataListInner.createTime) &&
        Objects.equals(this.iosPackageName, nativeAnchorGetV30ResponseDataListInner.iosPackageName) &&
        Objects.equals(this.source, nativeAnchorGetV30ResponseDataListInner.source) &&
        Objects.equals(this.status, nativeAnchorGetV30ResponseDataListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorId, anchorName, anchorShareType, anchorType, androidPackageName, createTime, iosPackageName, source, status);
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
    sb.append("class NativeAnchorGetV30ResponseDataListInner {\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorName: ").append(toIndentedString(anchorName)).append("\n");
    sb.append("    anchorShareType: ").append(toIndentedString(anchorShareType)).append("\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
    sb.append("    androidPackageName: ").append(toIndentedString(androidPackageName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    iosPackageName: ").append(toIndentedString(iosPackageName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_name");
    openapiFields.add("anchor_share_type");
    openapiFields.add("anchor_type");
    openapiFields.add("android_package_name");
    openapiFields.add("create_time");
    openapiFields.add("ios_package_name");
    openapiFields.add("source");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetV30ResponseDataListInner
  */
  public static NativeAnchorGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of NativeAnchorGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

