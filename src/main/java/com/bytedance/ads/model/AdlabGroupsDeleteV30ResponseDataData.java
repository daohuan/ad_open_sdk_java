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
import com.bytedance.ads.model.AdlabGroupsDeleteV30ResponseDataDataErrorsInner;
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
 * 返回数据
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class AdlabGroupsDeleteV30ResponseDataData {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<AdlabGroupsDeleteV30ResponseDataDataErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public AdlabGroupsDeleteV30ResponseDataData() {
  }

  public AdlabGroupsDeleteV30ResponseDataData errors(List<AdlabGroupsDeleteV30ResponseDataDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdlabGroupsDeleteV30ResponseDataData addErrorsItem(AdlabGroupsDeleteV30ResponseDataDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 删除失败的项目id信息
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupsDeleteV30ResponseDataDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<AdlabGroupsDeleteV30ResponseDataDataErrorsInner> errors) {
    this.errors = errors;
  }


  public AdlabGroupsDeleteV30ResponseDataData ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public AdlabGroupsDeleteV30ResponseDataData addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 删除成功的项目id
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<Long> getIds() {
    return ids;
  }


  public void setIds(List<Long> ids) {
    this.ids = ids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupsDeleteV30ResponseDataData adlabGroupsDeleteV30ResponseDataData = (AdlabGroupsDeleteV30ResponseDataData) o;
    return Objects.equals(this.errors, adlabGroupsDeleteV30ResponseDataData.errors) &&
        Objects.equals(this.ids, adlabGroupsDeleteV30ResponseDataData.ids);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, ids);
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
    sb.append("class AdlabGroupsDeleteV30ResponseDataData {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupsDeleteV30ResponseDataData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupsDeleteV30ResponseDataData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupsDeleteV30ResponseDataData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupsDeleteV30ResponseDataData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupsDeleteV30ResponseDataData>() {
           @Override
           public void write(JsonWriter out, AdlabGroupsDeleteV30ResponseDataData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupsDeleteV30ResponseDataData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupsDeleteV30ResponseDataData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupsDeleteV30ResponseDataData
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupsDeleteV30ResponseDataData
  */
  public static AdlabGroupsDeleteV30ResponseDataData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupsDeleteV30ResponseDataData.class);
  }

 /**
  * Convert an instance of AdlabGroupsDeleteV30ResponseDataData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

