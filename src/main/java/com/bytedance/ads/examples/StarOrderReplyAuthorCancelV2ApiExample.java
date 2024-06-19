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
import com.bytedance.ads.api.StarOrderReplyAuthorCancelV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderReplyAuthorCancelV2Request;
import com.bytedance.ads.model.StarOrderReplyAuthorCancelV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/reply_author_cancel/ POST
public class StarOrderReplyAuthorCancelV2ApiExample {

    private static final StarOrderReplyAuthorCancelV2Api api = new StarOrderReplyAuthorCancelV2Api();

    public static void main(String[] args) throws ApiException {
        StarOrderReplyAuthorCancelV2Request starOrderReplyAuthorCancelV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderReplyAuthorCancelV2Response response = api.openApi2StarOrderReplyAuthorCancelPost(starOrderReplyAuthorCancelV2Request);
        System.out.println(response);
    }

}