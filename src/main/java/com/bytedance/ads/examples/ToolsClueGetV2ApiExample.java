/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/get/ GET
public class ToolsClueGetV2ApiExample {

    private static final ToolsClueGetV2Api api = new ToolsClueGetV2Api();

    public static void main(String[] args) throws ApiException {
        List<Long> advertiserIds = null;
        String startTime = null;
        String endTime = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueGetV2Response response = api.openApi2ToolsClueGetGet(advertiserIds, startTime, endTime, page, pageSize);
        System.out.println(response);
    }

}