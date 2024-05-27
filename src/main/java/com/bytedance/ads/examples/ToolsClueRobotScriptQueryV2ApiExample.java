/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueRobotScriptQueryV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueRobotScriptQueryV2Request;
import com.bytedance.ads.model.ToolsClueRobotScriptQueryV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/robot/script/query/ POST
public class ToolsClueRobotScriptQueryV2ApiExample {

    private static final ToolsClueRobotScriptQueryV2Api api = new ToolsClueRobotScriptQueryV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsClueRobotScriptQueryV2Request toolsClueRobotScriptQueryV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueRobotScriptQueryV2Response response = api.openApi2ToolsClueRobotScriptQueryPost(toolsClueRobotScriptQueryV2Request);
        System.out.println(response);
    }

}