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
import com.bytedance.ads.api.QianchuanAdBidUpdateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdBidUpdateV10Request;
import com.bytedance.ads.model.QianchuanAdBidUpdateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/bid/update/ POST
public class QianchuanAdBidUpdateV10ApiExample {

    private static final QianchuanAdBidUpdateV10Api api = new QianchuanAdBidUpdateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanAdBidUpdateV10Request qianchuanAdBidUpdateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdBidUpdateV10Response response = api.openApiV10QianchuanAdBidUpdatePost(qianchuanAdBidUpdateV10Request);
        System.out.println(response);
    }

}