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
import com.bytedance.ads.api.AgentTransferTransactionRecordV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2Filtering;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/transfer/transaction_record/ GET
public class AgentTransferTransactionRecordV2ApiExample {

    private static final AgentTransferTransactionRecordV2Api api = new AgentTransferTransactionRecordV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        String startDate = null;
        String endDate = null;
        AgentTransferTransactionRecordV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentTransferTransactionRecordV2Response response = api.openApi2AgentTransferTransactionRecordGet(agentId, startDate, endDate, filtering, page, pageSize);
        System.out.println(response);
    }

}