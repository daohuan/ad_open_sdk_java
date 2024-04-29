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
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEventLink;
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
 * LinkEvent事件行为描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-29T14:08:00.024372024+08:00[PRC]")
public class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEventLink link = null;

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent() {
  }

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent link(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEventLink link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEventLink getLink() {
    return link;
  }


  public void setLink(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEventLink link) {
    this.link = link;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent = (ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent) o;
    return Objects.equals(this.link, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("link");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent
  */
  public static ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

