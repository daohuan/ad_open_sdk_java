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
import com.bytedance.ads.model.ProjectListV30DataListOptimizeGoalDeepExternalAction;
import com.bytedance.ads.model.ProjectListV30DataListOptimizeGoalExternalAction;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-26T12:10:18.554407341+08:00[PRC]")
public class ProjectListV30ResponseDataListInnerOptimizeGoal {
  public static final String SERIALIZED_NAME_ASSET_IDS = "asset_ids";
  @SerializedName(SERIALIZED_NAME_ASSET_IDS)
  private List<Long> assetIds = null;

  public static final String SERIALIZED_NAME_CONVERT_ID = "convert_id";
  @SerializedName(SERIALIZED_NAME_CONVERT_ID)
  private Long convertId = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private ProjectListV30DataListOptimizeGoalDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private ProjectListV30DataListOptimizeGoalExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_PAID_SWITCH = "paid_switch";
  @SerializedName(SERIALIZED_NAME_PAID_SWITCH)
  private Long paidSwitch = null;

  public ProjectListV30ResponseDataListInnerOptimizeGoal() {
  }

  public ProjectListV30ResponseDataListInnerOptimizeGoal assetIds(List<Long> assetIds) {
    
    this.assetIds = assetIds;
    return this;
  }

  public ProjectListV30ResponseDataListInnerOptimizeGoal addAssetIdsItem(Long assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * 
   * @return assetIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAssetIds() {
    return assetIds;
  }


  public void setAssetIds(List<Long> assetIds) {
    this.assetIds = assetIds;
  }


  public ProjectListV30ResponseDataListInnerOptimizeGoal convertId(Long convertId) {
    
    this.convertId = convertId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return convertId
  **/
  @javax.annotation.Nullable
  public Long getConvertId() {
    return convertId;
  }


  public void setConvertId(Long convertId) {
    this.convertId = convertId;
  }


  public ProjectListV30ResponseDataListInnerOptimizeGoal deepExternalAction(ProjectListV30DataListOptimizeGoalDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListOptimizeGoalDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(ProjectListV30DataListOptimizeGoalDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public ProjectListV30ResponseDataListInnerOptimizeGoal externalAction(ProjectListV30DataListOptimizeGoalExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListOptimizeGoalExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(ProjectListV30DataListOptimizeGoalExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public ProjectListV30ResponseDataListInnerOptimizeGoal paidSwitch(Long paidSwitch) {
    
    this.paidSwitch = paidSwitch;
    return this;
  }

   /**
   * 
   * @return paidSwitch
  **/
  @javax.annotation.Nullable
  public Long getPaidSwitch() {
    return paidSwitch;
  }


  public void setPaidSwitch(Long paidSwitch) {
    this.paidSwitch = paidSwitch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectListV30ResponseDataListInnerOptimizeGoal projectListV30ResponseDataListInnerOptimizeGoal = (ProjectListV30ResponseDataListInnerOptimizeGoal) o;
    return Objects.equals(this.assetIds, projectListV30ResponseDataListInnerOptimizeGoal.assetIds) &&
        Objects.equals(this.convertId, projectListV30ResponseDataListInnerOptimizeGoal.convertId) &&
        Objects.equals(this.deepExternalAction, projectListV30ResponseDataListInnerOptimizeGoal.deepExternalAction) &&
        Objects.equals(this.externalAction, projectListV30ResponseDataListInnerOptimizeGoal.externalAction) &&
        Objects.equals(this.paidSwitch, projectListV30ResponseDataListInnerOptimizeGoal.paidSwitch);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds, convertId, deepExternalAction, externalAction, paidSwitch);
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
    sb.append("class ProjectListV30ResponseDataListInnerOptimizeGoal {\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    convertId: ").append(toIndentedString(convertId)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    paidSwitch: ").append(toIndentedString(paidSwitch)).append("\n");
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
    openapiFields.add("asset_ids");
    openapiFields.add("convert_id");
    openapiFields.add("deep_external_action");
    openapiFields.add("external_action");
    openapiFields.add("paid_switch");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectListV30ResponseDataListInnerOptimizeGoal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectListV30ResponseDataListInnerOptimizeGoal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectListV30ResponseDataListInnerOptimizeGoal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectListV30ResponseDataListInnerOptimizeGoal.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectListV30ResponseDataListInnerOptimizeGoal>() {
           @Override
           public void write(JsonWriter out, ProjectListV30ResponseDataListInnerOptimizeGoal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectListV30ResponseDataListInnerOptimizeGoal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectListV30ResponseDataListInnerOptimizeGoal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectListV30ResponseDataListInnerOptimizeGoal
  * @throws IOException if the JSON string is invalid with respect to ProjectListV30ResponseDataListInnerOptimizeGoal
  */
  public static ProjectListV30ResponseDataListInnerOptimizeGoal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectListV30ResponseDataListInnerOptimizeGoal.class);
  }

 /**
  * Convert an instance of ProjectListV30ResponseDataListInnerOptimizeGoal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

