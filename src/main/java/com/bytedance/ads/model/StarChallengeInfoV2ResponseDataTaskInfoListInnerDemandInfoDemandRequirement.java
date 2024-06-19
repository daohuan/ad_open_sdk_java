/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement {
  public static final String SERIALIZED_NAME_DETAIL_DEMAND = "detail_demand";
  @SerializedName(SERIALIZED_NAME_DETAIL_DEMAND)
  private String detailDemand = null;

  public static final String SERIALIZED_NAME_MUSIC = "music";
  @SerializedName(SERIALIZED_NAME_MUSIC)
  private String music = null;

  public static final String SERIALIZED_NAME_OTHER_DEMAND = "other_demand";
  @SerializedName(SERIALIZED_NAME_OTHER_DEMAND)
  private String otherDemand = null;

  public static final String SERIALIZED_NAME_PROP_DEMAND = "prop_demand";
  @SerializedName(SERIALIZED_NAME_PROP_DEMAND)
  private String propDemand = null;

  public static final String SERIALIZED_NAME_SCENE_DEMAND = "scene_demand";
  @SerializedName(SERIALIZED_NAME_SCENE_DEMAND)
  private String sceneDemand = null;

  public static final String SERIALIZED_NAME_SCRIPT_DEMAND = "script_demand";
  @SerializedName(SERIALIZED_NAME_SCRIPT_DEMAND)
  private String scriptDemand = null;

  public static final String SERIALIZED_NAME_SPECIAL_TOPIC = "special_topic";
  @SerializedName(SERIALIZED_NAME_SPECIAL_TOPIC)
  private String specialTopic = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement detailDemand(String detailDemand) {
    
    this.detailDemand = detailDemand;
    return this;
  }

   /**
   * 
   * @return detailDemand
  **/
  @javax.annotation.Nullable
  public String getDetailDemand() {
    return detailDemand;
  }


  public void setDetailDemand(String detailDemand) {
    this.detailDemand = detailDemand;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement music(String music) {
    
    this.music = music;
    return this;
  }

   /**
   * 
   * @return music
  **/
  @javax.annotation.Nullable
  public String getMusic() {
    return music;
  }


  public void setMusic(String music) {
    this.music = music;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement otherDemand(String otherDemand) {
    
    this.otherDemand = otherDemand;
    return this;
  }

   /**
   * 
   * @return otherDemand
  **/
  @javax.annotation.Nullable
  public String getOtherDemand() {
    return otherDemand;
  }


  public void setOtherDemand(String otherDemand) {
    this.otherDemand = otherDemand;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement propDemand(String propDemand) {
    
    this.propDemand = propDemand;
    return this;
  }

   /**
   * 
   * @return propDemand
  **/
  @javax.annotation.Nullable
  public String getPropDemand() {
    return propDemand;
  }


  public void setPropDemand(String propDemand) {
    this.propDemand = propDemand;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement sceneDemand(String sceneDemand) {
    
    this.sceneDemand = sceneDemand;
    return this;
  }

   /**
   * 
   * @return sceneDemand
  **/
  @javax.annotation.Nullable
  public String getSceneDemand() {
    return sceneDemand;
  }


  public void setSceneDemand(String sceneDemand) {
    this.sceneDemand = sceneDemand;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement scriptDemand(String scriptDemand) {
    
    this.scriptDemand = scriptDemand;
    return this;
  }

   /**
   * 
   * @return scriptDemand
  **/
  @javax.annotation.Nullable
  public String getScriptDemand() {
    return scriptDemand;
  }


  public void setScriptDemand(String scriptDemand) {
    this.scriptDemand = scriptDemand;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement specialTopic(String specialTopic) {
    
    this.specialTopic = specialTopic;
    return this;
  }

   /**
   * 
   * @return specialTopic
  **/
  @javax.annotation.Nullable
  public String getSpecialTopic() {
    return specialTopic;
  }


  public void setSpecialTopic(String specialTopic) {
    this.specialTopic = specialTopic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement = (StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement) o;
    return Objects.equals(this.detailDemand, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.detailDemand) &&
        Objects.equals(this.music, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.music) &&
        Objects.equals(this.otherDemand, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.otherDemand) &&
        Objects.equals(this.propDemand, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.propDemand) &&
        Objects.equals(this.sceneDemand, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.sceneDemand) &&
        Objects.equals(this.scriptDemand, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.scriptDemand) &&
        Objects.equals(this.specialTopic, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.specialTopic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailDemand, music, otherDemand, propDemand, sceneDemand, scriptDemand, specialTopic);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement {\n");
    sb.append("    detailDemand: ").append(toIndentedString(detailDemand)).append("\n");
    sb.append("    music: ").append(toIndentedString(music)).append("\n");
    sb.append("    otherDemand: ").append(toIndentedString(otherDemand)).append("\n");
    sb.append("    propDemand: ").append(toIndentedString(propDemand)).append("\n");
    sb.append("    sceneDemand: ").append(toIndentedString(sceneDemand)).append("\n");
    sb.append("    scriptDemand: ").append(toIndentedString(scriptDemand)).append("\n");
    sb.append("    specialTopic: ").append(toIndentedString(specialTopic)).append("\n");
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
    openapiFields.add("detail_demand");
    openapiFields.add("music");
    openapiFields.add("other_demand");
    openapiFields.add("prop_demand");
    openapiFields.add("scene_demand");
    openapiFields.add("script_demand");
    openapiFields.add("special_topic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

