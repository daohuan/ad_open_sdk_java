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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class StarDemandOmUpdateChallengeV2RequestChallengeInfo {
  public static final String SERIALIZED_NAME_ANCHOR_TITLE = "anchor_title";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TITLE)
  private String anchorTitle = null;

  public static final String SERIALIZED_NAME_AUTHOR_TASK_NAME = "author_task_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_TASK_NAME)
  private String authorTaskName = null;

  public static final String SERIALIZED_NAME_DEMAND_DESC = "demand_desc";
  @SerializedName(SERIALIZED_NAME_DEMAND_DESC)
  private String demandDesc = null;

  public static final String SERIALIZED_NAME_OM_TASK_TAG = "om_task_tag";
  @SerializedName(SERIALIZED_NAME_OM_TASK_TAG)
  private List<String> omTaskTag = null;

  public static final String SERIALIZED_NAME_SAMPLE_VIDEO = "sample_video";
  @SerializedName(SERIALIZED_NAME_SAMPLE_VIDEO)
  private List<Long> sampleVideo = null;

  public static final String SERIALIZED_NAME_START_PAGE = "start_page";
  @SerializedName(SERIALIZED_NAME_START_PAGE)
  private String startPage = null;

  public static final String SERIALIZED_NAME_TASK_HEAD_IMAGE = "task_head_image";
  @SerializedName(SERIALIZED_NAME_TASK_HEAD_IMAGE)
  private String taskHeadImage = null;

  public static final String SERIALIZED_NAME_TASK_ICON = "task_icon";
  @SerializedName(SERIALIZED_NAME_TASK_ICON)
  private String taskIcon = null;

  public StarDemandOmUpdateChallengeV2RequestChallengeInfo() {
  }

  public StarDemandOmUpdateChallengeV2RequestChallengeInfo anchorTitle(String anchorTitle) {
    
    this.anchorTitle = anchorTitle;
    return this;
  }

   /**
   * 组件标题
   * @return anchorTitle
  **/
  @javax.annotation.Nullable
  public String getAnchorTitle() {
    return anchorTitle;
  }


  public void setAnchorTitle(String anchorTitle) {
    this.anchorTitle = anchorTitle;
  }


  public StarDemandOmUpdateChallengeV2RequestChallengeInfo authorTaskName(String authorTaskName) {
    
    this.authorTaskName = authorTaskName;
    return this;
  }

   /**
   * 达人侧任务名称
   * @return authorTaskName
  **/
  @javax.annotation.Nullable
  public String getAuthorTaskName() {
    return authorTaskName;
  }


  public void setAuthorTaskName(String authorTaskName) {
    this.authorTaskName = authorTaskName;
  }


  public StarDemandOmUpdateChallengeV2RequestChallengeInfo demandDesc(String demandDesc) {
    
    this.demandDesc = demandDesc;
    return this;
  }

   /**
   * 任务介绍 文本，最长500字。如果不传递参数，那么字段将保留原始任务信息，不会进行更新
   * @return demandDesc
  **/
  @javax.annotation.Nullable
  public String getDemandDesc() {
    return demandDesc;
  }


  public void setDemandDesc(String demandDesc) {
    this.demandDesc = demandDesc;
  }


  public StarDemandOmUpdateChallengeV2RequestChallengeInfo omTaskTag(List<String> omTaskTag) {
    
    this.omTaskTag = omTaskTag;
    return this;
  }

  public StarDemandOmUpdateChallengeV2RequestChallengeInfo addOmTaskTagItem(String omTaskTagItem) {
    if (this.omTaskTag == null) {
      this.omTaskTag = new ArrayList<>();
    }
    this.omTaskTag.add(omTaskTagItem);
    return this;
  }

   /**
   * 任务标签
   * @return omTaskTag
  **/
  @javax.annotation.Nullable
  public List<String> getOmTaskTag() {
    return omTaskTag;
  }


  public void setOmTaskTag(List<String> omTaskTag) {
    this.omTaskTag = omTaskTag;
  }


  public StarDemandOmUpdateChallengeV2RequestChallengeInfo sampleVideo(List<Long> sampleVideo) {
    
    this.sampleVideo = sampleVideo;
    return this;
  }

  public StarDemandOmUpdateChallengeV2RequestChallengeInfo addSampleVideoItem(Long sampleVideoItem) {
    if (this.sampleVideo == null) {
      this.sampleVideo = new ArrayList<>();
    }
    this.sampleVideo.add(sampleVideoItem);
    return this;
  }

   /**
   * 示例视频id 最多5个
   * @return sampleVideo
  **/
  @javax.annotation.Nullable
  public List<Long> getSampleVideo() {
    return sampleVideo;
  }


  public void setSampleVideo(List<Long> sampleVideo) {
    this.sampleVideo = sampleVideo;
  }


  public StarDemandOmUpdateChallengeV2RequestChallengeInfo startPage(String startPage) {
    
    this.startPage = startPage;
    return this;
  }

   /**
   * 小程序落地页地址 字符串，支持校验合规性
   * @return startPage
  **/
  @javax.annotation.Nullable
  public String getStartPage() {
    return startPage;
  }


  public void setStartPage(String startPage) {
    this.startPage = startPage;
  }


  public StarDemandOmUpdateChallengeV2RequestChallengeInfo taskHeadImage(String taskHeadImage) {
    
    this.taskHeadImage = taskHeadImage;
    return this;
  }

   /**
   * 任务头图 URL文本
   * @return taskHeadImage
  **/
  @javax.annotation.Nullable
  public String getTaskHeadImage() {
    return taskHeadImage;
  }


  public void setTaskHeadImage(String taskHeadImage) {
    this.taskHeadImage = taskHeadImage;
  }


  public StarDemandOmUpdateChallengeV2RequestChallengeInfo taskIcon(String taskIcon) {
    
    this.taskIcon = taskIcon;
    return this;
  }

   /**
   * 任务图标 URL文本
   * @return taskIcon
  **/
  @javax.annotation.Nullable
  public String getTaskIcon() {
    return taskIcon;
  }


  public void setTaskIcon(String taskIcon) {
    this.taskIcon = taskIcon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmUpdateChallengeV2RequestChallengeInfo starDemandOmUpdateChallengeV2RequestChallengeInfo = (StarDemandOmUpdateChallengeV2RequestChallengeInfo) o;
    return Objects.equals(this.anchorTitle, starDemandOmUpdateChallengeV2RequestChallengeInfo.anchorTitle) &&
        Objects.equals(this.authorTaskName, starDemandOmUpdateChallengeV2RequestChallengeInfo.authorTaskName) &&
        Objects.equals(this.demandDesc, starDemandOmUpdateChallengeV2RequestChallengeInfo.demandDesc) &&
        Objects.equals(this.omTaskTag, starDemandOmUpdateChallengeV2RequestChallengeInfo.omTaskTag) &&
        Objects.equals(this.sampleVideo, starDemandOmUpdateChallengeV2RequestChallengeInfo.sampleVideo) &&
        Objects.equals(this.startPage, starDemandOmUpdateChallengeV2RequestChallengeInfo.startPage) &&
        Objects.equals(this.taskHeadImage, starDemandOmUpdateChallengeV2RequestChallengeInfo.taskHeadImage) &&
        Objects.equals(this.taskIcon, starDemandOmUpdateChallengeV2RequestChallengeInfo.taskIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorTitle, authorTaskName, demandDesc, omTaskTag, sampleVideo, startPage, taskHeadImage, taskIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmUpdateChallengeV2RequestChallengeInfo {\n");
    sb.append("    anchorTitle: ").append(toIndentedString(anchorTitle)).append("\n");
    sb.append("    authorTaskName: ").append(toIndentedString(authorTaskName)).append("\n");
    sb.append("    demandDesc: ").append(toIndentedString(demandDesc)).append("\n");
    sb.append("    omTaskTag: ").append(toIndentedString(omTaskTag)).append("\n");
    sb.append("    sampleVideo: ").append(toIndentedString(sampleVideo)).append("\n");
    sb.append("    startPage: ").append(toIndentedString(startPage)).append("\n");
    sb.append("    taskHeadImage: ").append(toIndentedString(taskHeadImage)).append("\n");
    sb.append("    taskIcon: ").append(toIndentedString(taskIcon)).append("\n");
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
    openapiFields.add("anchor_title");
    openapiFields.add("author_task_name");
    openapiFields.add("demand_desc");
    openapiFields.add("om_task_tag");
    openapiFields.add("sample_video");
    openapiFields.add("start_page");
    openapiFields.add("task_head_image");
    openapiFields.add("task_icon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmUpdateChallengeV2RequestChallengeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmUpdateChallengeV2RequestChallengeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmUpdateChallengeV2RequestChallengeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmUpdateChallengeV2RequestChallengeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmUpdateChallengeV2RequestChallengeInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandOmUpdateChallengeV2RequestChallengeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmUpdateChallengeV2RequestChallengeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmUpdateChallengeV2RequestChallengeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmUpdateChallengeV2RequestChallengeInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmUpdateChallengeV2RequestChallengeInfo
  */
  public static StarDemandOmUpdateChallengeV2RequestChallengeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmUpdateChallengeV2RequestChallengeInfo.class);
  }

 /**
  * Convert an instance of StarDemandOmUpdateChallengeV2RequestChallengeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

