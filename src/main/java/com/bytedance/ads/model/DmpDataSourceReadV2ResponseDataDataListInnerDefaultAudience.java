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
import com.bytedance.ads.model.DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CALCULATE_SUB_TYPE = "calculate_sub_type";
  @SerializedName(SERIALIZED_NAME_CALCULATE_SUB_TYPE)
  private Long calculateSubType = null;

  public static final String SERIALIZED_NAME_CALCULATE_TYPE = "calculate_type";
  @SerializedName(SERIALIZED_NAME_CALCULATE_TYPE)
  private Long calculateType = null;

  public static final String SERIALIZED_NAME_COVER_NUM = "cover_num";
  @SerializedName(SERIALIZED_NAME_COVER_NUM)
  private Long coverNum = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CUSTOM_AUDIENCE_ID = "custom_audience_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AUDIENCE_ID)
  private Long customAudienceId = null;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private Long customType = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE_ID = "data_source_id";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_ID)
  private String dataSourceId = null;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "delivery_status";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus deliveryStatus = null;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiry_date";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private String expiryDate = null;

  public static final String SERIALIZED_NAME_ISDEL = "isdel";
  @SerializedName(SERIALIZED_NAME_ISDEL)
  private Long isdel = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PUSH_STATUS = "push_status";
  @SerializedName(SERIALIZED_NAME_PUSH_STATUS)
  private Long pushStatus = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Long source = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag = null;

  public static final String SERIALIZED_NAME_THIRD_PARTY_INFO = "third_party_info";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_INFO)
  private String thirdPartyInfo = null;

  public static final String SERIALIZED_NAME_UPLOAD_NUM = "upload_num";
  @SerializedName(SERIALIZED_NAME_UPLOAD_NUM)
  private Long uploadNum = null;

  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience() {
  }

  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience advertiserId(Long advertiserId) {
    
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


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience calculateSubType(Long calculateSubType) {
    
    this.calculateSubType = calculateSubType;
    return this;
  }

   /**
   * 
   * @return calculateSubType
  **/
  @javax.annotation.Nullable
  public Long getCalculateSubType() {
    return calculateSubType;
  }


  public void setCalculateSubType(Long calculateSubType) {
    this.calculateSubType = calculateSubType;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience calculateType(Long calculateType) {
    
    this.calculateType = calculateType;
    return this;
  }

   /**
   * 
   * @return calculateType
  **/
  @javax.annotation.Nullable
  public Long getCalculateType() {
    return calculateType;
  }


  public void setCalculateType(Long calculateType) {
    this.calculateType = calculateType;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience coverNum(Long coverNum) {
    
    this.coverNum = coverNum;
    return this;
  }

   /**
   * 
   * @return coverNum
  **/
  @javax.annotation.Nullable
  public Long getCoverNum() {
    return coverNum;
  }


  public void setCoverNum(Long coverNum) {
    this.coverNum = coverNum;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience createTime(String createTime) {
    
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


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience customAudienceId(Long customAudienceId) {
    
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * 
   * @return customAudienceId
  **/
  @javax.annotation.Nullable
  public Long getCustomAudienceId() {
    return customAudienceId;
  }


  public void setCustomAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience customType(Long customType) {
    
    this.customType = customType;
    return this;
  }

   /**
   * 
   * @return customType
  **/
  @javax.annotation.Nullable
  public Long getCustomType() {
    return customType;
  }


  public void setCustomType(Long customType) {
    this.customType = customType;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience dataSourceId(String dataSourceId) {
    
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * 
   * @return dataSourceId
  **/
  @javax.annotation.Nullable
  public String getDataSourceId() {
    return dataSourceId;
  }


  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience deliveryStatus(DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  public DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(DmpDataSourceReadV2DataDataListDefaultAudienceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * 
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience isdel(Long isdel) {
    
    this.isdel = isdel;
    return this;
  }

   /**
   * 
   * @return isdel
  **/
  @javax.annotation.Nullable
  public Long getIsdel() {
    return isdel;
  }


  public void setIsdel(Long isdel) {
    this.isdel = isdel;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience name(String name) {
    
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


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience pushStatus(Long pushStatus) {
    
    this.pushStatus = pushStatus;
    return this;
  }

   /**
   * 
   * @return pushStatus
  **/
  @javax.annotation.Nullable
  public Long getPushStatus() {
    return pushStatus;
  }


  public void setPushStatus(Long pushStatus) {
    this.pushStatus = pushStatus;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience source(Long source) {
    
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @javax.annotation.Nullable
  public Long getSource() {
    return source;
  }


  public void setSource(Long source) {
    this.source = source;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 
   * @return tag
  **/
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience thirdPartyInfo(String thirdPartyInfo) {
    
    this.thirdPartyInfo = thirdPartyInfo;
    return this;
  }

   /**
   * 
   * @return thirdPartyInfo
  **/
  @javax.annotation.Nullable
  public String getThirdPartyInfo() {
    return thirdPartyInfo;
  }


  public void setThirdPartyInfo(String thirdPartyInfo) {
    this.thirdPartyInfo = thirdPartyInfo;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience uploadNum(Long uploadNum) {
    
    this.uploadNum = uploadNum;
    return this;
  }

   /**
   * 
   * @return uploadNum
  **/
  @javax.annotation.Nullable
  public Long getUploadNum() {
    return uploadNum;
  }


  public void setUploadNum(Long uploadNum) {
    this.uploadNum = uploadNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience = (DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience) o;
    return Objects.equals(this.advertiserId, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.advertiserId) &&
        Objects.equals(this.calculateSubType, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.calculateSubType) &&
        Objects.equals(this.calculateType, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.calculateType) &&
        Objects.equals(this.coverNum, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.coverNum) &&
        Objects.equals(this.createTime, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.createTime) &&
        Objects.equals(this.customAudienceId, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.customAudienceId) &&
        Objects.equals(this.customType, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.customType) &&
        Objects.equals(this.dataSourceId, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.dataSourceId) &&
        Objects.equals(this.deliveryStatus, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.deliveryStatus) &&
        Objects.equals(this.expiryDate, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.expiryDate) &&
        Objects.equals(this.isdel, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.isdel) &&
        Objects.equals(this.modifyTime, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.modifyTime) &&
        Objects.equals(this.name, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.name) &&
        Objects.equals(this.pushStatus, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.pushStatus) &&
        Objects.equals(this.source, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.source) &&
        Objects.equals(this.status, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.status) &&
        Objects.equals(this.tag, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.tag) &&
        Objects.equals(this.thirdPartyInfo, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.thirdPartyInfo) &&
        Objects.equals(this.uploadNum, dmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.uploadNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, calculateSubType, calculateType, coverNum, createTime, customAudienceId, customType, dataSourceId, deliveryStatus, expiryDate, isdel, modifyTime, name, pushStatus, source, status, tag, thirdPartyInfo, uploadNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    calculateSubType: ").append(toIndentedString(calculateSubType)).append("\n");
    sb.append("    calculateType: ").append(toIndentedString(calculateType)).append("\n");
    sb.append("    coverNum: ").append(toIndentedString(coverNum)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    isdel: ").append(toIndentedString(isdel)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pushStatus: ").append(toIndentedString(pushStatus)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    thirdPartyInfo: ").append(toIndentedString(thirdPartyInfo)).append("\n");
    sb.append("    uploadNum: ").append(toIndentedString(uploadNum)).append("\n");
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
    openapiFields.add("calculate_sub_type");
    openapiFields.add("calculate_type");
    openapiFields.add("cover_num");
    openapiFields.add("create_time");
    openapiFields.add("custom_audience_id");
    openapiFields.add("custom_type");
    openapiFields.add("data_source_id");
    openapiFields.add("delivery_status");
    openapiFields.add("expiry_date");
    openapiFields.add("isdel");
    openapiFields.add("modify_time");
    openapiFields.add("name");
    openapiFields.add("push_status");
    openapiFields.add("source");
    openapiFields.add("status");
    openapiFields.add("tag");
    openapiFields.add("third_party_info");
    openapiFields.add("upload_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience>() {
           @Override
           public void write(JsonWriter out, DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience
  * @throws IOException if the JSON string is invalid with respect to DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience
  */
  public static DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience.class);
  }

 /**
  * Convert an instance of DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

