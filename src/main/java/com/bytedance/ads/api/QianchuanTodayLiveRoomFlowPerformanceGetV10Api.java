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



import com.bytedance.ads.model.QianchuanTodayLiveRoomFlowPerformanceGetV10FlowSource;
import com.bytedance.ads.model.QianchuanTodayLiveRoomFlowPerformanceGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanTodayLiveRoomFlowPerformanceGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanTodayLiveRoomFlowPerformanceGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanTodayLiveRoomFlowPerformanceGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGet
     * @param advertiserId  (required)
     * @param roomId  (required)
     * @param flowSource  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGetCall(Long advertiserId, Long roomId, QianchuanTodayLiveRoomFlowPerformanceGetV10FlowSource flowSource, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/today_live/room/flow_performance/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (roomId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("room_id", roomId));
        }

        if (flowSource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("flow_source", flowSource));
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
    private okhttp3.Call openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGetValidateBeforeCall(Long advertiserId, Long roomId, QianchuanTodayLiveRoomFlowPerformanceGetV10FlowSource flowSource, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGet(Async)");
        }

        // verify the required parameter 'roomId' is set
        if (roomId == null) {
            throw new ApiException("Missing the required parameter 'roomId' when calling openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGet(Async)");
        }

        return openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGetCall(advertiserId, roomId, flowSource, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param roomId  (required)
     * @param flowSource  (optional)
     * @return QianchuanTodayLiveRoomFlowPerformanceGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanTodayLiveRoomFlowPerformanceGetV10Response openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGet(Long advertiserId, Long roomId, QianchuanTodayLiveRoomFlowPerformanceGetV10FlowSource flowSource) throws ApiException {
        ApiResponse<QianchuanTodayLiveRoomFlowPerformanceGetV10Response> localVarResp = openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGetWithHttpInfo(advertiserId, roomId, flowSource);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param roomId  (required)
     * @param flowSource  (optional)
     * @return ApiResponse&lt;QianchuanTodayLiveRoomFlowPerformanceGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanTodayLiveRoomFlowPerformanceGetV10Response> openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGetWithHttpInfo(Long advertiserId, Long roomId, QianchuanTodayLiveRoomFlowPerformanceGetV10FlowSource flowSource) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGetValidateBeforeCall(advertiserId, roomId, flowSource, null);
        Type localVarReturnType = new TypeToken<QianchuanTodayLiveRoomFlowPerformanceGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param roomId  (required)
     * @param flowSource  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGetAsync(Long advertiserId, Long roomId, QianchuanTodayLiveRoomFlowPerformanceGetV10FlowSource flowSource, final ApiCallback<QianchuanTodayLiveRoomFlowPerformanceGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGetValidateBeforeCall(advertiserId, roomId, flowSource, _callback);
        Type localVarReturnType = new TypeToken<QianchuanTodayLiveRoomFlowPerformanceGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
