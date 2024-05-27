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
import com.bytedance.ads.api.ReportRtaExpGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportRtaExpGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/rta_exp/get/ GET
public class ReportRtaExpGetV2ApiExample {

    private static final ReportRtaExpGetV2Api api = new ReportRtaExpGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long rtaId = null;
        String startDate = null;
        String endDate = null;
        Long strategy = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportRtaExpGetV2Response response = api.openApi2ReportRtaExpGetGet(advertiserId, rtaId, startDate, endDate, strategy);
        System.out.println(response);
    }

}