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
import com.bytedance.ads.api.StarDemandOrderListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarDemandOrderListV2Filtering;
import com.bytedance.ads.model.StarDemandOrderListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/demand/order/list/ GET
public class StarDemandOrderListV2ApiExample {

    private static final StarDemandOrderListV2Api api = new StarDemandOrderListV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long demandId = null;
        StarDemandOrderListV2Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarDemandOrderListV2Response response = api.openApi2StarDemandOrderListGet(starId, demandId, filtering, page, pageSize);
        System.out.println(response);
    }

}