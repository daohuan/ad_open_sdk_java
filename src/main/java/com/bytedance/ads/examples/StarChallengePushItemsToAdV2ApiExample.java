/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarChallengePushItemsToAdV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarChallengePushItemsToAdV2Request;
import com.bytedance.ads.model.StarChallengePushItemsToAdV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/challenge/push_items_to_ad/ POST
public class StarChallengePushItemsToAdV2ApiExample {

    private static final StarChallengePushItemsToAdV2Api api = new StarChallengePushItemsToAdV2Api();

    public static void main(String[] args) throws ApiException {
        StarChallengePushItemsToAdV2Request starChallengePushItemsToAdV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarChallengePushItemsToAdV2Response response = api.openApi2StarChallengePushItemsToAdPost(starChallengePushItemsToAdV2Request);
        System.out.println(response);
    }

}