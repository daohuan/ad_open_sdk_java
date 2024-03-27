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
import com.bytedance.ads.model.BusinessPlatformPartnerOrganizationListV2DataListStatus;
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
 * BusinessPlatformPartnerOrganizationListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class BusinessPlatformPartnerOrganizationListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_PARTNER_ORGANIZATION_ID = "partner_organization_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ORGANIZATION_ID)
  private Long partnerOrganizationId = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BusinessPlatformPartnerOrganizationListV2DataListStatus status = null;

  public BusinessPlatformPartnerOrganizationListV2ResponseDataListInner() {
  }

  public BusinessPlatformPartnerOrganizationListV2ResponseDataListInner partnerOrganizationId(Long partnerOrganizationId) {
    
    this.partnerOrganizationId = partnerOrganizationId;
    return this;
  }

   /**
   * 发起合作组织请求的组织id
   * @return partnerOrganizationId
  **/
  @javax.annotation.Nullable
  public Long getPartnerOrganizationId() {
    return partnerOrganizationId;
  }


  public void setPartnerOrganizationId(Long partnerOrganizationId) {
    this.partnerOrganizationId = partnerOrganizationId;
  }


  public BusinessPlatformPartnerOrganizationListV2ResponseDataListInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 备注，合作组织备注信息
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public BusinessPlatformPartnerOrganizationListV2ResponseDataListInner status(BusinessPlatformPartnerOrganizationListV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public BusinessPlatformPartnerOrganizationListV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(BusinessPlatformPartnerOrganizationListV2DataListStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPlatformPartnerOrganizationListV2ResponseDataListInner businessPlatformPartnerOrganizationListV2ResponseDataListInner = (BusinessPlatformPartnerOrganizationListV2ResponseDataListInner) o;
    return Objects.equals(this.partnerOrganizationId, businessPlatformPartnerOrganizationListV2ResponseDataListInner.partnerOrganizationId) &&
        Objects.equals(this.remark, businessPlatformPartnerOrganizationListV2ResponseDataListInner.remark) &&
        Objects.equals(this.status, businessPlatformPartnerOrganizationListV2ResponseDataListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerOrganizationId, remark, status);
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
    sb.append("class BusinessPlatformPartnerOrganizationListV2ResponseDataListInner {\n");
    sb.append("    partnerOrganizationId: ").append(toIndentedString(partnerOrganizationId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("partner_organization_id");
    openapiFields.add("remark");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessPlatformPartnerOrganizationListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessPlatformPartnerOrganizationListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessPlatformPartnerOrganizationListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessPlatformPartnerOrganizationListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessPlatformPartnerOrganizationListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, BusinessPlatformPartnerOrganizationListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessPlatformPartnerOrganizationListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessPlatformPartnerOrganizationListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessPlatformPartnerOrganizationListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to BusinessPlatformPartnerOrganizationListV2ResponseDataListInner
  */
  public static BusinessPlatformPartnerOrganizationListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessPlatformPartnerOrganizationListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of BusinessPlatformPartnerOrganizationListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

