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
import com.bytedance.ads.api.ToolsAppManagementAndroidAppListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2AccountType;
import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2Filtering;
import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/android_app/list/ GET
public class ToolsAppManagementAndroidAppListV2ApiExample {

    private static final ToolsAppManagementAndroidAppListV2Api api = new ToolsAppManagementAndroidAppListV2Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        ToolsAppManagementAndroidAppListV2AccountType accountType = null;
        Integer page = null;
        Integer pageSize = null;
        ToolsAppManagementAndroidAppListV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementAndroidAppListV2Response response = api.openApi2ToolsAppManagementAndroidAppListGet(accountId, accountType, page, pageSize, filtering);
        System.out.println(response);
    }

}