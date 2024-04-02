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
import com.bytedance.ads.model.ToolsAipThirdSiteGetV2DataAuditStatus;
import com.bytedance.ads.model.ToolsAipThirdSiteGetV2DataValidateStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ToolsAipThirdSiteGetV2ResponseData {
  public static final String SERIALIZED_NAME_ADVERISER_ID = "adveriser_id";
  @SerializedName(SERIALIZED_NAME_ADVERISER_ID)
  private Long adveriserId = null;

  public static final String SERIALIZED_NAME_AUDIT_MESSAGE = "audit_message";
  @SerializedName(SERIALIZED_NAME_AUDIT_MESSAGE)
  private String auditMessage = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private ToolsAipThirdSiteGetV2DataAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Long siteId = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_VALIDATE_MESSAGE = "validate_message";
  @SerializedName(SERIALIZED_NAME_VALIDATE_MESSAGE)
  private String validateMessage = null;

  public static final String SERIALIZED_NAME_VALIDATE_STATUS = "validate_status";
  @SerializedName(SERIALIZED_NAME_VALIDATE_STATUS)
  private ToolsAipThirdSiteGetV2DataValidateStatus validateStatus = null;

  public ToolsAipThirdSiteGetV2ResponseData() {
  }

  public ToolsAipThirdSiteGetV2ResponseData adveriserId(Long adveriserId) {
    
    this.adveriserId = adveriserId;
    return this;
  }

   /**
   * 广告主id
   * @return adveriserId
  **/
  @javax.annotation.Nullable
  public Long getAdveriserId() {
    return adveriserId;
  }


  public void setAdveriserId(Long adveriserId) {
    this.adveriserId = adveriserId;
  }


  public ToolsAipThirdSiteGetV2ResponseData auditMessage(String auditMessage) {
    
    this.auditMessage = auditMessage;
    return this;
  }

   /**
   * 站点审核信息
   * @return auditMessage
  **/
  @javax.annotation.Nullable
  public String getAuditMessage() {
    return auditMessage;
  }


  public void setAuditMessage(String auditMessage) {
    this.auditMessage = auditMessage;
  }


  public ToolsAipThirdSiteGetV2ResponseData auditStatus(ToolsAipThirdSiteGetV2DataAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public ToolsAipThirdSiteGetV2DataAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(ToolsAipThirdSiteGetV2DataAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public ToolsAipThirdSiteGetV2ResponseData createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 站点创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsAipThirdSiteGetV2ResponseData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 站点名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsAipThirdSiteGetV2ResponseData siteId(Long siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 站点id
   * @return siteId
  **/
  @javax.annotation.Nullable
  public Long getSiteId() {
    return siteId;
  }


  public void setSiteId(Long siteId) {
    this.siteId = siteId;
  }


  public ToolsAipThirdSiteGetV2ResponseData updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 站点更新时间
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public ToolsAipThirdSiteGetV2ResponseData url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 站点URL
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ToolsAipThirdSiteGetV2ResponseData validateMessage(String validateMessage) {
    
    this.validateMessage = validateMessage;
    return this;
  }

   /**
   * 站点标准化校验失败信息
   * @return validateMessage
  **/
  @javax.annotation.Nullable
  public String getValidateMessage() {
    return validateMessage;
  }


  public void setValidateMessage(String validateMessage) {
    this.validateMessage = validateMessage;
  }


  public ToolsAipThirdSiteGetV2ResponseData validateStatus(ToolsAipThirdSiteGetV2DataValidateStatus validateStatus) {
    
    this.validateStatus = validateStatus;
    return this;
  }

   /**
   * Get validateStatus
   * @return validateStatus
  **/
  @javax.annotation.Nullable
  public ToolsAipThirdSiteGetV2DataValidateStatus getValidateStatus() {
    return validateStatus;
  }


  public void setValidateStatus(ToolsAipThirdSiteGetV2DataValidateStatus validateStatus) {
    this.validateStatus = validateStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAipThirdSiteGetV2ResponseData toolsAipThirdSiteGetV2ResponseData = (ToolsAipThirdSiteGetV2ResponseData) o;
    return Objects.equals(this.adveriserId, toolsAipThirdSiteGetV2ResponseData.adveriserId) &&
        Objects.equals(this.auditMessage, toolsAipThirdSiteGetV2ResponseData.auditMessage) &&
        Objects.equals(this.auditStatus, toolsAipThirdSiteGetV2ResponseData.auditStatus) &&
        Objects.equals(this.createTime, toolsAipThirdSiteGetV2ResponseData.createTime) &&
        Objects.equals(this.name, toolsAipThirdSiteGetV2ResponseData.name) &&
        Objects.equals(this.siteId, toolsAipThirdSiteGetV2ResponseData.siteId) &&
        Objects.equals(this.updateTime, toolsAipThirdSiteGetV2ResponseData.updateTime) &&
        Objects.equals(this.url, toolsAipThirdSiteGetV2ResponseData.url) &&
        Objects.equals(this.validateMessage, toolsAipThirdSiteGetV2ResponseData.validateMessage) &&
        Objects.equals(this.validateStatus, toolsAipThirdSiteGetV2ResponseData.validateStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adveriserId, auditMessage, auditStatus, createTime, name, siteId, updateTime, url, validateMessage, validateStatus);
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
    sb.append("class ToolsAipThirdSiteGetV2ResponseData {\n");
    sb.append("    adveriserId: ").append(toIndentedString(adveriserId)).append("\n");
    sb.append("    auditMessage: ").append(toIndentedString(auditMessage)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    validateMessage: ").append(toIndentedString(validateMessage)).append("\n");
    sb.append("    validateStatus: ").append(toIndentedString(validateStatus)).append("\n");
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
    openapiFields.add("adveriser_id");
    openapiFields.add("audit_message");
    openapiFields.add("audit_status");
    openapiFields.add("create_time");
    openapiFields.add("name");
    openapiFields.add("site_id");
    openapiFields.add("update_time");
    openapiFields.add("url");
    openapiFields.add("validate_message");
    openapiFields.add("validate_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAipThirdSiteGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAipThirdSiteGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAipThirdSiteGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAipThirdSiteGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAipThirdSiteGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAipThirdSiteGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAipThirdSiteGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAipThirdSiteGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAipThirdSiteGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAipThirdSiteGetV2ResponseData
  */
  public static ToolsAipThirdSiteGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAipThirdSiteGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAipThirdSiteGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

