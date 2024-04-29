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
 * 分页
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class StarComponentQueryIndustryAnchorV2ResponseDataPageInfo {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount = null;

  public StarComponentQueryIndustryAnchorV2ResponseDataPageInfo() {
  }

  public StarComponentQueryIndustryAnchorV2ResponseDataPageInfo limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * 数量
   * @return limit
  **/
  @javax.annotation.Nullable
  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public StarComponentQueryIndustryAnchorV2ResponseDataPageInfo page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * 页码
   * @return page
  **/
  @javax.annotation.Nullable
  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public StarComponentQueryIndustryAnchorV2ResponseDataPageInfo totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 总量
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarComponentQueryIndustryAnchorV2ResponseDataPageInfo starComponentQueryIndustryAnchorV2ResponseDataPageInfo = (StarComponentQueryIndustryAnchorV2ResponseDataPageInfo) o;
    return Objects.equals(this.limit, starComponentQueryIndustryAnchorV2ResponseDataPageInfo.limit) &&
        Objects.equals(this.page, starComponentQueryIndustryAnchorV2ResponseDataPageInfo.page) &&
        Objects.equals(this.totalCount, starComponentQueryIndustryAnchorV2ResponseDataPageInfo.totalCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, page, totalCount);
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
    sb.append("class StarComponentQueryIndustryAnchorV2ResponseDataPageInfo {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("page");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarComponentQueryIndustryAnchorV2ResponseDataPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarComponentQueryIndustryAnchorV2ResponseDataPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarComponentQueryIndustryAnchorV2ResponseDataPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarComponentQueryIndustryAnchorV2ResponseDataPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarComponentQueryIndustryAnchorV2ResponseDataPageInfo>() {
           @Override
           public void write(JsonWriter out, StarComponentQueryIndustryAnchorV2ResponseDataPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarComponentQueryIndustryAnchorV2ResponseDataPageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarComponentQueryIndustryAnchorV2ResponseDataPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarComponentQueryIndustryAnchorV2ResponseDataPageInfo
  * @throws IOException if the JSON string is invalid with respect to StarComponentQueryIndustryAnchorV2ResponseDataPageInfo
  */
  public static StarComponentQueryIndustryAnchorV2ResponseDataPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarComponentQueryIndustryAnchorV2ResponseDataPageInfo.class);
  }

 /**
  * Convert an instance of StarComponentQueryIndustryAnchorV2ResponseDataPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

