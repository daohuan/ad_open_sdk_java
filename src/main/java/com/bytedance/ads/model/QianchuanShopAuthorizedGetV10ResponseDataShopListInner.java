/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
 * QianchuanShopAuthorizedGetV10ResponseDataShopListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class QianchuanShopAuthorizedGetV10ResponseDataShopListInner {
  public static final String SERIALIZED_NAME_SHOP_AVATAR = "shop_avatar";
  @SerializedName(SERIALIZED_NAME_SHOP_AVATAR)
  private List<String> shopAvatar = null;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private Long shopId = null;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName = null;

  public QianchuanShopAuthorizedGetV10ResponseDataShopListInner() {
  }

  public QianchuanShopAuthorizedGetV10ResponseDataShopListInner shopAvatar(List<String> shopAvatar) {
    
    this.shopAvatar = shopAvatar;
    return this;
  }

  public QianchuanShopAuthorizedGetV10ResponseDataShopListInner addShopAvatarItem(String shopAvatarItem) {
    if (this.shopAvatar == null) {
      this.shopAvatar = new ArrayList<>();
    }
    this.shopAvatar.add(shopAvatarItem);
    return this;
  }

   /**
   * 
   * @return shopAvatar
  **/
  @javax.annotation.Nullable
  public List<String> getShopAvatar() {
    return shopAvatar;
  }


  public void setShopAvatar(List<String> shopAvatar) {
    this.shopAvatar = shopAvatar;
  }


  public QianchuanShopAuthorizedGetV10ResponseDataShopListInner shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 
   * @return shopId
  **/
  @javax.annotation.Nullable
  public Long getShopId() {
    return shopId;
  }


  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }


  public QianchuanShopAuthorizedGetV10ResponseDataShopListInner shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 
   * @return shopName
  **/
  @javax.annotation.Nullable
  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanShopAuthorizedGetV10ResponseDataShopListInner qianchuanShopAuthorizedGetV10ResponseDataShopListInner = (QianchuanShopAuthorizedGetV10ResponseDataShopListInner) o;
    return Objects.equals(this.shopAvatar, qianchuanShopAuthorizedGetV10ResponseDataShopListInner.shopAvatar) &&
        Objects.equals(this.shopId, qianchuanShopAuthorizedGetV10ResponseDataShopListInner.shopId) &&
        Objects.equals(this.shopName, qianchuanShopAuthorizedGetV10ResponseDataShopListInner.shopName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopAvatar, shopId, shopName);
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
    sb.append("class QianchuanShopAuthorizedGetV10ResponseDataShopListInner {\n");
    sb.append("    shopAvatar: ").append(toIndentedString(shopAvatar)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
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
    openapiFields.add("shop_avatar");
    openapiFields.add("shop_id");
    openapiFields.add("shop_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanShopAuthorizedGetV10ResponseDataShopListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanShopAuthorizedGetV10ResponseDataShopListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanShopAuthorizedGetV10ResponseDataShopListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanShopAuthorizedGetV10ResponseDataShopListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanShopAuthorizedGetV10ResponseDataShopListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanShopAuthorizedGetV10ResponseDataShopListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanShopAuthorizedGetV10ResponseDataShopListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanShopAuthorizedGetV10ResponseDataShopListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanShopAuthorizedGetV10ResponseDataShopListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanShopAuthorizedGetV10ResponseDataShopListInner
  */
  public static QianchuanShopAuthorizedGetV10ResponseDataShopListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanShopAuthorizedGetV10ResponseDataShopListInner.class);
  }

 /**
  * Convert an instance of QianchuanShopAuthorizedGetV10ResponseDataShopListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
