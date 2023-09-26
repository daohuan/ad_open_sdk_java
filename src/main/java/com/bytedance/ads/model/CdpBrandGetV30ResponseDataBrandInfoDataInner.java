/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
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
 * CdpBrandGetV30ResponseDataBrandInfoDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class CdpBrandGetV30ResponseDataBrandInfoDataInner {
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

  public static final String SERIALIZED_NAME_SUB_BRAND_MAP = "sub_brand_map";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND_MAP)
  private Object subBrandMap = null;

  public CdpBrandGetV30ResponseDataBrandInfoDataInner() {
  }

  public CdpBrandGetV30ResponseDataBrandInfoDataInner brandNameId(Long brandNameId) {
    
    this.brandNameId = brandNameId;
    return this;
  }

   /**
   * 
   * @return brandNameId
  **/
  @javax.annotation.Nullable
  public Long getBrandNameId() {
    return brandNameId;
  }


  public void setBrandNameId(Long brandNameId) {
    this.brandNameId = brandNameId;
  }


  public CdpBrandGetV30ResponseDataBrandInfoDataInner cdpBrandId(Long cdpBrandId) {
    
    this.cdpBrandId = cdpBrandId;
    return this;
  }

   /**
   * 
   * @return cdpBrandId
  **/
  @javax.annotation.Nullable
  public Long getCdpBrandId() {
    return cdpBrandId;
  }


  public void setCdpBrandId(Long cdpBrandId) {
    this.cdpBrandId = cdpBrandId;
  }


  public CdpBrandGetV30ResponseDataBrandInfoDataInner cdpBrandName(String cdpBrandName) {
    
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


  public CdpBrandGetV30ResponseDataBrandInfoDataInner ecomBrandId(Long ecomBrandId) {
    
    this.ecomBrandId = ecomBrandId;
    return this;
  }

   /**
   * 
   * @return ecomBrandId
  **/
  @javax.annotation.Nullable
  public Long getEcomBrandId() {
    return ecomBrandId;
  }


  public void setEcomBrandId(Long ecomBrandId) {
    this.ecomBrandId = ecomBrandId;
  }


  public CdpBrandGetV30ResponseDataBrandInfoDataInner subBrandMap(Object subBrandMap) {
    
    this.subBrandMap = subBrandMap;
    return this;
  }

   /**
   * 
   * @return subBrandMap
  **/
  @javax.annotation.Nullable
  public Object getSubBrandMap() {
    return subBrandMap;
  }


  public void setSubBrandMap(Object subBrandMap) {
    this.subBrandMap = subBrandMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdpBrandGetV30ResponseDataBrandInfoDataInner cdpBrandGetV30ResponseDataBrandInfoDataInner = (CdpBrandGetV30ResponseDataBrandInfoDataInner) o;
    return Objects.equals(this.brandNameId, cdpBrandGetV30ResponseDataBrandInfoDataInner.brandNameId) &&
        Objects.equals(this.cdpBrandId, cdpBrandGetV30ResponseDataBrandInfoDataInner.cdpBrandId) &&
        Objects.equals(this.cdpBrandName, cdpBrandGetV30ResponseDataBrandInfoDataInner.cdpBrandName) &&
        Objects.equals(this.ecomBrandId, cdpBrandGetV30ResponseDataBrandInfoDataInner.ecomBrandId) &&
        Objects.equals(this.subBrandMap, cdpBrandGetV30ResponseDataBrandInfoDataInner.subBrandMap);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandNameId, cdpBrandId, cdpBrandName, ecomBrandId, subBrandMap);
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
    sb.append("class CdpBrandGetV30ResponseDataBrandInfoDataInner {\n");
    sb.append("    brandNameId: ").append(toIndentedString(brandNameId)).append("\n");
    sb.append("    cdpBrandId: ").append(toIndentedString(cdpBrandId)).append("\n");
    sb.append("    cdpBrandName: ").append(toIndentedString(cdpBrandName)).append("\n");
    sb.append("    ecomBrandId: ").append(toIndentedString(ecomBrandId)).append("\n");
    sb.append("    subBrandMap: ").append(toIndentedString(subBrandMap)).append("\n");
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
    openapiFields.add("sub_brand_map");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CdpBrandGetV30ResponseDataBrandInfoDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CdpBrandGetV30ResponseDataBrandInfoDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CdpBrandGetV30ResponseDataBrandInfoDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CdpBrandGetV30ResponseDataBrandInfoDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CdpBrandGetV30ResponseDataBrandInfoDataInner>() {
           @Override
           public void write(JsonWriter out, CdpBrandGetV30ResponseDataBrandInfoDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CdpBrandGetV30ResponseDataBrandInfoDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CdpBrandGetV30ResponseDataBrandInfoDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CdpBrandGetV30ResponseDataBrandInfoDataInner
  * @throws IOException if the JSON string is invalid with respect to CdpBrandGetV30ResponseDataBrandInfoDataInner
  */
  public static CdpBrandGetV30ResponseDataBrandInfoDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CdpBrandGetV30ResponseDataBrandInfoDataInner.class);
  }

 /**
  * Convert an instance of CdpBrandGetV30ResponseDataBrandInfoDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

