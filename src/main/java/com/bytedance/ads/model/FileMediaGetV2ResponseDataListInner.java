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
 * FileMediaGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class FileMediaGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ITEM_SOURCE = "item_source";
  @SerializedName(SERIALIZED_NAME_ITEM_SOURCE)
  private String itemSource = null;

  public static final String SERIALIZED_NAME_POSTER_URL = "poster_url";
  @SerializedName(SERIALIZED_NAME_POSTER_URL)
  private String posterUrl = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public FileMediaGetV2ResponseDataListInner() {
  }

  public FileMediaGetV2ResponseDataListInner createTime(String createTime) {
    
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


  public FileMediaGetV2ResponseDataListInner height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public FileMediaGetV2ResponseDataListInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FileMediaGetV2ResponseDataListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public FileMediaGetV2ResponseDataListInner itemSource(String itemSource) {
    
    this.itemSource = itemSource;
    return this;
  }

   /**
   * 
   * @return itemSource
  **/
  @javax.annotation.Nullable
  public String getItemSource() {
    return itemSource;
  }


  public void setItemSource(String itemSource) {
    this.itemSource = itemSource;
  }


  public FileMediaGetV2ResponseDataListInner posterUrl(String posterUrl) {
    
    this.posterUrl = posterUrl;
    return this;
  }

   /**
   * 
   * @return posterUrl
  **/
  @javax.annotation.Nullable
  public String getPosterUrl() {
    return posterUrl;
  }


  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }


  public FileMediaGetV2ResponseDataListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public FileMediaGetV2ResponseDataListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public FileMediaGetV2ResponseDataListInner width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMediaGetV2ResponseDataListInner fileMediaGetV2ResponseDataListInner = (FileMediaGetV2ResponseDataListInner) o;
    return Objects.equals(this.createTime, fileMediaGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.height, fileMediaGetV2ResponseDataListInner.height) &&
        Objects.equals(this.id, fileMediaGetV2ResponseDataListInner.id) &&
        Objects.equals(this.itemId, fileMediaGetV2ResponseDataListInner.itemId) &&
        Objects.equals(this.itemSource, fileMediaGetV2ResponseDataListInner.itemSource) &&
        Objects.equals(this.posterUrl, fileMediaGetV2ResponseDataListInner.posterUrl) &&
        Objects.equals(this.title, fileMediaGetV2ResponseDataListInner.title) &&
        Objects.equals(this.url, fileMediaGetV2ResponseDataListInner.url) &&
        Objects.equals(this.width, fileMediaGetV2ResponseDataListInner.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, height, id, itemId, itemSource, posterUrl, title, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMediaGetV2ResponseDataListInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemSource: ").append(toIndentedString(itemSource)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("height");
    openapiFields.add("id");
    openapiFields.add("item_id");
    openapiFields.add("item_source");
    openapiFields.add("poster_url");
    openapiFields.add("title");
    openapiFields.add("url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMediaGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMediaGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMediaGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMediaGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMediaGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, FileMediaGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMediaGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMediaGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMediaGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to FileMediaGetV2ResponseDataListInner
  */
  public static FileMediaGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMediaGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of FileMediaGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

