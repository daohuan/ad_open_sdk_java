/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
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
 * AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner {
  public static final String SERIALIZED_NAME_FAILED_REASON = "failed_reason";
  @SerializedName(SERIALIZED_NAME_FAILED_REASON)
  private String failedReason = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner() {
  }

  public AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner failedReason(String failedReason) {
    
    this.failedReason = failedReason;
    return this;
  }

   /**
   * 错误信息
   * @return failedReason
  **/
  @javax.annotation.Nullable
  public String getFailedReason() {
    return failedReason;
  }


  public void setFailedReason(String failedReason) {
    this.failedReason = failedReason;
  }


  public AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 项目id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner adlabGroupUpdateStatusV30ResponseDataDataErrorsInner = (AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner) o;
    return Objects.equals(this.failedReason, adlabGroupUpdateStatusV30ResponseDataDataErrorsInner.failedReason) &&
        Objects.equals(this.id, adlabGroupUpdateStatusV30ResponseDataDataErrorsInner.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedReason, id);
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
    sb.append("class AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner {\n");
    sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("failed_reason");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner
  */
  public static AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateStatusV30ResponseDataDataErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

