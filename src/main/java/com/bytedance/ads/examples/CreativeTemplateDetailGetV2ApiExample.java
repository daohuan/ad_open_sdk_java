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
import com.bytedance.ads.api.CreativeTemplateDetailGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeTemplateDetailGetV2Response;
import com.bytedance.ads.model.CreativeTemplateDetailGetV2TemplateType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/template/detail/get/ GET
public class CreativeTemplateDetailGetV2ApiExample {

    private static final CreativeTemplateDetailGetV2Api api = new CreativeTemplateDetailGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long templateId = null;
        CreativeTemplateDetailGetV2TemplateType templateType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeTemplateDetailGetV2Response response = api.openApi2CreativeTemplateDetailGetGet(advertiserId, templateId, templateType);
        System.out.println(response);
    }

}