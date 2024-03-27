/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanProductAnalyseListV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanProductAnalyseListV10OrderType;
import com.bytedance.ads.model.QianchuanProductAnalyseListV10Response;
import com.bytedance.ads.model.QianchuanProductAnalyseListV10TimeRange;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/product/analyse/list/ GET
public class QianchuanProductAnalyseListV10ApiExample {

    private static final QianchuanProductAnalyseListV10Api api = new QianchuanProductAnalyseListV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String keyword = null;
        QianchuanProductAnalyseListV10TimeRange timeRange = null;
        QianchuanProductAnalyseListV10OrderType orderType = null;
        String orderField = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanProductAnalyseListV10Response response = api.openApiV10QianchuanProductAnalyseListGet(advertiserId, keyword, timeRange, orderType, orderField, page, pageSize);
        System.out.println(response);
    }

}