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
import com.bytedance.ads.api.PromotionUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.PromotionUpdateV30Request;
import com.bytedance.ads.model.PromotionUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/promotion/update/ POST
public class PromotionUpdateV30ApiExample {

    private static final PromotionUpdateV30Api api = new PromotionUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        PromotionUpdateV30Request promotionUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        PromotionUpdateV30Response response = api.openApiV30PromotionUpdatePost(promotionUpdateV30Request);
        System.out.println(response);
    }

}