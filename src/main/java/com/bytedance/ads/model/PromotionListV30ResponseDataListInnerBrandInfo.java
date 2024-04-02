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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class PromotionListV30ResponseDataListInnerBrandInfo {
  public static final String SERIALIZED_NAME_BRAND_NAME_ID = "brand_name_id";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME_ID)
  private Long brandNameId = null;

  public static final String SERIALIZED_NAME_CDP_BRAND_ID = "cdp_brand_id";
  @SerializedName(SERIALIZED_NAME_CDP_BRAND_ID)
  private Long cdpBrandId = null;

  public static final String SERIALIZED_NAME_CDP_BRAND_NAME = "cdp_brand_name";
  @SerializedName(SERIALIZED_NAME_CDP_BRAND_NAME)
  private String cdpBrandName = null;

  public static final String SERIALIZED_NAME_ECOM_BRAND_ID = "ecom_brand_id";
  @SerializedName(SERIALIZED_NAME_ECOM_BRAND_ID)
  private Long ecomBrandId = null;

  public static final String SERIALIZED_NAME_SUB_BRAND_IDS = "sub_brand_ids";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND_IDS)
  private List<String> subBrandIds = null;

  public static final String SERIALIZED_NAME_SUB_BRAND_NAMES = "sub_brand_names";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND_NAMES)
  private List<String> subBrandNames = null;

  public static final String SERIALIZED_NAME_YUNTU_CATEGORY_ID = "yuntu_category_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_CATEGORY_ID)
  private Long yuntuCategoryId = null;

  public PromotionListV30ResponseDataListInnerBrandInfo() {
  }

  public PromotionListV30ResponseDataListInnerBrandInfo brandNameId(Long brandNameId) {
    
    this.brandNameId = brandNameId;
    return this;
  }

   /**
   * 云图品牌id
   * @return brandNameId
  **/
  @javax.annotation.Nullable
  public Long getBrandNameId() {
    return brandNameId;
  }


  public void setBrandNameId(Long brandNameId) {
    this.brandNameId = brandNameId;
  }


  public PromotionListV30ResponseDataListInnerBrandInfo cdpBrandId(Long cdpBrandId) {
    
    this.cdpBrandId = cdpBrandId;
    return this;
  }

   /**
   * cdp品牌id
   * @return cdpBrandId
  **/
  @javax.annotation.Nullable
  public Long getCdpBrandId() {
    return cdpBrandId;
  }


  public void setCdpBrandId(Long cdpBrandId) {
    this.cdpBrandId = cdpBrandId;
  }


  public PromotionListV30ResponseDataListInnerBrandInfo cdpBrandName(String cdpBrandName) {
    
    this.cdpBrandName = cdpBrandName;
    return this;
  }

   /**
   * 
   * @return cdpBrandName
  **/
  @javax.annotation.Nullable
  public String getCdpBrandName() {
    return cdpBrandName;
  }


  public void setCdpBrandName(String cdpBrandName) {
    this.cdpBrandName = cdpBrandName;
  }


  public PromotionListV30ResponseDataListInnerBrandInfo ecomBrandId(Long ecomBrandId) {
    
    this.ecomBrandId = ecomBrandId;
    return this;
  }

   /**
   * 电商品牌ID
   * @return ecomBrandId
  **/
  @javax.annotation.Nullable
  public Long getEcomBrandId() {
    return ecomBrandId;
  }


  public void setEcomBrandId(Long ecomBrandId) {
    this.ecomBrandId = ecomBrandId;
  }


  public PromotionListV30ResponseDataListInnerBrandInfo subBrandIds(List<String> subBrandIds) {
    
    this.subBrandIds = subBrandIds;
    return this;
  }

  public PromotionListV30ResponseDataListInnerBrandInfo addSubBrandIdsItem(String subBrandIdsItem) {
    if (this.subBrandIds == null) {
      this.subBrandIds = new ArrayList<>();
    }
    this.subBrandIds.add(subBrandIdsItem);
    return this;
  }

   /**
   * 子品牌信息id
   * @return subBrandIds
  **/
  @javax.annotation.Nullable
  public List<String> getSubBrandIds() {
    return subBrandIds;
  }


  public void setSubBrandIds(List<String> subBrandIds) {
    this.subBrandIds = subBrandIds;
  }


  public PromotionListV30ResponseDataListInnerBrandInfo subBrandNames(List<String> subBrandNames) {
    
    this.subBrandNames = subBrandNames;
    return this;
  }

  public PromotionListV30ResponseDataListInnerBrandInfo addSubBrandNamesItem(String subBrandNamesItem) {
    if (this.subBrandNames == null) {
      this.subBrandNames = new ArrayList<>();
    }
    this.subBrandNames.add(subBrandNamesItem);
    return this;
  }

   /**
   * 子品牌信息名称
   * @return subBrandNames
  **/
  @javax.annotation.Nullable
  public List<String> getSubBrandNames() {
    return subBrandNames;
  }


  public void setSubBrandNames(List<String> subBrandNames) {
    this.subBrandNames = subBrandNames;
  }


  public PromotionListV30ResponseDataListInnerBrandInfo yuntuCategoryId(Long yuntuCategoryId) {
    
    this.yuntuCategoryId = yuntuCategoryId;
    return this;
  }

   /**
   * 云图分类ID
   * @return yuntuCategoryId
  **/
  @javax.annotation.Nullable
  public Long getYuntuCategoryId() {
    return yuntuCategoryId;
  }


  public void setYuntuCategoryId(Long yuntuCategoryId) {
    this.yuntuCategoryId = yuntuCategoryId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInnerBrandInfo promotionListV30ResponseDataListInnerBrandInfo = (PromotionListV30ResponseDataListInnerBrandInfo) o;
    return Objects.equals(this.brandNameId, promotionListV30ResponseDataListInnerBrandInfo.brandNameId) &&
        Objects.equals(this.cdpBrandId, promotionListV30ResponseDataListInnerBrandInfo.cdpBrandId) &&
        Objects.equals(this.cdpBrandName, promotionListV30ResponseDataListInnerBrandInfo.cdpBrandName) &&
        Objects.equals(this.ecomBrandId, promotionListV30ResponseDataListInnerBrandInfo.ecomBrandId) &&
        Objects.equals(this.subBrandIds, promotionListV30ResponseDataListInnerBrandInfo.subBrandIds) &&
        Objects.equals(this.subBrandNames, promotionListV30ResponseDataListInnerBrandInfo.subBrandNames) &&
        Objects.equals(this.yuntuCategoryId, promotionListV30ResponseDataListInnerBrandInfo.yuntuCategoryId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandNameId, cdpBrandId, cdpBrandName, ecomBrandId, subBrandIds, subBrandNames, yuntuCategoryId);
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
    sb.append("class PromotionListV30ResponseDataListInnerBrandInfo {\n");
    sb.append("    brandNameId: ").append(toIndentedString(brandNameId)).append("\n");
    sb.append("    cdpBrandId: ").append(toIndentedString(cdpBrandId)).append("\n");
    sb.append("    cdpBrandName: ").append(toIndentedString(cdpBrandName)).append("\n");
    sb.append("    ecomBrandId: ").append(toIndentedString(ecomBrandId)).append("\n");
    sb.append("    subBrandIds: ").append(toIndentedString(subBrandIds)).append("\n");
    sb.append("    subBrandNames: ").append(toIndentedString(subBrandNames)).append("\n");
    sb.append("    yuntuCategoryId: ").append(toIndentedString(yuntuCategoryId)).append("\n");
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
    openapiFields.add("brand_name_id");
    openapiFields.add("cdp_brand_id");
    openapiFields.add("cdp_brand_name");
    openapiFields.add("ecom_brand_id");
    openapiFields.add("sub_brand_ids");
    openapiFields.add("sub_brand_names");
    openapiFields.add("yuntu_category_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerBrandInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerBrandInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerBrandInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerBrandInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerBrandInfo>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerBrandInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerBrandInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerBrandInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerBrandInfo
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerBrandInfo
  */
  public static PromotionListV30ResponseDataListInnerBrandInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerBrandInfo.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerBrandInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

