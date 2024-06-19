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
import com.bytedance.ads.api.AgentAdvertiserCopyV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentAdvertiserCopyV2Request;
import com.bytedance.ads.model.AgentAdvertiserCopyV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/advertiser/copy/ POST
public class AgentAdvertiserCopyV2ApiExample {

    private static final AgentAdvertiserCopyV2Api api = new AgentAdvertiserCopyV2Api();

    public static void main(String[] args) throws ApiException {
        AgentAdvertiserCopyV2Request agentAdvertiserCopyV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentAdvertiserCopyV2Response response = api.openApi2AgentAdvertiserCopyPost(agentAdvertiserCopyV2Request);
        System.out.println(response);
    }

}