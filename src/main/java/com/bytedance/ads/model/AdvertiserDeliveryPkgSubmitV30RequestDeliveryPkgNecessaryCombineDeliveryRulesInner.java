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
import com.bytedance.ads.model.AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner;
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
 * AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner {
  public static final String SERIALIZED_NAME_DELIVERIES = "deliveries";
  @SerializedName(SERIALIZED_NAME_DELIVERIES)
  private List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner> deliveries = null;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private Long ruleId = null;

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner() {
  }

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner deliveries(List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner> deliveries) {
    
    this.deliveries = deliveries;
    return this;
  }

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner addDeliveriesItem(AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner deliveriesItem) {
    if (this.deliveries == null) {
      this.deliveries = new ArrayList<>();
    }
    this.deliveries.add(deliveriesItem);
    return this;
  }

   /**
   * 具体的资质信息，数组长度最小为1
   * @return deliveries
  **/
  @javax.annotation.Nonnull
  public List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner> getDeliveries() {
    return deliveries;
  }


  public void setDeliveries(List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner> deliveries) {
    this.deliveries = deliveries;
  }


  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner ruleId(Long ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * 资质的规则id，来自【推广产品资质规则配置查询接口】
   * @return ruleId
  **/
  @javax.annotation.Nonnull
  public Long getRuleId() {
    return ruleId;
  }


  public void setRuleId(Long ruleId) {
    this.ruleId = ruleId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner = (AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner) o;
    return Objects.equals(this.deliveries, advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner.deliveries) &&
        Objects.equals(this.ruleId, advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveries, ruleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner {\n");
    sb.append("    deliveries: ").append(toIndentedString(deliveries)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
    openapiFields.add("deliveries");
    openapiFields.add("rule_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("deliveries");
    openapiRequiredFields.add("rule_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner
  */
  public static AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

