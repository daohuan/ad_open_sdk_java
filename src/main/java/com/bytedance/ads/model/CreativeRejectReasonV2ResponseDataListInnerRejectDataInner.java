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
 * CreativeRejectReasonV2ResponseDataListInnerRejectDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class CreativeRejectReasonV2ResponseDataListInnerRejectDataInner {
  public static final String SERIALIZED_NAME_REJECT_ITEM = "reject_item";
  @SerializedName(SERIALIZED_NAME_REJECT_ITEM)
  private String rejectItem = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public CreativeRejectReasonV2ResponseDataListInnerRejectDataInner() {
  }

  public CreativeRejectReasonV2ResponseDataListInnerRejectDataInner rejectItem(String rejectItem) {
    
    this.rejectItem = rejectItem;
    return this;
  }

   /**
   * 
   * @return rejectItem
  **/
  @javax.annotation.Nullable
  public String getRejectItem() {
    return rejectItem;
  }


  public void setRejectItem(String rejectItem) {
    this.rejectItem = rejectItem;
  }


  public CreativeRejectReasonV2ResponseDataListInnerRejectDataInner rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeRejectReasonV2ResponseDataListInnerRejectDataInner creativeRejectReasonV2ResponseDataListInnerRejectDataInner = (CreativeRejectReasonV2ResponseDataListInnerRejectDataInner) o;
    return Objects.equals(this.rejectItem, creativeRejectReasonV2ResponseDataListInnerRejectDataInner.rejectItem) &&
        Objects.equals(this.rejectReason, creativeRejectReasonV2ResponseDataListInnerRejectDataInner.rejectReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectItem, rejectReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeRejectReasonV2ResponseDataListInnerRejectDataInner {\n");
    sb.append("    rejectItem: ").append(toIndentedString(rejectItem)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
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
    openapiFields.add("reject_item");
    openapiFields.add("reject_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeRejectReasonV2ResponseDataListInnerRejectDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeRejectReasonV2ResponseDataListInnerRejectDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeRejectReasonV2ResponseDataListInnerRejectDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeRejectReasonV2ResponseDataListInnerRejectDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeRejectReasonV2ResponseDataListInnerRejectDataInner>() {
           @Override
           public void write(JsonWriter out, CreativeRejectReasonV2ResponseDataListInnerRejectDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeRejectReasonV2ResponseDataListInnerRejectDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeRejectReasonV2ResponseDataListInnerRejectDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeRejectReasonV2ResponseDataListInnerRejectDataInner
  * @throws IOException if the JSON string is invalid with respect to CreativeRejectReasonV2ResponseDataListInnerRejectDataInner
  */
  public static CreativeRejectReasonV2ResponseDataListInnerRejectDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeRejectReasonV2ResponseDataListInnerRejectDataInner.class);
  }

 /**
  * Convert an instance of CreativeRejectReasonV2ResponseDataListInnerRejectDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

