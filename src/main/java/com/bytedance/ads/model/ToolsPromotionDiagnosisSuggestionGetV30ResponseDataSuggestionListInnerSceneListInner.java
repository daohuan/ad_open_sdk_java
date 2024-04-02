/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListScene;
import com.bytedance.ads.model.ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner;
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
 * ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-02T10:29:10.457901230+08:00[PRC]")
public class ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner {
  public static final String SERIALIZED_NAME_SCENE = "scene";
  @SerializedName(SERIALIZED_NAME_SCENE)
  private ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListScene scene = null;

  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  private List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner> suggestions = null;

  public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner() {
  }

  public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner scene(ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListScene scene) {
    
    this.scene = scene;
    return this;
  }

   /**
   * Get scene
   * @return scene
  **/
  @javax.annotation.Nullable
  public ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListScene getScene() {
    return scene;
  }


  public void setScene(ToolsPromotionDiagnosisSuggestionGetV30DataSuggestionListSceneListScene scene) {
    this.scene = scene;
  }


  public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner suggestions(List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner> suggestions) {
    
    this.suggestions = suggestions;
    return this;
  }

  public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner addSuggestionsItem(ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * 
   * @return suggestions
  **/
  @javax.annotation.Nullable
  public List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner> getSuggestions() {
    return suggestions;
  }


  public void setSuggestions(List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInnerSuggestionsInner> suggestions) {
    this.suggestions = suggestions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner toolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner = (ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner) o;
    return Objects.equals(this.scene, toolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner.scene) &&
        Objects.equals(this.suggestions, toolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner.suggestions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(scene, suggestions);
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
    sb.append("class ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner {\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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
    openapiFields.add("scene");
    openapiFields.add("suggestions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner
  */
  public static ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInnerSceneListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

