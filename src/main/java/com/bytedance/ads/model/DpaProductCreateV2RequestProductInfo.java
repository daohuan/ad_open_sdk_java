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
import com.bytedance.ads.model.DpaProductCreateV2RequestProductInfoBrandInfo;
import com.bytedance.ads.model.DpaProductCreateV2RequestProductInfoGeo;
import com.bytedance.ads.model.DpaProductCreateV2RequestProductInfoLandingInfo;
import com.bytedance.ads.model.DpaProductCreateV2RequestProductInfoPriceInfo;
import com.bytedance.ads.model.DpaProductCreateV2RequestProductInfoShopKeeperInfo;
import com.bytedance.ads.model.DpaProductCreateV2RequestProductInfoVideosInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class DpaProductCreateV2RequestProductInfo {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<Long> age = null;

  public static final String SERIALIZED_NAME_BOUGHT = "bought";
  @SerializedName(SERIALIZED_NAME_BOUGHT)
  private Long bought = null;

  public static final String SERIALIZED_NAME_BRAND_INFO = "brand_info";
  @SerializedName(SERIALIZED_NAME_BRAND_INFO)
  private DpaProductCreateV2RequestProductInfoBrandInfo brandInfo = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<String> city = null;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private Long comments = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private String feature = null;

  public static final String SERIALIZED_NAME_FIRST_CATEGORY = "first_category";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY)
  private String firstCategory = null;

  public static final String SERIALIZED_NAME_FIRST_CATEGORY_ID = "first_category_id";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY_ID)
  private String firstCategoryId = null;

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private DpaProductCreateV2RequestProductInfoGeo geo = null;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = null;

  public static final String SERIALIZED_NAME_IMAGE_URLS = "image_urls";
  @SerializedName(SERIALIZED_NAME_IMAGE_URLS)
  private List<String> imageUrls = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private List<String> label = null;

  public static final String SERIALIZED_NAME_LANDING_INFO = "landing_info";
  @SerializedName(SERIALIZED_NAME_LANDING_INFO)
  private DpaProductCreateV2RequestProductInfoLandingInfo landingInfo = null;

  public static final String SERIALIZED_NAME_MARK = "mark";
  @SerializedName(SERIALIZED_NAME_MARK)
  private Double mark = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_OFFLINE_TIME = "offline_time";
  @SerializedName(SERIALIZED_NAME_OFFLINE_TIME)
  private Long offlineTime = null;

  public static final String SERIALIZED_NAME_ONLINE_TIME = "online_time";
  @SerializedName(SERIALIZED_NAME_ONLINE_TIME)
  private Long onlineTime = null;

  public static final String SERIALIZED_NAME_OUTER_ID = "outer_id";
  @SerializedName(SERIALIZED_NAME_OUTER_ID)
  private String outerId = null;

  public static final String SERIALIZED_NAME_PRICE_INFO = "price_info";
  @SerializedName(SERIALIZED_NAME_PRICE_INFO)
  private DpaProductCreateV2RequestProductInfoPriceInfo priceInfo = null;

  public static final String SERIALIZED_NAME_PROFESSION = "profession";
  @SerializedName(SERIALIZED_NAME_PROFESSION)
  private Map<String, String> profession = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private List<String> province = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_INFO = "shop_keeper_info";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_INFO)
  private DpaProductCreateV2RequestProductInfoShopKeeperInfo shopKeeperInfo = null;

  public static final String SERIALIZED_NAME_SPU_ID = "spu_id";
  @SerializedName(SERIALIZED_NAME_SPU_ID)
  private String spuId = null;

  public static final String SERIALIZED_NAME_SUB_CATEGORY = "sub_category";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY)
  private String subCategory = null;

  public static final String SERIALIZED_NAME_SUB_CATEGORY_ID = "sub_category_id";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY_ID)
  private String subCategoryId = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY = "third_category";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY)
  private String thirdCategory = null;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY_ID = "third_category_id";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY_ID)
  private String thirdCategoryId = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private String video = null;

  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private List<DpaProductCreateV2RequestProductInfoVideosInner> videos = null;

  public DpaProductCreateV2RequestProductInfo() {
  }

  public DpaProductCreateV2RequestProductInfo age(List<Long> age) {
    
    this.age = age;
    return this;
  }

  public DpaProductCreateV2RequestProductInfo addAgeItem(Long ageItem) {
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
  public List<Long> getAge() {
    return age;
  }


  public void setAge(List<Long> age) {
    this.age = age;
  }


  public DpaProductCreateV2RequestProductInfo bought(Long bought) {
    
    this.bought = bought;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: -9223372036854775616
   * @return bought
  **/
  @javax.annotation.Nullable
  public Long getBought() {
    return bought;
  }


  public void setBought(Long bought) {
    this.bought = bought;
  }


  public DpaProductCreateV2RequestProductInfo brandInfo(DpaProductCreateV2RequestProductInfoBrandInfo brandInfo) {
    
    this.brandInfo = brandInfo;
    return this;
  }

   /**
   * Get brandInfo
   * @return brandInfo
  **/
  @javax.annotation.Nullable
  public DpaProductCreateV2RequestProductInfoBrandInfo getBrandInfo() {
    return brandInfo;
  }


  public void setBrandInfo(DpaProductCreateV2RequestProductInfoBrandInfo brandInfo) {
    this.brandInfo = brandInfo;
  }


  public DpaProductCreateV2RequestProductInfo city(List<String> city) {
    
    this.city = city;
    return this;
  }

  public DpaProductCreateV2RequestProductInfo addCityItem(String cityItem) {
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
  public List<String> getCity() {
    return city;
  }


  public void setCity(List<String> city) {
    this.city = city;
  }


  public DpaProductCreateV2RequestProductInfo comments(Long comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: -9223372036854775616
   * @return comments
  **/
  @javax.annotation.Nullable
  public Long getComments() {
    return comments;
  }


  public void setComments(Long comments) {
    this.comments = comments;
  }


  public DpaProductCreateV2RequestProductInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DpaProductCreateV2RequestProductInfo feature(String feature) {
    
    this.feature = feature;
    return this;
  }

   /**
   * 
   * @return feature
  **/
  @javax.annotation.Nullable
  public String getFeature() {
    return feature;
  }


  public void setFeature(String feature) {
    this.feature = feature;
  }


  public DpaProductCreateV2RequestProductInfo firstCategory(String firstCategory) {
    
    this.firstCategory = firstCategory;
    return this;
  }

   /**
   * 
   * @return firstCategory
  **/
  @javax.annotation.Nullable
  public String getFirstCategory() {
    return firstCategory;
  }


  public void setFirstCategory(String firstCategory) {
    this.firstCategory = firstCategory;
  }


  public DpaProductCreateV2RequestProductInfo firstCategoryId(String firstCategoryId) {
    
    this.firstCategoryId = firstCategoryId;
    return this;
  }

   /**
   * 
   * @return firstCategoryId
  **/
  @javax.annotation.Nullable
  public String getFirstCategoryId() {
    return firstCategoryId;
  }


  public void setFirstCategoryId(String firstCategoryId) {
    this.firstCategoryId = firstCategoryId;
  }


  public DpaProductCreateV2RequestProductInfo geo(DpaProductCreateV2RequestProductInfoGeo geo) {
    
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @javax.annotation.Nullable
  public DpaProductCreateV2RequestProductInfoGeo getGeo() {
    return geo;
  }


  public void setGeo(DpaProductCreateV2RequestProductInfoGeo geo) {
    this.geo = geo;
  }


  public DpaProductCreateV2RequestProductInfo imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public DpaProductCreateV2RequestProductInfo imageUrls(List<String> imageUrls) {
    
    this.imageUrls = imageUrls;
    return this;
  }

  public DpaProductCreateV2RequestProductInfo addImageUrlsItem(String imageUrlsItem) {
    if (this.imageUrls == null) {
      this.imageUrls = new ArrayList<>();
    }
    this.imageUrls.add(imageUrlsItem);
    return this;
  }

   /**
   * 
   * @return imageUrls
  **/
  @javax.annotation.Nullable
  public List<String> getImageUrls() {
    return imageUrls;
  }


  public void setImageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
  }


  public DpaProductCreateV2RequestProductInfo label(List<String> label) {
    
    this.label = label;
    return this;
  }

  public DpaProductCreateV2RequestProductInfo addLabelItem(String labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<>();
    }
    this.label.add(labelItem);
    return this;
  }

   /**
   * 
   * @return label
  **/
  @javax.annotation.Nullable
  public List<String> getLabel() {
    return label;
  }


  public void setLabel(List<String> label) {
    this.label = label;
  }


  public DpaProductCreateV2RequestProductInfo landingInfo(DpaProductCreateV2RequestProductInfoLandingInfo landingInfo) {
    
    this.landingInfo = landingInfo;
    return this;
  }

   /**
   * Get landingInfo
   * @return landingInfo
  **/
  @javax.annotation.Nullable
  public DpaProductCreateV2RequestProductInfoLandingInfo getLandingInfo() {
    return landingInfo;
  }


  public void setLandingInfo(DpaProductCreateV2RequestProductInfoLandingInfo landingInfo) {
    this.landingInfo = landingInfo;
  }


  public DpaProductCreateV2RequestProductInfo mark(Double mark) {
    
    this.mark = mark;
    return this;
  }

   /**
   * 
   * @return mark
  **/
  @javax.annotation.Nullable
  public Double getMark() {
    return mark;
  }


  public void setMark(Double mark) {
    this.mark = mark;
  }


  public DpaProductCreateV2RequestProductInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DpaProductCreateV2RequestProductInfo offlineTime(Long offlineTime) {
    
    this.offlineTime = offlineTime;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: -9223372036854775616
   * @return offlineTime
  **/
  @javax.annotation.Nullable
  public Long getOfflineTime() {
    return offlineTime;
  }


  public void setOfflineTime(Long offlineTime) {
    this.offlineTime = offlineTime;
  }


  public DpaProductCreateV2RequestProductInfo onlineTime(Long onlineTime) {
    
    this.onlineTime = onlineTime;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: -9223372036854775616
   * @return onlineTime
  **/
  @javax.annotation.Nullable
  public Long getOnlineTime() {
    return onlineTime;
  }


  public void setOnlineTime(Long onlineTime) {
    this.onlineTime = onlineTime;
  }


  public DpaProductCreateV2RequestProductInfo outerId(String outerId) {
    
    this.outerId = outerId;
    return this;
  }

   /**
   * 
   * @return outerId
  **/
  @javax.annotation.Nullable
  public String getOuterId() {
    return outerId;
  }


  public void setOuterId(String outerId) {
    this.outerId = outerId;
  }


  public DpaProductCreateV2RequestProductInfo priceInfo(DpaProductCreateV2RequestProductInfoPriceInfo priceInfo) {
    
    this.priceInfo = priceInfo;
    return this;
  }

   /**
   * Get priceInfo
   * @return priceInfo
  **/
  @javax.annotation.Nullable
  public DpaProductCreateV2RequestProductInfoPriceInfo getPriceInfo() {
    return priceInfo;
  }


  public void setPriceInfo(DpaProductCreateV2RequestProductInfoPriceInfo priceInfo) {
    this.priceInfo = priceInfo;
  }


  public DpaProductCreateV2RequestProductInfo profession(Map<String, String> profession) {
    
    this.profession = profession;
    return this;
  }

  public DpaProductCreateV2RequestProductInfo putProfessionItem(String key, String professionItem) {
    if (this.profession == null) {
      this.profession = new HashMap<>();
    }
    this.profession.put(key, professionItem);
    return this;
  }

   /**
   * 
   * @return profession
  **/
  @javax.annotation.Nullable
  public Map<String, String> getProfession() {
    return profession;
  }


  public void setProfession(Map<String, String> profession) {
    this.profession = profession;
  }


  public DpaProductCreateV2RequestProductInfo province(List<String> province) {
    
    this.province = province;
    return this;
  }

  public DpaProductCreateV2RequestProductInfo addProvinceItem(String provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<>();
    }
    this.province.add(provinceItem);
    return this;
  }

   /**
   * 
   * @return province
  **/
  @javax.annotation.Nullable
  public List<String> getProvince() {
    return province;
  }


  public void setProvince(List<String> province) {
    this.province = province;
  }


  public DpaProductCreateV2RequestProductInfo shopKeeperInfo(DpaProductCreateV2RequestProductInfoShopKeeperInfo shopKeeperInfo) {
    
    this.shopKeeperInfo = shopKeeperInfo;
    return this;
  }

   /**
   * Get shopKeeperInfo
   * @return shopKeeperInfo
  **/
  @javax.annotation.Nullable
  public DpaProductCreateV2RequestProductInfoShopKeeperInfo getShopKeeperInfo() {
    return shopKeeperInfo;
  }


  public void setShopKeeperInfo(DpaProductCreateV2RequestProductInfoShopKeeperInfo shopKeeperInfo) {
    this.shopKeeperInfo = shopKeeperInfo;
  }


  public DpaProductCreateV2RequestProductInfo spuId(String spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * 
   * @return spuId
  **/
  @javax.annotation.Nullable
  public String getSpuId() {
    return spuId;
  }


  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }


  public DpaProductCreateV2RequestProductInfo subCategory(String subCategory) {
    
    this.subCategory = subCategory;
    return this;
  }

   /**
   * 
   * @return subCategory
  **/
  @javax.annotation.Nullable
  public String getSubCategory() {
    return subCategory;
  }


  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }


  public DpaProductCreateV2RequestProductInfo subCategoryId(String subCategoryId) {
    
    this.subCategoryId = subCategoryId;
    return this;
  }

   /**
   * 
   * @return subCategoryId
  **/
  @javax.annotation.Nullable
  public String getSubCategoryId() {
    return subCategoryId;
  }


  public void setSubCategoryId(String subCategoryId) {
    this.subCategoryId = subCategoryId;
  }


  public DpaProductCreateV2RequestProductInfo tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DpaProductCreateV2RequestProductInfo addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DpaProductCreateV2RequestProductInfo thirdCategory(String thirdCategory) {
    
    this.thirdCategory = thirdCategory;
    return this;
  }

   /**
   * 
   * @return thirdCategory
  **/
  @javax.annotation.Nullable
  public String getThirdCategory() {
    return thirdCategory;
  }


  public void setThirdCategory(String thirdCategory) {
    this.thirdCategory = thirdCategory;
  }


  public DpaProductCreateV2RequestProductInfo thirdCategoryId(String thirdCategoryId) {
    
    this.thirdCategoryId = thirdCategoryId;
    return this;
  }

   /**
   * 
   * @return thirdCategoryId
  **/
  @javax.annotation.Nullable
  public String getThirdCategoryId() {
    return thirdCategoryId;
  }


  public void setThirdCategoryId(String thirdCategoryId) {
    this.thirdCategoryId = thirdCategoryId;
  }


  public DpaProductCreateV2RequestProductInfo title(String title) {
    
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


  public DpaProductCreateV2RequestProductInfo video(String video) {
    
    this.video = video;
    return this;
  }

   /**
   * 
   * @return video
  **/
  @javax.annotation.Nullable
  public String getVideo() {
    return video;
  }


  public void setVideo(String video) {
    this.video = video;
  }


  public DpaProductCreateV2RequestProductInfo videos(List<DpaProductCreateV2RequestProductInfoVideosInner> videos) {
    
    this.videos = videos;
    return this;
  }

  public DpaProductCreateV2RequestProductInfo addVideosItem(DpaProductCreateV2RequestProductInfoVideosInner videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * 
   * @return videos
  **/
  @javax.annotation.Nullable
  public List<DpaProductCreateV2RequestProductInfoVideosInner> getVideos() {
    return videos;
  }


  public void setVideos(List<DpaProductCreateV2RequestProductInfoVideosInner> videos) {
    this.videos = videos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaProductCreateV2RequestProductInfo dpaProductCreateV2RequestProductInfo = (DpaProductCreateV2RequestProductInfo) o;
    return Objects.equals(this.age, dpaProductCreateV2RequestProductInfo.age) &&
        Objects.equals(this.bought, dpaProductCreateV2RequestProductInfo.bought) &&
        Objects.equals(this.brandInfo, dpaProductCreateV2RequestProductInfo.brandInfo) &&
        Objects.equals(this.city, dpaProductCreateV2RequestProductInfo.city) &&
        Objects.equals(this.comments, dpaProductCreateV2RequestProductInfo.comments) &&
        Objects.equals(this.description, dpaProductCreateV2RequestProductInfo.description) &&
        Objects.equals(this.feature, dpaProductCreateV2RequestProductInfo.feature) &&
        Objects.equals(this.firstCategory, dpaProductCreateV2RequestProductInfo.firstCategory) &&
        Objects.equals(this.firstCategoryId, dpaProductCreateV2RequestProductInfo.firstCategoryId) &&
        Objects.equals(this.geo, dpaProductCreateV2RequestProductInfo.geo) &&
        Objects.equals(this.imageUrl, dpaProductCreateV2RequestProductInfo.imageUrl) &&
        Objects.equals(this.imageUrls, dpaProductCreateV2RequestProductInfo.imageUrls) &&
        Objects.equals(this.label, dpaProductCreateV2RequestProductInfo.label) &&
        Objects.equals(this.landingInfo, dpaProductCreateV2RequestProductInfo.landingInfo) &&
        Objects.equals(this.mark, dpaProductCreateV2RequestProductInfo.mark) &&
        Objects.equals(this.name, dpaProductCreateV2RequestProductInfo.name) &&
        Objects.equals(this.offlineTime, dpaProductCreateV2RequestProductInfo.offlineTime) &&
        Objects.equals(this.onlineTime, dpaProductCreateV2RequestProductInfo.onlineTime) &&
        Objects.equals(this.outerId, dpaProductCreateV2RequestProductInfo.outerId) &&
        Objects.equals(this.priceInfo, dpaProductCreateV2RequestProductInfo.priceInfo) &&
        Objects.equals(this.profession, dpaProductCreateV2RequestProductInfo.profession) &&
        Objects.equals(this.province, dpaProductCreateV2RequestProductInfo.province) &&
        Objects.equals(this.shopKeeperInfo, dpaProductCreateV2RequestProductInfo.shopKeeperInfo) &&
        Objects.equals(this.spuId, dpaProductCreateV2RequestProductInfo.spuId) &&
        Objects.equals(this.subCategory, dpaProductCreateV2RequestProductInfo.subCategory) &&
        Objects.equals(this.subCategoryId, dpaProductCreateV2RequestProductInfo.subCategoryId) &&
        Objects.equals(this.tags, dpaProductCreateV2RequestProductInfo.tags) &&
        Objects.equals(this.thirdCategory, dpaProductCreateV2RequestProductInfo.thirdCategory) &&
        Objects.equals(this.thirdCategoryId, dpaProductCreateV2RequestProductInfo.thirdCategoryId) &&
        Objects.equals(this.title, dpaProductCreateV2RequestProductInfo.title) &&
        Objects.equals(this.video, dpaProductCreateV2RequestProductInfo.video) &&
        Objects.equals(this.videos, dpaProductCreateV2RequestProductInfo.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, bought, brandInfo, city, comments, description, feature, firstCategory, firstCategoryId, geo, imageUrl, imageUrls, label, landingInfo, mark, name, offlineTime, onlineTime, outerId, priceInfo, profession, province, shopKeeperInfo, spuId, subCategory, subCategoryId, tags, thirdCategory, thirdCategoryId, title, video, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaProductCreateV2RequestProductInfo {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    bought: ").append(toIndentedString(bought)).append("\n");
    sb.append("    brandInfo: ").append(toIndentedString(brandInfo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    firstCategory: ").append(toIndentedString(firstCategory)).append("\n");
    sb.append("    firstCategoryId: ").append(toIndentedString(firstCategoryId)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    landingInfo: ").append(toIndentedString(landingInfo)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offlineTime: ").append(toIndentedString(offlineTime)).append("\n");
    sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
    sb.append("    outerId: ").append(toIndentedString(outerId)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    shopKeeperInfo: ").append(toIndentedString(shopKeeperInfo)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    subCategoryId: ").append(toIndentedString(subCategoryId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thirdCategory: ").append(toIndentedString(thirdCategory)).append("\n");
    sb.append("    thirdCategoryId: ").append(toIndentedString(thirdCategoryId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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
    openapiFields.add("bought");
    openapiFields.add("brand_info");
    openapiFields.add("city");
    openapiFields.add("comments");
    openapiFields.add("description");
    openapiFields.add("feature");
    openapiFields.add("first_category");
    openapiFields.add("first_category_id");
    openapiFields.add("geo");
    openapiFields.add("image_url");
    openapiFields.add("image_urls");
    openapiFields.add("label");
    openapiFields.add("landing_info");
    openapiFields.add("mark");
    openapiFields.add("name");
    openapiFields.add("offline_time");
    openapiFields.add("online_time");
    openapiFields.add("outer_id");
    openapiFields.add("price_info");
    openapiFields.add("profession");
    openapiFields.add("province");
    openapiFields.add("shop_keeper_info");
    openapiFields.add("spu_id");
    openapiFields.add("sub_category");
    openapiFields.add("sub_category_id");
    openapiFields.add("tags");
    openapiFields.add("third_category");
    openapiFields.add("third_category_id");
    openapiFields.add("title");
    openapiFields.add("video");
    openapiFields.add("videos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_url");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaProductCreateV2RequestProductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaProductCreateV2RequestProductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaProductCreateV2RequestProductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaProductCreateV2RequestProductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaProductCreateV2RequestProductInfo>() {
           @Override
           public void write(JsonWriter out, DpaProductCreateV2RequestProductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaProductCreateV2RequestProductInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaProductCreateV2RequestProductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaProductCreateV2RequestProductInfo
  * @throws IOException if the JSON string is invalid with respect to DpaProductCreateV2RequestProductInfo
  */
  public static DpaProductCreateV2RequestProductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaProductCreateV2RequestProductInfo.class);
  }

 /**
  * Convert an instance of DpaProductCreateV2RequestProductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

