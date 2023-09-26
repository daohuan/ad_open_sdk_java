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
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListAc;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListActionScene;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListAge;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListAutoExtendTargets;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListDistrict;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListGender;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListLocationType;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListNewCustomer;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListPlatform;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10DataListSmartInterestAction;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner;
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
 * QianchuanOrientationPackageGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class QianchuanOrientationPackageGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_IN_ACTIVE_RETARGETING_TAGS = "InActive_retargeting_tags";
  @SerializedName(SERIALIZED_NAME_IN_ACTIVE_RETARGETING_TAGS)
  private List<QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner> inActiveRetargetingTags = null;

  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private List<QianchuanOrientationPackageGetV10DataListAc> ac = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Integer> actionCategories = null;

  public static final String SERIALIZED_NAME_ACTION_DAYS = "action_days";
  @SerializedName(SERIALIZED_NAME_ACTION_DAYS)
  private Integer actionDays = null;

  public static final String SERIALIZED_NAME_ACTION_SCENE = "action_scene";
  @SerializedName(SERIALIZED_NAME_ACTION_SCENE)
  private List<QianchuanOrientationPackageGetV10DataListActionScene> actionScene = null;

  public static final String SERIALIZED_NAME_ACTION_WORDS = "action_words";
  @SerializedName(SERIALIZED_NAME_ACTION_WORDS)
  private List<Long> actionWords = null;

  public static final String SERIALIZED_NAME_AD_NUM = "ad_num";
  @SerializedName(SERIALIZED_NAME_AD_NUM)
  private Long adNum = null;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanOrientationPackageGetV10DataListAge> age = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_ENABLED = "auto_extend_enabled";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_ENABLED)
  private Integer autoExtendEnabled = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TARGETS = "auto_extend_targets";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TARGETS)
  private List<QianchuanOrientationPackageGetV10DataListAutoExtendTargets> autoExtendTargets = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_ACCOUNTS = "aweme_fan_accounts";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_ACCOUNTS)
  private List<Long> awemeFanAccounts = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS = "aweme_fan_behaviors";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS)
  private List<QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors> awemeFanBehaviors = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS = "aweme_fan_behaviors_days";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS)
  private QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays awemeFanBehaviorsDays = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_CATEGORIES = "aweme_fan_categories";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_CATEGORIES)
  private List<Long> awemeFanCategories = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private QianchuanOrientationPackageGetV10DataListDistrict district = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private QianchuanOrientationPackageGetV10DataListGender gender = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<Long> interestCategories = null;

  public static final String SERIALIZED_NAME_INTEREST_WORDS = "interest_words";
  @SerializedName(SERIALIZED_NAME_INTEREST_WORDS)
  private List<Long> interestWords = null;

  public static final String SERIALIZED_NAME_LIVE_PLATFORM_TAGS = "live_platform_tags";
  @SerializedName(SERIALIZED_NAME_LIVE_PLATFORM_TAGS)
  private List<String> livePlatformTags = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private QianchuanOrientationPackageGetV10DataListLocationType locationType = null;

  public static final String SERIALIZED_NAME_NEW_CUSTOMER = "new_customer";
  @SerializedName(SERIALIZED_NAME_NEW_CUSTOMER)
  private QianchuanOrientationPackageGetV10DataListNewCustomer newCustomer = null;

  public static final String SERIALIZED_NAME_ORIENTATION_ID = "orientation_id";
  @SerializedName(SERIALIZED_NAME_ORIENTATION_ID)
  private Long orientationId = null;

  public static final String SERIALIZED_NAME_ORIENTATION_INFO = "orientation_info";
  @SerializedName(SERIALIZED_NAME_ORIENTATION_INFO)
  private String orientationInfo = null;

  public static final String SERIALIZED_NAME_ORIENTATION_NAME = "orientation_name";
  @SerializedName(SERIALIZED_NAME_ORIENTATION_NAME)
  private String orientationName = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<QianchuanOrientationPackageGetV10DataListPlatform> platform = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE = "retargeting_tags_include";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE)
  private List<Long> retargetingTagsInclude = null;

  public static final String SERIALIZED_NAME_SMART_INTEREST_ACTION = "smart_interest_action";
  @SerializedName(SERIALIZED_NAME_SMART_INTEREST_ACTION)
  private QianchuanOrientationPackageGetV10DataListSmartInterestAction smartInterestAction = null;

  public QianchuanOrientationPackageGetV10ResponseDataListInner() {
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner inActiveRetargetingTags(List<QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner> inActiveRetargetingTags) {
    
    this.inActiveRetargetingTags = inActiveRetargetingTags;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addInActiveRetargetingTagsItem(QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner inActiveRetargetingTagsItem) {
    if (this.inActiveRetargetingTags == null) {
      this.inActiveRetargetingTags = new ArrayList<>();
    }
    this.inActiveRetargetingTags.add(inActiveRetargetingTagsItem);
    return this;
  }

   /**
   * 
   * @return inActiveRetargetingTags
  **/
  @javax.annotation.Nullable
  public List<QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner> getInActiveRetargetingTags() {
    return inActiveRetargetingTags;
  }


  public void setInActiveRetargetingTags(List<QianchuanOrientationPackageGetV10ResponseDataListInnerInActiveRetargetingTagsInner> inActiveRetargetingTags) {
    this.inActiveRetargetingTags = inActiveRetargetingTags;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner ac(List<QianchuanOrientationPackageGetV10DataListAc> ac) {
    
    this.ac = ac;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addAcItem(QianchuanOrientationPackageGetV10DataListAc acItem) {
    if (this.ac == null) {
      this.ac = new ArrayList<>();
    }
    this.ac.add(acItem);
    return this;
  }

   /**
   * 
   * @return ac
  **/
  @javax.annotation.Nullable
  public List<QianchuanOrientationPackageGetV10DataListAc> getAc() {
    return ac;
  }


  public void setAc(List<QianchuanOrientationPackageGetV10DataListAc> ac) {
    this.ac = ac;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner actionCategories(List<Integer> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addActionCategoriesItem(Integer actionCategoriesItem) {
    if (this.actionCategories == null) {
      this.actionCategories = new ArrayList<>();
    }
    this.actionCategories.add(actionCategoriesItem);
    return this;
  }

   /**
   * 
   * @return actionCategories
  **/
  @javax.annotation.Nullable
  public List<Integer> getActionCategories() {
    return actionCategories;
  }


  public void setActionCategories(List<Integer> actionCategories) {
    this.actionCategories = actionCategories;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner actionDays(Integer actionDays) {
    
    this.actionDays = actionDays;
    return this;
  }

   /**
   * 
   * @return actionDays
  **/
  @javax.annotation.Nullable
  public Integer getActionDays() {
    return actionDays;
  }


  public void setActionDays(Integer actionDays) {
    this.actionDays = actionDays;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner actionScene(List<QianchuanOrientationPackageGetV10DataListActionScene> actionScene) {
    
    this.actionScene = actionScene;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addActionSceneItem(QianchuanOrientationPackageGetV10DataListActionScene actionSceneItem) {
    if (this.actionScene == null) {
      this.actionScene = new ArrayList<>();
    }
    this.actionScene.add(actionSceneItem);
    return this;
  }

   /**
   * 
   * @return actionScene
  **/
  @javax.annotation.Nullable
  public List<QianchuanOrientationPackageGetV10DataListActionScene> getActionScene() {
    return actionScene;
  }


  public void setActionScene(List<QianchuanOrientationPackageGetV10DataListActionScene> actionScene) {
    this.actionScene = actionScene;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner actionWords(List<Long> actionWords) {
    
    this.actionWords = actionWords;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addActionWordsItem(Long actionWordsItem) {
    if (this.actionWords == null) {
      this.actionWords = new ArrayList<>();
    }
    this.actionWords.add(actionWordsItem);
    return this;
  }

   /**
   * 
   * @return actionWords
  **/
  @javax.annotation.Nullable
  public List<Long> getActionWords() {
    return actionWords;
  }


  public void setActionWords(List<Long> actionWords) {
    this.actionWords = actionWords;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner adNum(Long adNum) {
    
    this.adNum = adNum;
    return this;
  }

   /**
   * 
   * @return adNum
  **/
  @javax.annotation.Nullable
  public Long getAdNum() {
    return adNum;
  }


  public void setAdNum(Long adNum) {
    this.adNum = adNum;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner age(List<QianchuanOrientationPackageGetV10DataListAge> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addAgeItem(QianchuanOrientationPackageGetV10DataListAge ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public List<QianchuanOrientationPackageGetV10DataListAge> getAge() {
    return age;
  }


  public void setAge(List<QianchuanOrientationPackageGetV10DataListAge> age) {
    this.age = age;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner autoExtendEnabled(Integer autoExtendEnabled) {
    
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

   /**
   * 
   * @return autoExtendEnabled
  **/
  @javax.annotation.Nullable
  public Integer getAutoExtendEnabled() {
    return autoExtendEnabled;
  }


  public void setAutoExtendEnabled(Integer autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner autoExtendTargets(List<QianchuanOrientationPackageGetV10DataListAutoExtendTargets> autoExtendTargets) {
    
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addAutoExtendTargetsItem(QianchuanOrientationPackageGetV10DataListAutoExtendTargets autoExtendTargetsItem) {
    if (this.autoExtendTargets == null) {
      this.autoExtendTargets = new ArrayList<>();
    }
    this.autoExtendTargets.add(autoExtendTargetsItem);
    return this;
  }

   /**
   * 
   * @return autoExtendTargets
  **/
  @javax.annotation.Nullable
  public List<QianchuanOrientationPackageGetV10DataListAutoExtendTargets> getAutoExtendTargets() {
    return autoExtendTargets;
  }


  public void setAutoExtendTargets(List<QianchuanOrientationPackageGetV10DataListAutoExtendTargets> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner awemeFanAccounts(List<Long> awemeFanAccounts) {
    
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addAwemeFanAccountsItem(Long awemeFanAccountsItem) {
    if (this.awemeFanAccounts == null) {
      this.awemeFanAccounts = new ArrayList<>();
    }
    this.awemeFanAccounts.add(awemeFanAccountsItem);
    return this;
  }

   /**
   * 
   * @return awemeFanAccounts
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeFanAccounts() {
    return awemeFanAccounts;
  }


  public void setAwemeFanAccounts(List<Long> awemeFanAccounts) {
    this.awemeFanAccounts = awemeFanAccounts;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner awemeFanBehaviors(List<QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors> awemeFanBehaviors) {
    
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addAwemeFanBehaviorsItem(QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors awemeFanBehaviorsItem) {
    if (this.awemeFanBehaviors == null) {
      this.awemeFanBehaviors = new ArrayList<>();
    }
    this.awemeFanBehaviors.add(awemeFanBehaviorsItem);
    return this;
  }

   /**
   * 
   * @return awemeFanBehaviors
  **/
  @javax.annotation.Nullable
  public List<QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors> getAwemeFanBehaviors() {
    return awemeFanBehaviors;
  }


  public void setAwemeFanBehaviors(List<QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner awemeFanBehaviorsDays(QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
    return this;
  }

   /**
   * Get awemeFanBehaviorsDays
   * @return awemeFanBehaviorsDays
  **/
  @javax.annotation.Nullable
  public QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays getAwemeFanBehaviorsDays() {
    return awemeFanBehaviorsDays;
  }


  public void setAwemeFanBehaviorsDays(QianchuanOrientationPackageGetV10DataListAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner awemeFanCategories(List<Long> awemeFanCategories) {
    
    this.awemeFanCategories = awemeFanCategories;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addAwemeFanCategoriesItem(Long awemeFanCategoriesItem) {
    if (this.awemeFanCategories == null) {
      this.awemeFanCategories = new ArrayList<>();
    }
    this.awemeFanCategories.add(awemeFanCategoriesItem);
    return this;
  }

   /**
   * 
   * @return awemeFanCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeFanCategories() {
    return awemeFanCategories;
  }


  public void setAwemeFanCategories(List<Long> awemeFanCategories) {
    this.awemeFanCategories = awemeFanCategories;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner district(QianchuanOrientationPackageGetV10DataListDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public QianchuanOrientationPackageGetV10DataListDistrict getDistrict() {
    return district;
  }


  public void setDistrict(QianchuanOrientationPackageGetV10DataListDistrict district) {
    this.district = district;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner gender(QianchuanOrientationPackageGetV10DataListGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public QianchuanOrientationPackageGetV10DataListGender getGender() {
    return gender;
  }


  public void setGender(QianchuanOrientationPackageGetV10DataListGender gender) {
    this.gender = gender;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner interestCategories(List<Long> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addInterestCategoriesItem(Long interestCategoriesItem) {
    if (this.interestCategories == null) {
      this.interestCategories = new ArrayList<>();
    }
    this.interestCategories.add(interestCategoriesItem);
    return this;
  }

   /**
   * 
   * @return interestCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getInterestCategories() {
    return interestCategories;
  }


  public void setInterestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner interestWords(List<Long> interestWords) {
    
    this.interestWords = interestWords;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addInterestWordsItem(Long interestWordsItem) {
    if (this.interestWords == null) {
      this.interestWords = new ArrayList<>();
    }
    this.interestWords.add(interestWordsItem);
    return this;
  }

   /**
   * 
   * @return interestWords
  **/
  @javax.annotation.Nullable
  public List<Long> getInterestWords() {
    return interestWords;
  }


  public void setInterestWords(List<Long> interestWords) {
    this.interestWords = interestWords;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner livePlatformTags(List<String> livePlatformTags) {
    
    this.livePlatformTags = livePlatformTags;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addLivePlatformTagsItem(String livePlatformTagsItem) {
    if (this.livePlatformTags == null) {
      this.livePlatformTags = new ArrayList<>();
    }
    this.livePlatformTags.add(livePlatformTagsItem);
    return this;
  }

   /**
   * 
   * @return livePlatformTags
  **/
  @javax.annotation.Nullable
  public List<String> getLivePlatformTags() {
    return livePlatformTags;
  }


  public void setLivePlatformTags(List<String> livePlatformTags) {
    this.livePlatformTags = livePlatformTags;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner locationType(QianchuanOrientationPackageGetV10DataListLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public QianchuanOrientationPackageGetV10DataListLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(QianchuanOrientationPackageGetV10DataListLocationType locationType) {
    this.locationType = locationType;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner newCustomer(QianchuanOrientationPackageGetV10DataListNewCustomer newCustomer) {
    
    this.newCustomer = newCustomer;
    return this;
  }

   /**
   * Get newCustomer
   * @return newCustomer
  **/
  @javax.annotation.Nullable
  public QianchuanOrientationPackageGetV10DataListNewCustomer getNewCustomer() {
    return newCustomer;
  }


  public void setNewCustomer(QianchuanOrientationPackageGetV10DataListNewCustomer newCustomer) {
    this.newCustomer = newCustomer;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner orientationId(Long orientationId) {
    
    this.orientationId = orientationId;
    return this;
  }

   /**
   * 
   * @return orientationId
  **/
  @javax.annotation.Nullable
  public Long getOrientationId() {
    return orientationId;
  }


  public void setOrientationId(Long orientationId) {
    this.orientationId = orientationId;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner orientationInfo(String orientationInfo) {
    
    this.orientationInfo = orientationInfo;
    return this;
  }

   /**
   * 
   * @return orientationInfo
  **/
  @javax.annotation.Nullable
  public String getOrientationInfo() {
    return orientationInfo;
  }


  public void setOrientationInfo(String orientationInfo) {
    this.orientationInfo = orientationInfo;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner orientationName(String orientationName) {
    
    this.orientationName = orientationName;
    return this;
  }

   /**
   * 
   * @return orientationName
  **/
  @javax.annotation.Nullable
  public String getOrientationName() {
    return orientationName;
  }


  public void setOrientationName(String orientationName) {
    this.orientationName = orientationName;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner platform(List<QianchuanOrientationPackageGetV10DataListPlatform> platform) {
    
    this.platform = platform;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addPlatformItem(QianchuanOrientationPackageGetV10DataListPlatform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<QianchuanOrientationPackageGetV10DataListPlatform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<QianchuanOrientationPackageGetV10DataListPlatform> platform) {
    this.platform = platform;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
    if (this.retargetingTagsExclude == null) {
      this.retargetingTagsExclude = new ArrayList<>();
    }
    this.retargetingTagsExclude.add(retargetingTagsExcludeItem);
    return this;
  }

   /**
   * 
   * @return retargetingTagsExclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsExclude() {
    return retargetingTagsExclude;
  }


  public void setRetargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public QianchuanOrientationPackageGetV10ResponseDataListInner addRetargetingTagsIncludeItem(Long retargetingTagsIncludeItem) {
    if (this.retargetingTagsInclude == null) {
      this.retargetingTagsInclude = new ArrayList<>();
    }
    this.retargetingTagsInclude.add(retargetingTagsIncludeItem);
    return this;
  }

   /**
   * 
   * @return retargetingTagsInclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsInclude() {
    return retargetingTagsInclude;
  }


  public void setRetargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
  }


  public QianchuanOrientationPackageGetV10ResponseDataListInner smartInterestAction(QianchuanOrientationPackageGetV10DataListSmartInterestAction smartInterestAction) {
    
    this.smartInterestAction = smartInterestAction;
    return this;
  }

   /**
   * Get smartInterestAction
   * @return smartInterestAction
  **/
  @javax.annotation.Nullable
  public QianchuanOrientationPackageGetV10DataListSmartInterestAction getSmartInterestAction() {
    return smartInterestAction;
  }


  public void setSmartInterestAction(QianchuanOrientationPackageGetV10DataListSmartInterestAction smartInterestAction) {
    this.smartInterestAction = smartInterestAction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanOrientationPackageGetV10ResponseDataListInner qianchuanOrientationPackageGetV10ResponseDataListInner = (QianchuanOrientationPackageGetV10ResponseDataListInner) o;
    return Objects.equals(this.inActiveRetargetingTags, qianchuanOrientationPackageGetV10ResponseDataListInner.inActiveRetargetingTags) &&
        Objects.equals(this.ac, qianchuanOrientationPackageGetV10ResponseDataListInner.ac) &&
        Objects.equals(this.actionCategories, qianchuanOrientationPackageGetV10ResponseDataListInner.actionCategories) &&
        Objects.equals(this.actionDays, qianchuanOrientationPackageGetV10ResponseDataListInner.actionDays) &&
        Objects.equals(this.actionScene, qianchuanOrientationPackageGetV10ResponseDataListInner.actionScene) &&
        Objects.equals(this.actionWords, qianchuanOrientationPackageGetV10ResponseDataListInner.actionWords) &&
        Objects.equals(this.adNum, qianchuanOrientationPackageGetV10ResponseDataListInner.adNum) &&
        Objects.equals(this.age, qianchuanOrientationPackageGetV10ResponseDataListInner.age) &&
        Objects.equals(this.autoExtendEnabled, qianchuanOrientationPackageGetV10ResponseDataListInner.autoExtendEnabled) &&
        Objects.equals(this.autoExtendTargets, qianchuanOrientationPackageGetV10ResponseDataListInner.autoExtendTargets) &&
        Objects.equals(this.awemeFanAccounts, qianchuanOrientationPackageGetV10ResponseDataListInner.awemeFanAccounts) &&
        Objects.equals(this.awemeFanBehaviors, qianchuanOrientationPackageGetV10ResponseDataListInner.awemeFanBehaviors) &&
        Objects.equals(this.awemeFanBehaviorsDays, qianchuanOrientationPackageGetV10ResponseDataListInner.awemeFanBehaviorsDays) &&
        Objects.equals(this.awemeFanCategories, qianchuanOrientationPackageGetV10ResponseDataListInner.awemeFanCategories) &&
        Objects.equals(this.city, qianchuanOrientationPackageGetV10ResponseDataListInner.city) &&
        Objects.equals(this.district, qianchuanOrientationPackageGetV10ResponseDataListInner.district) &&
        Objects.equals(this.gender, qianchuanOrientationPackageGetV10ResponseDataListInner.gender) &&
        Objects.equals(this.interestCategories, qianchuanOrientationPackageGetV10ResponseDataListInner.interestCategories) &&
        Objects.equals(this.interestWords, qianchuanOrientationPackageGetV10ResponseDataListInner.interestWords) &&
        Objects.equals(this.livePlatformTags, qianchuanOrientationPackageGetV10ResponseDataListInner.livePlatformTags) &&
        Objects.equals(this.locationType, qianchuanOrientationPackageGetV10ResponseDataListInner.locationType) &&
        Objects.equals(this.newCustomer, qianchuanOrientationPackageGetV10ResponseDataListInner.newCustomer) &&
        Objects.equals(this.orientationId, qianchuanOrientationPackageGetV10ResponseDataListInner.orientationId) &&
        Objects.equals(this.orientationInfo, qianchuanOrientationPackageGetV10ResponseDataListInner.orientationInfo) &&
        Objects.equals(this.orientationName, qianchuanOrientationPackageGetV10ResponseDataListInner.orientationName) &&
        Objects.equals(this.platform, qianchuanOrientationPackageGetV10ResponseDataListInner.platform) &&
        Objects.equals(this.retargetingTagsExclude, qianchuanOrientationPackageGetV10ResponseDataListInner.retargetingTagsExclude) &&
        Objects.equals(this.retargetingTagsInclude, qianchuanOrientationPackageGetV10ResponseDataListInner.retargetingTagsInclude) &&
        Objects.equals(this.smartInterestAction, qianchuanOrientationPackageGetV10ResponseDataListInner.smartInterestAction);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inActiveRetargetingTags, ac, actionCategories, actionDays, actionScene, actionWords, adNum, age, autoExtendEnabled, autoExtendTargets, awemeFanAccounts, awemeFanBehaviors, awemeFanBehaviorsDays, awemeFanCategories, city, district, gender, interestCategories, interestWords, livePlatformTags, locationType, newCustomer, orientationId, orientationInfo, orientationName, platform, retargetingTagsExclude, retargetingTagsInclude, smartInterestAction);
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
    sb.append("class QianchuanOrientationPackageGetV10ResponseDataListInner {\n");
    sb.append("    inActiveRetargetingTags: ").append(toIndentedString(inActiveRetargetingTags)).append("\n");
    sb.append("    ac: ").append(toIndentedString(ac)).append("\n");
    sb.append("    actionCategories: ").append(toIndentedString(actionCategories)).append("\n");
    sb.append("    actionDays: ").append(toIndentedString(actionDays)).append("\n");
    sb.append("    actionScene: ").append(toIndentedString(actionScene)).append("\n");
    sb.append("    actionWords: ").append(toIndentedString(actionWords)).append("\n");
    sb.append("    adNum: ").append(toIndentedString(adNum)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    autoExtendEnabled: ").append(toIndentedString(autoExtendEnabled)).append("\n");
    sb.append("    autoExtendTargets: ").append(toIndentedString(autoExtendTargets)).append("\n");
    sb.append("    awemeFanAccounts: ").append(toIndentedString(awemeFanAccounts)).append("\n");
    sb.append("    awemeFanBehaviors: ").append(toIndentedString(awemeFanBehaviors)).append("\n");
    sb.append("    awemeFanBehaviorsDays: ").append(toIndentedString(awemeFanBehaviorsDays)).append("\n");
    sb.append("    awemeFanCategories: ").append(toIndentedString(awemeFanCategories)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestCategories: ").append(toIndentedString(interestCategories)).append("\n");
    sb.append("    interestWords: ").append(toIndentedString(interestWords)).append("\n");
    sb.append("    livePlatformTags: ").append(toIndentedString(livePlatformTags)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    newCustomer: ").append(toIndentedString(newCustomer)).append("\n");
    sb.append("    orientationId: ").append(toIndentedString(orientationId)).append("\n");
    sb.append("    orientationInfo: ").append(toIndentedString(orientationInfo)).append("\n");
    sb.append("    orientationName: ").append(toIndentedString(orientationName)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    retargetingTagsExclude: ").append(toIndentedString(retargetingTagsExclude)).append("\n");
    sb.append("    retargetingTagsInclude: ").append(toIndentedString(retargetingTagsInclude)).append("\n");
    sb.append("    smartInterestAction: ").append(toIndentedString(smartInterestAction)).append("\n");
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
    openapiFields.add("InActive_retargeting_tags");
    openapiFields.add("ac");
    openapiFields.add("action_categories");
    openapiFields.add("action_days");
    openapiFields.add("action_scene");
    openapiFields.add("action_words");
    openapiFields.add("ad_num");
    openapiFields.add("age");
    openapiFields.add("auto_extend_enabled");
    openapiFields.add("auto_extend_targets");
    openapiFields.add("aweme_fan_accounts");
    openapiFields.add("aweme_fan_behaviors");
    openapiFields.add("aweme_fan_behaviors_days");
    openapiFields.add("aweme_fan_categories");
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("gender");
    openapiFields.add("interest_categories");
    openapiFields.add("interest_words");
    openapiFields.add("live_platform_tags");
    openapiFields.add("location_type");
    openapiFields.add("new_customer");
    openapiFields.add("orientation_id");
    openapiFields.add("orientation_info");
    openapiFields.add("orientation_name");
    openapiFields.add("platform");
    openapiFields.add("retargeting_tags_exclude");
    openapiFields.add("retargeting_tags_include");
    openapiFields.add("smart_interest_action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orientation_id");
    openapiRequiredFields.add("orientation_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanOrientationPackageGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanOrientationPackageGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanOrientationPackageGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanOrientationPackageGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanOrientationPackageGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanOrientationPackageGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanOrientationPackageGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanOrientationPackageGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanOrientationPackageGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanOrientationPackageGetV10ResponseDataListInner
  */
  public static QianchuanOrientationPackageGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanOrientationPackageGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanOrientationPackageGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

