/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPromotionRaiseStatusCurrentIdsGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPromotionRaiseStatusCurrentIdsGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/promotion_raise_status_current_ids/get/ GET
public class ToolsPromotionRaiseStatusCurrentIdsGetV30ApiExample {

    private static final ToolsPromotionRaiseStatusCurrentIdsGetV30Api api = new ToolsPromotionRaiseStatusCurrentIdsGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> promotionIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPromotionRaiseStatusCurrentIdsGetV30Response response = api.openApiV30ToolsPromotionRaiseStatusCurrentIdsGetGet(advertiserId, promotionIds);
        System.out.println(response);
    }

}