/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo;
import com.bytedance.ads.model.QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner;
import com.bytedance.ads.model.QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo;
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
 * QianchuanUniPromotionListV10ResponseDataAdListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class QianchuanUniPromotionListV10ResponseDataAdListInner {
  public static final String SERIALIZED_NAME_AD_INFO = "ad_info";
  @SerializedName(SERIALIZED_NAME_AD_INFO)
  private QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo adInfo = null;

  public static final String SERIALIZED_NAME_ROOM_INFO = "room_info";
  @SerializedName(SERIALIZED_NAME_ROOM_INFO)
  private List<QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner> roomInfo = null;

  public static final String SERIALIZED_NAME_STATS_INFO = "stats_info";
  @SerializedName(SERIALIZED_NAME_STATS_INFO)
  private QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo statsInfo = null;

  public QianchuanUniPromotionListV10ResponseDataAdListInner() {
  }

  public QianchuanUniPromotionListV10ResponseDataAdListInner adInfo(QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo adInfo) {
    
    this.adInfo = adInfo;
    return this;
  }

   /**
   * Get adInfo
   * @return adInfo
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo getAdInfo() {
    return adInfo;
  }


  public void setAdInfo(QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo adInfo) {
    this.adInfo = adInfo;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInner roomInfo(List<QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner> roomInfo) {
    
    this.roomInfo = roomInfo;
    return this;
  }

  public QianchuanUniPromotionListV10ResponseDataAdListInner addRoomInfoItem(QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner roomInfoItem) {
    if (this.roomInfo == null) {
      this.roomInfo = new ArrayList<>();
    }
    this.roomInfo.add(roomInfoItem);
    return this;
  }

   /**
   * 
   * @return roomInfo
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner> getRoomInfo() {
    return roomInfo;
  }


  public void setRoomInfo(List<QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner> roomInfo) {
    this.roomInfo = roomInfo;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInner statsInfo(QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo statsInfo) {
    
    this.statsInfo = statsInfo;
    return this;
  }

   /**
   * Get statsInfo
   * @return statsInfo
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo getStatsInfo() {
    return statsInfo;
  }


  public void setStatsInfo(QianchuanUniPromotionListV10ResponseDataAdListInnerStatsInfo statsInfo) {
    this.statsInfo = statsInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionListV10ResponseDataAdListInner qianchuanUniPromotionListV10ResponseDataAdListInner = (QianchuanUniPromotionListV10ResponseDataAdListInner) o;
    return Objects.equals(this.adInfo, qianchuanUniPromotionListV10ResponseDataAdListInner.adInfo) &&
        Objects.equals(this.roomInfo, qianchuanUniPromotionListV10ResponseDataAdListInner.roomInfo) &&
        Objects.equals(this.statsInfo, qianchuanUniPromotionListV10ResponseDataAdListInner.statsInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adInfo, roomInfo, statsInfo);
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
    sb.append("class QianchuanUniPromotionListV10ResponseDataAdListInner {\n");
    sb.append("    adInfo: ").append(toIndentedString(adInfo)).append("\n");
    sb.append("    roomInfo: ").append(toIndentedString(roomInfo)).append("\n");
    sb.append("    statsInfo: ").append(toIndentedString(statsInfo)).append("\n");
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
    openapiFields.add("ad_info");
    openapiFields.add("room_info");
    openapiFields.add("stats_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionListV10ResponseDataAdListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionListV10ResponseDataAdListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionListV10ResponseDataAdListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionListV10ResponseDataAdListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionListV10ResponseDataAdListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionListV10ResponseDataAdListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionListV10ResponseDataAdListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionListV10ResponseDataAdListInner
  */
  public static QianchuanUniPromotionListV10ResponseDataAdListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionListV10ResponseDataAdListInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionListV10ResponseDataAdListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

