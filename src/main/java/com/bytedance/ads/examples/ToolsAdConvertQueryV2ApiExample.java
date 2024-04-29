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


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAdConvertQueryV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdConvertQueryV2AdvancedCreativeType;
import com.bytedance.ads.model.ToolsAdConvertQueryV2AppType;
import com.bytedance.ads.model.ToolsAdConvertQueryV2DedicateType;
import com.bytedance.ads.model.ToolsAdConvertQueryV2DeliveryRange;
import com.bytedance.ads.model.ToolsAdConvertQueryV2LandingType;
import com.bytedance.ads.model.ToolsAdConvertQueryV2MarketingScene;
import com.bytedance.ads.model.ToolsAdConvertQueryV2PromotionContent;
import com.bytedance.ads.model.ToolsAdConvertQueryV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ad_convert/query/ GET
public class ToolsAdConvertQueryV2ApiExample {

    private static final ToolsAdConvertQueryV2Api api = new ToolsAdConvertQueryV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAdConvertQueryV2AdvancedCreativeType advancedCreativeType = null;
        Long advertiserId = null;
        String appSchema = null;
        ToolsAdConvertQueryV2AppType appType = null;
        ToolsAdConvertQueryV2DedicateType dedicateType = null;
        ToolsAdConvertQueryV2DeliveryRange deliveryRange = null;
        String externalUrl = null;
        String itunesUrl = null;
        ToolsAdConvertQueryV2LandingType landingType = null;
        ToolsAdConvertQueryV2MarketingScene marketingScene = null;
        String packageName = null;
        ToolsAdConvertQueryV2PromotionContent promotionContent = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdConvertQueryV2Response response = api.openApi2ToolsAdConvertQueryGet(advancedCreativeType, advertiserId, appSchema, appType, dedicateType, deliveryRange, externalUrl, itunesUrl, landingType, marketingScene, packageName, promotionContent);
        System.out.println(response);
    }

}