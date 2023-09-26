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
import com.bytedance.ads.model.StarReportOrderUserDistributionGetV2ResponseDataActivityInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class StarReportOrderUserDistributionGetV2ResponseData {
  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> activity = null;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> age = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> city = null;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> device = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> gender = null;

  public static final String SERIALIZED_NAME_INTEREST = "interest";
  @SerializedName(SERIALIZED_NAME_INTEREST)
  private List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> interest = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> province = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public StarReportOrderUserDistributionGetV2ResponseData() {
  }

  
  public StarReportOrderUserDistributionGetV2ResponseData(
     String updateTime
  ) {
    this();
    this.updateTime = updateTime;
  }

  public StarReportOrderUserDistributionGetV2ResponseData activity(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> activity) {
    
    this.activity = activity;
    return this;
  }

  public StarReportOrderUserDistributionGetV2ResponseData addActivityItem(StarReportOrderUserDistributionGetV2ResponseDataActivityInner activityItem) {
    if (this.activity == null) {
      this.activity = new ArrayList<>();
    }
    this.activity.add(activityItem);
    return this;
  }

   /**
   * 
   * @return activity
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> getActivity() {
    return activity;
  }


  public void setActivity(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> activity) {
    this.activity = activity;
  }


  public StarReportOrderUserDistributionGetV2ResponseData age(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> age) {
    
    this.age = age;
    return this;
  }

  public StarReportOrderUserDistributionGetV2ResponseData addAgeItem(StarReportOrderUserDistributionGetV2ResponseDataActivityInner ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> getAge() {
    return age;
  }


  public void setAge(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> age) {
    this.age = age;
  }


  public StarReportOrderUserDistributionGetV2ResponseData city(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> city) {
    
    this.city = city;
    return this;
  }

  public StarReportOrderUserDistributionGetV2ResponseData addCityItem(StarReportOrderUserDistributionGetV2ResponseDataActivityInner cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> getCity() {
    return city;
  }


  public void setCity(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> city) {
    this.city = city;
  }


  public StarReportOrderUserDistributionGetV2ResponseData device(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> device) {
    
    this.device = device;
    return this;
  }

  public StarReportOrderUserDistributionGetV2ResponseData addDeviceItem(StarReportOrderUserDistributionGetV2ResponseDataActivityInner deviceItem) {
    if (this.device == null) {
      this.device = new ArrayList<>();
    }
    this.device.add(deviceItem);
    return this;
  }

   /**
   * 
   * @return device
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> getDevice() {
    return device;
  }


  public void setDevice(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> device) {
    this.device = device;
  }


  public StarReportOrderUserDistributionGetV2ResponseData gender(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> gender) {
    
    this.gender = gender;
    return this;
  }

  public StarReportOrderUserDistributionGetV2ResponseData addGenderItem(StarReportOrderUserDistributionGetV2ResponseDataActivityInner genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<>();
    }
    this.gender.add(genderItem);
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> getGender() {
    return gender;
  }


  public void setGender(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> gender) {
    this.gender = gender;
  }


  public StarReportOrderUserDistributionGetV2ResponseData interest(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> interest) {
    
    this.interest = interest;
    return this;
  }

  public StarReportOrderUserDistributionGetV2ResponseData addInterestItem(StarReportOrderUserDistributionGetV2ResponseDataActivityInner interestItem) {
    if (this.interest == null) {
      this.interest = new ArrayList<>();
    }
    this.interest.add(interestItem);
    return this;
  }

   /**
   * 
   * @return interest
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> getInterest() {
    return interest;
  }


  public void setInterest(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> interest) {
    this.interest = interest;
  }


  public StarReportOrderUserDistributionGetV2ResponseData province(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> province) {
    
    this.province = province;
    return this;
  }

  public StarReportOrderUserDistributionGetV2ResponseData addProvinceItem(StarReportOrderUserDistributionGetV2ResponseDataActivityInner provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<>();
    }
    this.province.add(provinceItem);
    return this;
  }

   /**
   * 
   * @return province
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> getProvince() {
    return province;
  }


  public void setProvince(List<StarReportOrderUserDistributionGetV2ResponseDataActivityInner> province) {
    this.province = province;
  }


   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderUserDistributionGetV2ResponseData starReportOrderUserDistributionGetV2ResponseData = (StarReportOrderUserDistributionGetV2ResponseData) o;
    return Objects.equals(this.activity, starReportOrderUserDistributionGetV2ResponseData.activity) &&
        Objects.equals(this.age, starReportOrderUserDistributionGetV2ResponseData.age) &&
        Objects.equals(this.city, starReportOrderUserDistributionGetV2ResponseData.city) &&
        Objects.equals(this.device, starReportOrderUserDistributionGetV2ResponseData.device) &&
        Objects.equals(this.gender, starReportOrderUserDistributionGetV2ResponseData.gender) &&
        Objects.equals(this.interest, starReportOrderUserDistributionGetV2ResponseData.interest) &&
        Objects.equals(this.province, starReportOrderUserDistributionGetV2ResponseData.province) &&
        Objects.equals(this.updateTime, starReportOrderUserDistributionGetV2ResponseData.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, age, city, device, gender, interest, province, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarReportOrderUserDistributionGetV2ResponseData {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("activity");
    openapiFields.add("age");
    openapiFields.add("city");
    openapiFields.add("device");
    openapiFields.add("gender");
    openapiFields.add("interest");
    openapiFields.add("province");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderUserDistributionGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderUserDistributionGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderUserDistributionGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderUserDistributionGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderUserDistributionGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarReportOrderUserDistributionGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderUserDistributionGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderUserDistributionGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderUserDistributionGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderUserDistributionGetV2ResponseData
  */
  public static StarReportOrderUserDistributionGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderUserDistributionGetV2ResponseData.class);
  }

 /**
  * Convert an instance of StarReportOrderUserDistributionGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

