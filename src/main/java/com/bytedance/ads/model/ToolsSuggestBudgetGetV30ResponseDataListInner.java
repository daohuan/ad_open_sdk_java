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
 * ToolsSuggestBudgetGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class ToolsSuggestBudgetGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_PROMOTION_BUDGET = "promotion_budget";
  @SerializedName(SERIALIZED_NAME_PROMOTION_BUDGET)
  private Double promotionBudget = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_SUGGEST_BUDGET = "suggest_budget";
  @SerializedName(SERIALIZED_NAME_SUGGEST_BUDGET)
  private Double suggestBudget = null;

  public ToolsSuggestBudgetGetV30ResponseDataListInner() {
  }

  public ToolsSuggestBudgetGetV30ResponseDataListInner promotionBudget(Double promotionBudget) {
    
    this.promotionBudget = promotionBudget;
    return this;
  }

   /**
   * 广告预算
   * @return promotionBudget
  **/
  @javax.annotation.Nullable
  public Double getPromotionBudget() {
    return promotionBudget;
  }


  public void setPromotionBudget(Double promotionBudget) {
    this.promotionBudget = promotionBudget;
  }


  public ToolsSuggestBudgetGetV30ResponseDataListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 广告ID
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public ToolsSuggestBudgetGetV30ResponseDataListInner suggestBudget(Double suggestBudget) {
    
    this.suggestBudget = suggestBudget;
    return this;
  }

   /**
   * 建议起量预算
   * @return suggestBudget
  **/
  @javax.annotation.Nullable
  public Double getSuggestBudget() {
    return suggestBudget;
  }


  public void setSuggestBudget(Double suggestBudget) {
    this.suggestBudget = suggestBudget;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSuggestBudgetGetV30ResponseDataListInner toolsSuggestBudgetGetV30ResponseDataListInner = (ToolsSuggestBudgetGetV30ResponseDataListInner) o;
    return Objects.equals(this.promotionBudget, toolsSuggestBudgetGetV30ResponseDataListInner.promotionBudget) &&
        Objects.equals(this.promotionId, toolsSuggestBudgetGetV30ResponseDataListInner.promotionId) &&
        Objects.equals(this.suggestBudget, toolsSuggestBudgetGetV30ResponseDataListInner.suggestBudget);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionBudget, promotionId, suggestBudget);
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
    sb.append("class ToolsSuggestBudgetGetV30ResponseDataListInner {\n");
    sb.append("    promotionBudget: ").append(toIndentedString(promotionBudget)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    suggestBudget: ").append(toIndentedString(suggestBudget)).append("\n");
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
    openapiFields.add("promotion_budget");
    openapiFields.add("promotion_id");
    openapiFields.add("suggest_budget");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSuggestBudgetGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSuggestBudgetGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSuggestBudgetGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSuggestBudgetGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSuggestBudgetGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsSuggestBudgetGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSuggestBudgetGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSuggestBudgetGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSuggestBudgetGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSuggestBudgetGetV30ResponseDataListInner
  */
  public static ToolsSuggestBudgetGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSuggestBudgetGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsSuggestBudgetGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

