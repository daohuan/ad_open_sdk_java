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
import com.bytedance.ads.api.CluePackageUploadV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CluePackageUploadV2Request;
import com.bytedance.ads.model.CluePackageUploadV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/package/upload/ POST
public class CluePackageUploadV2ApiExample {

    private static final CluePackageUploadV2Api api = new CluePackageUploadV2Api();

    public static void main(String[] args) throws ApiException {
        CluePackageUploadV2Request cluePackageUploadV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CluePackageUploadV2Response response = api.openApi2CluePackageUploadPost(cluePackageUploadV2Request);
        System.out.println(response);
    }

}