/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
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
 * DpaCategoryGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T19:34:37.792107567+08:00[PRC]")
public class DpaCategoryGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent = null;

  public static final String SERIALIZED_NAME_SUBS = "subs";
  @SerializedName(SERIALIZED_NAME_SUBS)
  private List<Object> subs = null;

  public DpaCategoryGetV2ResponseDataListInner() {
  }

  public DpaCategoryGetV2ResponseDataListInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 分类id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DpaCategoryGetV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 分类名称  
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DpaCategoryGetV2ResponseDataListInner parent(String parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * 父级分类id，没有父级则为-1
   * @return parent
  **/
  @javax.annotation.Nullable
  public String getParent() {
    return parent;
  }


  public void setParent(String parent) {
    this.parent = parent;
  }


  public DpaCategoryGetV2ResponseDataListInner subs(List<Object> subs) {
    
    this.subs = subs;
    return this;
  }

  public DpaCategoryGetV2ResponseDataListInner addSubsItem(Object subsItem) {
    if (this.subs == null) {
      this.subs = new ArrayList<>();
    }
    this.subs.add(subsItem);
    return this;
  }

   /**
   * 子级分类，嵌套递归
   * @return subs
  **/
  @javax.annotation.Nullable
  public List<Object> getSubs() {
    return subs;
  }


  public void setSubs(List<Object> subs) {
    this.subs = subs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaCategoryGetV2ResponseDataListInner dpaCategoryGetV2ResponseDataListInner = (DpaCategoryGetV2ResponseDataListInner) o;
    return Objects.equals(this.id, dpaCategoryGetV2ResponseDataListInner.id) &&
        Objects.equals(this.name, dpaCategoryGetV2ResponseDataListInner.name) &&
        Objects.equals(this.parent, dpaCategoryGetV2ResponseDataListInner.parent) &&
        Objects.equals(this.subs, dpaCategoryGetV2ResponseDataListInner.subs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parent, subs);
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
    sb.append("class DpaCategoryGetV2ResponseDataListInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    subs: ").append(toIndentedString(subs)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("parent");
    openapiFields.add("subs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaCategoryGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaCategoryGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaCategoryGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaCategoryGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaCategoryGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, DpaCategoryGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaCategoryGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaCategoryGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaCategoryGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to DpaCategoryGetV2ResponseDataListInner
  */
  public static DpaCategoryGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaCategoryGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of DpaCategoryGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

