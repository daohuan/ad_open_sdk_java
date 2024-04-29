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


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag {
  public static final String SERIALIZED_NAME_AGE_RANGE = "age_range";
  @SerializedName(SERIALIZED_NAME_AGE_RANGE)
  private List<String> ageRange = null;

  public static final String SERIALIZED_NAME_CITY_LEVEL = "city_level";
  @SerializedName(SERIALIZED_NAME_CITY_LEVEL)
  private List<String> cityLevel = null;

  public static final String SERIALIZED_NAME_DEVICE_BRANDS = "device_brands";
  @SerializedName(SERIALIZED_NAME_DEVICE_BRANDS)
  private List<String> deviceBrands = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private List<String> gender = null;

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag() {
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag ageRange(List<String> ageRange) {
    
    this.ageRange = ageRange;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag addAgeRangeItem(String ageRangeItem) {
    if (this.ageRange == null) {
      this.ageRange = new ArrayList<>();
    }
    this.ageRange.add(ageRangeItem);
    return this;
  }

   /**
   * 
   * @return ageRange
  **/
  @javax.annotation.Nullable
  public List<String> getAgeRange() {
    return ageRange;
  }


  public void setAgeRange(List<String> ageRange) {
    this.ageRange = ageRange;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag cityLevel(List<String> cityLevel) {
    
    this.cityLevel = cityLevel;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag addCityLevelItem(String cityLevelItem) {
    if (this.cityLevel == null) {
      this.cityLevel = new ArrayList<>();
    }
    this.cityLevel.add(cityLevelItem);
    return this;
  }

   /**
   * 
   * @return cityLevel
  **/
  @javax.annotation.Nullable
  public List<String> getCityLevel() {
    return cityLevel;
  }


  public void setCityLevel(List<String> cityLevel) {
    this.cityLevel = cityLevel;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag deviceBrands(List<String> deviceBrands) {
    
    this.deviceBrands = deviceBrands;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag addDeviceBrandsItem(String deviceBrandsItem) {
    if (this.deviceBrands == null) {
      this.deviceBrands = new ArrayList<>();
    }
    this.deviceBrands.add(deviceBrandsItem);
    return this;
  }

   /**
   * 
   * @return deviceBrands
  **/
  @javax.annotation.Nullable
  public List<String> getDeviceBrands() {
    return deviceBrands;
  }


  public void setDeviceBrands(List<String> deviceBrands) {
    this.deviceBrands = deviceBrands;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag gender(List<String> gender) {
    
    this.gender = gender;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag addGenderItem(String genderItem) {
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
  public List<String> getGender() {
    return gender;
  }


  public void setGender(List<String> gender) {
    this.gender = gender;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag = (StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag) o;
    return Objects.equals(this.ageRange, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag.ageRange) &&
        Objects.equals(this.cityLevel, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag.cityLevel) &&
        Objects.equals(this.deviceBrands, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag.deviceBrands) &&
        Objects.equals(this.gender, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag.gender);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageRange, cityLevel, deviceBrands, gender);
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
    sb.append("class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag {\n");
    sb.append("    ageRange: ").append(toIndentedString(ageRange)).append("\n");
    sb.append("    cityLevel: ").append(toIndentedString(cityLevel)).append("\n");
    sb.append("    deviceBrands: ").append(toIndentedString(deviceBrands)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
    openapiFields.add("age_range");
    openapiFields.add("city_level");
    openapiFields.add("device_brands");
    openapiFields.add("gender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag
  */
  public static StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRangeAuthorWatcherTag to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

