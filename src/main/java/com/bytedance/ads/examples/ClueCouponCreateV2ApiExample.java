/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ClueCouponCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueCouponCreateV2Request;
import com.bytedance.ads.model.ClueCouponCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/coupon/create/ POST
public class ClueCouponCreateV2ApiExample {

    private static final ClueCouponCreateV2Api api = new ClueCouponCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ClueCouponCreateV2Request clueCouponCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueCouponCreateV2Response response = api.openApi2ClueCouponCreatePost(clueCouponCreateV2Request);
        System.out.println(response);
    }

}