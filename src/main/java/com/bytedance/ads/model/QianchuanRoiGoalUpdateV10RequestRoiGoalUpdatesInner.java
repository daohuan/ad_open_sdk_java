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
 * QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner() {
  }

  public QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nonnull
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner qianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner = (QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner) o;
    return Objects.equals(this.adId, qianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner.adId) &&
        Objects.equals(this.roiGoal, qianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner.roiGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, roiGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("roi_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("roi_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner>() {
           @Override
           public void write(JsonWriter out, QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner
  */
  public static QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner.class);
  }

 /**
  * Convert an instance of QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

