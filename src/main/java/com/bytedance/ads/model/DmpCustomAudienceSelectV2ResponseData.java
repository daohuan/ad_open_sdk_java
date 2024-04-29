/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class DmpCustomAudienceSelectV2ResponseData {
  public static final String SERIALIZED_NAME_CUSTOM_AUDIENCE_LIST = "custom_audience_list";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AUDIENCE_LIST)
  private List<DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner> customAudienceList = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset = null;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Long totalNum = null;

  public DmpCustomAudienceSelectV2ResponseData() {
  }

  public DmpCustomAudienceSelectV2ResponseData customAudienceList(List<DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner> customAudienceList) {
    
    this.customAudienceList = customAudienceList;
    return this;
  }

  public DmpCustomAudienceSelectV2ResponseData addCustomAudienceListItem(DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner customAudienceListItem) {
    if (this.customAudienceList == null) {
      this.customAudienceList = new ArrayList<>();
    }
    this.customAudienceList.add(customAudienceListItem);
    return this;
  }

   /**
   * 
   * @return customAudienceList
  **/
  @javax.annotation.Nullable
  public List<DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner> getCustomAudienceList() {
    return customAudienceList;
  }


  public void setCustomAudienceList(List<DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner> customAudienceList) {
    this.customAudienceList = customAudienceList;
  }


  public DmpCustomAudienceSelectV2ResponseData offset(Long offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * 
   * @return offset
  **/
  @javax.annotation.Nullable
  public Long getOffset() {
    return offset;
  }


  public void setOffset(Long offset) {
    this.offset = offset;
  }


  public DmpCustomAudienceSelectV2ResponseData totalNum(Long totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * 
   * @return totalNum
  **/
  @javax.annotation.Nullable
  public Long getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Long totalNum) {
    this.totalNum = totalNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpCustomAudienceSelectV2ResponseData dmpCustomAudienceSelectV2ResponseData = (DmpCustomAudienceSelectV2ResponseData) o;
    return Objects.equals(this.customAudienceList, dmpCustomAudienceSelectV2ResponseData.customAudienceList) &&
        Objects.equals(this.offset, dmpCustomAudienceSelectV2ResponseData.offset) &&
        Objects.equals(this.totalNum, dmpCustomAudienceSelectV2ResponseData.totalNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAudienceList, offset, totalNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpCustomAudienceSelectV2ResponseData {\n");
    sb.append("    customAudienceList: ").append(toIndentedString(customAudienceList)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
    openapiFields.add("custom_audience_list");
    openapiFields.add("offset");
    openapiFields.add("total_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpCustomAudienceSelectV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpCustomAudienceSelectV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpCustomAudienceSelectV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpCustomAudienceSelectV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpCustomAudienceSelectV2ResponseData>() {
           @Override
           public void write(JsonWriter out, DmpCustomAudienceSelectV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpCustomAudienceSelectV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpCustomAudienceSelectV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpCustomAudienceSelectV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to DmpCustomAudienceSelectV2ResponseData
  */
  public static DmpCustomAudienceSelectV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpCustomAudienceSelectV2ResponseData.class);
  }

 /**
  * Convert an instance of DmpCustomAudienceSelectV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

