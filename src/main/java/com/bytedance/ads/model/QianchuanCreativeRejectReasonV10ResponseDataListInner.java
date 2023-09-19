/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner;
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
 * QianchuanCreativeRejectReasonV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class QianchuanCreativeRejectReasonV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUDIT_RECORDS = "audit_records";
  @SerializedName(SERIALIZED_NAME_AUDIT_RECORDS)
  private List<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner> auditRecords = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public QianchuanCreativeRejectReasonV10ResponseDataListInner() {
  }

  public QianchuanCreativeRejectReasonV10ResponseDataListInner auditRecords(List<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner> auditRecords) {
    
    this.auditRecords = auditRecords;
    return this;
  }

  public QianchuanCreativeRejectReasonV10ResponseDataListInner addAuditRecordsItem(QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner auditRecordsItem) {
    if (this.auditRecords == null) {
      this.auditRecords = new ArrayList<>();
    }
    this.auditRecords.add(auditRecordsItem);
    return this;
  }

   /**
   * 
   * @return auditRecords
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner> getAuditRecords() {
    return auditRecords;
  }


  public void setAuditRecords(List<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner> auditRecords) {
    this.auditRecords = auditRecords;
  }


  public QianchuanCreativeRejectReasonV10ResponseDataListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCreativeRejectReasonV10ResponseDataListInner qianchuanCreativeRejectReasonV10ResponseDataListInner = (QianchuanCreativeRejectReasonV10ResponseDataListInner) o;
    return Objects.equals(this.auditRecords, qianchuanCreativeRejectReasonV10ResponseDataListInner.auditRecords) &&
        Objects.equals(this.creativeId, qianchuanCreativeRejectReasonV10ResponseDataListInner.creativeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditRecords, creativeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanCreativeRejectReasonV10ResponseDataListInner {\n");
    sb.append("    auditRecords: ").append(toIndentedString(auditRecords)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
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
    openapiFields.add("audit_records");
    openapiFields.add("creative_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCreativeRejectReasonV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCreativeRejectReasonV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCreativeRejectReasonV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCreativeRejectReasonV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCreativeRejectReasonV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanCreativeRejectReasonV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCreativeRejectReasonV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCreativeRejectReasonV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCreativeRejectReasonV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanCreativeRejectReasonV10ResponseDataListInner
  */
  public static QianchuanCreativeRejectReasonV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCreativeRejectReasonV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanCreativeRejectReasonV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
