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
 * QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner {
  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private String trackUrl = null;

  public QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner() {
  }

  public QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner trackUrl(String trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

   /**
   * 
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public String getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(String trackUrl) {
    this.trackUrl = trackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner qianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner = (QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner) o;
    return Objects.equals(this.reason, qianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner.reason) &&
        Objects.equals(this.trackUrl, qianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner.trackUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, trackUrl);
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
    sb.append("class QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner>() {
           @Override
           public void write(JsonWriter out, QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner
  */
  public static QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner.class);
  }

 /**
  * Convert an instance of QianchuanTrackUrlCheckV10ResponseDataFailTrackUrlInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

