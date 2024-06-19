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
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreative;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * BrandCreativeCreateV30RequestCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class BrandCreativeCreateV30RequestCreativeListInner {
  public static final String SERIALIZED_NAME_ADVANCED_CREATIVE = "advanced_creative";
  @SerializedName(SERIALIZED_NAME_ADVANCED_CREATIVE)
  private BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreative advancedCreative = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_IS_A_I_G_C = "creative_is_AIGC";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IS_A_I_G_C)
  private Boolean creativeIsAIGC = null;

  public static final String SERIALIZED_NAME_EXTERNAL_OPEN_URL = "external_open_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_OPEN_URL)
  private String externalOpenUrl = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_IS_DOWNLOAD = "external_url_is_download";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_IS_DOWNLOAD)
  private Boolean externalUrlIsDownload = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_TITLE = "external_url_title";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_TITLE)
  private String externalUrlTitle = null;

  public static final String SERIALIZED_NAME_IES_CORE_USER_ID = "ies_core_user_id";
  @SerializedName(SERIALIZED_NAME_IES_CORE_USER_ID)
  private Long iesCoreUserId = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_MATERIAL_PACKAGE_ID = "material_package_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_PACKAGE_ID)
  private Long materialPackageId = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl = null;

  public static final String SERIALIZED_NAME_WEB_URL_IS_DOWNLOAD = "web_url_is_download";
  @SerializedName(SERIALIZED_NAME_WEB_URL_IS_DOWNLOAD)
  private Boolean webUrlIsDownload = null;

  public BrandCreativeCreateV30RequestCreativeListInner() {
  }

  public BrandCreativeCreateV30RequestCreativeListInner advancedCreative(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreative advancedCreative) {
    
    this.advancedCreative = advancedCreative;
    return this;
  }

   /**
   * Get advancedCreative
   * @return advancedCreative
  **/
  @javax.annotation.Nullable
  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreative getAdvancedCreative() {
    return advancedCreative;
  }


  public void setAdvancedCreative(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreative advancedCreative) {
    this.advancedCreative = advancedCreative;
  }


  public BrandCreativeCreateV30RequestCreativeListInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号ID
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public BrandCreativeCreateV30RequestCreativeListInner creativeIsAIGC(Boolean creativeIsAIGC) {
    
    this.creativeIsAIGC = creativeIsAIGC;
    return this;
  }

   /**
   * 是否AI生成
   * @return creativeIsAIGC
  **/
  @javax.annotation.Nonnull
  public Boolean getCreativeIsAIGC() {
    return creativeIsAIGC;
  }


  public void setCreativeIsAIGC(Boolean creativeIsAIGC) {
    this.creativeIsAIGC = creativeIsAIGC;
  }


  public BrandCreativeCreateV30RequestCreativeListInner externalOpenUrl(String externalOpenUrl) {
    
    this.externalOpenUrl = externalOpenUrl;
    return this;
  }

   /**
   * 直达链接
   * @return externalOpenUrl
  **/
  @javax.annotation.Nullable
  public String getExternalOpenUrl() {
    return externalOpenUrl;
  }


  public void setExternalOpenUrl(String externalOpenUrl) {
    this.externalOpenUrl = externalOpenUrl;
  }


  public BrandCreativeCreateV30RequestCreativeListInner externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 落地页链接
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public BrandCreativeCreateV30RequestCreativeListInner externalUrlIsDownload(Boolean externalUrlIsDownload) {
    
    this.externalUrlIsDownload = externalUrlIsDownload;
    return this;
  }

   /**
   * 落地页是否包含下载链接
   * @return externalUrlIsDownload
  **/
  @javax.annotation.Nullable
  public Boolean getExternalUrlIsDownload() {
    return externalUrlIsDownload;
  }


  public void setExternalUrlIsDownload(Boolean externalUrlIsDownload) {
    this.externalUrlIsDownload = externalUrlIsDownload;
  }


  public BrandCreativeCreateV30RequestCreativeListInner externalUrlTitle(String externalUrlTitle) {
    
    this.externalUrlTitle = externalUrlTitle;
    return this;
  }

   /**
   * 落地页标题
   * @return externalUrlTitle
  **/
  @javax.annotation.Nullable
  public String getExternalUrlTitle() {
    return externalUrlTitle;
  }


  public void setExternalUrlTitle(String externalUrlTitle) {
    this.externalUrlTitle = externalUrlTitle;
  }


  public BrandCreativeCreateV30RequestCreativeListInner iesCoreUserId(Long iesCoreUserId) {
    
    this.iesCoreUserId = iesCoreUserId;
    return this;
  }

   /**
   * 抖音号UID
   * @return iesCoreUserId
  **/
  @javax.annotation.Nullable
  public Long getIesCoreUserId() {
    return iesCoreUserId;
  }


  public void setIesCoreUserId(Long iesCoreUserId) {
    this.iesCoreUserId = iesCoreUserId;
  }


  public BrandCreativeCreateV30RequestCreativeListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 抖音视频ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public BrandCreativeCreateV30RequestCreativeListInner materialPackageId(Long materialPackageId) {
    
    this.materialPackageId = materialPackageId;
    return this;
  }

   /**
   * 素材包ID
   * @return materialPackageId
  **/
  @javax.annotation.Nullable
  public Long getMaterialPackageId() {
    return materialPackageId;
  }


  public void setMaterialPackageId(Long materialPackageId) {
    this.materialPackageId = materialPackageId;
  }


  public BrandCreativeCreateV30RequestCreativeListInner openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 购物车无分佣直达链接
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public BrandCreativeCreateV30RequestCreativeListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 创意标题，选择素材包和抖音视频ID时无需填写
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public BrandCreativeCreateV30RequestCreativeListInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频ID
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public BrandCreativeCreateV30RequestCreativeListInner webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * 购物车无分佣链接
   * @return webUrl
  **/
  @javax.annotation.Nullable
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  public BrandCreativeCreateV30RequestCreativeListInner webUrlIsDownload(Boolean webUrlIsDownload) {
    
    this.webUrlIsDownload = webUrlIsDownload;
    return this;
  }

   /**
   * web_url是否是下载类落地页链接
   * @return webUrlIsDownload
  **/
  @javax.annotation.Nullable
  public Boolean getWebUrlIsDownload() {
    return webUrlIsDownload;
  }


  public void setWebUrlIsDownload(Boolean webUrlIsDownload) {
    this.webUrlIsDownload = webUrlIsDownload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeCreateV30RequestCreativeListInner brandCreativeCreateV30RequestCreativeListInner = (BrandCreativeCreateV30RequestCreativeListInner) o;
    return Objects.equals(this.advancedCreative, brandCreativeCreateV30RequestCreativeListInner.advancedCreative) &&
        Objects.equals(this.awemeId, brandCreativeCreateV30RequestCreativeListInner.awemeId) &&
        Objects.equals(this.creativeIsAIGC, brandCreativeCreateV30RequestCreativeListInner.creativeIsAIGC) &&
        Objects.equals(this.externalOpenUrl, brandCreativeCreateV30RequestCreativeListInner.externalOpenUrl) &&
        Objects.equals(this.externalUrl, brandCreativeCreateV30RequestCreativeListInner.externalUrl) &&
        Objects.equals(this.externalUrlIsDownload, brandCreativeCreateV30RequestCreativeListInner.externalUrlIsDownload) &&
        Objects.equals(this.externalUrlTitle, brandCreativeCreateV30RequestCreativeListInner.externalUrlTitle) &&
        Objects.equals(this.iesCoreUserId, brandCreativeCreateV30RequestCreativeListInner.iesCoreUserId) &&
        Objects.equals(this.itemId, brandCreativeCreateV30RequestCreativeListInner.itemId) &&
        Objects.equals(this.materialPackageId, brandCreativeCreateV30RequestCreativeListInner.materialPackageId) &&
        Objects.equals(this.openUrl, brandCreativeCreateV30RequestCreativeListInner.openUrl) &&
        Objects.equals(this.title, brandCreativeCreateV30RequestCreativeListInner.title) &&
        Objects.equals(this.videoId, brandCreativeCreateV30RequestCreativeListInner.videoId) &&
        Objects.equals(this.webUrl, brandCreativeCreateV30RequestCreativeListInner.webUrl) &&
        Objects.equals(this.webUrlIsDownload, brandCreativeCreateV30RequestCreativeListInner.webUrlIsDownload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedCreative, awemeId, creativeIsAIGC, externalOpenUrl, externalUrl, externalUrlIsDownload, externalUrlTitle, iesCoreUserId, itemId, materialPackageId, openUrl, title, videoId, webUrl, webUrlIsDownload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCreativeCreateV30RequestCreativeListInner {\n");
    sb.append("    advancedCreative: ").append(toIndentedString(advancedCreative)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    creativeIsAIGC: ").append(toIndentedString(creativeIsAIGC)).append("\n");
    sb.append("    externalOpenUrl: ").append(toIndentedString(externalOpenUrl)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    externalUrlIsDownload: ").append(toIndentedString(externalUrlIsDownload)).append("\n");
    sb.append("    externalUrlTitle: ").append(toIndentedString(externalUrlTitle)).append("\n");
    sb.append("    iesCoreUserId: ").append(toIndentedString(iesCoreUserId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    materialPackageId: ").append(toIndentedString(materialPackageId)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    webUrlIsDownload: ").append(toIndentedString(webUrlIsDownload)).append("\n");
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
    openapiFields.add("advanced_creative");
    openapiFields.add("aweme_id");
    openapiFields.add("creative_is_AIGC");
    openapiFields.add("external_open_url");
    openapiFields.add("external_url");
    openapiFields.add("external_url_is_download");
    openapiFields.add("external_url_title");
    openapiFields.add("ies_core_user_id");
    openapiFields.add("item_id");
    openapiFields.add("material_package_id");
    openapiFields.add("open_url");
    openapiFields.add("title");
    openapiFields.add("video_id");
    openapiFields.add("web_url");
    openapiFields.add("web_url_is_download");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("creative_is_AIGC");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeCreateV30RequestCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeCreateV30RequestCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeCreateV30RequestCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeCreateV30RequestCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeCreateV30RequestCreativeListInner>() {
           @Override
           public void write(JsonWriter out, BrandCreativeCreateV30RequestCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeCreateV30RequestCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeCreateV30RequestCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeCreateV30RequestCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeCreateV30RequestCreativeListInner
  */
  public static BrandCreativeCreateV30RequestCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeCreateV30RequestCreativeListInner.class);
  }

 /**
  * Convert an instance of BrandCreativeCreateV30RequestCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

