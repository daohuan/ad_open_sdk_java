/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListActionType;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListAllocationStatus;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListClueType;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListEffectiveState;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListEffectiveStateName;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListFlowType;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListFollowLifeAccountType;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListFollowStateName;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListGender;
import com.bytedance.ads.model.ToolsClueLifeGetV2DataListLeadsPage;
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
 * ToolsClueLifeGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class ToolsClueLifeGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACTION_TYPE = "action_type";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private ToolsClueLifeGetV2DataListActionType actionType = null;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private Long age = null;

  public static final String SERIALIZED_NAME_ALLOCATION_STATUS = "allocation_status";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_STATUS)
  private ToolsClueLifeGetV2DataListAllocationStatus allocationStatus = null;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName = null;

  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private String clueId = null;

  public static final String SERIALIZED_NAME_CLUE_OWNER_NAME = "clue_owner_name";
  @SerializedName(SERIALIZED_NAME_CLUE_OWNER_NAME)
  private String clueOwnerName = null;

  public static final String SERIALIZED_NAME_CLUE_TYPE = "clue_type";
  @SerializedName(SERIALIZED_NAME_CLUE_TYPE)
  private ToolsClueLifeGetV2DataListClueType clueType = null;

  public static final String SERIALIZED_NAME_CONTENT_ID = "content_id";
  @SerializedName(SERIALIZED_NAME_CONTENT_ID)
  private String contentId = null;

  public static final String SERIALIZED_NAME_COUNTY_NAME = "county_name";
  @SerializedName(SERIALIZED_NAME_COUNTY_NAME)
  private String countyName = null;

  public static final String SERIALIZED_NAME_CREATE_TIME_DETAIL = "create_time_detail";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_DETAIL)
  private String createTimeDetail = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_STATE = "effective_state";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_STATE)
  private ToolsClueLifeGetV2DataListEffectiveState effectiveState = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_STATE_NAME = "effective_state_name";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_STATE_NAME)
  private ToolsClueLifeGetV2DataListEffectiveStateName effectiveStateName = null;

  public static final String SERIALIZED_NAME_FLOW_TYPE = "flow_type";
  @SerializedName(SERIALIZED_NAME_FLOW_TYPE)
  private ToolsClueLifeGetV2DataListFlowType flowType = null;

  public static final String SERIALIZED_NAME_FOLLOW_LIFE_ACCOUNT_ID = "follow_life_account_id";
  @SerializedName(SERIALIZED_NAME_FOLLOW_LIFE_ACCOUNT_ID)
  private String followLifeAccountId = null;

  public static final String SERIALIZED_NAME_FOLLOW_LIFE_ACCOUNT_NAME = "follow_life_account_name";
  @SerializedName(SERIALIZED_NAME_FOLLOW_LIFE_ACCOUNT_NAME)
  private String followLifeAccountName = null;

  public static final String SERIALIZED_NAME_FOLLOW_LIFE_ACCOUNT_TYPE = "follow_life_account_type";
  @SerializedName(SERIALIZED_NAME_FOLLOW_LIFE_ACCOUNT_TYPE)
  private ToolsClueLifeGetV2DataListFollowLifeAccountType followLifeAccountType = null;

  public static final String SERIALIZED_NAME_FOLLOW_STATE_NAME = "follow_state_name";
  @SerializedName(SERIALIZED_NAME_FOLLOW_STATE_NAME)
  private ToolsClueLifeGetV2DataListFollowStateName followStateName = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private ToolsClueLifeGetV2DataListGender gender = null;

  public static final String SERIALIZED_NAME_LEADS_PAGE = "leads_page";
  @SerializedName(SERIALIZED_NAME_LEADS_PAGE)
  private ToolsClueLifeGetV2DataListLeadsPage leadsPage = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private String localAccountId = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_PROMOTION_NAME = "promotion_name";
  @SerializedName(SERIALIZED_NAME_PROMOTION_NAME)
  private String promotionName = null;

  public static final String SERIALIZED_NAME_PROVINCE_NAME = "province_name";
  @SerializedName(SERIALIZED_NAME_PROVINCE_NAME)
  private String provinceName = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_REMARK_DICT = "remark_dict";
  @SerializedName(SERIALIZED_NAME_REMARK_DICT)
  private String remarkDict = null;

  public static final String SERIALIZED_NAME_REQ_ID = "req_id";
  @SerializedName(SERIALIZED_NAME_REQ_ID)
  private String reqId = null;

  public static final String SERIALIZED_NAME_SYSTEM_TAGS = "system_tags";
  @SerializedName(SERIALIZED_NAME_SYSTEM_TAGS)
  private List<String> systemTags = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone = null;

  public static final String SERIALIZED_NAME_TOOL_ID = "tool_id";
  @SerializedName(SERIALIZED_NAME_TOOL_ID)
  private String toolId = null;

  public ToolsClueLifeGetV2ResponseDataListInner() {
  }

  public ToolsClueLifeGetV2ResponseDataListInner actionType(ToolsClueLifeGetV2DataListActionType actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListActionType getActionType() {
    return actionType;
  }


  public void setActionType(ToolsClueLifeGetV2DataListActionType actionType) {
    this.actionType = actionType;
  }


  public ToolsClueLifeGetV2ResponseDataListInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 详细地址
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ToolsClueLifeGetV2ResponseDataListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 广告主名
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public ToolsClueLifeGetV2ResponseDataListInner age(Long age) {
    
    this.age = age;
    return this;
  }

   /**
   * 年龄
   * @return age
  **/
  @javax.annotation.Nullable
  public Long getAge() {
    return age;
  }


  public void setAge(Long age) {
    this.age = age;
  }


  public ToolsClueLifeGetV2ResponseDataListInner allocationStatus(ToolsClueLifeGetV2DataListAllocationStatus allocationStatus) {
    
    this.allocationStatus = allocationStatus;
    return this;
  }

   /**
   * Get allocationStatus
   * @return allocationStatus
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListAllocationStatus getAllocationStatus() {
    return allocationStatus;
  }


  public void setAllocationStatus(ToolsClueLifeGetV2DataListAllocationStatus allocationStatus) {
    this.allocationStatus = allocationStatus;
  }


  public ToolsClueLifeGetV2ResponseDataListInner cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 用户填写城市
   * @return cityName
  **/
  @javax.annotation.Nullable
  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public ToolsClueLifeGetV2ResponseDataListInner clueId(String clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 线索ID
   * @return clueId
  **/
  @javax.annotation.Nullable
  public String getClueId() {
    return clueId;
  }


  public void setClueId(String clueId) {
    this.clueId = clueId;
  }


  public ToolsClueLifeGetV2ResponseDataListInner clueOwnerName(String clueOwnerName) {
    
    this.clueOwnerName = clueOwnerName;
    return this;
  }

   /**
   * 所属人姓名
   * @return clueOwnerName
  **/
  @javax.annotation.Nullable
  public String getClueOwnerName() {
    return clueOwnerName;
  }


  public void setClueOwnerName(String clueOwnerName) {
    this.clueOwnerName = clueOwnerName;
  }


  public ToolsClueLifeGetV2ResponseDataListInner clueType(ToolsClueLifeGetV2DataListClueType clueType) {
    
    this.clueType = clueType;
    return this;
  }

   /**
   * Get clueType
   * @return clueType
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListClueType getClueType() {
    return clueType;
  }


  public void setClueType(ToolsClueLifeGetV2DataListClueType clueType) {
    this.clueType = clueType;
  }


  public ToolsClueLifeGetV2ResponseDataListInner contentId(String contentId) {
    
    this.contentId = contentId;
    return this;
  }

   /**
   * 内容ID
   * @return contentId
  **/
  @javax.annotation.Nullable
  public String getContentId() {
    return contentId;
  }


  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  public ToolsClueLifeGetV2ResponseDataListInner countyName(String countyName) {
    
    this.countyName = countyName;
    return this;
  }

   /**
   * 用户填写区县
   * @return countyName
  **/
  @javax.annotation.Nullable
  public String getCountyName() {
    return countyName;
  }


  public void setCountyName(String countyName) {
    this.countyName = countyName;
  }


  public ToolsClueLifeGetV2ResponseDataListInner createTimeDetail(String createTimeDetail) {
    
    this.createTimeDetail = createTimeDetail;
    return this;
  }

   /**
   * 线索创建时间，如：2020-04-29 00:00:00
   * @return createTimeDetail
  **/
  @javax.annotation.Nullable
  public String getCreateTimeDetail() {
    return createTimeDetail;
  }


  public void setCreateTimeDetail(String createTimeDetail) {
    this.createTimeDetail = createTimeDetail;
  }


  public ToolsClueLifeGetV2ResponseDataListInner effectiveState(ToolsClueLifeGetV2DataListEffectiveState effectiveState) {
    
    this.effectiveState = effectiveState;
    return this;
  }

   /**
   * Get effectiveState
   * @return effectiveState
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListEffectiveState getEffectiveState() {
    return effectiveState;
  }


  public void setEffectiveState(ToolsClueLifeGetV2DataListEffectiveState effectiveState) {
    this.effectiveState = effectiveState;
  }


  public ToolsClueLifeGetV2ResponseDataListInner effectiveStateName(ToolsClueLifeGetV2DataListEffectiveStateName effectiveStateName) {
    
    this.effectiveStateName = effectiveStateName;
    return this;
  }

   /**
   * Get effectiveStateName
   * @return effectiveStateName
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListEffectiveStateName getEffectiveStateName() {
    return effectiveStateName;
  }


  public void setEffectiveStateName(ToolsClueLifeGetV2DataListEffectiveStateName effectiveStateName) {
    this.effectiveStateName = effectiveStateName;
  }


  public ToolsClueLifeGetV2ResponseDataListInner flowType(ToolsClueLifeGetV2DataListFlowType flowType) {
    
    this.flowType = flowType;
    return this;
  }

   /**
   * Get flowType
   * @return flowType
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListFlowType getFlowType() {
    return flowType;
  }


  public void setFlowType(ToolsClueLifeGetV2DataListFlowType flowType) {
    this.flowType = flowType;
  }


  public ToolsClueLifeGetV2ResponseDataListInner followLifeAccountId(String followLifeAccountId) {
    
    this.followLifeAccountId = followLifeAccountId;
    return this;
  }

   /**
   * 跟进账户ID
   * @return followLifeAccountId
  **/
  @javax.annotation.Nullable
  public String getFollowLifeAccountId() {
    return followLifeAccountId;
  }


  public void setFollowLifeAccountId(String followLifeAccountId) {
    this.followLifeAccountId = followLifeAccountId;
  }


  public ToolsClueLifeGetV2ResponseDataListInner followLifeAccountName(String followLifeAccountName) {
    
    this.followLifeAccountName = followLifeAccountName;
    return this;
  }

   /**
   * 跟进账户名称
   * @return followLifeAccountName
  **/
  @javax.annotation.Nullable
  public String getFollowLifeAccountName() {
    return followLifeAccountName;
  }


  public void setFollowLifeAccountName(String followLifeAccountName) {
    this.followLifeAccountName = followLifeAccountName;
  }


  public ToolsClueLifeGetV2ResponseDataListInner followLifeAccountType(ToolsClueLifeGetV2DataListFollowLifeAccountType followLifeAccountType) {
    
    this.followLifeAccountType = followLifeAccountType;
    return this;
  }

   /**
   * Get followLifeAccountType
   * @return followLifeAccountType
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListFollowLifeAccountType getFollowLifeAccountType() {
    return followLifeAccountType;
  }


  public void setFollowLifeAccountType(ToolsClueLifeGetV2DataListFollowLifeAccountType followLifeAccountType) {
    this.followLifeAccountType = followLifeAccountType;
  }


  public ToolsClueLifeGetV2ResponseDataListInner followStateName(ToolsClueLifeGetV2DataListFollowStateName followStateName) {
    
    this.followStateName = followStateName;
    return this;
  }

   /**
   * Get followStateName
   * @return followStateName
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListFollowStateName getFollowStateName() {
    return followStateName;
  }


  public void setFollowStateName(ToolsClueLifeGetV2DataListFollowStateName followStateName) {
    this.followStateName = followStateName;
  }


  public ToolsClueLifeGetV2ResponseDataListInner gender(ToolsClueLifeGetV2DataListGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListGender getGender() {
    return gender;
  }


  public void setGender(ToolsClueLifeGetV2DataListGender gender) {
    this.gender = gender;
  }


  public ToolsClueLifeGetV2ResponseDataListInner leadsPage(ToolsClueLifeGetV2DataListLeadsPage leadsPage) {
    
    this.leadsPage = leadsPage;
    return this;
  }

   /**
   * Get leadsPage
   * @return leadsPage
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeGetV2DataListLeadsPage getLeadsPage() {
    return leadsPage;
  }


  public void setLeadsPage(ToolsClueLifeGetV2DataListLeadsPage leadsPage) {
    this.leadsPage = leadsPage;
  }


  public ToolsClueLifeGetV2ResponseDataListInner localAccountId(String localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 广告主ID
   * @return localAccountId
  **/
  @javax.annotation.Nullable
  public String getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(String localAccountId) {
    this.localAccountId = localAccountId;
  }


  public ToolsClueLifeGetV2ResponseDataListInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 线索修改时间，如：2020-04-29 00:00:00
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public ToolsClueLifeGetV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 姓名
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsClueLifeGetV2ResponseDataListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public ToolsClueLifeGetV2ResponseDataListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 广告ID
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public ToolsClueLifeGetV2ResponseDataListInner promotionName(String promotionName) {
    
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 广告名称
   * @return promotionName
  **/
  @javax.annotation.Nullable
  public String getPromotionName() {
    return promotionName;
  }


  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }


  public ToolsClueLifeGetV2ResponseDataListInner provinceName(String provinceName) {
    
    this.provinceName = provinceName;
    return this;
  }

   /**
   * 用户填写省份
   * @return provinceName
  **/
  @javax.annotation.Nullable
  public String getProvinceName() {
    return provinceName;
  }


  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }


  public ToolsClueLifeGetV2ResponseDataListInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 商家备注
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public ToolsClueLifeGetV2ResponseDataListInner remarkDict(String remarkDict) {
    
    this.remarkDict = remarkDict;
    return this;
  }

   /**
   * 商家表单自定义的字段信息，及其他线索相关信息
   * @return remarkDict
  **/
  @javax.annotation.Nullable
  public String getRemarkDict() {
    return remarkDict;
  }


  public void setRemarkDict(String remarkDict) {
    this.remarkDict = remarkDict;
  }


  public ToolsClueLifeGetV2ResponseDataListInner reqId(String reqId) {
    
    this.reqId = reqId;
    return this;
  }

   /**
   * 当前线索对应广告的请求id
   * @return reqId
  **/
  @javax.annotation.Nullable
  public String getReqId() {
    return reqId;
  }


  public void setReqId(String reqId) {
    this.reqId = reqId;
  }


  public ToolsClueLifeGetV2ResponseDataListInner systemTags(List<String> systemTags) {
    
    this.systemTags = systemTags;
    return this;
  }

  public ToolsClueLifeGetV2ResponseDataListInner addSystemTagsItem(String systemTagsItem) {
    if (this.systemTags == null) {
      this.systemTags = new ArrayList<>();
    }
    this.systemTags.add(systemTagsItem);
    return this;
  }

   /**
   * 线索被打上的系统标签，是一个标签项的数组
   * @return systemTags
  **/
  @javax.annotation.Nullable
  public List<String> getSystemTags() {
    return systemTags;
  }


  public void setSystemTags(List<String> systemTags) {
    this.systemTags = systemTags;
  }


  public ToolsClueLifeGetV2ResponseDataListInner tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ToolsClueLifeGetV2ResponseDataListInner addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 线索被打上的人工标签，是一个标签项的数组，包括自定义标签和行业标签
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public ToolsClueLifeGetV2ResponseDataListInner telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * 客户留资手机号。当团购订单退款后，不可获取明文手机号。
   * @return telephone
  **/
  @javax.annotation.Nullable
  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public ToolsClueLifeGetV2ResponseDataListInner toolId(String toolId) {
    
    this.toolId = toolId;
    return this;
  }

   /**
   * 线索工具ID 
   * @return toolId
  **/
  @javax.annotation.Nullable
  public String getToolId() {
    return toolId;
  }


  public void setToolId(String toolId) {
    this.toolId = toolId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueLifeGetV2ResponseDataListInner toolsClueLifeGetV2ResponseDataListInner = (ToolsClueLifeGetV2ResponseDataListInner) o;
    return Objects.equals(this.actionType, toolsClueLifeGetV2ResponseDataListInner.actionType) &&
        Objects.equals(this.address, toolsClueLifeGetV2ResponseDataListInner.address) &&
        Objects.equals(this.advertiserName, toolsClueLifeGetV2ResponseDataListInner.advertiserName) &&
        Objects.equals(this.age, toolsClueLifeGetV2ResponseDataListInner.age) &&
        Objects.equals(this.allocationStatus, toolsClueLifeGetV2ResponseDataListInner.allocationStatus) &&
        Objects.equals(this.cityName, toolsClueLifeGetV2ResponseDataListInner.cityName) &&
        Objects.equals(this.clueId, toolsClueLifeGetV2ResponseDataListInner.clueId) &&
        Objects.equals(this.clueOwnerName, toolsClueLifeGetV2ResponseDataListInner.clueOwnerName) &&
        Objects.equals(this.clueType, toolsClueLifeGetV2ResponseDataListInner.clueType) &&
        Objects.equals(this.contentId, toolsClueLifeGetV2ResponseDataListInner.contentId) &&
        Objects.equals(this.countyName, toolsClueLifeGetV2ResponseDataListInner.countyName) &&
        Objects.equals(this.createTimeDetail, toolsClueLifeGetV2ResponseDataListInner.createTimeDetail) &&
        Objects.equals(this.effectiveState, toolsClueLifeGetV2ResponseDataListInner.effectiveState) &&
        Objects.equals(this.effectiveStateName, toolsClueLifeGetV2ResponseDataListInner.effectiveStateName) &&
        Objects.equals(this.flowType, toolsClueLifeGetV2ResponseDataListInner.flowType) &&
        Objects.equals(this.followLifeAccountId, toolsClueLifeGetV2ResponseDataListInner.followLifeAccountId) &&
        Objects.equals(this.followLifeAccountName, toolsClueLifeGetV2ResponseDataListInner.followLifeAccountName) &&
        Objects.equals(this.followLifeAccountType, toolsClueLifeGetV2ResponseDataListInner.followLifeAccountType) &&
        Objects.equals(this.followStateName, toolsClueLifeGetV2ResponseDataListInner.followStateName) &&
        Objects.equals(this.gender, toolsClueLifeGetV2ResponseDataListInner.gender) &&
        Objects.equals(this.leadsPage, toolsClueLifeGetV2ResponseDataListInner.leadsPage) &&
        Objects.equals(this.localAccountId, toolsClueLifeGetV2ResponseDataListInner.localAccountId) &&
        Objects.equals(this.modifyTime, toolsClueLifeGetV2ResponseDataListInner.modifyTime) &&
        Objects.equals(this.name, toolsClueLifeGetV2ResponseDataListInner.name) &&
        Objects.equals(this.orderId, toolsClueLifeGetV2ResponseDataListInner.orderId) &&
        Objects.equals(this.promotionId, toolsClueLifeGetV2ResponseDataListInner.promotionId) &&
        Objects.equals(this.promotionName, toolsClueLifeGetV2ResponseDataListInner.promotionName) &&
        Objects.equals(this.provinceName, toolsClueLifeGetV2ResponseDataListInner.provinceName) &&
        Objects.equals(this.remark, toolsClueLifeGetV2ResponseDataListInner.remark) &&
        Objects.equals(this.remarkDict, toolsClueLifeGetV2ResponseDataListInner.remarkDict) &&
        Objects.equals(this.reqId, toolsClueLifeGetV2ResponseDataListInner.reqId) &&
        Objects.equals(this.systemTags, toolsClueLifeGetV2ResponseDataListInner.systemTags) &&
        Objects.equals(this.tags, toolsClueLifeGetV2ResponseDataListInner.tags) &&
        Objects.equals(this.telephone, toolsClueLifeGetV2ResponseDataListInner.telephone) &&
        Objects.equals(this.toolId, toolsClueLifeGetV2ResponseDataListInner.toolId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, address, advertiserName, age, allocationStatus, cityName, clueId, clueOwnerName, clueType, contentId, countyName, createTimeDetail, effectiveState, effectiveStateName, flowType, followLifeAccountId, followLifeAccountName, followLifeAccountType, followStateName, gender, leadsPage, localAccountId, modifyTime, name, orderId, promotionId, promotionName, provinceName, remark, remarkDict, reqId, systemTags, tags, telephone, toolId);
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
    sb.append("class ToolsClueLifeGetV2ResponseDataListInner {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    allocationStatus: ").append(toIndentedString(allocationStatus)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    clueOwnerName: ").append(toIndentedString(clueOwnerName)).append("\n");
    sb.append("    clueType: ").append(toIndentedString(clueType)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    countyName: ").append(toIndentedString(countyName)).append("\n");
    sb.append("    createTimeDetail: ").append(toIndentedString(createTimeDetail)).append("\n");
    sb.append("    effectiveState: ").append(toIndentedString(effectiveState)).append("\n");
    sb.append("    effectiveStateName: ").append(toIndentedString(effectiveStateName)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
    sb.append("    followLifeAccountId: ").append(toIndentedString(followLifeAccountId)).append("\n");
    sb.append("    followLifeAccountName: ").append(toIndentedString(followLifeAccountName)).append("\n");
    sb.append("    followLifeAccountType: ").append(toIndentedString(followLifeAccountType)).append("\n");
    sb.append("    followStateName: ").append(toIndentedString(followStateName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    leadsPage: ").append(toIndentedString(leadsPage)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    provinceName: ").append(toIndentedString(provinceName)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    remarkDict: ").append(toIndentedString(remarkDict)).append("\n");
    sb.append("    reqId: ").append(toIndentedString(reqId)).append("\n");
    sb.append("    systemTags: ").append(toIndentedString(systemTags)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
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
    openapiFields.add("action_type");
    openapiFields.add("address");
    openapiFields.add("advertiser_name");
    openapiFields.add("age");
    openapiFields.add("allocation_status");
    openapiFields.add("city_name");
    openapiFields.add("clue_id");
    openapiFields.add("clue_owner_name");
    openapiFields.add("clue_type");
    openapiFields.add("content_id");
    openapiFields.add("county_name");
    openapiFields.add("create_time_detail");
    openapiFields.add("effective_state");
    openapiFields.add("effective_state_name");
    openapiFields.add("flow_type");
    openapiFields.add("follow_life_account_id");
    openapiFields.add("follow_life_account_name");
    openapiFields.add("follow_life_account_type");
    openapiFields.add("follow_state_name");
    openapiFields.add("gender");
    openapiFields.add("leads_page");
    openapiFields.add("local_account_id");
    openapiFields.add("modify_time");
    openapiFields.add("name");
    openapiFields.add("order_id");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_name");
    openapiFields.add("province_name");
    openapiFields.add("remark");
    openapiFields.add("remark_dict");
    openapiFields.add("req_id");
    openapiFields.add("system_tags");
    openapiFields.add("tags");
    openapiFields.add("telephone");
    openapiFields.add("tool_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueLifeGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueLifeGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueLifeGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueLifeGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueLifeGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueLifeGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueLifeGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueLifeGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueLifeGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueLifeGetV2ResponseDataListInner
  */
  public static ToolsClueLifeGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueLifeGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsClueLifeGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

