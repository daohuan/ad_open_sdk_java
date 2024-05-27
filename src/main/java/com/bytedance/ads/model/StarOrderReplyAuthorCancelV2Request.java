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
 * StarOrderReplyAuthorCancelV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class StarOrderReplyAuthorCancelV2Request {
  public static final String SERIALIZED_NAME_ACCEPT = "accept";
  @SerializedName(SERIALIZED_NAME_ACCEPT)
  private Long accept = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarOrderReplyAuthorCancelV2Request() {
  }

  public StarOrderReplyAuthorCancelV2Request accept(Long accept) {
    
    this.accept = accept;
    return this;
  }

   /**
   * (1)同意；(2)拒绝
   * @return accept
  **/
  @javax.annotation.Nullable
  public Long getAccept() {
    return accept;
  }


  public void setAccept(Long accept) {
    this.accept = accept;
  }


  public StarOrderReplyAuthorCancelV2Request orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 任务ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarOrderReplyAuthorCancelV2Request rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 拒绝理由
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public StarOrderReplyAuthorCancelV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 星图客户ID
   * @return starId
  **/
  @javax.annotation.Nullable
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderReplyAuthorCancelV2Request starOrderReplyAuthorCancelV2Request = (StarOrderReplyAuthorCancelV2Request) o;
    return Objects.equals(this.accept, starOrderReplyAuthorCancelV2Request.accept) &&
        Objects.equals(this.orderId, starOrderReplyAuthorCancelV2Request.orderId) &&
        Objects.equals(this.rejectReason, starOrderReplyAuthorCancelV2Request.rejectReason) &&
        Objects.equals(this.starId, starOrderReplyAuthorCancelV2Request.starId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accept, orderId, rejectReason, starId);
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
    sb.append("class StarOrderReplyAuthorCancelV2Request {\n");
    sb.append("    accept: ").append(toIndentedString(accept)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("accept");
    openapiFields.add("order_id");
    openapiFields.add("reject_reason");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accept");
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderReplyAuthorCancelV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderReplyAuthorCancelV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderReplyAuthorCancelV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderReplyAuthorCancelV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderReplyAuthorCancelV2Request>() {
           @Override
           public void write(JsonWriter out, StarOrderReplyAuthorCancelV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderReplyAuthorCancelV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderReplyAuthorCancelV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderReplyAuthorCancelV2Request
  * @throws IOException if the JSON string is invalid with respect to StarOrderReplyAuthorCancelV2Request
  */
  public static StarOrderReplyAuthorCancelV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderReplyAuthorCancelV2Request.class);
  }

 /**
  * Convert an instance of StarOrderReplyAuthorCancelV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

