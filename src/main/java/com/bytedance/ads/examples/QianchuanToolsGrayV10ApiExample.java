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
import com.bytedance.ads.api.QianchuanToolsGrayV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanToolsGrayV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/tools/gray/ GET
public class QianchuanToolsGrayV10ApiExample {

    private static final QianchuanToolsGrayV10Api api = new QianchuanToolsGrayV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<String> grayKeys = null;
        List<Long> awemeIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanToolsGrayV10Response response = api.openApiV10QianchuanToolsGrayGet(advertiserId, grayKeys, awemeIds);
        System.out.println(response);
    }

}