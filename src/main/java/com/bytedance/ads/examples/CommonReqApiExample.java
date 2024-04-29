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

import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.Pair;
import com.bytedance.ads.api.CommonReqApi;
import com.bytedance.ads.model.CommonResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API Example for CommonReqApi
 */
public class CommonReqApiExample {
    private static final CommonReqApi api = new CommonReqApi();


    public static void main(String[] args) throws ApiException {

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://api.oceanengine.com");
        apiClient.addDefaultHeader("Access-Token", "test");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        List<Pair> query = new ArrayList<Pair>();
        Map<String, Object> queryParams = new HashMap<>();
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("app_id", 1111L);
        requestBody.put("secret", "test");
        requestBody.put("auth_code", "test");
        CommonResponse response = api.commonReq("POST", "/open_api/oauth2/access_token/", "application/json", null, null, requestBody);
        System.out.println(response);
    }
}