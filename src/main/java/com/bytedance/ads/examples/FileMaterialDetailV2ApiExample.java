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
import com.bytedance.ads.api.FileMaterialDetailV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileMaterialDetailV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/material/detail/ GET
public class FileMaterialDetailV2ApiExample {

    private static final FileMaterialDetailV2Api api = new FileMaterialDetailV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> materialIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileMaterialDetailV2Response response = api.openApi2FileMaterialDetailGet(advertiserId, materialIds);
        System.out.println(response);
    }

}