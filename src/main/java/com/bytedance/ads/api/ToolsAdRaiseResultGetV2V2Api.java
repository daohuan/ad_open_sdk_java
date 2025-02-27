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



import com.bytedance.ads.model.ToolsAdRaiseResultGetV2V2OrderType;
import com.bytedance.ads.model.ToolsAdRaiseResultGetV2V2Response;
import com.bytedance.ads.model.ToolsAdRaiseResultGetV2V2TimeDimension;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAdRaiseResultGetV2V2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAdRaiseResultGetV2V2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAdRaiseResultGetV2V2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsAdRaiseResultGetV2Get
     * @param adId  (optional)
     * @param adRaiseVersion  (optional)
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param timeDimension  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAdRaiseResultGetV2GetCall(Long adId, Long adRaiseVersion, Long advertiserId, String endTime, String orderField, ToolsAdRaiseResultGetV2V2OrderType orderType, Long page, Long pageSize, String startTime, ToolsAdRaiseResultGetV2V2TimeDimension timeDimension, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/ad_raise_result/get_v2/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (adId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_id", adId));
        }

        if (adRaiseVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_raise_version", adRaiseVersion));
        }

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (timeDimension != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_dimension", timeDimension));
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
    private okhttp3.Call openApi2ToolsAdRaiseResultGetV2GetValidateBeforeCall(Long adId, Long adRaiseVersion, Long advertiserId, String endTime, String orderField, ToolsAdRaiseResultGetV2V2OrderType orderType, Long page, Long pageSize, String startTime, ToolsAdRaiseResultGetV2V2TimeDimension timeDimension, final ApiCallback _callback) throws ApiException {
        return openApi2ToolsAdRaiseResultGetV2GetCall(adId, adRaiseVersion, advertiserId, endTime, orderField, orderType, page, pageSize, startTime, timeDimension, _callback);

    }

    /**
     * 
     * 
     * @param adId  (optional)
     * @param adRaiseVersion  (optional)
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param timeDimension  (optional)
     * @return ToolsAdRaiseResultGetV2V2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAdRaiseResultGetV2V2Response openApi2ToolsAdRaiseResultGetV2Get(Long adId, Long adRaiseVersion, Long advertiserId, String endTime, String orderField, ToolsAdRaiseResultGetV2V2OrderType orderType, Long page, Long pageSize, String startTime, ToolsAdRaiseResultGetV2V2TimeDimension timeDimension) throws ApiException {
        ApiResponse<ToolsAdRaiseResultGetV2V2Response> localVarResp = openApi2ToolsAdRaiseResultGetV2GetWithHttpInfo(adId, adRaiseVersion, advertiserId, endTime, orderField, orderType, page, pageSize, startTime, timeDimension);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param adId  (optional)
     * @param adRaiseVersion  (optional)
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param timeDimension  (optional)
     * @return ApiResponse&lt;ToolsAdRaiseResultGetV2V2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAdRaiseResultGetV2V2Response> openApi2ToolsAdRaiseResultGetV2GetWithHttpInfo(Long adId, Long adRaiseVersion, Long advertiserId, String endTime, String orderField, ToolsAdRaiseResultGetV2V2OrderType orderType, Long page, Long pageSize, String startTime, ToolsAdRaiseResultGetV2V2TimeDimension timeDimension) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsAdRaiseResultGetV2GetValidateBeforeCall(adId, adRaiseVersion, advertiserId, endTime, orderField, orderType, page, pageSize, startTime, timeDimension, null);
        Type localVarReturnType = new TypeToken<ToolsAdRaiseResultGetV2V2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param adId  (optional)
     * @param adRaiseVersion  (optional)
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param startTime  (optional)
     * @param timeDimension  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAdRaiseResultGetV2GetAsync(Long adId, Long adRaiseVersion, Long advertiserId, String endTime, String orderField, ToolsAdRaiseResultGetV2V2OrderType orderType, Long page, Long pageSize, String startTime, ToolsAdRaiseResultGetV2V2TimeDimension timeDimension, final ApiCallback<ToolsAdRaiseResultGetV2V2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsAdRaiseResultGetV2GetValidateBeforeCall(adId, adRaiseVersion, advertiserId, endTime, orderField, orderType, page, pageSize, startTime, timeDimension, _callback);
        Type localVarReturnType = new TypeToken<ToolsAdRaiseResultGetV2V2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
