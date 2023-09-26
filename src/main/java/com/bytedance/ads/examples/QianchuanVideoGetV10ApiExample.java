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
import com.bytedance.ads.api.QianchuanVideoGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanVideoGetV10Filtering;
import com.bytedance.ads.model.QianchuanVideoGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/video/get/ GET
public class QianchuanVideoGetV10ApiExample {

    private static final QianchuanVideoGetV10Api api = new QianchuanVideoGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanVideoGetV10Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanVideoGetV10Response response = api.openApiV10QianchuanVideoGetGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}