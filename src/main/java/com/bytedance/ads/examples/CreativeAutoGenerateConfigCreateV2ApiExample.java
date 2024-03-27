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
import com.bytedance.ads.api.CreativeAutoGenerateConfigCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeAutoGenerateConfigCreateV2Request;
import com.bytedance.ads.model.CreativeAutoGenerateConfigCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/auto_generate_config/create/ POST
public class CreativeAutoGenerateConfigCreateV2ApiExample {

    private static final CreativeAutoGenerateConfigCreateV2Api api = new CreativeAutoGenerateConfigCreateV2Api();

    public static void main(String[] args) throws ApiException {
        CreativeAutoGenerateConfigCreateV2Request creativeAutoGenerateConfigCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeAutoGenerateConfigCreateV2Response response = api.openApi2CreativeAutoGenerateConfigCreatePost(creativeAutoGenerateConfigCreateV2Request);
        System.out.println(response);
    }

}