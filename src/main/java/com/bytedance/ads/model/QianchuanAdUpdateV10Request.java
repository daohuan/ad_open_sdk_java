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
import com.bytedance.ads.model.QianchuanAdUpdateV10CreativeAutoGenerate;
import com.bytedance.ads.model.QianchuanAdUpdateV10DynamicCreative;
import com.bytedance.ads.model.QianchuanAdUpdateV10IsHomepageHide;
import com.bytedance.ads.model.QianchuanAdUpdateV10IsIntelligent;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestAudience;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestCreativeListInner;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestDeliverySetting;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestKeywordsInner;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestProgrammaticCreativeCard;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestProgrammaticCreativeTitleListInner;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestTrackUrl;
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
 * QianchuanAdUpdateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class QianchuanAdUpdateV10Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private QianchuanAdUpdateV10RequestAudience audience = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE = "creative_auto_generate";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE)
  private QianchuanAdUpdateV10CreativeAutoGenerate creativeAutoGenerate = null;

  public static final String SERIALIZED_NAME_CREATIVE_LIST = "creative_list";
  @SerializedName(SERIALIZED_NAME_CREATIVE_LIST)
  private List<QianchuanAdUpdateV10RequestCreativeListInner> creativeList = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private QianchuanAdUpdateV10RequestDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_DYNAMIC_CREATIVE = "dynamic_creative";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_CREATIVE)
  private QianchuanAdUpdateV10DynamicCreative dynamicCreative = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_ID = "first_industry_id";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_ID)
  private Long firstIndustryId = null;

  public static final String SERIALIZED_NAME_IS_HOMEPAGE_HIDE = "is_homepage_hide";
  @SerializedName(SERIALIZED_NAME_IS_HOMEPAGE_HIDE)
  private QianchuanAdUpdateV10IsHomepageHide isHomepageHide = null;

  public static final String SERIALIZED_NAME_IS_INTELLIGENT = "is_intelligent";
  @SerializedName(SERIALIZED_NAME_IS_INTELLIGENT)
  private QianchuanAdUpdateV10IsIntelligent isIntelligent = null;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<QianchuanAdUpdateV10RequestKeywordsInner> keywords = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_CARD = "programmatic_creative_card";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_CARD)
  private QianchuanAdUpdateV10RequestProgrammaticCreativeCard programmaticCreativeCard = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST = "programmatic_creative_media_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST)
  private List<QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner> programmaticCreativeMediaList = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_TITLE_LIST = "programmatic_creative_title_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_TITLE_LIST)
  private List<QianchuanAdUpdateV10RequestProgrammaticCreativeTitleListInner> programmaticCreativeTitleList = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_ID = "second_industry_id";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_ID)
  private Long secondIndustryId = null;

  public static final String SERIALIZED_NAME_THIRD_INDUSTRY_ID = "third_industry_id";
  @SerializedName(SERIALIZED_NAME_THIRD_INDUSTRY_ID)
  private Long thirdIndustryId = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private QianchuanAdUpdateV10RequestTrackUrl trackUrl = null;

  public QianchuanAdUpdateV10Request() {
  }

  public QianchuanAdUpdateV10Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanAdUpdateV10Request adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public QianchuanAdUpdateV10Request addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public QianchuanAdUpdateV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanAdUpdateV10Request audience(QianchuanAdUpdateV10RequestAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10RequestAudience getAudience() {
    return audience;
  }


  public void setAudience(QianchuanAdUpdateV10RequestAudience audience) {
    this.audience = audience;
  }


  public QianchuanAdUpdateV10Request creativeAutoGenerate(QianchuanAdUpdateV10CreativeAutoGenerate creativeAutoGenerate) {
    
    this.creativeAutoGenerate = creativeAutoGenerate;
    return this;
  }

   /**
   * Get creativeAutoGenerate
   * @return creativeAutoGenerate
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10CreativeAutoGenerate getCreativeAutoGenerate() {
    return creativeAutoGenerate;
  }


  public void setCreativeAutoGenerate(QianchuanAdUpdateV10CreativeAutoGenerate creativeAutoGenerate) {
    this.creativeAutoGenerate = creativeAutoGenerate;
  }


  public QianchuanAdUpdateV10Request creativeList(List<QianchuanAdUpdateV10RequestCreativeListInner> creativeList) {
    
    this.creativeList = creativeList;
    return this;
  }

  public QianchuanAdUpdateV10Request addCreativeListItem(QianchuanAdUpdateV10RequestCreativeListInner creativeListItem) {
    if (this.creativeList == null) {
      this.creativeList = new ArrayList<>();
    }
    this.creativeList.add(creativeListItem);
    return this;
  }

   /**
   * 
   * @return creativeList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdUpdateV10RequestCreativeListInner> getCreativeList() {
    return creativeList;
  }


  public void setCreativeList(List<QianchuanAdUpdateV10RequestCreativeListInner> creativeList) {
    this.creativeList = creativeList;
  }


  public QianchuanAdUpdateV10Request deliverySetting(QianchuanAdUpdateV10RequestDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nonnull
  public QianchuanAdUpdateV10RequestDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(QianchuanAdUpdateV10RequestDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public QianchuanAdUpdateV10Request dynamicCreative(QianchuanAdUpdateV10DynamicCreative dynamicCreative) {
    
    this.dynamicCreative = dynamicCreative;
    return this;
  }

   /**
   * Get dynamicCreative
   * @return dynamicCreative
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10DynamicCreative getDynamicCreative() {
    return dynamicCreative;
  }


  public void setDynamicCreative(QianchuanAdUpdateV10DynamicCreative dynamicCreative) {
    this.dynamicCreative = dynamicCreative;
  }


  public QianchuanAdUpdateV10Request firstIndustryId(Long firstIndustryId) {
    
    this.firstIndustryId = firstIndustryId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return firstIndustryId
  **/
  @javax.annotation.Nullable
  public Long getFirstIndustryId() {
    return firstIndustryId;
  }


  public void setFirstIndustryId(Long firstIndustryId) {
    this.firstIndustryId = firstIndustryId;
  }


  public QianchuanAdUpdateV10Request isHomepageHide(QianchuanAdUpdateV10IsHomepageHide isHomepageHide) {
    
    this.isHomepageHide = isHomepageHide;
    return this;
  }

   /**
   * Get isHomepageHide
   * @return isHomepageHide
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10IsHomepageHide getIsHomepageHide() {
    return isHomepageHide;
  }


  public void setIsHomepageHide(QianchuanAdUpdateV10IsHomepageHide isHomepageHide) {
    this.isHomepageHide = isHomepageHide;
  }


  public QianchuanAdUpdateV10Request isIntelligent(QianchuanAdUpdateV10IsIntelligent isIntelligent) {
    
    this.isIntelligent = isIntelligent;
    return this;
  }

   /**
   * Get isIntelligent
   * @return isIntelligent
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10IsIntelligent getIsIntelligent() {
    return isIntelligent;
  }


  public void setIsIntelligent(QianchuanAdUpdateV10IsIntelligent isIntelligent) {
    this.isIntelligent = isIntelligent;
  }


  public QianchuanAdUpdateV10Request keywords(List<QianchuanAdUpdateV10RequestKeywordsInner> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public QianchuanAdUpdateV10Request addKeywordsItem(QianchuanAdUpdateV10RequestKeywordsInner keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 
   * @return keywords
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdUpdateV10RequestKeywordsInner> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<QianchuanAdUpdateV10RequestKeywordsInner> keywords) {
    this.keywords = keywords;
  }


  public QianchuanAdUpdateV10Request name(String name) {
    
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


  public QianchuanAdUpdateV10Request programmaticCreativeCard(QianchuanAdUpdateV10RequestProgrammaticCreativeCard programmaticCreativeCard) {
    
    this.programmaticCreativeCard = programmaticCreativeCard;
    return this;
  }

   /**
   * Get programmaticCreativeCard
   * @return programmaticCreativeCard
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10RequestProgrammaticCreativeCard getProgrammaticCreativeCard() {
    return programmaticCreativeCard;
  }


  public void setProgrammaticCreativeCard(QianchuanAdUpdateV10RequestProgrammaticCreativeCard programmaticCreativeCard) {
    this.programmaticCreativeCard = programmaticCreativeCard;
  }


  public QianchuanAdUpdateV10Request programmaticCreativeMediaList(List<QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner> programmaticCreativeMediaList) {
    
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
    return this;
  }

  public QianchuanAdUpdateV10Request addProgrammaticCreativeMediaListItem(QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner programmaticCreativeMediaListItem) {
    if (this.programmaticCreativeMediaList == null) {
      this.programmaticCreativeMediaList = new ArrayList<>();
    }
    this.programmaticCreativeMediaList.add(programmaticCreativeMediaListItem);
    return this;
  }

   /**
   * 
   * @return programmaticCreativeMediaList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner> getProgrammaticCreativeMediaList() {
    return programmaticCreativeMediaList;
  }


  public void setProgrammaticCreativeMediaList(List<QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner> programmaticCreativeMediaList) {
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
  }


  public QianchuanAdUpdateV10Request programmaticCreativeTitleList(List<QianchuanAdUpdateV10RequestProgrammaticCreativeTitleListInner> programmaticCreativeTitleList) {
    
    this.programmaticCreativeTitleList = programmaticCreativeTitleList;
    return this;
  }

  public QianchuanAdUpdateV10Request addProgrammaticCreativeTitleListItem(QianchuanAdUpdateV10RequestProgrammaticCreativeTitleListInner programmaticCreativeTitleListItem) {
    if (this.programmaticCreativeTitleList == null) {
      this.programmaticCreativeTitleList = new ArrayList<>();
    }
    this.programmaticCreativeTitleList.add(programmaticCreativeTitleListItem);
    return this;
  }

   /**
   * 
   * @return programmaticCreativeTitleList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdUpdateV10RequestProgrammaticCreativeTitleListInner> getProgrammaticCreativeTitleList() {
    return programmaticCreativeTitleList;
  }


  public void setProgrammaticCreativeTitleList(List<QianchuanAdUpdateV10RequestProgrammaticCreativeTitleListInner> programmaticCreativeTitleList) {
    this.programmaticCreativeTitleList = programmaticCreativeTitleList;
  }


  public QianchuanAdUpdateV10Request secondIndustryId(Long secondIndustryId) {
    
    this.secondIndustryId = secondIndustryId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return secondIndustryId
  **/
  @javax.annotation.Nullable
  public Long getSecondIndustryId() {
    return secondIndustryId;
  }


  public void setSecondIndustryId(Long secondIndustryId) {
    this.secondIndustryId = secondIndustryId;
  }


  public QianchuanAdUpdateV10Request thirdIndustryId(Long thirdIndustryId) {
    
    this.thirdIndustryId = thirdIndustryId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return thirdIndustryId
  **/
  @javax.annotation.Nullable
  public Long getThirdIndustryId() {
    return thirdIndustryId;
  }


  public void setThirdIndustryId(Long thirdIndustryId) {
    this.thirdIndustryId = thirdIndustryId;
  }


  public QianchuanAdUpdateV10Request trackUrl(QianchuanAdUpdateV10RequestTrackUrl trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

   /**
   * Get trackUrl
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10RequestTrackUrl getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(QianchuanAdUpdateV10RequestTrackUrl trackUrl) {
    this.trackUrl = trackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdUpdateV10Request qianchuanAdUpdateV10Request = (QianchuanAdUpdateV10Request) o;
    return Objects.equals(this.adId, qianchuanAdUpdateV10Request.adId) &&
        Objects.equals(this.adKeywords, qianchuanAdUpdateV10Request.adKeywords) &&
        Objects.equals(this.advertiserId, qianchuanAdUpdateV10Request.advertiserId) &&
        Objects.equals(this.audience, qianchuanAdUpdateV10Request.audience) &&
        Objects.equals(this.creativeAutoGenerate, qianchuanAdUpdateV10Request.creativeAutoGenerate) &&
        Objects.equals(this.creativeList, qianchuanAdUpdateV10Request.creativeList) &&
        Objects.equals(this.deliverySetting, qianchuanAdUpdateV10Request.deliverySetting) &&
        Objects.equals(this.dynamicCreative, qianchuanAdUpdateV10Request.dynamicCreative) &&
        Objects.equals(this.firstIndustryId, qianchuanAdUpdateV10Request.firstIndustryId) &&
        Objects.equals(this.isHomepageHide, qianchuanAdUpdateV10Request.isHomepageHide) &&
        Objects.equals(this.isIntelligent, qianchuanAdUpdateV10Request.isIntelligent) &&
        Objects.equals(this.keywords, qianchuanAdUpdateV10Request.keywords) &&
        Objects.equals(this.name, qianchuanAdUpdateV10Request.name) &&
        Objects.equals(this.programmaticCreativeCard, qianchuanAdUpdateV10Request.programmaticCreativeCard) &&
        Objects.equals(this.programmaticCreativeMediaList, qianchuanAdUpdateV10Request.programmaticCreativeMediaList) &&
        Objects.equals(this.programmaticCreativeTitleList, qianchuanAdUpdateV10Request.programmaticCreativeTitleList) &&
        Objects.equals(this.secondIndustryId, qianchuanAdUpdateV10Request.secondIndustryId) &&
        Objects.equals(this.thirdIndustryId, qianchuanAdUpdateV10Request.thirdIndustryId) &&
        Objects.equals(this.trackUrl, qianchuanAdUpdateV10Request.trackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adKeywords, advertiserId, audience, creativeAutoGenerate, creativeList, deliverySetting, dynamicCreative, firstIndustryId, isHomepageHide, isIntelligent, keywords, name, programmaticCreativeCard, programmaticCreativeMediaList, programmaticCreativeTitleList, secondIndustryId, thirdIndustryId, trackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adKeywords: ").append(toIndentedString(adKeywords)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    creativeAutoGenerate: ").append(toIndentedString(creativeAutoGenerate)).append("\n");
    sb.append("    creativeList: ").append(toIndentedString(creativeList)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    dynamicCreative: ").append(toIndentedString(dynamicCreative)).append("\n");
    sb.append("    firstIndustryId: ").append(toIndentedString(firstIndustryId)).append("\n");
    sb.append("    isHomepageHide: ").append(toIndentedString(isHomepageHide)).append("\n");
    sb.append("    isIntelligent: ").append(toIndentedString(isIntelligent)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    programmaticCreativeCard: ").append(toIndentedString(programmaticCreativeCard)).append("\n");
    sb.append("    programmaticCreativeMediaList: ").append(toIndentedString(programmaticCreativeMediaList)).append("\n");
    sb.append("    programmaticCreativeTitleList: ").append(toIndentedString(programmaticCreativeTitleList)).append("\n");
    sb.append("    secondIndustryId: ").append(toIndentedString(secondIndustryId)).append("\n");
    sb.append("    thirdIndustryId: ").append(toIndentedString(thirdIndustryId)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("ad_keywords");
    openapiFields.add("advertiser_id");
    openapiFields.add("audience");
    openapiFields.add("creative_auto_generate");
    openapiFields.add("creative_list");
    openapiFields.add("delivery_setting");
    openapiFields.add("dynamic_creative");
    openapiFields.add("first_industry_id");
    openapiFields.add("is_homepage_hide");
    openapiFields.add("is_intelligent");
    openapiFields.add("keywords");
    openapiFields.add("name");
    openapiFields.add("programmatic_creative_card");
    openapiFields.add("programmatic_creative_media_list");
    openapiFields.add("programmatic_creative_title_list");
    openapiFields.add("second_industry_id");
    openapiFields.add("third_industry_id");
    openapiFields.add("track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("delivery_setting");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10Request
  */
  public static QianchuanAdUpdateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

