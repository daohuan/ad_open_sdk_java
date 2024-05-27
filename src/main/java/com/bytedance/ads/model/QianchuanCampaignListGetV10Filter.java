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
import com.bytedance.ads.model.QianchuanCampaignListGetV10FilterMarketingGoal;
import com.bytedance.ads.model.QianchuanCampaignListGetV10FilterMarketingScene;
import com.bytedance.ads.model.QianchuanCampaignListGetV10FilterStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class QianchuanCampaignListGetV10Filter {
  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanCampaignListGetV10FilterMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanCampaignListGetV10FilterMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanCampaignListGetV10FilterStatus status = null;

  public QianchuanCampaignListGetV10Filter() {
  }

  public QianchuanCampaignListGetV10Filter ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public QianchuanCampaignListGetV10Filter addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<Long> getIds() {
    return ids;
  }


  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public QianchuanCampaignListGetV10Filter marketingGoal(QianchuanCampaignListGetV10FilterMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanCampaignListGetV10FilterMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanCampaignListGetV10FilterMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanCampaignListGetV10Filter marketingScene(QianchuanCampaignListGetV10FilterMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanCampaignListGetV10FilterMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanCampaignListGetV10FilterMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanCampaignListGetV10Filter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QianchuanCampaignListGetV10Filter status(QianchuanCampaignListGetV10FilterStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanCampaignListGetV10FilterStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanCampaignListGetV10FilterStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCampaignListGetV10Filter qianchuanCampaignListGetV10Filter = (QianchuanCampaignListGetV10Filter) o;
    return Objects.equals(this.ids, qianchuanCampaignListGetV10Filter.ids) &&
        Objects.equals(this.marketingGoal, qianchuanCampaignListGetV10Filter.marketingGoal) &&
        Objects.equals(this.marketingScene, qianchuanCampaignListGetV10Filter.marketingScene) &&
        Objects.equals(this.name, qianchuanCampaignListGetV10Filter.name) &&
        Objects.equals(this.status, qianchuanCampaignListGetV10Filter.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, marketingGoal, marketingScene, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanCampaignListGetV10Filter {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("ids");
    openapiFields.add("marketing_goal");
    openapiFields.add("marketing_scene");
    openapiFields.add("name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCampaignListGetV10Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCampaignListGetV10Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCampaignListGetV10Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCampaignListGetV10Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCampaignListGetV10Filter>() {
           @Override
           public void write(JsonWriter out, QianchuanCampaignListGetV10Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCampaignListGetV10Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCampaignListGetV10Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCampaignListGetV10Filter
  * @throws IOException if the JSON string is invalid with respect to QianchuanCampaignListGetV10Filter
  */
  public static QianchuanCampaignListGetV10Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCampaignListGetV10Filter.class);
  }

 /**
  * Convert an instance of QianchuanCampaignListGetV10Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

