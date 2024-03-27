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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolsWechatGameCreateV30RequestAnchorList {
  public static final String SERIALIZED_NAME_GUIDE_TEXT = "guide_text";
  @SerializedName(SERIALIZED_NAME_GUIDE_TEXT)
  private String guideText = null;

  public static final String SERIALIZED_NAME_HEADER_IMAGE_URL = "header_image_url";
  @SerializedName(SERIALIZED_NAME_HEADER_IMAGE_URL)
  private String headerImageUrl = null;

  public static final String SERIALIZED_NAME_ICON_IMAGE_URL = "icon_image_url";
  @SerializedName(SERIALIZED_NAME_ICON_IMAGE_URL)
  private String iconImageUrl = null;

  public static final String SERIALIZED_NAME_IMAGES_HORIZONTAL_URL = "images_horizontal_url";
  @SerializedName(SERIALIZED_NAME_IMAGES_HORIZONTAL_URL)
  private List<String> imagesHorizontalUrl = null;

  public static final String SERIALIZED_NAME_IMAGES_VERTICAL_URL = "images_vertical_url";
  @SerializedName(SERIALIZED_NAME_IMAGES_VERTICAL_URL)
  private List<String> imagesVerticalUrl = null;

  public static final String SERIALIZED_NAME_INTRODUCTION = "introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public ToolsWechatGameCreateV30RequestAnchorList() {
  }

  public ToolsWechatGameCreateV30RequestAnchorList guideText(String guideText) {
    
    this.guideText = guideText;
    return this;
  }

   /**
   * 
   * @return guideText
  **/
  @javax.annotation.Nonnull
  public String getGuideText() {
    return guideText;
  }


  public void setGuideText(String guideText) {
    this.guideText = guideText;
  }


  public ToolsWechatGameCreateV30RequestAnchorList headerImageUrl(String headerImageUrl) {
    
    this.headerImageUrl = headerImageUrl;
    return this;
  }

   /**
   * 
   * @return headerImageUrl
  **/
  @javax.annotation.Nonnull
  public String getHeaderImageUrl() {
    return headerImageUrl;
  }


  public void setHeaderImageUrl(String headerImageUrl) {
    this.headerImageUrl = headerImageUrl;
  }


  public ToolsWechatGameCreateV30RequestAnchorList iconImageUrl(String iconImageUrl) {
    
    this.iconImageUrl = iconImageUrl;
    return this;
  }

   /**
   * 
   * @return iconImageUrl
  **/
  @javax.annotation.Nonnull
  public String getIconImageUrl() {
    return iconImageUrl;
  }


  public void setIconImageUrl(String iconImageUrl) {
    this.iconImageUrl = iconImageUrl;
  }


  public ToolsWechatGameCreateV30RequestAnchorList imagesHorizontalUrl(List<String> imagesHorizontalUrl) {
    
    this.imagesHorizontalUrl = imagesHorizontalUrl;
    return this;
  }

  public ToolsWechatGameCreateV30RequestAnchorList addImagesHorizontalUrlItem(String imagesHorizontalUrlItem) {
    if (this.imagesHorizontalUrl == null) {
      this.imagesHorizontalUrl = new ArrayList<>();
    }
    this.imagesHorizontalUrl.add(imagesHorizontalUrlItem);
    return this;
  }

   /**
   * 
   * @return imagesHorizontalUrl
  **/
  @javax.annotation.Nonnull
  public List<String> getImagesHorizontalUrl() {
    return imagesHorizontalUrl;
  }


  public void setImagesHorizontalUrl(List<String> imagesHorizontalUrl) {
    this.imagesHorizontalUrl = imagesHorizontalUrl;
  }


  public ToolsWechatGameCreateV30RequestAnchorList imagesVerticalUrl(List<String> imagesVerticalUrl) {
    
    this.imagesVerticalUrl = imagesVerticalUrl;
    return this;
  }

  public ToolsWechatGameCreateV30RequestAnchorList addImagesVerticalUrlItem(String imagesVerticalUrlItem) {
    if (this.imagesVerticalUrl == null) {
      this.imagesVerticalUrl = new ArrayList<>();
    }
    this.imagesVerticalUrl.add(imagesVerticalUrlItem);
    return this;
  }

   /**
   * 
   * @return imagesVerticalUrl
  **/
  @javax.annotation.Nonnull
  public List<String> getImagesVerticalUrl() {
    return imagesVerticalUrl;
  }


  public void setImagesVerticalUrl(List<String> imagesVerticalUrl) {
    this.imagesVerticalUrl = imagesVerticalUrl;
  }


  public ToolsWechatGameCreateV30RequestAnchorList introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 
   * @return introduction
  **/
  @javax.annotation.Nonnull
  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public ToolsWechatGameCreateV30RequestAnchorList labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ToolsWechatGameCreateV30RequestAnchorList addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * 
   * @return labels
  **/
  @javax.annotation.Nonnull
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsWechatGameCreateV30RequestAnchorList toolsWechatGameCreateV30RequestAnchorList = (ToolsWechatGameCreateV30RequestAnchorList) o;
    return Objects.equals(this.guideText, toolsWechatGameCreateV30RequestAnchorList.guideText) &&
        Objects.equals(this.headerImageUrl, toolsWechatGameCreateV30RequestAnchorList.headerImageUrl) &&
        Objects.equals(this.iconImageUrl, toolsWechatGameCreateV30RequestAnchorList.iconImageUrl) &&
        Objects.equals(this.imagesHorizontalUrl, toolsWechatGameCreateV30RequestAnchorList.imagesHorizontalUrl) &&
        Objects.equals(this.imagesVerticalUrl, toolsWechatGameCreateV30RequestAnchorList.imagesVerticalUrl) &&
        Objects.equals(this.introduction, toolsWechatGameCreateV30RequestAnchorList.introduction) &&
        Objects.equals(this.labels, toolsWechatGameCreateV30RequestAnchorList.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guideText, headerImageUrl, iconImageUrl, imagesHorizontalUrl, imagesVerticalUrl, introduction, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsWechatGameCreateV30RequestAnchorList {\n");
    sb.append("    guideText: ").append(toIndentedString(guideText)).append("\n");
    sb.append("    headerImageUrl: ").append(toIndentedString(headerImageUrl)).append("\n");
    sb.append("    iconImageUrl: ").append(toIndentedString(iconImageUrl)).append("\n");
    sb.append("    imagesHorizontalUrl: ").append(toIndentedString(imagesHorizontalUrl)).append("\n");
    sb.append("    imagesVerticalUrl: ").append(toIndentedString(imagesVerticalUrl)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("guide_text");
    openapiFields.add("header_image_url");
    openapiFields.add("icon_image_url");
    openapiFields.add("images_horizontal_url");
    openapiFields.add("images_vertical_url");
    openapiFields.add("introduction");
    openapiFields.add("labels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("guide_text");
    openapiRequiredFields.add("header_image_url");
    openapiRequiredFields.add("icon_image_url");
    openapiRequiredFields.add("images_horizontal_url");
    openapiRequiredFields.add("images_vertical_url");
    openapiRequiredFields.add("introduction");
    openapiRequiredFields.add("labels");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsWechatGameCreateV30RequestAnchorList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsWechatGameCreateV30RequestAnchorList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsWechatGameCreateV30RequestAnchorList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsWechatGameCreateV30RequestAnchorList.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsWechatGameCreateV30RequestAnchorList>() {
           @Override
           public void write(JsonWriter out, ToolsWechatGameCreateV30RequestAnchorList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsWechatGameCreateV30RequestAnchorList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsWechatGameCreateV30RequestAnchorList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsWechatGameCreateV30RequestAnchorList
  * @throws IOException if the JSON string is invalid with respect to ToolsWechatGameCreateV30RequestAnchorList
  */
  public static ToolsWechatGameCreateV30RequestAnchorList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsWechatGameCreateV30RequestAnchorList.class);
  }

 /**
  * Convert an instance of ToolsWechatGameCreateV30RequestAnchorList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

