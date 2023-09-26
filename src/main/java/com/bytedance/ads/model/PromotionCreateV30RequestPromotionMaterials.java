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
import com.bytedance.ads.model.PromotionCreateV30PromotionMaterialsDynamicCreativeSwitch;
import com.bytedance.ads.model.PromotionCreateV30PromotionMaterialsIntelligentGeneration;
import com.bytedance.ads.model.PromotionCreateV30PromotionMaterialsOpenUrlType;
import com.bytedance.ads.model.PromotionCreateV30PromotionMaterialsParamsType;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsAnchorMaterialListInner;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsComponentMaterialListInner;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsDecorationMaterial;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsImageMaterialListInner;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsProductInfo;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsTitleMaterialListInner;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class PromotionCreateV30RequestPromotionMaterials {
  public static final String SERIALIZED_NAME_ANCHOR_MATERIAL_LIST = "anchor_material_list";
  @SerializedName(SERIALIZED_NAME_ANCHOR_MATERIAL_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsAnchorMaterialListInner> anchorMaterialList = null;

  public static final String SERIALIZED_NAME_CALL_TO_ACTION_BUTTONS = "call_to_action_buttons";
  @SerializedName(SERIALIZED_NAME_CALL_TO_ACTION_BUTTONS)
  private List<String> callToActionButtons = null;

  public static final String SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST = "carousel_material_list";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner> carouselMaterialList = null;

  public static final String SERIALIZED_NAME_COMPONENT_MATERIAL_LIST = "component_material_list";
  @SerializedName(SERIALIZED_NAME_COMPONENT_MATERIAL_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsComponentMaterialListInner> componentMaterialList = null;

  public static final String SERIALIZED_NAME_DECORATION_MATERIAL = "decoration_material";
  @SerializedName(SERIALIZED_NAME_DECORATION_MATERIAL)
  private PromotionCreateV30RequestPromotionMaterialsDecorationMaterial decorationMaterial = null;

  public static final String SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH = "dynamic_creative_switch";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH)
  private PromotionCreateV30PromotionMaterialsDynamicCreativeSwitch dynamicCreativeSwitch = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_FIELD = "external_url_field";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_FIELD)
  private String externalUrlField = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_MATERIAL_LIST = "external_url_material_list";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_MATERIAL_LIST)
  private List<String> externalUrlMaterialList = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_PARAMS = "external_url_params";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_PARAMS)
  private String externalUrlParams = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL_LIST = "image_material_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInner> imageMaterialList = null;

  public static final String SERIALIZED_NAME_INTELLIGENT_GENERATION = "intelligent_generation";
  @SerializedName(SERIALIZED_NAME_INTELLIGENT_GENERATION)
  private PromotionCreateV30PromotionMaterialsIntelligentGeneration intelligentGeneration = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM_INFO = "mini_program_info";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM_INFO)
  private PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo miniProgramInfo = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_OPEN_URL_FIELD = "open_url_field";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_FIELD)
  private String openUrlField = null;

  public static final String SERIALIZED_NAME_OPEN_URL_PARAMS = "open_url_params";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_PARAMS)
  private String openUrlParams = null;

  public static final String SERIALIZED_NAME_OPEN_URL_TYPE = "open_url_type";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_TYPE)
  private PromotionCreateV30PromotionMaterialsOpenUrlType openUrlType = null;

  public static final String SERIALIZED_NAME_OPEN_URLS = "open_urls";
  @SerializedName(SERIALIZED_NAME_OPEN_URLS)
  private List<String> openUrls = null;

  public static final String SERIALIZED_NAME_PARAMS_TYPE = "params_type";
  @SerializedName(SERIALIZED_NAME_PARAMS_TYPE)
  private PromotionCreateV30PromotionMaterialsParamsType paramsType = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL_MATERIAL_LIST = "playable_url_material_list";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL_MATERIAL_LIST)
  private List<String> playableUrlMaterialList = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private PromotionCreateV30RequestPromotionMaterialsProductInfo productInfo = null;

  public static final String SERIALIZED_NAME_TEXT_ABSTRACT_LIST = "text_abstract_list";
  @SerializedName(SERIALIZED_NAME_TEXT_ABSTRACT_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner> textAbstractList = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL_LIST = "title_material_list";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsTitleMaterialListInner> titleMaterialList = null;

  public static final String SERIALIZED_NAME_ULINK = "ulink";
  @SerializedName(SERIALIZED_NAME_ULINK)
  private String ulink = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL_LIST = "video_material_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner> videoMaterialList = null;

  public static final String SERIALIZED_NAME_WEB_URL_MATERIAL_LIST = "web_url_material_list";
  @SerializedName(SERIALIZED_NAME_WEB_URL_MATERIAL_LIST)
  private List<String> webUrlMaterialList = null;

  public PromotionCreateV30RequestPromotionMaterials() {
  }

  public PromotionCreateV30RequestPromotionMaterials anchorMaterialList(List<PromotionCreateV30RequestPromotionMaterialsAnchorMaterialListInner> anchorMaterialList) {
    
    this.anchorMaterialList = anchorMaterialList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addAnchorMaterialListItem(PromotionCreateV30RequestPromotionMaterialsAnchorMaterialListInner anchorMaterialListItem) {
    if (this.anchorMaterialList == null) {
      this.anchorMaterialList = new ArrayList<>();
    }
    this.anchorMaterialList.add(anchorMaterialListItem);
    return this;
  }

   /**
   * 
   * @return anchorMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsAnchorMaterialListInner> getAnchorMaterialList() {
    return anchorMaterialList;
  }


  public void setAnchorMaterialList(List<PromotionCreateV30RequestPromotionMaterialsAnchorMaterialListInner> anchorMaterialList) {
    this.anchorMaterialList = anchorMaterialList;
  }


  public PromotionCreateV30RequestPromotionMaterials callToActionButtons(List<String> callToActionButtons) {
    
    this.callToActionButtons = callToActionButtons;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addCallToActionButtonsItem(String callToActionButtonsItem) {
    if (this.callToActionButtons == null) {
      this.callToActionButtons = new ArrayList<>();
    }
    this.callToActionButtons.add(callToActionButtonsItem);
    return this;
  }

   /**
   * 
   * @return callToActionButtons
  **/
  @javax.annotation.Nullable
  public List<String> getCallToActionButtons() {
    return callToActionButtons;
  }


  public void setCallToActionButtons(List<String> callToActionButtons) {
    this.callToActionButtons = callToActionButtons;
  }


  public PromotionCreateV30RequestPromotionMaterials carouselMaterialList(List<PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner> carouselMaterialList) {
    
    this.carouselMaterialList = carouselMaterialList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addCarouselMaterialListItem(PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner carouselMaterialListItem) {
    if (this.carouselMaterialList == null) {
      this.carouselMaterialList = new ArrayList<>();
    }
    this.carouselMaterialList.add(carouselMaterialListItem);
    return this;
  }

   /**
   * 
   * @return carouselMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner> getCarouselMaterialList() {
    return carouselMaterialList;
  }


  public void setCarouselMaterialList(List<PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner> carouselMaterialList) {
    this.carouselMaterialList = carouselMaterialList;
  }


  public PromotionCreateV30RequestPromotionMaterials componentMaterialList(List<PromotionCreateV30RequestPromotionMaterialsComponentMaterialListInner> componentMaterialList) {
    
    this.componentMaterialList = componentMaterialList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addComponentMaterialListItem(PromotionCreateV30RequestPromotionMaterialsComponentMaterialListInner componentMaterialListItem) {
    if (this.componentMaterialList == null) {
      this.componentMaterialList = new ArrayList<>();
    }
    this.componentMaterialList.add(componentMaterialListItem);
    return this;
  }

   /**
   * 
   * @return componentMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsComponentMaterialListInner> getComponentMaterialList() {
    return componentMaterialList;
  }


  public void setComponentMaterialList(List<PromotionCreateV30RequestPromotionMaterialsComponentMaterialListInner> componentMaterialList) {
    this.componentMaterialList = componentMaterialList;
  }


  public PromotionCreateV30RequestPromotionMaterials decorationMaterial(PromotionCreateV30RequestPromotionMaterialsDecorationMaterial decorationMaterial) {
    
    this.decorationMaterial = decorationMaterial;
    return this;
  }

   /**
   * Get decorationMaterial
   * @return decorationMaterial
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30RequestPromotionMaterialsDecorationMaterial getDecorationMaterial() {
    return decorationMaterial;
  }


  public void setDecorationMaterial(PromotionCreateV30RequestPromotionMaterialsDecorationMaterial decorationMaterial) {
    this.decorationMaterial = decorationMaterial;
  }


  public PromotionCreateV30RequestPromotionMaterials dynamicCreativeSwitch(PromotionCreateV30PromotionMaterialsDynamicCreativeSwitch dynamicCreativeSwitch) {
    
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
    return this;
  }

   /**
   * Get dynamicCreativeSwitch
   * @return dynamicCreativeSwitch
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30PromotionMaterialsDynamicCreativeSwitch getDynamicCreativeSwitch() {
    return dynamicCreativeSwitch;
  }


  public void setDynamicCreativeSwitch(PromotionCreateV30PromotionMaterialsDynamicCreativeSwitch dynamicCreativeSwitch) {
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
  }


  public PromotionCreateV30RequestPromotionMaterials externalUrlField(String externalUrlField) {
    
    this.externalUrlField = externalUrlField;
    return this;
  }

   /**
   * 落地页链接字段选择，当params_type为DPA时必填
   * @return externalUrlField
  **/
  @javax.annotation.Nullable
  public String getExternalUrlField() {
    return externalUrlField;
  }


  public void setExternalUrlField(String externalUrlField) {
    this.externalUrlField = externalUrlField;
  }


  public PromotionCreateV30RequestPromotionMaterials externalUrlMaterialList(List<String> externalUrlMaterialList) {
    
    this.externalUrlMaterialList = externalUrlMaterialList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addExternalUrlMaterialListItem(String externalUrlMaterialListItem) {
    if (this.externalUrlMaterialList == null) {
      this.externalUrlMaterialList = new ArrayList<>();
    }
    this.externalUrlMaterialList.add(externalUrlMaterialListItem);
    return this;
  }

   /**
   * 
   * @return externalUrlMaterialList
  **/
  @javax.annotation.Nullable
  public List<String> getExternalUrlMaterialList() {
    return externalUrlMaterialList;
  }


  public void setExternalUrlMaterialList(List<String> externalUrlMaterialList) {
    this.externalUrlMaterialList = externalUrlMaterialList;
  }


  public PromotionCreateV30RequestPromotionMaterials externalUrlParams(String externalUrlParams) {
    
    this.externalUrlParams = externalUrlParams;
    return this;
  }

   /**
   * 落地页检测参数
   * @return externalUrlParams
  **/
  @javax.annotation.Nullable
  public String getExternalUrlParams() {
    return externalUrlParams;
  }


  public void setExternalUrlParams(String externalUrlParams) {
    this.externalUrlParams = externalUrlParams;
  }


  public PromotionCreateV30RequestPromotionMaterials imageMaterialList(List<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInner> imageMaterialList) {
    
    this.imageMaterialList = imageMaterialList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addImageMaterialListItem(PromotionCreateV30RequestPromotionMaterialsImageMaterialListInner imageMaterialListItem) {
    if (this.imageMaterialList == null) {
      this.imageMaterialList = new ArrayList<>();
    }
    this.imageMaterialList.add(imageMaterialListItem);
    return this;
  }

   /**
   * 
   * @return imageMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInner> getImageMaterialList() {
    return imageMaterialList;
  }


  public void setImageMaterialList(List<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInner> imageMaterialList) {
    this.imageMaterialList = imageMaterialList;
  }


  public PromotionCreateV30RequestPromotionMaterials intelligentGeneration(PromotionCreateV30PromotionMaterialsIntelligentGeneration intelligentGeneration) {
    
    this.intelligentGeneration = intelligentGeneration;
    return this;
  }

   /**
   * Get intelligentGeneration
   * @return intelligentGeneration
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30PromotionMaterialsIntelligentGeneration getIntelligentGeneration() {
    return intelligentGeneration;
  }


  public void setIntelligentGeneration(PromotionCreateV30PromotionMaterialsIntelligentGeneration intelligentGeneration) {
    this.intelligentGeneration = intelligentGeneration;
  }


  public PromotionCreateV30RequestPromotionMaterials miniProgramInfo(PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo miniProgramInfo) {
    
    this.miniProgramInfo = miniProgramInfo;
    return this;
  }

   /**
   * Get miniProgramInfo
   * @return miniProgramInfo
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo getMiniProgramInfo() {
    return miniProgramInfo;
  }


  public void setMiniProgramInfo(PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo miniProgramInfo) {
    this.miniProgramInfo = miniProgramInfo;
  }


  public PromotionCreateV30RequestPromotionMaterials openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public PromotionCreateV30RequestPromotionMaterials openUrlField(String openUrlField) {
    
    this.openUrlField = openUrlField;
    return this;
  }

   /**
   * 直达链接字段选择，当dpa_open_url_type为DPA必填
   * @return openUrlField
  **/
  @javax.annotation.Nullable
  public String getOpenUrlField() {
    return openUrlField;
  }


  public void setOpenUrlField(String openUrlField) {
    this.openUrlField = openUrlField;
  }


  public PromotionCreateV30RequestPromotionMaterials openUrlParams(String openUrlParams) {
    
    this.openUrlParams = openUrlParams;
    return this;
  }

   /**
   * 直达链接检测参数(DPA推广目的特有,在“产品库中提取的scheme地址\&quot;后面追加填写的参数)
   * @return openUrlParams
  **/
  @javax.annotation.Nullable
  public String getOpenUrlParams() {
    return openUrlParams;
  }


  public void setOpenUrlParams(String openUrlParams) {
    this.openUrlParams = openUrlParams;
  }


  public PromotionCreateV30RequestPromotionMaterials openUrlType(PromotionCreateV30PromotionMaterialsOpenUrlType openUrlType) {
    
    this.openUrlType = openUrlType;
    return this;
  }

   /**
   * Get openUrlType
   * @return openUrlType
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30PromotionMaterialsOpenUrlType getOpenUrlType() {
    return openUrlType;
  }


  public void setOpenUrlType(PromotionCreateV30PromotionMaterialsOpenUrlType openUrlType) {
    this.openUrlType = openUrlType;
  }


  public PromotionCreateV30RequestPromotionMaterials openUrls(List<String> openUrls) {
    
    this.openUrls = openUrls;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addOpenUrlsItem(String openUrlsItem) {
    if (this.openUrls == null) {
      this.openUrls = new ArrayList<>();
    }
    this.openUrls.add(openUrlsItem);
    return this;
  }

   /**
   * 优选直达链接
   * @return openUrls
  **/
  @javax.annotation.Nullable
  public List<String> getOpenUrls() {
    return openUrls;
  }


  public void setOpenUrls(List<String> openUrls) {
    this.openUrls = openUrls;
  }


  public PromotionCreateV30RequestPromotionMaterials paramsType(PromotionCreateV30PromotionMaterialsParamsType paramsType) {
    
    this.paramsType = paramsType;
    return this;
  }

   /**
   * Get paramsType
   * @return paramsType
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30PromotionMaterialsParamsType getParamsType() {
    return paramsType;
  }


  public void setParamsType(PromotionCreateV30PromotionMaterialsParamsType paramsType) {
    this.paramsType = paramsType;
  }


  public PromotionCreateV30RequestPromotionMaterials playableUrlMaterialList(List<String> playableUrlMaterialList) {
    
    this.playableUrlMaterialList = playableUrlMaterialList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addPlayableUrlMaterialListItem(String playableUrlMaterialListItem) {
    if (this.playableUrlMaterialList == null) {
      this.playableUrlMaterialList = new ArrayList<>();
    }
    this.playableUrlMaterialList.add(playableUrlMaterialListItem);
    return this;
  }

   /**
   * 
   * @return playableUrlMaterialList
  **/
  @javax.annotation.Nullable
  public List<String> getPlayableUrlMaterialList() {
    return playableUrlMaterialList;
  }


  public void setPlayableUrlMaterialList(List<String> playableUrlMaterialList) {
    this.playableUrlMaterialList = playableUrlMaterialList;
  }


  public PromotionCreateV30RequestPromotionMaterials productInfo(PromotionCreateV30RequestPromotionMaterialsProductInfo productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Get productInfo
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30RequestPromotionMaterialsProductInfo getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(PromotionCreateV30RequestPromotionMaterialsProductInfo productInfo) {
    this.productInfo = productInfo;
  }


  public PromotionCreateV30RequestPromotionMaterials textAbstractList(List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner> textAbstractList) {
    
    this.textAbstractList = textAbstractList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addTextAbstractListItem(PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner textAbstractListItem) {
    if (this.textAbstractList == null) {
      this.textAbstractList = new ArrayList<>();
    }
    this.textAbstractList.add(textAbstractListItem);
    return this;
  }

   /**
   * 
   * @return textAbstractList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner> getTextAbstractList() {
    return textAbstractList;
  }


  public void setTextAbstractList(List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner> textAbstractList) {
    this.textAbstractList = textAbstractList;
  }


  public PromotionCreateV30RequestPromotionMaterials titleMaterialList(List<PromotionCreateV30RequestPromotionMaterialsTitleMaterialListInner> titleMaterialList) {
    
    this.titleMaterialList = titleMaterialList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addTitleMaterialListItem(PromotionCreateV30RequestPromotionMaterialsTitleMaterialListInner titleMaterialListItem) {
    if (this.titleMaterialList == null) {
      this.titleMaterialList = new ArrayList<>();
    }
    this.titleMaterialList.add(titleMaterialListItem);
    return this;
  }

   /**
   * 
   * @return titleMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsTitleMaterialListInner> getTitleMaterialList() {
    return titleMaterialList;
  }


  public void setTitleMaterialList(List<PromotionCreateV30RequestPromotionMaterialsTitleMaterialListInner> titleMaterialList) {
    this.titleMaterialList = titleMaterialList;
  }


  public PromotionCreateV30RequestPromotionMaterials ulink(String ulink) {
    
    this.ulink = ulink;
    return this;
  }

   /**
   * 
   * @return ulink
  **/
  @javax.annotation.Nullable
  public String getUlink() {
    return ulink;
  }


  public void setUlink(String ulink) {
    this.ulink = ulink;
  }


  public PromotionCreateV30RequestPromotionMaterials videoMaterialList(List<PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner> videoMaterialList) {
    
    this.videoMaterialList = videoMaterialList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addVideoMaterialListItem(PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner videoMaterialListItem) {
    if (this.videoMaterialList == null) {
      this.videoMaterialList = new ArrayList<>();
    }
    this.videoMaterialList.add(videoMaterialListItem);
    return this;
  }

   /**
   * 
   * @return videoMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner> getVideoMaterialList() {
    return videoMaterialList;
  }


  public void setVideoMaterialList(List<PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner> videoMaterialList) {
    this.videoMaterialList = videoMaterialList;
  }


  public PromotionCreateV30RequestPromotionMaterials webUrlMaterialList(List<String> webUrlMaterialList) {
    
    this.webUrlMaterialList = webUrlMaterialList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterials addWebUrlMaterialListItem(String webUrlMaterialListItem) {
    if (this.webUrlMaterialList == null) {
      this.webUrlMaterialList = new ArrayList<>();
    }
    this.webUrlMaterialList.add(webUrlMaterialListItem);
    return this;
  }

   /**
   * 
   * @return webUrlMaterialList
  **/
  @javax.annotation.Nullable
  public List<String> getWebUrlMaterialList() {
    return webUrlMaterialList;
  }


  public void setWebUrlMaterialList(List<String> webUrlMaterialList) {
    this.webUrlMaterialList = webUrlMaterialList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCreateV30RequestPromotionMaterials promotionCreateV30RequestPromotionMaterials = (PromotionCreateV30RequestPromotionMaterials) o;
    return Objects.equals(this.anchorMaterialList, promotionCreateV30RequestPromotionMaterials.anchorMaterialList) &&
        Objects.equals(this.callToActionButtons, promotionCreateV30RequestPromotionMaterials.callToActionButtons) &&
        Objects.equals(this.carouselMaterialList, promotionCreateV30RequestPromotionMaterials.carouselMaterialList) &&
        Objects.equals(this.componentMaterialList, promotionCreateV30RequestPromotionMaterials.componentMaterialList) &&
        Objects.equals(this.decorationMaterial, promotionCreateV30RequestPromotionMaterials.decorationMaterial) &&
        Objects.equals(this.dynamicCreativeSwitch, promotionCreateV30RequestPromotionMaterials.dynamicCreativeSwitch) &&
        Objects.equals(this.externalUrlField, promotionCreateV30RequestPromotionMaterials.externalUrlField) &&
        Objects.equals(this.externalUrlMaterialList, promotionCreateV30RequestPromotionMaterials.externalUrlMaterialList) &&
        Objects.equals(this.externalUrlParams, promotionCreateV30RequestPromotionMaterials.externalUrlParams) &&
        Objects.equals(this.imageMaterialList, promotionCreateV30RequestPromotionMaterials.imageMaterialList) &&
        Objects.equals(this.intelligentGeneration, promotionCreateV30RequestPromotionMaterials.intelligentGeneration) &&
        Objects.equals(this.miniProgramInfo, promotionCreateV30RequestPromotionMaterials.miniProgramInfo) &&
        Objects.equals(this.openUrl, promotionCreateV30RequestPromotionMaterials.openUrl) &&
        Objects.equals(this.openUrlField, promotionCreateV30RequestPromotionMaterials.openUrlField) &&
        Objects.equals(this.openUrlParams, promotionCreateV30RequestPromotionMaterials.openUrlParams) &&
        Objects.equals(this.openUrlType, promotionCreateV30RequestPromotionMaterials.openUrlType) &&
        Objects.equals(this.openUrls, promotionCreateV30RequestPromotionMaterials.openUrls) &&
        Objects.equals(this.paramsType, promotionCreateV30RequestPromotionMaterials.paramsType) &&
        Objects.equals(this.playableUrlMaterialList, promotionCreateV30RequestPromotionMaterials.playableUrlMaterialList) &&
        Objects.equals(this.productInfo, promotionCreateV30RequestPromotionMaterials.productInfo) &&
        Objects.equals(this.textAbstractList, promotionCreateV30RequestPromotionMaterials.textAbstractList) &&
        Objects.equals(this.titleMaterialList, promotionCreateV30RequestPromotionMaterials.titleMaterialList) &&
        Objects.equals(this.ulink, promotionCreateV30RequestPromotionMaterials.ulink) &&
        Objects.equals(this.videoMaterialList, promotionCreateV30RequestPromotionMaterials.videoMaterialList) &&
        Objects.equals(this.webUrlMaterialList, promotionCreateV30RequestPromotionMaterials.webUrlMaterialList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorMaterialList, callToActionButtons, carouselMaterialList, componentMaterialList, decorationMaterial, dynamicCreativeSwitch, externalUrlField, externalUrlMaterialList, externalUrlParams, imageMaterialList, intelligentGeneration, miniProgramInfo, openUrl, openUrlField, openUrlParams, openUrlType, openUrls, paramsType, playableUrlMaterialList, productInfo, textAbstractList, titleMaterialList, ulink, videoMaterialList, webUrlMaterialList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCreateV30RequestPromotionMaterials {\n");
    sb.append("    anchorMaterialList: ").append(toIndentedString(anchorMaterialList)).append("\n");
    sb.append("    callToActionButtons: ").append(toIndentedString(callToActionButtons)).append("\n");
    sb.append("    carouselMaterialList: ").append(toIndentedString(carouselMaterialList)).append("\n");
    sb.append("    componentMaterialList: ").append(toIndentedString(componentMaterialList)).append("\n");
    sb.append("    decorationMaterial: ").append(toIndentedString(decorationMaterial)).append("\n");
    sb.append("    dynamicCreativeSwitch: ").append(toIndentedString(dynamicCreativeSwitch)).append("\n");
    sb.append("    externalUrlField: ").append(toIndentedString(externalUrlField)).append("\n");
    sb.append("    externalUrlMaterialList: ").append(toIndentedString(externalUrlMaterialList)).append("\n");
    sb.append("    externalUrlParams: ").append(toIndentedString(externalUrlParams)).append("\n");
    sb.append("    imageMaterialList: ").append(toIndentedString(imageMaterialList)).append("\n");
    sb.append("    intelligentGeneration: ").append(toIndentedString(intelligentGeneration)).append("\n");
    sb.append("    miniProgramInfo: ").append(toIndentedString(miniProgramInfo)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    openUrlField: ").append(toIndentedString(openUrlField)).append("\n");
    sb.append("    openUrlParams: ").append(toIndentedString(openUrlParams)).append("\n");
    sb.append("    openUrlType: ").append(toIndentedString(openUrlType)).append("\n");
    sb.append("    openUrls: ").append(toIndentedString(openUrls)).append("\n");
    sb.append("    paramsType: ").append(toIndentedString(paramsType)).append("\n");
    sb.append("    playableUrlMaterialList: ").append(toIndentedString(playableUrlMaterialList)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    textAbstractList: ").append(toIndentedString(textAbstractList)).append("\n");
    sb.append("    titleMaterialList: ").append(toIndentedString(titleMaterialList)).append("\n");
    sb.append("    ulink: ").append(toIndentedString(ulink)).append("\n");
    sb.append("    videoMaterialList: ").append(toIndentedString(videoMaterialList)).append("\n");
    sb.append("    webUrlMaterialList: ").append(toIndentedString(webUrlMaterialList)).append("\n");
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
    openapiFields.add("anchor_material_list");
    openapiFields.add("call_to_action_buttons");
    openapiFields.add("carousel_material_list");
    openapiFields.add("component_material_list");
    openapiFields.add("decoration_material");
    openapiFields.add("dynamic_creative_switch");
    openapiFields.add("external_url_field");
    openapiFields.add("external_url_material_list");
    openapiFields.add("external_url_params");
    openapiFields.add("image_material_list");
    openapiFields.add("intelligent_generation");
    openapiFields.add("mini_program_info");
    openapiFields.add("open_url");
    openapiFields.add("open_url_field");
    openapiFields.add("open_url_params");
    openapiFields.add("open_url_type");
    openapiFields.add("open_urls");
    openapiFields.add("params_type");
    openapiFields.add("playable_url_material_list");
    openapiFields.add("product_info");
    openapiFields.add("text_abstract_list");
    openapiFields.add("title_material_list");
    openapiFields.add("ulink");
    openapiFields.add("video_material_list");
    openapiFields.add("web_url_material_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionCreateV30RequestPromotionMaterials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionCreateV30RequestPromotionMaterials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionCreateV30RequestPromotionMaterials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionCreateV30RequestPromotionMaterials.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionCreateV30RequestPromotionMaterials>() {
           @Override
           public void write(JsonWriter out, PromotionCreateV30RequestPromotionMaterials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionCreateV30RequestPromotionMaterials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionCreateV30RequestPromotionMaterials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionCreateV30RequestPromotionMaterials
  * @throws IOException if the JSON string is invalid with respect to PromotionCreateV30RequestPromotionMaterials
  */
  public static PromotionCreateV30RequestPromotionMaterials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionCreateV30RequestPromotionMaterials.class);
  }

 /**
  * Convert an instance of PromotionCreateV30RequestPromotionMaterials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

