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
 * ToolsSiteCopyV2ResponseDataSuccessListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class ToolsSiteCopyV2ResponseDataSuccessListInner {
  public static final String SERIALIZED_NAME_ORIGIN_SITE_ID = "origin_site_id";
  @SerializedName(SERIALIZED_NAME_ORIGIN_SITE_ID)
  private String originSiteId = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId = null;

  public ToolsSiteCopyV2ResponseDataSuccessListInner() {
  }

  public ToolsSiteCopyV2ResponseDataSuccessListInner originSiteId(String originSiteId) {
    
    this.originSiteId = originSiteId;
    return this;
  }

   /**
   * 返回复制成功的原站点id
   * @return originSiteId
  **/
  @javax.annotation.Nullable
  public String getOriginSiteId() {
    return originSiteId;
  }


  public void setOriginSiteId(String originSiteId) {
    this.originSiteId = originSiteId;
  }


  public ToolsSiteCopyV2ResponseDataSuccessListInner siteId(String siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 返回复制成功后生成的新站点id
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteCopyV2ResponseDataSuccessListInner toolsSiteCopyV2ResponseDataSuccessListInner = (ToolsSiteCopyV2ResponseDataSuccessListInner) o;
    return Objects.equals(this.originSiteId, toolsSiteCopyV2ResponseDataSuccessListInner.originSiteId) &&
        Objects.equals(this.siteId, toolsSiteCopyV2ResponseDataSuccessListInner.siteId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(originSiteId, siteId);
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
    sb.append("class ToolsSiteCopyV2ResponseDataSuccessListInner {\n");
    sb.append("    originSiteId: ").append(toIndentedString(originSiteId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
    openapiFields.add("origin_site_id");
    openapiFields.add("site_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteCopyV2ResponseDataSuccessListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteCopyV2ResponseDataSuccessListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteCopyV2ResponseDataSuccessListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteCopyV2ResponseDataSuccessListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteCopyV2ResponseDataSuccessListInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteCopyV2ResponseDataSuccessListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteCopyV2ResponseDataSuccessListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteCopyV2ResponseDataSuccessListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteCopyV2ResponseDataSuccessListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteCopyV2ResponseDataSuccessListInner
  */
  public static ToolsSiteCopyV2ResponseDataSuccessListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteCopyV2ResponseDataSuccessListInner.class);
  }

 /**
  * Convert an instance of ToolsSiteCopyV2ResponseDataSuccessListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

