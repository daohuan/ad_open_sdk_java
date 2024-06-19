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
import com.bytedance.ads.api.StarDemandOmUpdateChallengeV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarDemandOmUpdateChallengeV2Request;
import com.bytedance.ads.model.StarDemandOmUpdateChallengeV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/demand/om_update_challenge/ POST
public class StarDemandOmUpdateChallengeV2ApiExample {

    private static final StarDemandOmUpdateChallengeV2Api api = new StarDemandOmUpdateChallengeV2Api();

    public static void main(String[] args) throws ApiException {
        StarDemandOmUpdateChallengeV2Request starDemandOmUpdateChallengeV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarDemandOmUpdateChallengeV2Response response = api.openApi2StarDemandOmUpdateChallengePost(starDemandOmUpdateChallengeV2Request);
        System.out.println(response);
    }

}