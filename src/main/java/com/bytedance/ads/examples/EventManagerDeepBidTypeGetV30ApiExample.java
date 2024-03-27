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
import com.bytedance.ads.api.EventManagerDeepBidTypeGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EventManagerDeepBidTypeGetV30DeepExternalAction;
import com.bytedance.ads.model.EventManagerDeepBidTypeGetV30DeliveryMode;
import com.bytedance.ads.model.EventManagerDeepBidTypeGetV30ExternalAction;
import com.bytedance.ads.model.EventManagerDeepBidTypeGetV30LandingType;
import com.bytedance.ads.model.EventManagerDeepBidTypeGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/event_manager/deep_bid_type/get/ GET
public class EventManagerDeepBidTypeGetV30ApiExample {

    private static final EventManagerDeepBidTypeGetV30Api api = new EventManagerDeepBidTypeGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        EventManagerDeepBidTypeGetV30ExternalAction externalAction = null;
        Long assetId = null;
        EventManagerDeepBidTypeGetV30DeepExternalAction deepExternalAction = null;
        Long convertId = null;
        EventManagerDeepBidTypeGetV30DeliveryMode deliveryMode = null;
        EventManagerDeepBidTypeGetV30LandingType landingType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EventManagerDeepBidTypeGetV30Response response = api.openApiV30EventManagerDeepBidTypeGetGet(advertiserId, externalAction, assetId, deepExternalAction, convertId, deliveryMode, landingType);
        System.out.println(response);
    }

}