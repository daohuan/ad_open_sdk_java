/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AgentAdvCostReportListQueryV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2Request;
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/adv/cost_report/list/query/ POST
public class AgentAdvCostReportListQueryV2ApiExample {

    private static final AgentAdvCostReportListQueryV2Api api = new AgentAdvCostReportListQueryV2Api();

    public static void main(String[] args) throws ApiException {
        AgentAdvCostReportListQueryV2Request agentAdvCostReportListQueryV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentAdvCostReportListQueryV2Response response = api.openApi2AgentAdvCostReportListQueryPost(agentAdvCostReportListQueryV2Request);
        System.out.println(response);
    }

}