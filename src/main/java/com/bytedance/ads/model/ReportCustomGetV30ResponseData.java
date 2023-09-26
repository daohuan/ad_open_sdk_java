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
import com.bytedance.ads.model.ReportCustomGetV30ResponseDataPageInfo;
import com.bytedance.ads.model.ReportCustomGetV30ResponseDataRowsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class ReportCustomGetV30ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ReportCustomGetV30ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<ReportCustomGetV30ResponseDataRowsInner> rows = null;

  public static final String SERIALIZED_NAME_TOTAL_METRICS = "total_metrics";
  @SerializedName(SERIALIZED_NAME_TOTAL_METRICS)
  private Map<String, String> totalMetrics = null;

  public ReportCustomGetV30ResponseData() {
  }

  public ReportCustomGetV30ResponseData pageInfo(ReportCustomGetV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ReportCustomGetV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ReportCustomGetV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public ReportCustomGetV30ResponseData rows(List<ReportCustomGetV30ResponseDataRowsInner> rows) {
    
    this.rows = rows;
    return this;
  }

  public ReportCustomGetV30ResponseData addRowsItem(ReportCustomGetV30ResponseDataRowsInner rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * 
   * @return rows
  **/
  @javax.annotation.Nullable
  public List<ReportCustomGetV30ResponseDataRowsInner> getRows() {
    return rows;
  }


  public void setRows(List<ReportCustomGetV30ResponseDataRowsInner> rows) {
    this.rows = rows;
  }


  public ReportCustomGetV30ResponseData totalMetrics(Map<String, String> totalMetrics) {
    
    this.totalMetrics = totalMetrics;
    return this;
  }

  public ReportCustomGetV30ResponseData putTotalMetricsItem(String key, String totalMetricsItem) {
    if (this.totalMetrics == null) {
      this.totalMetrics = new HashMap<>();
    }
    this.totalMetrics.put(key, totalMetricsItem);
    return this;
  }

   /**
   * 指标汇总数据
   * @return totalMetrics
  **/
  @javax.annotation.Nullable
  public Map<String, String> getTotalMetrics() {
    return totalMetrics;
  }


  public void setTotalMetrics(Map<String, String> totalMetrics) {
    this.totalMetrics = totalMetrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCustomGetV30ResponseData reportCustomGetV30ResponseData = (ReportCustomGetV30ResponseData) o;
    return Objects.equals(this.pageInfo, reportCustomGetV30ResponseData.pageInfo) &&
        Objects.equals(this.rows, reportCustomGetV30ResponseData.rows) &&
        Objects.equals(this.totalMetrics, reportCustomGetV30ResponseData.totalMetrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, rows, totalMetrics);
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
    sb.append("class ReportCustomGetV30ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    totalMetrics: ").append(toIndentedString(totalMetrics)).append("\n");
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
    openapiFields.add("page_info");
    openapiFields.add("rows");
    openapiFields.add("total_metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rows");
    openapiRequiredFields.add("total_metrics");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ReportCustomGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ReportCustomGetV30ResponseData
  */
  public static ReportCustomGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ReportCustomGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

