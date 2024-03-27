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
public class DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData {
  public static final String SERIALIZED_NAME_CUSTOM_CONVERT_COST = "custom_convert_cost";
  @SerializedName(SERIALIZED_NAME_CUSTOM_CONVERT_COST)
  private Long customConvertCost = null;

  public static final String SERIALIZED_NAME_CUSTOM_LIKE = "custom_like";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LIKE)
  private Long customLike = null;

  public static final String SERIALIZED_NAME_DOUPLUS_LIVE_FOLLOW_COUNT = "douplus_live_follow_count";
  @SerializedName(SERIALIZED_NAME_DOUPLUS_LIVE_FOLLOW_COUNT)
  private Long douplusLiveFollowCount = null;

  public static final String SERIALIZED_NAME_DP_TARGET_CONVERT_CNT = "dp_target_convert_cnt";
  @SerializedName(SERIALIZED_NAME_DP_TARGET_CONVERT_CNT)
  private Long dpTargetConvertCnt = null;

  public static final String SERIALIZED_NAME_DY_COMMENT = "dy_comment";
  @SerializedName(SERIALIZED_NAME_DY_COMMENT)
  private Long dyComment = null;

  public static final String SERIALIZED_NAME_DY_FOLLOW = "dy_follow";
  @SerializedName(SERIALIZED_NAME_DY_FOLLOW)
  private Long dyFollow = null;

  public static final String SERIALIZED_NAME_DY_HOME_VISITED = "dy_home_visited";
  @SerializedName(SERIALIZED_NAME_DY_HOME_VISITED)
  private Long dyHomeVisited = null;

  public static final String SERIALIZED_NAME_DY_SHARE = "dy_share";
  @SerializedName(SERIALIZED_NAME_DY_SHARE)
  private Long dyShare = null;

  public static final String SERIALIZED_NAME_LIVE_CLICK_SOURCE_CNT = "live_click_source_cnt";
  @SerializedName(SERIALIZED_NAME_LIVE_CLICK_SOURCE_CNT)
  private Long liveClickSourceCnt = null;

  public static final String SERIALIZED_NAME_LIVE_COMMENT_CNT = "live_comment_cnt";
  @SerializedName(SERIALIZED_NAME_LIVE_COMMENT_CNT)
  private Long liveCommentCnt = null;

  public static final String SERIALIZED_NAME_LIVE_GIFT_AMOUNT = "live_gift_amount";
  @SerializedName(SERIALIZED_NAME_LIVE_GIFT_AMOUNT)
  private Long liveGiftAmount = null;

  public static final String SERIALIZED_NAME_LIVE_GIFT_CNT = "live_gift_cnt";
  @SerializedName(SERIALIZED_NAME_LIVE_GIFT_CNT)
  private Long liveGiftCnt = null;

  public static final String SERIALIZED_NAME_LIVE_GIFT_UV = "live_gift_uv";
  @SerializedName(SERIALIZED_NAME_LIVE_GIFT_UV)
  private Long liveGiftUv = null;

  public static final String SERIALIZED_NAME_PLAY_DURATION5S_RANK = "play_duration_5s_rank";
  @SerializedName(SERIALIZED_NAME_PLAY_DURATION5S_RANK)
  private Double playDuration5sRank = null;

  public static final String SERIALIZED_NAME_SHOW_CNT = "show_cnt";
  @SerializedName(SERIALIZED_NAME_SHOW_CNT)
  private Long showCnt = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Long statCost = null;

  public static final String SERIALIZED_NAME_TOTAL_PLAY = "total_play";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLAY)
  private Long totalPlay = null;

  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData() {
  }

  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData customConvertCost(Long customConvertCost) {
    
    this.customConvertCost = customConvertCost;
    return this;
  }

   /**
   * 
   * @return customConvertCost
  **/
  @javax.annotation.Nullable
  public Long getCustomConvertCost() {
    return customConvertCost;
  }


  public void setCustomConvertCost(Long customConvertCost) {
    this.customConvertCost = customConvertCost;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData customLike(Long customLike) {
    
    this.customLike = customLike;
    return this;
  }

   /**
   * 
   * @return customLike
  **/
  @javax.annotation.Nullable
  public Long getCustomLike() {
    return customLike;
  }


  public void setCustomLike(Long customLike) {
    this.customLike = customLike;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData douplusLiveFollowCount(Long douplusLiveFollowCount) {
    
    this.douplusLiveFollowCount = douplusLiveFollowCount;
    return this;
  }

   /**
   * 
   * @return douplusLiveFollowCount
  **/
  @javax.annotation.Nullable
  public Long getDouplusLiveFollowCount() {
    return douplusLiveFollowCount;
  }


  public void setDouplusLiveFollowCount(Long douplusLiveFollowCount) {
    this.douplusLiveFollowCount = douplusLiveFollowCount;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData dpTargetConvertCnt(Long dpTargetConvertCnt) {
    
    this.dpTargetConvertCnt = dpTargetConvertCnt;
    return this;
  }

   /**
   * 
   * @return dpTargetConvertCnt
  **/
  @javax.annotation.Nullable
  public Long getDpTargetConvertCnt() {
    return dpTargetConvertCnt;
  }


  public void setDpTargetConvertCnt(Long dpTargetConvertCnt) {
    this.dpTargetConvertCnt = dpTargetConvertCnt;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData dyComment(Long dyComment) {
    
    this.dyComment = dyComment;
    return this;
  }

   /**
   * 
   * @return dyComment
  **/
  @javax.annotation.Nullable
  public Long getDyComment() {
    return dyComment;
  }


  public void setDyComment(Long dyComment) {
    this.dyComment = dyComment;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData dyFollow(Long dyFollow) {
    
    this.dyFollow = dyFollow;
    return this;
  }

   /**
   * 
   * @return dyFollow
  **/
  @javax.annotation.Nullable
  public Long getDyFollow() {
    return dyFollow;
  }


  public void setDyFollow(Long dyFollow) {
    this.dyFollow = dyFollow;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData dyHomeVisited(Long dyHomeVisited) {
    
    this.dyHomeVisited = dyHomeVisited;
    return this;
  }

   /**
   * 
   * @return dyHomeVisited
  **/
  @javax.annotation.Nullable
  public Long getDyHomeVisited() {
    return dyHomeVisited;
  }


  public void setDyHomeVisited(Long dyHomeVisited) {
    this.dyHomeVisited = dyHomeVisited;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData dyShare(Long dyShare) {
    
    this.dyShare = dyShare;
    return this;
  }

   /**
   * 
   * @return dyShare
  **/
  @javax.annotation.Nullable
  public Long getDyShare() {
    return dyShare;
  }


  public void setDyShare(Long dyShare) {
    this.dyShare = dyShare;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData liveClickSourceCnt(Long liveClickSourceCnt) {
    
    this.liveClickSourceCnt = liveClickSourceCnt;
    return this;
  }

   /**
   * 
   * @return liveClickSourceCnt
  **/
  @javax.annotation.Nullable
  public Long getLiveClickSourceCnt() {
    return liveClickSourceCnt;
  }


  public void setLiveClickSourceCnt(Long liveClickSourceCnt) {
    this.liveClickSourceCnt = liveClickSourceCnt;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData liveCommentCnt(Long liveCommentCnt) {
    
    this.liveCommentCnt = liveCommentCnt;
    return this;
  }

   /**
   * 
   * @return liveCommentCnt
  **/
  @javax.annotation.Nullable
  public Long getLiveCommentCnt() {
    return liveCommentCnt;
  }


  public void setLiveCommentCnt(Long liveCommentCnt) {
    this.liveCommentCnt = liveCommentCnt;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData liveGiftAmount(Long liveGiftAmount) {
    
    this.liveGiftAmount = liveGiftAmount;
    return this;
  }

   /**
   * 
   * @return liveGiftAmount
  **/
  @javax.annotation.Nullable
  public Long getLiveGiftAmount() {
    return liveGiftAmount;
  }


  public void setLiveGiftAmount(Long liveGiftAmount) {
    this.liveGiftAmount = liveGiftAmount;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData liveGiftCnt(Long liveGiftCnt) {
    
    this.liveGiftCnt = liveGiftCnt;
    return this;
  }

   /**
   * 
   * @return liveGiftCnt
  **/
  @javax.annotation.Nullable
  public Long getLiveGiftCnt() {
    return liveGiftCnt;
  }


  public void setLiveGiftCnt(Long liveGiftCnt) {
    this.liveGiftCnt = liveGiftCnt;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData liveGiftUv(Long liveGiftUv) {
    
    this.liveGiftUv = liveGiftUv;
    return this;
  }

   /**
   * 
   * @return liveGiftUv
  **/
  @javax.annotation.Nullable
  public Long getLiveGiftUv() {
    return liveGiftUv;
  }


  public void setLiveGiftUv(Long liveGiftUv) {
    this.liveGiftUv = liveGiftUv;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData playDuration5sRank(Double playDuration5sRank) {
    
    this.playDuration5sRank = playDuration5sRank;
    return this;
  }

   /**
   * 
   * @return playDuration5sRank
  **/
  @javax.annotation.Nullable
  public Double getPlayDuration5sRank() {
    return playDuration5sRank;
  }


  public void setPlayDuration5sRank(Double playDuration5sRank) {
    this.playDuration5sRank = playDuration5sRank;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData showCnt(Long showCnt) {
    
    this.showCnt = showCnt;
    return this;
  }

   /**
   * 
   * @return showCnt
  **/
  @javax.annotation.Nullable
  public Long getShowCnt() {
    return showCnt;
  }


  public void setShowCnt(Long showCnt) {
    this.showCnt = showCnt;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData statCost(Long statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Long getStatCost() {
    return statCost;
  }


  public void setStatCost(Long statCost) {
    this.statCost = statCost;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData totalPlay(Long totalPlay) {
    
    this.totalPlay = totalPlay;
    return this;
  }

   /**
   * 
   * @return totalPlay
  **/
  @javax.annotation.Nullable
  public Long getTotalPlay() {
    return totalPlay;
  }


  public void setTotalPlay(Long totalPlay) {
    this.totalPlay = totalPlay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData = (DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData) o;
    return Objects.equals(this.customConvertCost, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.customConvertCost) &&
        Objects.equals(this.customLike, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.customLike) &&
        Objects.equals(this.douplusLiveFollowCount, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.douplusLiveFollowCount) &&
        Objects.equals(this.dpTargetConvertCnt, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.dpTargetConvertCnt) &&
        Objects.equals(this.dyComment, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.dyComment) &&
        Objects.equals(this.dyFollow, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.dyFollow) &&
        Objects.equals(this.dyHomeVisited, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.dyHomeVisited) &&
        Objects.equals(this.dyShare, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.dyShare) &&
        Objects.equals(this.liveClickSourceCnt, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.liveClickSourceCnt) &&
        Objects.equals(this.liveCommentCnt, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.liveCommentCnt) &&
        Objects.equals(this.liveGiftAmount, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.liveGiftAmount) &&
        Objects.equals(this.liveGiftCnt, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.liveGiftCnt) &&
        Objects.equals(this.liveGiftUv, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.liveGiftUv) &&
        Objects.equals(this.playDuration5sRank, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.playDuration5sRank) &&
        Objects.equals(this.showCnt, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.showCnt) &&
        Objects.equals(this.statCost, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.statCost) &&
        Objects.equals(this.totalPlay, douplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.totalPlay);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customConvertCost, customLike, douplusLiveFollowCount, dpTargetConvertCnt, dyComment, dyFollow, dyHomeVisited, dyShare, liveClickSourceCnt, liveCommentCnt, liveGiftAmount, liveGiftCnt, liveGiftUv, playDuration5sRank, showCnt, statCost, totalPlay);
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
    sb.append("class DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData {\n");
    sb.append("    customConvertCost: ").append(toIndentedString(customConvertCost)).append("\n");
    sb.append("    customLike: ").append(toIndentedString(customLike)).append("\n");
    sb.append("    douplusLiveFollowCount: ").append(toIndentedString(douplusLiveFollowCount)).append("\n");
    sb.append("    dpTargetConvertCnt: ").append(toIndentedString(dpTargetConvertCnt)).append("\n");
    sb.append("    dyComment: ").append(toIndentedString(dyComment)).append("\n");
    sb.append("    dyFollow: ").append(toIndentedString(dyFollow)).append("\n");
    sb.append("    dyHomeVisited: ").append(toIndentedString(dyHomeVisited)).append("\n");
    sb.append("    dyShare: ").append(toIndentedString(dyShare)).append("\n");
    sb.append("    liveClickSourceCnt: ").append(toIndentedString(liveClickSourceCnt)).append("\n");
    sb.append("    liveCommentCnt: ").append(toIndentedString(liveCommentCnt)).append("\n");
    sb.append("    liveGiftAmount: ").append(toIndentedString(liveGiftAmount)).append("\n");
    sb.append("    liveGiftCnt: ").append(toIndentedString(liveGiftCnt)).append("\n");
    sb.append("    liveGiftUv: ").append(toIndentedString(liveGiftUv)).append("\n");
    sb.append("    playDuration5sRank: ").append(toIndentedString(playDuration5sRank)).append("\n");
    sb.append("    showCnt: ").append(toIndentedString(showCnt)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
    sb.append("    totalPlay: ").append(toIndentedString(totalPlay)).append("\n");
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
    openapiFields.add("custom_convert_cost");
    openapiFields.add("custom_like");
    openapiFields.add("douplus_live_follow_count");
    openapiFields.add("dp_target_convert_cnt");
    openapiFields.add("dy_comment");
    openapiFields.add("dy_follow");
    openapiFields.add("dy_home_visited");
    openapiFields.add("dy_share");
    openapiFields.add("live_click_source_cnt");
    openapiFields.add("live_comment_cnt");
    openapiFields.add("live_gift_amount");
    openapiFields.add("live_gift_cnt");
    openapiFields.add("live_gift_uv");
    openapiFields.add("play_duration_5s_rank");
    openapiFields.add("show_cnt");
    openapiFields.add("stat_cost");
    openapiFields.add("total_play");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData>() {
           @Override
           public void write(JsonWriter out, DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData
  */
  public static DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData.class);
  }

 /**
  * Convert an instance of DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

