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
import com.bytedance.ads.api.CreativeProceduralCreativeCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2Request;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/procedural_creative/create/ POST
public class CreativeProceduralCreativeCreateV2ApiExample {

    private static final CreativeProceduralCreativeCreateV2Api api = new CreativeProceduralCreativeCreateV2Api();

    public static void main(String[] args) throws ApiException {
        CreativeProceduralCreativeCreateV2Request creativeProceduralCreativeCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeProceduralCreativeCreateV2Response response = api.openApi2CreativeProceduralCreativeCreatePost(creativeProceduralCreativeCreateV2Request);
        System.out.println(response);
    }

}