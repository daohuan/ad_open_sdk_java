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
import com.bytedance.ads.model.PromotionListV30FilteringDeliveryMode;
import com.bytedance.ads.model.PromotionListV30FilteringLearningPhase;
import com.bytedance.ads.model.PromotionListV30FilteringRejectReasonType;
import com.bytedance.ads.model.PromotionListV30FilteringStatus;
import com.bytedance.ads.model.PromotionListV30FilteringStatusFirst;
import com.bytedance.ads.model.PromotionListV30FilteringStatusSecond;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class PromotionListV30Filtering {
  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private PromotionListV30FilteringDeliveryMode deliveryMode = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public static final String SERIALIZED_NAME_LEARNING_PHASE = "learning_phase";
  @SerializedName(SERIALIZED_NAME_LEARNING_PHASE)
  private List<PromotionListV30FilteringLearningPhase> learningPhase = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROMOTION_CREATE_TIME = "promotion_create_time";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CREATE_TIME)
  private String promotionCreateTime = null;

  public static final String SERIALIZED_NAME_PROMOTION_MODIFY_TIME = "promotion_modify_time";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MODIFY_TIME)
  private String promotionModifyTime = null;

  public static final String SERIALIZED_NAME_REJECT_REASON_TYPE = "reject_reason_type";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON_TYPE)
  private List<PromotionListV30FilteringRejectReasonType> rejectReasonType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PromotionListV30FilteringStatus status = null;

  public static final String SERIALIZED_NAME_STATUS_FIRST = "status_first";
  @SerializedName(SERIALIZED_NAME_STATUS_FIRST)
  private PromotionListV30FilteringStatusFirst statusFirst = null;

  public static final String SERIALIZED_NAME_STATUS_SECOND = "status_second";
  @SerializedName(SERIALIZED_NAME_STATUS_SECOND)
  private PromotionListV30FilteringStatusSecond statusSecond = null;

  public PromotionListV30Filtering() {
  }

  public PromotionListV30Filtering deliveryMode(PromotionListV30FilteringDeliveryMode deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * Get deliveryMode
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public PromotionListV30FilteringDeliveryMode getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(PromotionListV30FilteringDeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public PromotionListV30Filtering ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public PromotionListV30Filtering addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<Long> getIds() {
    return ids;
  }


  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public PromotionListV30Filtering learningPhase(List<PromotionListV30FilteringLearningPhase> learningPhase) {
    
    this.learningPhase = learningPhase;
    return this;
  }

  public PromotionListV30Filtering addLearningPhaseItem(PromotionListV30FilteringLearningPhase learningPhaseItem) {
    if (this.learningPhase == null) {
      this.learningPhase = new ArrayList<>();
    }
    this.learningPhase.add(learningPhaseItem);
    return this;
  }

   /**
   * 
   * @return learningPhase
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30FilteringLearningPhase> getLearningPhase() {
    return learningPhase;
  }


  public void setLearningPhase(List<PromotionListV30FilteringLearningPhase> learningPhase) {
    this.learningPhase = learningPhase;
  }


  public PromotionListV30Filtering name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PromotionListV30Filtering projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public PromotionListV30Filtering promotionCreateTime(String promotionCreateTime) {
    
    this.promotionCreateTime = promotionCreateTime;
    return this;
  }

   /**
   * 
   * @return promotionCreateTime
  **/
  @javax.annotation.Nullable
  public String getPromotionCreateTime() {
    return promotionCreateTime;
  }


  public void setPromotionCreateTime(String promotionCreateTime) {
    this.promotionCreateTime = promotionCreateTime;
  }


  public PromotionListV30Filtering promotionModifyTime(String promotionModifyTime) {
    
    this.promotionModifyTime = promotionModifyTime;
    return this;
  }

   /**
   * 
   * @return promotionModifyTime
  **/
  @javax.annotation.Nullable
  public String getPromotionModifyTime() {
    return promotionModifyTime;
  }


  public void setPromotionModifyTime(String promotionModifyTime) {
    this.promotionModifyTime = promotionModifyTime;
  }


  public PromotionListV30Filtering rejectReasonType(List<PromotionListV30FilteringRejectReasonType> rejectReasonType) {
    
    this.rejectReasonType = rejectReasonType;
    return this;
  }

  public PromotionListV30Filtering addRejectReasonTypeItem(PromotionListV30FilteringRejectReasonType rejectReasonTypeItem) {
    if (this.rejectReasonType == null) {
      this.rejectReasonType = new ArrayList<>();
    }
    this.rejectReasonType.add(rejectReasonTypeItem);
    return this;
  }

   /**
   * 
   * @return rejectReasonType
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30FilteringRejectReasonType> getRejectReasonType() {
    return rejectReasonType;
  }


  public void setRejectReasonType(List<PromotionListV30FilteringRejectReasonType> rejectReasonType) {
    this.rejectReasonType = rejectReasonType;
  }


  public PromotionListV30Filtering status(PromotionListV30FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public PromotionListV30FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(PromotionListV30FilteringStatus status) {
    this.status = status;
  }


  public PromotionListV30Filtering statusFirst(PromotionListV30FilteringStatusFirst statusFirst) {
    
    this.statusFirst = statusFirst;
    return this;
  }

   /**
   * Get statusFirst
   * @return statusFirst
  **/
  @javax.annotation.Nullable
  public PromotionListV30FilteringStatusFirst getStatusFirst() {
    return statusFirst;
  }


  public void setStatusFirst(PromotionListV30FilteringStatusFirst statusFirst) {
    this.statusFirst = statusFirst;
  }


  public PromotionListV30Filtering statusSecond(PromotionListV30FilteringStatusSecond statusSecond) {
    
    this.statusSecond = statusSecond;
    return this;
  }

   /**
   * Get statusSecond
   * @return statusSecond
  **/
  @javax.annotation.Nullable
  public PromotionListV30FilteringStatusSecond getStatusSecond() {
    return statusSecond;
  }


  public void setStatusSecond(PromotionListV30FilteringStatusSecond statusSecond) {
    this.statusSecond = statusSecond;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30Filtering promotionListV30Filtering = (PromotionListV30Filtering) o;
    return Objects.equals(this.deliveryMode, promotionListV30Filtering.deliveryMode) &&
        Objects.equals(this.ids, promotionListV30Filtering.ids) &&
        Objects.equals(this.learningPhase, promotionListV30Filtering.learningPhase) &&
        Objects.equals(this.name, promotionListV30Filtering.name) &&
        Objects.equals(this.projectId, promotionListV30Filtering.projectId) &&
        Objects.equals(this.promotionCreateTime, promotionListV30Filtering.promotionCreateTime) &&
        Objects.equals(this.promotionModifyTime, promotionListV30Filtering.promotionModifyTime) &&
        Objects.equals(this.rejectReasonType, promotionListV30Filtering.rejectReasonType) &&
        Objects.equals(this.status, promotionListV30Filtering.status) &&
        Objects.equals(this.statusFirst, promotionListV30Filtering.statusFirst) &&
        Objects.equals(this.statusSecond, promotionListV30Filtering.statusSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMode, ids, learningPhase, name, projectId, promotionCreateTime, promotionModifyTime, rejectReasonType, status, statusFirst, statusSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionListV30Filtering {\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    learningPhase: ").append(toIndentedString(learningPhase)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    promotionCreateTime: ").append(toIndentedString(promotionCreateTime)).append("\n");
    sb.append("    promotionModifyTime: ").append(toIndentedString(promotionModifyTime)).append("\n");
    sb.append("    rejectReasonType: ").append(toIndentedString(rejectReasonType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusFirst: ").append(toIndentedString(statusFirst)).append("\n");
    sb.append("    statusSecond: ").append(toIndentedString(statusSecond)).append("\n");
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
    openapiFields.add("delivery_mode");
    openapiFields.add("ids");
    openapiFields.add("learning_phase");
    openapiFields.add("name");
    openapiFields.add("project_id");
    openapiFields.add("promotion_create_time");
    openapiFields.add("promotion_modify_time");
    openapiFields.add("reject_reason_type");
    openapiFields.add("status");
    openapiFields.add("status_first");
    openapiFields.add("status_second");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30Filtering>() {
           @Override
           public void write(JsonWriter out, PromotionListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30Filtering
  */
  public static PromotionListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30Filtering.class);
  }

 /**
  * Convert an instance of PromotionListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

