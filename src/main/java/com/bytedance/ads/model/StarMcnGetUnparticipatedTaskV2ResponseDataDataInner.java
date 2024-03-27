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
 * StarMcnGetUnparticipatedTaskV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class StarMcnGetUnparticipatedTaskV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_COMMISSION_RATE = "commission_rate";
  @SerializedName(SERIALIZED_NAME_COMMISSION_RATE)
  private Long commissionRate = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_ICON = "demand_icon";
  @SerializedName(SERIALIZED_NAME_DEMAND_ICON)
  private String demandIcon = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_EVALUATE_TYPE = "evaluate_type";
  @SerializedName(SERIALIZED_NAME_EVALUATE_TYPE)
  private Long evaluateType = null;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expiration_time";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private String expirationTime = null;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_END = "expiration_time_end";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_END)
  private String expirationTimeEnd = null;

  public static final String SERIALIZED_NAME_FIRST_CLASS_CATEGORY = "first_class_category";
  @SerializedName(SERIALIZED_NAME_FIRST_CLASS_CATEGORY)
  private Long firstClassCategory = null;

  public static final String SERIALIZED_NAME_ITEM_COMPONENT_TYPE = "item_component_type";
  @SerializedName(SERIALIZED_NAME_ITEM_COMPONENT_TYPE)
  private Long itemComponentType = null;

  public static final String SERIALIZED_NAME_MCN_PROFIT_RATE = "mcn_profit_rate";
  @SerializedName(SERIALIZED_NAME_MCN_PROFIT_RATE)
  private Long mcnProfitRate = null;

  public static final String SERIALIZED_NAME_PAY_TYPE = "pay_type";
  @SerializedName(SERIALIZED_NAME_PAY_TYPE)
  private Long payType = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price = null;

  public static final String SERIALIZED_NAME_SECOND_CLASS_CATEGORY = "second_class_category";
  @SerializedName(SERIALIZED_NAME_SECOND_CLASS_CATEGORY)
  private Long secondClassCategory = null;

  public static final String SERIALIZED_NAME_TOTAL_BUDGET = "total_budget";
  @SerializedName(SERIALIZED_NAME_TOTAL_BUDGET)
  private Long totalBudget = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private Long videoType = null;

  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner() {
  }

  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner commissionRate(Long commissionRate) {
    
    this.commissionRate = commissionRate;
    return this;
  }

   /**
   * 
   * @return commissionRate
  **/
  @javax.annotation.Nullable
  public Long getCommissionRate() {
    return commissionRate;
  }


  public void setCommissionRate(Long commissionRate) {
    this.commissionRate = commissionRate;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner demandIcon(String demandIcon) {
    
    this.demandIcon = demandIcon;
    return this;
  }

   /**
   * 
   * @return demandIcon
  **/
  @javax.annotation.Nullable
  public String getDemandIcon() {
    return demandIcon;
  }


  public void setDemandIcon(String demandIcon) {
    this.demandIcon = demandIcon;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 
   * @return demandName
  **/
  @javax.annotation.Nullable
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner evaluateType(Long evaluateType) {
    
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


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner expirationTime(String expirationTime) {
    
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * 
   * @return expirationTime
  **/
  @javax.annotation.Nullable
  public String getExpirationTime() {
    return expirationTime;
  }


  public void setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner expirationTimeEnd(String expirationTimeEnd) {
    
    this.expirationTimeEnd = expirationTimeEnd;
    return this;
  }

   /**
   * 
   * @return expirationTimeEnd
  **/
  @javax.annotation.Nullable
  public String getExpirationTimeEnd() {
    return expirationTimeEnd;
  }


  public void setExpirationTimeEnd(String expirationTimeEnd) {
    this.expirationTimeEnd = expirationTimeEnd;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner firstClassCategory(Long firstClassCategory) {
    
    this.firstClassCategory = firstClassCategory;
    return this;
  }

   /**
   * 
   * @return firstClassCategory
  **/
  @javax.annotation.Nullable
  public Long getFirstClassCategory() {
    return firstClassCategory;
  }


  public void setFirstClassCategory(Long firstClassCategory) {
    this.firstClassCategory = firstClassCategory;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner itemComponentType(Long itemComponentType) {
    
    this.itemComponentType = itemComponentType;
    return this;
  }

   /**
   * 
   * @return itemComponentType
  **/
  @javax.annotation.Nullable
  public Long getItemComponentType() {
    return itemComponentType;
  }


  public void setItemComponentType(Long itemComponentType) {
    this.itemComponentType = itemComponentType;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner mcnProfitRate(Long mcnProfitRate) {
    
    this.mcnProfitRate = mcnProfitRate;
    return this;
  }

   /**
   * 
   * @return mcnProfitRate
  **/
  @javax.annotation.Nullable
  public Long getMcnProfitRate() {
    return mcnProfitRate;
  }


  public void setMcnProfitRate(Long mcnProfitRate) {
    this.mcnProfitRate = mcnProfitRate;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner payType(Long payType) {
    
    this.payType = payType;
    return this;
  }

   /**
   * 
   * @return payType
  **/
  @javax.annotation.Nullable
  public Long getPayType() {
    return payType;
  }


  public void setPayType(Long payType) {
    this.payType = payType;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner price(Long price) {
    
    this.price = price;
    return this;
  }

   /**
   * 
   * @return price
  **/
  @javax.annotation.Nullable
  public Long getPrice() {
    return price;
  }


  public void setPrice(Long price) {
    this.price = price;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner secondClassCategory(Long secondClassCategory) {
    
    this.secondClassCategory = secondClassCategory;
    return this;
  }

   /**
   * 
   * @return secondClassCategory
  **/
  @javax.annotation.Nullable
  public Long getSecondClassCategory() {
    return secondClassCategory;
  }


  public void setSecondClassCategory(Long secondClassCategory) {
    this.secondClassCategory = secondClassCategory;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner totalBudget(Long totalBudget) {
    
    this.totalBudget = totalBudget;
    return this;
  }

   /**
   * 
   * @return totalBudget
  **/
  @javax.annotation.Nullable
  public Long getTotalBudget() {
    return totalBudget;
  }


  public void setTotalBudget(Long totalBudget) {
    this.totalBudget = totalBudget;
  }


  public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner videoType(Long videoType) {
    
    this.videoType = videoType;
    return this;
  }

   /**
   * 
   * @return videoType
  **/
  @javax.annotation.Nullable
  public Long getVideoType() {
    return videoType;
  }


  public void setVideoType(Long videoType) {
    this.videoType = videoType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnGetUnparticipatedTaskV2ResponseDataDataInner starMcnGetUnparticipatedTaskV2ResponseDataDataInner = (StarMcnGetUnparticipatedTaskV2ResponseDataDataInner) o;
    return Objects.equals(this.commissionRate, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.commissionRate) &&
        Objects.equals(this.createTime, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.createTime) &&
        Objects.equals(this.demandIcon, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.demandIcon) &&
        Objects.equals(this.demandId, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.demandId) &&
        Objects.equals(this.demandName, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.demandName) &&
        Objects.equals(this.evaluateType, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.evaluateType) &&
        Objects.equals(this.expirationTime, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.expirationTime) &&
        Objects.equals(this.expirationTimeEnd, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.expirationTimeEnd) &&
        Objects.equals(this.firstClassCategory, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.firstClassCategory) &&
        Objects.equals(this.itemComponentType, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.itemComponentType) &&
        Objects.equals(this.mcnProfitRate, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.mcnProfitRate) &&
        Objects.equals(this.payType, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.payType) &&
        Objects.equals(this.price, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.price) &&
        Objects.equals(this.secondClassCategory, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.secondClassCategory) &&
        Objects.equals(this.totalBudget, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.totalBudget) &&
        Objects.equals(this.videoType, starMcnGetUnparticipatedTaskV2ResponseDataDataInner.videoType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissionRate, createTime, demandIcon, demandId, demandName, evaluateType, expirationTime, expirationTimeEnd, firstClassCategory, itemComponentType, mcnProfitRate, payType, price, secondClassCategory, totalBudget, videoType);
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
    sb.append("class StarMcnGetUnparticipatedTaskV2ResponseDataDataInner {\n");
    sb.append("    commissionRate: ").append(toIndentedString(commissionRate)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandIcon: ").append(toIndentedString(demandIcon)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    evaluateType: ").append(toIndentedString(evaluateType)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    expirationTimeEnd: ").append(toIndentedString(expirationTimeEnd)).append("\n");
    sb.append("    firstClassCategory: ").append(toIndentedString(firstClassCategory)).append("\n");
    sb.append("    itemComponentType: ").append(toIndentedString(itemComponentType)).append("\n");
    sb.append("    mcnProfitRate: ").append(toIndentedString(mcnProfitRate)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    secondClassCategory: ").append(toIndentedString(secondClassCategory)).append("\n");
    sb.append("    totalBudget: ").append(toIndentedString(totalBudget)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
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
    openapiFields.add("commission_rate");
    openapiFields.add("create_time");
    openapiFields.add("demand_icon");
    openapiFields.add("demand_id");
    openapiFields.add("demand_name");
    openapiFields.add("evaluate_type");
    openapiFields.add("expiration_time");
    openapiFields.add("expiration_time_end");
    openapiFields.add("first_class_category");
    openapiFields.add("item_component_type");
    openapiFields.add("mcn_profit_rate");
    openapiFields.add("pay_type");
    openapiFields.add("price");
    openapiFields.add("second_class_category");
    openapiFields.add("total_budget");
    openapiFields.add("video_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("create_time");
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("demand_name");
    openapiRequiredFields.add("video_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnGetUnparticipatedTaskV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnGetUnparticipatedTaskV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnGetUnparticipatedTaskV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnGetUnparticipatedTaskV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnGetUnparticipatedTaskV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, StarMcnGetUnparticipatedTaskV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnGetUnparticipatedTaskV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnGetUnparticipatedTaskV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnGetUnparticipatedTaskV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to StarMcnGetUnparticipatedTaskV2ResponseDataDataInner
  */
  public static StarMcnGetUnparticipatedTaskV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnGetUnparticipatedTaskV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of StarMcnGetUnparticipatedTaskV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

