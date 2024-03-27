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


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionListV30DataListMaterialScoreInfoScoreNumOfMaterial;
import com.bytedance.ads.model.PromotionListV30DataListMaterialScoreInfoScoreTypeOfMaterial;
import com.bytedance.ads.model.PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerMaterialScoreInfoLowQualityMaterialList;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class PromotionListV30ResponseDataListInnerMaterialScoreInfo {
  public static final String SERIALIZED_NAME_LOW_QUALITY_MATERIAL_LIST = "low_quality_material_list";
  @SerializedName(SERIALIZED_NAME_LOW_QUALITY_MATERIAL_LIST)
  private PromotionListV30ResponseDataListInnerMaterialScoreInfoLowQualityMaterialList lowQualityMaterialList = null;

  public static final String SERIALIZED_NAME_MATERIAL_ADVICE = "material_advice";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ADVICE)
  private List<String> materialAdvice = null;

  public static final String SERIALIZED_NAME_SCORE_NUM_OF_MATERIAL = "score_num_of_material";
  @SerializedName(SERIALIZED_NAME_SCORE_NUM_OF_MATERIAL)
  private PromotionListV30DataListMaterialScoreInfoScoreNumOfMaterial scoreNumOfMaterial = null;

  public static final String SERIALIZED_NAME_SCORE_TYPE_OF_MATERIAL = "score_type_of_material";
  @SerializedName(SERIALIZED_NAME_SCORE_TYPE_OF_MATERIAL)
  private PromotionListV30DataListMaterialScoreInfoScoreTypeOfMaterial scoreTypeOfMaterial = null;

  public static final String SERIALIZED_NAME_SCORE_VALUE_OF_MATERIAL = "score_value_of_material";
  @SerializedName(SERIALIZED_NAME_SCORE_VALUE_OF_MATERIAL)
  private PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial scoreValueOfMaterial = null;

  public PromotionListV30ResponseDataListInnerMaterialScoreInfo() {
  }

  public PromotionListV30ResponseDataListInnerMaterialScoreInfo lowQualityMaterialList(PromotionListV30ResponseDataListInnerMaterialScoreInfoLowQualityMaterialList lowQualityMaterialList) {
    
    this.lowQualityMaterialList = lowQualityMaterialList;
    return this;
  }

   /**
   * Get lowQualityMaterialList
   * @return lowQualityMaterialList
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataListInnerMaterialScoreInfoLowQualityMaterialList getLowQualityMaterialList() {
    return lowQualityMaterialList;
  }


  public void setLowQualityMaterialList(PromotionListV30ResponseDataListInnerMaterialScoreInfoLowQualityMaterialList lowQualityMaterialList) {
    this.lowQualityMaterialList = lowQualityMaterialList;
  }


  public PromotionListV30ResponseDataListInnerMaterialScoreInfo materialAdvice(List<String> materialAdvice) {
    
    this.materialAdvice = materialAdvice;
    return this;
  }

  public PromotionListV30ResponseDataListInnerMaterialScoreInfo addMaterialAdviceItem(String materialAdviceItem) {
    if (this.materialAdvice == null) {
      this.materialAdvice = new ArrayList<>();
    }
    this.materialAdvice.add(materialAdviceItem);
    return this;
  }

   /**
   * 
   * @return materialAdvice
  **/
  @javax.annotation.Nullable
  public List<String> getMaterialAdvice() {
    return materialAdvice;
  }


  public void setMaterialAdvice(List<String> materialAdvice) {
    this.materialAdvice = materialAdvice;
  }


  public PromotionListV30ResponseDataListInnerMaterialScoreInfo scoreNumOfMaterial(PromotionListV30DataListMaterialScoreInfoScoreNumOfMaterial scoreNumOfMaterial) {
    
    this.scoreNumOfMaterial = scoreNumOfMaterial;
    return this;
  }

   /**
   * Get scoreNumOfMaterial
   * @return scoreNumOfMaterial
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListMaterialScoreInfoScoreNumOfMaterial getScoreNumOfMaterial() {
    return scoreNumOfMaterial;
  }


  public void setScoreNumOfMaterial(PromotionListV30DataListMaterialScoreInfoScoreNumOfMaterial scoreNumOfMaterial) {
    this.scoreNumOfMaterial = scoreNumOfMaterial;
  }


  public PromotionListV30ResponseDataListInnerMaterialScoreInfo scoreTypeOfMaterial(PromotionListV30DataListMaterialScoreInfoScoreTypeOfMaterial scoreTypeOfMaterial) {
    
    this.scoreTypeOfMaterial = scoreTypeOfMaterial;
    return this;
  }

   /**
   * Get scoreTypeOfMaterial
   * @return scoreTypeOfMaterial
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListMaterialScoreInfoScoreTypeOfMaterial getScoreTypeOfMaterial() {
    return scoreTypeOfMaterial;
  }


  public void setScoreTypeOfMaterial(PromotionListV30DataListMaterialScoreInfoScoreTypeOfMaterial scoreTypeOfMaterial) {
    this.scoreTypeOfMaterial = scoreTypeOfMaterial;
  }


  public PromotionListV30ResponseDataListInnerMaterialScoreInfo scoreValueOfMaterial(PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial scoreValueOfMaterial) {
    
    this.scoreValueOfMaterial = scoreValueOfMaterial;
    return this;
  }

   /**
   * Get scoreValueOfMaterial
   * @return scoreValueOfMaterial
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial getScoreValueOfMaterial() {
    return scoreValueOfMaterial;
  }


  public void setScoreValueOfMaterial(PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial scoreValueOfMaterial) {
    this.scoreValueOfMaterial = scoreValueOfMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInnerMaterialScoreInfo promotionListV30ResponseDataListInnerMaterialScoreInfo = (PromotionListV30ResponseDataListInnerMaterialScoreInfo) o;
    return Objects.equals(this.lowQualityMaterialList, promotionListV30ResponseDataListInnerMaterialScoreInfo.lowQualityMaterialList) &&
        Objects.equals(this.materialAdvice, promotionListV30ResponseDataListInnerMaterialScoreInfo.materialAdvice) &&
        Objects.equals(this.scoreNumOfMaterial, promotionListV30ResponseDataListInnerMaterialScoreInfo.scoreNumOfMaterial) &&
        Objects.equals(this.scoreTypeOfMaterial, promotionListV30ResponseDataListInnerMaterialScoreInfo.scoreTypeOfMaterial) &&
        Objects.equals(this.scoreValueOfMaterial, promotionListV30ResponseDataListInnerMaterialScoreInfo.scoreValueOfMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowQualityMaterialList, materialAdvice, scoreNumOfMaterial, scoreTypeOfMaterial, scoreValueOfMaterial);
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
    sb.append("class PromotionListV30ResponseDataListInnerMaterialScoreInfo {\n");
    sb.append("    lowQualityMaterialList: ").append(toIndentedString(lowQualityMaterialList)).append("\n");
    sb.append("    materialAdvice: ").append(toIndentedString(materialAdvice)).append("\n");
    sb.append("    scoreNumOfMaterial: ").append(toIndentedString(scoreNumOfMaterial)).append("\n");
    sb.append("    scoreTypeOfMaterial: ").append(toIndentedString(scoreTypeOfMaterial)).append("\n");
    sb.append("    scoreValueOfMaterial: ").append(toIndentedString(scoreValueOfMaterial)).append("\n");
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
    openapiFields.add("low_quality_material_list");
    openapiFields.add("material_advice");
    openapiFields.add("score_num_of_material");
    openapiFields.add("score_type_of_material");
    openapiFields.add("score_value_of_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerMaterialScoreInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerMaterialScoreInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerMaterialScoreInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerMaterialScoreInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerMaterialScoreInfo>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerMaterialScoreInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerMaterialScoreInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerMaterialScoreInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerMaterialScoreInfo
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerMaterialScoreInfo
  */
  public static PromotionListV30ResponseDataListInnerMaterialScoreInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerMaterialScoreInfo.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerMaterialScoreInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

