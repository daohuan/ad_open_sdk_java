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
import com.bytedance.ads.model.DouplusOrderListV30DataOrderListOrderLiveScene;
import com.bytedance.ads.model.DouplusOrderListV30DataOrderListOrderSceneType;
import com.bytedance.ads.model.DouplusOrderListV30DataOrderListOrderTaskStatus;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class DouplusOrderListV30ResponseDataOrderListInnerOrder {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_LIVE_SCENE = "live_scene";
  @SerializedName(SERIALIZED_NAME_LIVE_SCENE)
  private DouplusOrderListV30DataOrderListOrderLiveScene liveScene = null;

  public static final String SERIALIZED_NAME_ORDER_CREATE_TIME = "order_create_time";
  @SerializedName(SERIALIZED_NAME_ORDER_CREATE_TIME)
  private String orderCreateTime = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_SCENE_TYPE = "scene_type";
  @SerializedName(SERIALIZED_NAME_SCENE_TYPE)
  private DouplusOrderListV30DataOrderListOrderSceneType sceneType = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public static final String SERIALIZED_NAME_TASK_STATUS = "task_status";
  @SerializedName(SERIALIZED_NAME_TASK_STATUS)
  private DouplusOrderListV30DataOrderListOrderTaskStatus taskStatus = null;

  public DouplusOrderListV30ResponseDataOrderListInnerOrder() {
  }

  public DouplusOrderListV30ResponseDataOrderListInnerOrder budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerOrder liveScene(DouplusOrderListV30DataOrderListOrderLiveScene liveScene) {
    
    this.liveScene = liveScene;
    return this;
  }

   /**
   * Get liveScene
   * @return liveScene
  **/
  @javax.annotation.Nullable
  public DouplusOrderListV30DataOrderListOrderLiveScene getLiveScene() {
    return liveScene;
  }


  public void setLiveScene(DouplusOrderListV30DataOrderListOrderLiveScene liveScene) {
    this.liveScene = liveScene;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerOrder orderCreateTime(String orderCreateTime) {
    
    this.orderCreateTime = orderCreateTime;
    return this;
  }

   /**
   * 
   * @return orderCreateTime
  **/
  @javax.annotation.Nullable
  public String getOrderCreateTime() {
    return orderCreateTime;
  }


  public void setOrderCreateTime(String orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerOrder orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerOrder sceneType(DouplusOrderListV30DataOrderListOrderSceneType sceneType) {
    
    this.sceneType = sceneType;
    return this;
  }

   /**
   * Get sceneType
   * @return sceneType
  **/
  @javax.annotation.Nullable
  public DouplusOrderListV30DataOrderListOrderSceneType getSceneType() {
    return sceneType;
  }


  public void setSceneType(DouplusOrderListV30DataOrderListOrderSceneType sceneType) {
    this.sceneType = sceneType;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerOrder taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 
   * @return taskId
  **/
  @javax.annotation.Nullable
  public Long getTaskId() {
    return taskId;
  }


  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerOrder taskStatus(DouplusOrderListV30DataOrderListOrderTaskStatus taskStatus) {
    
    this.taskStatus = taskStatus;
    return this;
  }

   /**
   * Get taskStatus
   * @return taskStatus
  **/
  @javax.annotation.Nullable
  public DouplusOrderListV30DataOrderListOrderTaskStatus getTaskStatus() {
    return taskStatus;
  }


  public void setTaskStatus(DouplusOrderListV30DataOrderListOrderTaskStatus taskStatus) {
    this.taskStatus = taskStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderListV30ResponseDataOrderListInnerOrder douplusOrderListV30ResponseDataOrderListInnerOrder = (DouplusOrderListV30ResponseDataOrderListInnerOrder) o;
    return Objects.equals(this.budget, douplusOrderListV30ResponseDataOrderListInnerOrder.budget) &&
        Objects.equals(this.liveScene, douplusOrderListV30ResponseDataOrderListInnerOrder.liveScene) &&
        Objects.equals(this.orderCreateTime, douplusOrderListV30ResponseDataOrderListInnerOrder.orderCreateTime) &&
        Objects.equals(this.orderId, douplusOrderListV30ResponseDataOrderListInnerOrder.orderId) &&
        Objects.equals(this.sceneType, douplusOrderListV30ResponseDataOrderListInnerOrder.sceneType) &&
        Objects.equals(this.taskId, douplusOrderListV30ResponseDataOrderListInnerOrder.taskId) &&
        Objects.equals(this.taskStatus, douplusOrderListV30ResponseDataOrderListInnerOrder.taskStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, liveScene, orderCreateTime, orderId, sceneType, taskId, taskStatus);
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
    sb.append("class DouplusOrderListV30ResponseDataOrderListInnerOrder {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    liveScene: ").append(toIndentedString(liveScene)).append("\n");
    sb.append("    orderCreateTime: ").append(toIndentedString(orderCreateTime)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    sceneType: ").append(toIndentedString(sceneType)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("live_scene");
    openapiFields.add("order_create_time");
    openapiFields.add("order_id");
    openapiFields.add("scene_type");
    openapiFields.add("task_id");
    openapiFields.add("task_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderListV30ResponseDataOrderListInnerOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderListV30ResponseDataOrderListInnerOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderListV30ResponseDataOrderListInnerOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerOrder>() {
           @Override
           public void write(JsonWriter out, DouplusOrderListV30ResponseDataOrderListInnerOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderListV30ResponseDataOrderListInnerOrder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderListV30ResponseDataOrderListInnerOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderListV30ResponseDataOrderListInnerOrder
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderListV30ResponseDataOrderListInnerOrder
  */
  public static DouplusOrderListV30ResponseDataOrderListInnerOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderListV30ResponseDataOrderListInnerOrder.class);
  }

 /**
  * Convert an instance of DouplusOrderListV30ResponseDataOrderListInnerOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

