/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.6
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



import com.bytedance.ads.model.Oauth2AppAccessTokenRequest;
import com.bytedance.ads.model.Oauth2AppAccessTokenResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Oauth2AppAccessTokenApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public Oauth2AppAccessTokenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public Oauth2AppAccessTokenApi(ApiClient apiClient) {
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
     * Build call for openApiOauth2AppAccessTokenPost
     * @param oauth2AppAccessTokenRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiOauth2AppAccessTokenPostCall(Oauth2AppAccessTokenRequest oauth2AppAccessTokenRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = oauth2AppAccessTokenRequest;

        // create path and map variables
        String localVarPath = "/open_api/oauth2/app_access_token/";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApiOauth2AppAccessTokenPostValidateBeforeCall(Oauth2AppAccessTokenRequest oauth2AppAccessTokenRequest, final ApiCallback _callback) throws ApiException {
        return openApiOauth2AppAccessTokenPostCall(oauth2AppAccessTokenRequest, _callback);

    }

    /**
     * 
     * 
     * @param oauth2AppAccessTokenRequest  (optional)
     * @return Oauth2AppAccessTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Oauth2AppAccessTokenResponse openApiOauth2AppAccessTokenPost(Oauth2AppAccessTokenRequest oauth2AppAccessTokenRequest) throws ApiException {
        ApiResponse<Oauth2AppAccessTokenResponse> localVarResp = openApiOauth2AppAccessTokenPostWithHttpInfo(oauth2AppAccessTokenRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param oauth2AppAccessTokenRequest  (optional)
     * @return ApiResponse&lt;Oauth2AppAccessTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Oauth2AppAccessTokenResponse> openApiOauth2AppAccessTokenPostWithHttpInfo(Oauth2AppAccessTokenRequest oauth2AppAccessTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = openApiOauth2AppAccessTokenPostValidateBeforeCall(oauth2AppAccessTokenRequest, null);
        Type localVarReturnType = new TypeToken<Oauth2AppAccessTokenResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param oauth2AppAccessTokenRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiOauth2AppAccessTokenPostAsync(Oauth2AppAccessTokenRequest oauth2AppAccessTokenRequest, final ApiCallback<Oauth2AppAccessTokenResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiOauth2AppAccessTokenPostValidateBeforeCall(oauth2AppAccessTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<Oauth2AppAccessTokenResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
