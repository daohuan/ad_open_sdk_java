/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportLiveRoomFlowCategoryGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportLiveRoomFlowCategoryGetV2Filtering;
import com.bytedance.ads.model.ReportLiveRoomFlowCategoryGetV2OrderField;
import com.bytedance.ads.model.ReportLiveRoomFlowCategoryGetV2OrderType;
import com.bytedance.ads.model.ReportLiveRoomFlowCategoryGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/live_room/flow_category/get/ GET
public class ReportLiveRoomFlowCategoryGetV2ApiExample {

    private static final ReportLiveRoomFlowCategoryGetV2Api api = new ReportLiveRoomFlowCategoryGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endTime = null;
        List<String> fields = null;
        ReportLiveRoomFlowCategoryGetV2Filtering filtering = null;
        ReportLiveRoomFlowCategoryGetV2OrderField orderField = null;
        ReportLiveRoomFlowCategoryGetV2OrderType orderType = null;
        String startTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportLiveRoomFlowCategoryGetV2Response response = api.openApi2ReportLiveRoomFlowCategoryGetGet(advertiserId, endTime, fields, filtering, orderField, orderType, startTime);
        System.out.println(response);
    }

}