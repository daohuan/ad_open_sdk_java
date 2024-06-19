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
import com.bytedance.ads.api.ToolsClueLiteContactGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueLiteContactGetV2Request;
import com.bytedance.ads.model.ToolsClueLiteContactGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/lite/contact/get/ POST
public class ToolsClueLiteContactGetV2ApiExample {

    private static final ToolsClueLiteContactGetV2Api api = new ToolsClueLiteContactGetV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsClueLiteContactGetV2Request toolsClueLiteContactGetV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueLiteContactGetV2Response response = api.openApi2ToolsClueLiteContactGetPost(toolsClueLiteContactGetV2Request);
        System.out.println(response);
    }

}