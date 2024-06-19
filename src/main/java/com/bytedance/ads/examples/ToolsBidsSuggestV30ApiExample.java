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
import com.bytedance.ads.api.ToolsBidsSuggestV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsBidsSuggestV30DeepBidType;
import com.bytedance.ads.model.ToolsBidsSuggestV30DeepExternalAction;
import com.bytedance.ads.model.ToolsBidsSuggestV30ExternalAction;
import com.bytedance.ads.model.ToolsBidsSuggestV30Pricing;
import com.bytedance.ads.model.ToolsBidsSuggestV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/bids/suggest/ GET
public class ToolsBidsSuggestV30ApiExample {

    private static final ToolsBidsSuggestV30Api api = new ToolsBidsSuggestV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsBidsSuggestV30Pricing pricing = null;
        ToolsBidsSuggestV30ExternalAction externalAction = null;
        Long projectId = null;
        ToolsBidsSuggestV30DeepExternalAction deepExternalAction = null;
        ToolsBidsSuggestV30DeepBidType deepBidType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsBidsSuggestV30Response response = api.openApiV30ToolsBidsSuggestGet(advertiserId, pricing, externalAction, projectId, deepExternalAction, deepBidType);
        System.out.println(response);
    }

}