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
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoAudienceAutoExtendTargets;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoAudienceConvertedTimeDuration;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoAudienceDistrict;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoAudienceGender;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoAudienceLocationType;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsAdInfoAudienceSuperiorPopularityType;
import com.bytedance.ads.model.AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudienceGeolocationInner;
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
 * 定向信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<List<Long>> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_PACKAGE_ID = "audience_package_id";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_PACKAGE_ID)
  private Long audiencePackageId = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_ENABLED = "auto_extend_enabled";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_ENABLED)
  private Long autoExtendEnabled = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TARGETS = "auto_extend_targets";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TARGETS)
  private List<AdlabGroupListV30DataGroupsAdInfoAudienceAutoExtendTargets> autoExtendTargets = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_CONVERTED_TIME_DURATION = "converted_time_duration";
  @SerializedName(SERIALIZED_NAME_CONVERTED_TIME_DURATION)
  private AdlabGroupListV30DataGroupsAdInfoAudienceConvertedTimeDuration convertedTimeDuration = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private AdlabGroupListV30DataGroupsAdInfoAudienceDistrict district = null;

  public static final String SERIALIZED_NAME_EXCLUDE_FLOW_PACKAGE = "exclude_flow_package";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_FLOW_PACKAGE)
  private List<Long> excludeFlowPackage = null;

  public static final String SERIALIZED_NAME_FLOW_PACKAGE = "flow_package";
  @SerializedName(SERIALIZED_NAME_FLOW_PACKAGE)
  private List<List<Long>> flowPackage = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private AdlabGroupListV30DataGroupsAdInfoAudienceGender gender = null;

  public static final String SERIALIZED_NAME_GEOLOCATION = "geolocation";
  @SerializedName(SERIALIZED_NAME_GEOLOCATION)
  private List<AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudienceGeolocationInner> geolocation = null;

  public static final String SERIALIZED_NAME_HIDE_IF_CONVERTED = "hide_if_converted";
  @SerializedName(SERIALIZED_NAME_HIDE_IF_CONVERTED)
  private AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted hideIfConverted = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private AdlabGroupListV30DataGroupsAdInfoAudienceLocationType locationType = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<Long> platform = null;

  public static final String SERIALIZED_NAME_REGION_VERSION = "region_version";
  @SerializedName(SERIALIZED_NAME_REGION_VERSION)
  private String regionVersion = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE = "retargeting_tags_include";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE)
  private List<Long> retargetingTagsInclude = null;

  public static final String SERIALIZED_NAME_SUPERIOR_POPULARITY_TYPE = "superior_popularity_type";
  @SerializedName(SERIALIZED_NAME_SUPERIOR_POPULARITY_TYPE)
  private AdlabGroupListV30DataGroupsAdInfoAudienceSuperiorPopularityType superiorPopularityType = null;

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience() {
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience age(List<List<Long>> age) {
    
    this.age = age;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience addAgeItem(List<Long> ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 年龄
   * @return age
  **/
  @javax.annotation.Nullable
  public List<List<Long>> getAge() {
    return age;
  }


  public void setAge(List<List<Long>> age) {
    this.age = age;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience audiencePackageId(Long audiencePackageId) {
    
    this.audiencePackageId = audiencePackageId;
    return this;
  }

   /**
   * 定向包ID
   * @return audiencePackageId
  **/
  @javax.annotation.Nullable
  public Long getAudiencePackageId() {
    return audiencePackageId;
  }


  public void setAudiencePackageId(Long audiencePackageId) {
    this.audiencePackageId = audiencePackageId;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience autoExtendEnabled(Long autoExtendEnabled) {
    
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

   /**
   * 是否启用智能放量
   * @return autoExtendEnabled
  **/
  @javax.annotation.Nullable
  public Long getAutoExtendEnabled() {
    return autoExtendEnabled;
  }


  public void setAutoExtendEnabled(Long autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience autoExtendTargets(List<AdlabGroupListV30DataGroupsAdInfoAudienceAutoExtendTargets> autoExtendTargets) {
    
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience addAutoExtendTargetsItem(AdlabGroupListV30DataGroupsAdInfoAudienceAutoExtendTargets autoExtendTargetsItem) {
    if (this.autoExtendTargets == null) {
      this.autoExtendTargets = new ArrayList<>();
    }
    this.autoExtendTargets.add(autoExtendTargetsItem);
    return this;
  }

   /**
   * 可放开定向
   * @return autoExtendTargets
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupListV30DataGroupsAdInfoAudienceAutoExtendTargets> getAutoExtendTargets() {
    return autoExtendTargets;
  }


  public void setAutoExtendTargets(List<AdlabGroupListV30DataGroupsAdInfoAudienceAutoExtendTargets> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 地域定向省市或者区县列表
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience convertedTimeDuration(AdlabGroupListV30DataGroupsAdInfoAudienceConvertedTimeDuration convertedTimeDuration) {
    
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

   /**
   * Get convertedTimeDuration
   * @return convertedTimeDuration
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoAudienceConvertedTimeDuration getConvertedTimeDuration() {
    return convertedTimeDuration;
  }


  public void setConvertedTimeDuration(AdlabGroupListV30DataGroupsAdInfoAudienceConvertedTimeDuration convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience district(AdlabGroupListV30DataGroupsAdInfoAudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoAudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(AdlabGroupListV30DataGroupsAdInfoAudienceDistrict district) {
    this.district = district;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience excludeFlowPackage(List<Long> excludeFlowPackage) {
    
    this.excludeFlowPackage = excludeFlowPackage;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience addExcludeFlowPackageItem(Long excludeFlowPackageItem) {
    if (this.excludeFlowPackage == null) {
      this.excludeFlowPackage = new ArrayList<>();
    }
    this.excludeFlowPackage.add(excludeFlowPackageItem);
    return this;
  }

   /**
   * 排除定向逻辑
   * @return excludeFlowPackage
  **/
  @javax.annotation.Nullable
  public List<Long> getExcludeFlowPackage() {
    return excludeFlowPackage;
  }


  public void setExcludeFlowPackage(List<Long> excludeFlowPackage) {
    this.excludeFlowPackage = excludeFlowPackage;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience flowPackage(List<List<Long>> flowPackage) {
    
    this.flowPackage = flowPackage;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience addFlowPackageItem(List<Long> flowPackageItem) {
    if (this.flowPackage == null) {
      this.flowPackage = new ArrayList<>();
    }
    this.flowPackage.add(flowPackageItem);
    return this;
  }

   /**
   * 定向逻辑
   * @return flowPackage
  **/
  @javax.annotation.Nullable
  public List<List<Long>> getFlowPackage() {
    return flowPackage;
  }


  public void setFlowPackage(List<List<Long>> flowPackage) {
    this.flowPackage = flowPackage;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience gender(AdlabGroupListV30DataGroupsAdInfoAudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoAudienceGender getGender() {
    return gender;
  }


  public void setGender(AdlabGroupListV30DataGroupsAdInfoAudienceGender gender) {
    this.gender = gender;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience geolocation(List<AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudienceGeolocationInner> geolocation) {
    
    this.geolocation = geolocation;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience addGeolocationItem(AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudienceGeolocationInner geolocationItem) {
    if (this.geolocation == null) {
      this.geolocation = new ArrayList<>();
    }
    this.geolocation.add(geolocationItem);
    return this;
  }

   /**
   * 商圈定向
   * @return geolocation
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudienceGeolocationInner> getGeolocation() {
    return geolocation;
  }


  public void setGeolocation(List<AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudienceGeolocationInner> geolocation) {
    this.geolocation = geolocation;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience hideIfConverted(AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted hideIfConverted) {
    
    this.hideIfConverted = hideIfConverted;
    return this;
  }

   /**
   * Get hideIfConverted
   * @return hideIfConverted
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted getHideIfConverted() {
    return hideIfConverted;
  }


  public void setHideIfConverted(AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience locationType(AdlabGroupListV30DataGroupsAdInfoAudienceLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoAudienceLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(AdlabGroupListV30DataGroupsAdInfoAudienceLocationType locationType) {
    this.locationType = locationType;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience platform(List<Long> platform) {
    
    this.platform = platform;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience addPlatformItem(Long platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 受众平台
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<Long> getPlatform() {
    return platform;
  }


  public void setPlatform(List<Long> platform) {
    this.platform = platform;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience regionVersion(String regionVersion) {
    
    this.regionVersion = regionVersion;
    return this;
  }

   /**
   * 地理位置版本号
   * @return regionVersion
  **/
  @javax.annotation.Nullable
  public String getRegionVersion() {
    return regionVersion;
  }


  public void setRegionVersion(String regionVersion) {
    this.regionVersion = regionVersion;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
    if (this.retargetingTagsExclude == null) {
      this.retargetingTagsExclude = new ArrayList<>();
    }
    this.retargetingTagsExclude.add(retargetingTagsExcludeItem);
    return this;
  }

   /**
   * 排除人群包列表（自定义人群）
   * @return retargetingTagsExclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsExclude() {
    return retargetingTagsExclude;
  }


  public void setRetargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience addRetargetingTagsIncludeItem(Long retargetingTagsIncludeItem) {
    if (this.retargetingTagsInclude == null) {
      this.retargetingTagsInclude = new ArrayList<>();
    }
    this.retargetingTagsInclude.add(retargetingTagsIncludeItem);
    return this;
  }

   /**
   * 定向人群包列表（自定义人群）
   * @return retargetingTagsInclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsInclude() {
    return retargetingTagsInclude;
  }


  public void setRetargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience superiorPopularityType(AdlabGroupListV30DataGroupsAdInfoAudienceSuperiorPopularityType superiorPopularityType) {
    
    this.superiorPopularityType = superiorPopularityType;
    return this;
  }

   /**
   * Get superiorPopularityType
   * @return superiorPopularityType
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsAdInfoAudienceSuperiorPopularityType getSuperiorPopularityType() {
    return superiorPopularityType;
  }


  public void setSuperiorPopularityType(AdlabGroupListV30DataGroupsAdInfoAudienceSuperiorPopularityType superiorPopularityType) {
    this.superiorPopularityType = superiorPopularityType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience = (AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience) o;
    return Objects.equals(this.age, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.age) &&
        Objects.equals(this.audiencePackageId, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.audiencePackageId) &&
        Objects.equals(this.autoExtendEnabled, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.autoExtendEnabled) &&
        Objects.equals(this.autoExtendTargets, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.autoExtendTargets) &&
        Objects.equals(this.city, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.city) &&
        Objects.equals(this.convertedTimeDuration, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.convertedTimeDuration) &&
        Objects.equals(this.district, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.district) &&
        Objects.equals(this.excludeFlowPackage, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.excludeFlowPackage) &&
        Objects.equals(this.flowPackage, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.flowPackage) &&
        Objects.equals(this.gender, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.gender) &&
        Objects.equals(this.geolocation, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.geolocation) &&
        Objects.equals(this.hideIfConverted, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.hideIfConverted) &&
        Objects.equals(this.locationType, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.locationType) &&
        Objects.equals(this.platform, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.platform) &&
        Objects.equals(this.regionVersion, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.regionVersion) &&
        Objects.equals(this.retargetingTagsExclude, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.retargetingTagsExclude) &&
        Objects.equals(this.retargetingTagsInclude, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.retargetingTagsInclude) &&
        Objects.equals(this.superiorPopularityType, adlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.superiorPopularityType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, audiencePackageId, autoExtendEnabled, autoExtendTargets, city, convertedTimeDuration, district, excludeFlowPackage, flowPackage, gender, geolocation, hideIfConverted, locationType, platform, regionVersion, retargetingTagsExclude, retargetingTagsInclude, superiorPopularityType);
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
    sb.append("class AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    audiencePackageId: ").append(toIndentedString(audiencePackageId)).append("\n");
    sb.append("    autoExtendEnabled: ").append(toIndentedString(autoExtendEnabled)).append("\n");
    sb.append("    autoExtendTargets: ").append(toIndentedString(autoExtendTargets)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    convertedTimeDuration: ").append(toIndentedString(convertedTimeDuration)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    excludeFlowPackage: ").append(toIndentedString(excludeFlowPackage)).append("\n");
    sb.append("    flowPackage: ").append(toIndentedString(flowPackage)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    hideIfConverted: ").append(toIndentedString(hideIfConverted)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    regionVersion: ").append(toIndentedString(regionVersion)).append("\n");
    sb.append("    retargetingTagsExclude: ").append(toIndentedString(retargetingTagsExclude)).append("\n");
    sb.append("    retargetingTagsInclude: ").append(toIndentedString(retargetingTagsInclude)).append("\n");
    sb.append("    superiorPopularityType: ").append(toIndentedString(superiorPopularityType)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("audience_package_id");
    openapiFields.add("auto_extend_enabled");
    openapiFields.add("auto_extend_targets");
    openapiFields.add("city");
    openapiFields.add("converted_time_duration");
    openapiFields.add("district");
    openapiFields.add("exclude_flow_package");
    openapiFields.add("flow_package");
    openapiFields.add("gender");
    openapiFields.add("geolocation");
    openapiFields.add("hide_if_converted");
    openapiFields.add("location_type");
    openapiFields.add("platform");
    openapiFields.add("region_version");
    openapiFields.add("retargeting_tags_exclude");
    openapiFields.add("retargeting_tags_include");
    openapiFields.add("superior_popularity_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience>() {
           @Override
           public void write(JsonWriter out, AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience
  */
  public static AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience.class);
  }

 /**
  * Convert an instance of AdlabGroupListV30ResponseDataGroupsInnerAdInfoAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

