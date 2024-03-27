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
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class EventManagerOptimizedGoalGetV2V30ResponseData {
  public static final String SERIALIZED_NAME_ASSET_IDS = "asset_ids";
  @SerializedName(SERIALIZED_NAME_ASSET_IDS)
  private List<Long> assetIds = null;

  public static final String SERIALIZED_NAME_GOALS = "goals";
  @SerializedName(SERIALIZED_NAME_GOALS)
  private List<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner> goals = null;

  public EventManagerOptimizedGoalGetV2V30ResponseData() {
  }

  public EventManagerOptimizedGoalGetV2V30ResponseData assetIds(List<Long> assetIds) {
    
    this.assetIds = assetIds;
    return this;
  }

  public EventManagerOptimizedGoalGetV2V30ResponseData addAssetIdsItem(Long assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * 
   * @return assetIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAssetIds() {
    return assetIds;
  }


  public void setAssetIds(List<Long> assetIds) {
    this.assetIds = assetIds;
  }


  public EventManagerOptimizedGoalGetV2V30ResponseData goals(List<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner> goals) {
    
    this.goals = goals;
    return this;
  }

  public EventManagerOptimizedGoalGetV2V30ResponseData addGoalsItem(EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner goalsItem) {
    if (this.goals == null) {
      this.goals = new ArrayList<>();
    }
    this.goals.add(goalsItem);
    return this;
  }

   /**
   * 
   * @return goals
  **/
  @javax.annotation.Nullable
  public List<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner> getGoals() {
    return goals;
  }


  public void setGoals(List<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner> goals) {
    this.goals = goals;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerOptimizedGoalGetV2V30ResponseData eventManagerOptimizedGoalGetV2V30ResponseData = (EventManagerOptimizedGoalGetV2V30ResponseData) o;
    return Objects.equals(this.assetIds, eventManagerOptimizedGoalGetV2V30ResponseData.assetIds) &&
        Objects.equals(this.goals, eventManagerOptimizedGoalGetV2V30ResponseData.goals);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds, goals);
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
    sb.append("class EventManagerOptimizedGoalGetV2V30ResponseData {\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
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
    openapiFields.add("asset_ids");
    openapiFields.add("goals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerOptimizedGoalGetV2V30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerOptimizedGoalGetV2V30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerOptimizedGoalGetV2V30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerOptimizedGoalGetV2V30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerOptimizedGoalGetV2V30ResponseData>() {
           @Override
           public void write(JsonWriter out, EventManagerOptimizedGoalGetV2V30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerOptimizedGoalGetV2V30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerOptimizedGoalGetV2V30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerOptimizedGoalGetV2V30ResponseData
  * @throws IOException if the JSON string is invalid with respect to EventManagerOptimizedGoalGetV2V30ResponseData
  */
  public static EventManagerOptimizedGoalGetV2V30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerOptimizedGoalGetV2V30ResponseData.class);
  }

 /**
  * Convert an instance of EventManagerOptimizedGoalGetV2V30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

