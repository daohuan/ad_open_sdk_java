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
import com.bytedance.ads.api.AdlabGroupUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdlabGroupUpdateV30Request;
import com.bytedance.ads.model.AdlabGroupUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/adlab/group/update/ POST
public class AdlabGroupUpdateV30ApiExample {

    private static final AdlabGroupUpdateV30Api api = new AdlabGroupUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        AdlabGroupUpdateV30Request adlabGroupUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdlabGroupUpdateV30Response response = api.openApiV30AdlabGroupUpdatePost(adlabGroupUpdateV30Request);
        System.out.println(response);
    }

}