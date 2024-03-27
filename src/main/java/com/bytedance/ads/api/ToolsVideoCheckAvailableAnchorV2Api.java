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


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.ToolsVideoCheckAvailableAnchorV2ExternalAction;
import com.bytedance.ads.model.ToolsVideoCheckAvailableAnchorV2LandingType;
import com.bytedance.ads.model.ToolsVideoCheckAvailableAnchorV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsVideoCheckAvailableAnchorV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsVideoCheckAvailableAnchorV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsVideoCheckAvailableAnchorV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsVideoCheckAvailableAnchorGet
     * @param advertiserId 广告主ID (required)
     * @param itemIds 抖音视频ID (required)
     * @param landingType 推广目的 (required)
     * @param externalAction 转化目标 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsVideoCheckAvailableAnchorGetCall(String advertiserId, List<Long> itemIds, ToolsVideoCheckAvailableAnchorV2LandingType landingType, ToolsVideoCheckAvailableAnchorV2ExternalAction externalAction, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/video/check_available_anchor/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (itemIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "item_ids", itemIds));
        }

        if (landingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("landing_type", landingType));
        }

        if (externalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_action", externalAction));
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
    private okhttp3.Call openApi2ToolsVideoCheckAvailableAnchorGetValidateBeforeCall(String advertiserId, List<Long> itemIds, ToolsVideoCheckAvailableAnchorV2LandingType landingType, ToolsVideoCheckAvailableAnchorV2ExternalAction externalAction, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsVideoCheckAvailableAnchorGet(Async)");
        }

        // verify the required parameter 'itemIds' is set
        if (itemIds == null) {
            throw new ApiException("Missing the required parameter 'itemIds' when calling openApi2ToolsVideoCheckAvailableAnchorGet(Async)");
        }

        // verify the required parameter 'landingType' is set
        if (landingType == null) {
            throw new ApiException("Missing the required parameter 'landingType' when calling openApi2ToolsVideoCheckAvailableAnchorGet(Async)");
        }

        // verify the required parameter 'externalAction' is set
        if (externalAction == null) {
            throw new ApiException("Missing the required parameter 'externalAction' when calling openApi2ToolsVideoCheckAvailableAnchorGet(Async)");
        }

        return openApi2ToolsVideoCheckAvailableAnchorGetCall(advertiserId, itemIds, landingType, externalAction, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param itemIds 抖音视频ID (required)
     * @param landingType 推广目的 (required)
     * @param externalAction 转化目标 (required)
     * @return ToolsVideoCheckAvailableAnchorV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsVideoCheckAvailableAnchorV2Response openApi2ToolsVideoCheckAvailableAnchorGet(String advertiserId, List<Long> itemIds, ToolsVideoCheckAvailableAnchorV2LandingType landingType, ToolsVideoCheckAvailableAnchorV2ExternalAction externalAction) throws ApiException {
        ApiResponse<ToolsVideoCheckAvailableAnchorV2Response> localVarResp = openApi2ToolsVideoCheckAvailableAnchorGetWithHttpInfo(advertiserId, itemIds, landingType, externalAction);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param itemIds 抖音视频ID (required)
     * @param landingType 推广目的 (required)
     * @param externalAction 转化目标 (required)
     * @return ApiResponse&lt;ToolsVideoCheckAvailableAnchorV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsVideoCheckAvailableAnchorV2Response> openApi2ToolsVideoCheckAvailableAnchorGetWithHttpInfo(String advertiserId, List<Long> itemIds, ToolsVideoCheckAvailableAnchorV2LandingType landingType, ToolsVideoCheckAvailableAnchorV2ExternalAction externalAction) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsVideoCheckAvailableAnchorGetValidateBeforeCall(advertiserId, itemIds, landingType, externalAction, null);
        Type localVarReturnType = new TypeToken<ToolsVideoCheckAvailableAnchorV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param itemIds 抖音视频ID (required)
     * @param landingType 推广目的 (required)
     * @param externalAction 转化目标 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsVideoCheckAvailableAnchorGetAsync(String advertiserId, List<Long> itemIds, ToolsVideoCheckAvailableAnchorV2LandingType landingType, ToolsVideoCheckAvailableAnchorV2ExternalAction externalAction, final ApiCallback<ToolsVideoCheckAvailableAnchorV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsVideoCheckAvailableAnchorGetValidateBeforeCall(advertiserId, itemIds, landingType, externalAction, _callback);
        Type localVarReturnType = new TypeToken<ToolsVideoCheckAvailableAnchorV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
