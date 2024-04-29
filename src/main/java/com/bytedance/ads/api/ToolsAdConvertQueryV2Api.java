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



import com.bytedance.ads.model.ToolsAdConvertQueryV2AdvancedCreativeType;
import com.bytedance.ads.model.ToolsAdConvertQueryV2AppType;
import com.bytedance.ads.model.ToolsAdConvertQueryV2DedicateType;
import com.bytedance.ads.model.ToolsAdConvertQueryV2DeliveryRange;
import com.bytedance.ads.model.ToolsAdConvertQueryV2LandingType;
import com.bytedance.ads.model.ToolsAdConvertQueryV2MarketingScene;
import com.bytedance.ads.model.ToolsAdConvertQueryV2PromotionContent;
import com.bytedance.ads.model.ToolsAdConvertQueryV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAdConvertQueryV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAdConvertQueryV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAdConvertQueryV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsAdConvertQueryGet
     * @param advancedCreativeType  (optional)
     * @param advertiserId  (optional)
     * @param appSchema  (optional)
     * @param appType  (optional)
     * @param dedicateType  (optional)
     * @param deliveryRange  (optional)
     * @param externalUrl  (optional)
     * @param itunesUrl  (optional)
     * @param landingType  (optional)
     * @param marketingScene  (optional)
     * @param packageName  (optional)
     * @param promotionContent  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAdConvertQueryGetCall(ToolsAdConvertQueryV2AdvancedCreativeType advancedCreativeType, Long advertiserId, String appSchema, ToolsAdConvertQueryV2AppType appType, ToolsAdConvertQueryV2DedicateType dedicateType, ToolsAdConvertQueryV2DeliveryRange deliveryRange, String externalUrl, String itunesUrl, ToolsAdConvertQueryV2LandingType landingType, ToolsAdConvertQueryV2MarketingScene marketingScene, String packageName, ToolsAdConvertQueryV2PromotionContent promotionContent, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/ad_convert/query/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advancedCreativeType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advanced_creative_type", advancedCreativeType));
        }

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (appSchema != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_schema", appSchema));
        }

        if (appType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_type", appType));
        }

        if (dedicateType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dedicate_type", dedicateType));
        }

        if (deliveryRange != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("delivery_range", deliveryRange));
        }

        if (externalUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_url", externalUrl));
        }

        if (itunesUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("itunes_url", itunesUrl));
        }

        if (landingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("landing_type", landingType));
        }

        if (marketingScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_scene", marketingScene));
        }

        if (packageName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("package_name", packageName));
        }

        if (promotionContent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("promotion_content", promotionContent));
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
    private okhttp3.Call openApi2ToolsAdConvertQueryGetValidateBeforeCall(ToolsAdConvertQueryV2AdvancedCreativeType advancedCreativeType, Long advertiserId, String appSchema, ToolsAdConvertQueryV2AppType appType, ToolsAdConvertQueryV2DedicateType dedicateType, ToolsAdConvertQueryV2DeliveryRange deliveryRange, String externalUrl, String itunesUrl, ToolsAdConvertQueryV2LandingType landingType, ToolsAdConvertQueryV2MarketingScene marketingScene, String packageName, ToolsAdConvertQueryV2PromotionContent promotionContent, final ApiCallback _callback) throws ApiException {
        return openApi2ToolsAdConvertQueryGetCall(advancedCreativeType, advertiserId, appSchema, appType, dedicateType, deliveryRange, externalUrl, itunesUrl, landingType, marketingScene, packageName, promotionContent, _callback);

    }

    /**
     * 
     * 
     * @param advancedCreativeType  (optional)
     * @param advertiserId  (optional)
     * @param appSchema  (optional)
     * @param appType  (optional)
     * @param dedicateType  (optional)
     * @param deliveryRange  (optional)
     * @param externalUrl  (optional)
     * @param itunesUrl  (optional)
     * @param landingType  (optional)
     * @param marketingScene  (optional)
     * @param packageName  (optional)
     * @param promotionContent  (optional)
     * @return ToolsAdConvertQueryV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAdConvertQueryV2Response openApi2ToolsAdConvertQueryGet(ToolsAdConvertQueryV2AdvancedCreativeType advancedCreativeType, Long advertiserId, String appSchema, ToolsAdConvertQueryV2AppType appType, ToolsAdConvertQueryV2DedicateType dedicateType, ToolsAdConvertQueryV2DeliveryRange deliveryRange, String externalUrl, String itunesUrl, ToolsAdConvertQueryV2LandingType landingType, ToolsAdConvertQueryV2MarketingScene marketingScene, String packageName, ToolsAdConvertQueryV2PromotionContent promotionContent) throws ApiException {
        ApiResponse<ToolsAdConvertQueryV2Response> localVarResp = openApi2ToolsAdConvertQueryGetWithHttpInfo(advancedCreativeType, advertiserId, appSchema, appType, dedicateType, deliveryRange, externalUrl, itunesUrl, landingType, marketingScene, packageName, promotionContent);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advancedCreativeType  (optional)
     * @param advertiserId  (optional)
     * @param appSchema  (optional)
     * @param appType  (optional)
     * @param dedicateType  (optional)
     * @param deliveryRange  (optional)
     * @param externalUrl  (optional)
     * @param itunesUrl  (optional)
     * @param landingType  (optional)
     * @param marketingScene  (optional)
     * @param packageName  (optional)
     * @param promotionContent  (optional)
     * @return ApiResponse&lt;ToolsAdConvertQueryV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAdConvertQueryV2Response> openApi2ToolsAdConvertQueryGetWithHttpInfo(ToolsAdConvertQueryV2AdvancedCreativeType advancedCreativeType, Long advertiserId, String appSchema, ToolsAdConvertQueryV2AppType appType, ToolsAdConvertQueryV2DedicateType dedicateType, ToolsAdConvertQueryV2DeliveryRange deliveryRange, String externalUrl, String itunesUrl, ToolsAdConvertQueryV2LandingType landingType, ToolsAdConvertQueryV2MarketingScene marketingScene, String packageName, ToolsAdConvertQueryV2PromotionContent promotionContent) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsAdConvertQueryGetValidateBeforeCall(advancedCreativeType, advertiserId, appSchema, appType, dedicateType, deliveryRange, externalUrl, itunesUrl, landingType, marketingScene, packageName, promotionContent, null);
        Type localVarReturnType = new TypeToken<ToolsAdConvertQueryV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advancedCreativeType  (optional)
     * @param advertiserId  (optional)
     * @param appSchema  (optional)
     * @param appType  (optional)
     * @param dedicateType  (optional)
     * @param deliveryRange  (optional)
     * @param externalUrl  (optional)
     * @param itunesUrl  (optional)
     * @param landingType  (optional)
     * @param marketingScene  (optional)
     * @param packageName  (optional)
     * @param promotionContent  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAdConvertQueryGetAsync(ToolsAdConvertQueryV2AdvancedCreativeType advancedCreativeType, Long advertiserId, String appSchema, ToolsAdConvertQueryV2AppType appType, ToolsAdConvertQueryV2DedicateType dedicateType, ToolsAdConvertQueryV2DeliveryRange deliveryRange, String externalUrl, String itunesUrl, ToolsAdConvertQueryV2LandingType landingType, ToolsAdConvertQueryV2MarketingScene marketingScene, String packageName, ToolsAdConvertQueryV2PromotionContent promotionContent, final ApiCallback<ToolsAdConvertQueryV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsAdConvertQueryGetValidateBeforeCall(advancedCreativeType, advertiserId, appSchema, appType, dedicateType, deliveryRange, externalUrl, itunesUrl, landingType, marketingScene, packageName, promotionContent, _callback);
        Type localVarReturnType = new TypeToken<ToolsAdConvertQueryV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
