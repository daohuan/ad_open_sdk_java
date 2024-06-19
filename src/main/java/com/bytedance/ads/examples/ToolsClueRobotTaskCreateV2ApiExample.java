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
import com.bytedance.ads.api.ToolsClueRobotTaskCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueRobotTaskCreateV2Request;
import com.bytedance.ads.model.ToolsClueRobotTaskCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/robot/task/create/ POST
public class ToolsClueRobotTaskCreateV2ApiExample {

    private static final ToolsClueRobotTaskCreateV2Api api = new ToolsClueRobotTaskCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsClueRobotTaskCreateV2Request toolsClueRobotTaskCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueRobotTaskCreateV2Response response = api.openApi2ToolsClueRobotTaskCreatePost(toolsClueRobotTaskCreateV2Request);
        System.out.println(response);
    }

}