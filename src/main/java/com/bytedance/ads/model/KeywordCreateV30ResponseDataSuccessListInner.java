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
import com.bytedance.ads.model.KeywordCreateV30DataSuccessListBidType;
import com.bytedance.ads.model.KeywordCreateV30DataSuccessListMatchType;
import com.bytedance.ads.model.KeywordCreateV30DataSuccessListStatus;
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
 * KeywordCreateV30ResponseDataSuccessListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T19:34:37.792107567+08:00[PRC]")
public class KeywordCreateV30ResponseDataSuccessListInner {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private KeywordCreateV30DataSuccessListBidType bidType = null;

  public static final String SERIALIZED_NAME_KEYWORD_ID = "keyword_id";
  @SerializedName(SERIALIZED_NAME_KEYWORD_ID)
  private Long keywordId = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private KeywordCreateV30DataSuccessListMatchType matchType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private KeywordCreateV30DataSuccessListStatus status = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public KeywordCreateV30ResponseDataSuccessListInner() {
  }

  public KeywordCreateV30ResponseDataSuccessListInner bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public KeywordCreateV30ResponseDataSuccessListInner bidType(KeywordCreateV30DataSuccessListBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public KeywordCreateV30DataSuccessListBidType getBidType() {
    return bidType;
  }


  public void setBidType(KeywordCreateV30DataSuccessListBidType bidType) {
    this.bidType = bidType;
  }


  public KeywordCreateV30ResponseDataSuccessListInner keywordId(Long keywordId) {
    
    this.keywordId = keywordId;
    return this;
  }

   /**
   * 
   * @return keywordId
  **/
  @javax.annotation.Nullable
  public Long getKeywordId() {
    return keywordId;
  }


  public void setKeywordId(Long keywordId) {
    this.keywordId = keywordId;
  }


  public KeywordCreateV30ResponseDataSuccessListInner matchType(KeywordCreateV30DataSuccessListMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  public KeywordCreateV30DataSuccessListMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(KeywordCreateV30DataSuccessListMatchType matchType) {
    this.matchType = matchType;
  }


  public KeywordCreateV30ResponseDataSuccessListInner status(KeywordCreateV30DataSuccessListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public KeywordCreateV30DataSuccessListStatus getStatus() {
    return status;
  }


  public void setStatus(KeywordCreateV30DataSuccessListStatus status) {
    this.status = status;
  }


  public KeywordCreateV30ResponseDataSuccessListInner word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * 
   * @return word
  **/
  @javax.annotation.Nullable
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordCreateV30ResponseDataSuccessListInner keywordCreateV30ResponseDataSuccessListInner = (KeywordCreateV30ResponseDataSuccessListInner) o;
    return Objects.equals(this.bid, keywordCreateV30ResponseDataSuccessListInner.bid) &&
        Objects.equals(this.bidType, keywordCreateV30ResponseDataSuccessListInner.bidType) &&
        Objects.equals(this.keywordId, keywordCreateV30ResponseDataSuccessListInner.keywordId) &&
        Objects.equals(this.matchType, keywordCreateV30ResponseDataSuccessListInner.matchType) &&
        Objects.equals(this.status, keywordCreateV30ResponseDataSuccessListInner.status) &&
        Objects.equals(this.word, keywordCreateV30ResponseDataSuccessListInner.word);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, bidType, keywordId, matchType, status, word);
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
    sb.append("class KeywordCreateV30ResponseDataSuccessListInner {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    keywordId: ").append(toIndentedString(keywordId)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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
    openapiFields.add("bid");
    openapiFields.add("bid_type");
    openapiFields.add("keyword_id");
    openapiFields.add("match_type");
    openapiFields.add("status");
    openapiFields.add("word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordCreateV30ResponseDataSuccessListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordCreateV30ResponseDataSuccessListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordCreateV30ResponseDataSuccessListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordCreateV30ResponseDataSuccessListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordCreateV30ResponseDataSuccessListInner>() {
           @Override
           public void write(JsonWriter out, KeywordCreateV30ResponseDataSuccessListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeywordCreateV30ResponseDataSuccessListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeywordCreateV30ResponseDataSuccessListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeywordCreateV30ResponseDataSuccessListInner
  * @throws IOException if the JSON string is invalid with respect to KeywordCreateV30ResponseDataSuccessListInner
  */
  public static KeywordCreateV30ResponseDataSuccessListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordCreateV30ResponseDataSuccessListInner.class);
  }

 /**
  * Convert an instance of KeywordCreateV30ResponseDataSuccessListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

