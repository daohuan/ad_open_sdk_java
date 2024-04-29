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
import com.bytedance.ads.model.ServeMarketActiveFuncGetV10ResponseDataFuncListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class ServeMarketActiveFuncGetV10ResponseData {
  public static final String SERIALIZED_NAME_FUNC_LIST = "func_list";
  @SerializedName(SERIALIZED_NAME_FUNC_LIST)
  private List<ServeMarketActiveFuncGetV10ResponseDataFuncListInner> funcList = null;

  public ServeMarketActiveFuncGetV10ResponseData() {
  }

  public ServeMarketActiveFuncGetV10ResponseData funcList(List<ServeMarketActiveFuncGetV10ResponseDataFuncListInner> funcList) {
    
    this.funcList = funcList;
    return this;
  }

  public ServeMarketActiveFuncGetV10ResponseData addFuncListItem(ServeMarketActiveFuncGetV10ResponseDataFuncListInner funcListItem) {
    if (this.funcList == null) {
      this.funcList = new ArrayList<>();
    }
    this.funcList.add(funcListItem);
    return this;
  }

   /**
   * 
   * @return funcList
  **/
  @javax.annotation.Nullable
  public List<ServeMarketActiveFuncGetV10ResponseDataFuncListInner> getFuncList() {
    return funcList;
  }


  public void setFuncList(List<ServeMarketActiveFuncGetV10ResponseDataFuncListInner> funcList) {
    this.funcList = funcList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServeMarketActiveFuncGetV10ResponseData serveMarketActiveFuncGetV10ResponseData = (ServeMarketActiveFuncGetV10ResponseData) o;
    return Objects.equals(this.funcList, serveMarketActiveFuncGetV10ResponseData.funcList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(funcList);
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
    sb.append("class ServeMarketActiveFuncGetV10ResponseData {\n");
    sb.append("    funcList: ").append(toIndentedString(funcList)).append("\n");
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
    openapiFields.add("func_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServeMarketActiveFuncGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServeMarketActiveFuncGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServeMarketActiveFuncGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServeMarketActiveFuncGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ServeMarketActiveFuncGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, ServeMarketActiveFuncGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServeMarketActiveFuncGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServeMarketActiveFuncGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServeMarketActiveFuncGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to ServeMarketActiveFuncGetV10ResponseData
  */
  public static ServeMarketActiveFuncGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServeMarketActiveFuncGetV10ResponseData.class);
  }

 /**
  * Convert an instance of ServeMarketActiveFuncGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

