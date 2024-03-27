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
import com.bytedance.ads.model.CarouselAdGetV2ResponseDataCarouselsInnerImagesInnerImageSubject;
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
 * CarouselAdGetV2ResponseDataCarouselsInnerImagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class CarouselAdGetV2ResponseDataCarouselsInnerImagesInner {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_IMAGE_SUBJECT = "image_subject";
  @SerializedName(SERIALIZED_NAME_IMAGE_SUBJECT)
  private CarouselAdGetV2ResponseDataCarouselsInnerImagesInnerImageSubject imageSubject = null;

  public static final String SERIALIZED_NAME_RATIO = "ratio";
  @SerializedName(SERIALIZED_NAME_RATIO)
  private Double ratio = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private Object url = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public CarouselAdGetV2ResponseDataCarouselsInnerImagesInner() {
  }

  public CarouselAdGetV2ResponseDataCarouselsInnerImagesInner height(Long height) {
    
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


  public CarouselAdGetV2ResponseDataCarouselsInnerImagesInner imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public CarouselAdGetV2ResponseDataCarouselsInnerImagesInner imageSubject(CarouselAdGetV2ResponseDataCarouselsInnerImagesInnerImageSubject imageSubject) {
    
    this.imageSubject = imageSubject;
    return this;
  }

   /**
   * Get imageSubject
   * @return imageSubject
  **/
  @javax.annotation.Nullable
  public CarouselAdGetV2ResponseDataCarouselsInnerImagesInnerImageSubject getImageSubject() {
    return imageSubject;
  }


  public void setImageSubject(CarouselAdGetV2ResponseDataCarouselsInnerImagesInnerImageSubject imageSubject) {
    this.imageSubject = imageSubject;
  }


  public CarouselAdGetV2ResponseDataCarouselsInnerImagesInner ratio(Double ratio) {
    
    this.ratio = ratio;
    return this;
  }

   /**
   * 
   * @return ratio
  **/
  @javax.annotation.Nullable
  public Double getRatio() {
    return ratio;
  }


  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }


  public CarouselAdGetV2ResponseDataCarouselsInnerImagesInner size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * 
   * @return size
  **/
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public CarouselAdGetV2ResponseDataCarouselsInnerImagesInner url(Object url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public Object getUrl() {
    return url;
  }


  public void setUrl(Object url) {
    this.url = url;
  }


  public CarouselAdGetV2ResponseDataCarouselsInnerImagesInner width(Long width) {
    
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
    CarouselAdGetV2ResponseDataCarouselsInnerImagesInner carouselAdGetV2ResponseDataCarouselsInnerImagesInner = (CarouselAdGetV2ResponseDataCarouselsInnerImagesInner) o;
    return Objects.equals(this.height, carouselAdGetV2ResponseDataCarouselsInnerImagesInner.height) &&
        Objects.equals(this.imageId, carouselAdGetV2ResponseDataCarouselsInnerImagesInner.imageId) &&
        Objects.equals(this.imageSubject, carouselAdGetV2ResponseDataCarouselsInnerImagesInner.imageSubject) &&
        Objects.equals(this.ratio, carouselAdGetV2ResponseDataCarouselsInnerImagesInner.ratio) &&
        Objects.equals(this.size, carouselAdGetV2ResponseDataCarouselsInnerImagesInner.size) &&
        Objects.equals(this.url, carouselAdGetV2ResponseDataCarouselsInnerImagesInner.url) &&
        Objects.equals(this.width, carouselAdGetV2ResponseDataCarouselsInnerImagesInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, imageId, imageSubject, ratio, size, url, width);
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
    sb.append("class CarouselAdGetV2ResponseDataCarouselsInnerImagesInner {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageSubject: ").append(toIndentedString(imageSubject)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("image_id");
    openapiFields.add("image_subject");
    openapiFields.add("ratio");
    openapiFields.add("size");
    openapiFields.add("url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselAdGetV2ResponseDataCarouselsInnerImagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselAdGetV2ResponseDataCarouselsInnerImagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselAdGetV2ResponseDataCarouselsInnerImagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselAdGetV2ResponseDataCarouselsInnerImagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselAdGetV2ResponseDataCarouselsInnerImagesInner>() {
           @Override
           public void write(JsonWriter out, CarouselAdGetV2ResponseDataCarouselsInnerImagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselAdGetV2ResponseDataCarouselsInnerImagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselAdGetV2ResponseDataCarouselsInnerImagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselAdGetV2ResponseDataCarouselsInnerImagesInner
  * @throws IOException if the JSON string is invalid with respect to CarouselAdGetV2ResponseDataCarouselsInnerImagesInner
  */
  public static CarouselAdGetV2ResponseDataCarouselsInnerImagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselAdGetV2ResponseDataCarouselsInnerImagesInner.class);
  }

 /**
  * Convert an instance of CarouselAdGetV2ResponseDataCarouselsInnerImagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

