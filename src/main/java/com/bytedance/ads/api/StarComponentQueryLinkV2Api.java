/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
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



import com.bytedance.ads.model.StarComponentQueryLinkV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarComponentQueryLinkV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarComponentQueryLinkV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarComponentQueryLinkV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarComponentQueryLinkGet
     * @param starId 星图客户ID (required)
     * @param componentStatus 组件状态 0 &#x3D; 待送审 1 &#x3D; 有效 2 &#x3D;审核中 3 &#x3D; 审核失败 不传则为全部 (optional)
     * @param page 分页页码 正整数，默认1 (optional, default to 1)
     * @param limit 页大小 正整数且≤50，默认10 (optional, default to 10)
     * @param linkIds  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarComponentQueryLinkGetCall(Long starId, Integer componentStatus, Integer page, Integer limit, List<Long> linkIds, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/component/query_link/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (componentStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("component_status", componentStatus));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (linkIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "link_ids", linkIds));
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
    private okhttp3.Call openApi2StarComponentQueryLinkGetValidateBeforeCall(Long starId, Integer componentStatus, Integer page, Integer limit, List<Long> linkIds, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarComponentQueryLinkGet(Async)");
        }

        return openApi2StarComponentQueryLinkGetCall(starId, componentStatus, page, limit, linkIds, _callback);

    }

    /**
     * 
     * 
     * @param starId 星图客户ID (required)
     * @param componentStatus 组件状态 0 &#x3D; 待送审 1 &#x3D; 有效 2 &#x3D;审核中 3 &#x3D; 审核失败 不传则为全部 (optional)
     * @param page 分页页码 正整数，默认1 (optional, default to 1)
     * @param limit 页大小 正整数且≤50，默认10 (optional, default to 10)
     * @param linkIds  (optional)
     * @return StarComponentQueryLinkV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarComponentQueryLinkV2Response openApi2StarComponentQueryLinkGet(Long starId, Integer componentStatus, Integer page, Integer limit, List<Long> linkIds) throws ApiException {
        ApiResponse<StarComponentQueryLinkV2Response> localVarResp = openApi2StarComponentQueryLinkGetWithHttpInfo(starId, componentStatus, page, limit, linkIds);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId 星图客户ID (required)
     * @param componentStatus 组件状态 0 &#x3D; 待送审 1 &#x3D; 有效 2 &#x3D;审核中 3 &#x3D; 审核失败 不传则为全部 (optional)
     * @param page 分页页码 正整数，默认1 (optional, default to 1)
     * @param limit 页大小 正整数且≤50，默认10 (optional, default to 10)
     * @param linkIds  (optional)
     * @return ApiResponse&lt;StarComponentQueryLinkV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarComponentQueryLinkV2Response> openApi2StarComponentQueryLinkGetWithHttpInfo(Long starId, Integer componentStatus, Integer page, Integer limit, List<Long> linkIds) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarComponentQueryLinkGetValidateBeforeCall(starId, componentStatus, page, limit, linkIds, null);
        Type localVarReturnType = new TypeToken<StarComponentQueryLinkV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId 星图客户ID (required)
     * @param componentStatus 组件状态 0 &#x3D; 待送审 1 &#x3D; 有效 2 &#x3D;审核中 3 &#x3D; 审核失败 不传则为全部 (optional)
     * @param page 分页页码 正整数，默认1 (optional, default to 1)
     * @param limit 页大小 正整数且≤50，默认10 (optional, default to 10)
     * @param linkIds  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarComponentQueryLinkGetAsync(Long starId, Integer componentStatus, Integer page, Integer limit, List<Long> linkIds, final ApiCallback<StarComponentQueryLinkV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarComponentQueryLinkGetValidateBeforeCall(starId, componentStatus, page, limit, linkIds, _callback);
        Type localVarReturnType = new TypeToken<StarComponentQueryLinkV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
