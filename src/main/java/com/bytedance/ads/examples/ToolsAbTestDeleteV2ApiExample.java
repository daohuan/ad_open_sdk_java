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
import com.bytedance.ads.api.ToolsAbTestDeleteV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAbTestDeleteV2Request;
import com.bytedance.ads.model.ToolsAbTestDeleteV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ab_test/delete/ POST
public class ToolsAbTestDeleteV2ApiExample {

    private static final ToolsAbTestDeleteV2Api api = new ToolsAbTestDeleteV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAbTestDeleteV2Request toolsAbTestDeleteV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAbTestDeleteV2Response response = api.openApi2ToolsAbTestDeletePost(toolsAbTestDeleteV2Request);
        System.out.println(response);
    }

}