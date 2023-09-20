/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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



import com.bytedance.ads.model.ReportRubeexGetV2Filtering;
import com.bytedance.ads.model.ReportRubeexGetV2Order;
import com.bytedance.ads.model.ReportRubeexGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportRubeexGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportRubeexGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportRubeexGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ReportRubeexGetGet
     * @param advertiserId  (optional)
     * @param dimensions  (optional)
     * @param filtering  (optional)
     * @param metrics  (optional)
     * @param order  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param projectId  (optional)
     * @param statTimeDay  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportRubeexGetGetCall(Long advertiserId, List<String> dimensions, ReportRubeexGetV2Filtering filtering, List<String> metrics, ReportRubeexGetV2Order order, Long page, Long pageSize, Long projectId, List<String> statTimeDay, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/report/rubeex/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (dimensions != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "dimensions", dimensions));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (metrics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "metrics", metrics));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (projectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("project_id", projectId));
        }

        if (statTimeDay != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "stat_time_day", statTimeDay));
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2ReportRubeexGetGetValidateBeforeCall(Long advertiserId, List<String> dimensions, ReportRubeexGetV2Filtering filtering, List<String> metrics, ReportRubeexGetV2Order order, Long page, Long pageSize, Long projectId, List<String> statTimeDay, final ApiCallback _callback) throws ApiException {
        return openApi2ReportRubeexGetGetCall(advertiserId, dimensions, filtering, metrics, order, page, pageSize, projectId, statTimeDay, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param dimensions  (optional)
     * @param filtering  (optional)
     * @param metrics  (optional)
     * @param order  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param projectId  (optional)
     * @param statTimeDay  (optional)
     * @return ReportRubeexGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportRubeexGetV2Response openApi2ReportRubeexGetGet(Long advertiserId, List<String> dimensions, ReportRubeexGetV2Filtering filtering, List<String> metrics, ReportRubeexGetV2Order order, Long page, Long pageSize, Long projectId, List<String> statTimeDay) throws ApiException {
        ApiResponse<ReportRubeexGetV2Response> localVarResp = openApi2ReportRubeexGetGetWithHttpInfo(advertiserId, dimensions, filtering, metrics, order, page, pageSize, projectId, statTimeDay);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param dimensions  (optional)
     * @param filtering  (optional)
     * @param metrics  (optional)
     * @param order  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param projectId  (optional)
     * @param statTimeDay  (optional)
     * @return ApiResponse&lt;ReportRubeexGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportRubeexGetV2Response> openApi2ReportRubeexGetGetWithHttpInfo(Long advertiserId, List<String> dimensions, ReportRubeexGetV2Filtering filtering, List<String> metrics, ReportRubeexGetV2Order order, Long page, Long pageSize, Long projectId, List<String> statTimeDay) throws ApiException {
        okhttp3.Call localVarCall = openApi2ReportRubeexGetGetValidateBeforeCall(advertiserId, dimensions, filtering, metrics, order, page, pageSize, projectId, statTimeDay, null);
        Type localVarReturnType = new TypeToken<ReportRubeexGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (optional)
     * @param dimensions  (optional)
     * @param filtering  (optional)
     * @param metrics  (optional)
     * @param order  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param projectId  (optional)
     * @param statTimeDay  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportRubeexGetGetAsync(Long advertiserId, List<String> dimensions, ReportRubeexGetV2Filtering filtering, List<String> metrics, ReportRubeexGetV2Order order, Long page, Long pageSize, Long projectId, List<String> statTimeDay, final ApiCallback<ReportRubeexGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ReportRubeexGetGetValidateBeforeCall(advertiserId, dimensions, filtering, metrics, order, page, pageSize, projectId, statTimeDay, _callback);
        Type localVarReturnType = new TypeToken<ReportRubeexGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}