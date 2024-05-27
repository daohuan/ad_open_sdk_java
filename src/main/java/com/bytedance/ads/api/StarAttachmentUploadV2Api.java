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



import java.io.File;
import com.bytedance.ads.model.StarAttachmentUploadV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarAttachmentUploadV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarAttachmentUploadV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarAttachmentUploadV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarAttachmentUploadPost
     * @param _file 上传的文件 (required)
     * @param fileName 文件名 (required)
     * @param starId 星图客户ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarAttachmentUploadPostCall(File _file, File fileName, Long starId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/attachment/upload/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (fileName != null) {
            localVarFormParams.put("file_name", fileName);
        }

        if (starId != null) {
            localVarFormParams.put("star_id", starId);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2StarAttachmentUploadPostValidateBeforeCall(File _file, File fileName, Long starId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling openApi2StarAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling openApi2StarAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarAttachmentUploadPost(Async)");
        }

        return openApi2StarAttachmentUploadPostCall(_file, fileName, starId, _callback);

    }

    /**
     * 
     * 
     * @param _file 上传的文件 (required)
     * @param fileName 文件名 (required)
     * @param starId 星图客户ID (required)
     * @return StarAttachmentUploadV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarAttachmentUploadV2Response openApi2StarAttachmentUploadPost(File _file, File fileName, Long starId) throws ApiException {
        ApiResponse<StarAttachmentUploadV2Response> localVarResp = openApi2StarAttachmentUploadPostWithHttpInfo(_file, fileName, starId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param _file 上传的文件 (required)
     * @param fileName 文件名 (required)
     * @param starId 星图客户ID (required)
     * @return ApiResponse&lt;StarAttachmentUploadV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarAttachmentUploadV2Response> openApi2StarAttachmentUploadPostWithHttpInfo(File _file, File fileName, Long starId) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarAttachmentUploadPostValidateBeforeCall(_file, fileName, starId, null);
        Type localVarReturnType = new TypeToken<StarAttachmentUploadV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param _file 上传的文件 (required)
     * @param fileName 文件名 (required)
     * @param starId 星图客户ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarAttachmentUploadPostAsync(File _file, File fileName, Long starId, final ApiCallback<StarAttachmentUploadV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarAttachmentUploadPostValidateBeforeCall(_file, fileName, starId, _callback);
        Type localVarReturnType = new TypeToken<StarAttachmentUploadV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
