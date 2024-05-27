/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2ResponseDataCursorInfo;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2ResponseDataDataInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class AgentQueryRiskPromotionListV2ResponseData {
  public static final String SERIALIZED_NAME_CURSOR_INFO = "cursor_info";
  @SerializedName(SERIALIZED_NAME_CURSOR_INFO)
  private AgentQueryRiskPromotionListV2ResponseDataCursorInfo cursorInfo = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<AgentQueryRiskPromotionListV2ResponseDataDataInner> data = null;

  public AgentQueryRiskPromotionListV2ResponseData() {
  }

  public AgentQueryRiskPromotionListV2ResponseData cursorInfo(AgentQueryRiskPromotionListV2ResponseDataCursorInfo cursorInfo) {
    
    this.cursorInfo = cursorInfo;
    return this;
  }

   /**
   * Get cursorInfo
   * @return cursorInfo
  **/
  @javax.annotation.Nullable
  public AgentQueryRiskPromotionListV2ResponseDataCursorInfo getCursorInfo() {
    return cursorInfo;
  }


  public void setCursorInfo(AgentQueryRiskPromotionListV2ResponseDataCursorInfo cursorInfo) {
    this.cursorInfo = cursorInfo;
  }


  public AgentQueryRiskPromotionListV2ResponseData data(List<AgentQueryRiskPromotionListV2ResponseDataDataInner> data) {
    
    this.data = data;
    return this;
  }

  public AgentQueryRiskPromotionListV2ResponseData addDataItem(AgentQueryRiskPromotionListV2ResponseDataDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 违规广告列表
   * @return data
  **/
  @javax.annotation.Nullable
  public List<AgentQueryRiskPromotionListV2ResponseDataDataInner> getData() {
    return data;
  }


  public void setData(List<AgentQueryRiskPromotionListV2ResponseDataDataInner> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentQueryRiskPromotionListV2ResponseData agentQueryRiskPromotionListV2ResponseData = (AgentQueryRiskPromotionListV2ResponseData) o;
    return Objects.equals(this.cursorInfo, agentQueryRiskPromotionListV2ResponseData.cursorInfo) &&
        Objects.equals(this.data, agentQueryRiskPromotionListV2ResponseData.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorInfo, data);
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
    sb.append("class AgentQueryRiskPromotionListV2ResponseData {\n");
    sb.append("    cursorInfo: ").append(toIndentedString(cursorInfo)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("cursor_info");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentQueryRiskPromotionListV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentQueryRiskPromotionListV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentQueryRiskPromotionListV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentQueryRiskPromotionListV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentQueryRiskPromotionListV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AgentQueryRiskPromotionListV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentQueryRiskPromotionListV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentQueryRiskPromotionListV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentQueryRiskPromotionListV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AgentQueryRiskPromotionListV2ResponseData
  */
  public static AgentQueryRiskPromotionListV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentQueryRiskPromotionListV2ResponseData.class);
  }

 /**
  * Convert an instance of AgentQueryRiskPromotionListV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

