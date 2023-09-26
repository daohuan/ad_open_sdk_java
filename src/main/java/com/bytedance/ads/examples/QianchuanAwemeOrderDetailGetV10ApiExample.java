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
import com.bytedance.ads.api.QianchuanAwemeOrderDetailGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/aweme/order/detail/get/ GET
public class QianchuanAwemeOrderDetailGetV10ApiExample {

    private static final QianchuanAwemeOrderDetailGetV10Api api = new QianchuanAwemeOrderDetailGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long orderId = null;
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAwemeOrderDetailGetV10Response response = api.openApiV10QianchuanAwemeOrderDetailGetGet(orderId, advertiserId);
        System.out.println(response);
    }

}