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
import com.bytedance.ads.api.ToolsAppManagementIndustryInfoListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementIndustryInfoListV2AccountType;
import com.bytedance.ads.model.ToolsAppManagementIndustryInfoListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/industry_info/list/ GET
public class ToolsAppManagementIndustryInfoListV2ApiExample {

    private static final ToolsAppManagementIndustryInfoListV2Api api = new ToolsAppManagementIndustryInfoListV2Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        ToolsAppManagementIndustryInfoListV2AccountType accountType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementIndustryInfoListV2Response response = api.openApi2ToolsAppManagementIndustryInfoListGet(accountId, accountType);
        System.out.println(response);
    }

}