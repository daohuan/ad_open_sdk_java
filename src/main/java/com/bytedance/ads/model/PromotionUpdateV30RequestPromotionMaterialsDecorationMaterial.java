/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionUpdateV30PromotionMaterialsDecorationMaterialImageMode;
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
 * 家装卡券素材
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-16T14:13:31.063+08:00[Asia/Shanghai]")
public class PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private PromotionUpdateV30PromotionMaterialsDecorationMaterialImageMode imageMode = null;

  public PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial() {
  }

  public PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 卡券活动ID
   * @return activityId
  **/
  @javax.annotation.Nullable
  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial imageMode(PromotionUpdateV30PromotionMaterialsDecorationMaterialImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30PromotionMaterialsDecorationMaterialImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(PromotionUpdateV30PromotionMaterialsDecorationMaterialImageMode imageMode) {
    this.imageMode = imageMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial promotionUpdateV30RequestPromotionMaterialsDecorationMaterial = (PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial) o;
    return Objects.equals(this.activityId, promotionUpdateV30RequestPromotionMaterialsDecorationMaterial.activityId) &&
        Objects.equals(this.imageMode, promotionUpdateV30RequestPromotionMaterialsDecorationMaterial.imageMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, imageMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("image_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial
  */
  public static PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

