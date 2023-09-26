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
import com.bytedance.ads.api.ToolsLandingGroupSiteOptStatusUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsLandingGroupSiteOptStatusUpdateV2Request;
import com.bytedance.ads.model.ToolsLandingGroupSiteOptStatusUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/landing_group/site_opt_status/update/ POST
public class ToolsLandingGroupSiteOptStatusUpdateV2ApiExample {

    private static final ToolsLandingGroupSiteOptStatusUpdateV2Api api = new ToolsLandingGroupSiteOptStatusUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        String xOrangeCaller = null;
        ToolsLandingGroupSiteOptStatusUpdateV2Request toolsLandingGroupSiteOptStatusUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsLandingGroupSiteOptStatusUpdateV2Response response = api.openApi2ToolsLandingGroupSiteOptStatusUpdatePost(xOrangeCaller, toolsLandingGroupSiteOptStatusUpdateV2Request);
        System.out.println(response);
    }

}