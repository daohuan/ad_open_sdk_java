/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdUpdateV10CreativeListImageMode;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestCreativeListInnerImageMaterial;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestCreativeListInnerTitleMaterial;
import com.bytedance.ads.model.QianchuanAdUpdateV10RequestCreativeListInnerVideoMaterial;
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
 * QianchuanAdUpdateV10RequestCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class QianchuanAdUpdateV10RequestCreativeListInner {
  public static final String SERIALIZED_NAME_CAROUSEL_MATERIAL = "carousel_material";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_MATERIAL)
  private QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial carouselMaterial = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL = "image_material";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL)
  private QianchuanAdUpdateV10RequestCreativeListInnerImageMaterial imageMaterial = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanAdUpdateV10CreativeListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_MATERIAL = "promotion_card_material";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_MATERIAL)
  private QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial promotionCardMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private QianchuanAdUpdateV10RequestCreativeListInnerTitleMaterial titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private QianchuanAdUpdateV10RequestCreativeListInnerVideoMaterial videoMaterial = null;

  public QianchuanAdUpdateV10RequestCreativeListInner() {
  }

  public QianchuanAdUpdateV10RequestCreativeListInner carouselMaterial(QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial carouselMaterial) {
    
    this.carouselMaterial = carouselMaterial;
    return this;
  }

   /**
   * Get carouselMaterial
   * @return carouselMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial getCarouselMaterial() {
    return carouselMaterial;
  }


  public void setCarouselMaterial(QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial carouselMaterial) {
    this.carouselMaterial = carouselMaterial;
  }


  public QianchuanAdUpdateV10RequestCreativeListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public QianchuanAdUpdateV10RequestCreativeListInner imageMaterial(QianchuanAdUpdateV10RequestCreativeListInnerImageMaterial imageMaterial) {
    
    this.imageMaterial = imageMaterial;
    return this;
  }

   /**
   * Get imageMaterial
   * @return imageMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10RequestCreativeListInnerImageMaterial getImageMaterial() {
    return imageMaterial;
  }


  public void setImageMaterial(QianchuanAdUpdateV10RequestCreativeListInnerImageMaterial imageMaterial) {
    this.imageMaterial = imageMaterial;
  }


  public QianchuanAdUpdateV10RequestCreativeListInner imageMode(QianchuanAdUpdateV10CreativeListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public QianchuanAdUpdateV10CreativeListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanAdUpdateV10CreativeListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanAdUpdateV10RequestCreativeListInner promotionCardMaterial(QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial promotionCardMaterial) {
    
    this.promotionCardMaterial = promotionCardMaterial;
    return this;
  }

   /**
   * Get promotionCardMaterial
   * @return promotionCardMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial getPromotionCardMaterial() {
    return promotionCardMaterial;
  }


  public void setPromotionCardMaterial(QianchuanAdUpdateV10RequestCreativeListInnerPromotionCardMaterial promotionCardMaterial) {
    this.promotionCardMaterial = promotionCardMaterial;
  }


  public QianchuanAdUpdateV10RequestCreativeListInner titleMaterial(QianchuanAdUpdateV10RequestCreativeListInnerTitleMaterial titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

   /**
   * Get titleMaterial
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10RequestCreativeListInnerTitleMaterial getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(QianchuanAdUpdateV10RequestCreativeListInnerTitleMaterial titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanAdUpdateV10RequestCreativeListInner videoMaterial(QianchuanAdUpdateV10RequestCreativeListInnerVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10RequestCreativeListInnerVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(QianchuanAdUpdateV10RequestCreativeListInnerVideoMaterial videoMaterial) {
    this.videoMaterial = videoMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdUpdateV10RequestCreativeListInner qianchuanAdUpdateV10RequestCreativeListInner = (QianchuanAdUpdateV10RequestCreativeListInner) o;
    return Objects.equals(this.carouselMaterial, qianchuanAdUpdateV10RequestCreativeListInner.carouselMaterial) &&
        Objects.equals(this.creativeId, qianchuanAdUpdateV10RequestCreativeListInner.creativeId) &&
        Objects.equals(this.imageMaterial, qianchuanAdUpdateV10RequestCreativeListInner.imageMaterial) &&
        Objects.equals(this.imageMode, qianchuanAdUpdateV10RequestCreativeListInner.imageMode) &&
        Objects.equals(this.promotionCardMaterial, qianchuanAdUpdateV10RequestCreativeListInner.promotionCardMaterial) &&
        Objects.equals(this.titleMaterial, qianchuanAdUpdateV10RequestCreativeListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, qianchuanAdUpdateV10RequestCreativeListInner.videoMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carouselMaterial, creativeId, imageMaterial, imageMode, promotionCardMaterial, titleMaterial, videoMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10RequestCreativeListInner {\n");
    sb.append("    carouselMaterial: ").append(toIndentedString(carouselMaterial)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    imageMaterial: ").append(toIndentedString(imageMaterial)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    promotionCardMaterial: ").append(toIndentedString(promotionCardMaterial)).append("\n");
    sb.append("    titleMaterial: ").append(toIndentedString(titleMaterial)).append("\n");
    sb.append("    videoMaterial: ").append(toIndentedString(videoMaterial)).append("\n");
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
    openapiFields.add("carousel_material");
    openapiFields.add("creative_id");
    openapiFields.add("image_material");
    openapiFields.add("image_mode");
    openapiFields.add("promotion_card_material");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10RequestCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10RequestCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10RequestCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10RequestCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10RequestCreativeListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10RequestCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10RequestCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10RequestCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10RequestCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10RequestCreativeListInner
  */
  public static QianchuanAdUpdateV10RequestCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10RequestCreativeListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10RequestCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

