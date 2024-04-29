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
import com.bytedance.ads.api.ToolsClueCallbackV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueCallbackV2Request;
import com.bytedance.ads.model.ToolsClueCallbackV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/callback/ POST
public class ToolsClueCallbackV2ApiExample {

    private static final ToolsClueCallbackV2Api api = new ToolsClueCallbackV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsClueCallbackV2Request toolsClueCallbackV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueCallbackV2Response response = api.openApi2ToolsClueCallbackPost(toolsClueCallbackV2Request);
        System.out.println(response);
    }

}