/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsEventAssetsGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsEventAssetsGetV2AssetType;
import com.bytedance.ads.model.ToolsEventAssetsGetV2Filtering;
import com.bytedance.ads.model.ToolsEventAssetsGetV2Response;
import com.bytedance.ads.model.ToolsEventAssetsGetV2SortType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/event/assets/get/ GET
public class ToolsEventAssetsGetV2ApiExample {

    private static final ToolsEventAssetsGetV2Api api = new ToolsEventAssetsGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsEventAssetsGetV2AssetType assetType = null;
        ToolsEventAssetsGetV2Filtering filtering = null;
        ToolsEventAssetsGetV2SortType sortType = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsEventAssetsGetV2Response response = api.openApi2ToolsEventAssetsGetGet(advertiserId, assetType, filtering, sortType, page, pageSize);
        System.out.println(response);
    }

}