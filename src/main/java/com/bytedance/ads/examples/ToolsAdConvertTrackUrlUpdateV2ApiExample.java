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
import com.bytedance.ads.api.ToolsAdConvertTrackUrlUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdConvertTrackUrlUpdateV2Request;
import com.bytedance.ads.model.ToolsAdConvertTrackUrlUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ad_convert/track_url/update/ POST
public class ToolsAdConvertTrackUrlUpdateV2ApiExample {

    private static final ToolsAdConvertTrackUrlUpdateV2Api api = new ToolsAdConvertTrackUrlUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAdConvertTrackUrlUpdateV2Request toolsAdConvertTrackUrlUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdConvertTrackUrlUpdateV2Response response = api.openApi2ToolsAdConvertTrackUrlUpdatePost(toolsAdConvertTrackUrlUpdateV2Request);
        System.out.println(response);
    }

}