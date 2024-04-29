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



import com.bytedance.ads.model.StarOrderGetComponentV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarOrderGetComponentV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarOrderGetComponentV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarOrderGetComponentV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarOrderGetComponentGet
     * @param starId 星图客户ID (required)
     * @param orderIds 任务ID (required)
     * @param developerId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarOrderGetComponentGetCall(Long starId, List<Long> orderIds, String developerId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/order/get_component/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (orderIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "order_ids", orderIds));
        }

        if (developerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("developer_id", developerId));
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
    private okhttp3.Call openApi2StarOrderGetComponentGetValidateBeforeCall(Long starId, List<Long> orderIds, String developerId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarOrderGetComponentGet(Async)");
        }

        // verify the required parameter 'orderIds' is set
        if (orderIds == null) {
            throw new ApiException("Missing the required parameter 'orderIds' when calling openApi2StarOrderGetComponentGet(Async)");
        }

        return openApi2StarOrderGetComponentGetCall(starId, orderIds, developerId, _callback);

    }

    /**
     * 
     * 
     * @param starId 星图客户ID (required)
     * @param orderIds 任务ID (required)
     * @param developerId  (optional)
     * @return StarOrderGetComponentV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarOrderGetComponentV2Response openApi2StarOrderGetComponentGet(Long starId, List<Long> orderIds, String developerId) throws ApiException {
        ApiResponse<StarOrderGetComponentV2Response> localVarResp = openApi2StarOrderGetComponentGetWithHttpInfo(starId, orderIds, developerId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId 星图客户ID (required)
     * @param orderIds 任务ID (required)
     * @param developerId  (optional)
     * @return ApiResponse&lt;StarOrderGetComponentV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarOrderGetComponentV2Response> openApi2StarOrderGetComponentGetWithHttpInfo(Long starId, List<Long> orderIds, String developerId) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarOrderGetComponentGetValidateBeforeCall(starId, orderIds, developerId, null);
        Type localVarReturnType = new TypeToken<StarOrderGetComponentV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId 星图客户ID (required)
     * @param orderIds 任务ID (required)
     * @param developerId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarOrderGetComponentGetAsync(Long starId, List<Long> orderIds, String developerId, final ApiCallback<StarOrderGetComponentV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarOrderGetComponentGetValidateBeforeCall(starId, orderIds, developerId, _callback);
        Type localVarReturnType = new TypeToken<StarOrderGetComponentV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
