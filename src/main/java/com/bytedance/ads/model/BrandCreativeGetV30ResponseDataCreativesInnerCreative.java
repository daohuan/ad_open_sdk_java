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
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeAvatarIcon;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeAwemeItemInfo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeBusinessInfo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeInteractiveModule;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * 创意详情信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreative {
  public static final String SERIALIZED_NAME_ADVANCED_CREATIVE_INFO = "advanced_creative_info";
  @SerializedName(SERIALIZED_NAME_ADVANCED_CREATIVE_INFO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo advancedCreativeInfo = null;

  public static final String SERIALIZED_NAME_AVATAR_ICON = "avatar_icon";
  @SerializedName(SERIALIZED_NAME_AVATAR_ICON)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeAvatarIcon avatarIcon = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_INFO = "aweme_item_info";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_INFO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeAwemeItemInfo awemeItemInfo = null;

  public static final String SERIALIZED_NAME_BUSINESS_INFO = "business_info";
  @SerializedName(SERIALIZED_NAME_BUSINESS_INFO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeBusinessInfo businessInfo = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private String creativeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_INFO = "creative_info";
  @SerializedName(SERIALIZED_NAME_CREATIVE_INFO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo creativeInfo = null;

  public static final String SERIALIZED_NAME_EXTERNAL_INFO = "external_info";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_INFO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo externalInfo = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId = null;

  public static final String SERIALIZED_NAME_IES_CORE_USER_ID = "ies_core_user_id";
  @SerializedName(SERIALIZED_NAME_IES_CORE_USER_ID)
  private String iesCoreUserId = null;

  public static final String SERIALIZED_NAME_INTERACTIVE_MODULE = "interactive_module";
  @SerializedName(SERIALIZED_NAME_INTERACTIVE_MODULE)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeInteractiveModule interactiveModule = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_SPLASH_BUTTON_TEXT = "splash_button_text";
  @SerializedName(SERIALIZED_NAME_SPLASH_BUTTON_TEXT)
  private String splashButtonText = null;

  public static final String SERIALIZED_NAME_SPLASH_CREATIVE = "splash_creative";
  @SerializedName(SERIALIZED_NAME_SPLASH_CREATIVE)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative splashCreative = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_THEME_COLOR = "video_theme_color";
  @SerializedName(SERIALIZED_NAME_VIDEO_THEME_COLOR)
  private String videoThemeColor = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreative() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreative advancedCreativeInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo advancedCreativeInfo) {
    
    this.advancedCreativeInfo = advancedCreativeInfo;
    return this;
  }

   /**
   * Get advancedCreativeInfo
   * @return advancedCreativeInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo getAdvancedCreativeInfo() {
    return advancedCreativeInfo;
  }


  public void setAdvancedCreativeInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo advancedCreativeInfo) {
    this.advancedCreativeInfo = advancedCreativeInfo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative avatarIcon(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAvatarIcon avatarIcon) {
    
    this.avatarIcon = avatarIcon;
    return this;
  }

   /**
   * Get avatarIcon
   * @return avatarIcon
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAvatarIcon getAvatarIcon() {
    return avatarIcon;
  }


  public void setAvatarIcon(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAvatarIcon avatarIcon) {
    this.avatarIcon = avatarIcon;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative awemeItemInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAwemeItemInfo awemeItemInfo) {
    
    this.awemeItemInfo = awemeItemInfo;
    return this;
  }

   /**
   * Get awemeItemInfo
   * @return awemeItemInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAwemeItemInfo getAwemeItemInfo() {
    return awemeItemInfo;
  }


  public void setAwemeItemInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAwemeItemInfo awemeItemInfo) {
    this.awemeItemInfo = awemeItemInfo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative businessInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeBusinessInfo businessInfo) {
    
    this.businessInfo = businessInfo;
    return this;
  }

   /**
   * Get businessInfo
   * @return businessInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeBusinessInfo getBusinessInfo() {
    return businessInfo;
  }


  public void setBusinessInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeBusinessInfo businessInfo) {
    this.businessInfo = businessInfo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative creativeId(String creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 创意ID
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public String getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative creativeInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo creativeInfo) {
    
    this.creativeInfo = creativeInfo;
    return this;
  }

   /**
   * Get creativeInfo
   * @return creativeInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo getCreativeInfo() {
    return creativeInfo;
  }


  public void setCreativeInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo creativeInfo) {
    this.creativeInfo = creativeInfo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative externalInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo externalInfo) {
    
    this.externalInfo = externalInfo;
    return this;
  }

   /**
   * Get externalInfo
   * @return externalInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo getExternalInfo() {
    return externalInfo;
  }


  public void setExternalInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo externalInfo) {
    this.externalInfo = externalInfo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 文章ID
   * @return groupId
  **/
  @javax.annotation.Nullable
  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative iesCoreUserId(String iesCoreUserId) {
    
    this.iesCoreUserId = iesCoreUserId;
    return this;
  }

   /**
   * 抖音用户Id
   * @return iesCoreUserId
  **/
  @javax.annotation.Nullable
  public String getIesCoreUserId() {
    return iesCoreUserId;
  }


  public void setIesCoreUserId(String iesCoreUserId) {
    this.iesCoreUserId = iesCoreUserId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative interactiveModule(BrandCreativeGetV30ResponseDataCreativesInnerCreativeInteractiveModule interactiveModule) {
    
    this.interactiveModule = interactiveModule;
    return this;
  }

   /**
   * Get interactiveModule
   * @return interactiveModule
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeInteractiveModule getInteractiveModule() {
    return interactiveModule;
  }


  public void setInteractiveModule(BrandCreativeGetV30ResponseDataCreativesInnerCreativeInteractiveModule interactiveModule) {
    this.interactiveModule = interactiveModule;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 来源
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative splashButtonText(String splashButtonText) {
    
    this.splashButtonText = splashButtonText;
    return this;
  }

   /**
   * 开屏按钮文案
   * @return splashButtonText
  **/
  @javax.annotation.Nullable
  public String getSplashButtonText() {
    return splashButtonText;
  }


  public void setSplashButtonText(String splashButtonText) {
    this.splashButtonText = splashButtonText;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative splashCreative(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative splashCreative) {
    
    this.splashCreative = splashCreative;
    return this;
  }

   /**
   * Get splashCreative
   * @return splashCreative
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative getSplashCreative() {
    return splashCreative;
  }


  public void setSplashCreative(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreative splashCreative) {
    this.splashCreative = splashCreative;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreative videoThemeColor(String videoThemeColor) {
    
    this.videoThemeColor = videoThemeColor;
    return this;
  }

   /**
   * 按钮颜色配置
   * @return videoThemeColor
  **/
  @javax.annotation.Nullable
  public String getVideoThemeColor() {
    return videoThemeColor;
  }


  public void setVideoThemeColor(String videoThemeColor) {
    this.videoThemeColor = videoThemeColor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreative brandCreativeGetV30ResponseDataCreativesInnerCreative = (BrandCreativeGetV30ResponseDataCreativesInnerCreative) o;
    return Objects.equals(this.advancedCreativeInfo, brandCreativeGetV30ResponseDataCreativesInnerCreative.advancedCreativeInfo) &&
        Objects.equals(this.avatarIcon, brandCreativeGetV30ResponseDataCreativesInnerCreative.avatarIcon) &&
        Objects.equals(this.awemeItemInfo, brandCreativeGetV30ResponseDataCreativesInnerCreative.awemeItemInfo) &&
        Objects.equals(this.businessInfo, brandCreativeGetV30ResponseDataCreativesInnerCreative.businessInfo) &&
        Objects.equals(this.creativeId, brandCreativeGetV30ResponseDataCreativesInnerCreative.creativeId) &&
        Objects.equals(this.creativeInfo, brandCreativeGetV30ResponseDataCreativesInnerCreative.creativeInfo) &&
        Objects.equals(this.externalInfo, brandCreativeGetV30ResponseDataCreativesInnerCreative.externalInfo) &&
        Objects.equals(this.groupId, brandCreativeGetV30ResponseDataCreativesInnerCreative.groupId) &&
        Objects.equals(this.iesCoreUserId, brandCreativeGetV30ResponseDataCreativesInnerCreative.iesCoreUserId) &&
        Objects.equals(this.interactiveModule, brandCreativeGetV30ResponseDataCreativesInnerCreative.interactiveModule) &&
        Objects.equals(this.source, brandCreativeGetV30ResponseDataCreativesInnerCreative.source) &&
        Objects.equals(this.splashButtonText, brandCreativeGetV30ResponseDataCreativesInnerCreative.splashButtonText) &&
        Objects.equals(this.splashCreative, brandCreativeGetV30ResponseDataCreativesInnerCreative.splashCreative) &&
        Objects.equals(this.title, brandCreativeGetV30ResponseDataCreativesInnerCreative.title) &&
        Objects.equals(this.videoThemeColor, brandCreativeGetV30ResponseDataCreativesInnerCreative.videoThemeColor);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedCreativeInfo, avatarIcon, awemeItemInfo, businessInfo, creativeId, creativeInfo, externalInfo, groupId, iesCoreUserId, interactiveModule, source, splashButtonText, splashCreative, title, videoThemeColor);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreative {\n");
    sb.append("    advancedCreativeInfo: ").append(toIndentedString(advancedCreativeInfo)).append("\n");
    sb.append("    avatarIcon: ").append(toIndentedString(avatarIcon)).append("\n");
    sb.append("    awemeItemInfo: ").append(toIndentedString(awemeItemInfo)).append("\n");
    sb.append("    businessInfo: ").append(toIndentedString(businessInfo)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    creativeInfo: ").append(toIndentedString(creativeInfo)).append("\n");
    sb.append("    externalInfo: ").append(toIndentedString(externalInfo)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    iesCoreUserId: ").append(toIndentedString(iesCoreUserId)).append("\n");
    sb.append("    interactiveModule: ").append(toIndentedString(interactiveModule)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    splashButtonText: ").append(toIndentedString(splashButtonText)).append("\n");
    sb.append("    splashCreative: ").append(toIndentedString(splashCreative)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoThemeColor: ").append(toIndentedString(videoThemeColor)).append("\n");
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
    openapiFields.add("advanced_creative_info");
    openapiFields.add("avatar_icon");
    openapiFields.add("aweme_item_info");
    openapiFields.add("business_info");
    openapiFields.add("creative_id");
    openapiFields.add("creative_info");
    openapiFields.add("external_info");
    openapiFields.add("group_id");
    openapiFields.add("ies_core_user_id");
    openapiFields.add("interactive_module");
    openapiFields.add("source");
    openapiFields.add("splash_button_text");
    openapiFields.add("splash_creative");
    openapiFields.add("title");
    openapiFields.add("video_theme_color");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreative.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreative' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreative> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreative.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreative>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreative value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreative read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreative given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreative
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreative
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreative fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreative.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreative to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

