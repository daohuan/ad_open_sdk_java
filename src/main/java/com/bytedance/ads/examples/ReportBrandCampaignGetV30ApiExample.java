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
import com.bytedance.ads.api.ReportBrandCampaignGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportBrandCampaignGetV30LandingType;
import com.bytedance.ads.model.ReportBrandCampaignGetV30PricingType;
import com.bytedance.ads.model.ReportBrandCampaignGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/brand/campaign/get/ GET
public class ReportBrandCampaignGetV30ApiExample {

    private static final ReportBrandCampaignGetV30Api api = new ReportBrandCampaignGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long size = null;
        ReportBrandCampaignGetV30LandingType landingType = null;
        ReportBrandCampaignGetV30PricingType pricingType = null;
        List<String> campaignIds = null;
        String startTime = null;
        String endTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportBrandCampaignGetV30Response response = api.openApiV30ReportBrandCampaignGetGet(advertiserId, page, size, landingType, pricingType, campaignIds, startTime, endTime);
        System.out.println(response);
    }

}