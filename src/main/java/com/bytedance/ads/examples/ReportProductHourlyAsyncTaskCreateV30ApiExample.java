/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportProductHourlyAsyncTaskCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportProductHourlyAsyncTaskCreateV30Request;
import com.bytedance.ads.model.ReportProductHourlyAsyncTaskCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/product_hourly/async_task/create/ POST
public class ReportProductHourlyAsyncTaskCreateV30ApiExample {

    private static final ReportProductHourlyAsyncTaskCreateV30Api api = new ReportProductHourlyAsyncTaskCreateV30Api();

    public static void main(String[] args) throws ApiException {
        ReportProductHourlyAsyncTaskCreateV30Request reportProductHourlyAsyncTaskCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportProductHourlyAsyncTaskCreateV30Response response = api.openApiV30ReportProductHourlyAsyncTaskCreatePost(reportProductHourlyAsyncTaskCreateV30Request);
        System.out.println(response);
    }

}