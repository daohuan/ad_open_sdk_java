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
import com.bytedance.ads.api.NativeAnchorQrcodePreviewGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.NativeAnchorQrcodePreviewGetV30AnchorType;
import com.bytedance.ads.model.NativeAnchorQrcodePreviewGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/native_anchor/qrcode_preview/get/ GET
public class NativeAnchorQrcodePreviewGetV30ApiExample {

    private static final NativeAnchorQrcodePreviewGetV30Api api = new NativeAnchorQrcodePreviewGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<String> anchorIds = null;
        NativeAnchorQrcodePreviewGetV30AnchorType anchorType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        NativeAnchorQrcodePreviewGetV30Response response = api.openApiV30NativeAnchorQrcodePreviewGetGet(advertiserId, anchorIds, anchorType);
        System.out.println(response);
    }

}