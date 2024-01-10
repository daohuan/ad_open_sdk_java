/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanCarouselGetV10DataCarouselsImageMode;
import com.bytedance.ads.model.QianchuanCarouselGetV10ResponseDataCarouselsInnerAudio;
import com.bytedance.ads.model.QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner;
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
 * QianchuanCarouselGetV10ResponseDataCarouselsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class QianchuanCarouselGetV10ResponseDataCarouselsInner {
  public static final String SERIALIZED_NAME_AUDIO = "audio";
  @SerializedName(SERIALIZED_NAME_AUDIO)
  private QianchuanCarouselGetV10ResponseDataCarouselsInnerAudio audio = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanCarouselGetV10DataCarouselsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner> images = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public QianchuanCarouselGetV10ResponseDataCarouselsInner() {
  }

  public QianchuanCarouselGetV10ResponseDataCarouselsInner audio(QianchuanCarouselGetV10ResponseDataCarouselsInnerAudio audio) {
    
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @javax.annotation.Nullable
  public QianchuanCarouselGetV10ResponseDataCarouselsInnerAudio getAudio() {
    return audio;
  }


  public void setAudio(QianchuanCarouselGetV10ResponseDataCarouselsInnerAudio audio) {
    this.audio = audio;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInner createTime(String createTime) {
    
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


  public QianchuanCarouselGetV10ResponseDataCarouselsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInner filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * 
   * @return filename
  **/
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInner imageMode(QianchuanCarouselGetV10DataCarouselsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanCarouselGetV10DataCarouselsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanCarouselGetV10DataCarouselsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInner images(List<QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public QianchuanCarouselGetV10ResponseDataCarouselsInner addImagesItem(QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * 
   * @return images
  **/
  @javax.annotation.Nullable
  public List<QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner> getImages() {
    return images;
  }


  public void setImages(List<QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner> images) {
    this.images = images;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCarouselGetV10ResponseDataCarouselsInner qianchuanCarouselGetV10ResponseDataCarouselsInner = (QianchuanCarouselGetV10ResponseDataCarouselsInner) o;
    return Objects.equals(this.audio, qianchuanCarouselGetV10ResponseDataCarouselsInner.audio) &&
        Objects.equals(this.createTime, qianchuanCarouselGetV10ResponseDataCarouselsInner.createTime) &&
        Objects.equals(this.description, qianchuanCarouselGetV10ResponseDataCarouselsInner.description) &&
        Objects.equals(this.filename, qianchuanCarouselGetV10ResponseDataCarouselsInner.filename) &&
        Objects.equals(this.imageMode, qianchuanCarouselGetV10ResponseDataCarouselsInner.imageMode) &&
        Objects.equals(this.images, qianchuanCarouselGetV10ResponseDataCarouselsInner.images) &&
        Objects.equals(this.materialId, qianchuanCarouselGetV10ResponseDataCarouselsInner.materialId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, createTime, description, filename, imageMode, images, materialId);
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
    sb.append("class QianchuanCarouselGetV10ResponseDataCarouselsInner {\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("audio");
    openapiFields.add("create_time");
    openapiFields.add("description");
    openapiFields.add("filename");
    openapiFields.add("image_mode");
    openapiFields.add("images");
    openapiFields.add("material_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCarouselGetV10ResponseDataCarouselsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCarouselGetV10ResponseDataCarouselsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCarouselGetV10ResponseDataCarouselsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCarouselGetV10ResponseDataCarouselsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCarouselGetV10ResponseDataCarouselsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanCarouselGetV10ResponseDataCarouselsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCarouselGetV10ResponseDataCarouselsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCarouselGetV10ResponseDataCarouselsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCarouselGetV10ResponseDataCarouselsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanCarouselGetV10ResponseDataCarouselsInner
  */
  public static QianchuanCarouselGetV10ResponseDataCarouselsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCarouselGetV10ResponseDataCarouselsInner.class);
  }

 /**
  * Convert an instance of QianchuanCarouselGetV10ResponseDataCarouselsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

