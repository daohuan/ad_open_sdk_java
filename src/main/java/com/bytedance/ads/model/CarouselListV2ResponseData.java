/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CarouselListV2ResponseDataCarouselsInner;
import com.bytedance.ads.model.CarouselListV2ResponseDataPageInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class CarouselListV2ResponseData {
  public static final String SERIALIZED_NAME_CAROUSELS = "carousels";
  @SerializedName(SERIALIZED_NAME_CAROUSELS)
  private List<CarouselListV2ResponseDataCarouselsInner> carousels = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private CarouselListV2ResponseDataPageInfo pageInfo = null;

  public CarouselListV2ResponseData() {
  }

  public CarouselListV2ResponseData carousels(List<CarouselListV2ResponseDataCarouselsInner> carousels) {
    
    this.carousels = carousels;
    return this;
  }

  public CarouselListV2ResponseData addCarouselsItem(CarouselListV2ResponseDataCarouselsInner carouselsItem) {
    if (this.carousels == null) {
      this.carousels = new ArrayList<>();
    }
    this.carousels.add(carouselsItem);
    return this;
  }

   /**
   * 
   * @return carousels
  **/
  @javax.annotation.Nullable
  public List<CarouselListV2ResponseDataCarouselsInner> getCarousels() {
    return carousels;
  }


  public void setCarousels(List<CarouselListV2ResponseDataCarouselsInner> carousels) {
    this.carousels = carousels;
  }


  public CarouselListV2ResponseData pageInfo(CarouselListV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public CarouselListV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(CarouselListV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselListV2ResponseData carouselListV2ResponseData = (CarouselListV2ResponseData) o;
    return Objects.equals(this.carousels, carouselListV2ResponseData.carousels) &&
        Objects.equals(this.pageInfo, carouselListV2ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(carousels, pageInfo);
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
    sb.append("class CarouselListV2ResponseData {\n");
    sb.append("    carousels: ").append(toIndentedString(carousels)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("carousels");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselListV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselListV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselListV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselListV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselListV2ResponseData>() {
           @Override
           public void write(JsonWriter out, CarouselListV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselListV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselListV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselListV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to CarouselListV2ResponseData
  */
  public static CarouselListV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselListV2ResponseData.class);
  }

 /**
  * Convert an instance of CarouselListV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

