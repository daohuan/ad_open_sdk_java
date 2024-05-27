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
import com.bytedance.ads.api.ClueFormDetailV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueFormDetailV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/form/detail/ GET
public class ClueFormDetailV2ApiExample {

    private static final ClueFormDetailV2Api api = new ClueFormDetailV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long instanceId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueFormDetailV2Response response = api.openApi2ClueFormDetailGet(advertiserId, instanceId);
        System.out.println(response);
    }

}