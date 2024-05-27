/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2CreativeImageMaterialsImageMode;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerImageInfoInner;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage;
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
 * CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner {
  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private List<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerImageInfoInner> imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeProceduralCreativeUpdateV2CreativeImageMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_IMAGE = "template_image";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IMAGE)
  private CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage templateImage = null;

  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner() {
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner imageInfo(List<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerImageInfoInner> imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner addImageInfoItem(CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerImageInfoInner imageInfoItem) {
    if (this.imageInfo == null) {
      this.imageInfo = new ArrayList<>();
    }
    this.imageInfo.add(imageInfoItem);
    return this;
  }

   /**
   * 
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerImageInfoInner> getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(List<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerImageInfoInner> imageInfo) {
    this.imageInfo = imageInfo;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner imageMode(CreativeProceduralCreativeUpdateV2CreativeImageMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeUpdateV2CreativeImageMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeProceduralCreativeUpdateV2CreativeImageMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner templateImage(CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage templateImage) {
    
    this.templateImage = templateImage;
    return this;
  }

   /**
   * Get templateImage
   * @return templateImage
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage getTemplateImage() {
    return templateImage;
  }


  public void setTemplateImage(CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage templateImage) {
    this.templateImage = templateImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner creativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner = (CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner) o;
    return Objects.equals(this.imageInfo, creativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, creativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner.imageMode) &&
        Objects.equals(this.materialId, creativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner.materialId) &&
        Objects.equals(this.templateImage, creativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner.templateImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfo, imageMode, materialId, templateImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner {\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    templateImage: ").append(toIndentedString(templateImage)).append("\n");
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
    openapiFields.add("image_info");
    openapiFields.add("image_mode");
    openapiFields.add("material_id");
    openapiFields.add("template_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner
  */
  public static CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

