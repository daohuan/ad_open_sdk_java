/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsBpAssetManagementShareGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30AssetType;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30Response;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30ShareType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/bp_asset_management/share/get/ GET
public class ToolsBpAssetManagementShareGetV30ApiExample {

    private static final ToolsBpAssetManagementShareGetV30Api api = new ToolsBpAssetManagementShareGetV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsBpAssetManagementShareGetV30AssetType assetType = null;
        Long instanceId = null;
        Long organizationId = null;
        Integer page = null;
        Integer pageSize = null;
        ToolsBpAssetManagementShareGetV30ShareType shareType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsBpAssetManagementShareGetV30Response response = api.openApiV30ToolsBpAssetManagementShareGetGet(assetType, instanceId, organizationId, page, pageSize, shareType);
        System.out.println(response);
    }

}