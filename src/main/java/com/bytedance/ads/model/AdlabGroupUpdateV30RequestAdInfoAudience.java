/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoAudienceAutoExtendTargets;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoAudienceDistrict;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoAudienceGender;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoAudienceHideIfConverted;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoAudienceLocationType;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoAudiencePlatform;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoAudienceSuperiorPopularityType;
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner;
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
 * 定向信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class AdlabGroupUpdateV30RequestAdInfoAudience {
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
  private List<AdlabGroupUpdateV30AdInfoAudienceAutoExtendTargets> autoExtendTargets = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_CONVERTED_TIME_DURATION = "converted_time_duration";
  @SerializedName(SERIALIZED_NAME_CONVERTED_TIME_DURATION)
  private AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration convertedTimeDuration = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private AdlabGroupUpdateV30AdInfoAudienceDistrict district = null;

  public static final String SERIALIZED_NAME_EXCLUDE_FLOW_PACKAGE = "exclude_flow_package";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_FLOW_PACKAGE)
  private List<Long> excludeFlowPackage = null;

  public static final String SERIALIZED_NAME_FLOW_PACKAGE = "flow_package";
  @SerializedName(SERIALIZED_NAME_FLOW_PACKAGE)
  private List<Long> flowPackage = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private AdlabGroupUpdateV30AdInfoAudienceGender gender = null;

  public static final String SERIALIZED_NAME_GEOLOCATION = "geolocation";
  @SerializedName(SERIALIZED_NAME_GEOLOCATION)
  private List<AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner> geolocation = null;

  public static final String SERIALIZED_NAME_HIDE_IF_CONVERTED = "hide_if_converted";
  @SerializedName(SERIALIZED_NAME_HIDE_IF_CONVERTED)
  private AdlabGroupUpdateV30AdInfoAudienceHideIfConverted hideIfConverted = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private AdlabGroupUpdateV30AdInfoAudienceLocationType locationType = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<AdlabGroupUpdateV30AdInfoAudiencePlatform> platform = null;

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
  private AdlabGroupUpdateV30AdInfoAudienceSuperiorPopularityType superiorPopularityType = null;

  public AdlabGroupUpdateV30RequestAdInfoAudience() {
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience age(List<List<Long>> age) {
    
    this.age = age;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience addAgeItem(List<Long> ageItem) {
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


  public AdlabGroupUpdateV30RequestAdInfoAudience audiencePackageId(Long audiencePackageId) {
    
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


  public AdlabGroupUpdateV30RequestAdInfoAudience autoExtendEnabled(Long autoExtendEnabled) {
    
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


  public AdlabGroupUpdateV30RequestAdInfoAudience autoExtendTargets(List<AdlabGroupUpdateV30AdInfoAudienceAutoExtendTargets> autoExtendTargets) {
    
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience addAutoExtendTargetsItem(AdlabGroupUpdateV30AdInfoAudienceAutoExtendTargets autoExtendTargetsItem) {
    if (this.autoExtendTargets == null) {
      this.autoExtendTargets = new ArrayList<>();
    }
    this.autoExtendTargets.add(autoExtendTargetsItem);
    return this;
  }

   /**
   * 可放开定向，该字段不为空时表示开启智能放量，传空时表示不开启智能放量
   * @return autoExtendTargets
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupUpdateV30AdInfoAudienceAutoExtendTargets> getAutoExtendTargets() {
    return autoExtendTargets;
  }


  public void setAutoExtendTargets(List<AdlabGroupUpdateV30AdInfoAudienceAutoExtendTargets> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 地域定向省市或者区县列表，当district&#x3D;CITY时必填
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience convertedTimeDuration(AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration convertedTimeDuration) {
    
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

   /**
   * Get convertedTimeDuration
   * @return convertedTimeDuration
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration getConvertedTimeDuration() {
    return convertedTimeDuration;
  }


  public void setConvertedTimeDuration(AdlabGroupUpdateV30AdInfoAudienceConvertedTimeDuration convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience district(AdlabGroupUpdateV30AdInfoAudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30AdInfoAudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(AdlabGroupUpdateV30AdInfoAudienceDistrict district) {
    this.district = district;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience excludeFlowPackage(List<Long> excludeFlowPackage) {
    
    this.excludeFlowPackage = excludeFlowPackage;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience addExcludeFlowPackageItem(Long excludeFlowPackageItem) {
    if (this.excludeFlowPackage == null) {
      this.excludeFlowPackage = new ArrayList<>();
    }
    this.excludeFlowPackage.add(excludeFlowPackageItem);
    return this;
  }

   /**
   * 排除定向逻辑，当广告位只选择穿山甲时可选 定向逻辑和排除定向逻辑只能选其一
   * @return excludeFlowPackage
  **/
  @javax.annotation.Nullable
  public List<Long> getExcludeFlowPackage() {
    return excludeFlowPackage;
  }


  public void setExcludeFlowPackage(List<Long> excludeFlowPackage) {
    this.excludeFlowPackage = excludeFlowPackage;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience flowPackage(List<Long> flowPackage) {
    
    this.flowPackage = flowPackage;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience addFlowPackageItem(Long flowPackageItem) {
    if (this.flowPackage == null) {
      this.flowPackage = new ArrayList<>();
    }
    this.flowPackage.add(flowPackageItem);
    return this;
  }

   /**
   * 定向逻辑，当广告位只选择穿山甲时可选 定向逻辑和排除定向逻辑只能选其一
   * @return flowPackage
  **/
  @javax.annotation.Nullable
  public List<Long> getFlowPackage() {
    return flowPackage;
  }


  public void setFlowPackage(List<Long> flowPackage) {
    this.flowPackage = flowPackage;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience gender(AdlabGroupUpdateV30AdInfoAudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30AdInfoAudienceGender getGender() {
    return gender;
  }


  public void setGender(AdlabGroupUpdateV30AdInfoAudienceGender gender) {
    this.gender = gender;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience geolocation(List<AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner> geolocation) {
    
    this.geolocation = geolocation;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience addGeolocationItem(AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner geolocationItem) {
    if (this.geolocation == null) {
      this.geolocation = new ArrayList<>();
    }
    this.geolocation.add(geolocationItem);
    return this;
  }

   /**
   * 商圈定向，当district选择\&quot;BUSINESS_DISTRICT\&quot;时必填，最多允许选择100个
   * @return geolocation
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner> getGeolocation() {
    return geolocation;
  }


  public void setGeolocation(List<AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner> geolocation) {
    this.geolocation = geolocation;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience hideIfConverted(AdlabGroupUpdateV30AdInfoAudienceHideIfConverted hideIfConverted) {
    
    this.hideIfConverted = hideIfConverted;
    return this;
  }

   /**
   * Get hideIfConverted
   * @return hideIfConverted
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30AdInfoAudienceHideIfConverted getHideIfConverted() {
    return hideIfConverted;
  }


  public void setHideIfConverted(AdlabGroupUpdateV30AdInfoAudienceHideIfConverted hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience locationType(AdlabGroupUpdateV30AdInfoAudienceLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30AdInfoAudienceLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(AdlabGroupUpdateV30AdInfoAudienceLocationType locationType) {
    this.locationType = locationType;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience platform(List<AdlabGroupUpdateV30AdInfoAudiencePlatform> platform) {
    
    this.platform = platform;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience addPlatformItem(AdlabGroupUpdateV30AdInfoAudiencePlatform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 平台，当下载方式包含下载链接时，平台类型需与选择的下载链接类型对应，当下载方式不包含下载链接的时候，平台可多选。
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupUpdateV30AdInfoAudiencePlatform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<AdlabGroupUpdateV30AdInfoAudiencePlatform> platform) {
    this.platform = platform;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience regionVersion(String regionVersion) {
    
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


  public AdlabGroupUpdateV30RequestAdInfoAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
    if (this.retargetingTagsExclude == null) {
      this.retargetingTagsExclude = new ArrayList<>();
    }
    this.retargetingTagsExclude.add(retargetingTagsExcludeItem);
    return this;
  }

   /**
   * 排除人群包列表（自定义人群） 内容为人群包id
   * @return retargetingTagsExclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsExclude() {
    return retargetingTagsExclude;
  }


  public void setRetargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfoAudience addRetargetingTagsIncludeItem(Long retargetingTagsIncludeItem) {
    if (this.retargetingTagsInclude == null) {
      this.retargetingTagsInclude = new ArrayList<>();
    }
    this.retargetingTagsInclude.add(retargetingTagsIncludeItem);
    return this;
  }

   /**
   * 定向人群包列表（自定义人群） 内容为人群包id
   * @return retargetingTagsInclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsInclude() {
    return retargetingTagsInclude;
  }


  public void setRetargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudience superiorPopularityType(AdlabGroupUpdateV30AdInfoAudienceSuperiorPopularityType superiorPopularityType) {
    
    this.superiorPopularityType = superiorPopularityType;
    return this;
  }

   /**
   * Get superiorPopularityType
   * @return superiorPopularityType
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30AdInfoAudienceSuperiorPopularityType getSuperiorPopularityType() {
    return superiorPopularityType;
  }


  public void setSuperiorPopularityType(AdlabGroupUpdateV30AdInfoAudienceSuperiorPopularityType superiorPopularityType) {
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
    AdlabGroupUpdateV30RequestAdInfoAudience adlabGroupUpdateV30RequestAdInfoAudience = (AdlabGroupUpdateV30RequestAdInfoAudience) o;
    return Objects.equals(this.age, adlabGroupUpdateV30RequestAdInfoAudience.age) &&
        Objects.equals(this.audiencePackageId, adlabGroupUpdateV30RequestAdInfoAudience.audiencePackageId) &&
        Objects.equals(this.autoExtendEnabled, adlabGroupUpdateV30RequestAdInfoAudience.autoExtendEnabled) &&
        Objects.equals(this.autoExtendTargets, adlabGroupUpdateV30RequestAdInfoAudience.autoExtendTargets) &&
        Objects.equals(this.city, adlabGroupUpdateV30RequestAdInfoAudience.city) &&
        Objects.equals(this.convertedTimeDuration, adlabGroupUpdateV30RequestAdInfoAudience.convertedTimeDuration) &&
        Objects.equals(this.district, adlabGroupUpdateV30RequestAdInfoAudience.district) &&
        Objects.equals(this.excludeFlowPackage, adlabGroupUpdateV30RequestAdInfoAudience.excludeFlowPackage) &&
        Objects.equals(this.flowPackage, adlabGroupUpdateV30RequestAdInfoAudience.flowPackage) &&
        Objects.equals(this.gender, adlabGroupUpdateV30RequestAdInfoAudience.gender) &&
        Objects.equals(this.geolocation, adlabGroupUpdateV30RequestAdInfoAudience.geolocation) &&
        Objects.equals(this.hideIfConverted, adlabGroupUpdateV30RequestAdInfoAudience.hideIfConverted) &&
        Objects.equals(this.locationType, adlabGroupUpdateV30RequestAdInfoAudience.locationType) &&
        Objects.equals(this.platform, adlabGroupUpdateV30RequestAdInfoAudience.platform) &&
        Objects.equals(this.regionVersion, adlabGroupUpdateV30RequestAdInfoAudience.regionVersion) &&
        Objects.equals(this.retargetingTagsExclude, adlabGroupUpdateV30RequestAdInfoAudience.retargetingTagsExclude) &&
        Objects.equals(this.retargetingTagsInclude, adlabGroupUpdateV30RequestAdInfoAudience.retargetingTagsInclude) &&
        Objects.equals(this.superiorPopularityType, adlabGroupUpdateV30RequestAdInfoAudience.superiorPopularityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, audiencePackageId, autoExtendEnabled, autoExtendTargets, city, convertedTimeDuration, district, excludeFlowPackage, flowPackage, gender, geolocation, hideIfConverted, locationType, platform, regionVersion, retargetingTagsExclude, retargetingTagsInclude, superiorPopularityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupUpdateV30RequestAdInfoAudience {\n");
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
       if (!AdlabGroupUpdateV30RequestAdInfoAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateV30RequestAdInfoAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateV30RequestAdInfoAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateV30RequestAdInfoAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateV30RequestAdInfoAudience>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateV30RequestAdInfoAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateV30RequestAdInfoAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateV30RequestAdInfoAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateV30RequestAdInfoAudience
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateV30RequestAdInfoAudience
  */
  public static AdlabGroupUpdateV30RequestAdInfoAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateV30RequestAdInfoAudience.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateV30RequestAdInfoAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

