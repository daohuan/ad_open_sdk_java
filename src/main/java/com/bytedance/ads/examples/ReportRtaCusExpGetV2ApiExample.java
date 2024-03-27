/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportRtaCusExpGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportRtaCusExpGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/rta_cus_exp/get/ GET
public class ReportRtaCusExpGetV2ApiExample {

    private static final ReportRtaCusExpGetV2Api api = new ReportRtaCusExpGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long rtaInterfaceId = null;
        Long rtaId = null;
        String rtaVid = null;
        String startTime = null;
        String endTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportRtaCusExpGetV2Response response = api.openApi2ReportRtaCusExpGetGet(advertiserId, rtaInterfaceId, rtaId, rtaVid, startTime, endTime);
        System.out.println(response);
    }

}