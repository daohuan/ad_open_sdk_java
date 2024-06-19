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
import com.bytedance.ads.api.ClueCouponCodeConsumeV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueCouponCodeConsumeV2Request;
import com.bytedance.ads.model.ClueCouponCodeConsumeV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/coupon/code/consume/ POST
public class ClueCouponCodeConsumeV2ApiExample {

    private static final ClueCouponCodeConsumeV2Api api = new ClueCouponCodeConsumeV2Api();

    public static void main(String[] args) throws ApiException {
        ClueCouponCodeConsumeV2Request clueCouponCodeConsumeV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueCouponCodeConsumeV2Response response = api.openApi2ClueCouponCodeConsumePost(clueCouponCodeConsumeV2Request);
        System.out.println(response);
    }

}