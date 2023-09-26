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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * AgentFundTransferSeqCommitV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:40:12.070229191+08:00[PRC]")
public class AgentFundTransferSeqCommitV2Request {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_TRANSFER_SEQ = "transfer_seq";
  @SerializedName(SERIALIZED_NAME_TRANSFER_SEQ)
  private Long transferSeq = null;

  public AgentFundTransferSeqCommitV2Request() {
  }

  public AgentFundTransferSeqCommitV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商ID
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentFundTransferSeqCommitV2Request transferSeq(Long transferSeq) {
    
    this.transferSeq = transferSeq;
    return this;
  }

   /**
   * 转账流水号，第一步请求会返回
   * @return transferSeq
  **/
  @javax.annotation.Nonnull
  public Long getTransferSeq() {
    return transferSeq;
  }


  public void setTransferSeq(Long transferSeq) {
    this.transferSeq = transferSeq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentFundTransferSeqCommitV2Request agentFundTransferSeqCommitV2Request = (AgentFundTransferSeqCommitV2Request) o;
    return Objects.equals(this.agentId, agentFundTransferSeqCommitV2Request.agentId) &&
        Objects.equals(this.transferSeq, agentFundTransferSeqCommitV2Request.transferSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, transferSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentFundTransferSeqCommitV2Request {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    transferSeq: ").append(toIndentedString(transferSeq)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("transfer_seq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("transfer_seq");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentFundTransferSeqCommitV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentFundTransferSeqCommitV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentFundTransferSeqCommitV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentFundTransferSeqCommitV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentFundTransferSeqCommitV2Request>() {
           @Override
           public void write(JsonWriter out, AgentFundTransferSeqCommitV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentFundTransferSeqCommitV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentFundTransferSeqCommitV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentFundTransferSeqCommitV2Request
  * @throws IOException if the JSON string is invalid with respect to AgentFundTransferSeqCommitV2Request
  */
  public static AgentFundTransferSeqCommitV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentFundTransferSeqCommitV2Request.class);
  }

 /**
  * Convert an instance of AgentFundTransferSeqCommitV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

