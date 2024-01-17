/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo {
  public static final String SERIALIZED_NAME_INDUSTRY_COMPONENT_ID = "industry_component_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_COMPONENT_ID)
  private Long industryComponentId = null;

  public static final String SERIALIZED_NAME_LINK_COMPONENT_IDS = "link_component_ids";
  @SerializedName(SERIALIZED_NAME_LINK_COMPONENT_IDS)
  private List<Long> linkComponentIds = null;

  public static final String SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT_ID = "live_attract_component_id";
  @SerializedName(SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT_ID)
  private Long liveAttractComponentId = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo industryComponentId(Long industryComponentId) {
    
    this.industryComponentId = industryComponentId;
    return this;
  }

   /**
   * 
   * @return industryComponentId
  **/
  @javax.annotation.Nullable
  public Long getIndustryComponentId() {
    return industryComponentId;
  }


  public void setIndustryComponentId(Long industryComponentId) {
    this.industryComponentId = industryComponentId;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo linkComponentIds(List<Long> linkComponentIds) {
    
    this.linkComponentIds = linkComponentIds;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo addLinkComponentIdsItem(Long linkComponentIdsItem) {
    if (this.linkComponentIds == null) {
      this.linkComponentIds = new ArrayList<>();
    }
    this.linkComponentIds.add(linkComponentIdsItem);
    return this;
  }

   /**
   * 
   * @return linkComponentIds
  **/
  @javax.annotation.Nullable
  public List<Long> getLinkComponentIds() {
    return linkComponentIds;
  }


  public void setLinkComponentIds(List<Long> linkComponentIds) {
    this.linkComponentIds = linkComponentIds;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo liveAttractComponentId(Long liveAttractComponentId) {
    
    this.liveAttractComponentId = liveAttractComponentId;
    return this;
  }

   /**
   * 
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
    StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo = (StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo) o;
    return Objects.equals(this.industryComponentId, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo.industryComponentId) &&
        Objects.equals(this.linkComponentIds, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo.linkComponentIds) &&
        Objects.equals(this.liveAttractComponentId, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo.liveAttractComponentId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(industryComponentId, linkComponentIds, liveAttractComponentId);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo {\n");
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
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
