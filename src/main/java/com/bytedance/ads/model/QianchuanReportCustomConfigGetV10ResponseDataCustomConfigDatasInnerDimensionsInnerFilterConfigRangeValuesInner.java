/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
 * QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner() {
  }

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner = (QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner) o;
    return Objects.equals(this.label, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner.label) &&
        Objects.equals(this.value, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
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
    sb.append("class QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner>() {
           @Override
           public void write(JsonWriter out, QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner
  */
  public static QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner.class);
  }

 /**
  * Convert an instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
