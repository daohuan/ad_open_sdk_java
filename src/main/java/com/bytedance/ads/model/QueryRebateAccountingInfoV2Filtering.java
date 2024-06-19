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
import com.bytedance.ads.model.QueryRebateAccountingInfoV2FilteringApprovalStatus;
import com.bytedance.ads.model.QueryRebateAccountingInfoV2FilteringIsCreateRebate;
import com.bytedance.ads.model.QueryRebateAccountingInfoV2FilteringMonthQuarter;
import com.bytedance.ads.model.QueryRebateAccountingInfoV2FilteringPlatforms;
import com.bytedance.ads.model.QueryRebateAccountingInfoV2FilteringUseType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class QueryRebateAccountingInfoV2Filtering {
  public static final String SERIALIZED_NAME_APPROVAL_STATUS = "approval_status";
  @SerializedName(SERIALIZED_NAME_APPROVAL_STATUS)
  private QueryRebateAccountingInfoV2FilteringApprovalStatus approvalStatus = null;

  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_IS_CREATE_REBATE = "is_create_rebate";
  @SerializedName(SERIALIZED_NAME_IS_CREATE_REBATE)
  private QueryRebateAccountingInfoV2FilteringIsCreateRebate isCreateRebate = null;

  public static final String SERIALIZED_NAME_MONTH_QUARTER = "month_quarter";
  @SerializedName(SERIALIZED_NAME_MONTH_QUARTER)
  private QueryRebateAccountingInfoV2FilteringMonthQuarter monthQuarter = null;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private List<QueryRebateAccountingInfoV2FilteringPlatforms> platforms = null;

  public static final String SERIALIZED_NAME_REBATE_ACCOUNTING_INFO_SERIAL = "rebate_accounting_info_serial";
  @SerializedName(SERIALIZED_NAME_REBATE_ACCOUNTING_INFO_SERIAL)
  private String rebateAccountingInfoSerial = null;

  public static final String SERIALIZED_NAME_REBATE_BALANCE_SERIAL = "rebate_balance_serial";
  @SerializedName(SERIALIZED_NAME_REBATE_BALANCE_SERIAL)
  private String rebateBalanceSerial = null;

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private QueryRebateAccountingInfoV2FilteringUseType useType = null;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Long year = null;

  public QueryRebateAccountingInfoV2Filtering() {
  }

  public QueryRebateAccountingInfoV2Filtering approvalStatus(QueryRebateAccountingInfoV2FilteringApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  public QueryRebateAccountingInfoV2FilteringApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  public void setApprovalStatus(QueryRebateAccountingInfoV2FilteringApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public QueryRebateAccountingInfoV2Filtering contractSerial(String contractSerial) {
    
    this.contractSerial = contractSerial;
    return this;
  }

   /**
   * 合同编号
   * @return contractSerial
  **/
  @javax.annotation.Nullable
  public String getContractSerial() {
    return contractSerial;
  }


  public void setContractSerial(String contractSerial) {
    this.contractSerial = contractSerial;
  }


  public QueryRebateAccountingInfoV2Filtering isCreateRebate(QueryRebateAccountingInfoV2FilteringIsCreateRebate isCreateRebate) {
    
    this.isCreateRebate = isCreateRebate;
    return this;
  }

   /**
   * Get isCreateRebate
   * @return isCreateRebate
  **/
  @javax.annotation.Nullable
  public QueryRebateAccountingInfoV2FilteringIsCreateRebate getIsCreateRebate() {
    return isCreateRebate;
  }


  public void setIsCreateRebate(QueryRebateAccountingInfoV2FilteringIsCreateRebate isCreateRebate) {
    this.isCreateRebate = isCreateRebate;
  }


  public QueryRebateAccountingInfoV2Filtering monthQuarter(QueryRebateAccountingInfoV2FilteringMonthQuarter monthQuarter) {
    
    this.monthQuarter = monthQuarter;
    return this;
  }

   /**
   * Get monthQuarter
   * @return monthQuarter
  **/
  @javax.annotation.Nullable
  public QueryRebateAccountingInfoV2FilteringMonthQuarter getMonthQuarter() {
    return monthQuarter;
  }


  public void setMonthQuarter(QueryRebateAccountingInfoV2FilteringMonthQuarter monthQuarter) {
    this.monthQuarter = monthQuarter;
  }


  public QueryRebateAccountingInfoV2Filtering platforms(List<QueryRebateAccountingInfoV2FilteringPlatforms> platforms) {
    
    this.platforms = platforms;
    return this;
  }

  public QueryRebateAccountingInfoV2Filtering addPlatformsItem(QueryRebateAccountingInfoV2FilteringPlatforms platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

   /**
   * 业务线/平台 (0:AD 3:星图 10031:广告 10063:巨量本地推)
   * @return platforms
  **/
  @javax.annotation.Nullable
  public List<QueryRebateAccountingInfoV2FilteringPlatforms> getPlatforms() {
    return platforms;
  }


  public void setPlatforms(List<QueryRebateAccountingInfoV2FilteringPlatforms> platforms) {
    this.platforms = platforms;
  }


  public QueryRebateAccountingInfoV2Filtering rebateAccountingInfoSerial(String rebateAccountingInfoSerial) {
    
    this.rebateAccountingInfoSerial = rebateAccountingInfoSerial;
    return this;
  }

   /**
   * 返点核算信息编号
   * @return rebateAccountingInfoSerial
  **/
  @javax.annotation.Nullable
  public String getRebateAccountingInfoSerial() {
    return rebateAccountingInfoSerial;
  }


  public void setRebateAccountingInfoSerial(String rebateAccountingInfoSerial) {
    this.rebateAccountingInfoSerial = rebateAccountingInfoSerial;
  }


  public QueryRebateAccountingInfoV2Filtering rebateBalanceSerial(String rebateBalanceSerial) {
    
    this.rebateBalanceSerial = rebateBalanceSerial;
    return this;
  }

   /**
   * 返点流水号
   * @return rebateBalanceSerial
  **/
  @javax.annotation.Nullable
  public String getRebateBalanceSerial() {
    return rebateBalanceSerial;
  }


  public void setRebateBalanceSerial(String rebateBalanceSerial) {
    this.rebateBalanceSerial = rebateBalanceSerial;
  }


  public QueryRebateAccountingInfoV2Filtering useType(QueryRebateAccountingInfoV2FilteringUseType useType) {
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nullable
  public QueryRebateAccountingInfoV2FilteringUseType getUseType() {
    return useType;
  }


  public void setUseType(QueryRebateAccountingInfoV2FilteringUseType useType) {
    this.useType = useType;
  }


  public QueryRebateAccountingInfoV2Filtering year(Long year) {
    
    this.year = year;
    return this;
  }

   /**
   * 结算周期年 例:2024
   * @return year
  **/
  @javax.annotation.Nullable
  public Long getYear() {
    return year;
  }


  public void setYear(Long year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRebateAccountingInfoV2Filtering queryRebateAccountingInfoV2Filtering = (QueryRebateAccountingInfoV2Filtering) o;
    return Objects.equals(this.approvalStatus, queryRebateAccountingInfoV2Filtering.approvalStatus) &&
        Objects.equals(this.contractSerial, queryRebateAccountingInfoV2Filtering.contractSerial) &&
        Objects.equals(this.isCreateRebate, queryRebateAccountingInfoV2Filtering.isCreateRebate) &&
        Objects.equals(this.monthQuarter, queryRebateAccountingInfoV2Filtering.monthQuarter) &&
        Objects.equals(this.platforms, queryRebateAccountingInfoV2Filtering.platforms) &&
        Objects.equals(this.rebateAccountingInfoSerial, queryRebateAccountingInfoV2Filtering.rebateAccountingInfoSerial) &&
        Objects.equals(this.rebateBalanceSerial, queryRebateAccountingInfoV2Filtering.rebateBalanceSerial) &&
        Objects.equals(this.useType, queryRebateAccountingInfoV2Filtering.useType) &&
        Objects.equals(this.year, queryRebateAccountingInfoV2Filtering.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalStatus, contractSerial, isCreateRebate, monthQuarter, platforms, rebateAccountingInfoSerial, rebateBalanceSerial, useType, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRebateAccountingInfoV2Filtering {\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    isCreateRebate: ").append(toIndentedString(isCreateRebate)).append("\n");
    sb.append("    monthQuarter: ").append(toIndentedString(monthQuarter)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    rebateAccountingInfoSerial: ").append(toIndentedString(rebateAccountingInfoSerial)).append("\n");
    sb.append("    rebateBalanceSerial: ").append(toIndentedString(rebateBalanceSerial)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("approval_status");
    openapiFields.add("contract_serial");
    openapiFields.add("is_create_rebate");
    openapiFields.add("month_quarter");
    openapiFields.add("platforms");
    openapiFields.add("rebate_accounting_info_serial");
    openapiFields.add("rebate_balance_serial");
    openapiFields.add("use_type");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryRebateAccountingInfoV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryRebateAccountingInfoV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryRebateAccountingInfoV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryRebateAccountingInfoV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryRebateAccountingInfoV2Filtering>() {
           @Override
           public void write(JsonWriter out, QueryRebateAccountingInfoV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryRebateAccountingInfoV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryRebateAccountingInfoV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryRebateAccountingInfoV2Filtering
  * @throws IOException if the JSON string is invalid with respect to QueryRebateAccountingInfoV2Filtering
  */
  public static QueryRebateAccountingInfoV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryRebateAccountingInfoV2Filtering.class);
  }

 /**
  * Convert an instance of QueryRebateAccountingInfoV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

