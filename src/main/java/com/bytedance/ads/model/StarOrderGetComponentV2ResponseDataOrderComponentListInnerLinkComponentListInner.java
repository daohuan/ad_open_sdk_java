/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner {
  public static final String SERIALIZED_NAME_AUDIT_REJECT_REASON = "audit_reject_reason";
  @SerializedName(SERIALIZED_NAME_AUDIT_REJECT_REASON)
  private String auditRejectReason = null;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL_ANDROID = "download_url_android";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL_ANDROID)
  private String downloadUrlAndroid = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL_IOS = "download_url_ios";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL_IOS)
  private String downloadUrlIos = null;

  public static final String SERIALIZED_NAME_LANDING_URL_ANDROID = "landing_url_android";
  @SerializedName(SERIALIZED_NAME_LANDING_URL_ANDROID)
  private String landingUrlAndroid = null;

  public static final String SERIALIZED_NAME_LANDING_URL_IOS = "landing_url_ios";
  @SerializedName(SERIALIZED_NAME_LANDING_URL_IOS)
  private String landingUrlIos = null;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private Long linkType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner() {
  }

  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner auditRejectReason(String auditRejectReason) {
    
    this.auditRejectReason = auditRejectReason;
    return this;
  }

   /**
   * 审核失败原因
   * @return auditRejectReason
  **/
  @javax.annotation.Nullable
  public String getAuditRejectReason() {
    return auditRejectReason;
  }


  public void setAuditRejectReason(String auditRejectReason) {
    this.auditRejectReason = auditRejectReason;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * 组件ID
   * @return componentId
  **/
  @javax.annotation.Nullable
  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner downloadUrlAndroid(String downloadUrlAndroid) {
    
    this.downloadUrlAndroid = downloadUrlAndroid;
    return this;
  }

   /**
   * 安卓下载链接
   * @return downloadUrlAndroid
  **/
  @javax.annotation.Nullable
  public String getDownloadUrlAndroid() {
    return downloadUrlAndroid;
  }


  public void setDownloadUrlAndroid(String downloadUrlAndroid) {
    this.downloadUrlAndroid = downloadUrlAndroid;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner downloadUrlIos(String downloadUrlIos) {
    
    this.downloadUrlIos = downloadUrlIos;
    return this;
  }

   /**
   * iOS app 下载链接
   * @return downloadUrlIos
  **/
  @javax.annotation.Nullable
  public String getDownloadUrlIos() {
    return downloadUrlIos;
  }


  public void setDownloadUrlIos(String downloadUrlIos) {
    this.downloadUrlIos = downloadUrlIos;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner landingUrlAndroid(String landingUrlAndroid) {
    
    this.landingUrlAndroid = landingUrlAndroid;
    return this;
  }

   /**
   * 安卓落地页链接
   * @return landingUrlAndroid
  **/
  @javax.annotation.Nullable
  public String getLandingUrlAndroid() {
    return landingUrlAndroid;
  }


  public void setLandingUrlAndroid(String landingUrlAndroid) {
    this.landingUrlAndroid = landingUrlAndroid;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner landingUrlIos(String landingUrlIos) {
    
    this.landingUrlIos = landingUrlIos;
    return this;
  }

   /**
   * iOS落地页链接
   * @return landingUrlIos
  **/
  @javax.annotation.Nullable
  public String getLandingUrlIos() {
    return landingUrlIos;
  }


  public void setLandingUrlIos(String landingUrlIos) {
    this.landingUrlIos = landingUrlIos;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner linkType(Long linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * link组件类别 1 &#x3D; 落地页 2 &#x3D; 短视频小程序 3 &#x3D; 原生落地页 4 &#x3D; 直播落地页 5 &#x3D; 直播小程序 6 &#x3D; 直播下载组件 7 &#x3D; 直播引流组件
   * @return linkType
  **/
  @javax.annotation.Nullable
  public Long getLinkType() {
    return linkType;
  }


  public void setLinkType(Long linkType) {
    this.linkType = linkType;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 组件状态 0 &#x3D; 待送审 1 &#x3D; 有效 2 &#x3D;审核中 3 &#x3D; 审核失败
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner = (StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner) o;
    return Objects.equals(this.auditRejectReason, starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.auditRejectReason) &&
        Objects.equals(this.componentId, starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.componentId) &&
        Objects.equals(this.downloadUrlAndroid, starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.downloadUrlAndroid) &&
        Objects.equals(this.downloadUrlIos, starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.downloadUrlIos) &&
        Objects.equals(this.landingUrlAndroid, starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.landingUrlAndroid) &&
        Objects.equals(this.landingUrlIos, starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.landingUrlIos) &&
        Objects.equals(this.linkType, starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.linkType) &&
        Objects.equals(this.status, starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.status) &&
        Objects.equals(this.title, starOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditRejectReason, componentId, downloadUrlAndroid, downloadUrlIos, landingUrlAndroid, landingUrlIos, linkType, status, title);
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
    sb.append("class StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner {\n");
    sb.append("    auditRejectReason: ").append(toIndentedString(auditRejectReason)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    downloadUrlAndroid: ").append(toIndentedString(downloadUrlAndroid)).append("\n");
    sb.append("    downloadUrlIos: ").append(toIndentedString(downloadUrlIos)).append("\n");
    sb.append("    landingUrlAndroid: ").append(toIndentedString(landingUrlAndroid)).append("\n");
    sb.append("    landingUrlIos: ").append(toIndentedString(landingUrlIos)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("audit_reject_reason");
    openapiFields.add("component_id");
    openapiFields.add("download_url_android");
    openapiFields.add("download_url_ios");
    openapiFields.add("landing_url_android");
    openapiFields.add("landing_url_ios");
    openapiFields.add("link_type");
    openapiFields.add("status");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner>() {
           @Override
           public void write(JsonWriter out, StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner
  */
  public static StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner.class);
  }

 /**
  * Convert an instance of StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

