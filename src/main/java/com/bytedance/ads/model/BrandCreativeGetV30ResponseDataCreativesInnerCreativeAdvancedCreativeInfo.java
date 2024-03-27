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
import com.bytedance.ads.model.BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoCard;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard;
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
 * 附加创意
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo {
  public static final String SERIALIZED_NAME_ADVANCED_CREATIVE_TYPE = "advanced_creative_type";
  @SerializedName(SERIALIZED_NAME_ADVANCED_CREATIVE_TYPE)
  private BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType advancedCreativeType = null;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoCard card = null;

  public static final String SERIALIZED_NAME_LIVE_CARD = "live_card";
  @SerializedName(SERIALIZED_NAME_LIVE_CARD)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard liveCard = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo advancedCreativeType(BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType advancedCreativeType) {
    
    this.advancedCreativeType = advancedCreativeType;
    return this;
  }

   /**
   * Get advancedCreativeType
   * @return advancedCreativeType
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType getAdvancedCreativeType() {
    return advancedCreativeType;
  }


  public void setAdvancedCreativeType(BrandCreativeGetV30DataCreativesCreativeAdvancedCreativeInfoAdvancedCreativeType advancedCreativeType) {
    this.advancedCreativeType = advancedCreativeType;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo card(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoCard card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoCard getCard() {
    return card;
  }


  public void setCard(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoCard card) {
    this.card = card;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo liveCard(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard liveCard) {
    
    this.liveCard = liveCard;
    return this;
  }

   /**
   * Get liveCard
   * @return liveCard
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard getLiveCard() {
    return liveCard;
  }


  public void setLiveCard(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfoLiveCard liveCard) {
    this.liveCard = liveCard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo brandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo) o;
    return Objects.equals(this.advancedCreativeType, brandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo.advancedCreativeType) &&
        Objects.equals(this.card, brandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo.card) &&
        Objects.equals(this.liveCard, brandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo.liveCard);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedCreativeType, card, liveCard);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo {\n");
    sb.append("    advancedCreativeType: ").append(toIndentedString(advancedCreativeType)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    liveCard: ").append(toIndentedString(liveCard)).append("\n");
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
    openapiFields.add("advanced_creative_type");
    openapiFields.add("card");
    openapiFields.add("live_card");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeAdvancedCreativeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

