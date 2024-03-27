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



import com.bytedance.ads.model.ToolQuickAppManagementQuickAppGetV2Response;
import com.bytedance.ads.model.ToolQuickAppManagementQuickAppGetV2Status;
import com.bytedance.ads.model.ToolQuickAppManagementQuickAppGetV2UpdateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolQuickAppManagementQuickAppGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolQuickAppManagementQuickAppGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolQuickAppManagementQuickAppGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolQuickAppManagementQuickAppGetGet
     * @param advertiserId 广告主ID (required)
     * @param status 应用状态:  AUDIT_DOING:审核中  AUDIT_SEND_REJECTED：送审失败 AUDIT_REJECTED:审核失败  AUDIT_ACCEPTED:审核成功 REMOVED：已下架 (optional)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过100 (optional, default to 10)
     * @param updateTime 修改时间 (optional)
     * @param searchKey 搜索关键字 快应用名称或者包名的模糊搜索，可以为空，可以传中文 (optional)
     * @param quickAppIds 快应用ids (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolQuickAppManagementQuickAppGetGetCall(Long advertiserId, List<ToolQuickAppManagementQuickAppGetV2Status> status, Integer page, Integer pageSize, ToolQuickAppManagementQuickAppGetV2UpdateTime updateTime, String searchKey, List<Long> quickAppIds, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tool/quick_app_management/quick_app/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (status != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "status", status));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (updateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("update_time", updateTime));
        }

        if (searchKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search_key", searchKey));
        }

        if (quickAppIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "quick_app_ids", quickAppIds));
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
    private okhttp3.Call openApi2ToolQuickAppManagementQuickAppGetGetValidateBeforeCall(Long advertiserId, List<ToolQuickAppManagementQuickAppGetV2Status> status, Integer page, Integer pageSize, ToolQuickAppManagementQuickAppGetV2UpdateTime updateTime, String searchKey, List<Long> quickAppIds, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolQuickAppManagementQuickAppGetGet(Async)");
        }

        return openApi2ToolQuickAppManagementQuickAppGetGetCall(advertiserId, status, page, pageSize, updateTime, searchKey, quickAppIds, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param status 应用状态:  AUDIT_DOING:审核中  AUDIT_SEND_REJECTED：送审失败 AUDIT_REJECTED:审核失败  AUDIT_ACCEPTED:审核成功 REMOVED：已下架 (optional)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过100 (optional, default to 10)
     * @param updateTime 修改时间 (optional)
     * @param searchKey 搜索关键字 快应用名称或者包名的模糊搜索，可以为空，可以传中文 (optional)
     * @param quickAppIds 快应用ids (optional)
     * @return ToolQuickAppManagementQuickAppGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolQuickAppManagementQuickAppGetV2Response openApi2ToolQuickAppManagementQuickAppGetGet(Long advertiserId, List<ToolQuickAppManagementQuickAppGetV2Status> status, Integer page, Integer pageSize, ToolQuickAppManagementQuickAppGetV2UpdateTime updateTime, String searchKey, List<Long> quickAppIds) throws ApiException {
        ApiResponse<ToolQuickAppManagementQuickAppGetV2Response> localVarResp = openApi2ToolQuickAppManagementQuickAppGetGetWithHttpInfo(advertiserId, status, page, pageSize, updateTime, searchKey, quickAppIds);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param status 应用状态:  AUDIT_DOING:审核中  AUDIT_SEND_REJECTED：送审失败 AUDIT_REJECTED:审核失败  AUDIT_ACCEPTED:审核成功 REMOVED：已下架 (optional)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过100 (optional, default to 10)
     * @param updateTime 修改时间 (optional)
     * @param searchKey 搜索关键字 快应用名称或者包名的模糊搜索，可以为空，可以传中文 (optional)
     * @param quickAppIds 快应用ids (optional)
     * @return ApiResponse&lt;ToolQuickAppManagementQuickAppGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolQuickAppManagementQuickAppGetV2Response> openApi2ToolQuickAppManagementQuickAppGetGetWithHttpInfo(Long advertiserId, List<ToolQuickAppManagementQuickAppGetV2Status> status, Integer page, Integer pageSize, ToolQuickAppManagementQuickAppGetV2UpdateTime updateTime, String searchKey, List<Long> quickAppIds) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolQuickAppManagementQuickAppGetGetValidateBeforeCall(advertiserId, status, page, pageSize, updateTime, searchKey, quickAppIds, null);
        Type localVarReturnType = new TypeToken<ToolQuickAppManagementQuickAppGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param status 应用状态:  AUDIT_DOING:审核中  AUDIT_SEND_REJECTED：送审失败 AUDIT_REJECTED:审核失败  AUDIT_ACCEPTED:审核成功 REMOVED：已下架 (optional)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过100 (optional, default to 10)
     * @param updateTime 修改时间 (optional)
     * @param searchKey 搜索关键字 快应用名称或者包名的模糊搜索，可以为空，可以传中文 (optional)
     * @param quickAppIds 快应用ids (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolQuickAppManagementQuickAppGetGetAsync(Long advertiserId, List<ToolQuickAppManagementQuickAppGetV2Status> status, Integer page, Integer pageSize, ToolQuickAppManagementQuickAppGetV2UpdateTime updateTime, String searchKey, List<Long> quickAppIds, final ApiCallback<ToolQuickAppManagementQuickAppGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolQuickAppManagementQuickAppGetGetValidateBeforeCall(advertiserId, status, page, pageSize, updateTime, searchKey, quickAppIds, _callback);
        Type localVarReturnType = new TypeToken<ToolQuickAppManagementQuickAppGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
