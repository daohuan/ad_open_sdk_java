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
import com.bytedance.ads.api.FileVideoAdV2Api;
import com.bytedance.ads.ApiClient;
import java.io.File;
import com.bytedance.ads.model.FileVideoAdV2Response;
import com.bytedance.ads.model.FileVideoAdV2UploadType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/video/ad/ POST
public class FileVideoAdV2ApiExample {

    private static final FileVideoAdV2Api api = new FileVideoAdV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String filename = null;
        Boolean isAigc = null;
        Boolean isGuideVideo = null;
        List<String> labels = null;
        FileVideoAdV2UploadType uploadType = null;
        File videoFile = null;
        String videoSignature = null;
        String videoUrl = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileVideoAdV2Response response = api.openApi2FileVideoAdPost(advertiserId, filename, isAigc, isGuideVideo, labels, uploadType, videoFile, videoSignature, videoUrl);
        System.out.println(response);
    }

}