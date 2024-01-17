/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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



import com.bytedance.ads.model.StarChallengeAuthorListV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarChallengeAuthorListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarChallengeAuthorListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarChallengeAuthorListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarChallengeAuthorListGet
     * @param starId 客户星图ID (required)
     * @param challengeTaskId 投稿任务ID (required)
     * @param page 页码 (required)
     * @param limit 页大小，最大100 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarChallengeAuthorListGetCall(Long starId, Long challengeTaskId, Integer page, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/challenge/author_list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (challengeTaskId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("challenge_task_id", challengeTaskId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call openApi2StarChallengeAuthorListGetValidateBeforeCall(Long starId, Long challengeTaskId, Integer page, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarChallengeAuthorListGet(Async)");
        }

        // verify the required parameter 'challengeTaskId' is set
        if (challengeTaskId == null) {
            throw new ApiException("Missing the required parameter 'challengeTaskId' when calling openApi2StarChallengeAuthorListGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApi2StarChallengeAuthorListGet(Async)");
        }

        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new ApiException("Missing the required parameter 'limit' when calling openApi2StarChallengeAuthorListGet(Async)");
        }

        return openApi2StarChallengeAuthorListGetCall(starId, challengeTaskId, page, limit, _callback);

    }

    /**
     * 
     * 
     * @param starId 客户星图ID (required)
     * @param challengeTaskId 投稿任务ID (required)
     * @param page 页码 (required)
     * @param limit 页大小，最大100 (required)
     * @return StarChallengeAuthorListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarChallengeAuthorListV2Response openApi2StarChallengeAuthorListGet(Long starId, Long challengeTaskId, Integer page, Integer limit) throws ApiException {
        ApiResponse<StarChallengeAuthorListV2Response> localVarResp = openApi2StarChallengeAuthorListGetWithHttpInfo(starId, challengeTaskId, page, limit);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId 客户星图ID (required)
     * @param challengeTaskId 投稿任务ID (required)
     * @param page 页码 (required)
     * @param limit 页大小，最大100 (required)
     * @return ApiResponse&lt;StarChallengeAuthorListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarChallengeAuthorListV2Response> openApi2StarChallengeAuthorListGetWithHttpInfo(Long starId, Long challengeTaskId, Integer page, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarChallengeAuthorListGetValidateBeforeCall(starId, challengeTaskId, page, limit, null);
        Type localVarReturnType = new TypeToken<StarChallengeAuthorListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId 客户星图ID (required)
     * @param challengeTaskId 投稿任务ID (required)
     * @param page 页码 (required)
     * @param limit 页大小，最大100 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarChallengeAuthorListGetAsync(Long starId, Long challengeTaskId, Integer page, Integer limit, final ApiCallback<StarChallengeAuthorListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarChallengeAuthorListGetValidateBeforeCall(starId, challengeTaskId, page, limit, _callback);
        Type localVarReturnType = new TypeToken<StarChallengeAuthorListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}