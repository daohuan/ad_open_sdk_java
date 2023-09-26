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
import com.bytedance.ads.model.AgentAdvertiserCopyV2DataCopyStatus;
import com.bytedance.ads.model.AgentAdvertiserCopyV2ResponseDataItemInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class AgentAdvertiserCopyV2ResponseData {
  public static final String SERIALIZED_NAME_COPY_STATUS = "copy_status";
  @SerializedName(SERIALIZED_NAME_COPY_STATUS)
  private AgentAdvertiserCopyV2DataCopyStatus copyStatus = null;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private List<AgentAdvertiserCopyV2ResponseDataItemInner> item = null;

  public AgentAdvertiserCopyV2ResponseData() {
  }

  public AgentAdvertiserCopyV2ResponseData copyStatus(AgentAdvertiserCopyV2DataCopyStatus copyStatus) {
    
    this.copyStatus = copyStatus;
    return this;
  }

   /**
   * Get copyStatus
   * @return copyStatus
  **/
  @javax.annotation.Nullable
  public AgentAdvertiserCopyV2DataCopyStatus getCopyStatus() {
    return copyStatus;
  }


  public void setCopyStatus(AgentAdvertiserCopyV2DataCopyStatus copyStatus) {
    this.copyStatus = copyStatus;
  }


  public AgentAdvertiserCopyV2ResponseData item(List<AgentAdvertiserCopyV2ResponseDataItemInner> item) {
    
    this.item = item;
    return this;
  }

  public AgentAdvertiserCopyV2ResponseData addItemItem(AgentAdvertiserCopyV2ResponseDataItemInner itemItem) {
    if (this.item == null) {
      this.item = new ArrayList<>();
    }
    this.item.add(itemItem);
    return this;
  }

   /**
   * 复制结果，包括单个账户的失败原因
   * @return item
  **/
  @javax.annotation.Nullable
  public List<AgentAdvertiserCopyV2ResponseDataItemInner> getItem() {
    return item;
  }


  public void setItem(List<AgentAdvertiserCopyV2ResponseDataItemInner> item) {
    this.item = item;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvertiserCopyV2ResponseData agentAdvertiserCopyV2ResponseData = (AgentAdvertiserCopyV2ResponseData) o;
    return Objects.equals(this.copyStatus, agentAdvertiserCopyV2ResponseData.copyStatus) &&
        Objects.equals(this.item, agentAdvertiserCopyV2ResponseData.item);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyStatus, item);
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
    sb.append("class AgentAdvertiserCopyV2ResponseData {\n");
    sb.append("    copyStatus: ").append(toIndentedString(copyStatus)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
    openapiFields.add("copy_status");
    openapiFields.add("item");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserCopyV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserCopyV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserCopyV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserCopyV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserCopyV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserCopyV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserCopyV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserCopyV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserCopyV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserCopyV2ResponseData
  */
  public static AgentAdvertiserCopyV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserCopyV2ResponseData.class);
  }

 /**
  * Convert an instance of AgentAdvertiserCopyV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

