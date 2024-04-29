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
 * DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private Long action = null;

  public static final String SERIALIZED_NAME_CHANGE_LOG_ID = "change_log_id";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOG_ID)
  private Long changeLogId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_FILE_PATHS = "file_paths";
  @SerializedName(SERIALIZED_NAME_FILE_PATHS)
  private List<String> filePaths = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_PUBLISHED_TIME = "published_time";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_TIME)
  private String publishedTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner() {
  }

  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner action(Long action) {
    
    this.action = action;
    return this;
  }

   /**
   * 
   * @return action
  **/
  @javax.annotation.Nullable
  public Long getAction() {
    return action;
  }


  public void setAction(Long action) {
    this.action = action;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner changeLogId(Long changeLogId) {
    
    this.changeLogId = changeLogId;
    return this;
  }

   /**
   * 
   * @return changeLogId
  **/
  @javax.annotation.Nullable
  public Long getChangeLogId() {
    return changeLogId;
  }


  public void setChangeLogId(Long changeLogId) {
    this.changeLogId = changeLogId;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner createTime(String createTime) {
    
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


  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner filePaths(List<String> filePaths) {
    
    this.filePaths = filePaths;
    return this;
  }

  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner addFilePathsItem(String filePathsItem) {
    if (this.filePaths == null) {
      this.filePaths = new ArrayList<>();
    }
    this.filePaths.add(filePathsItem);
    return this;
  }

   /**
   * 
   * @return filePaths
  **/
  @javax.annotation.Nullable
  public List<String> getFilePaths() {
    return filePaths;
  }


  public void setFilePaths(List<String> filePaths) {
    this.filePaths = filePaths;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner modifyTime(String modifyTime) {
    
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


  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner publishedTime(String publishedTime) {
    
    this.publishedTime = publishedTime;
    return this;
  }

   /**
   * 
   * @return publishedTime
  **/
  @javax.annotation.Nullable
  public String getPublishedTime() {
    return publishedTime;
  }


  public void setPublishedTime(String publishedTime) {
    this.publishedTime = publishedTime;
  }


  public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner dmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner = (DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner) o;
    return Objects.equals(this.action, dmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.action) &&
        Objects.equals(this.changeLogId, dmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.changeLogId) &&
        Objects.equals(this.createTime, dmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.createTime) &&
        Objects.equals(this.filePaths, dmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.filePaths) &&
        Objects.equals(this.message, dmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.message) &&
        Objects.equals(this.modifyTime, dmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.modifyTime) &&
        Objects.equals(this.publishedTime, dmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.publishedTime) &&
        Objects.equals(this.status, dmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, changeLogId, createTime, filePaths, message, modifyTime, publishedTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    changeLogId: ").append(toIndentedString(changeLogId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    filePaths: ").append(toIndentedString(filePaths)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    publishedTime: ").append(toIndentedString(publishedTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("change_log_id");
    openapiFields.add("create_time");
    openapiFields.add("file_paths");
    openapiFields.add("message");
    openapiFields.add("modify_time");
    openapiFields.add("published_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner>() {
           @Override
           public void write(JsonWriter out, DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner
  * @throws IOException if the JSON string is invalid with respect to DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner
  */
  public static DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner.class);
  }

 /**
  * Convert an instance of DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

