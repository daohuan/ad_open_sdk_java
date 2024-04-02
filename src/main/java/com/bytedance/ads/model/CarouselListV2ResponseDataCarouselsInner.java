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
import com.bytedance.ads.model.CarouselListV2DataCarouselsCarouselType;
import com.bytedance.ads.model.CarouselListV2ResponseDataCarouselsInnerAudio;
import com.bytedance.ads.model.CarouselListV2ResponseDataCarouselsInnerImagesInner;
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
 * CarouselListV2ResponseDataCarouselsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class CarouselListV2ResponseDataCarouselsInner {
  public static final String SERIALIZED_NAME_AUDIO = "audio";
  @SerializedName(SERIALIZED_NAME_AUDIO)
  private CarouselListV2ResponseDataCarouselsInnerAudio audio = null;

  public static final String SERIALIZED_NAME_CAROUSEL_TYPE = "carousel_type";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_TYPE)
  private CarouselListV2DataCarouselsCarouselType carouselType = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<CarouselListV2ResponseDataCarouselsInnerImagesInner> images = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public CarouselListV2ResponseDataCarouselsInner() {
  }

  public CarouselListV2ResponseDataCarouselsInner audio(CarouselListV2ResponseDataCarouselsInnerAudio audio) {
    
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @javax.annotation.Nullable
  public CarouselListV2ResponseDataCarouselsInnerAudio getAudio() {
    return audio;
  }


  public void setAudio(CarouselListV2ResponseDataCarouselsInnerAudio audio) {
    this.audio = audio;
  }


  public CarouselListV2ResponseDataCarouselsInner carouselType(CarouselListV2DataCarouselsCarouselType carouselType) {
    
    this.carouselType = carouselType;
    return this;
  }

   /**
   * Get carouselType
   * @return carouselType
  **/
  @javax.annotation.Nullable
  public CarouselListV2DataCarouselsCarouselType getCarouselType() {
    return carouselType;
  }


  public void setCarouselType(CarouselListV2DataCarouselsCarouselType carouselType) {
    this.carouselType = carouselType;
  }


  public CarouselListV2ResponseDataCarouselsInner createTime(String createTime) {
    
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


  public CarouselListV2ResponseDataCarouselsInner fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public CarouselListV2ResponseDataCarouselsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public CarouselListV2ResponseDataCarouselsInner images(List<CarouselListV2ResponseDataCarouselsInnerImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public CarouselListV2ResponseDataCarouselsInner addImagesItem(CarouselListV2ResponseDataCarouselsInnerImagesInner imagesItem) {
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
  public List<CarouselListV2ResponseDataCarouselsInnerImagesInner> getImages() {
    return images;
  }


  public void setImages(List<CarouselListV2ResponseDataCarouselsInnerImagesInner> images) {
    this.images = images;
  }


  public CarouselListV2ResponseDataCarouselsInner updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselListV2ResponseDataCarouselsInner carouselListV2ResponseDataCarouselsInner = (CarouselListV2ResponseDataCarouselsInner) o;
    return Objects.equals(this.audio, carouselListV2ResponseDataCarouselsInner.audio) &&
        Objects.equals(this.carouselType, carouselListV2ResponseDataCarouselsInner.carouselType) &&
        Objects.equals(this.createTime, carouselListV2ResponseDataCarouselsInner.createTime) &&
        Objects.equals(this.fileName, carouselListV2ResponseDataCarouselsInner.fileName) &&
        Objects.equals(this.id, carouselListV2ResponseDataCarouselsInner.id) &&
        Objects.equals(this.images, carouselListV2ResponseDataCarouselsInner.images) &&
        Objects.equals(this.updateTime, carouselListV2ResponseDataCarouselsInner.updateTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, carouselType, createTime, fileName, id, images, updateTime);
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
    sb.append("class CarouselListV2ResponseDataCarouselsInner {\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    carouselType: ").append(toIndentedString(carouselType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("carousel_type");
    openapiFields.add("create_time");
    openapiFields.add("file_name");
    openapiFields.add("id");
    openapiFields.add("images");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselListV2ResponseDataCarouselsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselListV2ResponseDataCarouselsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselListV2ResponseDataCarouselsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselListV2ResponseDataCarouselsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselListV2ResponseDataCarouselsInner>() {
           @Override
           public void write(JsonWriter out, CarouselListV2ResponseDataCarouselsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselListV2ResponseDataCarouselsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselListV2ResponseDataCarouselsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselListV2ResponseDataCarouselsInner
  * @throws IOException if the JSON string is invalid with respect to CarouselListV2ResponseDataCarouselsInner
  */
  public static CarouselListV2ResponseDataCarouselsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselListV2ResponseDataCarouselsInner.class);
  }

 /**
  * Convert an instance of CarouselListV2ResponseDataCarouselsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

