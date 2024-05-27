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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo {
  public static final String SERIALIZED_NAME_MAX_INCOME = "max_income";
  @SerializedName(SERIALIZED_NAME_MAX_INCOME)
  private Long maxIncome = null;

  public static final String SERIALIZED_NAME_REWARD_DEADLINE = "reward_deadline";
  @SerializedName(SERIALIZED_NAME_REWARD_DEADLINE)
  private Long rewardDeadline = null;

  public static final String SERIALIZED_NAME_REWARD_RULE = "reward_rule";
  @SerializedName(SERIALIZED_NAME_REWARD_RULE)
  private String rewardRule = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo maxIncome(Long maxIncome) {
    
    this.maxIncome = maxIncome;
    return this;
  }

   /**
   * 
   * @return maxIncome
  **/
  @javax.annotation.Nullable
  public Long getMaxIncome() {
    return maxIncome;
  }


  public void setMaxIncome(Long maxIncome) {
    this.maxIncome = maxIncome;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo rewardDeadline(Long rewardDeadline) {
    
    this.rewardDeadline = rewardDeadline;
    return this;
  }

   /**
   * 
   * @return rewardDeadline
  **/
  @javax.annotation.Nullable
  public Long getRewardDeadline() {
    return rewardDeadline;
  }


  public void setRewardDeadline(Long rewardDeadline) {
    this.rewardDeadline = rewardDeadline;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo rewardRule(String rewardRule) {
    
    this.rewardRule = rewardRule;
    return this;
  }

   /**
   * 
   * @return rewardRule
  **/
  @javax.annotation.Nullable
  public String getRewardRule() {
    return rewardRule;
  }


  public void setRewardRule(String rewardRule) {
    this.rewardRule = rewardRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo = (StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo) o;
    return Objects.equals(this.maxIncome, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo.maxIncome) &&
        Objects.equals(this.rewardDeadline, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo.rewardDeadline) &&
        Objects.equals(this.rewardRule, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo.rewardRule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxIncome, rewardDeadline, rewardRule);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo {\n");
    sb.append("    maxIncome: ").append(toIndentedString(maxIncome)).append("\n");
    sb.append("    rewardDeadline: ").append(toIndentedString(rewardDeadline)).append("\n");
    sb.append("    rewardRule: ").append(toIndentedString(rewardRule)).append("\n");
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
    openapiFields.add("max_income");
    openapiFields.add("reward_deadline");
    openapiFields.add("reward_rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

