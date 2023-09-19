/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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



import com.bytedance.ads.model.BusinessPlatformPartnerOrganizationListV2Filtering;
import com.bytedance.ads.model.BusinessPlatformPartnerOrganizationListV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessPlatformPartnerOrganizationListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BusinessPlatformPartnerOrganizationListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public BusinessPlatformPartnerOrganizationListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2BusinessPlatformPartnerOrganizationListGet
     * @param organizationId 巨量纵横组织id (required)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过200 (optional, default to 10)
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
    public okhttp3.Call openApi2BusinessPlatformPartnerOrganizationListGetCall(Long organizationId, Integer page, Integer pageSize, BusinessPlatformPartnerOrganizationListV2Filtering filtering, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/business_platform/partner_organization/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (organizationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("organization_id", organizationId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
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
    private okhttp3.Call openApi2BusinessPlatformPartnerOrganizationListGetValidateBeforeCall(Long organizationId, Integer page, Integer pageSize, BusinessPlatformPartnerOrganizationListV2Filtering filtering, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling openApi2BusinessPlatformPartnerOrganizationListGet(Async)");
        }

        return openApi2BusinessPlatformPartnerOrganizationListGetCall(organizationId, page, pageSize, filtering, _callback);

    }

    /**
     * 
     * 
     * @param organizationId 巨量纵横组织id (required)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过200 (optional, default to 10)
     * @param filtering 过滤条件 (optional)
     * @return BusinessPlatformPartnerOrganizationListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public BusinessPlatformPartnerOrganizationListV2Response openApi2BusinessPlatformPartnerOrganizationListGet(Long organizationId, Integer page, Integer pageSize, BusinessPlatformPartnerOrganizationListV2Filtering filtering) throws ApiException {
        ApiResponse<BusinessPlatformPartnerOrganizationListV2Response> localVarResp = openApi2BusinessPlatformPartnerOrganizationListGetWithHttpInfo(organizationId, page, pageSize, filtering);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param organizationId 巨量纵横组织id (required)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过200 (optional, default to 10)
     * @param filtering 过滤条件 (optional)
     * @return ApiResponse&lt;BusinessPlatformPartnerOrganizationListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BusinessPlatformPartnerOrganizationListV2Response> openApi2BusinessPlatformPartnerOrganizationListGetWithHttpInfo(Long organizationId, Integer page, Integer pageSize, BusinessPlatformPartnerOrganizationListV2Filtering filtering) throws ApiException {
        okhttp3.Call localVarCall = openApi2BusinessPlatformPartnerOrganizationListGetValidateBeforeCall(organizationId, page, pageSize, filtering, null);
        Type localVarReturnType = new TypeToken<BusinessPlatformPartnerOrganizationListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param organizationId 巨量纵横组织id (required)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过200 (optional, default to 10)
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
    public okhttp3.Call openApi2BusinessPlatformPartnerOrganizationListGetAsync(Long organizationId, Integer page, Integer pageSize, BusinessPlatformPartnerOrganizationListV2Filtering filtering, final ApiCallback<BusinessPlatformPartnerOrganizationListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2BusinessPlatformPartnerOrganizationListGetValidateBeforeCall(organizationId, page, pageSize, filtering, _callback);
        Type localVarReturnType = new TypeToken<BusinessPlatformPartnerOrganizationListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}