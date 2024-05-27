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
import com.bytedance.ads.api.ReportRtaExpLocalHourlyGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportRtaExpLocalHourlyGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/rta_exp_local_hourly/get/ GET
public class ReportRtaExpLocalHourlyGetV30ApiExample {

    private static final ReportRtaExpLocalHourlyGetV30Api api = new ReportRtaExpLocalHourlyGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long rtaId = null;
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        Long vid = null;
        Long cusVid = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportRtaExpLocalHourlyGetV30Response response = api.openApiV30ReportRtaExpLocalHourlyGetGet(rtaId, advertiserId, startDate, endDate, vid, cusVid);
        System.out.println(response);
    }

}