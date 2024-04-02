/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * ReportRtaExpLocalDailyGetV30ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ReportRtaExpLocalDailyGetV30ResponseDataDataInner {
  public static final String SERIALIZED_NAME_BID_COEF = "bid_coef";
  @SerializedName(SERIALIZED_NAME_BID_COEF)
  private String bidCoef = null;

  public static final String SERIALIZED_NAME_CLICK = "click";
  @SerializedName(SERIALIZED_NAME_CLICK)
  private Long click = null;

  public static final String SERIALIZED_NAME_CONVERT = "convert";
  @SerializedName(SERIALIZED_NAME_CONVERT)
  private Long convert = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_CUS_VID = "cus_vid";
  @SerializedName(SERIALIZED_NAME_CUS_VID)
  private Long cusVid = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Long show = null;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid = null;

  public ReportRtaExpLocalDailyGetV30ResponseDataDataInner() {
  }

  public ReportRtaExpLocalDailyGetV30ResponseDataDataInner bidCoef(String bidCoef) {
    
    this.bidCoef = bidCoef;
    return this;
  }

   /**
   * 
   * @return bidCoef
  **/
  @javax.annotation.Nullable
  public String getBidCoef() {
    return bidCoef;
  }


  public void setBidCoef(String bidCoef) {
    this.bidCoef = bidCoef;
  }


  public ReportRtaExpLocalDailyGetV30ResponseDataDataInner click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * 
   * @return click
  **/
  @javax.annotation.Nullable
  public Long getClick() {
    return click;
  }


  public void setClick(Long click) {
    this.click = click;
  }


  public ReportRtaExpLocalDailyGetV30ResponseDataDataInner convert(Long convert) {
    
    this.convert = convert;
    return this;
  }

   /**
   * 
   * @return convert
  **/
  @javax.annotation.Nullable
  public Long getConvert() {
    return convert;
  }


  public void setConvert(Long convert) {
    this.convert = convert;
  }


  public ReportRtaExpLocalDailyGetV30ResponseDataDataInner cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public ReportRtaExpLocalDailyGetV30ResponseDataDataInner cusVid(Long cusVid) {
    
    this.cusVid = cusVid;
    return this;
  }

   /**
   * 
   * @return cusVid
  **/
  @javax.annotation.Nullable
  public Long getCusVid() {
    return cusVid;
  }


  public void setCusVid(Long cusVid) {
    this.cusVid = cusVid;
  }


  public ReportRtaExpLocalDailyGetV30ResponseDataDataInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public ReportRtaExpLocalDailyGetV30ResponseDataDataInner show(Long show) {
    
    this.show = show;
    return this;
  }

   /**
   * 
   * @return show
  **/
  @javax.annotation.Nullable
  public Long getShow() {
    return show;
  }


  public void setShow(Long show) {
    this.show = show;
  }


  public ReportRtaExpLocalDailyGetV30ResponseDataDataInner vid(Long vid) {
    
    this.vid = vid;
    return this;
  }

   /**
   * 
   * @return vid
  **/
  @javax.annotation.Nullable
  public Long getVid() {
    return vid;
  }


  public void setVid(Long vid) {
    this.vid = vid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRtaExpLocalDailyGetV30ResponseDataDataInner reportRtaExpLocalDailyGetV30ResponseDataDataInner = (ReportRtaExpLocalDailyGetV30ResponseDataDataInner) o;
    return Objects.equals(this.bidCoef, reportRtaExpLocalDailyGetV30ResponseDataDataInner.bidCoef) &&
        Objects.equals(this.click, reportRtaExpLocalDailyGetV30ResponseDataDataInner.click) &&
        Objects.equals(this.convert, reportRtaExpLocalDailyGetV30ResponseDataDataInner.convert) &&
        Objects.equals(this.cost, reportRtaExpLocalDailyGetV30ResponseDataDataInner.cost) &&
        Objects.equals(this.cusVid, reportRtaExpLocalDailyGetV30ResponseDataDataInner.cusVid) &&
        Objects.equals(this.date, reportRtaExpLocalDailyGetV30ResponseDataDataInner.date) &&
        Objects.equals(this.show, reportRtaExpLocalDailyGetV30ResponseDataDataInner.show) &&
        Objects.equals(this.vid, reportRtaExpLocalDailyGetV30ResponseDataDataInner.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCoef, click, convert, cost, cusVid, date, show, vid);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRtaExpLocalDailyGetV30ResponseDataDataInner {\n");
    sb.append("    bidCoef: ").append(toIndentedString(bidCoef)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    cusVid: ").append(toIndentedString(cusVid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bid_coef");
    openapiFields.add("click");
    openapiFields.add("convert");
    openapiFields.add("cost");
    openapiFields.add("cus_vid");
    openapiFields.add("date");
    openapiFields.add("show");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("click");
    openapiRequiredFields.add("convert");
    openapiRequiredFields.add("cost");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("show");
    openapiRequiredFields.add("vid");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRtaExpLocalDailyGetV30ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRtaExpLocalDailyGetV30ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRtaExpLocalDailyGetV30ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRtaExpLocalDailyGetV30ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRtaExpLocalDailyGetV30ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, ReportRtaExpLocalDailyGetV30ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRtaExpLocalDailyGetV30ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRtaExpLocalDailyGetV30ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRtaExpLocalDailyGetV30ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to ReportRtaExpLocalDailyGetV30ResponseDataDataInner
  */
  public static ReportRtaExpLocalDailyGetV30ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRtaExpLocalDailyGetV30ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of ReportRtaExpLocalDailyGetV30ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

