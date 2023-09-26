/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanSuggestRoiGoalV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10CampaignScene;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10DeepBidType;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10DeepExternalAction;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10ExternalAction;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10MarketingGoal;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10MarketingScene;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/suggest/roi/goal/ GET
public class QianchuanSuggestRoiGoalV10ApiExample {

    private static final QianchuanSuggestRoiGoalV10Api api = new QianchuanSuggestRoiGoalV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        QianchuanSuggestRoiGoalV10MarketingScene marketingScene = null;
        QianchuanSuggestRoiGoalV10MarketingGoal marketingGoal = null;
        Long productId = null;
        Boolean productNewOpen = null;
        QianchuanSuggestRoiGoalV10ExternalAction externalAction = null;
        QianchuanSuggestRoiGoalV10CampaignScene campaignScene = null;
        QianchuanSuggestRoiGoalV10DeepExternalAction deepExternalAction = null;
        QianchuanSuggestRoiGoalV10DeepBidType deepBidType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanSuggestRoiGoalV10Response response = api.openApiV10QianchuanSuggestRoiGoalGet(advertiserId, awemeId, marketingScene, marketingGoal, productId, productNewOpen, externalAction, campaignScene, deepExternalAction, deepBidType);
        System.out.println(response);
    }

}