/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class DpaProductUpdateV2RequestProductInfoBrandInfo {
  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId = null;

  public static final String SERIALIZED_NAME_BRAND_LOGO = "brand_logo";
  @SerializedName(SERIALIZED_NAME_BRAND_LOGO)
  private String brandLogo = null;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_BRAND_URL = "brand_url";
  @SerializedName(SERIALIZED_NAME_BRAND_URL)
  private String brandUrl = null;

  public static final String SERIALIZED_NAME_BRAND_URL_ANDROID_APP = "brand_url_android_app";
  @SerializedName(SERIALIZED_NAME_BRAND_URL_ANDROID_APP)
  private String brandUrlAndroidApp = null;

  public static final String SERIALIZED_NAME_BRAND_URL_IOS_APP = "brand_url_ios_app";
  @SerializedName(SERIALIZED_NAME_BRAND_URL_IOS_APP)
  private String brandUrlIosApp = null;

  public static final String SERIALIZED_NAME_BRAND_URL_MOBILE = "brand_url_mobile";
  @SerializedName(SERIALIZED_NAME_BRAND_URL_MOBILE)
  private String brandUrlMobile = null;

  public static final String SERIALIZED_NAME_BRAND_URL_UNIVERSAL_LINK = "brand_url_universal_link";
  @SerializedName(SERIALIZED_NAME_BRAND_URL_UNIVERSAL_LINK)
  private String brandUrlUniversalLink = null;

  public static final String SERIALIZED_NAME_EN_BRAND = "en_brand";
  @SerializedName(SERIALIZED_NAME_EN_BRAND)
  private String enBrand = null;

  public DpaProductUpdateV2RequestProductInfoBrandInfo() {
  }

  public DpaProductUpdateV2RequestProductInfoBrandInfo brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 
   * @return brandId
  **/
  @javax.annotation.Nullable
  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public DpaProductUpdateV2RequestProductInfoBrandInfo brandLogo(String brandLogo) {
    
    this.brandLogo = brandLogo;
    return this;
  }

   /**
   * 
   * @return brandLogo
  **/
  @javax.annotation.Nullable
  public String getBrandLogo() {
    return brandLogo;
  }


  public void setBrandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
  }


  public DpaProductUpdateV2RequestProductInfoBrandInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public DpaProductUpdateV2RequestProductInfoBrandInfo brandUrl(String brandUrl) {
    
    this.brandUrl = brandUrl;
    return this;
  }

   /**
   * 
   * @return brandUrl
  **/
  @javax.annotation.Nullable
  public String getBrandUrl() {
    return brandUrl;
  }


  public void setBrandUrl(String brandUrl) {
    this.brandUrl = brandUrl;
  }


  public DpaProductUpdateV2RequestProductInfoBrandInfo brandUrlAndroidApp(String brandUrlAndroidApp) {
    
    this.brandUrlAndroidApp = brandUrlAndroidApp;
    return this;
  }

   /**
   * 
   * @return brandUrlAndroidApp
  **/
  @javax.annotation.Nullable
  public String getBrandUrlAndroidApp() {
    return brandUrlAndroidApp;
  }


  public void setBrandUrlAndroidApp(String brandUrlAndroidApp) {
    this.brandUrlAndroidApp = brandUrlAndroidApp;
  }


  public DpaProductUpdateV2RequestProductInfoBrandInfo brandUrlIosApp(String brandUrlIosApp) {
    
    this.brandUrlIosApp = brandUrlIosApp;
    return this;
  }

   /**
   * 
   * @return brandUrlIosApp
  **/
  @javax.annotation.Nullable
  public String getBrandUrlIosApp() {
    return brandUrlIosApp;
  }


  public void setBrandUrlIosApp(String brandUrlIosApp) {
    this.brandUrlIosApp = brandUrlIosApp;
  }


  public DpaProductUpdateV2RequestProductInfoBrandInfo brandUrlMobile(String brandUrlMobile) {
    
    this.brandUrlMobile = brandUrlMobile;
    return this;
  }

   /**
   * 
   * @return brandUrlMobile
  **/
  @javax.annotation.Nullable
  public String getBrandUrlMobile() {
    return brandUrlMobile;
  }


  public void setBrandUrlMobile(String brandUrlMobile) {
    this.brandUrlMobile = brandUrlMobile;
  }


  public DpaProductUpdateV2RequestProductInfoBrandInfo brandUrlUniversalLink(String brandUrlUniversalLink) {
    
    this.brandUrlUniversalLink = brandUrlUniversalLink;
    return this;
  }

   /**
   * 
   * @return brandUrlUniversalLink
  **/
  @javax.annotation.Nullable
  public String getBrandUrlUniversalLink() {
    return brandUrlUniversalLink;
  }


  public void setBrandUrlUniversalLink(String brandUrlUniversalLink) {
    this.brandUrlUniversalLink = brandUrlUniversalLink;
  }


  public DpaProductUpdateV2RequestProductInfoBrandInfo enBrand(String enBrand) {
    
    this.enBrand = enBrand;
    return this;
  }

   /**
   * 
   * @return enBrand
  **/
  @javax.annotation.Nullable
  public String getEnBrand() {
    return enBrand;
  }


  public void setEnBrand(String enBrand) {
    this.enBrand = enBrand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaProductUpdateV2RequestProductInfoBrandInfo dpaProductUpdateV2RequestProductInfoBrandInfo = (DpaProductUpdateV2RequestProductInfoBrandInfo) o;
    return Objects.equals(this.brandId, dpaProductUpdateV2RequestProductInfoBrandInfo.brandId) &&
        Objects.equals(this.brandLogo, dpaProductUpdateV2RequestProductInfoBrandInfo.brandLogo) &&
        Objects.equals(this.brandName, dpaProductUpdateV2RequestProductInfoBrandInfo.brandName) &&
        Objects.equals(this.brandUrl, dpaProductUpdateV2RequestProductInfoBrandInfo.brandUrl) &&
        Objects.equals(this.brandUrlAndroidApp, dpaProductUpdateV2RequestProductInfoBrandInfo.brandUrlAndroidApp) &&
        Objects.equals(this.brandUrlIosApp, dpaProductUpdateV2RequestProductInfoBrandInfo.brandUrlIosApp) &&
        Objects.equals(this.brandUrlMobile, dpaProductUpdateV2RequestProductInfoBrandInfo.brandUrlMobile) &&
        Objects.equals(this.brandUrlUniversalLink, dpaProductUpdateV2RequestProductInfoBrandInfo.brandUrlUniversalLink) &&
        Objects.equals(this.enBrand, dpaProductUpdateV2RequestProductInfoBrandInfo.enBrand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, brandLogo, brandName, brandUrl, brandUrlAndroidApp, brandUrlIosApp, brandUrlMobile, brandUrlUniversalLink, enBrand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaProductUpdateV2RequestProductInfoBrandInfo {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandLogo: ").append(toIndentedString(brandLogo)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    brandUrl: ").append(toIndentedString(brandUrl)).append("\n");
    sb.append("    brandUrlAndroidApp: ").append(toIndentedString(brandUrlAndroidApp)).append("\n");
    sb.append("    brandUrlIosApp: ").append(toIndentedString(brandUrlIosApp)).append("\n");
    sb.append("    brandUrlMobile: ").append(toIndentedString(brandUrlMobile)).append("\n");
    sb.append("    brandUrlUniversalLink: ").append(toIndentedString(brandUrlUniversalLink)).append("\n");
    sb.append("    enBrand: ").append(toIndentedString(enBrand)).append("\n");
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
    openapiFields.add("brand_id");
    openapiFields.add("brand_logo");
    openapiFields.add("brand_name");
    openapiFields.add("brand_url");
    openapiFields.add("brand_url_android_app");
    openapiFields.add("brand_url_ios_app");
    openapiFields.add("brand_url_mobile");
    openapiFields.add("brand_url_universal_link");
    openapiFields.add("en_brand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaProductUpdateV2RequestProductInfoBrandInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaProductUpdateV2RequestProductInfoBrandInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaProductUpdateV2RequestProductInfoBrandInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaProductUpdateV2RequestProductInfoBrandInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaProductUpdateV2RequestProductInfoBrandInfo>() {
           @Override
           public void write(JsonWriter out, DpaProductUpdateV2RequestProductInfoBrandInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaProductUpdateV2RequestProductInfoBrandInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaProductUpdateV2RequestProductInfoBrandInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaProductUpdateV2RequestProductInfoBrandInfo
  * @throws IOException if the JSON string is invalid with respect to DpaProductUpdateV2RequestProductInfoBrandInfo
  */
  public static DpaProductUpdateV2RequestProductInfoBrandInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaProductUpdateV2RequestProductInfoBrandInfo.class);
  }

 /**
  * Convert an instance of DpaProductUpdateV2RequestProductInfoBrandInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

