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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ANDROID_CONVERT_ID = "android_convert_id";
  @SerializedName(SERIALIZED_NAME_ANDROID_CONVERT_ID)
  private Long androidConvertId = null;

  public static final String SERIALIZED_NAME_AUTO_ADD_BUDGET_TIMES = "auto_add_budget_times";
  @SerializedName(SERIALIZED_NAME_AUTO_ADD_BUDGET_TIMES)
  private Long autoAddBudgetTimes = null;

  public static final String SERIALIZED_NAME_AUTO_ADD_BUDGET_TRIGGER_RATIO = "auto_add_budget_trigger_ratio";
  @SerializedName(SERIALIZED_NAME_AUTO_ADD_BUDGET_TRIGGER_RATIO)
  private Long autoAddBudgetTriggerRatio = null;

  public static final String SERIALIZED_NAME_EVALUATE_TYPE = "evaluate_type";
  @SerializedName(SERIALIZED_NAME_EVALUATE_TYPE)
  private Long evaluateType = null;

  public static final String SERIALIZED_NAME_IOS_CONVERT_ID = "ios_convert_id";
  @SerializedName(SERIALIZED_NAME_IOS_CONVERT_ID)
  private Long iosConvertId = null;

  public static final String SERIALIZED_NAME_MAX_BUDGET_ADD_AMOUNT = "max_budget_add_amount";
  @SerializedName(SERIALIZED_NAME_MAX_BUDGET_ADD_AMOUNT)
  private Long maxBudgetAddAmount = null;

  public static final String SERIALIZED_NAME_REWARD_RULE = "reward_rule";
  @SerializedName(SERIALIZED_NAME_REWARD_RULE)
  private String rewardRule = null;

  public static final String SERIALIZED_NAME_SUPPLEMENT_INFO = "supplement_info";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_INFO)
  private String supplementInfo = null;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unit_price";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Long unitPrice = null;

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo() {
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo androidConvertId(Long androidConvertId) {
    
    this.androidConvertId = androidConvertId;
    return this;
  }

   /**
   * 
   * @return androidConvertId
  **/
  @javax.annotation.Nullable
  public Long getAndroidConvertId() {
    return androidConvertId;
  }


  public void setAndroidConvertId(Long androidConvertId) {
    this.androidConvertId = androidConvertId;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo autoAddBudgetTimes(Long autoAddBudgetTimes) {
    
    this.autoAddBudgetTimes = autoAddBudgetTimes;
    return this;
  }

   /**
   * 
   * @return autoAddBudgetTimes
  **/
  @javax.annotation.Nullable
  public Long getAutoAddBudgetTimes() {
    return autoAddBudgetTimes;
  }


  public void setAutoAddBudgetTimes(Long autoAddBudgetTimes) {
    this.autoAddBudgetTimes = autoAddBudgetTimes;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo autoAddBudgetTriggerRatio(Long autoAddBudgetTriggerRatio) {
    
    this.autoAddBudgetTriggerRatio = autoAddBudgetTriggerRatio;
    return this;
  }

   /**
   * 
   * @return autoAddBudgetTriggerRatio
  **/
  @javax.annotation.Nullable
  public Long getAutoAddBudgetTriggerRatio() {
    return autoAddBudgetTriggerRatio;
  }


  public void setAutoAddBudgetTriggerRatio(Long autoAddBudgetTriggerRatio) {
    this.autoAddBudgetTriggerRatio = autoAddBudgetTriggerRatio;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo evaluateType(Long evaluateType) {
    
    this.evaluateType = evaluateType;
    return this;
  }

   /**
   * 
   * @return evaluateType
  **/
  @javax.annotation.Nullable
  public Long getEvaluateType() {
    return evaluateType;
  }


  public void setEvaluateType(Long evaluateType) {
    this.evaluateType = evaluateType;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo iosConvertId(Long iosConvertId) {
    
    this.iosConvertId = iosConvertId;
    return this;
  }

   /**
   * 
   * @return iosConvertId
  **/
  @javax.annotation.Nullable
  public Long getIosConvertId() {
    return iosConvertId;
  }


  public void setIosConvertId(Long iosConvertId) {
    this.iosConvertId = iosConvertId;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo maxBudgetAddAmount(Long maxBudgetAddAmount) {
    
    this.maxBudgetAddAmount = maxBudgetAddAmount;
    return this;
  }

   /**
   * 
   * @return maxBudgetAddAmount
  **/
  @javax.annotation.Nullable
  public Long getMaxBudgetAddAmount() {
    return maxBudgetAddAmount;
  }


  public void setMaxBudgetAddAmount(Long maxBudgetAddAmount) {
    this.maxBudgetAddAmount = maxBudgetAddAmount;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo rewardRule(String rewardRule) {
    
    this.rewardRule = rewardRule;
    return this;
  }

   /**
   * 
   * @return rewardRule
  **/
  @javax.annotation.Nullable
  public String getRewardRule() {
    return rewardRule;
  }


  public void setRewardRule(String rewardRule) {
    this.rewardRule = rewardRule;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo supplementInfo(String supplementInfo) {
    
    this.supplementInfo = supplementInfo;
    return this;
  }

   /**
   * 
   * @return supplementInfo
  **/
  @javax.annotation.Nullable
  public String getSupplementInfo() {
    return supplementInfo;
  }


  public void setSupplementInfo(String supplementInfo) {
    this.supplementInfo = supplementInfo;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo unitPrice(Long unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * 
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  public Long getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo = (StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo) o;
    return Objects.equals(this.advertiserId, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.advertiserId) &&
        Objects.equals(this.androidConvertId, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.androidConvertId) &&
        Objects.equals(this.autoAddBudgetTimes, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.autoAddBudgetTimes) &&
        Objects.equals(this.autoAddBudgetTriggerRatio, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.autoAddBudgetTriggerRatio) &&
        Objects.equals(this.evaluateType, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.evaluateType) &&
        Objects.equals(this.iosConvertId, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.iosConvertId) &&
        Objects.equals(this.maxBudgetAddAmount, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.maxBudgetAddAmount) &&
        Objects.equals(this.rewardRule, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.rewardRule) &&
        Objects.equals(this.supplementInfo, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.supplementInfo) &&
        Objects.equals(this.unitPrice, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.unitPrice);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, androidConvertId, autoAddBudgetTimes, autoAddBudgetTriggerRatio, evaluateType, iosConvertId, maxBudgetAddAmount, rewardRule, supplementInfo, unitPrice);
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
    sb.append("class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    androidConvertId: ").append(toIndentedString(androidConvertId)).append("\n");
    sb.append("    autoAddBudgetTimes: ").append(toIndentedString(autoAddBudgetTimes)).append("\n");
    sb.append("    autoAddBudgetTriggerRatio: ").append(toIndentedString(autoAddBudgetTriggerRatio)).append("\n");
    sb.append("    evaluateType: ").append(toIndentedString(evaluateType)).append("\n");
    sb.append("    iosConvertId: ").append(toIndentedString(iosConvertId)).append("\n");
    sb.append("    maxBudgetAddAmount: ").append(toIndentedString(maxBudgetAddAmount)).append("\n");
    sb.append("    rewardRule: ").append(toIndentedString(rewardRule)).append("\n");
    sb.append("    supplementInfo: ").append(toIndentedString(supplementInfo)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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
    openapiFields.add("android_convert_id");
    openapiFields.add("auto_add_budget_times");
    openapiFields.add("auto_add_budget_trigger_ratio");
    openapiFields.add("evaluate_type");
    openapiFields.add("ios_convert_id");
    openapiFields.add("max_budget_add_amount");
    openapiFields.add("reward_rule");
    openapiFields.add("supplement_info");
    openapiFields.add("unit_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("evaluate_type");
    openapiRequiredFields.add("unit_price");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo
  */
  public static StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

