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
 * ToolsClueSmartPhoneGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class ToolsClueSmartPhoneGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CALL_DISPLAY = "call_display";
  @SerializedName(SERIALIZED_NAME_CALL_DISPLAY)
  private Long callDisplay = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PHONE_ID = "phone_id";
  @SerializedName(SERIALIZED_NAME_PHONE_ID)
  private Long phoneId = null;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber = null;

  public ToolsClueSmartPhoneGetV2ResponseDataListInner() {
  }

  public ToolsClueSmartPhoneGetV2ResponseDataListInner callDisplay(Long callDisplay) {
    
    this.callDisplay = callDisplay;
    return this;
  }

   /**
   * 
   * @return callDisplay
  **/
  @javax.annotation.Nullable
  public Long getCallDisplay() {
    return callDisplay;
  }


  public void setCallDisplay(Long callDisplay) {
    this.callDisplay = callDisplay;
  }


  public ToolsClueSmartPhoneGetV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsClueSmartPhoneGetV2ResponseDataListInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsClueSmartPhoneGetV2ResponseDataListInner name(String name) {
    
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


  public ToolsClueSmartPhoneGetV2ResponseDataListInner phoneId(Long phoneId) {
    
    this.phoneId = phoneId;
    return this;
  }

   /**
   * 
   * @return phoneId
  **/
  @javax.annotation.Nullable
  public Long getPhoneId() {
    return phoneId;
  }


  public void setPhoneId(Long phoneId) {
    this.phoneId = phoneId;
  }


  public ToolsClueSmartPhoneGetV2ResponseDataListInner phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * 
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueSmartPhoneGetV2ResponseDataListInner toolsClueSmartPhoneGetV2ResponseDataListInner = (ToolsClueSmartPhoneGetV2ResponseDataListInner) o;
    return Objects.equals(this.callDisplay, toolsClueSmartPhoneGetV2ResponseDataListInner.callDisplay) &&
        Objects.equals(this.createTime, toolsClueSmartPhoneGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.instanceId, toolsClueSmartPhoneGetV2ResponseDataListInner.instanceId) &&
        Objects.equals(this.name, toolsClueSmartPhoneGetV2ResponseDataListInner.name) &&
        Objects.equals(this.phoneId, toolsClueSmartPhoneGetV2ResponseDataListInner.phoneId) &&
        Objects.equals(this.phoneNumber, toolsClueSmartPhoneGetV2ResponseDataListInner.phoneNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(callDisplay, createTime, instanceId, name, phoneId, phoneNumber);
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
    sb.append("class ToolsClueSmartPhoneGetV2ResponseDataListInner {\n");
    sb.append("    callDisplay: ").append(toIndentedString(callDisplay)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
    openapiFields.add("call_display");
    openapiFields.add("create_time");
    openapiFields.add("instance_id");
    openapiFields.add("name");
    openapiFields.add("phone_id");
    openapiFields.add("phone_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueSmartPhoneGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueSmartPhoneGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueSmartPhoneGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueSmartPhoneGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueSmartPhoneGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueSmartPhoneGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueSmartPhoneGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueSmartPhoneGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueSmartPhoneGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueSmartPhoneGetV2ResponseDataListInner
  */
  public static ToolsClueSmartPhoneGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueSmartPhoneGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsClueSmartPhoneGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

