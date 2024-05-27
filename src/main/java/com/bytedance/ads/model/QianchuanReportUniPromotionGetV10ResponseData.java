/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class QianchuanReportUniPromotionGetV10ResponseData {
  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public static final String SERIALIZED_NAME_TOTAL_COST_PER_PAY_ORDER_FOR_ROI2 = "total_cost_per_pay_order_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_COST_PER_PAY_ORDER_FOR_ROI2)
  private Double totalCostPerPayOrderForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PAY_ORDER_COUNT_FOR_ROI2 = "total_pay_order_count_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAY_ORDER_COUNT_FOR_ROI2)
  private Double totalPayOrderCountForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PAY_ORDER_COUPON_AMOUNT_FOR_ROI2 = "total_pay_order_coupon_amount_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAY_ORDER_COUPON_AMOUNT_FOR_ROI2)
  private Double totalPayOrderCouponAmountForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PAY_ORDER_GMV_FOR_ROI2 = "total_pay_order_gmv_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAY_ORDER_GMV_FOR_ROI2)
  private Double totalPayOrderGmvForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PREPAY_AND_PAY_ORDER_ROI2 = "total_prepay_and_pay_order_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PREPAY_AND_PAY_ORDER_ROI2)
  private Double totalPrepayAndPayOrderRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PREPAY_ORDER_COUNT_FOR_ROI2 = "total_prepay_order_count_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PREPAY_ORDER_COUNT_FOR_ROI2)
  private Double totalPrepayOrderCountForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_PREPAY_ORDER_GMV_FOR_ROI2 = "total_prepay_order_gmv_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_PREPAY_ORDER_GMV_FOR_ROI2)
  private Double totalPrepayOrderGmvForRoi2 = null;

  public static final String SERIALIZED_NAME_TOTAL_UNFINISHED_ESTIMATE_ORDER_GMV_FOR_ROI2 = "total_unfinished_estimate_order_gmv_for_roi2";
  @SerializedName(SERIALIZED_NAME_TOTAL_UNFINISHED_ESTIMATE_ORDER_GMV_FOR_ROI2)
  private Double totalUnfinishedEstimateOrderGmvForRoi2 = null;

  public QianchuanReportUniPromotionGetV10ResponseData() {
  }

  public QianchuanReportUniPromotionGetV10ResponseData statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }


  public QianchuanReportUniPromotionGetV10ResponseData totalCostPerPayOrderForRoi2(Double totalCostPerPayOrderForRoi2) {
    
    this.totalCostPerPayOrderForRoi2 = totalCostPerPayOrderForRoi2;
    return this;
  }

   /**
   * 
   * @return totalCostPerPayOrderForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalCostPerPayOrderForRoi2() {
    return totalCostPerPayOrderForRoi2;
  }


  public void setTotalCostPerPayOrderForRoi2(Double totalCostPerPayOrderForRoi2) {
    this.totalCostPerPayOrderForRoi2 = totalCostPerPayOrderForRoi2;
  }


  public QianchuanReportUniPromotionGetV10ResponseData totalPayOrderCountForRoi2(Double totalPayOrderCountForRoi2) {
    
    this.totalPayOrderCountForRoi2 = totalPayOrderCountForRoi2;
    return this;
  }

   /**
   * 
   * @return totalPayOrderCountForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalPayOrderCountForRoi2() {
    return totalPayOrderCountForRoi2;
  }


  public void setTotalPayOrderCountForRoi2(Double totalPayOrderCountForRoi2) {
    this.totalPayOrderCountForRoi2 = totalPayOrderCountForRoi2;
  }


  public QianchuanReportUniPromotionGetV10ResponseData totalPayOrderCouponAmountForRoi2(Double totalPayOrderCouponAmountForRoi2) {
    
    this.totalPayOrderCouponAmountForRoi2 = totalPayOrderCouponAmountForRoi2;
    return this;
  }

   /**
   * 
   * @return totalPayOrderCouponAmountForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalPayOrderCouponAmountForRoi2() {
    return totalPayOrderCouponAmountForRoi2;
  }


  public void setTotalPayOrderCouponAmountForRoi2(Double totalPayOrderCouponAmountForRoi2) {
    this.totalPayOrderCouponAmountForRoi2 = totalPayOrderCouponAmountForRoi2;
  }


  public QianchuanReportUniPromotionGetV10ResponseData totalPayOrderGmvForRoi2(Double totalPayOrderGmvForRoi2) {
    
    this.totalPayOrderGmvForRoi2 = totalPayOrderGmvForRoi2;
    return this;
  }

   /**
   * 
   * @return totalPayOrderGmvForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalPayOrderGmvForRoi2() {
    return totalPayOrderGmvForRoi2;
  }


  public void setTotalPayOrderGmvForRoi2(Double totalPayOrderGmvForRoi2) {
    this.totalPayOrderGmvForRoi2 = totalPayOrderGmvForRoi2;
  }


  public QianchuanReportUniPromotionGetV10ResponseData totalPrepayAndPayOrderRoi2(Double totalPrepayAndPayOrderRoi2) {
    
    this.totalPrepayAndPayOrderRoi2 = totalPrepayAndPayOrderRoi2;
    return this;
  }

   /**
   * 
   * @return totalPrepayAndPayOrderRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalPrepayAndPayOrderRoi2() {
    return totalPrepayAndPayOrderRoi2;
  }


  public void setTotalPrepayAndPayOrderRoi2(Double totalPrepayAndPayOrderRoi2) {
    this.totalPrepayAndPayOrderRoi2 = totalPrepayAndPayOrderRoi2;
  }


  public QianchuanReportUniPromotionGetV10ResponseData totalPrepayOrderCountForRoi2(Double totalPrepayOrderCountForRoi2) {
    
    this.totalPrepayOrderCountForRoi2 = totalPrepayOrderCountForRoi2;
    return this;
  }

   /**
   * 
   * @return totalPrepayOrderCountForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalPrepayOrderCountForRoi2() {
    return totalPrepayOrderCountForRoi2;
  }


  public void setTotalPrepayOrderCountForRoi2(Double totalPrepayOrderCountForRoi2) {
    this.totalPrepayOrderCountForRoi2 = totalPrepayOrderCountForRoi2;
  }


  public QianchuanReportUniPromotionGetV10ResponseData totalPrepayOrderGmvForRoi2(Double totalPrepayOrderGmvForRoi2) {
    
    this.totalPrepayOrderGmvForRoi2 = totalPrepayOrderGmvForRoi2;
    return this;
  }

   /**
   * 
   * @return totalPrepayOrderGmvForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalPrepayOrderGmvForRoi2() {
    return totalPrepayOrderGmvForRoi2;
  }


  public void setTotalPrepayOrderGmvForRoi2(Double totalPrepayOrderGmvForRoi2) {
    this.totalPrepayOrderGmvForRoi2 = totalPrepayOrderGmvForRoi2;
  }


  public QianchuanReportUniPromotionGetV10ResponseData totalUnfinishedEstimateOrderGmvForRoi2(Double totalUnfinishedEstimateOrderGmvForRoi2) {
    
    this.totalUnfinishedEstimateOrderGmvForRoi2 = totalUnfinishedEstimateOrderGmvForRoi2;
    return this;
  }

   /**
   * 
   * @return totalUnfinishedEstimateOrderGmvForRoi2
  **/
  @javax.annotation.Nullable
  public Double getTotalUnfinishedEstimateOrderGmvForRoi2() {
    return totalUnfinishedEstimateOrderGmvForRoi2;
  }


  public void setTotalUnfinishedEstimateOrderGmvForRoi2(Double totalUnfinishedEstimateOrderGmvForRoi2) {
    this.totalUnfinishedEstimateOrderGmvForRoi2 = totalUnfinishedEstimateOrderGmvForRoi2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportUniPromotionGetV10ResponseData qianchuanReportUniPromotionGetV10ResponseData = (QianchuanReportUniPromotionGetV10ResponseData) o;
    return Objects.equals(this.statCost, qianchuanReportUniPromotionGetV10ResponseData.statCost) &&
        Objects.equals(this.totalCostPerPayOrderForRoi2, qianchuanReportUniPromotionGetV10ResponseData.totalCostPerPayOrderForRoi2) &&
        Objects.equals(this.totalPayOrderCountForRoi2, qianchuanReportUniPromotionGetV10ResponseData.totalPayOrderCountForRoi2) &&
        Objects.equals(this.totalPayOrderCouponAmountForRoi2, qianchuanReportUniPromotionGetV10ResponseData.totalPayOrderCouponAmountForRoi2) &&
        Objects.equals(this.totalPayOrderGmvForRoi2, qianchuanReportUniPromotionGetV10ResponseData.totalPayOrderGmvForRoi2) &&
        Objects.equals(this.totalPrepayAndPayOrderRoi2, qianchuanReportUniPromotionGetV10ResponseData.totalPrepayAndPayOrderRoi2) &&
        Objects.equals(this.totalPrepayOrderCountForRoi2, qianchuanReportUniPromotionGetV10ResponseData.totalPrepayOrderCountForRoi2) &&
        Objects.equals(this.totalPrepayOrderGmvForRoi2, qianchuanReportUniPromotionGetV10ResponseData.totalPrepayOrderGmvForRoi2) &&
        Objects.equals(this.totalUnfinishedEstimateOrderGmvForRoi2, qianchuanReportUniPromotionGetV10ResponseData.totalUnfinishedEstimateOrderGmvForRoi2);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(statCost, totalCostPerPayOrderForRoi2, totalPayOrderCountForRoi2, totalPayOrderCouponAmountForRoi2, totalPayOrderGmvForRoi2, totalPrepayAndPayOrderRoi2, totalPrepayOrderCountForRoi2, totalPrepayOrderGmvForRoi2, totalUnfinishedEstimateOrderGmvForRoi2);
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
    sb.append("class QianchuanReportUniPromotionGetV10ResponseData {\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
    sb.append("    totalCostPerPayOrderForRoi2: ").append(toIndentedString(totalCostPerPayOrderForRoi2)).append("\n");
    sb.append("    totalPayOrderCountForRoi2: ").append(toIndentedString(totalPayOrderCountForRoi2)).append("\n");
    sb.append("    totalPayOrderCouponAmountForRoi2: ").append(toIndentedString(totalPayOrderCouponAmountForRoi2)).append("\n");
    sb.append("    totalPayOrderGmvForRoi2: ").append(toIndentedString(totalPayOrderGmvForRoi2)).append("\n");
    sb.append("    totalPrepayAndPayOrderRoi2: ").append(toIndentedString(totalPrepayAndPayOrderRoi2)).append("\n");
    sb.append("    totalPrepayOrderCountForRoi2: ").append(toIndentedString(totalPrepayOrderCountForRoi2)).append("\n");
    sb.append("    totalPrepayOrderGmvForRoi2: ").append(toIndentedString(totalPrepayOrderGmvForRoi2)).append("\n");
    sb.append("    totalUnfinishedEstimateOrderGmvForRoi2: ").append(toIndentedString(totalUnfinishedEstimateOrderGmvForRoi2)).append("\n");
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
    openapiFields.add("stat_cost");
    openapiFields.add("total_cost_per_pay_order_for_roi2");
    openapiFields.add("total_pay_order_count_for_roi2");
    openapiFields.add("total_pay_order_coupon_amount_for_roi2");
    openapiFields.add("total_pay_order_gmv_for_roi2");
    openapiFields.add("total_prepay_and_pay_order_roi2");
    openapiFields.add("total_prepay_order_count_for_roi2");
    openapiFields.add("total_prepay_order_gmv_for_roi2");
    openapiFields.add("total_unfinished_estimate_order_gmv_for_roi2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportUniPromotionGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportUniPromotionGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportUniPromotionGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportUniPromotionGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportUniPromotionGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanReportUniPromotionGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportUniPromotionGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportUniPromotionGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportUniPromotionGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportUniPromotionGetV10ResponseData
  */
  public static QianchuanReportUniPromotionGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportUniPromotionGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanReportUniPromotionGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

