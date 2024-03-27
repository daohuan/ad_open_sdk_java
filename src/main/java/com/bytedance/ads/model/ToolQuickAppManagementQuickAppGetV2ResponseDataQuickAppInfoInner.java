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
import com.bytedance.ads.model.ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus;
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
 * ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_HOMEPAGE_URL = "homepage_url";
  @SerializedName(SERIALIZED_NAME_HOMEPAGE_URL)
  private String homepageUrl = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName = null;

  public static final String SERIALIZED_NAME_QUICK_APP_ID = "quick_app_id";
  @SerializedName(SERIALIZED_NAME_QUICK_APP_ID)
  private Long quickAppId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus status = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner() {
  }

  public ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner createTime(String createTime) {
    
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


  public ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner homepageUrl(String homepageUrl) {
    
    this.homepageUrl = homepageUrl;
    return this;
  }

   /**
   * 
   * @return homepageUrl
  **/
  @javax.annotation.Nullable
  public String getHomepageUrl() {
    return homepageUrl;
  }


  public void setHomepageUrl(String homepageUrl) {
    this.homepageUrl = homepageUrl;
  }


  public ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 
   * @return packageName
  **/
  @javax.annotation.Nullable
  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner quickAppId(Long quickAppId) {
    
    this.quickAppId = quickAppId;
    return this;
  }

   /**
   * 
   * @return quickAppId
  **/
  @javax.annotation.Nullable
  public Long getQuickAppId() {
    return quickAppId;
  }


  public void setQuickAppId(Long quickAppId) {
    this.quickAppId = quickAppId;
  }


  public ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner status(ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus getStatus() {
    return status;
  }


  public void setStatus(ToolQuickAppManagementQuickAppGetV2DataQuickAppInfoStatus status) {
    this.status = status;
  }


  public ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner toolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner = (ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner) o;
    return Objects.equals(this.createTime, toolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.createTime) &&
        Objects.equals(this.homepageUrl, toolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.homepageUrl) &&
        Objects.equals(this.name, toolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.name) &&
        Objects.equals(this.packageName, toolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.packageName) &&
        Objects.equals(this.quickAppId, toolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.quickAppId) &&
        Objects.equals(this.status, toolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.status) &&
        Objects.equals(this.updateTime, toolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, homepageUrl, name, packageName, quickAppId, status, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    homepageUrl: ").append(toIndentedString(homepageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    quickAppId: ").append(toIndentedString(quickAppId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("homepage_url");
    openapiFields.add("name");
    openapiFields.add("package_name");
    openapiFields.add("quick_app_id");
    openapiFields.add("status");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("create_time");
    openapiRequiredFields.add("homepage_url");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("package_name");
    openapiRequiredFields.add("quick_app_id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("update_time");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner>() {
           @Override
           public void write(JsonWriter out, ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner
  * @throws IOException if the JSON string is invalid with respect to ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner
  */
  public static ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner.class);
  }

 /**
  * Convert an instance of ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

