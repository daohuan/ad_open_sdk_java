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


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfOceanEngine;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf {
  public static final String SERIALIZED_NAME_DOU_PLUS = "dou_plus";
  @SerializedName(SERIALIZED_NAME_DOU_PLUS)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus douPlus = null;

  public static final String SERIALIZED_NAME_OCEAN_ENGINE = "ocean_engine";
  @SerializedName(SERIALIZED_NAME_OCEAN_ENGINE)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfOceanEngine oceanEngine = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf douPlus(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus douPlus) {
    
    this.douPlus = douPlus;
    return this;
  }

   /**
   * Get douPlus
   * @return douPlus
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus getDouPlus() {
    return douPlus;
  }


  public void setDouPlus(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfDouPlus douPlus) {
    this.douPlus = douPlus;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf oceanEngine(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfOceanEngine oceanEngine) {
    
    this.oceanEngine = oceanEngine;
    return this;
  }

   /**
   * Get oceanEngine
   * @return oceanEngine
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfOceanEngine getOceanEngine() {
    return oceanEngine;
  }


  public void setOceanEngine(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConfOceanEngine oceanEngine) {
    this.oceanEngine = oceanEngine;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf = (StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf) o;
    return Objects.equals(this.douPlus, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf.douPlus) &&
        Objects.equals(this.oceanEngine, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf.oceanEngine);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(douPlus, oceanEngine);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf {\n");
    sb.append("    douPlus: ").append(toIndentedString(douPlus)).append("\n");
    sb.append("    oceanEngine: ").append(toIndentedString(oceanEngine)).append("\n");
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
    openapiFields.add("dou_plus");
    openapiFields.add("ocean_engine");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

