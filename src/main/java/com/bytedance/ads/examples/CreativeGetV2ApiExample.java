/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CreativeGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeGetV2Filtering;
import com.bytedance.ads.model.CreativeGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/get/ GET
public class CreativeGetV2ApiExample {

    private static final CreativeGetV2Api api = new CreativeGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        CreativeGetV2Filtering filtering = null;
        List<String> fields = null;
        Long page = null;
        Long pageSize = null;
        Long cursor = null;
        Long count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeGetV2Response response = api.openApi2CreativeGetGet(advertiserId, filtering, fields, page, pageSize, cursor, count);
        System.out.println(response);
    }

}