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
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsCarouselMaterialListMaterialStatus;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner {
  public static final String SERIALIZED_NAME_AUDIO_ID = "audio_id";
  @SerializedName(SERIALIZED_NAME_AUDIO_ID)
  private String audioId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_TYPE = "carousel_type";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_TYPE)
  private PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType carouselType = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private List<String> imageId = null;

  public static final String SERIALIZED_NAME_IMAGE_SUBJECTS = "image_subjects";
  @SerializedName(SERIALIZED_NAME_IMAGE_SUBJECTS)
  private List<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner> imageSubjects = null;

  public static final String SERIALIZED_NAME_IS_BLUE_FLOW_RECOMMEND_MATERIAL = "is_blue_flow_recommend_material";
  @SerializedName(SERIALIZED_NAME_IS_BLUE_FLOW_RECOMMEND_MATERIAL)
  private Boolean isBlueFlowRecommendMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_STATUS = "material_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_STATUS)
  private PromotionListV30DataListPromotionMaterialsCarouselMaterialListMaterialStatus materialStatus = null;

  public static final String SERIALIZED_NAME_VIDEO_HP_VISIBILITY = "video_hp_visibility";
  @SerializedName(SERIALIZED_NAME_VIDEO_HP_VISIBILITY)
  private PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility videoHpVisibility = null;

  public static final String SERIALIZED_NAME_VISIBLE_END_DATE = "visible_end_date";
  @SerializedName(SERIALIZED_NAME_VISIBLE_END_DATE)
  private String visibleEndDate = null;

  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner() {
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner audioId(String audioId) {
    
    this.audioId = audioId;
    return this;
  }

   /**
   * 
   * @return audioId
  **/
  @javax.annotation.Nullable
  public String getAudioId() {
    return audioId;
  }


  public void setAudioId(String audioId) {
    this.audioId = audioId;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner carouselType(PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType carouselType) {
    
    this.carouselType = carouselType;
    return this;
  }

   /**
   * Get carouselType
   * @return carouselType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType getCarouselType() {
    return carouselType;
  }


  public void setCarouselType(PromotionListV30DataListPromotionMaterialsCarouselMaterialListCarouselType carouselType) {
    this.carouselType = carouselType;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner imageId(List<String> imageId) {
    
    this.imageId = imageId;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner addImageIdItem(String imageIdItem) {
    if (this.imageId == null) {
      this.imageId = new ArrayList<>();
    }
    this.imageId.add(imageIdItem);
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public List<String> getImageId() {
    return imageId;
  }


  public void setImageId(List<String> imageId) {
    this.imageId = imageId;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner imageSubjects(List<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner> imageSubjects) {
    
    this.imageSubjects = imageSubjects;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner addImageSubjectsItem(PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner imageSubjectsItem) {
    if (this.imageSubjects == null) {
      this.imageSubjects = new ArrayList<>();
    }
    this.imageSubjects.add(imageSubjectsItem);
    return this;
  }

   /**
   * 图片主题
   * @return imageSubjects
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner> getImageSubjects() {
    return imageSubjects;
  }


  public void setImageSubjects(List<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInnerImageSubjectsInner> imageSubjects) {
    this.imageSubjects = imageSubjects;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner isBlueFlowRecommendMaterial(Boolean isBlueFlowRecommendMaterial) {
    
    this.isBlueFlowRecommendMaterial = isBlueFlowRecommendMaterial;
    return this;
  }

   /**
   * 
   * @return isBlueFlowRecommendMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsBlueFlowRecommendMaterial() {
    return isBlueFlowRecommendMaterial;
  }


  public void setIsBlueFlowRecommendMaterial(Boolean isBlueFlowRecommendMaterial) {
    this.isBlueFlowRecommendMaterial = isBlueFlowRecommendMaterial;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner materialStatus(PromotionListV30DataListPromotionMaterialsCarouselMaterialListMaterialStatus materialStatus) {
    
    this.materialStatus = materialStatus;
    return this;
  }

   /**
   * Get materialStatus
   * @return materialStatus
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsCarouselMaterialListMaterialStatus getMaterialStatus() {
    return materialStatus;
  }


  public void setMaterialStatus(PromotionListV30DataListPromotionMaterialsCarouselMaterialListMaterialStatus materialStatus) {
    this.materialStatus = materialStatus;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner videoHpVisibility(PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility videoHpVisibility) {
    
    this.videoHpVisibility = videoHpVisibility;
    return this;
  }

   /**
   * Get videoHpVisibility
   * @return videoHpVisibility
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility getVideoHpVisibility() {
    return videoHpVisibility;
  }


  public void setVideoHpVisibility(PromotionListV30DataListPromotionMaterialsCarouselMaterialListVideoHpVisibility videoHpVisibility) {
    this.videoHpVisibility = videoHpVisibility;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner visibleEndDate(String visibleEndDate) {
    
    this.visibleEndDate = visibleEndDate;
    return this;
  }

   /**
   * 
   * @return visibleEndDate
  **/
  @javax.annotation.Nullable
  public String getVisibleEndDate() {
    return visibleEndDate;
  }


  public void setVisibleEndDate(String visibleEndDate) {
    this.visibleEndDate = visibleEndDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner = (PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner) o;
    return Objects.equals(this.audioId, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.audioId) &&
        Objects.equals(this.carouselType, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.carouselType) &&
        Objects.equals(this.imageId, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.imageId) &&
        Objects.equals(this.imageSubjects, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.imageSubjects) &&
        Objects.equals(this.isBlueFlowRecommendMaterial, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.isBlueFlowRecommendMaterial) &&
        Objects.equals(this.materialStatus, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.materialStatus) &&
        Objects.equals(this.videoHpVisibility, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.videoHpVisibility) &&
        Objects.equals(this.visibleEndDate, promotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.visibleEndDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioId, carouselType, imageId, imageSubjects, isBlueFlowRecommendMaterial, materialStatus, videoHpVisibility, visibleEndDate);
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
    sb.append("class PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner {\n");
    sb.append("    audioId: ").append(toIndentedString(audioId)).append("\n");
    sb.append("    carouselType: ").append(toIndentedString(carouselType)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageSubjects: ").append(toIndentedString(imageSubjects)).append("\n");
    sb.append("    isBlueFlowRecommendMaterial: ").append(toIndentedString(isBlueFlowRecommendMaterial)).append("\n");
    sb.append("    materialStatus: ").append(toIndentedString(materialStatus)).append("\n");
    sb.append("    videoHpVisibility: ").append(toIndentedString(videoHpVisibility)).append("\n");
    sb.append("    visibleEndDate: ").append(toIndentedString(visibleEndDate)).append("\n");
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
    openapiFields.add("audio_id");
    openapiFields.add("carousel_type");
    openapiFields.add("image_id");
    openapiFields.add("image_subjects");
    openapiFields.add("is_blue_flow_recommend_material");
    openapiFields.add("material_status");
    openapiFields.add("video_hp_visibility");
    openapiFields.add("visible_end_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner
  */
  public static PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

