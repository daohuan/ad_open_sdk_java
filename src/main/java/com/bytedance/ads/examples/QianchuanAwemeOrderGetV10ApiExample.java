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
import com.bytedance.ads.api.QianchuanAwemeOrderGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10Count;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10Filtering;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/aweme/order/get/ GET
public class QianchuanAwemeOrderGetV10ApiExample {

    private static final QianchuanAwemeOrderGetV10Api api = new QianchuanAwemeOrderGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanAwemeOrderGetV10Filtering filtering = null;
        Long cursor = null;
        QianchuanAwemeOrderGetV10Count count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAwemeOrderGetV10Response response = api.openApiV10QianchuanAwemeOrderGetGet(advertiserId, filtering, cursor, count);
        System.out.println(response);
    }

}