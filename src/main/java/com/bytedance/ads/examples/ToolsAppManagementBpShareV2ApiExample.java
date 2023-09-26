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
import com.bytedance.ads.api.ToolsAppManagementBpShareV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementBpShareV2Request;
import com.bytedance.ads.model.ToolsAppManagementBpShareV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/bp_share/ POST
public class ToolsAppManagementBpShareV2ApiExample {

    private static final ToolsAppManagementBpShareV2Api api = new ToolsAppManagementBpShareV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAppManagementBpShareV2Request toolsAppManagementBpShareV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementBpShareV2Response response = api.openApi2ToolsAppManagementBpSharePost(toolsAppManagementBpShareV2Request);
        System.out.println(response);
    }

}