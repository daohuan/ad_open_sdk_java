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
import com.bytedance.ads.model.ToolsAdRaiseSetV2OptType;
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
 * ToolsAdRaiseSetV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class ToolsAdRaiseSetV2Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET_VALUE = "budget_value";
  @SerializedName(SERIALIZED_NAME_BUDGET_VALUE)
  private Long budgetValue = null;

  public static final String SERIALIZED_NAME_MODIFY_VALUE = "modify_value";
  @SerializedName(SERIALIZED_NAME_MODIFY_VALUE)
  private Long modifyValue = null;

  public static final String SERIALIZED_NAME_OPT_TYPE = "opt_type";
  @SerializedName(SERIALIZED_NAME_OPT_TYPE)
  private ToolsAdRaiseSetV2OptType optType = null;

  public ToolsAdRaiseSetV2Request() {
  }

  public ToolsAdRaiseSetV2Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ToolsAdRaiseSetV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsAdRaiseSetV2Request budgetValue(Long budgetValue) {
    
    this.budgetValue = budgetValue;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 9223372036854775807
   * @return budgetValue
  **/
  @javax.annotation.Nullable
  public Long getBudgetValue() {
    return budgetValue;
  }


  public void setBudgetValue(Long budgetValue) {
    this.budgetValue = budgetValue;
  }


  public ToolsAdRaiseSetV2Request modifyValue(Long modifyValue) {
    
    this.modifyValue = modifyValue;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 9223372036854775807
   * @return modifyValue
  **/
  @javax.annotation.Nullable
  public Long getModifyValue() {
    return modifyValue;
  }


  public void setModifyValue(Long modifyValue) {
    this.modifyValue = modifyValue;
  }


  public ToolsAdRaiseSetV2Request optType(ToolsAdRaiseSetV2OptType optType) {
    
    this.optType = optType;
    return this;
  }

   /**
   * Get optType
   * @return optType
  **/
  @javax.annotation.Nonnull
  public ToolsAdRaiseSetV2OptType getOptType() {
    return optType;
  }


  public void setOptType(ToolsAdRaiseSetV2OptType optType) {
    this.optType = optType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdRaiseSetV2Request toolsAdRaiseSetV2Request = (ToolsAdRaiseSetV2Request) o;
    return Objects.equals(this.adId, toolsAdRaiseSetV2Request.adId) &&
        Objects.equals(this.advertiserId, toolsAdRaiseSetV2Request.advertiserId) &&
        Objects.equals(this.budgetValue, toolsAdRaiseSetV2Request.budgetValue) &&
        Objects.equals(this.modifyValue, toolsAdRaiseSetV2Request.modifyValue) &&
        Objects.equals(this.optType, toolsAdRaiseSetV2Request.optType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, budgetValue, modifyValue, optType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdRaiseSetV2Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budgetValue: ").append(toIndentedString(budgetValue)).append("\n");
    sb.append("    modifyValue: ").append(toIndentedString(modifyValue)).append("\n");
    sb.append("    optType: ").append(toIndentedString(optType)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("budget_value");
    openapiFields.add("modify_value");
    openapiFields.add("opt_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("opt_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdRaiseSetV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdRaiseSetV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdRaiseSetV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdRaiseSetV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdRaiseSetV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAdRaiseSetV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdRaiseSetV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdRaiseSetV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdRaiseSetV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAdRaiseSetV2Request
  */
  public static ToolsAdRaiseSetV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdRaiseSetV2Request.class);
  }

 /**
  * Convert an instance of ToolsAdRaiseSetV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

