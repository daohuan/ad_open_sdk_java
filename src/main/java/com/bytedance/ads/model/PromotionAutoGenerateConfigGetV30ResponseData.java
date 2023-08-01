/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionAutoGenerateConfigGetV30DataVersion;
import com.bytedance.ads.model.PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInner;
import com.bytedance.ads.model.PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-01T11:34:33.660+08:00[Asia/Shanghai]")
public class PromotionAutoGenerateConfigGetV30ResponseData {
  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Long configId = null;

  public static final String SERIALIZED_NAME_STRATEGY_DATA = "strategy_data";
  @SerializedName(SERIALIZED_NAME_STRATEGY_DATA)
  private List<PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInner> strategyData = null;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner> templates = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private Long updateTime = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private PromotionAutoGenerateConfigGetV30DataVersion version = null;

  public PromotionAutoGenerateConfigGetV30ResponseData() {
  }

  public PromotionAutoGenerateConfigGetV30ResponseData configId(Long configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 配置ID
   * @return configId
  **/
  @javax.annotation.Nullable
  public Long getConfigId() {
    return configId;
  }


  public void setConfigId(Long configId) {
    this.configId = configId;
  }


  public PromotionAutoGenerateConfigGetV30ResponseData strategyData(List<PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInner> strategyData) {
    
    this.strategyData = strategyData;
    return this;
  }

  public PromotionAutoGenerateConfigGetV30ResponseData addStrategyDataItem(PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInner strategyDataItem) {
    if (this.strategyData == null) {
      this.strategyData = null;
    }
    this.strategyData.add(strategyDataItem);
    return this;
  }

   /**
   * 策略配置详情列表(仅当version&#x3D;Strategy时有值)
   * @return strategyData
  **/
  @javax.annotation.Nullable
  public List<PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInner> getStrategyData() {
    return strategyData;
  }


  public void setStrategyData(List<PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInner> strategyData) {
    this.strategyData = strategyData;
  }


  public PromotionAutoGenerateConfigGetV30ResponseData templates(List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner> templates) {
    
    this.templates = templates;
    return this;
  }

  public PromotionAutoGenerateConfigGetV30ResponseData addTemplatesItem(PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner templatesItem) {
    if (this.templates == null) {
      this.templates = null;
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * 模板列表(仅当version&#x3D;Template时有值)
   * @return templates
  **/
  @javax.annotation.Nullable
  public List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner> getTemplates() {
    return templates;
  }


  public void setTemplates(List<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInner> templates) {
    this.templates = templates;
  }


  public PromotionAutoGenerateConfigGetV30ResponseData updateTime(Long updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 上次修改时间戳
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public Long getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }


  public PromotionAutoGenerateConfigGetV30ResponseData version(PromotionAutoGenerateConfigGetV30DataVersion version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public PromotionAutoGenerateConfigGetV30DataVersion getVersion() {
    return version;
  }


  public void setVersion(PromotionAutoGenerateConfigGetV30DataVersion version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAutoGenerateConfigGetV30ResponseData promotionAutoGenerateConfigGetV30ResponseData = (PromotionAutoGenerateConfigGetV30ResponseData) o;
    return Objects.equals(this.configId, promotionAutoGenerateConfigGetV30ResponseData.configId) &&
        Objects.equals(this.strategyData, promotionAutoGenerateConfigGetV30ResponseData.strategyData) &&
        Objects.equals(this.templates, promotionAutoGenerateConfigGetV30ResponseData.templates) &&
        Objects.equals(this.updateTime, promotionAutoGenerateConfigGetV30ResponseData.updateTime) &&
        Objects.equals(this.version, promotionAutoGenerateConfigGetV30ResponseData.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, strategyData, templates, updateTime, version);
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
    sb.append("class PromotionAutoGenerateConfigGetV30ResponseData {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    strategyData: ").append(toIndentedString(strategyData)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("config_id");
    openapiFields.add("strategy_data");
    openapiFields.add("templates");
    openapiFields.add("update_time");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAutoGenerateConfigGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAutoGenerateConfigGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAutoGenerateConfigGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAutoGenerateConfigGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAutoGenerateConfigGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, PromotionAutoGenerateConfigGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAutoGenerateConfigGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAutoGenerateConfigGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAutoGenerateConfigGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to PromotionAutoGenerateConfigGetV30ResponseData
  */
  public static PromotionAutoGenerateConfigGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAutoGenerateConfigGetV30ResponseData.class);
  }

 /**
  * Convert an instance of PromotionAutoGenerateConfigGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

