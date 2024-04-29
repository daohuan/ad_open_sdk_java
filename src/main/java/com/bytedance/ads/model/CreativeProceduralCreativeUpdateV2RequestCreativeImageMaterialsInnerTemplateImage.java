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
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImageTemplateDataListInner;
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
public class CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage {
  public static final String SERIALIZED_NAME_TEMPLATE_DATA_LIST = "template_data_list";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_DATA_LIST)
  private List<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImageTemplateDataListInner> templateDataList = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId = null;

  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage() {
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage templateDataList(List<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImageTemplateDataListInner> templateDataList) {
    
    this.templateDataList = templateDataList;
    return this;
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage addTemplateDataListItem(CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImageTemplateDataListInner templateDataListItem) {
    if (this.templateDataList == null) {
      this.templateDataList = new ArrayList<>();
    }
    this.templateDataList.add(templateDataListItem);
    return this;
  }

   /**
   * 
   * @return templateDataList
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImageTemplateDataListInner> getTemplateDataList() {
    return templateDataList;
  }


  public void setTemplateDataList(List<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImageTemplateDataListInner> templateDataList) {
    this.templateDataList = templateDataList;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @javax.annotation.Nonnull
  public Long getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage creativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage = (CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage) o;
    return Objects.equals(this.templateDataList, creativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage.templateDataList) &&
        Objects.equals(this.templateId, creativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateDataList, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage {\n");
    sb.append("    templateDataList: ").append(toIndentedString(templateDataList)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("template_data_list");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("template_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage
  */
  public static CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeUpdateV2RequestCreativeImageMaterialsInnerTemplateImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

