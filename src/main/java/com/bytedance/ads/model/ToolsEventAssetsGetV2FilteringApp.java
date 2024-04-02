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
 * 应用数据
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ToolsEventAssetsGetV2FilteringApp {
  public static final String SERIALIZED_NAME_APP_PACKAGE_NAME = "app_package_name";
  @SerializedName(SERIALIZED_NAME_APP_PACKAGE_NAME)
  private String appPackageName = null;

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName = null;

  public ToolsEventAssetsGetV2FilteringApp() {
  }

  public ToolsEventAssetsGetV2FilteringApp appPackageName(String appPackageName) {
    
    this.appPackageName = appPackageName;
    return this;
  }

   /**
   * 应用包名，精确搜索
   * @return appPackageName
  **/
  @javax.annotation.Nullable
  public String getAppPackageName() {
    return appPackageName;
  }


  public void setAppPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
  }


  public ToolsEventAssetsGetV2FilteringApp assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * 资产名，模糊搜索
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAssetsGetV2FilteringApp toolsEventAssetsGetV2FilteringApp = (ToolsEventAssetsGetV2FilteringApp) o;
    return Objects.equals(this.appPackageName, toolsEventAssetsGetV2FilteringApp.appPackageName) &&
        Objects.equals(this.assetName, toolsEventAssetsGetV2FilteringApp.assetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appPackageName, assetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsEventAssetsGetV2FilteringApp {\n");
    sb.append("    appPackageName: ").append(toIndentedString(appPackageName)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
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
    openapiFields.add("app_package_name");
    openapiFields.add("asset_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAssetsGetV2FilteringApp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAssetsGetV2FilteringApp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAssetsGetV2FilteringApp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAssetsGetV2FilteringApp.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAssetsGetV2FilteringApp>() {
           @Override
           public void write(JsonWriter out, ToolsEventAssetsGetV2FilteringApp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAssetsGetV2FilteringApp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAssetsGetV2FilteringApp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAssetsGetV2FilteringApp
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAssetsGetV2FilteringApp
  */
  public static ToolsEventAssetsGetV2FilteringApp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAssetsGetV2FilteringApp.class);
  }

 /**
  * Convert an instance of ToolsEventAssetsGetV2FilteringApp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

