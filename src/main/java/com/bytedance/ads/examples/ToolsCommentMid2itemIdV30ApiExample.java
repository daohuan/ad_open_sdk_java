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
import com.bytedance.ads.api.ToolsCommentMid2itemIdV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsCommentMid2itemIdV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/comment/mid2item_id/ GET
public class ToolsCommentMid2itemIdV30ApiExample {

    private static final ToolsCommentMid2itemIdV30Api api = new ToolsCommentMid2itemIdV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startTime = null;
        String endTime = null;
        Long materialId = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsCommentMid2itemIdV30Response response = api.openApiV30ToolsCommentMid2itemIdGet(advertiserId, startTime, endTime, materialId, page, pageSize);
        System.out.println(response);
    }

}