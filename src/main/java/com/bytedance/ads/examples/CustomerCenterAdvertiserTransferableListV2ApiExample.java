/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CustomerCenterAdvertiserTransferableListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CustomerCenterAdvertiserTransferableListV2Response;
import com.bytedance.ads.model.CustomerCenterAdvertiserTransferableListV2TransferAccountType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/customer_center/advertiser/transferable/list/ GET
public class CustomerCenterAdvertiserTransferableListV2ApiExample {

    private static final CustomerCenterAdvertiserTransferableListV2Api api = new CustomerCenterAdvertiserTransferableListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        CustomerCenterAdvertiserTransferableListV2TransferAccountType transferAccountType = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CustomerCenterAdvertiserTransferableListV2Response response = api.openApi2CustomerCenterAdvertiserTransferableListGet(advertiserId, transferAccountType, page, pageSize);
        System.out.println(response);
    }

}