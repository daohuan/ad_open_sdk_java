/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime;
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
 * ToolsPromotionRaiseSetV30RequestRaiseInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsPromotionRaiseSetV30RequestRaiseInfoInner {
  public static final String SERIALIZED_NAME_APPOINTED_TIME = "appointed_time";
  @SerializedName(SERIALIZED_NAME_APPOINTED_TIME)
  private ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime appointedTime = null;

  public static final String SERIALIZED_NAME_IS_EFFECTIVE_NOW = "is_effective_now";
  @SerializedName(SERIALIZED_NAME_IS_EFFECTIVE_NOW)
  private Boolean isEffectiveNow = null;

  public static final String SERIALIZED_NAME_RAISE_BUDGET = "raise_budget";
  @SerializedName(SERIALIZED_NAME_RAISE_BUDGET)
  private Double raiseBudget = null;

  public ToolsPromotionRaiseSetV30RequestRaiseInfoInner() {
  }

  public ToolsPromotionRaiseSetV30RequestRaiseInfoInner appointedTime(ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime appointedTime) {
    
    this.appointedTime = appointedTime;
    return this;
  }

   /**
   * Get appointedTime
   * @return appointedTime
  **/
  @javax.annotation.Nullable
  public ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime getAppointedTime() {
    return appointedTime;
  }


  public void setAppointedTime(ToolsPromotionRaiseSetV30RequestRaiseInfoInnerAppointedTime appointedTime) {
    this.appointedTime = appointedTime;
  }


  public ToolsPromotionRaiseSetV30RequestRaiseInfoInner isEffectiveNow(Boolean isEffectiveNow) {
    
    this.isEffectiveNow = isEffectiveNow;
    return this;
  }

   /**
   * 是否立即生效，仅支持广告状态为“投放中”的广告，仅支持1个方案设置“立即生效”，传入True时不支持填写appointed_time
   * @return isEffectiveNow
  **/
  @javax.annotation.Nonnull
  public Boolean getIsEffectiveNow() {
    return isEffectiveNow;
  }


  public void setIsEffectiveNow(Boolean isEffectiveNow) {
    this.isEffectiveNow = isEffectiveNow;
  }


  public ToolsPromotionRaiseSetV30RequestRaiseInfoInner raiseBudget(Double raiseBudget) {
    
    this.raiseBudget = raiseBudget;
    return this;
  }

   /**
   * 起量预算，单位：元，允许小数点后两位 起量预算需大于等于计划出价，小于等于计划预算
   * @return raiseBudget
  **/
  @javax.annotation.Nonnull
  public Double getRaiseBudget() {
    return raiseBudget;
  }


  public void setRaiseBudget(Double raiseBudget) {
    this.raiseBudget = raiseBudget;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionRaiseSetV30RequestRaiseInfoInner toolsPromotionRaiseSetV30RequestRaiseInfoInner = (ToolsPromotionRaiseSetV30RequestRaiseInfoInner) o;
    return Objects.equals(this.appointedTime, toolsPromotionRaiseSetV30RequestRaiseInfoInner.appointedTime) &&
        Objects.equals(this.isEffectiveNow, toolsPromotionRaiseSetV30RequestRaiseInfoInner.isEffectiveNow) &&
        Objects.equals(this.raiseBudget, toolsPromotionRaiseSetV30RequestRaiseInfoInner.raiseBudget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointedTime, isEffectiveNow, raiseBudget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPromotionRaiseSetV30RequestRaiseInfoInner {\n");
    sb.append("    appointedTime: ").append(toIndentedString(appointedTime)).append("\n");
    sb.append("    isEffectiveNow: ").append(toIndentedString(isEffectiveNow)).append("\n");
    sb.append("    raiseBudget: ").append(toIndentedString(raiseBudget)).append("\n");
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
    openapiFields.add("appointed_time");
    openapiFields.add("is_effective_now");
    openapiFields.add("raise_budget");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("is_effective_now");
    openapiRequiredFields.add("raise_budget");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionRaiseSetV30RequestRaiseInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionRaiseSetV30RequestRaiseInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionRaiseSetV30RequestRaiseInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionRaiseSetV30RequestRaiseInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionRaiseSetV30RequestRaiseInfoInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionRaiseSetV30RequestRaiseInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionRaiseSetV30RequestRaiseInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionRaiseSetV30RequestRaiseInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionRaiseSetV30RequestRaiseInfoInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionRaiseSetV30RequestRaiseInfoInner
  */
  public static ToolsPromotionRaiseSetV30RequestRaiseInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionRaiseSetV30RequestRaiseInfoInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionRaiseSetV30RequestRaiseInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
