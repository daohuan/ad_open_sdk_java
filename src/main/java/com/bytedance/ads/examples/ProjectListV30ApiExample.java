/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ProjectListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ProjectListV30Filtering;
import com.bytedance.ads.model.ProjectListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/project/list/ GET
public class ProjectListV30ApiExample {

    private static final ProjectListV30Api api = new ProjectListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<String> fields = null;
        ProjectListV30Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ProjectListV30Response response = api.openApiV30ProjectListGet(advertiserId, fields, filtering, page, pageSize);
        System.out.println(response);
    }

}