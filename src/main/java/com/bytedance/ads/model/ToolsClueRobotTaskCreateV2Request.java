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
import com.bytedance.ads.model.ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner;
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
 * ToolsClueRobotTaskCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class ToolsClueRobotTaskCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_SCRIPT_ID = "script_id";
  @SerializedName(SERIALIZED_NAME_SCRIPT_ID)
  private Long scriptId = null;

  public static final String SERIALIZED_NAME_SCRIPT_VARIABLE_CONFIG = "script_variable_config";
  @SerializedName(SERIALIZED_NAME_SCRIPT_VARIABLE_CONFIG)
  private List<ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner> scriptVariableConfig = null;

  public ToolsClueRobotTaskCreateV2Request() {
  }

  public ToolsClueRobotTaskCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsClueRobotTaskCreateV2Request scriptId(Long scriptId) {
    
    this.scriptId = scriptId;
    return this;
  }

   /**
   * 剧本ID
   * @return scriptId
  **/
  @javax.annotation.Nullable
  public Long getScriptId() {
    return scriptId;
  }


  public void setScriptId(Long scriptId) {
    this.scriptId = scriptId;
  }


  public ToolsClueRobotTaskCreateV2Request scriptVariableConfig(List<ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner> scriptVariableConfig) {
    
    this.scriptVariableConfig = scriptVariableConfig;
    return this;
  }

  public ToolsClueRobotTaskCreateV2Request addScriptVariableConfigItem(ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner scriptVariableConfigItem) {
    if (this.scriptVariableConfig == null) {
      this.scriptVariableConfig = new ArrayList<>();
    }
    this.scriptVariableConfig.add(scriptVariableConfigItem);
    return this;
  }

   /**
   * 剧本变量配置信息
   * @return scriptVariableConfig
  **/
  @javax.annotation.Nullable
  public List<ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner> getScriptVariableConfig() {
    return scriptVariableConfig;
  }


  public void setScriptVariableConfig(List<ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner> scriptVariableConfig) {
    this.scriptVariableConfig = scriptVariableConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRobotTaskCreateV2Request toolsClueRobotTaskCreateV2Request = (ToolsClueRobotTaskCreateV2Request) o;
    return Objects.equals(this.advertiserId, toolsClueRobotTaskCreateV2Request.advertiserId) &&
        Objects.equals(this.scriptId, toolsClueRobotTaskCreateV2Request.scriptId) &&
        Objects.equals(this.scriptVariableConfig, toolsClueRobotTaskCreateV2Request.scriptVariableConfig);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, scriptId, scriptVariableConfig);
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
    sb.append("class ToolsClueRobotTaskCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    scriptVariableConfig: ").append(toIndentedString(scriptVariableConfig)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("script_id");
    openapiFields.add("script_variable_config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("script_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRobotTaskCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRobotTaskCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRobotTaskCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRobotTaskCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRobotTaskCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsClueRobotTaskCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRobotTaskCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRobotTaskCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRobotTaskCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRobotTaskCreateV2Request
  */
  public static ToolsClueRobotTaskCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRobotTaskCreateV2Request.class);
  }

 /**
  * Convert an instance of ToolsClueRobotTaskCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

