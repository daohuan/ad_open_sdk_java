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



import com.bytedance.ads.model.ReportBrandAdvertiserGetV30LandingType;
import com.bytedance.ads.model.ReportBrandAdvertiserGetV30PricingType;
import com.bytedance.ads.model.ReportBrandAdvertiserGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportBrandAdvertiserGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportBrandAdvertiserGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportBrandAdvertiserGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ReportBrandAdvertiserGetGet
     * @param advertiserId 广告主ID (required)
     * @param startTime 开始时间 格式2023-01-01 (required)
     * @param endTime 结束时间 格式2023-01-01 (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 最大值100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportBrandAdvertiserGetGetCall(Long advertiserId, String startTime, String endTime, Long page, Long size, ReportBrandAdvertiserGetV30LandingType landingType, ReportBrandAdvertiserGetV30PricingType pricingType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/report/brand/advertiser/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (landingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("landing_type", landingType));
        }

        if (pricingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pricing_type", pricingType));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
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
    private okhttp3.Call openApiV30ReportBrandAdvertiserGetGetValidateBeforeCall(Long advertiserId, String startTime, String endTime, Long page, Long size, ReportBrandAdvertiserGetV30LandingType landingType, ReportBrandAdvertiserGetV30PricingType pricingType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ReportBrandAdvertiserGetGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApiV30ReportBrandAdvertiserGetGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApiV30ReportBrandAdvertiserGetGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApiV30ReportBrandAdvertiserGetGet(Async)");
        }

        // verify the required parameter 'size' is set
        if (size == null) {
            throw new ApiException("Missing the required parameter 'size' when calling openApiV30ReportBrandAdvertiserGetGet(Async)");
        }

        return openApiV30ReportBrandAdvertiserGetGetCall(advertiserId, startTime, endTime, page, size, landingType, pricingType, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param startTime 开始时间 格式2023-01-01 (required)
     * @param endTime 结束时间 格式2023-01-01 (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 最大值100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @return ReportBrandAdvertiserGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportBrandAdvertiserGetV30Response openApiV30ReportBrandAdvertiserGetGet(Long advertiserId, String startTime, String endTime, Long page, Long size, ReportBrandAdvertiserGetV30LandingType landingType, ReportBrandAdvertiserGetV30PricingType pricingType) throws ApiException {
        ApiResponse<ReportBrandAdvertiserGetV30Response> localVarResp = openApiV30ReportBrandAdvertiserGetGetWithHttpInfo(advertiserId, startTime, endTime, page, size, landingType, pricingType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param startTime 开始时间 格式2023-01-01 (required)
     * @param endTime 结束时间 格式2023-01-01 (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 最大值100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @return ApiResponse&lt;ReportBrandAdvertiserGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportBrandAdvertiserGetV30Response> openApiV30ReportBrandAdvertiserGetGetWithHttpInfo(Long advertiserId, String startTime, String endTime, Long page, Long size, ReportBrandAdvertiserGetV30LandingType landingType, ReportBrandAdvertiserGetV30PricingType pricingType) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ReportBrandAdvertiserGetGetValidateBeforeCall(advertiserId, startTime, endTime, page, size, landingType, pricingType, null);
        Type localVarReturnType = new TypeToken<ReportBrandAdvertiserGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param startTime 开始时间 格式2023-01-01 (required)
     * @param endTime 结束时间 格式2023-01-01 (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 最大值100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportBrandAdvertiserGetGetAsync(Long advertiserId, String startTime, String endTime, Long page, Long size, ReportBrandAdvertiserGetV30LandingType landingType, ReportBrandAdvertiserGetV30PricingType pricingType, final ApiCallback<ReportBrandAdvertiserGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ReportBrandAdvertiserGetGetValidateBeforeCall(advertiserId, startTime, endTime, page, size, landingType, pricingType, _callback);
        Type localVarReturnType = new TypeToken<ReportBrandAdvertiserGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
