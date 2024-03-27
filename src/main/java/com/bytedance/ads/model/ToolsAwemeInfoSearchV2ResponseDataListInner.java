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
import com.bytedance.ads.model.ToolsAwemeInfoSearchV2ResponseDataListInnerAuthorsInner;
import com.bytedance.ads.model.ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner;
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
 * ToolsAwemeInfoSearchV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolsAwemeInfoSearchV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUTHORS = "authors";
  @SerializedName(SERIALIZED_NAME_AUTHORS)
  private List<ToolsAwemeInfoSearchV2ResponseDataListInnerAuthorsInner> authors = null;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner> categories = null;

  public ToolsAwemeInfoSearchV2ResponseDataListInner() {
  }

  public ToolsAwemeInfoSearchV2ResponseDataListInner authors(List<ToolsAwemeInfoSearchV2ResponseDataListInnerAuthorsInner> authors) {
    
    this.authors = authors;
    return this;
  }

  public ToolsAwemeInfoSearchV2ResponseDataListInner addAuthorsItem(ToolsAwemeInfoSearchV2ResponseDataListInnerAuthorsInner authorsItem) {
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
  public List<ToolsAwemeInfoSearchV2ResponseDataListInnerAuthorsInner> getAuthors() {
    return authors;
  }


  public void setAuthors(List<ToolsAwemeInfoSearchV2ResponseDataListInnerAuthorsInner> authors) {
    this.authors = authors;
  }


  public ToolsAwemeInfoSearchV2ResponseDataListInner categories(List<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner> categories) {
    
    this.categories = categories;
    return this;
  }

  public ToolsAwemeInfoSearchV2ResponseDataListInner addCategoriesItem(ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * 
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner> getCategories() {
    return categories;
  }


  public void setCategories(List<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner> categories) {
    this.categories = categories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeInfoSearchV2ResponseDataListInner toolsAwemeInfoSearchV2ResponseDataListInner = (ToolsAwemeInfoSearchV2ResponseDataListInner) o;
    return Objects.equals(this.authors, toolsAwemeInfoSearchV2ResponseDataListInner.authors) &&
        Objects.equals(this.categories, toolsAwemeInfoSearchV2ResponseDataListInner.categories);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors, categories);
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
    sb.append("class ToolsAwemeInfoSearchV2ResponseDataListInner {\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    openapiFields.add("categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeInfoSearchV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeInfoSearchV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeInfoSearchV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeInfoSearchV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeInfoSearchV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeInfoSearchV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeInfoSearchV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeInfoSearchV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeInfoSearchV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeInfoSearchV2ResponseDataListInner
  */
  public static ToolsAwemeInfoSearchV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeInfoSearchV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeInfoSearchV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

