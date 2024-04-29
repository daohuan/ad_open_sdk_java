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
 * FileMaterialAttributesListV2ResponseDataMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class FileMaterialAttributesListV2ResponseDataMaterialsInner {
  public static final String SERIALIZED_NAME_AD_LOW_QUALITY_SUGGESTIONS = "ad_low_quality_suggestions";
  @SerializedName(SERIALIZED_NAME_AD_LOW_QUALITY_SUGGESTIONS)
  private List<String> adLowQualitySuggestions = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES_MODIFY_TIME = "attributes_modify_time";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES_MODIFY_TIME)
  private String attributesModifyTime = null;

  public static final String SERIALIZED_NAME_ECP_LOW_QUALITY_SUGGESTIONS = "ecp_low_quality_suggestions";
  @SerializedName(SERIALIZED_NAME_ECP_LOW_QUALITY_SUGGESTIONS)
  private List<String> ecpLowQualitySuggestions = null;

  public static final String SERIALIZED_NAME_IS_AD_HIGH_QUALITY_MATERIAL = "is_ad_high_quality_material";
  @SerializedName(SERIALIZED_NAME_IS_AD_HIGH_QUALITY_MATERIAL)
  private Boolean isAdHighQualityMaterial = null;

  public static final String SERIALIZED_NAME_IS_AD_LOW_QUALITY_MATERIAL = "is_ad_low_quality_material";
  @SerializedName(SERIALIZED_NAME_IS_AD_LOW_QUALITY_MATERIAL)
  private Boolean isAdLowQualityMaterial = null;

  public static final String SERIALIZED_NAME_IS_CARRY_MATERIAL = "is_carry_material";
  @SerializedName(SERIALIZED_NAME_IS_CARRY_MATERIAL)
  private Boolean isCarryMaterial = null;

  public static final String SERIALIZED_NAME_IS_ECP_HIGH_QUALITY_MATERIAL = "is_ecp_high_quality_material";
  @SerializedName(SERIALIZED_NAME_IS_ECP_HIGH_QUALITY_MATERIAL)
  private Boolean isEcpHighQualityMaterial = null;

  public static final String SERIALIZED_NAME_IS_ECP_LOW_QUALITY_MATERIAL = "is_ecp_low_quality_material";
  @SerializedName(SERIALIZED_NAME_IS_ECP_LOW_QUALITY_MATERIAL)
  private Boolean isEcpLowQualityMaterial = null;

  public static final String SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL = "is_first_publish_material";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL)
  private Boolean isFirstPublishMaterial = null;

  public static final String SERIALIZED_NAME_IS_INEFFICIENT_MATERIAL = "is_inefficient_material";
  @SerializedName(SERIALIZED_NAME_IS_INEFFICIENT_MATERIAL)
  private Boolean isInefficientMaterial = null;

  public static final String SERIALIZED_NAME_IS_SIMILAR_EXPECTED_QUEUE_MATERIAL = "is_similar_expected_queue_material";
  @SerializedName(SERIALIZED_NAME_IS_SIMILAR_EXPECTED_QUEUE_MATERIAL)
  private Boolean isSimilarExpectedQueueMaterial = null;

  public static final String SERIALIZED_NAME_IS_SIMILAR_MATERIAL = "is_similar_material";
  @SerializedName(SERIALIZED_NAME_IS_SIMILAR_MATERIAL)
  private Boolean isSimilarMaterial = null;

  public static final String SERIALIZED_NAME_IS_SIMILAR_QUEUE_MATERIAL = "is_similar_queue_material";
  @SerializedName(SERIALIZED_NAME_IS_SIMILAR_QUEUE_MATERIAL)
  private Boolean isSimilarQueueMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public FileMaterialAttributesListV2ResponseDataMaterialsInner() {
  }

  public FileMaterialAttributesListV2ResponseDataMaterialsInner adLowQualitySuggestions(List<String> adLowQualitySuggestions) {
    
    this.adLowQualitySuggestions = adLowQualitySuggestions;
    return this;
  }

  public FileMaterialAttributesListV2ResponseDataMaterialsInner addAdLowQualitySuggestionsItem(String adLowQualitySuggestionsItem) {
    if (this.adLowQualitySuggestions == null) {
      this.adLowQualitySuggestions = new ArrayList<>();
    }
    this.adLowQualitySuggestions.add(adLowQualitySuggestionsItem);
    return this;
  }

   /**
   * 当该素材为AD低质素材时，返回低质原因
   * @return adLowQualitySuggestions
  **/
  @javax.annotation.Nullable
  public List<String> getAdLowQualitySuggestions() {
    return adLowQualitySuggestions;
  }


  public void setAdLowQualitySuggestions(List<String> adLowQualitySuggestions) {
    this.adLowQualitySuggestions = adLowQualitySuggestions;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner attributesModifyTime(String attributesModifyTime) {
    
    this.attributesModifyTime = attributesModifyTime;
    return this;
  }

   /**
   * 
   * @return attributesModifyTime
  **/
  @javax.annotation.Nullable
  public String getAttributesModifyTime() {
    return attributesModifyTime;
  }


  public void setAttributesModifyTime(String attributesModifyTime) {
    this.attributesModifyTime = attributesModifyTime;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner ecpLowQualitySuggestions(List<String> ecpLowQualitySuggestions) {
    
    this.ecpLowQualitySuggestions = ecpLowQualitySuggestions;
    return this;
  }

  public FileMaterialAttributesListV2ResponseDataMaterialsInner addEcpLowQualitySuggestionsItem(String ecpLowQualitySuggestionsItem) {
    if (this.ecpLowQualitySuggestions == null) {
      this.ecpLowQualitySuggestions = new ArrayList<>();
    }
    this.ecpLowQualitySuggestions.add(ecpLowQualitySuggestionsItem);
    return this;
  }

   /**
   * 当该素材为千川低质素材时，返回低质原因
   * @return ecpLowQualitySuggestions
  **/
  @javax.annotation.Nullable
  public List<String> getEcpLowQualitySuggestions() {
    return ecpLowQualitySuggestions;
  }


  public void setEcpLowQualitySuggestions(List<String> ecpLowQualitySuggestions) {
    this.ecpLowQualitySuggestions = ecpLowQualitySuggestions;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isAdHighQualityMaterial(Boolean isAdHighQualityMaterial) {
    
    this.isAdHighQualityMaterial = isAdHighQualityMaterial;
    return this;
  }

   /**
   * 是否AD优质素材
   * @return isAdHighQualityMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsAdHighQualityMaterial() {
    return isAdHighQualityMaterial;
  }


  public void setIsAdHighQualityMaterial(Boolean isAdHighQualityMaterial) {
    this.isAdHighQualityMaterial = isAdHighQualityMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isAdLowQualityMaterial(Boolean isAdLowQualityMaterial) {
    
    this.isAdLowQualityMaterial = isAdLowQualityMaterial;
    return this;
  }

   /**
   * 是否AD低质素材
   * @return isAdLowQualityMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsAdLowQualityMaterial() {
    return isAdLowQualityMaterial;
  }


  public void setIsAdLowQualityMaterial(Boolean isAdLowQualityMaterial) {
    this.isAdLowQualityMaterial = isAdLowQualityMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isCarryMaterial(Boolean isCarryMaterial) {
    
    this.isCarryMaterial = isCarryMaterial;
    return this;
  }

   /**
   * 是否存在搬运风险，建议入参account_type &#x3D; AD 或 QIANCHUAN查询
   * @return isCarryMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsCarryMaterial() {
    return isCarryMaterial;
  }


  public void setIsCarryMaterial(Boolean isCarryMaterial) {
    this.isCarryMaterial = isCarryMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isEcpHighQualityMaterial(Boolean isEcpHighQualityMaterial) {
    
    this.isEcpHighQualityMaterial = isEcpHighQualityMaterial;
    return this;
  }

   /**
   * 是否千川优质素材
   * @return isEcpHighQualityMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsEcpHighQualityMaterial() {
    return isEcpHighQualityMaterial;
  }


  public void setIsEcpHighQualityMaterial(Boolean isEcpHighQualityMaterial) {
    this.isEcpHighQualityMaterial = isEcpHighQualityMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isEcpLowQualityMaterial(Boolean isEcpLowQualityMaterial) {
    
    this.isEcpLowQualityMaterial = isEcpLowQualityMaterial;
    return this;
  }

   /**
   * 是否千川低质素材
   * @return isEcpLowQualityMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsEcpLowQualityMaterial() {
    return isEcpLowQualityMaterial;
  }


  public void setIsEcpLowQualityMaterial(Boolean isEcpLowQualityMaterial) {
    this.isEcpLowQualityMaterial = isEcpLowQualityMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isFirstPublishMaterial(Boolean isFirstPublishMaterial) {
    
    this.isFirstPublishMaterial = isFirstPublishMaterial;
    return this;
  }

   /**
   * 是否是首发素材
   * @return isFirstPublishMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsFirstPublishMaterial() {
    return isFirstPublishMaterial;
  }


  public void setIsFirstPublishMaterial(Boolean isFirstPublishMaterial) {
    this.isFirstPublishMaterial = isFirstPublishMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isInefficientMaterial(Boolean isInefficientMaterial) {
    
    this.isInefficientMaterial = isInefficientMaterial;
    return this;
  }

   /**
   * 是否低效素材
   * @return isInefficientMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsInefficientMaterial() {
    return isInefficientMaterial;
  }


  public void setIsInefficientMaterial(Boolean isInefficientMaterial) {
    this.isInefficientMaterial = isInefficientMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isSimilarExpectedQueueMaterial(Boolean isSimilarExpectedQueueMaterial) {
    
    this.isSimilarExpectedQueueMaterial = isSimilarExpectedQueueMaterial;
    return this;
  }

   /**
   * 是否同质化素材风险-未投放预计排队素材 - 方舟/纵横不支持
   * @return isSimilarExpectedQueueMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsSimilarExpectedQueueMaterial() {
    return isSimilarExpectedQueueMaterial;
  }


  public void setIsSimilarExpectedQueueMaterial(Boolean isSimilarExpectedQueueMaterial) {
    this.isSimilarExpectedQueueMaterial = isSimilarExpectedQueueMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isSimilarMaterial(Boolean isSimilarMaterial) {
    
    this.isSimilarMaterial = isSimilarMaterial;
    return this;
  }

   /**
   * 是否同质化挤压严重素材 - 方舟/纵横不支持
   * @return isSimilarMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsSimilarMaterial() {
    return isSimilarMaterial;
  }


  public void setIsSimilarMaterial(Boolean isSimilarMaterial) {
    this.isSimilarMaterial = isSimilarMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner isSimilarQueueMaterial(Boolean isSimilarQueueMaterial) {
    
    this.isSimilarQueueMaterial = isSimilarQueueMaterial;
    return this;
  }

   /**
   * 是否同质化素材风险-排队投放素材 - 方舟/纵横不支持
   * @return isSimilarQueueMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsSimilarQueueMaterial() {
    return isSimilarQueueMaterial;
  }


  public void setIsSimilarQueueMaterial(Boolean isSimilarQueueMaterial) {
    this.isSimilarQueueMaterial = isSimilarQueueMaterial;
  }


  public FileMaterialAttributesListV2ResponseDataMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材id
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMaterialAttributesListV2ResponseDataMaterialsInner fileMaterialAttributesListV2ResponseDataMaterialsInner = (FileMaterialAttributesListV2ResponseDataMaterialsInner) o;
    return Objects.equals(this.adLowQualitySuggestions, fileMaterialAttributesListV2ResponseDataMaterialsInner.adLowQualitySuggestions) &&
        Objects.equals(this.attributesModifyTime, fileMaterialAttributesListV2ResponseDataMaterialsInner.attributesModifyTime) &&
        Objects.equals(this.ecpLowQualitySuggestions, fileMaterialAttributesListV2ResponseDataMaterialsInner.ecpLowQualitySuggestions) &&
        Objects.equals(this.isAdHighQualityMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isAdHighQualityMaterial) &&
        Objects.equals(this.isAdLowQualityMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isAdLowQualityMaterial) &&
        Objects.equals(this.isCarryMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isCarryMaterial) &&
        Objects.equals(this.isEcpHighQualityMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isEcpHighQualityMaterial) &&
        Objects.equals(this.isEcpLowQualityMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isEcpLowQualityMaterial) &&
        Objects.equals(this.isFirstPublishMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isFirstPublishMaterial) &&
        Objects.equals(this.isInefficientMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isInefficientMaterial) &&
        Objects.equals(this.isSimilarExpectedQueueMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isSimilarExpectedQueueMaterial) &&
        Objects.equals(this.isSimilarMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isSimilarMaterial) &&
        Objects.equals(this.isSimilarQueueMaterial, fileMaterialAttributesListV2ResponseDataMaterialsInner.isSimilarQueueMaterial) &&
        Objects.equals(this.materialId, fileMaterialAttributesListV2ResponseDataMaterialsInner.materialId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLowQualitySuggestions, attributesModifyTime, ecpLowQualitySuggestions, isAdHighQualityMaterial, isAdLowQualityMaterial, isCarryMaterial, isEcpHighQualityMaterial, isEcpLowQualityMaterial, isFirstPublishMaterial, isInefficientMaterial, isSimilarExpectedQueueMaterial, isSimilarMaterial, isSimilarQueueMaterial, materialId);
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
    sb.append("class FileMaterialAttributesListV2ResponseDataMaterialsInner {\n");
    sb.append("    adLowQualitySuggestions: ").append(toIndentedString(adLowQualitySuggestions)).append("\n");
    sb.append("    attributesModifyTime: ").append(toIndentedString(attributesModifyTime)).append("\n");
    sb.append("    ecpLowQualitySuggestions: ").append(toIndentedString(ecpLowQualitySuggestions)).append("\n");
    sb.append("    isAdHighQualityMaterial: ").append(toIndentedString(isAdHighQualityMaterial)).append("\n");
    sb.append("    isAdLowQualityMaterial: ").append(toIndentedString(isAdLowQualityMaterial)).append("\n");
    sb.append("    isCarryMaterial: ").append(toIndentedString(isCarryMaterial)).append("\n");
    sb.append("    isEcpHighQualityMaterial: ").append(toIndentedString(isEcpHighQualityMaterial)).append("\n");
    sb.append("    isEcpLowQualityMaterial: ").append(toIndentedString(isEcpLowQualityMaterial)).append("\n");
    sb.append("    isFirstPublishMaterial: ").append(toIndentedString(isFirstPublishMaterial)).append("\n");
    sb.append("    isInefficientMaterial: ").append(toIndentedString(isInefficientMaterial)).append("\n");
    sb.append("    isSimilarExpectedQueueMaterial: ").append(toIndentedString(isSimilarExpectedQueueMaterial)).append("\n");
    sb.append("    isSimilarMaterial: ").append(toIndentedString(isSimilarMaterial)).append("\n");
    sb.append("    isSimilarQueueMaterial: ").append(toIndentedString(isSimilarQueueMaterial)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("ad_low_quality_suggestions");
    openapiFields.add("attributes_modify_time");
    openapiFields.add("ecp_low_quality_suggestions");
    openapiFields.add("is_ad_high_quality_material");
    openapiFields.add("is_ad_low_quality_material");
    openapiFields.add("is_carry_material");
    openapiFields.add("is_ecp_high_quality_material");
    openapiFields.add("is_ecp_low_quality_material");
    openapiFields.add("is_first_publish_material");
    openapiFields.add("is_inefficient_material");
    openapiFields.add("is_similar_expected_queue_material");
    openapiFields.add("is_similar_material");
    openapiFields.add("is_similar_queue_material");
    openapiFields.add("material_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialAttributesListV2ResponseDataMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialAttributesListV2ResponseDataMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialAttributesListV2ResponseDataMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialAttributesListV2ResponseDataMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialAttributesListV2ResponseDataMaterialsInner>() {
           @Override
           public void write(JsonWriter out, FileMaterialAttributesListV2ResponseDataMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialAttributesListV2ResponseDataMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialAttributesListV2ResponseDataMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialAttributesListV2ResponseDataMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to FileMaterialAttributesListV2ResponseDataMaterialsInner
  */
  public static FileMaterialAttributesListV2ResponseDataMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialAttributesListV2ResponseDataMaterialsInner.class);
  }

 /**
  * Convert an instance of FileMaterialAttributesListV2ResponseDataMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

