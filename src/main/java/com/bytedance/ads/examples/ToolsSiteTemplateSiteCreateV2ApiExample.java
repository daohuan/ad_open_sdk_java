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
import com.bytedance.ads.api.ToolsSiteTemplateSiteCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2Request;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/site_template/site/create/ POST
public class ToolsSiteTemplateSiteCreateV2ApiExample {

    private static final ToolsSiteTemplateSiteCreateV2Api api = new ToolsSiteTemplateSiteCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsSiteTemplateSiteCreateV2Request toolsSiteTemplateSiteCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsSiteTemplateSiteCreateV2Response response = api.openApi2ToolsSiteTemplateSiteCreatePost(toolsSiteTemplateSiteCreateV2Request);
        System.out.println(response);
    }

}