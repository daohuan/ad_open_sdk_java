/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAwemeBannedDeleteV30BannedType;
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
 * ToolsAwemeBannedDeleteV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsAwemeBannedDeleteV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_USER_IDS = "aweme_user_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_USER_IDS)
  private List<String> awemeUserIds = null;

  public static final String SERIALIZED_NAME_BANNED_TYPE = "banned_type";
  @SerializedName(SERIALIZED_NAME_BANNED_TYPE)
  private ToolsAwemeBannedDeleteV30BannedType bannedType = null;

  public static final String SERIALIZED_NAME_IS_APPLY_TO_ADV = "is_apply_to_adv";
  @SerializedName(SERIALIZED_NAME_IS_APPLY_TO_ADV)
  private Boolean isApplyToAdv = null;

  public static final String SERIALIZED_NAME_NICKNAME_KEYWORDS = "nickname_keywords";
  @SerializedName(SERIALIZED_NAME_NICKNAME_KEYWORDS)
  private List<String> nicknameKeywords = null;

  public ToolsAwemeBannedDeleteV30Request() {
  }

  public ToolsAwemeBannedDeleteV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsAwemeBannedDeleteV30Request awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号，当is_apply_to_adv不传或为false时，aweme_id生效
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public ToolsAwemeBannedDeleteV30Request awemeUserIds(List<String> awemeUserIds) {
    
    this.awemeUserIds = awemeUserIds;
    return this;
  }

  public ToolsAwemeBannedDeleteV30Request addAwemeUserIdsItem(String awemeUserIdsItem) {
    if (this.awemeUserIds == null) {
      this.awemeUserIds = new ArrayList<>();
    }
    this.awemeUserIds.add(awemeUserIdsItem);
    return this;
  }

   /**
   * 抖音用户id列表，传入屏蔽用户的抖音号； 当banned_type为AWEME_TYPE时必填，每次最多传50个抖音id，纯数字id不能以0开头；一个抖音号最多屏蔽5000个抖音ID。
   * @return awemeUserIds
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeUserIds() {
    return awemeUserIds;
  }


  public void setAwemeUserIds(List<String> awemeUserIds) {
    this.awemeUserIds = awemeUserIds;
  }


  public ToolsAwemeBannedDeleteV30Request bannedType(ToolsAwemeBannedDeleteV30BannedType bannedType) {
    
    this.bannedType = bannedType;
    return this;
  }

   /**
   * Get bannedType
   * @return bannedType
  **/
  @javax.annotation.Nonnull
  public ToolsAwemeBannedDeleteV30BannedType getBannedType() {
    return bannedType;
  }


  public void setBannedType(ToolsAwemeBannedDeleteV30BannedType bannedType) {
    this.bannedType = bannedType;
  }


  public ToolsAwemeBannedDeleteV30Request isApplyToAdv(Boolean isApplyToAdv) {
    
    this.isApplyToAdv = isApplyToAdv;
    return this;
  }

   /**
   * 是否应用于当前账户，当is_apply_to_adv不传或为false时，aweme_id生效
   * @return isApplyToAdv
  **/
  @javax.annotation.Nullable
  public Boolean getIsApplyToAdv() {
    return isApplyToAdv;
  }


  public void setIsApplyToAdv(Boolean isApplyToAdv) {
    this.isApplyToAdv = isApplyToAdv;
  }


  public ToolsAwemeBannedDeleteV30Request nicknameKeywords(List<String> nicknameKeywords) {
    
    this.nicknameKeywords = nicknameKeywords;
    return this;
  }

  public ToolsAwemeBannedDeleteV30Request addNicknameKeywordsItem(String nicknameKeywordsItem) {
    if (this.nicknameKeywords == null) {
      this.nicknameKeywords = new ArrayList<>();
    }
    this.nicknameKeywords.add(nicknameKeywordsItem);
    return this;
  }

   /**
   * 抖音昵称关键词列表， 当banned_type为CUSTOM_TYPE时必填，关键词长度不大于20个字；每次最多传50个关键词。
   * @return nicknameKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getNicknameKeywords() {
    return nicknameKeywords;
  }


  public void setNicknameKeywords(List<String> nicknameKeywords) {
    this.nicknameKeywords = nicknameKeywords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeBannedDeleteV30Request toolsAwemeBannedDeleteV30Request = (ToolsAwemeBannedDeleteV30Request) o;
    return Objects.equals(this.advertiserId, toolsAwemeBannedDeleteV30Request.advertiserId) &&
        Objects.equals(this.awemeId, toolsAwemeBannedDeleteV30Request.awemeId) &&
        Objects.equals(this.awemeUserIds, toolsAwemeBannedDeleteV30Request.awemeUserIds) &&
        Objects.equals(this.bannedType, toolsAwemeBannedDeleteV30Request.bannedType) &&
        Objects.equals(this.isApplyToAdv, toolsAwemeBannedDeleteV30Request.isApplyToAdv) &&
        Objects.equals(this.nicknameKeywords, toolsAwemeBannedDeleteV30Request.nicknameKeywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, awemeId, awemeUserIds, bannedType, isApplyToAdv, nicknameKeywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAwemeBannedDeleteV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeUserIds: ").append(toIndentedString(awemeUserIds)).append("\n");
    sb.append("    bannedType: ").append(toIndentedString(bannedType)).append("\n");
    sb.append("    isApplyToAdv: ").append(toIndentedString(isApplyToAdv)).append("\n");
    sb.append("    nicknameKeywords: ").append(toIndentedString(nicknameKeywords)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_user_ids");
    openapiFields.add("banned_type");
    openapiFields.add("is_apply_to_adv");
    openapiFields.add("nickname_keywords");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("banned_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeBannedDeleteV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeBannedDeleteV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeBannedDeleteV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeBannedDeleteV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeBannedDeleteV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeBannedDeleteV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeBannedDeleteV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeBannedDeleteV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeBannedDeleteV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeBannedDeleteV30Request
  */
  public static ToolsAwemeBannedDeleteV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeBannedDeleteV30Request.class);
  }

 /**
  * Convert an instance of ToolsAwemeBannedDeleteV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
