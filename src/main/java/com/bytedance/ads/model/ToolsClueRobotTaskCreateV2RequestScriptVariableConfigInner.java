/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
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
 * ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner {
  public static final String SERIALIZED_NAME_VARIABLE_NAME = "variable_name";
  @SerializedName(SERIALIZED_NAME_VARIABLE_NAME)
  private String variableName = null;

  public static final String SERIALIZED_NAME_VARIABLE_VALUE = "variable_value";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VALUE)
  private String variableValue = null;

  public ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner() {
  }

  public ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner variableName(String variableName) {
    
    this.variableName = variableName;
    return this;
  }

   /**
   * 变量名称
   * @return variableName
  **/
  @javax.annotation.Nullable
  public String getVariableName() {
    return variableName;
  }


  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }


  public ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner variableValue(String variableValue) {
    
    this.variableValue = variableValue;
    return this;
  }

   /**
   * 变量值
   * @return variableValue
  **/
  @javax.annotation.Nullable
  public String getVariableValue() {
    return variableValue;
  }


  public void setVariableValue(String variableValue) {
    this.variableValue = variableValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner toolsClueRobotTaskCreateV2RequestScriptVariableConfigInner = (ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner) o;
    return Objects.equals(this.variableName, toolsClueRobotTaskCreateV2RequestScriptVariableConfigInner.variableName) &&
        Objects.equals(this.variableValue, toolsClueRobotTaskCreateV2RequestScriptVariableConfigInner.variableValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableName, variableValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner {\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableValue: ").append(toIndentedString(variableValue)).append("\n");
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
    openapiFields.add("variable_name");
    openapiFields.add("variable_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("variable_name");
    openapiRequiredFields.add("variable_value");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner
  */
  public static ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner.class);
  }

 /**
  * Convert an instance of ToolsClueRobotTaskCreateV2RequestScriptVariableConfigInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

