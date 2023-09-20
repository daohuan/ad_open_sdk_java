/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPreAuditSendV2RequestPreAuditMaterialsInner;
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
 * ToolsPreAuditSendV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T19:34:37.792107567+08:00[PRC]")
public class ToolsPreAuditSendV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_PRE_AUDIT_MATERIALS = "pre_audit_materials";
  @SerializedName(SERIALIZED_NAME_PRE_AUDIT_MATERIALS)
  private List<ToolsPreAuditSendV2RequestPreAuditMaterialsInner> preAuditMaterials = null;

  public ToolsPreAuditSendV2Request() {
  }

  public ToolsPreAuditSendV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsPreAuditSendV2Request preAuditMaterials(List<ToolsPreAuditSendV2RequestPreAuditMaterialsInner> preAuditMaterials) {
    
    this.preAuditMaterials = preAuditMaterials;
    return this;
  }

  public ToolsPreAuditSendV2Request addPreAuditMaterialsItem(ToolsPreAuditSendV2RequestPreAuditMaterialsInner preAuditMaterialsItem) {
    if (this.preAuditMaterials == null) {
      this.preAuditMaterials = new ArrayList<>();
    }
    this.preAuditMaterials.add(preAuditMaterialsItem);
    return this;
  }

   /**
   * 前置预审物料列表
   * @return preAuditMaterials
  **/
  @javax.annotation.Nonnull
  public List<ToolsPreAuditSendV2RequestPreAuditMaterialsInner> getPreAuditMaterials() {
    return preAuditMaterials;
  }


  public void setPreAuditMaterials(List<ToolsPreAuditSendV2RequestPreAuditMaterialsInner> preAuditMaterials) {
    this.preAuditMaterials = preAuditMaterials;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPreAuditSendV2Request toolsPreAuditSendV2Request = (ToolsPreAuditSendV2Request) o;
    return Objects.equals(this.advertiserId, toolsPreAuditSendV2Request.advertiserId) &&
        Objects.equals(this.preAuditMaterials, toolsPreAuditSendV2Request.preAuditMaterials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, preAuditMaterials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPreAuditSendV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    preAuditMaterials: ").append(toIndentedString(preAuditMaterials)).append("\n");
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
    openapiFields.add("pre_audit_materials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("pre_audit_materials");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPreAuditSendV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPreAuditSendV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPreAuditSendV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPreAuditSendV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPreAuditSendV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsPreAuditSendV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPreAuditSendV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPreAuditSendV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPreAuditSendV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsPreAuditSendV2Request
  */
  public static ToolsPreAuditSendV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPreAuditSendV2Request.class);
  }

 /**
  * Convert an instance of ToolsPreAuditSendV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

