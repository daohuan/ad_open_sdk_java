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
import com.bytedance.ads.model.ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInner;
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
 * ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInner> children = null;

  public static final String SERIALIZED_NAME_COVER_NUM_STR = "cover_num_str";
  @SerializedName(SERIALIZED_NAME_COVER_NUM_STR)
  private String coverNumStr = null;

  public static final String SERIALIZED_NAME_FANS_NUM_STR = "fans_num_str";
  @SerializedName(SERIALIZED_NAME_FANS_NUM_STR)
  private String fansNumStr = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner() {
  }

  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner children(List<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner addChildrenItem(ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInner childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * 
   * @return children
  **/
  @javax.annotation.Nullable
  public List<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInner> getChildren() {
    return children;
  }


  public void setChildren(List<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInnerChildrenInner> children) {
    this.children = children;
  }


  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner coverNumStr(String coverNumStr) {
    
    this.coverNumStr = coverNumStr;
    return this;
  }

   /**
   * 
   * @return coverNumStr
  **/
  @javax.annotation.Nullable
  public String getCoverNumStr() {
    return coverNumStr;
  }


  public void setCoverNumStr(String coverNumStr) {
    this.coverNumStr = coverNumStr;
  }


  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner fansNumStr(String fansNumStr) {
    
    this.fansNumStr = fansNumStr;
    return this;
  }

   /**
   * 
   * @return fansNumStr
  **/
  @javax.annotation.Nullable
  public String getFansNumStr() {
    return fansNumStr;
  }


  public void setFansNumStr(String fansNumStr) {
    this.fansNumStr = fansNumStr;
  }


  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner value(String value) {
    
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
    ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner = (ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner) o;
    return Objects.equals(this.children, toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner.children) &&
        Objects.equals(this.coverNumStr, toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner.coverNumStr) &&
        Objects.equals(this.fansNumStr, toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner.fansNumStr) &&
        Objects.equals(this.id, toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner.id) &&
        Objects.equals(this.value, toolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, coverNumStr, fansNumStr, id, value);
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
    sb.append("class ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    coverNumStr: ").append(toIndentedString(coverNumStr)).append("\n");
    sb.append("    fansNumStr: ").append(toIndentedString(fansNumStr)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("children");
    openapiFields.add("cover_num_str");
    openapiFields.add("fans_num_str");
    openapiFields.add("id");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner
  */
  public static ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeInfoSearchV2ResponseDataListInnerCategoriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
