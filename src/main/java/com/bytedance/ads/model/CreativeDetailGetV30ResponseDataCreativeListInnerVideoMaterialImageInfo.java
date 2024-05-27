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
 * 视频封面图片
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo {
  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo() {
  }

  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 图片ID
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo creativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo = (CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo) o;
    return Objects.equals(this.imageId, creativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo.imageId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo {\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo
  */
  public static CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

