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
import com.bytedance.ads.api.ToolsAppManagementAndroidBasicPackageGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2AccountType;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/android_basic_package/get/ GET
public class ToolsAppManagementAndroidBasicPackageGetV2ApiExample {

    private static final ToolsAppManagementAndroidBasicPackageGetV2Api api = new ToolsAppManagementAndroidBasicPackageGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        ToolsAppManagementAndroidBasicPackageGetV2AccountType accountType = null;
        String packageId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementAndroidBasicPackageGetV2Response response = api.openApi2ToolsAppManagementAndroidBasicPackageGetGet(accountId, accountType, packageId);
        System.out.println(response);
    }

}