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
import com.bytedance.ads.model.ToolsCommentGetV30ResponseDataCommentListInner;
import com.bytedance.ads.model.ToolsCommentGetV30ResponseDataPageInfo;
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
public class ToolsCommentGetV30ResponseData {
  public static final String SERIALIZED_NAME_COMMENT_LIST = "comment_list";
  @SerializedName(SERIALIZED_NAME_COMMENT_LIST)
  private List<ToolsCommentGetV30ResponseDataCommentListInner> commentList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolsCommentGetV30ResponseDataPageInfo pageInfo = null;

  public ToolsCommentGetV30ResponseData() {
  }

  public ToolsCommentGetV30ResponseData commentList(List<ToolsCommentGetV30ResponseDataCommentListInner> commentList) {
    
    this.commentList = commentList;
    return this;
  }

  public ToolsCommentGetV30ResponseData addCommentListItem(ToolsCommentGetV30ResponseDataCommentListInner commentListItem) {
    if (this.commentList == null) {
      this.commentList = new ArrayList<>();
    }
    this.commentList.add(commentListItem);
    return this;
  }

   /**
   * 评论列表
   * @return commentList
  **/
  @javax.annotation.Nullable
  public List<ToolsCommentGetV30ResponseDataCommentListInner> getCommentList() {
    return commentList;
  }


  public void setCommentList(List<ToolsCommentGetV30ResponseDataCommentListInner> commentList) {
    this.commentList = commentList;
  }


  public ToolsCommentGetV30ResponseData pageInfo(ToolsCommentGetV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolsCommentGetV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolsCommentGetV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentGetV30ResponseData toolsCommentGetV30ResponseData = (ToolsCommentGetV30ResponseData) o;
    return Objects.equals(this.commentList, toolsCommentGetV30ResponseData.commentList) &&
        Objects.equals(this.pageInfo, toolsCommentGetV30ResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentList, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentGetV30ResponseData {\n");
    sb.append("    commentList: ").append(toIndentedString(commentList)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("comment_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comment_list");
    openapiRequiredFields.add("page_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsCommentGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentGetV30ResponseData
  */
  public static ToolsCommentGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsCommentGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

