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



import com.bytedance.ads.model.StarDemandOmExpandChallengeV2Request;
import com.bytedance.ads.model.StarDemandOmExpandChallengeV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarDemandOmExpandChallengeV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarDemandOmExpandChallengeV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarDemandOmExpandChallengeV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarDemandOmExpandChallengePost
     * @param starDemandOmExpandChallengeV2Request  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDemandOmExpandChallengePostCall(StarDemandOmExpandChallengeV2Request starDemandOmExpandChallengeV2Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = starDemandOmExpandChallengeV2Request;

        // create path and map variables
        String localVarPath = "/open_api/2/star/demand/om_expand_challenge/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2StarDemandOmExpandChallengePostValidateBeforeCall(StarDemandOmExpandChallengeV2Request starDemandOmExpandChallengeV2Request, final ApiCallback _callback) throws ApiException {
        return openApi2StarDemandOmExpandChallengePostCall(starDemandOmExpandChallengeV2Request, _callback);

    }

    /**
     * 
     * 
     * @param starDemandOmExpandChallengeV2Request  (optional)
     * @return StarDemandOmExpandChallengeV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarDemandOmExpandChallengeV2Response openApi2StarDemandOmExpandChallengePost(StarDemandOmExpandChallengeV2Request starDemandOmExpandChallengeV2Request) throws ApiException {
        ApiResponse<StarDemandOmExpandChallengeV2Response> localVarResp = openApi2StarDemandOmExpandChallengePostWithHttpInfo(starDemandOmExpandChallengeV2Request);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starDemandOmExpandChallengeV2Request  (optional)
     * @return ApiResponse&lt;StarDemandOmExpandChallengeV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarDemandOmExpandChallengeV2Response> openApi2StarDemandOmExpandChallengePostWithHttpInfo(StarDemandOmExpandChallengeV2Request starDemandOmExpandChallengeV2Request) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarDemandOmExpandChallengePostValidateBeforeCall(starDemandOmExpandChallengeV2Request, null);
        Type localVarReturnType = new TypeToken<StarDemandOmExpandChallengeV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starDemandOmExpandChallengeV2Request  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDemandOmExpandChallengePostAsync(StarDemandOmExpandChallengeV2Request starDemandOmExpandChallengeV2Request, final ApiCallback<StarDemandOmExpandChallengeV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarDemandOmExpandChallengePostValidateBeforeCall(starDemandOmExpandChallengeV2Request, _callback);
        Type localVarReturnType = new TypeToken<StarDemandOmExpandChallengeV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
