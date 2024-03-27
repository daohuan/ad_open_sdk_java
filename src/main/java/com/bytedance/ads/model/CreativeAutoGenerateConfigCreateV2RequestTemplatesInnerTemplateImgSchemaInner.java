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
 * CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner() {
  }

  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 填充内容的键
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 填充内容的值（图片类型的填充值为url）
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner creativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner = (CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner) o;
    return Objects.equals(this.key, creativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner.key) &&
        Objects.equals(this.value, creativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
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
    sb.append("class CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner>() {
           @Override
           public void write(JsonWriter out, CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner
  * @throws IOException if the JSON string is invalid with respect to CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner
  */
  public static CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner.class);
  }

 /**
  * Convert an instance of CreativeAutoGenerateConfigCreateV2RequestTemplatesInnerTemplateImgSchemaInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

