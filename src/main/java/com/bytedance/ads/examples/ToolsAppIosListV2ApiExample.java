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
import com.bytedance.ads.api.ToolsAppIosListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppIosListV2Filtering;
import com.bytedance.ads.model.ToolsAppIosListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app/ios/list/ GET
public class ToolsAppIosListV2ApiExample {

    private static final ToolsAppIosListV2Api api = new ToolsAppIosListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsAppIosListV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppIosListV2Response response = api.openApi2ToolsAppIosListGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}