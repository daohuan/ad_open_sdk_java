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


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.KeywordFeedadsSuggestV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeywordFeedadsSuggestV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public KeywordFeedadsSuggestV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public KeywordFeedadsSuggestV2Api(ApiClient apiClient) {
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
     * Build call for openApi2KeywordFeedadsSuggestGet
     * @param adId  (optional)
     * @param advertiserId  (optional)
     * @param reqKeywordType  (optional, default to 5)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2KeywordFeedadsSuggestGetCall(Long adId, Long advertiserId, Long reqKeywordType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/keyword_feedads/suggest/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (adId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_id", adId));
        }

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (reqKeywordType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("req_keyword_type", reqKeywordType));
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
    private okhttp3.Call openApi2KeywordFeedadsSuggestGetValidateBeforeCall(Long adId, Long advertiserId, Long reqKeywordType, final ApiCallback _callback) throws ApiException {
        return openApi2KeywordFeedadsSuggestGetCall(adId, advertiserId, reqKeywordType, _callback);

    }

    /**
     * 
     * 
     * @param adId  (optional)
     * @param advertiserId  (optional)
     * @param reqKeywordType  (optional, default to 5)
     * @return KeywordFeedadsSuggestV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public KeywordFeedadsSuggestV2Response openApi2KeywordFeedadsSuggestGet(Long adId, Long advertiserId, Long reqKeywordType) throws ApiException {
        ApiResponse<KeywordFeedadsSuggestV2Response> localVarResp = openApi2KeywordFeedadsSuggestGetWithHttpInfo(adId, advertiserId, reqKeywordType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param adId  (optional)
     * @param advertiserId  (optional)
     * @param reqKeywordType  (optional, default to 5)
     * @return ApiResponse&lt;KeywordFeedadsSuggestV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<KeywordFeedadsSuggestV2Response> openApi2KeywordFeedadsSuggestGetWithHttpInfo(Long adId, Long advertiserId, Long reqKeywordType) throws ApiException {
        okhttp3.Call localVarCall = openApi2KeywordFeedadsSuggestGetValidateBeforeCall(adId, advertiserId, reqKeywordType, null);
        Type localVarReturnType = new TypeToken<KeywordFeedadsSuggestV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param adId  (optional)
     * @param advertiserId  (optional)
     * @param reqKeywordType  (optional, default to 5)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2KeywordFeedadsSuggestGetAsync(Long adId, Long advertiserId, Long reqKeywordType, final ApiCallback<KeywordFeedadsSuggestV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2KeywordFeedadsSuggestGetValidateBeforeCall(adId, advertiserId, reqKeywordType, _callback);
        Type localVarReturnType = new TypeToken<KeywordFeedadsSuggestV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
