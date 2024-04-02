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



import com.bytedance.ads.model.QianchuanAwemeVideoGetV10MarketingGoal;
import com.bytedance.ads.model.QianchuanAwemeVideoGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanAwemeVideoGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanAwemeVideoGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanAwemeVideoGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanAwemeVideoGetGet
     * @param advertiserId  (required)
     * @param awemeId 需要拉取视频的视频作者uid (required)
     * @param marketingGoal  (required)
     * @param cursor  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAwemeVideoGetGetCall(Long advertiserId, Long awemeId, QianchuanAwemeVideoGetV10MarketingGoal marketingGoal, Long cursor, Long count, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/aweme/video/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (awemeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_id", awemeId));
        }

        if (marketingGoal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_goal", marketingGoal));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
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
    private okhttp3.Call openApiV10QianchuanAwemeVideoGetGetValidateBeforeCall(Long advertiserId, Long awemeId, QianchuanAwemeVideoGetV10MarketingGoal marketingGoal, Long cursor, Long count, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanAwemeVideoGetGet(Async)");
        }

        // verify the required parameter 'awemeId' is set
        if (awemeId == null) {
            throw new ApiException("Missing the required parameter 'awemeId' when calling openApiV10QianchuanAwemeVideoGetGet(Async)");
        }

        // verify the required parameter 'marketingGoal' is set
        if (marketingGoal == null) {
            throw new ApiException("Missing the required parameter 'marketingGoal' when calling openApiV10QianchuanAwemeVideoGetGet(Async)");
        }

        return openApiV10QianchuanAwemeVideoGetGetCall(advertiserId, awemeId, marketingGoal, cursor, count, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param awemeId 需要拉取视频的视频作者uid (required)
     * @param marketingGoal  (required)
     * @param cursor  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @return QianchuanAwemeVideoGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanAwemeVideoGetV10Response openApiV10QianchuanAwemeVideoGetGet(Long advertiserId, Long awemeId, QianchuanAwemeVideoGetV10MarketingGoal marketingGoal, Long cursor, Long count) throws ApiException {
        ApiResponse<QianchuanAwemeVideoGetV10Response> localVarResp = openApiV10QianchuanAwemeVideoGetGetWithHttpInfo(advertiserId, awemeId, marketingGoal, cursor, count);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param awemeId 需要拉取视频的视频作者uid (required)
     * @param marketingGoal  (required)
     * @param cursor  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @return ApiResponse&lt;QianchuanAwemeVideoGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanAwemeVideoGetV10Response> openApiV10QianchuanAwemeVideoGetGetWithHttpInfo(Long advertiserId, Long awemeId, QianchuanAwemeVideoGetV10MarketingGoal marketingGoal, Long cursor, Long count) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanAwemeVideoGetGetValidateBeforeCall(advertiserId, awemeId, marketingGoal, cursor, count, null);
        Type localVarReturnType = new TypeToken<QianchuanAwemeVideoGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param awemeId 需要拉取视频的视频作者uid (required)
     * @param marketingGoal  (required)
     * @param cursor  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAwemeVideoGetGetAsync(Long advertiserId, Long awemeId, QianchuanAwemeVideoGetV10MarketingGoal marketingGoal, Long cursor, Long count, final ApiCallback<QianchuanAwemeVideoGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanAwemeVideoGetGetValidateBeforeCall(advertiserId, awemeId, marketingGoal, cursor, count, _callback);
        Type localVarReturnType = new TypeToken<QianchuanAwemeVideoGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
