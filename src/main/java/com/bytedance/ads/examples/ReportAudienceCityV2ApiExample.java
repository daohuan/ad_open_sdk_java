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
import com.bytedance.ads.api.ReportAudienceCityV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportAudienceCityV2IdType;
import com.bytedance.ads.model.ReportAudienceCityV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/audience/city/ GET
public class ReportAudienceCityV2ApiExample {

    private static final ReportAudienceCityV2Api api = new ReportAudienceCityV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endDate = null;
        ReportAudienceCityV2IdType idType = null;
        List<Long> ids = null;
        List<String> metrics = null;
        String startDate = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportAudienceCityV2Response response = api.openApi2ReportAudienceCityGet(advertiserId, endDate, idType, ids, metrics, startDate);
        System.out.println(response);
    }

}