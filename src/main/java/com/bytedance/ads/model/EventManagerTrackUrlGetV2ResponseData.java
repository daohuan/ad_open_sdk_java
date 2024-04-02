/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerTrackUrlGetV2ResponseDataPageInfo;
import com.bytedance.ads.model.EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class EventManagerTrackUrlGetV2ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private EventManagerTrackUrlGetV2ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUPS = "track_url_groups";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUPS)
  private List<EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner> trackUrlGroups = null;

  public EventManagerTrackUrlGetV2ResponseData() {
  }

  public EventManagerTrackUrlGetV2ResponseData pageInfo(EventManagerTrackUrlGetV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public EventManagerTrackUrlGetV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(EventManagerTrackUrlGetV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public EventManagerTrackUrlGetV2ResponseData trackUrlGroups(List<EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner> trackUrlGroups) {
    
    this.trackUrlGroups = trackUrlGroups;
    return this;
  }

  public EventManagerTrackUrlGetV2ResponseData addTrackUrlGroupsItem(EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner trackUrlGroupsItem) {
    if (this.trackUrlGroups == null) {
      this.trackUrlGroups = new ArrayList<>();
    }
    this.trackUrlGroups.add(trackUrlGroupsItem);
    return this;
  }

   /**
   * 监测链接组信息
   * @return trackUrlGroups
  **/
  @javax.annotation.Nullable
  public List<EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner> getTrackUrlGroups() {
    return trackUrlGroups;
  }


  public void setTrackUrlGroups(List<EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner> trackUrlGroups) {
    this.trackUrlGroups = trackUrlGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerTrackUrlGetV2ResponseData eventManagerTrackUrlGetV2ResponseData = (EventManagerTrackUrlGetV2ResponseData) o;
    return Objects.equals(this.pageInfo, eventManagerTrackUrlGetV2ResponseData.pageInfo) &&
        Objects.equals(this.trackUrlGroups, eventManagerTrackUrlGetV2ResponseData.trackUrlGroups);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, trackUrlGroups);
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
    sb.append("class EventManagerTrackUrlGetV2ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    trackUrlGroups: ").append(toIndentedString(trackUrlGroups)).append("\n");
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
    openapiFields.add("track_url_groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerTrackUrlGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerTrackUrlGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerTrackUrlGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerTrackUrlGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerTrackUrlGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, EventManagerTrackUrlGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerTrackUrlGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerTrackUrlGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerTrackUrlGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to EventManagerTrackUrlGetV2ResponseData
  */
  public static EventManagerTrackUrlGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerTrackUrlGetV2ResponseData.class);
  }

 /**
  * Convert an instance of EventManagerTrackUrlGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

