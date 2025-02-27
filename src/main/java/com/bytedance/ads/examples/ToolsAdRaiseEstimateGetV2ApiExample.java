/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAdRaiseEstimateGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdRaiseEstimateGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ad_raise_estimate/get/ GET
public class ToolsAdRaiseEstimateGetV2ApiExample {

    private static final ToolsAdRaiseEstimateGetV2Api api = new ToolsAdRaiseEstimateGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long adId = null;
        Long modifyValue = null;
        Long budgetValue = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdRaiseEstimateGetV2Response response = api.openApi2ToolsAdRaiseEstimateGetGet(advertiserId, adId, modifyValue, budgetValue);
        System.out.println(response);
    }

}