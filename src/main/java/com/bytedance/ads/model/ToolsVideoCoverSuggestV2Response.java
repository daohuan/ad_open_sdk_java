/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsVideoCoverSuggestV2ResponseData;
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
 * ToolsVideoCoverSuggestV2Response
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T19:34:37.792107567+08:00[PRC]")
public class ToolsVideoCoverSuggestV2Response {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ToolsVideoCoverSuggestV2ResponseData data = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId = null;

  public ToolsVideoCoverSuggestV2Response() {
  }

  public ToolsVideoCoverSuggestV2Response code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @javax.annotation.Nullable
  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public ToolsVideoCoverSuggestV2Response data(ToolsVideoCoverSuggestV2ResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public ToolsVideoCoverSuggestV2ResponseData getData() {
    return data;
  }


  public void setData(ToolsVideoCoverSuggestV2ResponseData data) {
    this.data = data;
  }


  public ToolsVideoCoverSuggestV2Response message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ToolsVideoCoverSuggestV2Response requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * 
   * @return requestId
  **/
  @javax.annotation.Nullable
  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsVideoCoverSuggestV2Response toolsVideoCoverSuggestV2Response = (ToolsVideoCoverSuggestV2Response) o;
    return Objects.equals(this.code, toolsVideoCoverSuggestV2Response.code) &&
        Objects.equals(this.data, toolsVideoCoverSuggestV2Response.data) &&
        Objects.equals(this.message, toolsVideoCoverSuggestV2Response.message) &&
        Objects.equals(this.requestId, toolsVideoCoverSuggestV2Response.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, message, requestId);
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
    sb.append("class ToolsVideoCoverSuggestV2Response {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("data");
    openapiFields.add("message");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsVideoCoverSuggestV2Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsVideoCoverSuggestV2Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsVideoCoverSuggestV2Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsVideoCoverSuggestV2Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsVideoCoverSuggestV2Response>() {
           @Override
           public void write(JsonWriter out, ToolsVideoCoverSuggestV2Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsVideoCoverSuggestV2Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsVideoCoverSuggestV2Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsVideoCoverSuggestV2Response
  * @throws IOException if the JSON string is invalid with respect to ToolsVideoCoverSuggestV2Response
  */
  public static ToolsVideoCoverSuggestV2Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsVideoCoverSuggestV2Response.class);
  }

 /**
  * Convert an instance of ToolsVideoCoverSuggestV2Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

