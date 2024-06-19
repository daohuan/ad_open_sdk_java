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
 * ToolsClueLiteContactRecordV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class ToolsClueLiteContactRecordV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private String contactId = null;

  public static final String SERIALIZED_NAME_CONTACT_URL = "contact_url";
  @SerializedName(SERIALIZED_NAME_CONTACT_URL)
  private String contactUrl = null;

  public ToolsClueLiteContactRecordV2ResponseDataListInner() {
  }

  public ToolsClueLiteContactRecordV2ResponseDataListInner contactId(String contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * 
   * @return contactId
  **/
  @javax.annotation.Nullable
  public String getContactId() {
    return contactId;
  }


  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  public ToolsClueLiteContactRecordV2ResponseDataListInner contactUrl(String contactUrl) {
    
    this.contactUrl = contactUrl;
    return this;
  }

   /**
   * 
   * @return contactUrl
  **/
  @javax.annotation.Nullable
  public String getContactUrl() {
    return contactUrl;
  }


  public void setContactUrl(String contactUrl) {
    this.contactUrl = contactUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueLiteContactRecordV2ResponseDataListInner toolsClueLiteContactRecordV2ResponseDataListInner = (ToolsClueLiteContactRecordV2ResponseDataListInner) o;
    return Objects.equals(this.contactId, toolsClueLiteContactRecordV2ResponseDataListInner.contactId) &&
        Objects.equals(this.contactUrl, toolsClueLiteContactRecordV2ResponseDataListInner.contactUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactUrl);
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
    sb.append("class ToolsClueLiteContactRecordV2ResponseDataListInner {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactUrl: ").append(toIndentedString(contactUrl)).append("\n");
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
    openapiFields.add("contact_id");
    openapiFields.add("contact_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueLiteContactRecordV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueLiteContactRecordV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueLiteContactRecordV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueLiteContactRecordV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueLiteContactRecordV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueLiteContactRecordV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueLiteContactRecordV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueLiteContactRecordV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueLiteContactRecordV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueLiteContactRecordV2ResponseDataListInner
  */
  public static ToolsClueLiteContactRecordV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueLiteContactRecordV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsClueLiteContactRecordV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

