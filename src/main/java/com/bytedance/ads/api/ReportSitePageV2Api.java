/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.ReportSitePageV2InventoryType;
import com.bytedance.ads.model.ReportSitePageV2Response;
import com.bytedance.ads.model.ReportSitePageV2TimeDuration;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportSitePageV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportSitePageV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportSitePageV2Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for openApi2ReportSitePageGet
     * @param advertiserId  (optional)
     * @param inventoryType  (optional)
     * @param siteId  (optional)
     * @param timeDuration  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportSitePageGetCall(Long advertiserId, ReportSitePageV2InventoryType inventoryType, String siteId, ReportSitePageV2TimeDuration timeDuration, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open_api/2/report/site/page/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (inventoryType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("inventory_type", inventoryType));
        }

        if (siteId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("site_id", siteId));
        }

        if (timeDuration != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_duration", timeDuration));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2ReportSitePageGetValidateBeforeCall(Long advertiserId, ReportSitePageV2InventoryType inventoryType, String siteId, ReportSitePageV2TimeDuration timeDuration, final ApiCallback _callback) throws ApiException {
        return openApi2ReportSitePageGetCall(advertiserId, inventoryType, siteId, timeDuration, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param inventoryType  (optional)
     * @param siteId  (optional)
     * @param timeDuration  (optional)
     * @return ReportSitePageV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportSitePageV2Response openApi2ReportSitePageGet(Long advertiserId, ReportSitePageV2InventoryType inventoryType, String siteId, ReportSitePageV2TimeDuration timeDuration) throws ApiException {
        ApiResponse<ReportSitePageV2Response> localVarResp = openApi2ReportSitePageGetWithHttpInfo(advertiserId, inventoryType, siteId, timeDuration);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param inventoryType  (optional)
     * @param siteId  (optional)
     * @param timeDuration  (optional)
     * @return ApiResponse&lt;ReportSitePageV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportSitePageV2Response> openApi2ReportSitePageGetWithHttpInfo(Long advertiserId, ReportSitePageV2InventoryType inventoryType, String siteId, ReportSitePageV2TimeDuration timeDuration) throws ApiException {
        okhttp3.Call localVarCall = openApi2ReportSitePageGetValidateBeforeCall(advertiserId, inventoryType, siteId, timeDuration, null);
        Type localVarReturnType = new TypeToken<ReportSitePageV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (optional)
     * @param inventoryType  (optional)
     * @param siteId  (optional)
     * @param timeDuration  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportSitePageGetAsync(Long advertiserId, ReportSitePageV2InventoryType inventoryType, String siteId, ReportSitePageV2TimeDuration timeDuration, final ApiCallback<ReportSitePageV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ReportSitePageGetValidateBeforeCall(advertiserId, inventoryType, siteId, timeDuration, _callback);
        Type localVarReturnType = new TypeToken<ReportSitePageV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
