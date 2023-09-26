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
import com.bytedance.ads.model.QianchuanAwemeSuggestBidV10AudienceAge;
import com.bytedance.ads.model.QianchuanAwemeSuggestBidV10AudienceAudienceMode;
import com.bytedance.ads.model.QianchuanAwemeSuggestBidV10AudienceDistrict;
import com.bytedance.ads.model.QianchuanAwemeSuggestBidV10AudienceExcludeLimitedRegion;
import com.bytedance.ads.model.QianchuanAwemeSuggestBidV10AudienceGender;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class QianchuanAwemeSuggestBidV10Audience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanAwemeSuggestBidV10AudienceAge> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MODE = "audience_mode";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MODE)
  private QianchuanAwemeSuggestBidV10AudienceAudienceMode audienceMode = null;

  public static final String SERIALIZED_NAME_AUTHOR_IDS = "author_ids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_IDS)
  private List<Long> authorIds = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private QianchuanAwemeSuggestBidV10AudienceDistrict district = null;

  public static final String SERIALIZED_NAME_EXCLUDE_LIMITED_REGION = "exclude_limited_region";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LIMITED_REGION)
  private QianchuanAwemeSuggestBidV10AudienceExcludeLimitedRegion excludeLimitedRegion = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private QianchuanAwemeSuggestBidV10AudienceGender gender = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<Long> interestCategories = null;

  public QianchuanAwemeSuggestBidV10Audience() {
  }

  public QianchuanAwemeSuggestBidV10Audience age(List<QianchuanAwemeSuggestBidV10AudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanAwemeSuggestBidV10Audience addAgeItem(QianchuanAwemeSuggestBidV10AudienceAge ageItem) {
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
  public List<QianchuanAwemeSuggestBidV10AudienceAge> getAge() {
    return age;
  }


  public void setAge(List<QianchuanAwemeSuggestBidV10AudienceAge> age) {
    this.age = age;
  }


  public QianchuanAwemeSuggestBidV10Audience audienceMode(QianchuanAwemeSuggestBidV10AudienceAudienceMode audienceMode) {
    
    this.audienceMode = audienceMode;
    return this;
  }

   /**
   * Get audienceMode
   * @return audienceMode
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeSuggestBidV10AudienceAudienceMode getAudienceMode() {
    return audienceMode;
  }


  public void setAudienceMode(QianchuanAwemeSuggestBidV10AudienceAudienceMode audienceMode) {
    this.audienceMode = audienceMode;
  }


  public QianchuanAwemeSuggestBidV10Audience authorIds(List<Long> authorIds) {
    
    this.authorIds = authorIds;
    return this;
  }

  public QianchuanAwemeSuggestBidV10Audience addAuthorIdsItem(Long authorIdsItem) {
    if (this.authorIds == null) {
      this.authorIds = new ArrayList<>();
    }
    this.authorIds.add(authorIdsItem);
    return this;
  }

   /**
   * 
   * @return authorIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAuthorIds() {
    return authorIds;
  }


  public void setAuthorIds(List<Long> authorIds) {
    this.authorIds = authorIds;
  }


  public QianchuanAwemeSuggestBidV10Audience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanAwemeSuggestBidV10Audience addCityItem(Long cityItem) {
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
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public QianchuanAwemeSuggestBidV10Audience district(QianchuanAwemeSuggestBidV10AudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeSuggestBidV10AudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(QianchuanAwemeSuggestBidV10AudienceDistrict district) {
    this.district = district;
  }


  public QianchuanAwemeSuggestBidV10Audience excludeLimitedRegion(QianchuanAwemeSuggestBidV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    
    this.excludeLimitedRegion = excludeLimitedRegion;
    return this;
  }

   /**
   * Get excludeLimitedRegion
   * @return excludeLimitedRegion
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeSuggestBidV10AudienceExcludeLimitedRegion getExcludeLimitedRegion() {
    return excludeLimitedRegion;
  }


  public void setExcludeLimitedRegion(QianchuanAwemeSuggestBidV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    this.excludeLimitedRegion = excludeLimitedRegion;
  }


  public QianchuanAwemeSuggestBidV10Audience gender(QianchuanAwemeSuggestBidV10AudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeSuggestBidV10AudienceGender getGender() {
    return gender;
  }


  public void setGender(QianchuanAwemeSuggestBidV10AudienceGender gender) {
    this.gender = gender;
  }


  public QianchuanAwemeSuggestBidV10Audience interestCategories(List<Long> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public QianchuanAwemeSuggestBidV10Audience addInterestCategoriesItem(Long interestCategoriesItem) {
    if (this.interestCategories == null) {
      this.interestCategories = new ArrayList<>();
    }
    this.interestCategories.add(interestCategoriesItem);
    return this;
  }

   /**
   * 
   * @return interestCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getInterestCategories() {
    return interestCategories;
  }


  public void setInterestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeSuggestBidV10Audience qianchuanAwemeSuggestBidV10Audience = (QianchuanAwemeSuggestBidV10Audience) o;
    return Objects.equals(this.age, qianchuanAwemeSuggestBidV10Audience.age) &&
        Objects.equals(this.audienceMode, qianchuanAwemeSuggestBidV10Audience.audienceMode) &&
        Objects.equals(this.authorIds, qianchuanAwemeSuggestBidV10Audience.authorIds) &&
        Objects.equals(this.city, qianchuanAwemeSuggestBidV10Audience.city) &&
        Objects.equals(this.district, qianchuanAwemeSuggestBidV10Audience.district) &&
        Objects.equals(this.excludeLimitedRegion, qianchuanAwemeSuggestBidV10Audience.excludeLimitedRegion) &&
        Objects.equals(this.gender, qianchuanAwemeSuggestBidV10Audience.gender) &&
        Objects.equals(this.interestCategories, qianchuanAwemeSuggestBidV10Audience.interestCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, audienceMode, authorIds, city, district, excludeLimitedRegion, gender, interestCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeSuggestBidV10Audience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    audienceMode: ").append(toIndentedString(audienceMode)).append("\n");
    sb.append("    authorIds: ").append(toIndentedString(authorIds)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    excludeLimitedRegion: ").append(toIndentedString(excludeLimitedRegion)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestCategories: ").append(toIndentedString(interestCategories)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("audience_mode");
    openapiFields.add("author_ids");
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("exclude_limited_region");
    openapiFields.add("gender");
    openapiFields.add("interest_categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audience_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeSuggestBidV10Audience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeSuggestBidV10Audience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeSuggestBidV10Audience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeSuggestBidV10Audience.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeSuggestBidV10Audience>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeSuggestBidV10Audience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeSuggestBidV10Audience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeSuggestBidV10Audience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeSuggestBidV10Audience
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeSuggestBidV10Audience
  */
  public static QianchuanAwemeSuggestBidV10Audience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeSuggestBidV10Audience.class);
  }

 /**
  * Convert an instance of QianchuanAwemeSuggestBidV10Audience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

