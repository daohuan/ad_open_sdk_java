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
import com.bytedance.ads.api.BudgetGroupCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BudgetGroupCreateV30Request;
import com.bytedance.ads.model.BudgetGroupCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/budget_group/create/ POST
public class BudgetGroupCreateV30ApiExample {

    private static final BudgetGroupCreateV30Api api = new BudgetGroupCreateV30Api();

    public static void main(String[] args) throws ApiException {
        BudgetGroupCreateV30Request budgetGroupCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BudgetGroupCreateV30Response response = api.openApiV30BudgetGroupCreatePost(budgetGroupCreateV30Request);
        System.out.println(response);
    }

}