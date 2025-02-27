/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAudienceAutoExtendTargets;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAudienceConvertedTimeDuration;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAudienceDistrict;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAudienceGender;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAudienceHideIfConverted;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAudienceLocationType;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAudiencePlatform;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoAudienceSuperiorPopularityType;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataAdInfoAudienceGeolocationInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataDataAdInfoAudience {
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
  private List<AdlabGroupDetailV30DataDataAdInfoAudienceAutoExtendTargets> autoExtendTargets = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_CONVERTED_TIME_DURATION = "converted_time_duration";
  @SerializedName(SERIALIZED_NAME_CONVERTED_TIME_DURATION)
  private AdlabGroupDetailV30DataDataAdInfoAudienceConvertedTimeDuration convertedTimeDuration = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private AdlabGroupDetailV30DataDataAdInfoAudienceDistrict district = null;

  public static final String SERIALIZED_NAME_EXCLUDE_FLOW_PACKAGE = "exclude_flow_package";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_FLOW_PACKAGE)
  private List<Long> excludeFlowPackage = null;

  public static final String SERIALIZED_NAME_FLOW_PACKAGE = "flow_package";
  @SerializedName(SERIALIZED_NAME_FLOW_PACKAGE)
  private List<Long> flowPackage = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private AdlabGroupDetailV30DataDataAdInfoAudienceGender gender = null;

  public static final String SERIALIZED_NAME_GEOLOCATION = "geolocation";
  @SerializedName(SERIALIZED_NAME_GEOLOCATION)
  private List<AdlabGroupDetailV30ResponseDataDataAdInfoAudienceGeolocationInner> geolocation = null;

  public static final String SERIALIZED_NAME_HIDE_IF_CONVERTED = "hide_if_converted";
  @SerializedName(SERIALIZED_NAME_HIDE_IF_CONVERTED)
  private AdlabGroupDetailV30DataDataAdInfoAudienceHideIfConverted hideIfConverted = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private AdlabGroupDetailV30DataDataAdInfoAudienceLocationType locationType = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<AdlabGroupDetailV30DataDataAdInfoAudiencePlatform> platform = null;

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
  private AdlabGroupDetailV30DataDataAdInfoAudienceSuperiorPopularityType superiorPopularityType = null;

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience() {
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience age(List<List<Long>> age) {
    
    this.age = age;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience addAgeItem(List<Long> ageItem) {
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


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience audiencePackageId(Long audiencePackageId) {
    
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


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience autoExtendEnabled(Long autoExtendEnabled) {
    
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

   /**
   * 是否开启智能放量
   * @return autoExtendEnabled
  **/
  @javax.annotation.Nullable
  public Long getAutoExtendEnabled() {
    return autoExtendEnabled;
  }


  public void setAutoExtendEnabled(Long autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience autoExtendTargets(List<AdlabGroupDetailV30DataDataAdInfoAudienceAutoExtendTargets> autoExtendTargets) {
    
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience addAutoExtendTargetsItem(AdlabGroupDetailV30DataDataAdInfoAudienceAutoExtendTargets autoExtendTargetsItem) {
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
  public List<AdlabGroupDetailV30DataDataAdInfoAudienceAutoExtendTargets> getAutoExtendTargets() {
    return autoExtendTargets;
  }


  public void setAutoExtendTargets(List<AdlabGroupDetailV30DataDataAdInfoAudienceAutoExtendTargets> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience addCityItem(Long cityItem) {
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


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience convertedTimeDuration(AdlabGroupDetailV30DataDataAdInfoAudienceConvertedTimeDuration convertedTimeDuration) {
    
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

   /**
   * Get convertedTimeDuration
   * @return convertedTimeDuration
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoAudienceConvertedTimeDuration getConvertedTimeDuration() {
    return convertedTimeDuration;
  }


  public void setConvertedTimeDuration(AdlabGroupDetailV30DataDataAdInfoAudienceConvertedTimeDuration convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience district(AdlabGroupDetailV30DataDataAdInfoAudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoAudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(AdlabGroupDetailV30DataDataAdInfoAudienceDistrict district) {
    this.district = district;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience excludeFlowPackage(List<Long> excludeFlowPackage) {
    
    this.excludeFlowPackage = excludeFlowPackage;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience addExcludeFlowPackageItem(Long excludeFlowPackageItem) {
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


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience flowPackage(List<Long> flowPackage) {
    
    this.flowPackage = flowPackage;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience addFlowPackageItem(Long flowPackageItem) {
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
  public List<Long> getFlowPackage() {
    return flowPackage;
  }


  public void setFlowPackage(List<Long> flowPackage) {
    this.flowPackage = flowPackage;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience gender(AdlabGroupDetailV30DataDataAdInfoAudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoAudienceGender getGender() {
    return gender;
  }


  public void setGender(AdlabGroupDetailV30DataDataAdInfoAudienceGender gender) {
    this.gender = gender;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience geolocation(List<AdlabGroupDetailV30ResponseDataDataAdInfoAudienceGeolocationInner> geolocation) {
    
    this.geolocation = geolocation;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience addGeolocationItem(AdlabGroupDetailV30ResponseDataDataAdInfoAudienceGeolocationInner geolocationItem) {
    if (this.geolocation == null) {
      this.geolocation = new ArrayList<>();
    }
    this.geolocation.add(geolocationItem);
    return this;
  }

   /**
   * 商圈定向信息
   * @return geolocation
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupDetailV30ResponseDataDataAdInfoAudienceGeolocationInner> getGeolocation() {
    return geolocation;
  }


  public void setGeolocation(List<AdlabGroupDetailV30ResponseDataDataAdInfoAudienceGeolocationInner> geolocation) {
    this.geolocation = geolocation;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience hideIfConverted(AdlabGroupDetailV30DataDataAdInfoAudienceHideIfConverted hideIfConverted) {
    
    this.hideIfConverted = hideIfConverted;
    return this;
  }

   /**
   * Get hideIfConverted
   * @return hideIfConverted
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoAudienceHideIfConverted getHideIfConverted() {
    return hideIfConverted;
  }


  public void setHideIfConverted(AdlabGroupDetailV30DataDataAdInfoAudienceHideIfConverted hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience locationType(AdlabGroupDetailV30DataDataAdInfoAudienceLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoAudienceLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(AdlabGroupDetailV30DataDataAdInfoAudienceLocationType locationType) {
    this.locationType = locationType;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience platform(List<AdlabGroupDetailV30DataDataAdInfoAudiencePlatform> platform) {
    
    this.platform = platform;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience addPlatformItem(AdlabGroupDetailV30DataDataAdInfoAudiencePlatform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 平台
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupDetailV30DataDataAdInfoAudiencePlatform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<AdlabGroupDetailV30DataDataAdInfoAudiencePlatform> platform) {
    this.platform = platform;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience regionVersion(String regionVersion) {
    
    this.regionVersion = regionVersion;
    return this;
  }

   /**
   * 行政区域版本号
   * @return regionVersion
  **/
  @javax.annotation.Nullable
  public String getRegionVersion() {
    return regionVersion;
  }


  public void setRegionVersion(String regionVersion) {
    this.regionVersion = regionVersion;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
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


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience addRetargetingTagsIncludeItem(Long retargetingTagsIncludeItem) {
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


  public AdlabGroupDetailV30ResponseDataDataAdInfoAudience superiorPopularityType(AdlabGroupDetailV30DataDataAdInfoAudienceSuperiorPopularityType superiorPopularityType) {
    
    this.superiorPopularityType = superiorPopularityType;
    return this;
  }

   /**
   * Get superiorPopularityType
   * @return superiorPopularityType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoAudienceSuperiorPopularityType getSuperiorPopularityType() {
    return superiorPopularityType;
  }


  public void setSuperiorPopularityType(AdlabGroupDetailV30DataDataAdInfoAudienceSuperiorPopularityType superiorPopularityType) {
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
    AdlabGroupDetailV30ResponseDataDataAdInfoAudience adlabGroupDetailV30ResponseDataDataAdInfoAudience = (AdlabGroupDetailV30ResponseDataDataAdInfoAudience) o;
    return Objects.equals(this.age, adlabGroupDetailV30ResponseDataDataAdInfoAudience.age) &&
        Objects.equals(this.audiencePackageId, adlabGroupDetailV30ResponseDataDataAdInfoAudience.audiencePackageId) &&
        Objects.equals(this.autoExtendEnabled, adlabGroupDetailV30ResponseDataDataAdInfoAudience.autoExtendEnabled) &&
        Objects.equals(this.autoExtendTargets, adlabGroupDetailV30ResponseDataDataAdInfoAudience.autoExtendTargets) &&
        Objects.equals(this.city, adlabGroupDetailV30ResponseDataDataAdInfoAudience.city) &&
        Objects.equals(this.convertedTimeDuration, adlabGroupDetailV30ResponseDataDataAdInfoAudience.convertedTimeDuration) &&
        Objects.equals(this.district, adlabGroupDetailV30ResponseDataDataAdInfoAudience.district) &&
        Objects.equals(this.excludeFlowPackage, adlabGroupDetailV30ResponseDataDataAdInfoAudience.excludeFlowPackage) &&
        Objects.equals(this.flowPackage, adlabGroupDetailV30ResponseDataDataAdInfoAudience.flowPackage) &&
        Objects.equals(this.gender, adlabGroupDetailV30ResponseDataDataAdInfoAudience.gender) &&
        Objects.equals(this.geolocation, adlabGroupDetailV30ResponseDataDataAdInfoAudience.geolocation) &&
        Objects.equals(this.hideIfConverted, adlabGroupDetailV30ResponseDataDataAdInfoAudience.hideIfConverted) &&
        Objects.equals(this.locationType, adlabGroupDetailV30ResponseDataDataAdInfoAudience.locationType) &&
        Objects.equals(this.platform, adlabGroupDetailV30ResponseDataDataAdInfoAudience.platform) &&
        Objects.equals(this.regionVersion, adlabGroupDetailV30ResponseDataDataAdInfoAudience.regionVersion) &&
        Objects.equals(this.retargetingTagsExclude, adlabGroupDetailV30ResponseDataDataAdInfoAudience.retargetingTagsExclude) &&
        Objects.equals(this.retargetingTagsInclude, adlabGroupDetailV30ResponseDataDataAdInfoAudience.retargetingTagsInclude) &&
        Objects.equals(this.superiorPopularityType, adlabGroupDetailV30ResponseDataDataAdInfoAudience.superiorPopularityType);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataAdInfoAudience {\n");
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
       if (!AdlabGroupDetailV30ResponseDataDataAdInfoAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataAdInfoAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataAdInfoAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoAudience>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataAdInfoAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataAdInfoAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataAdInfoAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataAdInfoAudience
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataAdInfoAudience
  */
  public static AdlabGroupDetailV30ResponseDataDataAdInfoAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataAdInfoAudience.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataAdInfoAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

