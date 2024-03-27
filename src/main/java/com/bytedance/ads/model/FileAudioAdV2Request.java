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
import com.bytedance.ads.model.FileAudioAdV2UploadType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
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
 * FileAudioAdV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class FileAudioAdV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIO_FILE = "audio_file";
  @SerializedName(SERIALIZED_NAME_AUDIO_FILE)
  private File audioFile = null;

  public static final String SERIALIZED_NAME_AUDIO_SIGNATURE = "audio_signature";
  @SerializedName(SERIALIZED_NAME_AUDIO_SIGNATURE)
  private String audioSignature = null;

  public static final String SERIALIZED_NAME_AUDIO_URL = "audio_url";
  @SerializedName(SERIALIZED_NAME_AUDIO_URL)
  private String audioUrl = null;

  public static final String SERIALIZED_NAME_UPLOAD_TYPE = "upload_type";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TYPE)
  private FileAudioAdV2UploadType uploadType = null;

  public FileAudioAdV2Request() {
  }

  public FileAudioAdV2Request advertiserId(Long advertiserId) {
    
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


  public FileAudioAdV2Request audioFile(File audioFile) {
    
    this.audioFile = audioFile;
    return this;
  }

   /**
   * 
   * @return audioFile
  **/
  @javax.annotation.Nullable
  public File getAudioFile() {
    return audioFile;
  }


  public void setAudioFile(File audioFile) {
    this.audioFile = audioFile;
  }


  public FileAudioAdV2Request audioSignature(String audioSignature) {
    
    this.audioSignature = audioSignature;
    return this;
  }

   /**
   * 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE
   * @return audioSignature
  **/
  @javax.annotation.Nullable
  public String getAudioSignature() {
    return audioSignature;
  }


  public void setAudioSignature(String audioSignature) {
    this.audioSignature = audioSignature;
  }


  public FileAudioAdV2Request audioUrl(String audioUrl) {
    
    this.audioUrl = audioUrl;
    return this;
  }

   /**
   * 
   * @return audioUrl
  **/
  @javax.annotation.Nullable
  public String getAudioUrl() {
    return audioUrl;
  }


  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }


  public FileAudioAdV2Request uploadType(FileAudioAdV2UploadType uploadType) {
    
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Get uploadType
   * @return uploadType
  **/
  @javax.annotation.Nonnull
  public FileAudioAdV2UploadType getUploadType() {
    return uploadType;
  }


  public void setUploadType(FileAudioAdV2UploadType uploadType) {
    this.uploadType = uploadType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileAudioAdV2Request fileAudioAdV2Request = (FileAudioAdV2Request) o;
    return Objects.equals(this.advertiserId, fileAudioAdV2Request.advertiserId) &&
        Objects.equals(this.audioFile, fileAudioAdV2Request.audioFile) &&
        Objects.equals(this.audioSignature, fileAudioAdV2Request.audioSignature) &&
        Objects.equals(this.audioUrl, fileAudioAdV2Request.audioUrl) &&
        Objects.equals(this.uploadType, fileAudioAdV2Request.uploadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, audioFile, audioSignature, audioUrl, uploadType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileAudioAdV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audioFile: ").append(toIndentedString(audioFile)).append("\n");
    sb.append("    audioSignature: ").append(toIndentedString(audioSignature)).append("\n");
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
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
    openapiFields.add("audio_file");
    openapiFields.add("audio_signature");
    openapiFields.add("audio_url");
    openapiFields.add("upload_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("upload_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileAudioAdV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileAudioAdV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileAudioAdV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileAudioAdV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileAudioAdV2Request>() {
           @Override
           public void write(JsonWriter out, FileAudioAdV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileAudioAdV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileAudioAdV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileAudioAdV2Request
  * @throws IOException if the JSON string is invalid with respect to FileAudioAdV2Request
  */
  public static FileAudioAdV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileAudioAdV2Request.class);
  }

 /**
  * Convert an instance of FileAudioAdV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

