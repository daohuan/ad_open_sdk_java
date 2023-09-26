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
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataCreativeListPromotionCardMaterialButtonSmartOptimization;
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
public class QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial {
  public static final String SERIALIZED_NAME_ACTION_BUTTON = "action_button";
  @SerializedName(SERIALIZED_NAME_ACTION_BUTTON)
  private String actionButton = null;

  public static final String SERIALIZED_NAME_BUTTON_SMART_OPTIMIZATION = "button_smart_optimization";
  @SerializedName(SERIALIZED_NAME_BUTTON_SMART_OPTIMIZATION)
  private QianchuanAdDetailGetV10DataCreativeListPromotionCardMaterialButtonSmartOptimization buttonSmartOptimization = null;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_SELLING_POINTS = "selling_points";
  @SerializedName(SERIALIZED_NAME_SELLING_POINTS)
  private List<String> sellingPoints = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial() {
  }

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial actionButton(String actionButton) {
    
    this.actionButton = actionButton;
    return this;
  }

   /**
   * 
   * @return actionButton
  **/
  @javax.annotation.Nullable
  public String getActionButton() {
    return actionButton;
  }


  public void setActionButton(String actionButton) {
    this.actionButton = actionButton;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial buttonSmartOptimization(QianchuanAdDetailGetV10DataCreativeListPromotionCardMaterialButtonSmartOptimization buttonSmartOptimization) {
    
    this.buttonSmartOptimization = buttonSmartOptimization;
    return this;
  }

   /**
   * Get buttonSmartOptimization
   * @return buttonSmartOptimization
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataCreativeListPromotionCardMaterialButtonSmartOptimization getButtonSmartOptimization() {
    return buttonSmartOptimization;
  }


  public void setButtonSmartOptimization(QianchuanAdDetailGetV10DataCreativeListPromotionCardMaterialButtonSmartOptimization buttonSmartOptimization) {
    this.buttonSmartOptimization = buttonSmartOptimization;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * 
   * @return componentId
  **/
  @javax.annotation.Nullable
  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial id(Long id) {
    
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


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial sellingPoints(List<String> sellingPoints) {
    
    this.sellingPoints = sellingPoints;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial addSellingPointsItem(String sellingPointsItem) {
    if (this.sellingPoints == null) {
      this.sellingPoints = new ArrayList<>();
    }
    this.sellingPoints.add(sellingPointsItem);
    return this;
  }

   /**
   * 
   * @return sellingPoints
  **/
  @javax.annotation.Nullable
  public List<String> getSellingPoints() {
    return sellingPoints;
  }


  public void setSellingPoints(List<String> sellingPoints) {
    this.sellingPoints = sellingPoints;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial qianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial = (QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial) o;
    return Objects.equals(this.actionButton, qianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.actionButton) &&
        Objects.equals(this.buttonSmartOptimization, qianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.buttonSmartOptimization) &&
        Objects.equals(this.componentId, qianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.componentId) &&
        Objects.equals(this.id, qianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.id) &&
        Objects.equals(this.imageId, qianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.imageId) &&
        Objects.equals(this.sellingPoints, qianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.sellingPoints) &&
        Objects.equals(this.title, qianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionButton, buttonSmartOptimization, componentId, id, imageId, sellingPoints, title);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial {\n");
    sb.append("    actionButton: ").append(toIndentedString(actionButton)).append("\n");
    sb.append("    buttonSmartOptimization: ").append(toIndentedString(buttonSmartOptimization)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    sellingPoints: ").append(toIndentedString(sellingPoints)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("action_button");
    openapiFields.add("button_smart_optimization");
    openapiFields.add("component_id");
    openapiFields.add("id");
    openapiFields.add("image_id");
    openapiFields.add("selling_points");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial
  */
  public static QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

