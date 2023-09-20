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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T19:34:37.792107567+08:00[PRC]")
public class QianchuanFileVideoEfficiencyGetV10ResponseData {
  public static final String SERIALIZED_NAME_INEFFICIENT_MATERIAL_IDS = "inefficient_material_ids";
  @SerializedName(SERIALIZED_NAME_INEFFICIENT_MATERIAL_IDS)
  private List<String> inefficientMaterialIds = null;

  public QianchuanFileVideoEfficiencyGetV10ResponseData() {
  }

  public QianchuanFileVideoEfficiencyGetV10ResponseData inefficientMaterialIds(List<String> inefficientMaterialIds) {
    
    this.inefficientMaterialIds = inefficientMaterialIds;
    return this;
  }

  public QianchuanFileVideoEfficiencyGetV10ResponseData addInefficientMaterialIdsItem(String inefficientMaterialIdsItem) {
    if (this.inefficientMaterialIds == null) {
      this.inefficientMaterialIds = new ArrayList<>();
    }
    this.inefficientMaterialIds.add(inefficientMaterialIdsItem);
    return this;
  }

   /**
   * 低效素材id列表
   * @return inefficientMaterialIds
  **/
  @javax.annotation.Nullable
  public List<String> getInefficientMaterialIds() {
    return inefficientMaterialIds;
  }


  public void setInefficientMaterialIds(List<String> inefficientMaterialIds) {
    this.inefficientMaterialIds = inefficientMaterialIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanFileVideoEfficiencyGetV10ResponseData qianchuanFileVideoEfficiencyGetV10ResponseData = (QianchuanFileVideoEfficiencyGetV10ResponseData) o;
    return Objects.equals(this.inefficientMaterialIds, qianchuanFileVideoEfficiencyGetV10ResponseData.inefficientMaterialIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inefficientMaterialIds);
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
    sb.append("class QianchuanFileVideoEfficiencyGetV10ResponseData {\n");
    sb.append("    inefficientMaterialIds: ").append(toIndentedString(inefficientMaterialIds)).append("\n");
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
    openapiFields.add("inefficient_material_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanFileVideoEfficiencyGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanFileVideoEfficiencyGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanFileVideoEfficiencyGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanFileVideoEfficiencyGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanFileVideoEfficiencyGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanFileVideoEfficiencyGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanFileVideoEfficiencyGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanFileVideoEfficiencyGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanFileVideoEfficiencyGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanFileVideoEfficiencyGetV10ResponseData
  */
  public static QianchuanFileVideoEfficiencyGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanFileVideoEfficiencyGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanFileVideoEfficiencyGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

