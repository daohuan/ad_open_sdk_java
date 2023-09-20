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


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPromotionCardRecommendGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPromotionCardRecommendGetV2AdvancedCreativeType;
import com.bytedance.ads.model.ToolsPromotionCardRecommendGetV2DownloadType;
import com.bytedance.ads.model.ToolsPromotionCardRecommendGetV2RecommendType;
import com.bytedance.ads.model.ToolsPromotionCardRecommendGetV2Response;
import com.bytedance.ads.model.ToolsPromotionCardRecommendGetV2TitleListInner;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/promotion_card/recommend/get/ GET
public class ToolsPromotionCardRecommendGetV2ApiExample {

    private static final ToolsPromotionCardRecommendGetV2Api api = new ToolsPromotionCardRecommendGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long adId = null;
        ToolsPromotionCardRecommendGetV2AdvancedCreativeType advancedCreativeType = null;
        Long advertiserId = null;
        ToolsPromotionCardRecommendGetV2DownloadType downloadType = null;
        ToolsPromotionCardRecommendGetV2RecommendType recommendType = null;
        List<ToolsPromotionCardRecommendGetV2TitleListInner> titleList = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPromotionCardRecommendGetV2Response response = api.openApi2ToolsPromotionCardRecommendGetGet(adId, advancedCreativeType, advertiserId, downloadType, recommendType, titleList);
        System.out.println(response);
    }

}