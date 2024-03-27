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
import com.bytedance.ads.api.StarMcnGetUnparticipatedTaskV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarMcnGetUnparticipatedTaskV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/mcn/get_unparticipated_task/ GET
public class StarMcnGetUnparticipatedTaskV2ApiExample {

    private static final StarMcnGetUnparticipatedTaskV2Api api = new StarMcnGetUnparticipatedTaskV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Integer page = null;
        Integer pageSize = null;
        Integer payType = null;
        Long minCreateTimeStamp = null;
        Long maxCreateTimeStamp = null;
        Long developerId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarMcnGetUnparticipatedTaskV2Response response = api.openApi2StarMcnGetUnparticipatedTaskGet(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, developerId);
        System.out.println(response);
    }

}