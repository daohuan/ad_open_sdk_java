/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponCodeGetV2DataListStatus;
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
 * ClueCouponCodeGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class ClueCouponCodeGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private Long activityId = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code = null;

  public static final String SERIALIZED_NAME_CODE_ID = "code_id";
  @SerializedName(SERIALIZED_NAME_CODE_ID)
  private String codeId = null;

  public static final String SERIALIZED_NAME_COUPON_ID = "coupon_id";
  @SerializedName(SERIALIZED_NAME_COUPON_ID)
  private Long couponId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Long resourceId = null;

  public static final String SERIALIZED_NAME_RESOURCE_TITLE = "resource_title";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TITLE)
  private String resourceTitle = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ClueCouponCodeGetV2DataListStatus status = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public static final String SERIALIZED_NAME_VALID_END = "valid_end";
  @SerializedName(SERIALIZED_NAME_VALID_END)
  private String validEnd = null;

  public static final String SERIALIZED_NAME_VALID_START = "valid_start";
  @SerializedName(SERIALIZED_NAME_VALID_START)
  private String validStart = null;

  public ClueCouponCodeGetV2ResponseDataListInner() {
  }

  public ClueCouponCodeGetV2ResponseDataListInner activityId(Long activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 
   * @return activityId
  **/
  @javax.annotation.Nullable
  public Long getActivityId() {
    return activityId;
  }


  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  public ClueCouponCodeGetV2ResponseDataListInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ClueCouponCodeGetV2ResponseDataListInner codeId(String codeId) {
    
    this.codeId = codeId;
    return this;
  }

   /**
   * 
   * @return codeId
  **/
  @javax.annotation.Nullable
  public String getCodeId() {
    return codeId;
  }


  public void setCodeId(String codeId) {
    this.codeId = codeId;
  }


  public ClueCouponCodeGetV2ResponseDataListInner couponId(Long couponId) {
    
    this.couponId = couponId;
    return this;
  }

   /**
   * 
   * @return couponId
  **/
  @javax.annotation.Nullable
  public Long getCouponId() {
    return couponId;
  }


  public void setCouponId(Long couponId) {
    this.couponId = couponId;
  }


  public ClueCouponCodeGetV2ResponseDataListInner createTime(String createTime) {
    
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


  public ClueCouponCodeGetV2ResponseDataListInner resourceId(Long resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * 
   * @return resourceId
  **/
  @javax.annotation.Nullable
  public Long getResourceId() {
    return resourceId;
  }


  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }


  public ClueCouponCodeGetV2ResponseDataListInner resourceTitle(String resourceTitle) {
    
    this.resourceTitle = resourceTitle;
    return this;
  }

   /**
   * 
   * @return resourceTitle
  **/
  @javax.annotation.Nullable
  public String getResourceTitle() {
    return resourceTitle;
  }


  public void setResourceTitle(String resourceTitle) {
    this.resourceTitle = resourceTitle;
  }


  public ClueCouponCodeGetV2ResponseDataListInner status(ClueCouponCodeGetV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ClueCouponCodeGetV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ClueCouponCodeGetV2DataListStatus status) {
    this.status = status;
  }


  public ClueCouponCodeGetV2ResponseDataListInner updateTime(String updateTime) {
    
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


  public ClueCouponCodeGetV2ResponseDataListInner validEnd(String validEnd) {
    
    this.validEnd = validEnd;
    return this;
  }

   /**
   * 
   * @return validEnd
  **/
  @javax.annotation.Nullable
  public String getValidEnd() {
    return validEnd;
  }


  public void setValidEnd(String validEnd) {
    this.validEnd = validEnd;
  }


  public ClueCouponCodeGetV2ResponseDataListInner validStart(String validStart) {
    
    this.validStart = validStart;
    return this;
  }

   /**
   * 
   * @return validStart
  **/
  @javax.annotation.Nullable
  public String getValidStart() {
    return validStart;
  }


  public void setValidStart(String validStart) {
    this.validStart = validStart;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponCodeGetV2ResponseDataListInner clueCouponCodeGetV2ResponseDataListInner = (ClueCouponCodeGetV2ResponseDataListInner) o;
    return Objects.equals(this.activityId, clueCouponCodeGetV2ResponseDataListInner.activityId) &&
        Objects.equals(this.code, clueCouponCodeGetV2ResponseDataListInner.code) &&
        Objects.equals(this.codeId, clueCouponCodeGetV2ResponseDataListInner.codeId) &&
        Objects.equals(this.couponId, clueCouponCodeGetV2ResponseDataListInner.couponId) &&
        Objects.equals(this.createTime, clueCouponCodeGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.resourceId, clueCouponCodeGetV2ResponseDataListInner.resourceId) &&
        Objects.equals(this.resourceTitle, clueCouponCodeGetV2ResponseDataListInner.resourceTitle) &&
        Objects.equals(this.status, clueCouponCodeGetV2ResponseDataListInner.status) &&
        Objects.equals(this.updateTime, clueCouponCodeGetV2ResponseDataListInner.updateTime) &&
        Objects.equals(this.validEnd, clueCouponCodeGetV2ResponseDataListInner.validEnd) &&
        Objects.equals(this.validStart, clueCouponCodeGetV2ResponseDataListInner.validStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, code, codeId, couponId, createTime, resourceId, resourceTitle, status, updateTime, validEnd, validStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponCodeGetV2ResponseDataListInner {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeId: ").append(toIndentedString(codeId)).append("\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceTitle: ").append(toIndentedString(resourceTitle)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    validEnd: ").append(toIndentedString(validEnd)).append("\n");
    sb.append("    validStart: ").append(toIndentedString(validStart)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("code");
    openapiFields.add("code_id");
    openapiFields.add("coupon_id");
    openapiFields.add("create_time");
    openapiFields.add("resource_id");
    openapiFields.add("resource_title");
    openapiFields.add("status");
    openapiFields.add("update_time");
    openapiFields.add("valid_end");
    openapiFields.add("valid_start");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponCodeGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponCodeGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponCodeGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponCodeGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponCodeGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ClueCouponCodeGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponCodeGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponCodeGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponCodeGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ClueCouponCodeGetV2ResponseDataListInner
  */
  public static ClueCouponCodeGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponCodeGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ClueCouponCodeGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

