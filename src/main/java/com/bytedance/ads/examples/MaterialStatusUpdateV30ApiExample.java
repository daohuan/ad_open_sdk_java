/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.MaterialStatusUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.MaterialStatusUpdateV30Request;
import com.bytedance.ads.model.MaterialStatusUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* API Example for MaterialStatusUpdateV30Api
*/
public class MaterialStatusUpdateV30ApiExample {

    private static final MaterialStatusUpdateV30Api api = new MaterialStatusUpdateV30Api();


    public static void main(String[] args) throws ApiException {
        MaterialStatusUpdateV30Request materialStatusUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        MaterialStatusUpdateV30Response response = api.openApiV30MaterialStatusUpdatePost(materialStatusUpdateV30Request);
        System.out.println(response);
    }

}