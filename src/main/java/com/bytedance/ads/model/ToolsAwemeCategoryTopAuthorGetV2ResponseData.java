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
import com.bytedance.ads.model.ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsAwemeCategoryTopAuthorGetV2ResponseData {
  public static final String SERIALIZED_NAME_AUTHORS = "authors";
  @SerializedName(SERIALIZED_NAME_AUTHORS)
  private List<ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner> authors = null;

  public ToolsAwemeCategoryTopAuthorGetV2ResponseData() {
  }

  public ToolsAwemeCategoryTopAuthorGetV2ResponseData authors(List<ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner> authors) {
    
    this.authors = authors;
    return this;
  }

  public ToolsAwemeCategoryTopAuthorGetV2ResponseData addAuthorsItem(ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * 
   * @return authors
  **/
  @javax.annotation.Nullable
  public List<ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner> getAuthors() {
    return authors;
  }


  public void setAuthors(List<ToolsAwemeCategoryTopAuthorGetV2ResponseDataAuthorsInner> authors) {
    this.authors = authors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeCategoryTopAuthorGetV2ResponseData toolsAwemeCategoryTopAuthorGetV2ResponseData = (ToolsAwemeCategoryTopAuthorGetV2ResponseData) o;
    return Objects.equals(this.authors, toolsAwemeCategoryTopAuthorGetV2ResponseData.authors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAwemeCategoryTopAuthorGetV2ResponseData {\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
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
    openapiFields.add("authors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeCategoryTopAuthorGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeCategoryTopAuthorGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeCategoryTopAuthorGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeCategoryTopAuthorGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeCategoryTopAuthorGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeCategoryTopAuthorGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeCategoryTopAuthorGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeCategoryTopAuthorGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeCategoryTopAuthorGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeCategoryTopAuthorGetV2ResponseData
  */
  public static ToolsAwemeCategoryTopAuthorGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeCategoryTopAuthorGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAwemeCategoryTopAuthorGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
