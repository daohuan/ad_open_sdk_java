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
import com.bytedance.ads.model.ToolsLiveAuthorizeListV2DataListStatus;
import com.bytedance.ads.model.ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner;
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
 * ToolsLiveAuthorizeListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class ToolsLiveAuthorizeListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTHORIZE_END_TIME = "authorize_end_time";
  @SerializedName(SERIALIZED_NAME_AUTHORIZE_END_TIME)
  private String authorizeEndTime = null;

  public static final String SERIALIZED_NAME_AUTHORIZE_START_TIME = "authorize_start_time";
  @SerializedName(SERIALIZED_NAME_AUTHORIZE_START_TIME)
  private String authorizeStartTime = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_IES_ID = "ies_id";
  @SerializedName(SERIALIZED_NAME_IES_ID)
  private String iesId = null;

  public static final String SERIALIZED_NAME_IES_USER_NAME = "ies_user_name";
  @SerializedName(SERIALIZED_NAME_IES_USER_NAME)
  private String iesUserName = null;

  public static final String SERIALIZED_NAME_LIMITED_PROMOTION_TYPES = "limited_promotion_types";
  @SerializedName(SERIALIZED_NAME_LIMITED_PROMOTION_TYPES)
  private List<ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner> limitedPromotionTypes = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsLiveAuthorizeListV2DataListStatus status = null;

  public ToolsLiveAuthorizeListV2ResponseDataListInner() {
  }

  public ToolsLiveAuthorizeListV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsLiveAuthorizeListV2ResponseDataListInner authorizeEndTime(String authorizeEndTime) {
    
    this.authorizeEndTime = authorizeEndTime;
    return this;
  }

   /**
   * 
   * @return authorizeEndTime
  **/
  @javax.annotation.Nullable
  public String getAuthorizeEndTime() {
    return authorizeEndTime;
  }


  public void setAuthorizeEndTime(String authorizeEndTime) {
    this.authorizeEndTime = authorizeEndTime;
  }


  public ToolsLiveAuthorizeListV2ResponseDataListInner authorizeStartTime(String authorizeStartTime) {
    
    this.authorizeStartTime = authorizeStartTime;
    return this;
  }

   /**
   * 
   * @return authorizeStartTime
  **/
  @javax.annotation.Nullable
  public String getAuthorizeStartTime() {
    return authorizeStartTime;
  }


  public void setAuthorizeStartTime(String authorizeStartTime) {
    this.authorizeStartTime = authorizeStartTime;
  }


  public ToolsLiveAuthorizeListV2ResponseDataListInner createTime(String createTime) {
    
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


  public ToolsLiveAuthorizeListV2ResponseDataListInner iesId(String iesId) {
    
    this.iesId = iesId;
    return this;
  }

   /**
   * 
   * @return iesId
  **/
  @javax.annotation.Nullable
  public String getIesId() {
    return iesId;
  }


  public void setIesId(String iesId) {
    this.iesId = iesId;
  }


  public ToolsLiveAuthorizeListV2ResponseDataListInner iesUserName(String iesUserName) {
    
    this.iesUserName = iesUserName;
    return this;
  }

   /**
   * 
   * @return iesUserName
  **/
  @javax.annotation.Nullable
  public String getIesUserName() {
    return iesUserName;
  }


  public void setIesUserName(String iesUserName) {
    this.iesUserName = iesUserName;
  }


  public ToolsLiveAuthorizeListV2ResponseDataListInner limitedPromotionTypes(List<ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner> limitedPromotionTypes) {
    
    this.limitedPromotionTypes = limitedPromotionTypes;
    return this;
  }

  public ToolsLiveAuthorizeListV2ResponseDataListInner addLimitedPromotionTypesItem(ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner limitedPromotionTypesItem) {
    if (this.limitedPromotionTypes == null) {
      this.limitedPromotionTypes = new ArrayList<>();
    }
    this.limitedPromotionTypes.add(limitedPromotionTypesItem);
    return this;
  }

   /**
   * 
   * @return limitedPromotionTypes
  **/
  @javax.annotation.Nullable
  public List<ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner> getLimitedPromotionTypes() {
    return limitedPromotionTypes;
  }


  public void setLimitedPromotionTypes(List<ToolsLiveAuthorizeListV2ResponseDataListInnerLimitedPromotionTypesInner> limitedPromotionTypes) {
    this.limitedPromotionTypes = limitedPromotionTypes;
  }


  public ToolsLiveAuthorizeListV2ResponseDataListInner status(ToolsLiveAuthorizeListV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsLiveAuthorizeListV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsLiveAuthorizeListV2DataListStatus status) {
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
    ToolsLiveAuthorizeListV2ResponseDataListInner toolsLiveAuthorizeListV2ResponseDataListInner = (ToolsLiveAuthorizeListV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, toolsLiveAuthorizeListV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.authorizeEndTime, toolsLiveAuthorizeListV2ResponseDataListInner.authorizeEndTime) &&
        Objects.equals(this.authorizeStartTime, toolsLiveAuthorizeListV2ResponseDataListInner.authorizeStartTime) &&
        Objects.equals(this.createTime, toolsLiveAuthorizeListV2ResponseDataListInner.createTime) &&
        Objects.equals(this.iesId, toolsLiveAuthorizeListV2ResponseDataListInner.iesId) &&
        Objects.equals(this.iesUserName, toolsLiveAuthorizeListV2ResponseDataListInner.iesUserName) &&
        Objects.equals(this.limitedPromotionTypes, toolsLiveAuthorizeListV2ResponseDataListInner.limitedPromotionTypes) &&
        Objects.equals(this.status, toolsLiveAuthorizeListV2ResponseDataListInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, authorizeEndTime, authorizeStartTime, createTime, iesId, iesUserName, limitedPromotionTypes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLiveAuthorizeListV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    authorizeEndTime: ").append(toIndentedString(authorizeEndTime)).append("\n");
    sb.append("    authorizeStartTime: ").append(toIndentedString(authorizeStartTime)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    iesId: ").append(toIndentedString(iesId)).append("\n");
    sb.append("    iesUserName: ").append(toIndentedString(iesUserName)).append("\n");
    sb.append("    limitedPromotionTypes: ").append(toIndentedString(limitedPromotionTypes)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("authorize_end_time");
    openapiFields.add("authorize_start_time");
    openapiFields.add("create_time");
    openapiFields.add("ies_id");
    openapiFields.add("ies_user_name");
    openapiFields.add("limited_promotion_types");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLiveAuthorizeListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLiveAuthorizeListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLiveAuthorizeListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLiveAuthorizeListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLiveAuthorizeListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsLiveAuthorizeListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLiveAuthorizeListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLiveAuthorizeListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLiveAuthorizeListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsLiveAuthorizeListV2ResponseDataListInner
  */
  public static ToolsLiveAuthorizeListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLiveAuthorizeListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsLiveAuthorizeListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

