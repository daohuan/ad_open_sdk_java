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
 * ToolsEventAssetsGetV2ResponseDataMiniProgramInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class ToolsEventAssetsGetV2ResponseDataMiniProgramInner {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM_ID = "mini_program_id";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM_ID)
  private String miniProgramId = null;

  public ToolsEventAssetsGetV2ResponseDataMiniProgramInner() {
  }

  public ToolsEventAssetsGetV2ResponseDataMiniProgramInner assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 字节小程序资产id
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public ToolsEventAssetsGetV2ResponseDataMiniProgramInner assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * 字节小程序资产名称
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public ToolsEventAssetsGetV2ResponseDataMiniProgramInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 小程序instance_id
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsEventAssetsGetV2ResponseDataMiniProgramInner miniProgramId(String miniProgramId) {
    
    this.miniProgramId = miniProgramId;
    return this;
  }

   /**
   * 字节小程序id
   * @return miniProgramId
  **/
  @javax.annotation.Nullable
  public String getMiniProgramId() {
    return miniProgramId;
  }


  public void setMiniProgramId(String miniProgramId) {
    this.miniProgramId = miniProgramId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAssetsGetV2ResponseDataMiniProgramInner toolsEventAssetsGetV2ResponseDataMiniProgramInner = (ToolsEventAssetsGetV2ResponseDataMiniProgramInner) o;
    return Objects.equals(this.assetId, toolsEventAssetsGetV2ResponseDataMiniProgramInner.assetId) &&
        Objects.equals(this.assetName, toolsEventAssetsGetV2ResponseDataMiniProgramInner.assetName) &&
        Objects.equals(this.instanceId, toolsEventAssetsGetV2ResponseDataMiniProgramInner.instanceId) &&
        Objects.equals(this.miniProgramId, toolsEventAssetsGetV2ResponseDataMiniProgramInner.miniProgramId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName, instanceId, miniProgramId);
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
    sb.append("class ToolsEventAssetsGetV2ResponseDataMiniProgramInner {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    miniProgramId: ").append(toIndentedString(miniProgramId)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("asset_name");
    openapiFields.add("instance_id");
    openapiFields.add("mini_program_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAssetsGetV2ResponseDataMiniProgramInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAssetsGetV2ResponseDataMiniProgramInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAssetsGetV2ResponseDataMiniProgramInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAssetsGetV2ResponseDataMiniProgramInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAssetsGetV2ResponseDataMiniProgramInner>() {
           @Override
           public void write(JsonWriter out, ToolsEventAssetsGetV2ResponseDataMiniProgramInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAssetsGetV2ResponseDataMiniProgramInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAssetsGetV2ResponseDataMiniProgramInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAssetsGetV2ResponseDataMiniProgramInner
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAssetsGetV2ResponseDataMiniProgramInner
  */
  public static ToolsEventAssetsGetV2ResponseDataMiniProgramInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAssetsGetV2ResponseDataMiniProgramInner.class);
  }

 /**
  * Convert an instance of ToolsEventAssetsGetV2ResponseDataMiniProgramInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

