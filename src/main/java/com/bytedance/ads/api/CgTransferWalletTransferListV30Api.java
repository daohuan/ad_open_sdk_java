/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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



import com.bytedance.ads.model.CgTransferWalletTransferListV30AccountType;
import com.bytedance.ads.model.CgTransferWalletTransferListV30PageInfo;
import com.bytedance.ads.model.CgTransferWalletTransferListV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CgTransferWalletTransferListV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CgTransferWalletTransferListV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CgTransferWalletTransferListV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30CgTransferWalletTransferListGet
     * @param accountId 鉴权账户id (required)
     * @param accountType 鉴权账户类型 (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param queryBeginTime 查询开始时间(转账创建时间) yyyy-MM-dd HH:mm:ss (required)
     * @param queryEndTime 查询结束时间(转账创建时间) yyyy-MM-dd HH:mm:ss (required)
     * @param queryWalletIdList 需要查询的大小钱包id，加款方与减款方都需要包含在内 (required)
     * @param pageInfo 分页信息 (required)
     * @param payeeId 加款方id，可选，需要包含在query_wallet_id_list (optional)
     * @param remitterId 减款方id，可选，需要包含在query_wallet_id_list (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferWalletTransferListGetCall(Long accountId, CgTransferWalletTransferListV30AccountType accountType, String bizRequestNo, String queryBeginTime, String queryEndTime, List<Long> queryWalletIdList, CgTransferWalletTransferListV30PageInfo pageInfo, Long payeeId, Long remitterId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/cg_transfer/wallet/transfer/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (bizRequestNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_request_no", bizRequestNo));
        }

        if (queryBeginTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query_begin_time", queryBeginTime));
        }

        if (queryEndTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query_end_time", queryEndTime));
        }

        if (queryWalletIdList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "query_wallet_id_list", queryWalletIdList));
        }

        if (payeeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("payee_id", payeeId));
        }

        if (remitterId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("remitter_id", remitterId));
        }

        if (pageInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_info", pageInfo));
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
    private okhttp3.Call openApiV30CgTransferWalletTransferListGetValidateBeforeCall(Long accountId, CgTransferWalletTransferListV30AccountType accountType, String bizRequestNo, String queryBeginTime, String queryEndTime, List<Long> queryWalletIdList, CgTransferWalletTransferListV30PageInfo pageInfo, Long payeeId, Long remitterId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30CgTransferWalletTransferListGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30CgTransferWalletTransferListGet(Async)");
        }

        // verify the required parameter 'bizRequestNo' is set
        if (bizRequestNo == null) {
            throw new ApiException("Missing the required parameter 'bizRequestNo' when calling openApiV30CgTransferWalletTransferListGet(Async)");
        }

        // verify the required parameter 'queryBeginTime' is set
        if (queryBeginTime == null) {
            throw new ApiException("Missing the required parameter 'queryBeginTime' when calling openApiV30CgTransferWalletTransferListGet(Async)");
        }

        // verify the required parameter 'queryEndTime' is set
        if (queryEndTime == null) {
            throw new ApiException("Missing the required parameter 'queryEndTime' when calling openApiV30CgTransferWalletTransferListGet(Async)");
        }

        // verify the required parameter 'queryWalletIdList' is set
        if (queryWalletIdList == null) {
            throw new ApiException("Missing the required parameter 'queryWalletIdList' when calling openApiV30CgTransferWalletTransferListGet(Async)");
        }

        // verify the required parameter 'pageInfo' is set
        if (pageInfo == null) {
            throw new ApiException("Missing the required parameter 'pageInfo' when calling openApiV30CgTransferWalletTransferListGet(Async)");
        }

        return openApiV30CgTransferWalletTransferListGetCall(accountId, accountType, bizRequestNo, queryBeginTime, queryEndTime, queryWalletIdList, pageInfo, payeeId, remitterId, _callback);

    }

    /**
     * 
     * 
     * @param accountId 鉴权账户id (required)
     * @param accountType 鉴权账户类型 (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param queryBeginTime 查询开始时间(转账创建时间) yyyy-MM-dd HH:mm:ss (required)
     * @param queryEndTime 查询结束时间(转账创建时间) yyyy-MM-dd HH:mm:ss (required)
     * @param queryWalletIdList 需要查询的大小钱包id，加款方与减款方都需要包含在内 (required)
     * @param pageInfo 分页信息 (required)
     * @param payeeId 加款方id，可选，需要包含在query_wallet_id_list (optional)
     * @param remitterId 减款方id，可选，需要包含在query_wallet_id_list (optional)
     * @return CgTransferWalletTransferListV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CgTransferWalletTransferListV30Response openApiV30CgTransferWalletTransferListGet(Long accountId, CgTransferWalletTransferListV30AccountType accountType, String bizRequestNo, String queryBeginTime, String queryEndTime, List<Long> queryWalletIdList, CgTransferWalletTransferListV30PageInfo pageInfo, Long payeeId, Long remitterId) throws ApiException {
        ApiResponse<CgTransferWalletTransferListV30Response> localVarResp = openApiV30CgTransferWalletTransferListGetWithHttpInfo(accountId, accountType, bizRequestNo, queryBeginTime, queryEndTime, queryWalletIdList, pageInfo, payeeId, remitterId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 鉴权账户id (required)
     * @param accountType 鉴权账户类型 (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param queryBeginTime 查询开始时间(转账创建时间) yyyy-MM-dd HH:mm:ss (required)
     * @param queryEndTime 查询结束时间(转账创建时间) yyyy-MM-dd HH:mm:ss (required)
     * @param queryWalletIdList 需要查询的大小钱包id，加款方与减款方都需要包含在内 (required)
     * @param pageInfo 分页信息 (required)
     * @param payeeId 加款方id，可选，需要包含在query_wallet_id_list (optional)
     * @param remitterId 减款方id，可选，需要包含在query_wallet_id_list (optional)
     * @return ApiResponse&lt;CgTransferWalletTransferListV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CgTransferWalletTransferListV30Response> openApiV30CgTransferWalletTransferListGetWithHttpInfo(Long accountId, CgTransferWalletTransferListV30AccountType accountType, String bizRequestNo, String queryBeginTime, String queryEndTime, List<Long> queryWalletIdList, CgTransferWalletTransferListV30PageInfo pageInfo, Long payeeId, Long remitterId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30CgTransferWalletTransferListGetValidateBeforeCall(accountId, accountType, bizRequestNo, queryBeginTime, queryEndTime, queryWalletIdList, pageInfo, payeeId, remitterId, null);
        Type localVarReturnType = new TypeToken<CgTransferWalletTransferListV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 鉴权账户id (required)
     * @param accountType 鉴权账户类型 (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param queryBeginTime 查询开始时间(转账创建时间) yyyy-MM-dd HH:mm:ss (required)
     * @param queryEndTime 查询结束时间(转账创建时间) yyyy-MM-dd HH:mm:ss (required)
     * @param queryWalletIdList 需要查询的大小钱包id，加款方与减款方都需要包含在内 (required)
     * @param pageInfo 分页信息 (required)
     * @param payeeId 加款方id，可选，需要包含在query_wallet_id_list (optional)
     * @param remitterId 减款方id，可选，需要包含在query_wallet_id_list (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferWalletTransferListGetAsync(Long accountId, CgTransferWalletTransferListV30AccountType accountType, String bizRequestNo, String queryBeginTime, String queryEndTime, List<Long> queryWalletIdList, CgTransferWalletTransferListV30PageInfo pageInfo, Long payeeId, Long remitterId, final ApiCallback<CgTransferWalletTransferListV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30CgTransferWalletTransferListGetValidateBeforeCall(accountId, accountType, bizRequestNo, queryBeginTime, queryEndTime, queryWalletIdList, pageInfo, payeeId, remitterId, _callback);
        Type localVarReturnType = new TypeToken<CgTransferWalletTransferListV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}