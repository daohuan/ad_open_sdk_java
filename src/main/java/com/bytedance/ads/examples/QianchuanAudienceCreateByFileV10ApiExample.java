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
import com.bytedance.ads.api.QianchuanAudienceCreateByFileV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAudienceCreateByFileV10Request;
import com.bytedance.ads.model.QianchuanAudienceCreateByFileV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/audience/create_by_file/ POST
public class QianchuanAudienceCreateByFileV10ApiExample {

    private static final QianchuanAudienceCreateByFileV10Api api = new QianchuanAudienceCreateByFileV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanAudienceCreateByFileV10Request qianchuanAudienceCreateByFileV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAudienceCreateByFileV10Response response = api.openApiV10QianchuanAudienceCreateByFilePost(qianchuanAudienceCreateByFileV10Request);
        System.out.println(response);
    }

}