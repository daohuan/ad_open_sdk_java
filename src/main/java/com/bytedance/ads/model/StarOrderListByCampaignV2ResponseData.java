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
import com.bytedance.ads.model.StarOrderListByCampaignV2ResponseDataOrderListInner;
import com.bytedance.ads.model.StarOrderListByCampaignV2ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class StarOrderListByCampaignV2ResponseData {
  public static final String SERIALIZED_NAME_ORDER_LIST = "order_list";
  @SerializedName(SERIALIZED_NAME_ORDER_LIST)
  private List<StarOrderListByCampaignV2ResponseDataOrderListInner> orderList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private StarOrderListByCampaignV2ResponseDataPageInfo pageInfo = null;

  public StarOrderListByCampaignV2ResponseData() {
  }

  public StarOrderListByCampaignV2ResponseData orderList(List<StarOrderListByCampaignV2ResponseDataOrderListInner> orderList) {
    
    this.orderList = orderList;
    return this;
  }

  public StarOrderListByCampaignV2ResponseData addOrderListItem(StarOrderListByCampaignV2ResponseDataOrderListInner orderListItem) {
    if (this.orderList == null) {
      this.orderList = new ArrayList<>();
    }
    this.orderList.add(orderListItem);
    return this;
  }

   /**
   * 任务列表
   * @return orderList
  **/
  @javax.annotation.Nullable
  public List<StarOrderListByCampaignV2ResponseDataOrderListInner> getOrderList() {
    return orderList;
  }


  public void setOrderList(List<StarOrderListByCampaignV2ResponseDataOrderListInner> orderList) {
    this.orderList = orderList;
  }


  public StarOrderListByCampaignV2ResponseData pageInfo(StarOrderListByCampaignV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public StarOrderListByCampaignV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(StarOrderListByCampaignV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderListByCampaignV2ResponseData starOrderListByCampaignV2ResponseData = (StarOrderListByCampaignV2ResponseData) o;
    return Objects.equals(this.orderList, starOrderListByCampaignV2ResponseData.orderList) &&
        Objects.equals(this.pageInfo, starOrderListByCampaignV2ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderList, pageInfo);
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
    sb.append("class StarOrderListByCampaignV2ResponseData {\n");
    sb.append("    orderList: ").append(toIndentedString(orderList)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("order_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderListByCampaignV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderListByCampaignV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderListByCampaignV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderListByCampaignV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderListByCampaignV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarOrderListByCampaignV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderListByCampaignV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderListByCampaignV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderListByCampaignV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarOrderListByCampaignV2ResponseData
  */
  public static StarOrderListByCampaignV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderListByCampaignV2ResponseData.class);
  }

 /**
  * Convert an instance of StarOrderListByCampaignV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

