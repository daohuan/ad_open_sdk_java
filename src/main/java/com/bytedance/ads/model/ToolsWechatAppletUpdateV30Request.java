/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
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
 * ToolsWechatAppletUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ToolsWechatAppletUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

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

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_INTRODUCTION = "introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_REMARK_MESSAGE = "remark_message";
  @SerializedName(SERIALIZED_NAME_REMARK_MESSAGE)
  private String remarkMessage = null;

  public ToolsWechatAppletUpdateV30Request() {
  }

  public ToolsWechatAppletUpdateV30Request advertiserId(Long advertiserId) {
    
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


  public ToolsWechatAppletUpdateV30Request guideText(String guideText) {
    
    this.guideText = guideText;
    return this;
  }

   /**
   * 
   * @return guideText
  **/
  @javax.annotation.Nullable
  public String getGuideText() {
    return guideText;
  }


  public void setGuideText(String guideText) {
    this.guideText = guideText;
  }


  public ToolsWechatAppletUpdateV30Request headerImageUrl(String headerImageUrl) {
    
    this.headerImageUrl = headerImageUrl;
    return this;
  }

   /**
   * 
   * @return headerImageUrl
  **/
  @javax.annotation.Nullable
  public String getHeaderImageUrl() {
    return headerImageUrl;
  }


  public void setHeaderImageUrl(String headerImageUrl) {
    this.headerImageUrl = headerImageUrl;
  }


  public ToolsWechatAppletUpdateV30Request iconImageUrl(String iconImageUrl) {
    
    this.iconImageUrl = iconImageUrl;
    return this;
  }

   /**
   * 
   * @return iconImageUrl
  **/
  @javax.annotation.Nullable
  public String getIconImageUrl() {
    return iconImageUrl;
  }


  public void setIconImageUrl(String iconImageUrl) {
    this.iconImageUrl = iconImageUrl;
  }


  public ToolsWechatAppletUpdateV30Request imagesHorizontalUrl(List<String> imagesHorizontalUrl) {
    
    this.imagesHorizontalUrl = imagesHorizontalUrl;
    return this;
  }

  public ToolsWechatAppletUpdateV30Request addImagesHorizontalUrlItem(String imagesHorizontalUrlItem) {
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
  @javax.annotation.Nullable
  public List<String> getImagesHorizontalUrl() {
    return imagesHorizontalUrl;
  }


  public void setImagesHorizontalUrl(List<String> imagesHorizontalUrl) {
    this.imagesHorizontalUrl = imagesHorizontalUrl;
  }


  public ToolsWechatAppletUpdateV30Request imagesVerticalUrl(List<String> imagesVerticalUrl) {
    
    this.imagesVerticalUrl = imagesVerticalUrl;
    return this;
  }

  public ToolsWechatAppletUpdateV30Request addImagesVerticalUrlItem(String imagesVerticalUrlItem) {
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
  @javax.annotation.Nullable
  public List<String> getImagesVerticalUrl() {
    return imagesVerticalUrl;
  }


  public void setImagesVerticalUrl(List<String> imagesVerticalUrl) {
    this.imagesVerticalUrl = imagesVerticalUrl;
  }


  public ToolsWechatAppletUpdateV30Request instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nonnull
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsWechatAppletUpdateV30Request introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 
   * @return introduction
  **/
  @javax.annotation.Nullable
  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public ToolsWechatAppletUpdateV30Request labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ToolsWechatAppletUpdateV30Request addLabelsItem(String labelsItem) {
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
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public ToolsWechatAppletUpdateV30Request remarkMessage(String remarkMessage) {
    
    this.remarkMessage = remarkMessage;
    return this;
  }

   /**
   * 
   * @return remarkMessage
  **/
  @javax.annotation.Nullable
  public String getRemarkMessage() {
    return remarkMessage;
  }


  public void setRemarkMessage(String remarkMessage) {
    this.remarkMessage = remarkMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsWechatAppletUpdateV30Request toolsWechatAppletUpdateV30Request = (ToolsWechatAppletUpdateV30Request) o;
    return Objects.equals(this.advertiserId, toolsWechatAppletUpdateV30Request.advertiserId) &&
        Objects.equals(this.guideText, toolsWechatAppletUpdateV30Request.guideText) &&
        Objects.equals(this.headerImageUrl, toolsWechatAppletUpdateV30Request.headerImageUrl) &&
        Objects.equals(this.iconImageUrl, toolsWechatAppletUpdateV30Request.iconImageUrl) &&
        Objects.equals(this.imagesHorizontalUrl, toolsWechatAppletUpdateV30Request.imagesHorizontalUrl) &&
        Objects.equals(this.imagesVerticalUrl, toolsWechatAppletUpdateV30Request.imagesVerticalUrl) &&
        Objects.equals(this.instanceId, toolsWechatAppletUpdateV30Request.instanceId) &&
        Objects.equals(this.introduction, toolsWechatAppletUpdateV30Request.introduction) &&
        Objects.equals(this.labels, toolsWechatAppletUpdateV30Request.labels) &&
        Objects.equals(this.remarkMessage, toolsWechatAppletUpdateV30Request.remarkMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, guideText, headerImageUrl, iconImageUrl, imagesHorizontalUrl, imagesVerticalUrl, instanceId, introduction, labels, remarkMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsWechatAppletUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    guideText: ").append(toIndentedString(guideText)).append("\n");
    sb.append("    headerImageUrl: ").append(toIndentedString(headerImageUrl)).append("\n");
    sb.append("    iconImageUrl: ").append(toIndentedString(iconImageUrl)).append("\n");
    sb.append("    imagesHorizontalUrl: ").append(toIndentedString(imagesHorizontalUrl)).append("\n");
    sb.append("    imagesVerticalUrl: ").append(toIndentedString(imagesVerticalUrl)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    remarkMessage: ").append(toIndentedString(remarkMessage)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("guide_text");
    openapiFields.add("header_image_url");
    openapiFields.add("icon_image_url");
    openapiFields.add("images_horizontal_url");
    openapiFields.add("images_vertical_url");
    openapiFields.add("instance_id");
    openapiFields.add("introduction");
    openapiFields.add("labels");
    openapiFields.add("remark_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("instance_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsWechatAppletUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsWechatAppletUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsWechatAppletUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsWechatAppletUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsWechatAppletUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsWechatAppletUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsWechatAppletUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsWechatAppletUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsWechatAppletUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsWechatAppletUpdateV30Request
  */
  public static ToolsWechatAppletUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsWechatAppletUpdateV30Request.class);
  }

 /**
  * Convert an instance of ToolsWechatAppletUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

