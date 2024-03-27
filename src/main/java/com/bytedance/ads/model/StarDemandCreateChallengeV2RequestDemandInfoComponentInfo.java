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
 * 组件信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class StarDemandCreateChallengeV2RequestDemandInfoComponentInfo {
  public static final String SERIALIZED_NAME_INDUSTRY_COMPONENT_ID = "industry_component_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_COMPONENT_ID)
  private Long industryComponentId = null;

  public static final String SERIALIZED_NAME_LINK_COMPONENT_IDS = "link_component_ids";
  @SerializedName(SERIALIZED_NAME_LINK_COMPONENT_IDS)
  private List<Long> linkComponentIds = null;

  public static final String SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT_ID = "live_attract_component_id";
  @SerializedName(SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT_ID)
  private Long liveAttractComponentId = null;

  public StarDemandCreateChallengeV2RequestDemandInfoComponentInfo() {
  }

  public StarDemandCreateChallengeV2RequestDemandInfoComponentInfo industryComponentId(Long industryComponentId) {
    
    this.industryComponentId = industryComponentId;
    return this;
  }

   /**
   * 行业组件ID 行业组件不可与Link（常规）组件同时使用，目前仅支持游戏/电商/网服类型 考核指标为组件点击数、激活总数、安装完成数量和APP唤起时必填
   * @return industryComponentId
  **/
  @javax.annotation.Nullable
  public Long getIndustryComponentId() {
    return industryComponentId;
  }


  public void setIndustryComponentId(Long industryComponentId) {
    this.industryComponentId = industryComponentId;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoComponentInfo linkComponentIds(List<Long> linkComponentIds) {
    
    this.linkComponentIds = linkComponentIds;
    return this;
  }

  public StarDemandCreateChallengeV2RequestDemandInfoComponentInfo addLinkComponentIdsItem(Long linkComponentIdsItem) {
    if (this.linkComponentIds == null) {
      this.linkComponentIds = new ArrayList<>();
    }
    this.linkComponentIds.add(linkComponentIdsItem);
    return this;
  }

   /**
   * Link组件ID（落地页组件） 目前只支持1个，仅支持落地页类型
   * @return linkComponentIds
  **/
  @javax.annotation.Nullable
  public List<Long> getLinkComponentIds() {
    return linkComponentIds;
  }


  public void setLinkComponentIds(List<Long> linkComponentIds) {
    this.linkComponentIds = linkComponentIds;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoComponentInfo liveAttractComponentId(Long liveAttractComponentId) {
    
    this.liveAttractComponentId = liveAttractComponentId;
    return this;
  }

   /**
   * 直播引流组件ID
   * @return liveAttractComponentId
  **/
  @javax.annotation.Nullable
  public Long getLiveAttractComponentId() {
    return liveAttractComponentId;
  }


  public void setLiveAttractComponentId(Long liveAttractComponentId) {
    this.liveAttractComponentId = liveAttractComponentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2RequestDemandInfoComponentInfo starDemandCreateChallengeV2RequestDemandInfoComponentInfo = (StarDemandCreateChallengeV2RequestDemandInfoComponentInfo) o;
    return Objects.equals(this.industryComponentId, starDemandCreateChallengeV2RequestDemandInfoComponentInfo.industryComponentId) &&
        Objects.equals(this.linkComponentIds, starDemandCreateChallengeV2RequestDemandInfoComponentInfo.linkComponentIds) &&
        Objects.equals(this.liveAttractComponentId, starDemandCreateChallengeV2RequestDemandInfoComponentInfo.liveAttractComponentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(industryComponentId, linkComponentIds, liveAttractComponentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestDemandInfoComponentInfo {\n");
    sb.append("    industryComponentId: ").append(toIndentedString(industryComponentId)).append("\n");
    sb.append("    linkComponentIds: ").append(toIndentedString(linkComponentIds)).append("\n");
    sb.append("    liveAttractComponentId: ").append(toIndentedString(liveAttractComponentId)).append("\n");
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
    openapiFields.add("industry_component_id");
    openapiFields.add("link_component_ids");
    openapiFields.add("live_attract_component_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestDemandInfoComponentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestDemandInfoComponentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoComponentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestDemandInfoComponentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoComponentInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestDemandInfoComponentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestDemandInfoComponentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestDemandInfoComponentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestDemandInfoComponentInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestDemandInfoComponentInfo
  */
  public static StarDemandCreateChallengeV2RequestDemandInfoComponentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestDemandInfoComponentInfo.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestDemandInfoComponentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

