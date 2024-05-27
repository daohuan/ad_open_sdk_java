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
import com.bytedance.ads.model.ToolsPreAuditSendV2PreAuditMaterialsType;
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
 * ToolsPreAuditSendV2RequestPreAuditMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ToolsPreAuditSendV2RequestPreAuditMaterialsInner {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ToolsPreAuditSendV2PreAuditMaterialsType type = null;

  public ToolsPreAuditSendV2RequestPreAuditMaterialsInner() {
  }

  public ToolsPreAuditSendV2RequestPreAuditMaterialsInner content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 前置预审物料 - 文本物料：用户上传文本 - 图片物料：用户上传图片链接或图片ID - 视频物料：用户上传的视频云ID - 落地页物料： 用户上传落地页URL
   * @return content
  **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ToolsPreAuditSendV2RequestPreAuditMaterialsInner type(ToolsPreAuditSendV2PreAuditMaterialsType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public ToolsPreAuditSendV2PreAuditMaterialsType getType() {
    return type;
  }


  public void setType(ToolsPreAuditSendV2PreAuditMaterialsType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPreAuditSendV2RequestPreAuditMaterialsInner toolsPreAuditSendV2RequestPreAuditMaterialsInner = (ToolsPreAuditSendV2RequestPreAuditMaterialsInner) o;
    return Objects.equals(this.content, toolsPreAuditSendV2RequestPreAuditMaterialsInner.content) &&
        Objects.equals(this.type, toolsPreAuditSendV2RequestPreAuditMaterialsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPreAuditSendV2RequestPreAuditMaterialsInner {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPreAuditSendV2RequestPreAuditMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPreAuditSendV2RequestPreAuditMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPreAuditSendV2RequestPreAuditMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPreAuditSendV2RequestPreAuditMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPreAuditSendV2RequestPreAuditMaterialsInner>() {
           @Override
           public void write(JsonWriter out, ToolsPreAuditSendV2RequestPreAuditMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPreAuditSendV2RequestPreAuditMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPreAuditSendV2RequestPreAuditMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPreAuditSendV2RequestPreAuditMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPreAuditSendV2RequestPreAuditMaterialsInner
  */
  public static ToolsPreAuditSendV2RequestPreAuditMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPreAuditSendV2RequestPreAuditMaterialsInner.class);
  }

 /**
  * Convert an instance of ToolsPreAuditSendV2RequestPreAuditMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

