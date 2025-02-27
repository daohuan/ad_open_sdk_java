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
import com.bytedance.ads.api.CreativeCustomCreativeDeleteV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeCustomCreativeDeleteV2Request;
import com.bytedance.ads.model.CreativeCustomCreativeDeleteV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/custom_creative/delete/ POST
public class CreativeCustomCreativeDeleteV2ApiExample {

    private static final CreativeCustomCreativeDeleteV2Api api = new CreativeCustomCreativeDeleteV2Api();

    public static void main(String[] args) throws ApiException {
        CreativeCustomCreativeDeleteV2Request creativeCustomCreativeDeleteV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeCustomCreativeDeleteV2Response response = api.openApi2CreativeCustomCreativeDeletePost(creativeCustomCreativeDeleteV2Request);
        System.out.println(response);
    }

}