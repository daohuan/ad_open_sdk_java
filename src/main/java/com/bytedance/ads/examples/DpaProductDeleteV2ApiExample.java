/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DpaProductDeleteV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaProductDeleteV2Request;
import com.bytedance.ads.model.DpaProductDeleteV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/product/delete/ POST
public class DpaProductDeleteV2ApiExample {

    private static final DpaProductDeleteV2Api api = new DpaProductDeleteV2Api();

    public static void main(String[] args) throws ApiException {
        DpaProductDeleteV2Request dpaProductDeleteV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaProductDeleteV2Response response = api.openApi2DpaProductDeletePost(dpaProductDeleteV2Request);
        System.out.println(response);
    }

}