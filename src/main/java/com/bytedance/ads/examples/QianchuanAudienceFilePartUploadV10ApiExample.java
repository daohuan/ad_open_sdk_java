/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAudienceFilePartUploadV10Api;
import com.bytedance.ads.ApiClient;
import java.io.File;
import com.bytedance.ads.model.QianchuanAudienceFilePartUploadV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/audience_file/part_upload/ POST
public class QianchuanAudienceFilePartUploadV10ApiExample {

    private static final QianchuanAudienceFilePartUploadV10Api api = new QianchuanAudienceFilePartUploadV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        File _file = null;
        Integer isFinished = null;
        Long partNum = null;
        String fileKey = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAudienceFilePartUploadV10Response response = api.openApiV10QianchuanAudienceFilePartUploadPost(advertiserId, _file, isFinished, partNum, fileKey);
        System.out.println(response);
    }

}