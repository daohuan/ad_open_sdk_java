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
import com.bytedance.ads.model.CreativeAutoGenerateConfigCreateV2ResponseDataErrorsInner;
import com.bytedance.ads.model.CreativeAutoGenerateConfigCreateV2ResponseDataTemplatesInner;
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
public class CreativeAutoGenerateConfigCreateV2ResponseData {
  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Long configId = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CreativeAutoGenerateConfigCreateV2ResponseDataErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<CreativeAutoGenerateConfigCreateV2ResponseDataTemplatesInner> templates = null;

  public CreativeAutoGenerateConfigCreateV2ResponseData() {
  }

  public CreativeAutoGenerateConfigCreateV2ResponseData configId(Long configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 配置ID
   * @return configId
  **/
  @javax.annotation.Nullable
  public Long getConfigId() {
    return configId;
  }


  public void setConfigId(Long configId) {
    this.configId = configId;
  }


  public CreativeAutoGenerateConfigCreateV2ResponseData errors(List<CreativeAutoGenerateConfigCreateV2ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public CreativeAutoGenerateConfigCreateV2ResponseData addErrorsItem(CreativeAutoGenerateConfigCreateV2ResponseDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 保存失败的模板列表
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<CreativeAutoGenerateConfigCreateV2ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<CreativeAutoGenerateConfigCreateV2ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }


  public CreativeAutoGenerateConfigCreateV2ResponseData templates(List<CreativeAutoGenerateConfigCreateV2ResponseDataTemplatesInner> templates) {
    
    this.templates = templates;
    return this;
  }

  public CreativeAutoGenerateConfigCreateV2ResponseData addTemplatesItem(CreativeAutoGenerateConfigCreateV2ResponseDataTemplatesInner templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * 保存成功的模板列表
   * @return templates
  **/
  @javax.annotation.Nullable
  public List<CreativeAutoGenerateConfigCreateV2ResponseDataTemplatesInner> getTemplates() {
    return templates;
  }


  public void setTemplates(List<CreativeAutoGenerateConfigCreateV2ResponseDataTemplatesInner> templates) {
    this.templates = templates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeAutoGenerateConfigCreateV2ResponseData creativeAutoGenerateConfigCreateV2ResponseData = (CreativeAutoGenerateConfigCreateV2ResponseData) o;
    return Objects.equals(this.configId, creativeAutoGenerateConfigCreateV2ResponseData.configId) &&
        Objects.equals(this.errors, creativeAutoGenerateConfigCreateV2ResponseData.errors) &&
        Objects.equals(this.templates, creativeAutoGenerateConfigCreateV2ResponseData.templates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, errors, templates);
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
    sb.append("class CreativeAutoGenerateConfigCreateV2ResponseData {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
    openapiFields.add("config_id");
    openapiFields.add("errors");
    openapiFields.add("templates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeAutoGenerateConfigCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeAutoGenerateConfigCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeAutoGenerateConfigCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeAutoGenerateConfigCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeAutoGenerateConfigCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, CreativeAutoGenerateConfigCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeAutoGenerateConfigCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeAutoGenerateConfigCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeAutoGenerateConfigCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to CreativeAutoGenerateConfigCreateV2ResponseData
  */
  public static CreativeAutoGenerateConfigCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeAutoGenerateConfigCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of CreativeAutoGenerateConfigCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

