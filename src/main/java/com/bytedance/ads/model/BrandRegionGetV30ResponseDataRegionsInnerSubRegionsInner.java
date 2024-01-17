/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
 * BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner() {
  }

  public BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner id(Long id) {
    
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


  public BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner brandRegionGetV30ResponseDataRegionsInnerSubRegionsInner = (BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner) o;
    return Objects.equals(this.id, brandRegionGetV30ResponseDataRegionsInnerSubRegionsInner.id) &&
        Objects.equals(this.name, brandRegionGetV30ResponseDataRegionsInnerSubRegionsInner.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
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
    sb.append("class BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner>() {
           @Override
           public void write(JsonWriter out, BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner
  * @throws IOException if the JSON string is invalid with respect to BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner
  */
  public static BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner.class);
  }

 /**
  * Convert an instance of BrandRegionGetV30ResponseDataRegionsInnerSubRegionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
