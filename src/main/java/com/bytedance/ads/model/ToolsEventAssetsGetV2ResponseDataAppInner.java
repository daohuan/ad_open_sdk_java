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
import com.bytedance.ads.model.ToolsEventAssetsGetV2DataAppAppType;
import com.bytedance.ads.model.ToolsEventAssetsGetV2DataAppRole;
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
 * ToolsEventAssetsGetV2ResponseDataAppInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ToolsEventAssetsGetV2ResponseDataAppInner {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Long appId = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private ToolsEventAssetsGetV2DataAppAppType appType = null;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName = null;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private ToolsEventAssetsGetV2DataAppRole role = null;

  public ToolsEventAssetsGetV2ResponseDataAppInner() {
  }

  public ToolsEventAssetsGetV2ResponseDataAppInner appId(Long appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 应用ID
   * @return appId
  **/
  @javax.annotation.Nullable
  public Long getAppId() {
    return appId;
  }


  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public ToolsEventAssetsGetV2ResponseDataAppInner appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ToolsEventAssetsGetV2ResponseDataAppInner appType(ToolsEventAssetsGetV2DataAppAppType appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @javax.annotation.Nullable
  public ToolsEventAssetsGetV2DataAppAppType getAppType() {
    return appType;
  }


  public void setAppType(ToolsEventAssetsGetV2DataAppAppType appType) {
    this.appType = appType;
  }


  public ToolsEventAssetsGetV2ResponseDataAppInner assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 应用资产ID
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public ToolsEventAssetsGetV2ResponseDataAppInner assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * 资产名
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public ToolsEventAssetsGetV2ResponseDataAppInner downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 应用下载链接
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public ToolsEventAssetsGetV2ResponseDataAppInner packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 母包ID
   * @return packageId
  **/
  @javax.annotation.Nullable
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public ToolsEventAssetsGetV2ResponseDataAppInner packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 应用包名
   * @return packageName
  **/
  @javax.annotation.Nullable
  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public ToolsEventAssetsGetV2ResponseDataAppInner role(ToolsEventAssetsGetV2DataAppRole role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  public ToolsEventAssetsGetV2DataAppRole getRole() {
    return role;
  }


  public void setRole(ToolsEventAssetsGetV2DataAppRole role) {
    this.role = role;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAssetsGetV2ResponseDataAppInner toolsEventAssetsGetV2ResponseDataAppInner = (ToolsEventAssetsGetV2ResponseDataAppInner) o;
    return Objects.equals(this.appId, toolsEventAssetsGetV2ResponseDataAppInner.appId) &&
        Objects.equals(this.appName, toolsEventAssetsGetV2ResponseDataAppInner.appName) &&
        Objects.equals(this.appType, toolsEventAssetsGetV2ResponseDataAppInner.appType) &&
        Objects.equals(this.assetId, toolsEventAssetsGetV2ResponseDataAppInner.assetId) &&
        Objects.equals(this.assetName, toolsEventAssetsGetV2ResponseDataAppInner.assetName) &&
        Objects.equals(this.downloadUrl, toolsEventAssetsGetV2ResponseDataAppInner.downloadUrl) &&
        Objects.equals(this.packageId, toolsEventAssetsGetV2ResponseDataAppInner.packageId) &&
        Objects.equals(this.packageName, toolsEventAssetsGetV2ResponseDataAppInner.packageName) &&
        Objects.equals(this.role, toolsEventAssetsGetV2ResponseDataAppInner.role);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appName, appType, assetId, assetName, downloadUrl, packageId, packageName, role);
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
    sb.append("class ToolsEventAssetsGetV2ResponseDataAppInner {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("app_name");
    openapiFields.add("app_type");
    openapiFields.add("asset_id");
    openapiFields.add("asset_name");
    openapiFields.add("download_url");
    openapiFields.add("package_id");
    openapiFields.add("package_name");
    openapiFields.add("role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAssetsGetV2ResponseDataAppInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAssetsGetV2ResponseDataAppInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAssetsGetV2ResponseDataAppInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAssetsGetV2ResponseDataAppInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAssetsGetV2ResponseDataAppInner>() {
           @Override
           public void write(JsonWriter out, ToolsEventAssetsGetV2ResponseDataAppInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAssetsGetV2ResponseDataAppInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAssetsGetV2ResponseDataAppInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAssetsGetV2ResponseDataAppInner
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAssetsGetV2ResponseDataAppInner
  */
  public static ToolsEventAssetsGetV2ResponseDataAppInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAssetsGetV2ResponseDataAppInner.class);
  }

 /**
  * Convert an instance of ToolsEventAssetsGetV2ResponseDataAppInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

