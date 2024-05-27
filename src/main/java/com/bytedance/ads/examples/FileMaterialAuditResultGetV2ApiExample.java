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
import com.bytedance.ads.api.FileMaterialAuditResultGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileMaterialAuditResultGetV2MaterialInfosInner;
import com.bytedance.ads.model.FileMaterialAuditResultGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/material/audit_result/get/ GET
public class FileMaterialAuditResultGetV2ApiExample {

    private static final FileMaterialAuditResultGetV2Api api = new FileMaterialAuditResultGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<FileMaterialAuditResultGetV2MaterialInfosInner> materialInfos = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileMaterialAuditResultGetV2Response response = api.openApi2FileMaterialAuditResultGetGet(advertiserId, materialInfos);
        System.out.println(response);
    }

}