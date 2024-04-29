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
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10AudienceAge;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10AudienceAudienceMode;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10AudienceBehaviors;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10AudienceDistrict;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10AudienceExcludeLimitedRegion;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10AudienceGender;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class QianchuanAwemeOrderCreateV10RequestAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanAwemeOrderCreateV10AudienceAge> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MODE = "audience_mode";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MODE)
  private QianchuanAwemeOrderCreateV10AudienceAudienceMode audienceMode = null;

  public static final String SERIALIZED_NAME_AUTHOR_IDS = "author_ids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_IDS)
  private List<Long> authorIds = null;

  public static final String SERIALIZED_NAME_BEHAVIORS = "behaviors";
  @SerializedName(SERIALIZED_NAME_BEHAVIORS)
  private List<QianchuanAwemeOrderCreateV10AudienceBehaviors> behaviors = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private QianchuanAwemeOrderCreateV10AudienceDistrict district = null;

  public static final String SERIALIZED_NAME_EXCLUDE_LIMITED_REGION = "exclude_limited_region";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LIMITED_REGION)
  private QianchuanAwemeOrderCreateV10AudienceExcludeLimitedRegion excludeLimitedRegion = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private QianchuanAwemeOrderCreateV10AudienceGender gender = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<Long> interestCategories = null;

  public QianchuanAwemeOrderCreateV10RequestAudience() {
  }

  public QianchuanAwemeOrderCreateV10RequestAudience age(List<QianchuanAwemeOrderCreateV10AudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanAwemeOrderCreateV10RequestAudience addAgeItem(QianchuanAwemeOrderCreateV10AudienceAge ageItem) {
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
  public List<QianchuanAwemeOrderCreateV10AudienceAge> getAge() {
    return age;
  }


  public void setAge(List<QianchuanAwemeOrderCreateV10AudienceAge> age) {
    this.age = age;
  }


  public QianchuanAwemeOrderCreateV10RequestAudience audienceMode(QianchuanAwemeOrderCreateV10AudienceAudienceMode audienceMode) {
    
    this.audienceMode = audienceMode;
    return this;
  }

   /**
   * Get audienceMode
   * @return audienceMode
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeOrderCreateV10AudienceAudienceMode getAudienceMode() {
    return audienceMode;
  }


  public void setAudienceMode(QianchuanAwemeOrderCreateV10AudienceAudienceMode audienceMode) {
    this.audienceMode = audienceMode;
  }


  public QianchuanAwemeOrderCreateV10RequestAudience authorIds(List<Long> authorIds) {
    
    this.authorIds = authorIds;
    return this;
  }

  public QianchuanAwemeOrderCreateV10RequestAudience addAuthorIdsItem(Long authorIdsItem) {
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


  public QianchuanAwemeOrderCreateV10RequestAudience behaviors(List<QianchuanAwemeOrderCreateV10AudienceBehaviors> behaviors) {
    
    this.behaviors = behaviors;
    return this;
  }

  public QianchuanAwemeOrderCreateV10RequestAudience addBehaviorsItem(QianchuanAwemeOrderCreateV10AudienceBehaviors behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * 
   * @return behaviors
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeOrderCreateV10AudienceBehaviors> getBehaviors() {
    return behaviors;
  }


  public void setBehaviors(List<QianchuanAwemeOrderCreateV10AudienceBehaviors> behaviors) {
    this.behaviors = behaviors;
  }


  public QianchuanAwemeOrderCreateV10RequestAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanAwemeOrderCreateV10RequestAudience addCityItem(Long cityItem) {
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


  public QianchuanAwemeOrderCreateV10RequestAudience district(QianchuanAwemeOrderCreateV10AudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderCreateV10AudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(QianchuanAwemeOrderCreateV10AudienceDistrict district) {
    this.district = district;
  }


  public QianchuanAwemeOrderCreateV10RequestAudience excludeLimitedRegion(QianchuanAwemeOrderCreateV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    
    this.excludeLimitedRegion = excludeLimitedRegion;
    return this;
  }

   /**
   * Get excludeLimitedRegion
   * @return excludeLimitedRegion
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderCreateV10AudienceExcludeLimitedRegion getExcludeLimitedRegion() {
    return excludeLimitedRegion;
  }


  public void setExcludeLimitedRegion(QianchuanAwemeOrderCreateV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    this.excludeLimitedRegion = excludeLimitedRegion;
  }


  public QianchuanAwemeOrderCreateV10RequestAudience gender(QianchuanAwemeOrderCreateV10AudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderCreateV10AudienceGender getGender() {
    return gender;
  }


  public void setGender(QianchuanAwemeOrderCreateV10AudienceGender gender) {
    this.gender = gender;
  }


  public QianchuanAwemeOrderCreateV10RequestAudience interestCategories(List<Long> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public QianchuanAwemeOrderCreateV10RequestAudience addInterestCategoriesItem(Long interestCategoriesItem) {
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
    QianchuanAwemeOrderCreateV10RequestAudience qianchuanAwemeOrderCreateV10RequestAudience = (QianchuanAwemeOrderCreateV10RequestAudience) o;
    return Objects.equals(this.age, qianchuanAwemeOrderCreateV10RequestAudience.age) &&
        Objects.equals(this.audienceMode, qianchuanAwemeOrderCreateV10RequestAudience.audienceMode) &&
        Objects.equals(this.authorIds, qianchuanAwemeOrderCreateV10RequestAudience.authorIds) &&
        Objects.equals(this.behaviors, qianchuanAwemeOrderCreateV10RequestAudience.behaviors) &&
        Objects.equals(this.city, qianchuanAwemeOrderCreateV10RequestAudience.city) &&
        Objects.equals(this.district, qianchuanAwemeOrderCreateV10RequestAudience.district) &&
        Objects.equals(this.excludeLimitedRegion, qianchuanAwemeOrderCreateV10RequestAudience.excludeLimitedRegion) &&
        Objects.equals(this.gender, qianchuanAwemeOrderCreateV10RequestAudience.gender) &&
        Objects.equals(this.interestCategories, qianchuanAwemeOrderCreateV10RequestAudience.interestCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, audienceMode, authorIds, behaviors, city, district, excludeLimitedRegion, gender, interestCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeOrderCreateV10RequestAudience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    audienceMode: ").append(toIndentedString(audienceMode)).append("\n");
    sb.append("    authorIds: ").append(toIndentedString(authorIds)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
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
    openapiFields.add("behaviors");
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
       if (!QianchuanAwemeOrderCreateV10RequestAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderCreateV10RequestAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderCreateV10RequestAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderCreateV10RequestAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderCreateV10RequestAudience>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderCreateV10RequestAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderCreateV10RequestAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderCreateV10RequestAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderCreateV10RequestAudience
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderCreateV10RequestAudience
  */
  public static QianchuanAwemeOrderCreateV10RequestAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderCreateV10RequestAudience.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderCreateV10RequestAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

