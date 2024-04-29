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
import com.bytedance.ads.model.QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard {
  public static final String SERIALIZED_NAME_PROMOTION_CARD_ACTION_BUTTON = "promotion_card_action_button";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_ACTION_BUTTON)
  private String promotionCardActionButton = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_BUTTON_SMART_OPTIMIZATION = "promotion_card_button_smart_optimization";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_BUTTON_SMART_OPTIMIZATION)
  private QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization promotionCardButtonSmartOptimization = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_IMAGE_ID = "promotion_card_image_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_IMAGE_ID)
  private String promotionCardImageId = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_SELLING_POINTS = "promotion_card_selling_points";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_SELLING_POINTS)
  private List<String> promotionCardSellingPoints = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_TITLE = "promotion_card_title";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_TITLE)
  private String promotionCardTitle = null;

  public QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard() {
  }

  public QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardActionButton(String promotionCardActionButton) {
    
    this.promotionCardActionButton = promotionCardActionButton;
    return this;
  }

   /**
   * 
   * @return promotionCardActionButton
  **/
  @javax.annotation.Nullable
  public String getPromotionCardActionButton() {
    return promotionCardActionButton;
  }


  public void setPromotionCardActionButton(String promotionCardActionButton) {
    this.promotionCardActionButton = promotionCardActionButton;
  }


  public QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardButtonSmartOptimization(QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization promotionCardButtonSmartOptimization) {
    
    this.promotionCardButtonSmartOptimization = promotionCardButtonSmartOptimization;
    return this;
  }

   /**
   * Get promotionCardButtonSmartOptimization
   * @return promotionCardButtonSmartOptimization
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization getPromotionCardButtonSmartOptimization() {
    return promotionCardButtonSmartOptimization;
  }


  public void setPromotionCardButtonSmartOptimization(QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization promotionCardButtonSmartOptimization) {
    this.promotionCardButtonSmartOptimization = promotionCardButtonSmartOptimization;
  }


  public QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardImageId(String promotionCardImageId) {
    
    this.promotionCardImageId = promotionCardImageId;
    return this;
  }

   /**
   * 
   * @return promotionCardImageId
  **/
  @javax.annotation.Nullable
  public String getPromotionCardImageId() {
    return promotionCardImageId;
  }


  public void setPromotionCardImageId(String promotionCardImageId) {
    this.promotionCardImageId = promotionCardImageId;
  }


  public QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardSellingPoints(List<String> promotionCardSellingPoints) {
    
    this.promotionCardSellingPoints = promotionCardSellingPoints;
    return this;
  }

  public QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard addPromotionCardSellingPointsItem(String promotionCardSellingPointsItem) {
    if (this.promotionCardSellingPoints == null) {
      this.promotionCardSellingPoints = new ArrayList<>();
    }
    this.promotionCardSellingPoints.add(promotionCardSellingPointsItem);
    return this;
  }

   /**
   * 
   * @return promotionCardSellingPoints
  **/
  @javax.annotation.Nullable
  public List<String> getPromotionCardSellingPoints() {
    return promotionCardSellingPoints;
  }


  public void setPromotionCardSellingPoints(List<String> promotionCardSellingPoints) {
    this.promotionCardSellingPoints = promotionCardSellingPoints;
  }


  public QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardTitle(String promotionCardTitle) {
    
    this.promotionCardTitle = promotionCardTitle;
    return this;
  }

   /**
   * 
   * @return promotionCardTitle
  **/
  @javax.annotation.Nullable
  public String getPromotionCardTitle() {
    return promotionCardTitle;
  }


  public void setPromotionCardTitle(String promotionCardTitle) {
    this.promotionCardTitle = promotionCardTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard qianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard = (QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard) o;
    return Objects.equals(this.promotionCardActionButton, qianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardActionButton) &&
        Objects.equals(this.promotionCardButtonSmartOptimization, qianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardButtonSmartOptimization) &&
        Objects.equals(this.promotionCardImageId, qianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardImageId) &&
        Objects.equals(this.promotionCardSellingPoints, qianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardSellingPoints) &&
        Objects.equals(this.promotionCardTitle, qianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionCardActionButton, promotionCardButtonSmartOptimization, promotionCardImageId, promotionCardSellingPoints, promotionCardTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard {\n");
    sb.append("    promotionCardActionButton: ").append(toIndentedString(promotionCardActionButton)).append("\n");
    sb.append("    promotionCardButtonSmartOptimization: ").append(toIndentedString(promotionCardButtonSmartOptimization)).append("\n");
    sb.append("    promotionCardImageId: ").append(toIndentedString(promotionCardImageId)).append("\n");
    sb.append("    promotionCardSellingPoints: ").append(toIndentedString(promotionCardSellingPoints)).append("\n");
    sb.append("    promotionCardTitle: ").append(toIndentedString(promotionCardTitle)).append("\n");
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
    openapiFields.add("promotion_card_action_button");
    openapiFields.add("promotion_card_button_smart_optimization");
    openapiFields.add("promotion_card_image_id");
    openapiFields.add("promotion_card_selling_points");
    openapiFields.add("promotion_card_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard
  */
  public static QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

