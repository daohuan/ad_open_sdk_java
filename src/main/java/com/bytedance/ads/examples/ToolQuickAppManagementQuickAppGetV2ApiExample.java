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
import com.bytedance.ads.api.ToolQuickAppManagementQuickAppGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolQuickAppManagementQuickAppGetV2Response;
import com.bytedance.ads.model.ToolQuickAppManagementQuickAppGetV2Status;
import com.bytedance.ads.model.ToolQuickAppManagementQuickAppGetV2UpdateTime;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tool/quick_app_management/quick_app/get/ GET
public class ToolQuickAppManagementQuickAppGetV2ApiExample {

    private static final ToolQuickAppManagementQuickAppGetV2Api api = new ToolQuickAppManagementQuickAppGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<ToolQuickAppManagementQuickAppGetV2Status> status = null;
        Integer page = null;
        Integer pageSize = null;
        ToolQuickAppManagementQuickAppGetV2UpdateTime updateTime = null;
        String searchKey = null;
        List<Long> quickAppIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolQuickAppManagementQuickAppGetV2Response response = api.openApi2ToolQuickAppManagementQuickAppGetGet(advertiserId, status, page, pageSize, updateTime, searchKey, quickAppIds);
        System.out.println(response);
    }

}