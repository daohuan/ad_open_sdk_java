/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(ReportAdGetV2OrderField.Adapter.class)
public enum ReportAdGetV2OrderField {
  
  ATTRIBUTION_GAME_IN_APP_LTV_4DAYS("attribution_game_in_app_ltv_4days"),
  
  CPC("cpc"),
  
  DISLIKE("dislike"),
  
  DOWNLOAD_FINISH_RATE("download_finish_rate"),
  
  VOTE("vote"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_8DAYS("attribution_game_in_app_ltv_8days"),
  
  GAME_PAY_COST("game_pay_cost"),
  
  ADVANCED_CREATIVE_FORM_SUBMIT("advanced_creative_form_submit"),
  
  CLICK_CALL_DY("click_call_dy"),
  
  ADVANCED_CREATIVE_COUNSEL_CLICK("advanced_creative_counsel_click"),
  
  PLAY_DURATION("play_duration"),
  
  SHOW("show"),
  
  SHOPPING("shopping"),
  
  DEEP_CONVERT("deep_convert"),
  
  VALID_PLAY_COST("valid_play_cost"),
  
  ATTRIBUTION_DEEP_CONVERT_COST("attribution_deep_convert_cost"),
  
  LOTTERY("lottery"),
  
  PLAY_75_FEED_BREAK("play_75_feed_break"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_3DAYS("attribution_game_in_app_ltv_3days"),
  
  INTERACT_PER_COST("interact_per_cost"),
  
  GAME_ADDICTION_COST("game_addiction_cost"),
  
  ATTRIBUTION_RETENTION_5D_COST("attribution_retention_5d_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COST("attribution_active_pay_7d_cost"),
  
  PLAY_DURATION_2S_RATE("play_duration_2s_rate"),
  
  ATTRIBUTION_RETENTION_7D_SUM_CNT("attribution_retention_7d_sum_cnt"),
  
  COMMUTE_FIRST_PAY_COUNT("commute_first_pay_count"),
  
  WECHAT_PAY_AMOUNT("wechat_pay_amount"),
  
  CONSULT("consult"),
  
  ATTRIBUTION_RETENTION_6D_COST("attribution_retention_6d_cost"),
  
  PRE_LOAN_CREDIT("pre_loan_credit"),
  
  TOTAL_PLAY("total_play"),
  
  LUBAN_LIVE_PAY_ORDER_STAT_COST("luban_live_pay_order_stat_cost"),
  
  APPROVAL_COUNT("approval_count"),
  
  LIVE_COMPONENT_CLICK_COUNT("live_component_click_count"),
  
  LUBAN_LIVE_PAY_ORDER_COUNT("luban_live_pay_order_count"),
  
  DOWNLOAD_FINISH_COST("download_finish_cost"),
  
  DOWNLOAD_FINISH("download_finish"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_AMOUNT("attribution_active_pay_intra_one_day_amount"),
  
  NEXT_DAY_OPEN_COST("next_day_open_cost"),
  
  ATTRIBUTION_RETENTION_7D_CNT("attribution_retention_7d_cnt"),
  
  DEEP_CONVERT_COST("deep_convert_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_RATE("attribution_active_pay_7d_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_4DAYS("attribution_game_in_app_roi_4days"),
  
  ATTRIBUTION_RETENTION_2D_COST("attribution_retention_2d_cost"),
  
  LUBAN_LIVE_COMMENT_CNT("luban_live_comment_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_2DAYS("attribution_game_in_app_ltv_2days"),
  
  SUBMIT_CERTIFICATION_COUNT("submit_certification_count"),
  
  COST("cost"),
  
  ATTRIBUTION_RETENTION_7D_COST("attribution_retention_7d_cost"),
  
  UNION_ROI_3("union_roi_3"),
  
  MESSAGE_ACTION("message_action"),
  
  PLAY_DURATION_3S_RATE("play_duration_3s_rate"),
  
  ACTIVE_COST("active_cost"),
  
  ACTIVE_RATE("active_rate"),
  
  ATTRIBUTION_RETENTION_4D_CNT("attribution_retention_4d_cnt"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COST("attribution_wechat_first_pay_30d_cost"),
  
  PLAY_OVER_RATE("play_over_rate"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_RATE("attribution_next_day_open_rate"),
  
  IN_APP_UV("in_app_uv"),
  
  COMMENT("comment"),
  
  LUBAN_LIVE_GIFT_AMOUNT("luban_live_gift_amount"),
  
  CLICK_LANDING_PAGE("click_landing_page"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_RATE("attribution_active_pay_intra_one_day_rate"),
  
  LOCATION_CLICK("location_click"),
  
  ACTIVE_PAY_COST("active_pay_cost"),
  
  ATTRIBUTION_DAY_ACTIVE_PAY_COUNT("attribution_day_active_pay_count"),
  
  LOAN_COMPLETION_RATE("loan_completion_rate"),
  
  ATTRIBUTION_WECHAT_PAY_30D_AMOUNT("attribution_wechat_pay_30d_amount"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_ROI("attribution_active_pay_intra_one_day_roi"),
  
  ATTRIBUTION_RETENTION_4D_COST("attribution_retention_4d_cost"),
  
  ACTIVE_PAY_RATE("active_pay_rate"),
  
  CLICK_INSTALL("click_install"),
  
  IES_MUSIC_CLICK("ies_music_click"),
  
  REPORT("report"),
  
  PLAY_DURATION_SUM("play_duration_sum"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_8DAYS("attribution_game_in_app_roi_8days"),
  
  POI_COLLECT("poi_collect"),
  
  ATTRIBUTION_RETENTION_3D_COST("attribution_retention_3d_cost"),
  
  WECHAT_LOGIN_COUNT("wechat_login_count"),
  
  IN_APP_ORDER("in_app_order"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_3DAYS("attribution_game_in_app_roi_3days"),
  
  CONVERT_RATE("convert_rate"),
  
  PHONE_CONFIRM("phone_confirm"),
  
  LIVE_FANS_CLUB_JOIN_CNT("live_fans_club_join_cnt"),
  
  LUBAN_LIVE_SHARE_CNT("luban_live_share_cnt"),
  
  ATTRIBUTION_RETENTION_7D_TOTAL_COST("attribution_retention_7d_total_cost"),
  
  IN_APP_CART("in_app_cart"),
  
  CTR("ctr"),
  
  LOAN_CREDIT_COST("loan_credit_cost"),
  
  REDIRECT("redirect"),
  
  LIVE_COMPONENT_CLICK_RATE("live_component_click_rate"),
  
  GAME_PAY_COUNT("game_pay_count"),
  
  LUBAN_LIVE_SLIDECART_CLICK_CNT("luban_live_slidecart_click_cnt"),
  
  PLAY_50_FEED_BREAK_RATE("play_50_feed_break_rate"),
  
  REGISTER("register"),
  
  ATTRIBUTION_MICRO_GAME_0D_LTV("attribution_micro_game_0d_ltv"),
  
  AVG_CLICK_COST("avg_click_cost"),
  
  ATTRIBUTION_RETENTION_2D_CNT("attribution_retention_2d_cnt"),
  
  PHONE("phone"),
  
  ATTRIBUTION_MICRO_GAME_3D_LTV("attribution_micro_game_3d_ltv"),
  
  VIEW("view"),
  
  ACTIVE_REGISTER_COST("active_register_cost"),
  
  CPM("cpm"),
  
  SHARE("share"),
  
  PRE_CONVERT_COUNT("pre_convert_count"),
  
  PLAY_DURATION_2S("play_duration_2s"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_7DAYS("attribution_game_in_app_ltv_7days"),
  
  ATTRIBUTION_DAY_ACITVE_PAY_COUNT("attribution_day_acitve_pay_count"),
  
  PHONE_CONNECT("phone_connect"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COUNT("attribution_wechat_first_pay_30d_count"),
  
  STAT_PAY_AMOUNT("stat_pay_amount"),
  
  DOWNLOAD_START_RATE("download_start_rate"),
  
  ATTRIBUTION_DEEP_CONVERT("attribution_deep_convert"),
  
  CLICK("click"),
  
  ATTRIBUTION_RETENTION_3D_RATE("attribution_retention_3d_rate"),
  
  PRE_LOAN_CREDIT_COST("pre_loan_credit_cost"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COST("attribution_wechat_login_30d_cost"),
  
  WECHAT_FIRST_PAY_RATE("wechat_first_pay_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_1DAY("attribution_game_in_app_ltv_1day"),
  
  CPA("cpa"),
  
  LUBAN_ORDER_CNT("luban_order_cnt"),
  
  AVERAGE_PLAY_TIME_PER_PLAY("average_play_time_per_play"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_CNT("attribution_next_day_open_cnt"),
  
  DOWNLOAD_START("download_start"),
  
  PLAY_OVER("play_over"),
  
  POI_ADDRESS_CLICK("poi_address_click"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_COST("attribution_next_day_open_cost"),
  
  LUBAN_LIVE_FOLLOW_CNT("luban_live_follow_cnt"),
  
  FOLLOW("follow"),
  
  FIRST_RENTAL_ORDER_COUNT("first_rental_order_count"),
  
  LOAN_COMPLETION_COST("loan_completion_cost"),
  
  INSTALL_FINISH_RATE("install_finish_rate"),
  
  PRE_CONVERT_COST("pre_convert_cost"),
  
  ADVANCED_CREATIVE_FORM_CLICK("advanced_creative_form_click"),
  
  PLAY_50_FEED_BREAK("play_50_feed_break"),
  
  QQ("qq"),
  
  ATTRIBUTION_RETENTION_5D_CNT("attribution_retention_5d_cnt"),
  
  STAT_UNION_LTV_3("stat_union_ltv_3"),
  
  LOAN_CREDIT("loan_credit"),
  
  CARD_SHOW("card_show"),
  
  REDIRECT_TO_SHOP("redirect_to_shop"),
  
  PHONE_EFFECTIVE("phone_effective"),
  
  PLAY_25_FEED_BREAK_RATE("play_25_feed_break_rate"),
  
  DOWNLOAD_START_COST("download_start_cost"),
  
  DOWNLOAD("download"),
  
  AVERAGE_VIDEO_PLAY("average_video_play"),
  
  DEEP_CONVERT_RATE("deep_convert_rate"),
  
  LIKE("like"),
  
  BUTTON("button"),
  
  VALID_PLAY_RATE("valid_play_rate"),
  
  ATTRIBUTION_MICRO_GAME_7D_LTV("attribution_micro_game_7d_ltv"),
  
  ATTRIBUTION_MICRO_GAME_7D_ROI("attribution_micro_game_7d_roi"),
  
  COUPON_SINGLE_PAGE("coupon_single_page"),
  
  WIFI_PLAY("wifi_play"),
  
  AVG_RANK("avg_rank"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COUNT("attribution_active_pay_intra_one_day_count"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_5DAYS("attribution_game_in_app_roi_5days"),
  
  ATTRIBUTION_CONVERT("attribution_convert"),
  
  ATTRIBUTION_GAME_PAY_7D_COUNT("attribution_game_pay_7d_count"),
  
  STAT_UNION_LTV_0("stat_union_ltv_0"),
  
  PLAY_100_FEED_BREAK_RATE("play_100_feed_break_rate"),
  
  CUSTOMER_EFFECTIVE("customer_effective"),
  
  CLICK_SHOPWINDOW("click_shopwindow"),
  
  PAY_COUNT("pay_count"),
  
  ATTRIBUTION_RETENTION_6D_RATE("attribution_retention_6d_rate"),
  
  IN_APP_PAY("in_app_pay"),
  
  PLAY_100_FEED_BREAK("play_100_feed_break"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_2DAYS("attribution_game_in_app_roi_2days"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COUNT("attribution_wechat_login_30d_count"),
  
  ATTRIBUTION_MICRO_GAME_0D_ROI("attribution_micro_game_0d_roi"),
  
  FORM("form"),
  
  PRE_CONVERT_RATE("pre_convert_rate"),
  
  LUBAN_LIVE_GIFT_CNT("luban_live_gift_cnt"),
  
  ACTIVE_REGISTER_RATE("active_register_rate"),
  
  ATTRIBUTION_RETENTION_4D_RATE("attribution_retention_4d_rate"),
  
  ADVANCED_CREATIVE_COUPON_ADDITION("advanced_creative_coupon_addition"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_7DAYS("attribution_game_in_app_roi_7days"),
  
  LUBAN_ORDER_STAT_AMOUNT("luban_order_stat_amount"),
  
  WIFI_PLAY_RATE("wifi_play_rate"),
  
  PLAY_DURATION_10S_RATE("play_duration_10s_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_6DAYS("attribution_game_in_app_ltv_6days"),
  
  LIVE_WATCH_ONE_MINUTE_COUNT("live_watch_one_minute_count"),
  
  ATTRIBUTION_RETENTION_3D_CNT("attribution_retention_3d_cnt"),
  
  WECHAT_LOGIN_COST("wechat_login_cost"),
  
  ATTRIBUTION_RETENTION_5D_RATE("attribution_retention_5d_rate"),
  
  UNION_ROI_0("union_roi_0"),
  
  ACTIVE_PAY_AMOUNT("active_pay_amount"),
  
  WECHAT_FIRST_PAY_COUNT("wechat_first_pay_count"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_RATE("attribution_wechat_first_pay_30d_rate"),
  
  HOME_VISITED("home_visited"),
  
  GAME_ADDICTION_RATE("game_addiction_rate"),
  
  LOAN_CREDIT_RATE("loan_credit_rate"),
  
  NEXT_DAY_OPEN_RATE("next_day_open_rate"),
  
  IN_APP_DETAIL_UV("in_app_detail_uv"),
  
  AVG_SHOW_COST("avg_show_cost"),
  
  COUPON("coupon"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_6DAYS("attribution_game_in_app_roi_6days"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_5DAYS("attribution_game_in_app_ltv_5days"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_PER_COUNT("attribution_active_pay_7d_per_count"),
  
  PLAY_25_FEED_BREAK("play_25_feed_break"),
  
  LUBAN_LIVE_CLICK_PRODUCT_CNT("luban_live_click_product_cnt"),
  
  ATTRIBUTION_MICRO_GAME_3D_ROI("attribution_micro_game_3d_roi"),
  
  ATTRIBUTION_RETENTION_6D_CNT("attribution_retention_6d_cnt"),
  
  ATTRIBUTION_WECHAT_PAY_30D_ROI("attribution_wechat_pay_30d_roi"),
  
  CLICK_WEBSITE("click_website"),
  
  ATTRIBUTION_GAME_PAY_7D_COST("attribution_game_pay_7d_cost"),
  
  PLAY_75_FEED_BREAK_RATE("play_75_feed_break_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_1DAY("attribution_game_in_app_roi_1day"),
  
  CONSULT_EFFECTIVE("consult_effective"),
  
  WECHAT_FIRST_PAY_COST("wechat_first_pay_cost"),
  
  PLAY_DURATION_3S("play_duration_3s"),
  
  NEXT_DAY_OPEN("next_day_open"),
  
  ATTRIBUTION_RETENTION_2D_RATE("attribution_retention_2d_rate"),
  
  ADVANCED_CREATIVE_PHONE_CLICK("advanced_creative_phone_click"),
  
  FIRST_ORDER_COUNT("first_order_count"),
  
  PLAY_DURATION_10S("play_duration_10s"),
  
  CONVERT_COST("convert_cost"),
  
  LIVE_COMPONENT_CLICK_COST("live_component_click_cost"),
  
  WECHAT("wechat"),
  
  ATTRIBUTION_RETENTION_7D_RATE("attribution_retention_7d_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COUNT("attribution_active_pay_7d_count"),
  
  ACTIVE("active"),
  
  UNION_ROI_7("union_roi_7"),
  
  GAME_ADDICTION("game_addiction"),
  
  ATTRIBUTION_CONVERT_COST("attribution_convert_cost"),
  
  LUBAN_ORDER_ROI("luban_order_roi"),
  
  CLICK_DOWNLOAD("click_download"),
  
  CONVERT_SHOW_RATE("convert_show_rate"),
  
  STAT_UNION_LTV_7("stat_union_ltv_7"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COST("attribution_active_pay_intra_one_day_cost"),
  
  AVERAGE_PLAY_PROGRESS("average_play_progress"),
  
  VALID_PLAY("valid_play"),
  
  PLAY_DURATION_5S_RATE("play_duration_5s_rate"),
  
  PAY_AMOUNT_ROI("pay_amount_roi"),
  
  CONVERT("convert"),
  
  LOAN_COMPLETION("loan_completion"),
  
  INSTALL_FINISH("install_finish"),
  
  MAP_SEARCH("map_search"),
  
  LUBAN_LIVE_ENTER_CNT("luban_live_enter_cnt"),
  
  IES_CHALLENGE_CLICK("ies_challenge_click"),
  
  INSTALL_FINISH_COST("install_finish_cost"),
  
  MESSAGE("message");

  private String value;

  ReportAdGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2OrderField fromValue(String value) {
    for (ReportAdGetV2OrderField b : ReportAdGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2OrderField.fromValue(value);
    }
  }
}

