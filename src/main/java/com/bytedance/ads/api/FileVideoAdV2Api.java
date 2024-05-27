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
import com.bytedance.ads.model.FileVideoAdV2Response;
import com.bytedance.ads.model.FileVideoAdV2UploadType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileVideoAdV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileVideoAdV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FileVideoAdV2Api(ApiClient apiClient) {
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
     * Build call for openApi2FileVideoAdPost
     * @param advertiserId 广告主ID  (required)
     * @param filename 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名 (optional)
     * @param isAigc 视频素材是否为AIGC生成 (optional)
     * @param isGuideVideo 上传视频场景是否是引导视频 (optional)
     * @param labels  (optional)
     * @param uploadType  (optional)
     * @param videoFile 视频文件 允许格式：mp4、mpeg、3gp、avi（10s超时限制） upload_type为UPLOAD_BY_File必填  (optional)
     * @param videoSignature 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填  (optional)
     * @param videoUrl 视频url地址，如http://xxx.xxx，upload_type为UPLOAD_BY_URL必填  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileVideoAdPostCall(Long advertiserId, String filename, Boolean isAigc, Boolean isGuideVideo, List<String> labels, FileVideoAdV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/file/video/ad/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarFormParams.put("advertiser_id", advertiserId);
        }

        if (filename != null) {
            localVarFormParams.put("filename", filename);
        }

        if (isAigc != null) {
            localVarFormParams.put("is_aigc", isAigc);
        }

        if (isGuideVideo != null) {
            localVarFormParams.put("is_guide_video", isGuideVideo);
        }

        if (labels != null) {
            localVarFormParams.put("labels", labels);
        }

        if (uploadType != null) {
            localVarFormParams.put("upload_type", uploadType);
        }

        if (videoFile != null) {
            localVarFormParams.put("video_file", videoFile);
        }

        if (videoSignature != null) {
            localVarFormParams.put("video_signature", videoSignature);
        }

        if (videoUrl != null) {
            localVarFormParams.put("video_url", videoUrl);
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
    private okhttp3.Call openApi2FileVideoAdPostValidateBeforeCall(Long advertiserId, String filename, Boolean isAigc, Boolean isGuideVideo, List<String> labels, FileVideoAdV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2FileVideoAdPost(Async)");
        }

        return openApi2FileVideoAdPostCall(advertiserId, filename, isAigc, isGuideVideo, labels, uploadType, videoFile, videoSignature, videoUrl, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID  (required)
     * @param filename 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名 (optional)
     * @param isAigc 视频素材是否为AIGC生成 (optional)
     * @param isGuideVideo 上传视频场景是否是引导视频 (optional)
     * @param labels  (optional)
     * @param uploadType  (optional)
     * @param videoFile 视频文件 允许格式：mp4、mpeg、3gp、avi（10s超时限制） upload_type为UPLOAD_BY_File必填  (optional)
     * @param videoSignature 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填  (optional)
     * @param videoUrl 视频url地址，如http://xxx.xxx，upload_type为UPLOAD_BY_URL必填  (optional)
     * @return FileVideoAdV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FileVideoAdV2Response openApi2FileVideoAdPost(Long advertiserId, String filename, Boolean isAigc, Boolean isGuideVideo, List<String> labels, FileVideoAdV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl) throws ApiException {
        ApiResponse<FileVideoAdV2Response> localVarResp = openApi2FileVideoAdPostWithHttpInfo(advertiserId, filename, isAigc, isGuideVideo, labels, uploadType, videoFile, videoSignature, videoUrl);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID  (required)
     * @param filename 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名 (optional)
     * @param isAigc 视频素材是否为AIGC生成 (optional)
     * @param isGuideVideo 上传视频场景是否是引导视频 (optional)
     * @param labels  (optional)
     * @param uploadType  (optional)
     * @param videoFile 视频文件 允许格式：mp4、mpeg、3gp、avi（10s超时限制） upload_type为UPLOAD_BY_File必填  (optional)
     * @param videoSignature 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填  (optional)
     * @param videoUrl 视频url地址，如http://xxx.xxx，upload_type为UPLOAD_BY_URL必填  (optional)
     * @return ApiResponse&lt;FileVideoAdV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileVideoAdV2Response> openApi2FileVideoAdPostWithHttpInfo(Long advertiserId, String filename, Boolean isAigc, Boolean isGuideVideo, List<String> labels, FileVideoAdV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl) throws ApiException {
        okhttp3.Call localVarCall = openApi2FileVideoAdPostValidateBeforeCall(advertiserId, filename, isAigc, isGuideVideo, labels, uploadType, videoFile, videoSignature, videoUrl, null);
        Type localVarReturnType = new TypeToken<FileVideoAdV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID  (required)
     * @param filename 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名 (optional)
     * @param isAigc 视频素材是否为AIGC生成 (optional)
     * @param isGuideVideo 上传视频场景是否是引导视频 (optional)
     * @param labels  (optional)
     * @param uploadType  (optional)
     * @param videoFile 视频文件 允许格式：mp4、mpeg、3gp、avi（10s超时限制） upload_type为UPLOAD_BY_File必填  (optional)
     * @param videoSignature 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填  (optional)
     * @param videoUrl 视频url地址，如http://xxx.xxx，upload_type为UPLOAD_BY_URL必填  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileVideoAdPostAsync(Long advertiserId, String filename, Boolean isAigc, Boolean isGuideVideo, List<String> labels, FileVideoAdV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl, final ApiCallback<FileVideoAdV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2FileVideoAdPostValidateBeforeCall(advertiserId, filename, isAigc, isGuideVideo, labels, uploadType, videoFile, videoSignature, videoUrl, _callback);
        Type localVarReturnType = new TypeToken<FileVideoAdV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
