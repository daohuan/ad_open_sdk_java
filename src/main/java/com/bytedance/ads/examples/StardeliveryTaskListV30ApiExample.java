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
import com.bytedance.ads.api.StardeliveryTaskListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StardeliveryTaskListV30Filtering;
import com.bytedance.ads.model.StardeliveryTaskListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/stardelivery/task/list/ GET
public class StardeliveryTaskListV30ApiExample {

    private static final StardeliveryTaskListV30Api api = new StardeliveryTaskListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        StardeliveryTaskListV30Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StardeliveryTaskListV30Response response = api.openApiV30StardeliveryTaskListGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}