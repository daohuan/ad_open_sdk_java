/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPlayableCloudGameListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPlayableCloudGameListV2Filtering;
import com.bytedance.ads.model.ToolsPlayableCloudGameListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/playable/cloud_game/list/ GET
public class ToolsPlayableCloudGameListV2ApiExample {

    private static final ToolsPlayableCloudGameListV2Api api = new ToolsPlayableCloudGameListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsPlayableCloudGameListV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPlayableCloudGameListV2Response response = api.openApi2ToolsPlayableCloudGameListGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}