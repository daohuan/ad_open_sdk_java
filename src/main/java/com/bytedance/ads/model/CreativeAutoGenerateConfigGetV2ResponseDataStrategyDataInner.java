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
import com.bytedance.ads.model.CreativeAutoGenerateConfigGetV2DataStrategyDataType;
import com.bytedance.ads.model.CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerInfo;
import com.bytedance.ads.model.CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerStrategyStateInner;
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
 * CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner {
  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerInfo info = null;

  public static final String SERIALIZED_NAME_STRATEGY_ID = "strategy_id";
  @SerializedName(SERIALIZED_NAME_STRATEGY_ID)
  private Long strategyId = null;

  public static final String SERIALIZED_NAME_STRATEGY_NAME = "strategy_name";
  @SerializedName(SERIALIZED_NAME_STRATEGY_NAME)
  private String strategyName = null;

  public static final String SERIALIZED_NAME_STRATEGY_STATE = "strategy_state";
  @SerializedName(SERIALIZED_NAME_STRATEGY_STATE)
  private List<CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerStrategyStateInner> strategyState = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CreativeAutoGenerateConfigGetV2DataStrategyDataType type = null;

  public CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner() {
  }

  public CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner info(CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerInfo info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nullable
  public CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerInfo getInfo() {
    return info;
  }


  public void setInfo(CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerInfo info) {
    this.info = info;
  }


  public CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner strategyId(Long strategyId) {
    
    this.strategyId = strategyId;
    return this;
  }

   /**
   * 策略id
   * @return strategyId
  **/
  @javax.annotation.Nullable
  public Long getStrategyId() {
    return strategyId;
  }


  public void setStrategyId(Long strategyId) {
    this.strategyId = strategyId;
  }


  public CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner strategyName(String strategyName) {
    
    this.strategyName = strategyName;
    return this;
  }

   /**
   * 策略名称
   * @return strategyName
  **/
  @javax.annotation.Nullable
  public String getStrategyName() {
    return strategyName;
  }


  public void setStrategyName(String strategyName) {
    this.strategyName = strategyName;
  }


  public CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner strategyState(List<CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerStrategyStateInner> strategyState) {
    
    this.strategyState = strategyState;
    return this;
  }

  public CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner addStrategyStateItem(CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerStrategyStateInner strategyStateItem) {
    if (this.strategyState == null) {
      this.strategyState = new ArrayList<>();
    }
    this.strategyState.add(strategyStateItem);
    return this;
  }

   /**
   * 策略配置项列表
   * @return strategyState
  **/
  @javax.annotation.Nullable
  public List<CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerStrategyStateInner> getStrategyState() {
    return strategyState;
  }


  public void setStrategyState(List<CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInnerStrategyStateInner> strategyState) {
    this.strategyState = strategyState;
  }


  public CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner type(CreativeAutoGenerateConfigGetV2DataStrategyDataType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public CreativeAutoGenerateConfigGetV2DataStrategyDataType getType() {
    return type;
  }


  public void setType(CreativeAutoGenerateConfigGetV2DataStrategyDataType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner creativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner = (CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner) o;
    return Objects.equals(this.info, creativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner.info) &&
        Objects.equals(this.strategyId, creativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner.strategyId) &&
        Objects.equals(this.strategyName, creativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner.strategyName) &&
        Objects.equals(this.strategyState, creativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner.strategyState) &&
        Objects.equals(this.type, creativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, strategyId, strategyName, strategyState, type);
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
    sb.append("class CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner {\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
    sb.append("    strategyName: ").append(toIndentedString(strategyName)).append("\n");
    sb.append("    strategyState: ").append(toIndentedString(strategyState)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("info");
    openapiFields.add("strategy_id");
    openapiFields.add("strategy_name");
    openapiFields.add("strategy_state");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("strategy_id");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner>() {
           @Override
           public void write(JsonWriter out, CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner
  * @throws IOException if the JSON string is invalid with respect to CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner
  */
  public static CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner.class);
  }

 /**
  * Convert an instance of CreativeAutoGenerateConfigGetV2ResponseDataStrategyDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

