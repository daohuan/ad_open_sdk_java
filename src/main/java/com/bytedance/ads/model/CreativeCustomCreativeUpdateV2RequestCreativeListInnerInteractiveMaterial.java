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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial {
  public static final String SERIALIZED_NAME_PLAYABLE_ID = "playable_id";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ID)
  private Long playableId = null;

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial() {
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial playableId(Long playableId) {
    
    this.playableId = playableId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 2147483647
   * @return playableId
  **/
  @javax.annotation.Nonnull
  public Long getPlayableId() {
    return playableId;
  }


  public void setPlayableId(Long playableId) {
    this.playableId = playableId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial creativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial = (CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial) o;
    return Objects.equals(this.playableId, creativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial.playableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playableId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial {\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
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
    openapiFields.add("playable_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("playable_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial
  */
  public static CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

