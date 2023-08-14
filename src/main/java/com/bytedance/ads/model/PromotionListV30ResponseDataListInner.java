/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionListV30DataListAdDownloadStatus;
import com.bytedance.ads.model.PromotionListV30DataListAutoExtendTraffic;
import com.bytedance.ads.model.PromotionListV30DataListBudgetMode;
import com.bytedance.ads.model.PromotionListV30DataListCreativeAutoGenerateSwitch;
import com.bytedance.ads.model.PromotionListV30DataListIsCommentDisable;
import com.bytedance.ads.model.PromotionListV30DataListLearningPhase;
import com.bytedance.ads.model.PromotionListV30DataListMaterialsType;
import com.bytedance.ads.model.PromotionListV30DataListOptStatus;
import com.bytedance.ads.model.PromotionListV30DataListStatus;
import com.bytedance.ads.model.PromotionListV30DataListStatusFirst;
import com.bytedance.ads.model.PromotionListV30DataListStatusSecond;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerBrandInfo;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerKeywordsInner;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerMaterialScoreInfo;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerNativeSetting;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterials;
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
 * PromotionListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-14T12:41:35.046+08:00[Asia/Shanghai]")
public class PromotionListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_DOWNLOAD_STATUS = "ad_download_status";
  @SerializedName(SERIALIZED_NAME_AD_DOWNLOAD_STATUS)
  private PromotionListV30DataListAdDownloadStatus adDownloadStatus = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TRAFFIC = "auto_extend_traffic";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TRAFFIC)
  private PromotionListV30DataListAutoExtendTraffic autoExtendTraffic = null;

  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Float bid = null;

  public static final String SERIALIZED_NAME_BRAND_INFO = "brand_info";
  @SerializedName(SERIALIZED_NAME_BRAND_INFO)
  private PromotionListV30ResponseDataListInnerBrandInfo brandInfo = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Float budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private PromotionListV30DataListBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Long configId = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Float cpaBid = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH = "creative_auto_generate_switch";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH)
  private PromotionListV30DataListCreativeAutoGenerateSwitch creativeAutoGenerateSwitch = null;

  public static final String SERIALIZED_NAME_DEEP_CPABID = "deep_cpabid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPABID)
  private Float deepCpabid = null;

  public static final String SERIALIZED_NAME_IS_COMMENT_DISABLE = "is_comment_disable";
  @SerializedName(SERIALIZED_NAME_IS_COMMENT_DISABLE)
  private PromotionListV30DataListIsCommentDisable isCommentDisable = null;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<PromotionListV30ResponseDataListInnerKeywordsInner> keywords = null;

  public static final String SERIALIZED_NAME_LEARNING_PHASE = "learning_phase";
  @SerializedName(SERIALIZED_NAME_LEARNING_PHASE)
  private PromotionListV30DataListLearningPhase learningPhase = null;

  public static final String SERIALIZED_NAME_MATERIAL_SCORE_INFO = "material_score_info";
  @SerializedName(SERIALIZED_NAME_MATERIAL_SCORE_INFO)
  private PromotionListV30ResponseDataListInnerMaterialScoreInfo materialScoreInfo = null;

  public static final String SERIALIZED_NAME_MATERIALS_TYPE = "materials_type";
  @SerializedName(SERIALIZED_NAME_MATERIALS_TYPE)
  private PromotionListV30DataListMaterialsType materialsType = null;

  public static final String SERIALIZED_NAME_NATIVE_SETTING = "native_setting";
  @SerializedName(SERIALIZED_NAME_NATIVE_SETTING)
  private PromotionListV30ResponseDataListInnerNativeSetting nativeSetting = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private PromotionListV30DataListOptStatus optStatus = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROMOTION_CREATE_TIME = "promotion_create_time";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CREATE_TIME)
  private String promotionCreateTime = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_PROMOTION_MATERIALS = "promotion_materials";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MATERIALS)
  private PromotionListV30ResponseDataListInnerPromotionMaterials promotionMaterials = null;

  public static final String SERIALIZED_NAME_PROMOTION_MODIFY_TIME = "promotion_modify_time";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MODIFY_TIME)
  private String promotionModifyTime = null;

  public static final String SERIALIZED_NAME_PROMOTION_NAME = "promotion_name";
  @SerializedName(SERIALIZED_NAME_PROMOTION_NAME)
  private String promotionName = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Float roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PromotionListV30DataListStatus status = null;

  public static final String SERIALIZED_NAME_STATUS_FIRST = "status_first";
  @SerializedName(SERIALIZED_NAME_STATUS_FIRST)
  private PromotionListV30DataListStatusFirst statusFirst = null;

  public static final String SERIALIZED_NAME_STATUS_SECOND = "status_second";
  @SerializedName(SERIALIZED_NAME_STATUS_SECOND)
  private List<PromotionListV30DataListStatusSecond> statusSecond = null;

  public PromotionListV30ResponseDataListInner() {
  }

  public PromotionListV30ResponseDataListInner adDownloadStatus(PromotionListV30DataListAdDownloadStatus adDownloadStatus) {
    
    this.adDownloadStatus = adDownloadStatus;
    return this;
  }

   /**
   * Get adDownloadStatus
   * @return adDownloadStatus
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListAdDownloadStatus getAdDownloadStatus() {
    return adDownloadStatus;
  }


  public void setAdDownloadStatus(PromotionListV30DataListAdDownloadStatus adDownloadStatus) {
    this.adDownloadStatus = adDownloadStatus;
  }


  public PromotionListV30ResponseDataListInner advertiserId(Long advertiserId) {
    
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


  public PromotionListV30ResponseDataListInner autoExtendTraffic(PromotionListV30DataListAutoExtendTraffic autoExtendTraffic) {
    
    this.autoExtendTraffic = autoExtendTraffic;
    return this;
  }

   /**
   * Get autoExtendTraffic
   * @return autoExtendTraffic
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListAutoExtendTraffic getAutoExtendTraffic() {
    return autoExtendTraffic;
  }


  public void setAutoExtendTraffic(PromotionListV30DataListAutoExtendTraffic autoExtendTraffic) {
    this.autoExtendTraffic = autoExtendTraffic;
  }


  public PromotionListV30ResponseDataListInner bid(Float bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Float getBid() {
    return bid;
  }


  public void setBid(Float bid) {
    this.bid = bid;
  }


  public PromotionListV30ResponseDataListInner brandInfo(PromotionListV30ResponseDataListInnerBrandInfo brandInfo) {
    
    this.brandInfo = brandInfo;
    return this;
  }

   /**
   * Get brandInfo
   * @return brandInfo
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataListInnerBrandInfo getBrandInfo() {
    return brandInfo;
  }


  public void setBrandInfo(PromotionListV30ResponseDataListInnerBrandInfo brandInfo) {
    this.brandInfo = brandInfo;
  }


  public PromotionListV30ResponseDataListInner budget(Float budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Float getBudget() {
    return budget;
  }


  public void setBudget(Float budget) {
    this.budget = budget;
  }


  public PromotionListV30ResponseDataListInner budgetMode(PromotionListV30DataListBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(PromotionListV30DataListBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public PromotionListV30ResponseDataListInner configId(Long configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 
   * @return configId
  **/
  @javax.annotation.Nullable
  public Long getConfigId() {
    return configId;
  }


  public void setConfigId(Long configId) {
    this.configId = configId;
  }


  public PromotionListV30ResponseDataListInner cpaBid(Float cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Float getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Float cpaBid) {
    this.cpaBid = cpaBid;
  }


  public PromotionListV30ResponseDataListInner creativeAutoGenerateSwitch(PromotionListV30DataListCreativeAutoGenerateSwitch creativeAutoGenerateSwitch) {
    
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
    return this;
  }

   /**
   * Get creativeAutoGenerateSwitch
   * @return creativeAutoGenerateSwitch
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListCreativeAutoGenerateSwitch getCreativeAutoGenerateSwitch() {
    return creativeAutoGenerateSwitch;
  }


  public void setCreativeAutoGenerateSwitch(PromotionListV30DataListCreativeAutoGenerateSwitch creativeAutoGenerateSwitch) {
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
  }


  public PromotionListV30ResponseDataListInner deepCpabid(Float deepCpabid) {
    
    this.deepCpabid = deepCpabid;
    return this;
  }

   /**
   * 
   * @return deepCpabid
  **/
  @javax.annotation.Nullable
  public Float getDeepCpabid() {
    return deepCpabid;
  }


  public void setDeepCpabid(Float deepCpabid) {
    this.deepCpabid = deepCpabid;
  }


  public PromotionListV30ResponseDataListInner isCommentDisable(PromotionListV30DataListIsCommentDisable isCommentDisable) {
    
    this.isCommentDisable = isCommentDisable;
    return this;
  }

   /**
   * Get isCommentDisable
   * @return isCommentDisable
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListIsCommentDisable getIsCommentDisable() {
    return isCommentDisable;
  }


  public void setIsCommentDisable(PromotionListV30DataListIsCommentDisable isCommentDisable) {
    this.isCommentDisable = isCommentDisable;
  }


  public PromotionListV30ResponseDataListInner keywords(List<PromotionListV30ResponseDataListInnerKeywordsInner> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public PromotionListV30ResponseDataListInner addKeywordsItem(PromotionListV30ResponseDataListInnerKeywordsInner keywordsItem) {
    if (this.keywords == null) {
      this.keywords = null;
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 搜索广告关键词
   * @return keywords
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInnerKeywordsInner> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<PromotionListV30ResponseDataListInnerKeywordsInner> keywords) {
    this.keywords = keywords;
  }


  public PromotionListV30ResponseDataListInner learningPhase(PromotionListV30DataListLearningPhase learningPhase) {
    
    this.learningPhase = learningPhase;
    return this;
  }

   /**
   * Get learningPhase
   * @return learningPhase
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListLearningPhase getLearningPhase() {
    return learningPhase;
  }


  public void setLearningPhase(PromotionListV30DataListLearningPhase learningPhase) {
    this.learningPhase = learningPhase;
  }


  public PromotionListV30ResponseDataListInner materialScoreInfo(PromotionListV30ResponseDataListInnerMaterialScoreInfo materialScoreInfo) {
    
    this.materialScoreInfo = materialScoreInfo;
    return this;
  }

   /**
   * Get materialScoreInfo
   * @return materialScoreInfo
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataListInnerMaterialScoreInfo getMaterialScoreInfo() {
    return materialScoreInfo;
  }


  public void setMaterialScoreInfo(PromotionListV30ResponseDataListInnerMaterialScoreInfo materialScoreInfo) {
    this.materialScoreInfo = materialScoreInfo;
  }


  public PromotionListV30ResponseDataListInner materialsType(PromotionListV30DataListMaterialsType materialsType) {
    
    this.materialsType = materialsType;
    return this;
  }

   /**
   * Get materialsType
   * @return materialsType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListMaterialsType getMaterialsType() {
    return materialsType;
  }


  public void setMaterialsType(PromotionListV30DataListMaterialsType materialsType) {
    this.materialsType = materialsType;
  }


  public PromotionListV30ResponseDataListInner nativeSetting(PromotionListV30ResponseDataListInnerNativeSetting nativeSetting) {
    
    this.nativeSetting = nativeSetting;
    return this;
  }

   /**
   * Get nativeSetting
   * @return nativeSetting
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataListInnerNativeSetting getNativeSetting() {
    return nativeSetting;
  }


  public void setNativeSetting(PromotionListV30ResponseDataListInnerNativeSetting nativeSetting) {
    this.nativeSetting = nativeSetting;
  }


  public PromotionListV30ResponseDataListInner optStatus(PromotionListV30DataListOptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListOptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(PromotionListV30DataListOptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public PromotionListV30ResponseDataListInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public PromotionListV30ResponseDataListInner promotionCreateTime(String promotionCreateTime) {
    
    this.promotionCreateTime = promotionCreateTime;
    return this;
  }

   /**
   * 
   * @return promotionCreateTime
  **/
  @javax.annotation.Nullable
  public String getPromotionCreateTime() {
    return promotionCreateTime;
  }


  public void setPromotionCreateTime(String promotionCreateTime) {
    this.promotionCreateTime = promotionCreateTime;
  }


  public PromotionListV30ResponseDataListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public PromotionListV30ResponseDataListInner promotionMaterials(PromotionListV30ResponseDataListInnerPromotionMaterials promotionMaterials) {
    
    this.promotionMaterials = promotionMaterials;
    return this;
  }

   /**
   * Get promotionMaterials
   * @return promotionMaterials
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataListInnerPromotionMaterials getPromotionMaterials() {
    return promotionMaterials;
  }


  public void setPromotionMaterials(PromotionListV30ResponseDataListInnerPromotionMaterials promotionMaterials) {
    this.promotionMaterials = promotionMaterials;
  }


  public PromotionListV30ResponseDataListInner promotionModifyTime(String promotionModifyTime) {
    
    this.promotionModifyTime = promotionModifyTime;
    return this;
  }

   /**
   * 
   * @return promotionModifyTime
  **/
  @javax.annotation.Nullable
  public String getPromotionModifyTime() {
    return promotionModifyTime;
  }


  public void setPromotionModifyTime(String promotionModifyTime) {
    this.promotionModifyTime = promotionModifyTime;
  }


  public PromotionListV30ResponseDataListInner promotionName(String promotionName) {
    
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 
   * @return promotionName
  **/
  @javax.annotation.Nullable
  public String getPromotionName() {
    return promotionName;
  }


  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }


  public PromotionListV30ResponseDataListInner roiGoal(Float roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Float getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Float roiGoal) {
    this.roiGoal = roiGoal;
  }


  public PromotionListV30ResponseDataListInner scheduleTime(String scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * 
   * @return scheduleTime
  **/
  @javax.annotation.Nullable
  public String getScheduleTime() {
    return scheduleTime;
  }


  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }


  public PromotionListV30ResponseDataListInner source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public PromotionListV30ResponseDataListInner status(PromotionListV30DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListStatus getStatus() {
    return status;
  }


  public void setStatus(PromotionListV30DataListStatus status) {
    this.status = status;
  }


  public PromotionListV30ResponseDataListInner statusFirst(PromotionListV30DataListStatusFirst statusFirst) {
    
    this.statusFirst = statusFirst;
    return this;
  }

   /**
   * Get statusFirst
   * @return statusFirst
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListStatusFirst getStatusFirst() {
    return statusFirst;
  }


  public void setStatusFirst(PromotionListV30DataListStatusFirst statusFirst) {
    this.statusFirst = statusFirst;
  }


  public PromotionListV30ResponseDataListInner statusSecond(List<PromotionListV30DataListStatusSecond> statusSecond) {
    
    this.statusSecond = statusSecond;
    return this;
  }

  public PromotionListV30ResponseDataListInner addStatusSecondItem(PromotionListV30DataListStatusSecond statusSecondItem) {
    if (this.statusSecond == null) {
      this.statusSecond = null;
    }
    this.statusSecond.add(statusSecondItem);
    return this;
  }

   /**
   * 
   * @return statusSecond
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30DataListStatusSecond> getStatusSecond() {
    return statusSecond;
  }


  public void setStatusSecond(List<PromotionListV30DataListStatusSecond> statusSecond) {
    this.statusSecond = statusSecond;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInner promotionListV30ResponseDataListInner = (PromotionListV30ResponseDataListInner) o;
    return Objects.equals(this.adDownloadStatus, promotionListV30ResponseDataListInner.adDownloadStatus) &&
        Objects.equals(this.advertiserId, promotionListV30ResponseDataListInner.advertiserId) &&
        Objects.equals(this.autoExtendTraffic, promotionListV30ResponseDataListInner.autoExtendTraffic) &&
        Objects.equals(this.bid, promotionListV30ResponseDataListInner.bid) &&
        Objects.equals(this.brandInfo, promotionListV30ResponseDataListInner.brandInfo) &&
        Objects.equals(this.budget, promotionListV30ResponseDataListInner.budget) &&
        Objects.equals(this.budgetMode, promotionListV30ResponseDataListInner.budgetMode) &&
        Objects.equals(this.configId, promotionListV30ResponseDataListInner.configId) &&
        Objects.equals(this.cpaBid, promotionListV30ResponseDataListInner.cpaBid) &&
        Objects.equals(this.creativeAutoGenerateSwitch, promotionListV30ResponseDataListInner.creativeAutoGenerateSwitch) &&
        Objects.equals(this.deepCpabid, promotionListV30ResponseDataListInner.deepCpabid) &&
        Objects.equals(this.isCommentDisable, promotionListV30ResponseDataListInner.isCommentDisable) &&
        Objects.equals(this.keywords, promotionListV30ResponseDataListInner.keywords) &&
        Objects.equals(this.learningPhase, promotionListV30ResponseDataListInner.learningPhase) &&
        Objects.equals(this.materialScoreInfo, promotionListV30ResponseDataListInner.materialScoreInfo) &&
        Objects.equals(this.materialsType, promotionListV30ResponseDataListInner.materialsType) &&
        Objects.equals(this.nativeSetting, promotionListV30ResponseDataListInner.nativeSetting) &&
        Objects.equals(this.optStatus, promotionListV30ResponseDataListInner.optStatus) &&
        Objects.equals(this.projectId, promotionListV30ResponseDataListInner.projectId) &&
        Objects.equals(this.promotionCreateTime, promotionListV30ResponseDataListInner.promotionCreateTime) &&
        Objects.equals(this.promotionId, promotionListV30ResponseDataListInner.promotionId) &&
        Objects.equals(this.promotionMaterials, promotionListV30ResponseDataListInner.promotionMaterials) &&
        Objects.equals(this.promotionModifyTime, promotionListV30ResponseDataListInner.promotionModifyTime) &&
        Objects.equals(this.promotionName, promotionListV30ResponseDataListInner.promotionName) &&
        Objects.equals(this.roiGoal, promotionListV30ResponseDataListInner.roiGoal) &&
        Objects.equals(this.scheduleTime, promotionListV30ResponseDataListInner.scheduleTime) &&
        Objects.equals(this.source, promotionListV30ResponseDataListInner.source) &&
        Objects.equals(this.status, promotionListV30ResponseDataListInner.status) &&
        Objects.equals(this.statusFirst, promotionListV30ResponseDataListInner.statusFirst) &&
        Objects.equals(this.statusSecond, promotionListV30ResponseDataListInner.statusSecond);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adDownloadStatus, advertiserId, autoExtendTraffic, bid, brandInfo, budget, budgetMode, configId, cpaBid, creativeAutoGenerateSwitch, deepCpabid, isCommentDisable, keywords, learningPhase, materialScoreInfo, materialsType, nativeSetting, optStatus, projectId, promotionCreateTime, promotionId, promotionMaterials, promotionModifyTime, promotionName, roiGoal, scheduleTime, source, status, statusFirst, statusSecond);
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
    sb.append("class PromotionListV30ResponseDataListInner {\n");
    sb.append("    adDownloadStatus: ").append(toIndentedString(adDownloadStatus)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoExtendTraffic: ").append(toIndentedString(autoExtendTraffic)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    brandInfo: ").append(toIndentedString(brandInfo)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    creativeAutoGenerateSwitch: ").append(toIndentedString(creativeAutoGenerateSwitch)).append("\n");
    sb.append("    deepCpabid: ").append(toIndentedString(deepCpabid)).append("\n");
    sb.append("    isCommentDisable: ").append(toIndentedString(isCommentDisable)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    learningPhase: ").append(toIndentedString(learningPhase)).append("\n");
    sb.append("    materialScoreInfo: ").append(toIndentedString(materialScoreInfo)).append("\n");
    sb.append("    materialsType: ").append(toIndentedString(materialsType)).append("\n");
    sb.append("    nativeSetting: ").append(toIndentedString(nativeSetting)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    promotionCreateTime: ").append(toIndentedString(promotionCreateTime)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionMaterials: ").append(toIndentedString(promotionMaterials)).append("\n");
    sb.append("    promotionModifyTime: ").append(toIndentedString(promotionModifyTime)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusFirst: ").append(toIndentedString(statusFirst)).append("\n");
    sb.append("    statusSecond: ").append(toIndentedString(statusSecond)).append("\n");
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
    openapiFields.add("ad_download_status");
    openapiFields.add("advertiser_id");
    openapiFields.add("auto_extend_traffic");
    openapiFields.add("bid");
    openapiFields.add("brand_info");
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("config_id");
    openapiFields.add("cpa_bid");
    openapiFields.add("creative_auto_generate_switch");
    openapiFields.add("deep_cpabid");
    openapiFields.add("is_comment_disable");
    openapiFields.add("keywords");
    openapiFields.add("learning_phase");
    openapiFields.add("material_score_info");
    openapiFields.add("materials_type");
    openapiFields.add("native_setting");
    openapiFields.add("opt_status");
    openapiFields.add("project_id");
    openapiFields.add("promotion_create_time");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_materials");
    openapiFields.add("promotion_modify_time");
    openapiFields.add("promotion_name");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_time");
    openapiFields.add("source");
    openapiFields.add("status");
    openapiFields.add("status_first");
    openapiFields.add("status_second");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInner
  */
  public static PromotionListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

