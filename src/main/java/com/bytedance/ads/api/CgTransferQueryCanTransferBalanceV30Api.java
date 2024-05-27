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



import com.bytedance.ads.model.CgTransferQueryCanTransferBalanceV30Response;
import com.bytedance.ads.model.CgTransferQueryCanTransferBalanceV30TransferDirection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CgTransferQueryCanTransferBalanceV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CgTransferQueryCanTransferBalanceV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CgTransferQueryCanTransferBalanceV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30CgTransferQueryCanTransferBalanceGet
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param agentId 代理商账户id，用于鉴权 (required)
     * @param accountId 锚定账户id，1:N的1 (required)
     * @param targetAccountIdList 目标账户id列表，1:N的N，需要列表内账户类型相同，最多支持100个 (required)
     * @param transferDirection 转账方向，以目标账户视角确定 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferQueryCanTransferBalanceGetCall(String bizRequestNo, Long agentId, Long accountId, List<Long> targetAccountIdList, CgTransferQueryCanTransferBalanceV30TransferDirection transferDirection, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/cg_transfer/query_can_transfer_balance/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (bizRequestNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_request_no", bizRequestNo));
        }

        if (agentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agent_id", agentId));
        }

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (targetAccountIdList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "target_account_id_list", targetAccountIdList));
        }

        if (transferDirection != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transfer_direction", transferDirection));
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
    private okhttp3.Call openApiV30CgTransferQueryCanTransferBalanceGetValidateBeforeCall(String bizRequestNo, Long agentId, Long accountId, List<Long> targetAccountIdList, CgTransferQueryCanTransferBalanceV30TransferDirection transferDirection, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bizRequestNo' is set
        if (bizRequestNo == null) {
            throw new ApiException("Missing the required parameter 'bizRequestNo' when calling openApiV30CgTransferQueryCanTransferBalanceGet(Async)");
        }

        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApiV30CgTransferQueryCanTransferBalanceGet(Async)");
        }

        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30CgTransferQueryCanTransferBalanceGet(Async)");
        }

        // verify the required parameter 'targetAccountIdList' is set
        if (targetAccountIdList == null) {
            throw new ApiException("Missing the required parameter 'targetAccountIdList' when calling openApiV30CgTransferQueryCanTransferBalanceGet(Async)");
        }

        // verify the required parameter 'transferDirection' is set
        if (transferDirection == null) {
            throw new ApiException("Missing the required parameter 'transferDirection' when calling openApiV30CgTransferQueryCanTransferBalanceGet(Async)");
        }

        return openApiV30CgTransferQueryCanTransferBalanceGetCall(bizRequestNo, agentId, accountId, targetAccountIdList, transferDirection, _callback);

    }

    /**
     * 
     * 
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param agentId 代理商账户id，用于鉴权 (required)
     * @param accountId 锚定账户id，1:N的1 (required)
     * @param targetAccountIdList 目标账户id列表，1:N的N，需要列表内账户类型相同，最多支持100个 (required)
     * @param transferDirection 转账方向，以目标账户视角确定 (required)
     * @return CgTransferQueryCanTransferBalanceV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CgTransferQueryCanTransferBalanceV30Response openApiV30CgTransferQueryCanTransferBalanceGet(String bizRequestNo, Long agentId, Long accountId, List<Long> targetAccountIdList, CgTransferQueryCanTransferBalanceV30TransferDirection transferDirection) throws ApiException {
        ApiResponse<CgTransferQueryCanTransferBalanceV30Response> localVarResp = openApiV30CgTransferQueryCanTransferBalanceGetWithHttpInfo(bizRequestNo, agentId, accountId, targetAccountIdList, transferDirection);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param agentId 代理商账户id，用于鉴权 (required)
     * @param accountId 锚定账户id，1:N的1 (required)
     * @param targetAccountIdList 目标账户id列表，1:N的N，需要列表内账户类型相同，最多支持100个 (required)
     * @param transferDirection 转账方向，以目标账户视角确定 (required)
     * @return ApiResponse&lt;CgTransferQueryCanTransferBalanceV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CgTransferQueryCanTransferBalanceV30Response> openApiV30CgTransferQueryCanTransferBalanceGetWithHttpInfo(String bizRequestNo, Long agentId, Long accountId, List<Long> targetAccountIdList, CgTransferQueryCanTransferBalanceV30TransferDirection transferDirection) throws ApiException {
        okhttp3.Call localVarCall = openApiV30CgTransferQueryCanTransferBalanceGetValidateBeforeCall(bizRequestNo, agentId, accountId, targetAccountIdList, transferDirection, null);
        Type localVarReturnType = new TypeToken<CgTransferQueryCanTransferBalanceV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param agentId 代理商账户id，用于鉴权 (required)
     * @param accountId 锚定账户id，1:N的1 (required)
     * @param targetAccountIdList 目标账户id列表，1:N的N，需要列表内账户类型相同，最多支持100个 (required)
     * @param transferDirection 转账方向，以目标账户视角确定 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferQueryCanTransferBalanceGetAsync(String bizRequestNo, Long agentId, Long accountId, List<Long> targetAccountIdList, CgTransferQueryCanTransferBalanceV30TransferDirection transferDirection, final ApiCallback<CgTransferQueryCanTransferBalanceV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30CgTransferQueryCanTransferBalanceGetValidateBeforeCall(bizRequestNo, agentId, accountId, targetAccountIdList, transferDirection, _callback);
        Type localVarReturnType = new TypeToken<CgTransferQueryCanTransferBalanceV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}