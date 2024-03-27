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
import com.bytedance.ads.model.QianchuanEcpAwemeAdGetV10FilteringMarketingGoal;
import com.bytedance.ads.model.QianchuanEcpAwemeAdGetV10FilteringOrderStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class QianchuanEcpAwemeAdGetV10Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanEcpAwemeAdGetV10FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_ORDER_IDS = "order_ids";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<Long> orderIds = null;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private List<QianchuanEcpAwemeAdGetV10FilteringOrderStatus> orderStatus = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate = null;

  public QianchuanEcpAwemeAdGetV10Filtering() {
  }

  public QianchuanEcpAwemeAdGetV10Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public QianchuanEcpAwemeAdGetV10Filtering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public QianchuanEcpAwemeAdGetV10Filtering endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 
   * @return endDate
  **/
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public QianchuanEcpAwemeAdGetV10Filtering marketingGoal(QianchuanEcpAwemeAdGetV10FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public QianchuanEcpAwemeAdGetV10FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanEcpAwemeAdGetV10FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanEcpAwemeAdGetV10Filtering orderIds(List<Long> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public QianchuanEcpAwemeAdGetV10Filtering addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * 
   * @return orderIds
  **/
  @javax.annotation.Nullable
  public List<Long> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }


  public QianchuanEcpAwemeAdGetV10Filtering orderStatus(List<QianchuanEcpAwemeAdGetV10FilteringOrderStatus> orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

  public QianchuanEcpAwemeAdGetV10Filtering addOrderStatusItem(QianchuanEcpAwemeAdGetV10FilteringOrderStatus orderStatusItem) {
    if (this.orderStatus == null) {
      this.orderStatus = new ArrayList<>();
    }
    this.orderStatus.add(orderStatusItem);
    return this;
  }

   /**
   * 
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  public List<QianchuanEcpAwemeAdGetV10FilteringOrderStatus> getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(List<QianchuanEcpAwemeAdGetV10FilteringOrderStatus> orderStatus) {
    this.orderStatus = orderStatus;
  }


  public QianchuanEcpAwemeAdGetV10Filtering startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 
   * @return startDate
  **/
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanEcpAwemeAdGetV10Filtering qianchuanEcpAwemeAdGetV10Filtering = (QianchuanEcpAwemeAdGetV10Filtering) o;
    return Objects.equals(this.adIds, qianchuanEcpAwemeAdGetV10Filtering.adIds) &&
        Objects.equals(this.endDate, qianchuanEcpAwemeAdGetV10Filtering.endDate) &&
        Objects.equals(this.marketingGoal, qianchuanEcpAwemeAdGetV10Filtering.marketingGoal) &&
        Objects.equals(this.orderIds, qianchuanEcpAwemeAdGetV10Filtering.orderIds) &&
        Objects.equals(this.orderStatus, qianchuanEcpAwemeAdGetV10Filtering.orderStatus) &&
        Objects.equals(this.startDate, qianchuanEcpAwemeAdGetV10Filtering.startDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, endDate, marketingGoal, orderIds, orderStatus, startDate);
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
    sb.append("class QianchuanEcpAwemeAdGetV10Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("end_date");
    openapiFields.add("marketing_goal");
    openapiFields.add("order_ids");
    openapiFields.add("order_status");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanEcpAwemeAdGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanEcpAwemeAdGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanEcpAwemeAdGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanEcpAwemeAdGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanEcpAwemeAdGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanEcpAwemeAdGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanEcpAwemeAdGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanEcpAwemeAdGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanEcpAwemeAdGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanEcpAwemeAdGetV10Filtering
  */
  public static QianchuanEcpAwemeAdGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanEcpAwemeAdGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanEcpAwemeAdGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

