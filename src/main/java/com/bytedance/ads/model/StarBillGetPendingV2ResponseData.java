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
import com.bytedance.ads.model.StarBillGetPendingV2ResponseDataOrderBillListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class StarBillGetPendingV2ResponseData {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Long balance = null;

  public static final String SERIALIZED_NAME_ORDER_BILL_LIST = "order_bill_list";
  @SerializedName(SERIALIZED_NAME_ORDER_BILL_LIST)
  private List<StarBillGetPendingV2ResponseDataOrderBillListInner> orderBillList = null;

  public static final String SERIALIZED_NAME_PRECISE_BALANCE = "precise_balance";
  @SerializedName(SERIALIZED_NAME_PRECISE_BALANCE)
  private Double preciseBalance = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL_PAY = "precise_total_pay";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL_PAY)
  private Double preciseTotalPay = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL_PLATFORM_FEE = "precise_total_platform_fee";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL_PLATFORM_FEE)
  private Double preciseTotalPlatformFee = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL_REMAINING = "precise_total_remaining";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL_REMAINING)
  private Double preciseTotalRemaining = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL_TASK_COST = "precise_total_task_cost";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL_TASK_COST)
  private Double preciseTotalTaskCost = null;

  public static final String SERIALIZED_NAME_TOTAL_PAY = "total_pay";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAY)
  private Long totalPay = null;

  public static final String SERIALIZED_NAME_TOTAL_PLATFORM_FEE = "total_platform_fee";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLATFORM_FEE)
  private Long totalPlatformFee = null;

  public static final String SERIALIZED_NAME_TOTAL_REMAINING = "total_remaining";
  @SerializedName(SERIALIZED_NAME_TOTAL_REMAINING)
  private Long totalRemaining = null;

  public static final String SERIALIZED_NAME_TOTAL_TASK_COST = "total_task_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_TASK_COST)
  private Long totalTaskCost = null;

  public StarBillGetPendingV2ResponseData() {
  }

  public StarBillGetPendingV2ResponseData balance(Long balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 可用余额
   * @return balance
  **/
  @javax.annotation.Nullable
  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public StarBillGetPendingV2ResponseData orderBillList(List<StarBillGetPendingV2ResponseDataOrderBillListInner> orderBillList) {
    
    this.orderBillList = orderBillList;
    return this;
  }

  public StarBillGetPendingV2ResponseData addOrderBillListItem(StarBillGetPendingV2ResponseDataOrderBillListInner orderBillListItem) {
    if (this.orderBillList == null) {
      this.orderBillList = new ArrayList<>();
    }
    this.orderBillList.add(orderBillListItem);
    return this;
  }

   /**
   * 每个任务金额明细
   * @return orderBillList
  **/
  @javax.annotation.Nullable
  public List<StarBillGetPendingV2ResponseDataOrderBillListInner> getOrderBillList() {
    return orderBillList;
  }


  public void setOrderBillList(List<StarBillGetPendingV2ResponseDataOrderBillListInner> orderBillList) {
    this.orderBillList = orderBillList;
  }


  public StarBillGetPendingV2ResponseData preciseBalance(Double preciseBalance) {
    
    this.preciseBalance = preciseBalance;
    return this;
  }

   /**
   * 精确可用余额
   * @return preciseBalance
  **/
  @javax.annotation.Nullable
  public Double getPreciseBalance() {
    return preciseBalance;
  }


  public void setPreciseBalance(Double preciseBalance) {
    this.preciseBalance = preciseBalance;
  }


  public StarBillGetPendingV2ResponseData preciseTotalPay(Double preciseTotalPay) {
    
    this.preciseTotalPay = preciseTotalPay;
    return this;
  }

   /**
   * 精确总金额（单位元，下同）
   * @return preciseTotalPay
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotalPay() {
    return preciseTotalPay;
  }


  public void setPreciseTotalPay(Double preciseTotalPay) {
    this.preciseTotalPay = preciseTotalPay;
  }


  public StarBillGetPendingV2ResponseData preciseTotalPlatformFee(Double preciseTotalPlatformFee) {
    
    this.preciseTotalPlatformFee = preciseTotalPlatformFee;
    return this;
  }

   /**
   * 精确总服务费
   * @return preciseTotalPlatformFee
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotalPlatformFee() {
    return preciseTotalPlatformFee;
  }


  public void setPreciseTotalPlatformFee(Double preciseTotalPlatformFee) {
    this.preciseTotalPlatformFee = preciseTotalPlatformFee;
  }


  public StarBillGetPendingV2ResponseData preciseTotalRemaining(Double preciseTotalRemaining) {
    
    this.preciseTotalRemaining = preciseTotalRemaining;
    return this;
  }

   /**
   * 精确待付金额
   * @return preciseTotalRemaining
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotalRemaining() {
    return preciseTotalRemaining;
  }


  public void setPreciseTotalRemaining(Double preciseTotalRemaining) {
    this.preciseTotalRemaining = preciseTotalRemaining;
  }


  public StarBillGetPendingV2ResponseData preciseTotalTaskCost(Double preciseTotalTaskCost) {
    
    this.preciseTotalTaskCost = preciseTotalTaskCost;
    return this;
  }

   /**
   * 精确总任务金额
   * @return preciseTotalTaskCost
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotalTaskCost() {
    return preciseTotalTaskCost;
  }


  public void setPreciseTotalTaskCost(Double preciseTotalTaskCost) {
    this.preciseTotalTaskCost = preciseTotalTaskCost;
  }


  public StarBillGetPendingV2ResponseData totalPay(Long totalPay) {
    
    this.totalPay = totalPay;
    return this;
  }

   /**
   * 总金额（单位元，下同）
   * @return totalPay
  **/
  @javax.annotation.Nullable
  public Long getTotalPay() {
    return totalPay;
  }


  public void setTotalPay(Long totalPay) {
    this.totalPay = totalPay;
  }


  public StarBillGetPendingV2ResponseData totalPlatformFee(Long totalPlatformFee) {
    
    this.totalPlatformFee = totalPlatformFee;
    return this;
  }

   /**
   * 
   * @return totalPlatformFee
  **/
  @javax.annotation.Nullable
  public Long getTotalPlatformFee() {
    return totalPlatformFee;
  }


  public void setTotalPlatformFee(Long totalPlatformFee) {
    this.totalPlatformFee = totalPlatformFee;
  }


  public StarBillGetPendingV2ResponseData totalRemaining(Long totalRemaining) {
    
    this.totalRemaining = totalRemaining;
    return this;
  }

   /**
   * 待付金额
   * @return totalRemaining
  **/
  @javax.annotation.Nullable
  public Long getTotalRemaining() {
    return totalRemaining;
  }


  public void setTotalRemaining(Long totalRemaining) {
    this.totalRemaining = totalRemaining;
  }


  public StarBillGetPendingV2ResponseData totalTaskCost(Long totalTaskCost) {
    
    this.totalTaskCost = totalTaskCost;
    return this;
  }

   /**
   * 
   * @return totalTaskCost
  **/
  @javax.annotation.Nullable
  public Long getTotalTaskCost() {
    return totalTaskCost;
  }


  public void setTotalTaskCost(Long totalTaskCost) {
    this.totalTaskCost = totalTaskCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarBillGetPendingV2ResponseData starBillGetPendingV2ResponseData = (StarBillGetPendingV2ResponseData) o;
    return Objects.equals(this.balance, starBillGetPendingV2ResponseData.balance) &&
        Objects.equals(this.orderBillList, starBillGetPendingV2ResponseData.orderBillList) &&
        Objects.equals(this.preciseBalance, starBillGetPendingV2ResponseData.preciseBalance) &&
        Objects.equals(this.preciseTotalPay, starBillGetPendingV2ResponseData.preciseTotalPay) &&
        Objects.equals(this.preciseTotalPlatformFee, starBillGetPendingV2ResponseData.preciseTotalPlatformFee) &&
        Objects.equals(this.preciseTotalRemaining, starBillGetPendingV2ResponseData.preciseTotalRemaining) &&
        Objects.equals(this.preciseTotalTaskCost, starBillGetPendingV2ResponseData.preciseTotalTaskCost) &&
        Objects.equals(this.totalPay, starBillGetPendingV2ResponseData.totalPay) &&
        Objects.equals(this.totalPlatformFee, starBillGetPendingV2ResponseData.totalPlatformFee) &&
        Objects.equals(this.totalRemaining, starBillGetPendingV2ResponseData.totalRemaining) &&
        Objects.equals(this.totalTaskCost, starBillGetPendingV2ResponseData.totalTaskCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, orderBillList, preciseBalance, preciseTotalPay, preciseTotalPlatformFee, preciseTotalRemaining, preciseTotalTaskCost, totalPay, totalPlatformFee, totalRemaining, totalTaskCost);
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
    sb.append("class StarBillGetPendingV2ResponseData {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    orderBillList: ").append(toIndentedString(orderBillList)).append("\n");
    sb.append("    preciseBalance: ").append(toIndentedString(preciseBalance)).append("\n");
    sb.append("    preciseTotalPay: ").append(toIndentedString(preciseTotalPay)).append("\n");
    sb.append("    preciseTotalPlatformFee: ").append(toIndentedString(preciseTotalPlatformFee)).append("\n");
    sb.append("    preciseTotalRemaining: ").append(toIndentedString(preciseTotalRemaining)).append("\n");
    sb.append("    preciseTotalTaskCost: ").append(toIndentedString(preciseTotalTaskCost)).append("\n");
    sb.append("    totalPay: ").append(toIndentedString(totalPay)).append("\n");
    sb.append("    totalPlatformFee: ").append(toIndentedString(totalPlatformFee)).append("\n");
    sb.append("    totalRemaining: ").append(toIndentedString(totalRemaining)).append("\n");
    sb.append("    totalTaskCost: ").append(toIndentedString(totalTaskCost)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("order_bill_list");
    openapiFields.add("precise_balance");
    openapiFields.add("precise_total_pay");
    openapiFields.add("precise_total_platform_fee");
    openapiFields.add("precise_total_remaining");
    openapiFields.add("precise_total_task_cost");
    openapiFields.add("total_pay");
    openapiFields.add("total_platform_fee");
    openapiFields.add("total_remaining");
    openapiFields.add("total_task_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarBillGetPendingV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarBillGetPendingV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarBillGetPendingV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarBillGetPendingV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarBillGetPendingV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarBillGetPendingV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarBillGetPendingV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarBillGetPendingV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarBillGetPendingV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarBillGetPendingV2ResponseData
  */
  public static StarBillGetPendingV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarBillGetPendingV2ResponseData.class);
  }

 /**
  * Convert an instance of StarBillGetPendingV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

