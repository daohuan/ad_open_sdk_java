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
import com.bytedance.ads.model.ToolsLandingGroupCreateV2DataGroupFlowType;
import com.bytedance.ads.model.ToolsLandingGroupCreateV2DataGroupStatus;
import com.bytedance.ads.model.ToolsLandingGroupCreateV2ResponseDataSitesInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class ToolsLandingGroupCreateV2ResponseData {
  public static final String SERIALIZED_NAME_GROUP_FLOW_TYPE = "group_flow_type";
  @SerializedName(SERIALIZED_NAME_GROUP_FLOW_TYPE)
  private ToolsLandingGroupCreateV2DataGroupFlowType groupFlowType = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId = null;

  public static final String SERIALIZED_NAME_GROUP_STATUS = "group_status";
  @SerializedName(SERIALIZED_NAME_GROUP_STATUS)
  private ToolsLandingGroupCreateV2DataGroupStatus groupStatus = null;

  public static final String SERIALIZED_NAME_GROUP_TITLE = "group_title";
  @SerializedName(SERIALIZED_NAME_GROUP_TITLE)
  private String groupTitle = null;

  public static final String SERIALIZED_NAME_GROUP_URL = "group_url";
  @SerializedName(SERIALIZED_NAME_GROUP_URL)
  private String groupUrl = null;

  public static final String SERIALIZED_NAME_SITES = "sites";
  @SerializedName(SERIALIZED_NAME_SITES)
  private List<ToolsLandingGroupCreateV2ResponseDataSitesInner> sites = null;

  public ToolsLandingGroupCreateV2ResponseData() {
  }

  public ToolsLandingGroupCreateV2ResponseData groupFlowType(ToolsLandingGroupCreateV2DataGroupFlowType groupFlowType) {
    
    this.groupFlowType = groupFlowType;
    return this;
  }

   /**
   * Get groupFlowType
   * @return groupFlowType
  **/
  @javax.annotation.Nullable
  public ToolsLandingGroupCreateV2DataGroupFlowType getGroupFlowType() {
    return groupFlowType;
  }


  public void setGroupFlowType(ToolsLandingGroupCreateV2DataGroupFlowType groupFlowType) {
    this.groupFlowType = groupFlowType;
  }


  public ToolsLandingGroupCreateV2ResponseData groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 
   * @return groupId
  **/
  @javax.annotation.Nullable
  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ToolsLandingGroupCreateV2ResponseData groupStatus(ToolsLandingGroupCreateV2DataGroupStatus groupStatus) {
    
    this.groupStatus = groupStatus;
    return this;
  }

   /**
   * Get groupStatus
   * @return groupStatus
  **/
  @javax.annotation.Nullable
  public ToolsLandingGroupCreateV2DataGroupStatus getGroupStatus() {
    return groupStatus;
  }


  public void setGroupStatus(ToolsLandingGroupCreateV2DataGroupStatus groupStatus) {
    this.groupStatus = groupStatus;
  }


  public ToolsLandingGroupCreateV2ResponseData groupTitle(String groupTitle) {
    
    this.groupTitle = groupTitle;
    return this;
  }

   /**
   * 
   * @return groupTitle
  **/
  @javax.annotation.Nullable
  public String getGroupTitle() {
    return groupTitle;
  }


  public void setGroupTitle(String groupTitle) {
    this.groupTitle = groupTitle;
  }


  public ToolsLandingGroupCreateV2ResponseData groupUrl(String groupUrl) {
    
    this.groupUrl = groupUrl;
    return this;
  }

   /**
   * 
   * @return groupUrl
  **/
  @javax.annotation.Nullable
  public String getGroupUrl() {
    return groupUrl;
  }


  public void setGroupUrl(String groupUrl) {
    this.groupUrl = groupUrl;
  }


  public ToolsLandingGroupCreateV2ResponseData sites(List<ToolsLandingGroupCreateV2ResponseDataSitesInner> sites) {
    
    this.sites = sites;
    return this;
  }

  public ToolsLandingGroupCreateV2ResponseData addSitesItem(ToolsLandingGroupCreateV2ResponseDataSitesInner sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<>();
    }
    this.sites.add(sitesItem);
    return this;
  }

   /**
   * 
   * @return sites
  **/
  @javax.annotation.Nullable
  public List<ToolsLandingGroupCreateV2ResponseDataSitesInner> getSites() {
    return sites;
  }


  public void setSites(List<ToolsLandingGroupCreateV2ResponseDataSitesInner> sites) {
    this.sites = sites;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLandingGroupCreateV2ResponseData toolsLandingGroupCreateV2ResponseData = (ToolsLandingGroupCreateV2ResponseData) o;
    return Objects.equals(this.groupFlowType, toolsLandingGroupCreateV2ResponseData.groupFlowType) &&
        Objects.equals(this.groupId, toolsLandingGroupCreateV2ResponseData.groupId) &&
        Objects.equals(this.groupStatus, toolsLandingGroupCreateV2ResponseData.groupStatus) &&
        Objects.equals(this.groupTitle, toolsLandingGroupCreateV2ResponseData.groupTitle) &&
        Objects.equals(this.groupUrl, toolsLandingGroupCreateV2ResponseData.groupUrl) &&
        Objects.equals(this.sites, toolsLandingGroupCreateV2ResponseData.sites);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupFlowType, groupId, groupStatus, groupTitle, groupUrl, sites);
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
    sb.append("class ToolsLandingGroupCreateV2ResponseData {\n");
    sb.append("    groupFlowType: ").append(toIndentedString(groupFlowType)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupStatus: ").append(toIndentedString(groupStatus)).append("\n");
    sb.append("    groupTitle: ").append(toIndentedString(groupTitle)).append("\n");
    sb.append("    groupUrl: ").append(toIndentedString(groupUrl)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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
    openapiFields.add("group_flow_type");
    openapiFields.add("group_id");
    openapiFields.add("group_status");
    openapiFields.add("group_title");
    openapiFields.add("group_url");
    openapiFields.add("sites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLandingGroupCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLandingGroupCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLandingGroupCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLandingGroupCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLandingGroupCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsLandingGroupCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLandingGroupCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLandingGroupCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLandingGroupCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsLandingGroupCreateV2ResponseData
  */
  public static ToolsLandingGroupCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLandingGroupCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsLandingGroupCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

