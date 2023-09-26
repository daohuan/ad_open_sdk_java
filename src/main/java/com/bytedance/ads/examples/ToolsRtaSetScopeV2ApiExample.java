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
import com.bytedance.ads.api.ToolsRtaSetScopeV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsRtaSetScopeV2Request;
import com.bytedance.ads.model.ToolsRtaSetScopeV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/rta/set_scope/ POST
public class ToolsRtaSetScopeV2ApiExample {

    private static final ToolsRtaSetScopeV2Api api = new ToolsRtaSetScopeV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsRtaSetScopeV2Request toolsRtaSetScopeV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsRtaSetScopeV2Response response = api.openApi2ToolsRtaSetScopePost(toolsRtaSetScopeV2Request);
        System.out.println(response);
    }

}