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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ToolsBlueFlowPackageListV30Filtering {
  public static final String SERIALIZED_NAME_BLUE_FLOW_PACKAGE_ID = "blue_flow_package_id";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_PACKAGE_ID)
  private Long blueFlowPackageId = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_PACKAGE_NAME = "blue_flow_package_name";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_PACKAGE_NAME)
  private String blueFlowPackageName = null;

  public ToolsBlueFlowPackageListV30Filtering() {
  }

  public ToolsBlueFlowPackageListV30Filtering blueFlowPackageId(Long blueFlowPackageId) {
    
    this.blueFlowPackageId = blueFlowPackageId;
    return this;
  }

   /**
   * 
   * @return blueFlowPackageId
  **/
  @javax.annotation.Nullable
  public Long getBlueFlowPackageId() {
    return blueFlowPackageId;
  }


  public void setBlueFlowPackageId(Long blueFlowPackageId) {
    this.blueFlowPackageId = blueFlowPackageId;
  }


  public ToolsBlueFlowPackageListV30Filtering blueFlowPackageName(String blueFlowPackageName) {
    
    this.blueFlowPackageName = blueFlowPackageName;
    return this;
  }

   /**
   * 
   * @return blueFlowPackageName
  **/
  @javax.annotation.Nullable
  public String getBlueFlowPackageName() {
    return blueFlowPackageName;
  }


  public void setBlueFlowPackageName(String blueFlowPackageName) {
    this.blueFlowPackageName = blueFlowPackageName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBlueFlowPackageListV30Filtering toolsBlueFlowPackageListV30Filtering = (ToolsBlueFlowPackageListV30Filtering) o;
    return Objects.equals(this.blueFlowPackageId, toolsBlueFlowPackageListV30Filtering.blueFlowPackageId) &&
        Objects.equals(this.blueFlowPackageName, toolsBlueFlowPackageListV30Filtering.blueFlowPackageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueFlowPackageId, blueFlowPackageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsBlueFlowPackageListV30Filtering {\n");
    sb.append("    blueFlowPackageId: ").append(toIndentedString(blueFlowPackageId)).append("\n");
    sb.append("    blueFlowPackageName: ").append(toIndentedString(blueFlowPackageName)).append("\n");
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
    openapiFields.add("blue_flow_package_id");
    openapiFields.add("blue_flow_package_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBlueFlowPackageListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBlueFlowPackageListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBlueFlowPackageListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBlueFlowPackageListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBlueFlowPackageListV30Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsBlueFlowPackageListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBlueFlowPackageListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBlueFlowPackageListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBlueFlowPackageListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsBlueFlowPackageListV30Filtering
  */
  public static ToolsBlueFlowPackageListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBlueFlowPackageListV30Filtering.class);
  }

 /**
  * Convert an instance of ToolsBlueFlowPackageListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

