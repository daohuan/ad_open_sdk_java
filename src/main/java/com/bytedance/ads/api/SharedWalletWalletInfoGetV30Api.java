/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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



import com.bytedance.ads.model.SharedWalletWalletInfoGetV30AccountType;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharedWalletWalletInfoGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SharedWalletWalletInfoGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public SharedWalletWalletInfoGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30SharedWalletWalletInfoGetGet
     * @param accountId 账户ID，对于巨量广告、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param walletIdList 资金共享钱包id列表，注意：传入的列表长度不可大于200 (required)
     * @param accountType 账户类型 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SharedWalletWalletInfoGetGetCall(Long accountId, List<Long> walletIdList, SharedWalletWalletInfoGetV30AccountType accountType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/shared_wallet/wallet_info/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (walletIdList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "wallet_id_list", walletIdList));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
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
    private okhttp3.Call openApiV30SharedWalletWalletInfoGetGetValidateBeforeCall(Long accountId, List<Long> walletIdList, SharedWalletWalletInfoGetV30AccountType accountType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30SharedWalletWalletInfoGetGet(Async)");
        }

        // verify the required parameter 'walletIdList' is set
        if (walletIdList == null) {
            throw new ApiException("Missing the required parameter 'walletIdList' when calling openApiV30SharedWalletWalletInfoGetGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30SharedWalletWalletInfoGetGet(Async)");
        }

        return openApiV30SharedWalletWalletInfoGetGetCall(accountId, walletIdList, accountType, _callback);

    }

    /**
     * 
     * 
     * @param accountId 账户ID，对于巨量广告、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param walletIdList 资金共享钱包id列表，注意：传入的列表长度不可大于200 (required)
     * @param accountType 账户类型 (required)
     * @return SharedWalletWalletInfoGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SharedWalletWalletInfoGetV30Response openApiV30SharedWalletWalletInfoGetGet(Long accountId, List<Long> walletIdList, SharedWalletWalletInfoGetV30AccountType accountType) throws ApiException {
        ApiResponse<SharedWalletWalletInfoGetV30Response> localVarResp = openApiV30SharedWalletWalletInfoGetGetWithHttpInfo(accountId, walletIdList, accountType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 账户ID，对于巨量广告、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param walletIdList 资金共享钱包id列表，注意：传入的列表长度不可大于200 (required)
     * @param accountType 账户类型 (required)
     * @return ApiResponse&lt;SharedWalletWalletInfoGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SharedWalletWalletInfoGetV30Response> openApiV30SharedWalletWalletInfoGetGetWithHttpInfo(Long accountId, List<Long> walletIdList, SharedWalletWalletInfoGetV30AccountType accountType) throws ApiException {
        okhttp3.Call localVarCall = openApiV30SharedWalletWalletInfoGetGetValidateBeforeCall(accountId, walletIdList, accountType, null);
        Type localVarReturnType = new TypeToken<SharedWalletWalletInfoGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 账户ID，对于巨量广告、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param walletIdList 资金共享钱包id列表，注意：传入的列表长度不可大于200 (required)
     * @param accountType 账户类型 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SharedWalletWalletInfoGetGetAsync(Long accountId, List<Long> walletIdList, SharedWalletWalletInfoGetV30AccountType accountType, final ApiCallback<SharedWalletWalletInfoGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30SharedWalletWalletInfoGetGetValidateBeforeCall(accountId, walletIdList, accountType, _callback);
        Type localVarReturnType = new TypeToken<SharedWalletWalletInfoGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
