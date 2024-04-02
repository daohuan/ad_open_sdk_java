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
import com.bytedance.ads.model.CreativeAutoGenerateConfigCreateV2RequestTemplatesInner;
import com.bytedance.ads.model.CreativeAutoGenerateConfigCreateV2SelectTemplateMode;
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
 * CreativeAutoGenerateConfigCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class CreativeAutoGenerateConfigCreateV2Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Long configId = null;

  public static final String SERIALIZED_NAME_SELECT_TEMPLATE_MODE = "select_template_mode";
  @SerializedName(SERIALIZED_NAME_SELECT_TEMPLATE_MODE)
  private CreativeAutoGenerateConfigCreateV2SelectTemplateMode selectTemplateMode = null;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInner> templates = null;

  public CreativeAutoGenerateConfigCreateV2Request() {
  }

  public CreativeAutoGenerateConfigCreateV2Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 广告计划ID
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public CreativeAutoGenerateConfigCreateV2Request advertiserId(Long advertiserId) {
    
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


  public CreativeAutoGenerateConfigCreateV2Request configId(Long configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 配置ID，新建时不传入、修改时必传 
   * @return configId
  **/
  @javax.annotation.Nullable
  public Long getConfigId() {
    return configId;
  }


  public void setConfigId(Long configId) {
    this.configId = configId;
  }


  public CreativeAutoGenerateConfigCreateV2Request selectTemplateMode(CreativeAutoGenerateConfigCreateV2SelectTemplateMode selectTemplateMode) {
    
    this.selectTemplateMode = selectTemplateMode;
    return this;
  }

   /**
   * Get selectTemplateMode
   * @return selectTemplateMode
  **/
  @javax.annotation.Nullable
  public CreativeAutoGenerateConfigCreateV2SelectTemplateMode getSelectTemplateMode() {
    return selectTemplateMode;
  }


  public void setSelectTemplateMode(CreativeAutoGenerateConfigCreateV2SelectTemplateMode selectTemplateMode) {
    this.selectTemplateMode = selectTemplateMode;
  }


  public CreativeAutoGenerateConfigCreateV2Request templates(List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInner> templates) {
    
    this.templates = templates;
    return this;
  }

  public CreativeAutoGenerateConfigCreateV2Request addTemplatesItem(CreativeAutoGenerateConfigCreateV2RequestTemplatesInner templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * 模板列表
   * @return templates
  **/
  @javax.annotation.Nullable
  public List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInner> getTemplates() {
    return templates;
  }


  public void setTemplates(List<CreativeAutoGenerateConfigCreateV2RequestTemplatesInner> templates) {
    this.templates = templates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAutoGenerateConfigCreateV2Request creativeAutoGenerateConfigCreateV2Request = (CreativeAutoGenerateConfigCreateV2Request) o;
    return Objects.equals(this.adId, creativeAutoGenerateConfigCreateV2Request.adId) &&
        Objects.equals(this.advertiserId, creativeAutoGenerateConfigCreateV2Request.advertiserId) &&
        Objects.equals(this.configId, creativeAutoGenerateConfigCreateV2Request.configId) &&
        Objects.equals(this.selectTemplateMode, creativeAutoGenerateConfigCreateV2Request.selectTemplateMode) &&
        Objects.equals(this.templates, creativeAutoGenerateConfigCreateV2Request.templates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, configId, selectTemplateMode, templates);
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
    sb.append("class CreativeAutoGenerateConfigCreateV2Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    selectTemplateMode: ").append(toIndentedString(selectTemplateMode)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("config_id");
    openapiFields.add("select_template_mode");
    openapiFields.add("templates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("select_template_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeAutoGenerateConfigCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeAutoGenerateConfigCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeAutoGenerateConfigCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeAutoGenerateConfigCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeAutoGenerateConfigCreateV2Request>() {
           @Override
           public void write(JsonWriter out, CreativeAutoGenerateConfigCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeAutoGenerateConfigCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeAutoGenerateConfigCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeAutoGenerateConfigCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to CreativeAutoGenerateConfigCreateV2Request
  */
  public static CreativeAutoGenerateConfigCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeAutoGenerateConfigCreateV2Request.class);
  }

 /**
  * Convert an instance of CreativeAutoGenerateConfigCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

