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
 * QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner {
  public static final String SERIALIZED_NAME_ANCHOR_AVATAR = "anchor_avatar";
  @SerializedName(SERIALIZED_NAME_ANCHOR_AVATAR)
  private String anchorAvatar = null;

  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_NAME = "anchor_name";
  @SerializedName(SERIALIZED_NAME_ANCHOR_NAME)
  private String anchorName = null;

  public QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner() {
  }

  public QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner anchorAvatar(String anchorAvatar) {
    
    this.anchorAvatar = anchorAvatar;
    return this;
  }

   /**
   * 
   * @return anchorAvatar
  **/
  @javax.annotation.Nullable
  public String getAnchorAvatar() {
    return anchorAvatar;
  }


  public void setAnchorAvatar(String anchorAvatar) {
    this.anchorAvatar = anchorAvatar;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner anchorName(String anchorName) {
    
    this.anchorName = anchorName;
    return this;
  }

   /**
   * 
   * @return anchorName
  **/
  @javax.annotation.Nullable
  public String getAnchorName() {
    return anchorName;
  }


  public void setAnchorName(String anchorName) {
    this.anchorName = anchorName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner qianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner = (QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner) o;
    return Objects.equals(this.anchorAvatar, qianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner.anchorAvatar) &&
        Objects.equals(this.anchorId, qianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner.anchorId) &&
        Objects.equals(this.anchorName, qianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner.anchorName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorAvatar, anchorId, anchorName);
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
    sb.append("class QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner {\n");
    sb.append("    anchorAvatar: ").append(toIndentedString(anchorAvatar)).append("\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorName: ").append(toIndentedString(anchorName)).append("\n");
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
    openapiFields.add("anchor_avatar");
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner
  */
  public static QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionListV10ResponseDataAdListInnerRoomInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

