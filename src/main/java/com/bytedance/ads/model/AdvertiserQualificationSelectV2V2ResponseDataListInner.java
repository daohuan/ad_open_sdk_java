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
import com.bytedance.ads.model.AdvertiserQualificationSelectV2V2ResponseDataListInnerImageListInner;
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
 * AdvertiserQualificationSelectV2V2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class AdvertiserQualificationSelectV2V2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUDIT_TIME = "audit_time";
  @SerializedName(SERIALIZED_NAME_AUDIT_TIME)
  private String auditTime = null;

  public static final String SERIALIZED_NAME_IMAGE_LIST = "image_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_LIST)
  private List<AdvertiserQualificationSelectV2V2ResponseDataListInnerImageListInner> imageList = null;

  public static final String SERIALIZED_NAME_PICTURE_PREVIEW_URL = "picture_preview_url";
  @SerializedName(SERIALIZED_NAME_PICTURE_PREVIEW_URL)
  private String picturePreviewUrl = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_ID = "qualification_id";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_ID)
  private Long qualificationId = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_TYPE = "qualification_type";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_TYPE)
  private Long qualificationType = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public AdvertiserQualificationSelectV2V2ResponseDataListInner() {
  }

  public AdvertiserQualificationSelectV2V2ResponseDataListInner auditTime(String auditTime) {
    
    this.auditTime = auditTime;
    return this;
  }

   /**
   * 
   * @return auditTime
  **/
  @javax.annotation.Nullable
  public String getAuditTime() {
    return auditTime;
  }


  public void setAuditTime(String auditTime) {
    this.auditTime = auditTime;
  }


  public AdvertiserQualificationSelectV2V2ResponseDataListInner imageList(List<AdvertiserQualificationSelectV2V2ResponseDataListInnerImageListInner> imageList) {
    
    this.imageList = imageList;
    return this;
  }

  public AdvertiserQualificationSelectV2V2ResponseDataListInner addImageListItem(AdvertiserQualificationSelectV2V2ResponseDataListInnerImageListInner imageListItem) {
    if (this.imageList == null) {
      this.imageList = new ArrayList<>();
    }
    this.imageList.add(imageListItem);
    return this;
  }

   /**
   * 
   * @return imageList
  **/
  @javax.annotation.Nullable
  public List<AdvertiserQualificationSelectV2V2ResponseDataListInnerImageListInner> getImageList() {
    return imageList;
  }


  public void setImageList(List<AdvertiserQualificationSelectV2V2ResponseDataListInnerImageListInner> imageList) {
    this.imageList = imageList;
  }


  public AdvertiserQualificationSelectV2V2ResponseDataListInner picturePreviewUrl(String picturePreviewUrl) {
    
    this.picturePreviewUrl = picturePreviewUrl;
    return this;
  }

   /**
   * 
   * @return picturePreviewUrl
  **/
  @javax.annotation.Nullable
  public String getPicturePreviewUrl() {
    return picturePreviewUrl;
  }


  public void setPicturePreviewUrl(String picturePreviewUrl) {
    this.picturePreviewUrl = picturePreviewUrl;
  }


  public AdvertiserQualificationSelectV2V2ResponseDataListInner qualificationId(Long qualificationId) {
    
    this.qualificationId = qualificationId;
    return this;
  }

   /**
   * 
   * @return qualificationId
  **/
  @javax.annotation.Nullable
  public Long getQualificationId() {
    return qualificationId;
  }


  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }


  public AdvertiserQualificationSelectV2V2ResponseDataListInner qualificationType(Long qualificationType) {
    
    this.qualificationType = qualificationType;
    return this;
  }

   /**
   * 
   * @return qualificationType
  **/
  @javax.annotation.Nullable
  public Long getQualificationType() {
    return qualificationType;
  }


  public void setQualificationType(Long qualificationType) {
    this.qualificationType = qualificationType;
  }


  public AdvertiserQualificationSelectV2V2ResponseDataListInner rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public AdvertiserQualificationSelectV2V2ResponseDataListInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserQualificationSelectV2V2ResponseDataListInner advertiserQualificationSelectV2V2ResponseDataListInner = (AdvertiserQualificationSelectV2V2ResponseDataListInner) o;
    return Objects.equals(this.auditTime, advertiserQualificationSelectV2V2ResponseDataListInner.auditTime) &&
        Objects.equals(this.imageList, advertiserQualificationSelectV2V2ResponseDataListInner.imageList) &&
        Objects.equals(this.picturePreviewUrl, advertiserQualificationSelectV2V2ResponseDataListInner.picturePreviewUrl) &&
        Objects.equals(this.qualificationId, advertiserQualificationSelectV2V2ResponseDataListInner.qualificationId) &&
        Objects.equals(this.qualificationType, advertiserQualificationSelectV2V2ResponseDataListInner.qualificationType) &&
        Objects.equals(this.rejectReason, advertiserQualificationSelectV2V2ResponseDataListInner.rejectReason) &&
        Objects.equals(this.status, advertiserQualificationSelectV2V2ResponseDataListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditTime, imageList, picturePreviewUrl, qualificationId, qualificationType, rejectReason, status);
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
    sb.append("class AdvertiserQualificationSelectV2V2ResponseDataListInner {\n");
    sb.append("    auditTime: ").append(toIndentedString(auditTime)).append("\n");
    sb.append("    imageList: ").append(toIndentedString(imageList)).append("\n");
    sb.append("    picturePreviewUrl: ").append(toIndentedString(picturePreviewUrl)).append("\n");
    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("audit_time");
    openapiFields.add("image_list");
    openapiFields.add("picture_preview_url");
    openapiFields.add("qualification_id");
    openapiFields.add("qualification_type");
    openapiFields.add("reject_reason");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audit_time");
    openapiRequiredFields.add("picture_preview_url");
    openapiRequiredFields.add("qualification_id");
    openapiRequiredFields.add("reject_reason");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationSelectV2V2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationSelectV2V2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationSelectV2V2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationSelectV2V2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationSelectV2V2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationSelectV2V2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationSelectV2V2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationSelectV2V2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationSelectV2V2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationSelectV2V2ResponseDataListInner
  */
  public static AdvertiserQualificationSelectV2V2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationSelectV2V2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationSelectV2V2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

