/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
 * ToolsAssetLinkListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolsAssetLinkListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link = null;

  public static final String SERIALIZED_NAME_LINK_ID = "link_id";
  @SerializedName(SERIALIZED_NAME_LINK_ID)
  private Long linkId = null;

  public static final String SERIALIZED_NAME_LINK_REMARK = "link_remark";
  @SerializedName(SERIALIZED_NAME_LINK_REMARK)
  private String linkRemark = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_START_PAGE = "start_page";
  @SerializedName(SERIALIZED_NAME_START_PAGE)
  private String startPage = null;

  public static final String SERIALIZED_NAME_START_PARAM = "start_param";
  @SerializedName(SERIALIZED_NAME_START_PARAM)
  private String startParam = null;

  public ToolsAssetLinkListV30ResponseDataListInner() {
  }

  public ToolsAssetLinkListV30ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsAssetLinkListV30ResponseDataListInner appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ToolsAssetLinkListV30ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsAssetLinkListV30ResponseDataListInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsAssetLinkListV30ResponseDataListInner link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * 
   * @return link
  **/
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public ToolsAssetLinkListV30ResponseDataListInner linkId(Long linkId) {
    
    this.linkId = linkId;
    return this;
  }

   /**
   * 
   * @return linkId
  **/
  @javax.annotation.Nullable
  public Long getLinkId() {
    return linkId;
  }


  public void setLinkId(Long linkId) {
    this.linkId = linkId;
  }


  public ToolsAssetLinkListV30ResponseDataListInner linkRemark(String linkRemark) {
    
    this.linkRemark = linkRemark;
    return this;
  }

   /**
   * 
   * @return linkRemark
  **/
  @javax.annotation.Nullable
  public String getLinkRemark() {
    return linkRemark;
  }


  public void setLinkRemark(String linkRemark) {
    this.linkRemark = linkRemark;
  }


  public ToolsAssetLinkListV30ResponseDataListInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public ToolsAssetLinkListV30ResponseDataListInner startPage(String startPage) {
    
    this.startPage = startPage;
    return this;
  }

   /**
   * 
   * @return startPage
  **/
  @javax.annotation.Nullable
  public String getStartPage() {
    return startPage;
  }


  public void setStartPage(String startPage) {
    this.startPage = startPage;
  }


  public ToolsAssetLinkListV30ResponseDataListInner startParam(String startParam) {
    
    this.startParam = startParam;
    return this;
  }

   /**
   * 
   * @return startParam
  **/
  @javax.annotation.Nullable
  public String getStartParam() {
    return startParam;
  }


  public void setStartParam(String startParam) {
    this.startParam = startParam;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAssetLinkListV30ResponseDataListInner toolsAssetLinkListV30ResponseDataListInner = (ToolsAssetLinkListV30ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, toolsAssetLinkListV30ResponseDataListInner.advertiserId) &&
        Objects.equals(this.appId, toolsAssetLinkListV30ResponseDataListInner.appId) &&
        Objects.equals(this.createTime, toolsAssetLinkListV30ResponseDataListInner.createTime) &&
        Objects.equals(this.instanceId, toolsAssetLinkListV30ResponseDataListInner.instanceId) &&
        Objects.equals(this.link, toolsAssetLinkListV30ResponseDataListInner.link) &&
        Objects.equals(this.linkId, toolsAssetLinkListV30ResponseDataListInner.linkId) &&
        Objects.equals(this.linkRemark, toolsAssetLinkListV30ResponseDataListInner.linkRemark) &&
        Objects.equals(this.modifyTime, toolsAssetLinkListV30ResponseDataListInner.modifyTime) &&
        Objects.equals(this.startPage, toolsAssetLinkListV30ResponseDataListInner.startPage) &&
        Objects.equals(this.startParam, toolsAssetLinkListV30ResponseDataListInner.startParam);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, createTime, instanceId, link, linkId, linkRemark, modifyTime, startPage, startParam);
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
    sb.append("class ToolsAssetLinkListV30ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    linkRemark: ").append(toIndentedString(linkRemark)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    startPage: ").append(toIndentedString(startPage)).append("\n");
    sb.append("    startParam: ").append(toIndentedString(startParam)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("create_time");
    openapiFields.add("instance_id");
    openapiFields.add("link");
    openapiFields.add("link_id");
    openapiFields.add("link_remark");
    openapiFields.add("modify_time");
    openapiFields.add("start_page");
    openapiFields.add("start_param");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAssetLinkListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAssetLinkListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAssetLinkListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAssetLinkListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAssetLinkListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAssetLinkListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAssetLinkListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAssetLinkListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAssetLinkListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAssetLinkListV30ResponseDataListInner
  */
  public static ToolsAssetLinkListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAssetLinkListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAssetLinkListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

