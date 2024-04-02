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


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.ToolsSiteGetV2Filtering;
import com.bytedance.ads.model.ToolsSiteGetV2Response;
import com.bytedance.ads.model.ToolsSiteGetV2Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsSiteGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsSiteGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsSiteGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsSiteGetGet
     * @param advertiserId 广告主id，范围：1 &lt;&#x3D; advertiser_id &lt;&#x3D; MAX_INT64 (required)
     * @param xOrangeCaller  (optional)
     * @param page 页码，默认值: 1，范围：page &gt;&#x3D; 1 (optional, default to 1)
     * @param pageSize 页面数据量，默认值：10，范围：20～300 (optional, default to 10)
     * @param status 建站粗粒度状态，详见【附录-枚举值-建站粗粒度状态】 (optional)
     * @param filtering 过滤条件 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsSiteGetGetCall(Long advertiserId, String xOrangeCaller, Long page, Long pageSize, ToolsSiteGetV2Status status, ToolsSiteGetV2Filtering filtering, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/site/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (xOrangeCaller != null) {
            localVarHeaderParams.put("X-Orange-Caller", localVarApiClient.parameterToString(xOrangeCaller));
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
    private okhttp3.Call openApi2ToolsSiteGetGetValidateBeforeCall(Long advertiserId, String xOrangeCaller, Long page, Long pageSize, ToolsSiteGetV2Status status, ToolsSiteGetV2Filtering filtering, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsSiteGetGet(Async)");
        }

        return openApi2ToolsSiteGetGetCall(advertiserId, xOrangeCaller, page, pageSize, status, filtering, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主id，范围：1 &lt;&#x3D; advertiser_id &lt;&#x3D; MAX_INT64 (required)
     * @param xOrangeCaller  (optional)
     * @param page 页码，默认值: 1，范围：page &gt;&#x3D; 1 (optional, default to 1)
     * @param pageSize 页面数据量，默认值：10，范围：20～300 (optional, default to 10)
     * @param status 建站粗粒度状态，详见【附录-枚举值-建站粗粒度状态】 (optional)
     * @param filtering 过滤条件 (optional)
     * @return ToolsSiteGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsSiteGetV2Response openApi2ToolsSiteGetGet(Long advertiserId, String xOrangeCaller, Long page, Long pageSize, ToolsSiteGetV2Status status, ToolsSiteGetV2Filtering filtering) throws ApiException {
        ApiResponse<ToolsSiteGetV2Response> localVarResp = openApi2ToolsSiteGetGetWithHttpInfo(advertiserId, xOrangeCaller, page, pageSize, status, filtering);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主id，范围：1 &lt;&#x3D; advertiser_id &lt;&#x3D; MAX_INT64 (required)
     * @param xOrangeCaller  (optional)
     * @param page 页码，默认值: 1，范围：page &gt;&#x3D; 1 (optional, default to 1)
     * @param pageSize 页面数据量，默认值：10，范围：20～300 (optional, default to 10)
     * @param status 建站粗粒度状态，详见【附录-枚举值-建站粗粒度状态】 (optional)
     * @param filtering 过滤条件 (optional)
     * @return ApiResponse&lt;ToolsSiteGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsSiteGetV2Response> openApi2ToolsSiteGetGetWithHttpInfo(Long advertiserId, String xOrangeCaller, Long page, Long pageSize, ToolsSiteGetV2Status status, ToolsSiteGetV2Filtering filtering) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsSiteGetGetValidateBeforeCall(advertiserId, xOrangeCaller, page, pageSize, status, filtering, null);
        Type localVarReturnType = new TypeToken<ToolsSiteGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主id，范围：1 &lt;&#x3D; advertiser_id &lt;&#x3D; MAX_INT64 (required)
     * @param xOrangeCaller  (optional)
     * @param page 页码，默认值: 1，范围：page &gt;&#x3D; 1 (optional, default to 1)
     * @param pageSize 页面数据量，默认值：10，范围：20～300 (optional, default to 10)
     * @param status 建站粗粒度状态，详见【附录-枚举值-建站粗粒度状态】 (optional)
     * @param filtering 过滤条件 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsSiteGetGetAsync(Long advertiserId, String xOrangeCaller, Long page, Long pageSize, ToolsSiteGetV2Status status, ToolsSiteGetV2Filtering filtering, final ApiCallback<ToolsSiteGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsSiteGetGetValidateBeforeCall(advertiserId, xOrangeCaller, page, pageSize, status, filtering, _callback);
        Type localVarReturnType = new TypeToken<ToolsSiteGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
