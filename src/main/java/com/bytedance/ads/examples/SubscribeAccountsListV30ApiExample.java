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
import com.bytedance.ads.api.SubscribeAccountsListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.SubscribeAccountsListV30Response;
import com.bytedance.ads.model.SubscribeAccountsListV30Statuses;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/subscribe/accounts/list/ GET
public class SubscribeAccountsListV30ApiExample {

    private static final SubscribeAccountsListV30Api api = new SubscribeAccountsListV30Api();

    public static void main(String[] args) throws ApiException {
        String apPAccessToken = null;
        Long appId = null;
        Long subscribeTaskId = null;
        List<String> events = null;
        Long coreUserId = null;
        List<Long> advertiserIds = null;
        List<SubscribeAccountsListV30Statuses> statuses = null;
        Long cursor = null;
        Long count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        SubscribeAccountsListV30Response response = api.openApiV30SubscribeAccountsListGet(apPAccessToken, appId, subscribeTaskId, events, coreUserId, advertiserIds, statuses, cursor, count);
        System.out.println(response);
    }

}