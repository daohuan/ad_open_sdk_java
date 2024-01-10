/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DpaDetailGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaDetailGetV2Filtering;
import com.bytedance.ads.model.DpaDetailGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/detail/get/ GET
public class DpaDetailGetV2ApiExample {

    private static final DpaDetailGetV2Api api = new DpaDetailGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long productPlatformId = null;
        DpaDetailGetV2Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaDetailGetV2Response response = api.openApi2DpaDetailGetGet(advertiserId, productPlatformId, filtering, page, pageSize);
        System.out.println(response);
    }

}