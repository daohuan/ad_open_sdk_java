/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionUpdateV30PromotionMaterialsAnchorMaterialListAnchorType;
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
 * PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner {
  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private PromotionUpdateV30PromotionMaterialsAnchorMaterialListAnchorType anchorType = null;

  public PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner() {
  }

  public PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner anchorType(PromotionUpdateV30PromotionMaterialsAnchorMaterialListAnchorType anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

   /**
   * Get anchorType
   * @return anchorType
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30PromotionMaterialsAnchorMaterialListAnchorType getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(PromotionUpdateV30PromotionMaterialsAnchorMaterialListAnchorType anchorType) {
    this.anchorType = anchorType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner promotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner = (PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner) o;
    return Objects.equals(this.anchorId, promotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner.anchorId) &&
        Objects.equals(this.anchorType, promotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner.anchorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorId, anchorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner {\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
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
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner
  */
  public static PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

