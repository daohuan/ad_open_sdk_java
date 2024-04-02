/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarOrderGetVideoV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderGetVideoV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/get_video/ GET
public class StarOrderGetVideoV2ApiExample {

    private static final StarOrderGetVideoV2Api api = new StarOrderGetVideoV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        List<Long> orderIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderGetVideoV2Response response = api.openApi2StarOrderGetVideoGet(starId, orderIds);
        System.out.println(response);
    }

}