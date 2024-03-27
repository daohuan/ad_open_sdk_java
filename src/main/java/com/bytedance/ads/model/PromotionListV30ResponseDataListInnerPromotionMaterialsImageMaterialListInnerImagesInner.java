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
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialOptStatus;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus;
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
 * PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner {
  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_OPT_STATUS = "material_opt_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_OPT_STATUS)
  private PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialOptStatus materialOptStatus = null;

  public static final String SERIALIZED_NAME_MATERIAL_STATUS = "material_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_STATUS)
  private PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus materialStatus = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId = null;

  public PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner() {
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner imageId(String imageId) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner materialId(Long materialId) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner materialOptStatus(PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialOptStatus materialOptStatus) {
    
    this.materialOptStatus = materialOptStatus;
    return this;
  }

   /**
   * Get materialOptStatus
   * @return materialOptStatus
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialOptStatus getMaterialOptStatus() {
    return materialOptStatus;
  }


  public void setMaterialOptStatus(PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialOptStatus materialOptStatus) {
    this.materialOptStatus = materialOptStatus;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner materialStatus(PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus materialStatus) {
    
    this.materialStatus = materialStatus;
    return this;
  }

   /**
   * Get materialStatus
   * @return materialStatus
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus getMaterialStatus() {
    return materialStatus;
  }


  public void setMaterialStatus(PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus materialStatus) {
    this.materialStatus = materialStatus;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Long getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner promotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner = (PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner) o;
    return Objects.equals(this.imageId, promotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner.imageId) &&
        Objects.equals(this.materialId, promotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner.materialId) &&
        Objects.equals(this.materialOptStatus, promotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner.materialOptStatus) &&
        Objects.equals(this.materialStatus, promotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner.materialStatus) &&
        Objects.equals(this.templateId, promotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner.templateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, materialId, materialOptStatus, materialStatus, templateId);
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
    sb.append("class PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner {\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialOptStatus: ").append(toIndentedString(materialOptStatus)).append("\n");
    sb.append("    materialStatus: ").append(toIndentedString(materialStatus)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("image_id");
    openapiFields.add("material_id");
    openapiFields.add("material_opt_status");
    openapiFields.add("material_status");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner
  */
  public static PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInnerImagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

