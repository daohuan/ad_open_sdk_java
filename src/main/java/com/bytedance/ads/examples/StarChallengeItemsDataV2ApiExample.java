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
import com.bytedance.ads.api.StarChallengeItemsDataV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarChallengeItemsDataV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/challenge/items_data/ GET
public class StarChallengeItemsDataV2ApiExample {

    private static final StarChallengeItemsDataV2Api api = new StarChallengeItemsDataV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long challengeTaskId = null;
        Integer page = null;
        Integer limit = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarChallengeItemsDataV2Response response = api.openApi2StarChallengeItemsDataGet(starId, challengeTaskId, page, limit);
        System.out.println(response);
    }

}