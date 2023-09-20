/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponDetailV2DataCouponResourceListCodeType;
import com.bytedance.ads.model.ClueCouponDetailV2DataCouponResourceListIndustryType;
import com.bytedance.ads.model.ClueCouponDetailV2DataCouponResourceListResourceType;
import com.bytedance.ads.model.ClueCouponDetailV2ResponseDataCouponResourceListInnerGiftListInner;
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
 * ClueCouponDetailV2ResponseDataCouponResourceListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T19:34:37.792107567+08:00[PRC]")
public class ClueCouponDetailV2ResponseDataCouponResourceListInner {
  public static final String SERIALIZED_NAME_ANDROID_LINK = "android_link";
  @SerializedName(SERIALIZED_NAME_ANDROID_LINK)
  private String androidLink = null;

  public static final String SERIALIZED_NAME_AUDIT_MSG = "audit_msg";
  @SerializedName(SERIALIZED_NAME_AUDIT_MSG)
  private String auditMsg = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code = null;

  public static final String SERIALIZED_NAME_CODE_REFER_URL = "code_refer_url";
  @SerializedName(SERIALIZED_NAME_CODE_REFER_URL)
  private String codeReferUrl = null;

  public static final String SERIALIZED_NAME_CODE_TYPE = "code_type";
  @SerializedName(SERIALIZED_NAME_CODE_TYPE)
  private ClueCouponDetailV2DataCouponResourceListCodeType codeType = null;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition = null;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Long discount = null;

  public static final String SERIALIZED_NAME_GIFT_LIST = "gift_list";
  @SerializedName(SERIALIZED_NAME_GIFT_LIST)
  private List<ClueCouponDetailV2ResponseDataCouponResourceListInnerGiftListInner> giftList = null;

  public static final String SERIALIZED_NAME_HEAD_IMAGE_URL = "head_image_url";
  @SerializedName(SERIALIZED_NAME_HEAD_IMAGE_URL)
  private String headImageUrl = null;

  public static final String SERIALIZED_NAME_INDUSTRY_TYPE = "industry_type";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_TYPE)
  private ClueCouponDetailV2DataCouponResourceListIndustryType industryType = null;

  public static final String SERIALIZED_NAME_IOS_LINK = "ios_link";
  @SerializedName(SERIALIZED_NAME_IOS_LINK)
  private String iosLink = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link = null;

  public static final String SERIALIZED_NAME_LOGO_IMAGE_URL = "logo_image_url";
  @SerializedName(SERIALIZED_NAME_LOGO_IMAGE_URL)
  private String logoImageUrl = null;

  public static final String SERIALIZED_NAME_MAX_AMOUNT = "max_amount";
  @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
  private Long maxAmount = null;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName = null;

  public static final String SERIALIZED_NAME_MIN_AMOUNT = "min_amount";
  @SerializedName(SERIALIZED_NAME_MIN_AMOUNT)
  private Long minAmount = null;

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private String notification = null;

  public static final String SERIALIZED_NAME_RELIEF_AMOUNT = "relief_amount";
  @SerializedName(SERIALIZED_NAME_RELIEF_AMOUNT)
  private Long reliefAmount = null;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Long resourceId = null;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ClueCouponDetailV2DataCouponResourceListResourceType resourceType = null;

  public static final String SERIALIZED_NAME_SERVICE_NUM = "service_num";
  @SerializedName(SERIALIZED_NAME_SERVICE_NUM)
  private String serviceNum = null;

  public static final String SERIALIZED_NAME_STOCK = "stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private Long stock = null;

  public static final String SERIALIZED_NAME_STORE_IDS = "store_ids";
  @SerializedName(SERIALIZED_NAME_STORE_IDS)
  private List<Long> storeIds = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private String useType = null;

  public static final String SERIALIZED_NAME_VALID_DAYS = "valid_days";
  @SerializedName(SERIALIZED_NAME_VALID_DAYS)
  private Long validDays = null;

  public static final String SERIALIZED_NAME_VALID_END = "valid_end";
  @SerializedName(SERIALIZED_NAME_VALID_END)
  private String validEnd = null;

  public static final String SERIALIZED_NAME_VALID_START = "valid_start";
  @SerializedName(SERIALIZED_NAME_VALID_START)
  private String validStart = null;

  public ClueCouponDetailV2ResponseDataCouponResourceListInner() {
  }

  
  public ClueCouponDetailV2ResponseDataCouponResourceListInner(
     String validEnd, 
     String validStart
  ) {
    this();
    this.validEnd = validEnd;
    this.validStart = validStart;
  }

  public ClueCouponDetailV2ResponseDataCouponResourceListInner androidLink(String androidLink) {
    
    this.androidLink = androidLink;
    return this;
  }

   /**
   * 
   * @return androidLink
  **/
  @javax.annotation.Nullable
  public String getAndroidLink() {
    return androidLink;
  }


  public void setAndroidLink(String androidLink) {
    this.androidLink = androidLink;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner auditMsg(String auditMsg) {
    
    this.auditMsg = auditMsg;
    return this;
  }

   /**
   * 
   * @return auditMsg
  **/
  @javax.annotation.Nullable
  public String getAuditMsg() {
    return auditMsg;
  }


  public void setAuditMsg(String auditMsg) {
    this.auditMsg = auditMsg;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner code(String code) {
    
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


  public ClueCouponDetailV2ResponseDataCouponResourceListInner codeReferUrl(String codeReferUrl) {
    
    this.codeReferUrl = codeReferUrl;
    return this;
  }

   /**
   * 
   * @return codeReferUrl
  **/
  @javax.annotation.Nullable
  public String getCodeReferUrl() {
    return codeReferUrl;
  }


  public void setCodeReferUrl(String codeReferUrl) {
    this.codeReferUrl = codeReferUrl;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner codeType(ClueCouponDetailV2DataCouponResourceListCodeType codeType) {
    
    this.codeType = codeType;
    return this;
  }

   /**
   * Get codeType
   * @return codeType
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataCouponResourceListCodeType getCodeType() {
    return codeType;
  }


  public void setCodeType(ClueCouponDetailV2DataCouponResourceListCodeType codeType) {
    this.codeType = codeType;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner condition(String condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * 
   * @return condition
  **/
  @javax.annotation.Nullable
  public String getCondition() {
    return condition;
  }


  public void setCondition(String condition) {
    this.condition = condition;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner discount(Long discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * 
   * @return discount
  **/
  @javax.annotation.Nullable
  public Long getDiscount() {
    return discount;
  }


  public void setDiscount(Long discount) {
    this.discount = discount;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner giftList(List<ClueCouponDetailV2ResponseDataCouponResourceListInnerGiftListInner> giftList) {
    
    this.giftList = giftList;
    return this;
  }

  public ClueCouponDetailV2ResponseDataCouponResourceListInner addGiftListItem(ClueCouponDetailV2ResponseDataCouponResourceListInnerGiftListInner giftListItem) {
    if (this.giftList == null) {
      this.giftList = new ArrayList<>();
    }
    this.giftList.add(giftListItem);
    return this;
  }

   /**
   * 
   * @return giftList
  **/
  @javax.annotation.Nullable
  public List<ClueCouponDetailV2ResponseDataCouponResourceListInnerGiftListInner> getGiftList() {
    return giftList;
  }


  public void setGiftList(List<ClueCouponDetailV2ResponseDataCouponResourceListInnerGiftListInner> giftList) {
    this.giftList = giftList;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner headImageUrl(String headImageUrl) {
    
    this.headImageUrl = headImageUrl;
    return this;
  }

   /**
   * 
   * @return headImageUrl
  **/
  @javax.annotation.Nullable
  public String getHeadImageUrl() {
    return headImageUrl;
  }


  public void setHeadImageUrl(String headImageUrl) {
    this.headImageUrl = headImageUrl;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner industryType(ClueCouponDetailV2DataCouponResourceListIndustryType industryType) {
    
    this.industryType = industryType;
    return this;
  }

   /**
   * Get industryType
   * @return industryType
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataCouponResourceListIndustryType getIndustryType() {
    return industryType;
  }


  public void setIndustryType(ClueCouponDetailV2DataCouponResourceListIndustryType industryType) {
    this.industryType = industryType;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner iosLink(String iosLink) {
    
    this.iosLink = iosLink;
    return this;
  }

   /**
   * 
   * @return iosLink
  **/
  @javax.annotation.Nullable
  public String getIosLink() {
    return iosLink;
  }


  public void setIosLink(String iosLink) {
    this.iosLink = iosLink;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * 
   * @return link
  **/
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner logoImageUrl(String logoImageUrl) {
    
    this.logoImageUrl = logoImageUrl;
    return this;
  }

   /**
   * 
   * @return logoImageUrl
  **/
  @javax.annotation.Nullable
  public String getLogoImageUrl() {
    return logoImageUrl;
  }


  public void setLogoImageUrl(String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner maxAmount(Long maxAmount) {
    
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * 
   * @return maxAmount
  **/
  @javax.annotation.Nullable
  public Long getMaxAmount() {
    return maxAmount;
  }


  public void setMaxAmount(Long maxAmount) {
    this.maxAmount = maxAmount;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 
   * @return merchantName
  **/
  @javax.annotation.Nullable
  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner minAmount(Long minAmount) {
    
    this.minAmount = minAmount;
    return this;
  }

   /**
   * 
   * @return minAmount
  **/
  @javax.annotation.Nullable
  public Long getMinAmount() {
    return minAmount;
  }


  public void setMinAmount(Long minAmount) {
    this.minAmount = minAmount;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner notification(String notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * 
   * @return notification
  **/
  @javax.annotation.Nullable
  public String getNotification() {
    return notification;
  }


  public void setNotification(String notification) {
    this.notification = notification;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner reliefAmount(Long reliefAmount) {
    
    this.reliefAmount = reliefAmount;
    return this;
  }

   /**
   * 
   * @return reliefAmount
  **/
  @javax.annotation.Nullable
  public Long getReliefAmount() {
    return reliefAmount;
  }


  public void setReliefAmount(Long reliefAmount) {
    this.reliefAmount = reliefAmount;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner resourceId(Long resourceId) {
    
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


  public ClueCouponDetailV2ResponseDataCouponResourceListInner resourceType(ClueCouponDetailV2DataCouponResourceListResourceType resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataCouponResourceListResourceType getResourceType() {
    return resourceType;
  }


  public void setResourceType(ClueCouponDetailV2DataCouponResourceListResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner serviceNum(String serviceNum) {
    
    this.serviceNum = serviceNum;
    return this;
  }

   /**
   * 
   * @return serviceNum
  **/
  @javax.annotation.Nullable
  public String getServiceNum() {
    return serviceNum;
  }


  public void setServiceNum(String serviceNum) {
    this.serviceNum = serviceNum;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner stock(Long stock) {
    
    this.stock = stock;
    return this;
  }

   /**
   * 
   * @return stock
  **/
  @javax.annotation.Nullable
  public Long getStock() {
    return stock;
  }


  public void setStock(Long stock) {
    this.stock = stock;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner storeIds(List<Long> storeIds) {
    
    this.storeIds = storeIds;
    return this;
  }

  public ClueCouponDetailV2ResponseDataCouponResourceListInner addStoreIdsItem(Long storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * 
   * @return storeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getStoreIds() {
    return storeIds;
  }


  public void setStoreIds(List<Long> storeIds) {
    this.storeIds = storeIds;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner useType(String useType) {
    
    this.useType = useType;
    return this;
  }

   /**
   * 
   * @return useType
  **/
  @javax.annotation.Nullable
  public String getUseType() {
    return useType;
  }


  public void setUseType(String useType) {
    this.useType = useType;
  }


  public ClueCouponDetailV2ResponseDataCouponResourceListInner validDays(Long validDays) {
    
    this.validDays = validDays;
    return this;
  }

   /**
   * 
   * @return validDays
  **/
  @javax.annotation.Nullable
  public Long getValidDays() {
    return validDays;
  }


  public void setValidDays(Long validDays) {
    this.validDays = validDays;
  }


   /**
   * 
   * @return validEnd
  **/
  @javax.annotation.Nullable
  public String getValidEnd() {
    return validEnd;
  }




   /**
   * 
   * @return validStart
  **/
  @javax.annotation.Nullable
  public String getValidStart() {
    return validStart;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponDetailV2ResponseDataCouponResourceListInner clueCouponDetailV2ResponseDataCouponResourceListInner = (ClueCouponDetailV2ResponseDataCouponResourceListInner) o;
    return Objects.equals(this.androidLink, clueCouponDetailV2ResponseDataCouponResourceListInner.androidLink) &&
        Objects.equals(this.auditMsg, clueCouponDetailV2ResponseDataCouponResourceListInner.auditMsg) &&
        Objects.equals(this.code, clueCouponDetailV2ResponseDataCouponResourceListInner.code) &&
        Objects.equals(this.codeReferUrl, clueCouponDetailV2ResponseDataCouponResourceListInner.codeReferUrl) &&
        Objects.equals(this.codeType, clueCouponDetailV2ResponseDataCouponResourceListInner.codeType) &&
        Objects.equals(this.condition, clueCouponDetailV2ResponseDataCouponResourceListInner.condition) &&
        Objects.equals(this.discount, clueCouponDetailV2ResponseDataCouponResourceListInner.discount) &&
        Objects.equals(this.giftList, clueCouponDetailV2ResponseDataCouponResourceListInner.giftList) &&
        Objects.equals(this.headImageUrl, clueCouponDetailV2ResponseDataCouponResourceListInner.headImageUrl) &&
        Objects.equals(this.industryType, clueCouponDetailV2ResponseDataCouponResourceListInner.industryType) &&
        Objects.equals(this.iosLink, clueCouponDetailV2ResponseDataCouponResourceListInner.iosLink) &&
        Objects.equals(this.link, clueCouponDetailV2ResponseDataCouponResourceListInner.link) &&
        Objects.equals(this.logoImageUrl, clueCouponDetailV2ResponseDataCouponResourceListInner.logoImageUrl) &&
        Objects.equals(this.maxAmount, clueCouponDetailV2ResponseDataCouponResourceListInner.maxAmount) &&
        Objects.equals(this.merchantName, clueCouponDetailV2ResponseDataCouponResourceListInner.merchantName) &&
        Objects.equals(this.minAmount, clueCouponDetailV2ResponseDataCouponResourceListInner.minAmount) &&
        Objects.equals(this.notification, clueCouponDetailV2ResponseDataCouponResourceListInner.notification) &&
        Objects.equals(this.reliefAmount, clueCouponDetailV2ResponseDataCouponResourceListInner.reliefAmount) &&
        Objects.equals(this.resourceId, clueCouponDetailV2ResponseDataCouponResourceListInner.resourceId) &&
        Objects.equals(this.resourceType, clueCouponDetailV2ResponseDataCouponResourceListInner.resourceType) &&
        Objects.equals(this.serviceNum, clueCouponDetailV2ResponseDataCouponResourceListInner.serviceNum) &&
        Objects.equals(this.stock, clueCouponDetailV2ResponseDataCouponResourceListInner.stock) &&
        Objects.equals(this.storeIds, clueCouponDetailV2ResponseDataCouponResourceListInner.storeIds) &&
        Objects.equals(this.title, clueCouponDetailV2ResponseDataCouponResourceListInner.title) &&
        Objects.equals(this.useType, clueCouponDetailV2ResponseDataCouponResourceListInner.useType) &&
        Objects.equals(this.validDays, clueCouponDetailV2ResponseDataCouponResourceListInner.validDays) &&
        Objects.equals(this.validEnd, clueCouponDetailV2ResponseDataCouponResourceListInner.validEnd) &&
        Objects.equals(this.validStart, clueCouponDetailV2ResponseDataCouponResourceListInner.validStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidLink, auditMsg, code, codeReferUrl, codeType, condition, discount, giftList, headImageUrl, industryType, iosLink, link, logoImageUrl, maxAmount, merchantName, minAmount, notification, reliefAmount, resourceId, resourceType, serviceNum, stock, storeIds, title, useType, validDays, validEnd, validStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponDetailV2ResponseDataCouponResourceListInner {\n");
    sb.append("    androidLink: ").append(toIndentedString(androidLink)).append("\n");
    sb.append("    auditMsg: ").append(toIndentedString(auditMsg)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeReferUrl: ").append(toIndentedString(codeReferUrl)).append("\n");
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    giftList: ").append(toIndentedString(giftList)).append("\n");
    sb.append("    headImageUrl: ").append(toIndentedString(headImageUrl)).append("\n");
    sb.append("    industryType: ").append(toIndentedString(industryType)).append("\n");
    sb.append("    iosLink: ").append(toIndentedString(iosLink)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    logoImageUrl: ").append(toIndentedString(logoImageUrl)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    reliefAmount: ").append(toIndentedString(reliefAmount)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    serviceNum: ").append(toIndentedString(serviceNum)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    validDays: ").append(toIndentedString(validDays)).append("\n");
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
    openapiFields.add("android_link");
    openapiFields.add("audit_msg");
    openapiFields.add("code");
    openapiFields.add("code_refer_url");
    openapiFields.add("code_type");
    openapiFields.add("condition");
    openapiFields.add("discount");
    openapiFields.add("gift_list");
    openapiFields.add("head_image_url");
    openapiFields.add("industry_type");
    openapiFields.add("ios_link");
    openapiFields.add("link");
    openapiFields.add("logo_image_url");
    openapiFields.add("max_amount");
    openapiFields.add("merchant_name");
    openapiFields.add("min_amount");
    openapiFields.add("notification");
    openapiFields.add("relief_amount");
    openapiFields.add("resource_id");
    openapiFields.add("resource_type");
    openapiFields.add("service_num");
    openapiFields.add("stock");
    openapiFields.add("store_ids");
    openapiFields.add("title");
    openapiFields.add("use_type");
    openapiFields.add("valid_days");
    openapiFields.add("valid_end");
    openapiFields.add("valid_start");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponDetailV2ResponseDataCouponResourceListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponDetailV2ResponseDataCouponResourceListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponDetailV2ResponseDataCouponResourceListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponDetailV2ResponseDataCouponResourceListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponDetailV2ResponseDataCouponResourceListInner>() {
           @Override
           public void write(JsonWriter out, ClueCouponDetailV2ResponseDataCouponResourceListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponDetailV2ResponseDataCouponResourceListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponDetailV2ResponseDataCouponResourceListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponDetailV2ResponseDataCouponResourceListInner
  * @throws IOException if the JSON string is invalid with respect to ClueCouponDetailV2ResponseDataCouponResourceListInner
  */
  public static ClueCouponDetailV2ResponseDataCouponResourceListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponDetailV2ResponseDataCouponResourceListInner.class);
  }

 /**
  * Convert an instance of ClueCouponDetailV2ResponseDataCouponResourceListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

