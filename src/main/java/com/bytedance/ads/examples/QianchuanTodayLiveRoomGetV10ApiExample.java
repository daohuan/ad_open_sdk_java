/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanTodayLiveRoomGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanTodayLiveRoomGetV10AdStatus;
import com.bytedance.ads.model.QianchuanTodayLiveRoomGetV10Response;
import com.bytedance.ads.model.QianchuanTodayLiveRoomGetV10RoomStatus;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/today_live/room/get/ GET
public class QianchuanTodayLiveRoomGetV10ApiExample {

    private static final QianchuanTodayLiveRoomGetV10Api api = new QianchuanTodayLiveRoomGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        String dateTime = null;
        List<String> fields = null;
        QianchuanTodayLiveRoomGetV10RoomStatus roomStatus = null;
        QianchuanTodayLiveRoomGetV10AdStatus adStatus = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanTodayLiveRoomGetV10Response response = api.openApiV10QianchuanTodayLiveRoomGetGet(advertiserId, awemeId, dateTime, fields, roomStatus, adStatus, page, pageSize);
        System.out.println(response);
    }

}