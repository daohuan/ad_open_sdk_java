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
import com.bytedance.ads.model.DpaClueProductDetailV2DataProductsAuditStatus;
import com.bytedance.ads.model.DpaClueProductDetailV2DataProductsCompletionStatus;
import com.bytedance.ads.model.DpaClueProductDetailV2DataProductsStatus;
import com.bytedance.ads.model.DpaClueProductDetailV2ResponseDataProductsInnerBrandInfo;
import com.bytedance.ads.model.DpaClueProductDetailV2ResponseDataProductsInnerCategory;
import com.bytedance.ads.model.DpaClueProductDetailV2ResponseDataProductsInnerImagesUrlInner;
import com.bytedance.ads.model.DpaClueProductDetailV2ResponseDataProductsInnerLandingInfo;
import com.bytedance.ads.model.DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo;
import com.bytedance.ads.model.DpaClueProductDetailV2ResponseDataProductsInnerShopKeeperInfo;
import com.bytedance.ads.model.DpaClueProductDetailV2ResponseDataProductsInnerVideosInner;
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
 * DpaClueProductDetailV2ResponseDataProductsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class DpaClueProductDetailV2ResponseDataProductsInner {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<Long> age = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private DpaClueProductDetailV2DataProductsAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_BOUGHT = "bought";
  @SerializedName(SERIALIZED_NAME_BOUGHT)
  private Long bought = null;

  public static final String SERIALIZED_NAME_BRAND_INFO = "brand_info";
  @SerializedName(SERIALIZED_NAME_BRAND_INFO)
  private DpaClueProductDetailV2ResponseDataProductsInnerBrandInfo brandInfo = null;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private DpaClueProductDetailV2ResponseDataProductsInnerCategory category = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<String> city = null;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private Long comments = null;

  public static final String SERIALIZED_NAME_COMPLETION_STATUS = "completion_status";
  @SerializedName(SERIALIZED_NAME_COMPLETION_STATUS)
  private DpaClueProductDetailV2DataProductsCompletionStatus completionStatus = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private String feature = null;

  public static final String SERIALIZED_NAME_HAS_VIDEO = "has_video";
  @SerializedName(SERIALIZED_NAME_HAS_VIDEO)
  private Boolean hasVideo = null;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = null;

  public static final String SERIALIZED_NAME_IMAGES_URL = "images_url";
  @SerializedName(SERIALIZED_NAME_IMAGES_URL)
  private List<DpaClueProductDetailV2ResponseDataProductsInnerImagesUrlInner> imagesUrl = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private List<String> label = null;

  public static final String SERIALIZED_NAME_LANDING_INFO = "landing_info";
  @SerializedName(SERIALIZED_NAME_LANDING_INFO)
  private DpaClueProductDetailV2ResponseDataProductsInnerLandingInfo landingInfo = null;

  public static final String SERIALIZED_NAME_MARK = "mark";
  @SerializedName(SERIALIZED_NAME_MARK)
  private Double mark = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_OFFLINE_TIME = "offline_time";
  @SerializedName(SERIALIZED_NAME_OFFLINE_TIME)
  private String offlineTime = null;

  public static final String SERIALIZED_NAME_ONLINE_TIME = "online_time";
  @SerializedName(SERIALIZED_NAME_ONLINE_TIME)
  private String onlineTime = null;

  public static final String SERIALIZED_NAME_OUTER_ID = "outer_id";
  @SerializedName(SERIALIZED_NAME_OUTER_ID)
  private String outerId = null;

  public static final String SERIALIZED_NAME_POI_ID = "poi_id";
  @SerializedName(SERIALIZED_NAME_POI_ID)
  private String poiId = null;

  public static final String SERIALIZED_NAME_PRICE_INFO = "price_info";
  @SerializedName(SERIALIZED_NAME_PRICE_INFO)
  private DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo priceInfo = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PROFESSION = "profession";
  @SerializedName(SERIALIZED_NAME_PROFESSION)
  private Map<String, String> profession = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private List<String> province = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_INFO = "shop_keeper_info";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_INFO)
  private DpaClueProductDetailV2ResponseDataProductsInnerShopKeeperInfo shopKeeperInfo = null;

  public static final String SERIALIZED_NAME_SPU_ID = "spu_id";
  @SerializedName(SERIALIZED_NAME_SPU_ID)
  private String spuId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DpaClueProductDetailV2DataProductsStatus status = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private List<DpaClueProductDetailV2ResponseDataProductsInnerVideosInner> videos = null;

  public DpaClueProductDetailV2ResponseDataProductsInner() {
  }

  public DpaClueProductDetailV2ResponseDataProductsInner age(List<Long> age) {
    
    this.age = age;
    return this;
  }

  public DpaClueProductDetailV2ResponseDataProductsInner addAgeItem(Long ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 定向年龄
   * @return age
  **/
  @javax.annotation.Nullable
  public List<Long> getAge() {
    return age;
  }


  public void setAge(List<Long> age) {
    this.age = age;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner auditStatus(DpaClueProductDetailV2DataProductsAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public DpaClueProductDetailV2DataProductsAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(DpaClueProductDetailV2DataProductsAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner bought(Long bought) {
    
    this.bought = bought;
    return this;
  }

   /**
   * 购买量
   * @return bought
  **/
  @javax.annotation.Nullable
  public Long getBought() {
    return bought;
  }


  public void setBought(Long bought) {
    this.bought = bought;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner brandInfo(DpaClueProductDetailV2ResponseDataProductsInnerBrandInfo brandInfo) {
    
    this.brandInfo = brandInfo;
    return this;
  }

   /**
   * Get brandInfo
   * @return brandInfo
  **/
  @javax.annotation.Nullable
  public DpaClueProductDetailV2ResponseDataProductsInnerBrandInfo getBrandInfo() {
    return brandInfo;
  }


  public void setBrandInfo(DpaClueProductDetailV2ResponseDataProductsInnerBrandInfo brandInfo) {
    this.brandInfo = brandInfo;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner category(DpaClueProductDetailV2ResponseDataProductsInnerCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  public DpaClueProductDetailV2ResponseDataProductsInnerCategory getCategory() {
    return category;
  }


  public void setCategory(DpaClueProductDetailV2ResponseDataProductsInnerCategory category) {
    this.category = category;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner city(List<String> city) {
    
    this.city = city;
    return this;
  }

  public DpaClueProductDetailV2ResponseDataProductsInner addCityItem(String cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 定向城市
   * @return city
  **/
  @javax.annotation.Nullable
  public List<String> getCity() {
    return city;
  }


  public void setCity(List<String> city) {
    this.city = city;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner comments(Long comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * 评论数
   * @return comments
  **/
  @javax.annotation.Nullable
  public Long getComments() {
    return comments;
  }


  public void setComments(Long comments) {
    this.comments = comments;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner completionStatus(DpaClueProductDetailV2DataProductsCompletionStatus completionStatus) {
    
    this.completionStatus = completionStatus;
    return this;
  }

   /**
   * Get completionStatus
   * @return completionStatus
  **/
  @javax.annotation.Nullable
  public DpaClueProductDetailV2DataProductsCompletionStatus getCompletionStatus() {
    return completionStatus;
  }


  public void setCompletionStatus(DpaClueProductDetailV2DataProductsCompletionStatus completionStatus) {
    this.completionStatus = completionStatus;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 商品描述信息
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner feature(String feature) {
    
    this.feature = feature;
    return this;
  }

   /**
   * 特点
   * @return feature
  **/
  @javax.annotation.Nullable
  public String getFeature() {
    return feature;
  }


  public void setFeature(String feature) {
    this.feature = feature;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner hasVideo(Boolean hasVideo) {
    
    this.hasVideo = hasVideo;
    return this;
  }

   /**
   * 是否存在视频;true:存在,false:不存在
   * @return hasVideo
  **/
  @javax.annotation.Nullable
  public Boolean getHasVideo() {
    return hasVideo;
  }


  public void setHasVideo(Boolean hasVideo) {
    this.hasVideo = hasVideo;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 商品头图url
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner imagesUrl(List<DpaClueProductDetailV2ResponseDataProductsInnerImagesUrlInner> imagesUrl) {
    
    this.imagesUrl = imagesUrl;
    return this;
  }

  public DpaClueProductDetailV2ResponseDataProductsInner addImagesUrlItem(DpaClueProductDetailV2ResponseDataProductsInnerImagesUrlInner imagesUrlItem) {
    if (this.imagesUrl == null) {
      this.imagesUrl = new ArrayList<>();
    }
    this.imagesUrl.add(imagesUrlItem);
    return this;
  }

   /**
   * 商品组图
   * @return imagesUrl
  **/
  @javax.annotation.Nullable
  public List<DpaClueProductDetailV2ResponseDataProductsInnerImagesUrlInner> getImagesUrl() {
    return imagesUrl;
  }


  public void setImagesUrl(List<DpaClueProductDetailV2ResponseDataProductsInnerImagesUrlInner> imagesUrl) {
    this.imagesUrl = imagesUrl;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner label(List<String> label) {
    
    this.label = label;
    return this;
  }

  public DpaClueProductDetailV2ResponseDataProductsInner addLabelItem(String labelItem) {
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


  public DpaClueProductDetailV2ResponseDataProductsInner landingInfo(DpaClueProductDetailV2ResponseDataProductsInnerLandingInfo landingInfo) {
    
    this.landingInfo = landingInfo;
    return this;
  }

   /**
   * Get landingInfo
   * @return landingInfo
  **/
  @javax.annotation.Nullable
  public DpaClueProductDetailV2ResponseDataProductsInnerLandingInfo getLandingInfo() {
    return landingInfo;
  }


  public void setLandingInfo(DpaClueProductDetailV2ResponseDataProductsInnerLandingInfo landingInfo) {
    this.landingInfo = landingInfo;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner mark(Double mark) {
    
    this.mark = mark;
    return this;
  }

   /**
   * 评分
   * @return mark
  **/
  @javax.annotation.Nullable
  public Double getMark() {
    return mark;
  }


  public void setMark(Double mark) {
    this.mark = mark;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 商品名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner offlineTime(String offlineTime) {
    
    this.offlineTime = offlineTime;
    return this;
  }

   /**
   * 下线时间，精确到秒
   * @return offlineTime
  **/
  @javax.annotation.Nullable
  public String getOfflineTime() {
    return offlineTime;
  }


  public void setOfflineTime(String offlineTime) {
    this.offlineTime = offlineTime;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner onlineTime(String onlineTime) {
    
    this.onlineTime = onlineTime;
    return this;
  }

   /**
   * 上线时间，精确到秒
   * @return onlineTime
  **/
  @javax.annotation.Nullable
  public String getOnlineTime() {
    return onlineTime;
  }


  public void setOnlineTime(String onlineTime) {
    this.onlineTime = onlineTime;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner outerId(String outerId) {
    
    this.outerId = outerId;
    return this;
  }

   /**
   * 自定义商品ID
   * @return outerId
  **/
  @javax.annotation.Nullable
  public String getOuterId() {
    return outerId;
  }


  public void setOuterId(String outerId) {
    this.outerId = outerId;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner poiId(String poiId) {
    
    this.poiId = poiId;
    return this;
  }

   /**
   * 商品poiID
   * @return poiId
  **/
  @javax.annotation.Nullable
  public String getPoiId() {
    return poiId;
  }


  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner priceInfo(DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo priceInfo) {
    
    this.priceInfo = priceInfo;
    return this;
  }

   /**
   * Get priceInfo
   * @return priceInfo
  **/
  @javax.annotation.Nullable
  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo getPriceInfo() {
    return priceInfo;
  }


  public void setPriceInfo(DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo priceInfo) {
    this.priceInfo = priceInfo;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 商品ID
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner profession(Map<String, String> profession) {
    
    this.profession = profession;
    return this;
  }

  public DpaClueProductDetailV2ResponseDataProductsInner putProfessionItem(String key, String professionItem) {
    if (this.profession == null) {
      this.profession = new HashMap<>();
    }
    this.profession.put(key, professionItem);
    return this;
  }

   /**
   * 行业特定字段
   * @return profession
  **/
  @javax.annotation.Nullable
  public Map<String, String> getProfession() {
    return profession;
  }


  public void setProfession(Map<String, String> profession) {
    this.profession = profession;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner province(List<String> province) {
    
    this.province = province;
    return this;
  }

  public DpaClueProductDetailV2ResponseDataProductsInner addProvinceItem(String provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<>();
    }
    this.province.add(provinceItem);
    return this;
  }

   /**
   * 定向省
   * @return province
  **/
  @javax.annotation.Nullable
  public List<String> getProvince() {
    return province;
  }


  public void setProvince(List<String> province) {
    this.province = province;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner shopKeeperInfo(DpaClueProductDetailV2ResponseDataProductsInnerShopKeeperInfo shopKeeperInfo) {
    
    this.shopKeeperInfo = shopKeeperInfo;
    return this;
  }

   /**
   * Get shopKeeperInfo
   * @return shopKeeperInfo
  **/
  @javax.annotation.Nullable
  public DpaClueProductDetailV2ResponseDataProductsInnerShopKeeperInfo getShopKeeperInfo() {
    return shopKeeperInfo;
  }


  public void setShopKeeperInfo(DpaClueProductDetailV2ResponseDataProductsInnerShopKeeperInfo shopKeeperInfo) {
    this.shopKeeperInfo = shopKeeperInfo;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner spuId(String spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * 商品spuID
   * @return spuId
  **/
  @javax.annotation.Nullable
  public String getSpuId() {
    return spuId;
  }


  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner status(DpaClueProductDetailV2DataProductsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public DpaClueProductDetailV2DataProductsStatus getStatus() {
    return status;
  }


  public void setStatus(DpaClueProductDetailV2DataProductsStatus status) {
    this.status = status;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DpaClueProductDetailV2ResponseDataProductsInner addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 商品标签
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 商品标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 商品视频链接
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public DpaClueProductDetailV2ResponseDataProductsInner videos(List<DpaClueProductDetailV2ResponseDataProductsInnerVideosInner> videos) {
    
    this.videos = videos;
    return this;
  }

  public DpaClueProductDetailV2ResponseDataProductsInner addVideosItem(DpaClueProductDetailV2ResponseDataProductsInnerVideosInner videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * 商品视频列表
   * @return videos
  **/
  @javax.annotation.Nullable
  public List<DpaClueProductDetailV2ResponseDataProductsInnerVideosInner> getVideos() {
    return videos;
  }


  public void setVideos(List<DpaClueProductDetailV2ResponseDataProductsInnerVideosInner> videos) {
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
    DpaClueProductDetailV2ResponseDataProductsInner dpaClueProductDetailV2ResponseDataProductsInner = (DpaClueProductDetailV2ResponseDataProductsInner) o;
    return Objects.equals(this.age, dpaClueProductDetailV2ResponseDataProductsInner.age) &&
        Objects.equals(this.auditStatus, dpaClueProductDetailV2ResponseDataProductsInner.auditStatus) &&
        Objects.equals(this.bought, dpaClueProductDetailV2ResponseDataProductsInner.bought) &&
        Objects.equals(this.brandInfo, dpaClueProductDetailV2ResponseDataProductsInner.brandInfo) &&
        Objects.equals(this.category, dpaClueProductDetailV2ResponseDataProductsInner.category) &&
        Objects.equals(this.city, dpaClueProductDetailV2ResponseDataProductsInner.city) &&
        Objects.equals(this.comments, dpaClueProductDetailV2ResponseDataProductsInner.comments) &&
        Objects.equals(this.completionStatus, dpaClueProductDetailV2ResponseDataProductsInner.completionStatus) &&
        Objects.equals(this.description, dpaClueProductDetailV2ResponseDataProductsInner.description) &&
        Objects.equals(this.feature, dpaClueProductDetailV2ResponseDataProductsInner.feature) &&
        Objects.equals(this.hasVideo, dpaClueProductDetailV2ResponseDataProductsInner.hasVideo) &&
        Objects.equals(this.imageUrl, dpaClueProductDetailV2ResponseDataProductsInner.imageUrl) &&
        Objects.equals(this.imagesUrl, dpaClueProductDetailV2ResponseDataProductsInner.imagesUrl) &&
        Objects.equals(this.label, dpaClueProductDetailV2ResponseDataProductsInner.label) &&
        Objects.equals(this.landingInfo, dpaClueProductDetailV2ResponseDataProductsInner.landingInfo) &&
        Objects.equals(this.mark, dpaClueProductDetailV2ResponseDataProductsInner.mark) &&
        Objects.equals(this.name, dpaClueProductDetailV2ResponseDataProductsInner.name) &&
        Objects.equals(this.offlineTime, dpaClueProductDetailV2ResponseDataProductsInner.offlineTime) &&
        Objects.equals(this.onlineTime, dpaClueProductDetailV2ResponseDataProductsInner.onlineTime) &&
        Objects.equals(this.outerId, dpaClueProductDetailV2ResponseDataProductsInner.outerId) &&
        Objects.equals(this.poiId, dpaClueProductDetailV2ResponseDataProductsInner.poiId) &&
        Objects.equals(this.priceInfo, dpaClueProductDetailV2ResponseDataProductsInner.priceInfo) &&
        Objects.equals(this.productId, dpaClueProductDetailV2ResponseDataProductsInner.productId) &&
        Objects.equals(this.profession, dpaClueProductDetailV2ResponseDataProductsInner.profession) &&
        Objects.equals(this.province, dpaClueProductDetailV2ResponseDataProductsInner.province) &&
        Objects.equals(this.shopKeeperInfo, dpaClueProductDetailV2ResponseDataProductsInner.shopKeeperInfo) &&
        Objects.equals(this.spuId, dpaClueProductDetailV2ResponseDataProductsInner.spuId) &&
        Objects.equals(this.status, dpaClueProductDetailV2ResponseDataProductsInner.status) &&
        Objects.equals(this.tags, dpaClueProductDetailV2ResponseDataProductsInner.tags) &&
        Objects.equals(this.title, dpaClueProductDetailV2ResponseDataProductsInner.title) &&
        Objects.equals(this.videoUrl, dpaClueProductDetailV2ResponseDataProductsInner.videoUrl) &&
        Objects.equals(this.videos, dpaClueProductDetailV2ResponseDataProductsInner.videos);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, auditStatus, bought, brandInfo, category, city, comments, completionStatus, description, feature, hasVideo, imageUrl, imagesUrl, label, landingInfo, mark, name, offlineTime, onlineTime, outerId, poiId, priceInfo, productId, profession, province, shopKeeperInfo, spuId, status, tags, title, videoUrl, videos);
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
    sb.append("class DpaClueProductDetailV2ResponseDataProductsInner {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    bought: ").append(toIndentedString(bought)).append("\n");
    sb.append("    brandInfo: ").append(toIndentedString(brandInfo)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    hasVideo: ").append(toIndentedString(hasVideo)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imagesUrl: ").append(toIndentedString(imagesUrl)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    landingInfo: ").append(toIndentedString(landingInfo)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offlineTime: ").append(toIndentedString(offlineTime)).append("\n");
    sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
    sb.append("    outerId: ").append(toIndentedString(outerId)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    shopKeeperInfo: ").append(toIndentedString(shopKeeperInfo)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("bought");
    openapiFields.add("brand_info");
    openapiFields.add("category");
    openapiFields.add("city");
    openapiFields.add("comments");
    openapiFields.add("completion_status");
    openapiFields.add("description");
    openapiFields.add("feature");
    openapiFields.add("has_video");
    openapiFields.add("image_url");
    openapiFields.add("images_url");
    openapiFields.add("label");
    openapiFields.add("landing_info");
    openapiFields.add("mark");
    openapiFields.add("name");
    openapiFields.add("offline_time");
    openapiFields.add("online_time");
    openapiFields.add("outer_id");
    openapiFields.add("poi_id");
    openapiFields.add("price_info");
    openapiFields.add("product_id");
    openapiFields.add("profession");
    openapiFields.add("province");
    openapiFields.add("shop_keeper_info");
    openapiFields.add("spu_id");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("title");
    openapiFields.add("video_url");
    openapiFields.add("videos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaClueProductDetailV2ResponseDataProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaClueProductDetailV2ResponseDataProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaClueProductDetailV2ResponseDataProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaClueProductDetailV2ResponseDataProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaClueProductDetailV2ResponseDataProductsInner>() {
           @Override
           public void write(JsonWriter out, DpaClueProductDetailV2ResponseDataProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaClueProductDetailV2ResponseDataProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaClueProductDetailV2ResponseDataProductsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaClueProductDetailV2ResponseDataProductsInner
  * @throws IOException if the JSON string is invalid with respect to DpaClueProductDetailV2ResponseDataProductsInner
  */
  public static DpaClueProductDetailV2ResponseDataProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaClueProductDetailV2ResponseDataProductsInner.class);
  }

 /**
  * Convert an instance of DpaClueProductDetailV2ResponseDataProductsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

