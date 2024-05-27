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
import com.bytedance.ads.model.ToolsUnionFlowPackageGetV2DataListFlowPackageType;
import com.bytedance.ads.model.ToolsUnionFlowPackageGetV2DataListStatus;
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
 * ToolsUnionFlowPackageGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ToolsUnionFlowPackageGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_FLOW_PACKAGE_ID = "flow_package_id";
  @SerializedName(SERIALIZED_NAME_FLOW_PACKAGE_ID)
  private Long flowPackageId = null;

  public static final String SERIALIZED_NAME_FLOW_PACKAGE_TYPE = "flow_package_type";
  @SerializedName(SERIALIZED_NAME_FLOW_PACKAGE_TYPE)
  private ToolsUnionFlowPackageGetV2DataListFlowPackageType flowPackageType = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_RIT = "rit";
  @SerializedName(SERIALIZED_NAME_RIT)
  private List<Long> rit = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsUnionFlowPackageGetV2DataListStatus status = null;

  public ToolsUnionFlowPackageGetV2ResponseDataListInner() {
  }

  public ToolsUnionFlowPackageGetV2ResponseDataListInner flowPackageId(Long flowPackageId) {
    
    this.flowPackageId = flowPackageId;
    return this;
  }

   /**
   * 
   * @return flowPackageId
  **/
  @javax.annotation.Nullable
  public Long getFlowPackageId() {
    return flowPackageId;
  }


  public void setFlowPackageId(Long flowPackageId) {
    this.flowPackageId = flowPackageId;
  }


  public ToolsUnionFlowPackageGetV2ResponseDataListInner flowPackageType(ToolsUnionFlowPackageGetV2DataListFlowPackageType flowPackageType) {
    
    this.flowPackageType = flowPackageType;
    return this;
  }

   /**
   * Get flowPackageType
   * @return flowPackageType
  **/
  @javax.annotation.Nullable
  public ToolsUnionFlowPackageGetV2DataListFlowPackageType getFlowPackageType() {
    return flowPackageType;
  }


  public void setFlowPackageType(ToolsUnionFlowPackageGetV2DataListFlowPackageType flowPackageType) {
    this.flowPackageType = flowPackageType;
  }


  public ToolsUnionFlowPackageGetV2ResponseDataListInner name(String name) {
    
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


  public ToolsUnionFlowPackageGetV2ResponseDataListInner rit(List<Long> rit) {
    
    this.rit = rit;
    return this;
  }

  public ToolsUnionFlowPackageGetV2ResponseDataListInner addRitItem(Long ritItem) {
    if (this.rit == null) {
      this.rit = new ArrayList<>();
    }
    this.rit.add(ritItem);
    return this;
  }

   /**
   * 
   * @return rit
  **/
  @javax.annotation.Nullable
  public List<Long> getRit() {
    return rit;
  }


  public void setRit(List<Long> rit) {
    this.rit = rit;
  }


  public ToolsUnionFlowPackageGetV2ResponseDataListInner status(ToolsUnionFlowPackageGetV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsUnionFlowPackageGetV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsUnionFlowPackageGetV2DataListStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsUnionFlowPackageGetV2ResponseDataListInner toolsUnionFlowPackageGetV2ResponseDataListInner = (ToolsUnionFlowPackageGetV2ResponseDataListInner) o;
    return Objects.equals(this.flowPackageId, toolsUnionFlowPackageGetV2ResponseDataListInner.flowPackageId) &&
        Objects.equals(this.flowPackageType, toolsUnionFlowPackageGetV2ResponseDataListInner.flowPackageType) &&
        Objects.equals(this.name, toolsUnionFlowPackageGetV2ResponseDataListInner.name) &&
        Objects.equals(this.rit, toolsUnionFlowPackageGetV2ResponseDataListInner.rit) &&
        Objects.equals(this.status, toolsUnionFlowPackageGetV2ResponseDataListInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowPackageId, flowPackageType, name, rit, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsUnionFlowPackageGetV2ResponseDataListInner {\n");
    sb.append("    flowPackageId: ").append(toIndentedString(flowPackageId)).append("\n");
    sb.append("    flowPackageType: ").append(toIndentedString(flowPackageType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rit: ").append(toIndentedString(rit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("flow_package_id");
    openapiFields.add("flow_package_type");
    openapiFields.add("name");
    openapiFields.add("rit");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsUnionFlowPackageGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsUnionFlowPackageGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsUnionFlowPackageGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsUnionFlowPackageGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsUnionFlowPackageGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsUnionFlowPackageGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsUnionFlowPackageGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsUnionFlowPackageGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsUnionFlowPackageGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsUnionFlowPackageGetV2ResponseDataListInner
  */
  public static ToolsUnionFlowPackageGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsUnionFlowPackageGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsUnionFlowPackageGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

