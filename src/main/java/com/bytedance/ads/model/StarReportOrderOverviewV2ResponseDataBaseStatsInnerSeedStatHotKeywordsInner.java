/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerAllInner;
import com.bytedance.ads.model.StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerBrandInner;
import com.bytedance.ads.model.StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerCharacterInner;
import com.bytedance.ads.model.StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerPainInner;
import com.bytedance.ads.model.StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerProductInner;
import com.bytedance.ads.model.StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerSceneInner;
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
 * StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner {
  public static final String SERIALIZED_NAME_ALL = "all";
  @SerializedName(SERIALIZED_NAME_ALL)
  private List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerAllInner> all = null;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerBrandInner> brand = null;

  public static final String SERIALIZED_NAME_CHARACTER = "character";
  @SerializedName(SERIALIZED_NAME_CHARACTER)
  private List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerCharacterInner> character = null;

  public static final String SERIALIZED_NAME_PAIN = "pain";
  @SerializedName(SERIALIZED_NAME_PAIN)
  private List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerPainInner> pain = null;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerProductInner> product = null;

  public static final String SERIALIZED_NAME_SCENE = "scene";
  @SerializedName(SERIALIZED_NAME_SCENE)
  private List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerSceneInner> scene = null;

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner() {
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner all(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerAllInner> all) {
    
    this.all = all;
    return this;
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner addAllItem(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerAllInner allItem) {
    if (this.all == null) {
      this.all = new ArrayList<>();
    }
    this.all.add(allItem);
    return this;
  }

   /**
   * 全部
   * @return all
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerAllInner> getAll() {
    return all;
  }


  public void setAll(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerAllInner> all) {
    this.all = all;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner brand(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerBrandInner> brand) {
    
    this.brand = brand;
    return this;
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner addBrandItem(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerBrandInner brandItem) {
    if (this.brand == null) {
      this.brand = new ArrayList<>();
    }
    this.brand.add(brandItem);
    return this;
  }

   /**
   * 品牌
   * @return brand
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerBrandInner> getBrand() {
    return brand;
  }


  public void setBrand(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerBrandInner> brand) {
    this.brand = brand;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner character(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerCharacterInner> character) {
    
    this.character = character;
    return this;
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner addCharacterItem(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerCharacterInner characterItem) {
    if (this.character == null) {
      this.character = new ArrayList<>();
    }
    this.character.add(characterItem);
    return this;
  }

   /**
   * 角色
   * @return character
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerCharacterInner> getCharacter() {
    return character;
  }


  public void setCharacter(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerCharacterInner> character) {
    this.character = character;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner pain(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerPainInner> pain) {
    
    this.pain = pain;
    return this;
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner addPainItem(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerPainInner painItem) {
    if (this.pain == null) {
      this.pain = new ArrayList<>();
    }
    this.pain.add(painItem);
    return this;
  }

   /**
   * 痛点
   * @return pain
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerPainInner> getPain() {
    return pain;
  }


  public void setPain(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerPainInner> pain) {
    this.pain = pain;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner product(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerProductInner> product) {
    
    this.product = product;
    return this;
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner addProductItem(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerProductInner productItem) {
    if (this.product == null) {
      this.product = new ArrayList<>();
    }
    this.product.add(productItem);
    return this;
  }

   /**
   * 产品
   * @return product
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerProductInner> getProduct() {
    return product;
  }


  public void setProduct(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerProductInner> product) {
    this.product = product;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner scene(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerSceneInner> scene) {
    
    this.scene = scene;
    return this;
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner addSceneItem(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerSceneInner sceneItem) {
    if (this.scene == null) {
      this.scene = new ArrayList<>();
    }
    this.scene.add(sceneItem);
    return this;
  }

   /**
   * 场景
   * @return scene
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerSceneInner> getScene() {
    return scene;
  }


  public void setScene(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInnerSceneInner> scene) {
    this.scene = scene;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner = (StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner) o;
    return Objects.equals(this.all, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner.all) &&
        Objects.equals(this.brand, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner.brand) &&
        Objects.equals(this.character, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner.character) &&
        Objects.equals(this.pain, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner.pain) &&
        Objects.equals(this.product, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner.product) &&
        Objects.equals(this.scene, starReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner.scene);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, brand, character, pain, product, scene);
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
    sb.append("class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner {\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    pain: ").append(toIndentedString(pain)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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
    openapiFields.add("all");
    openapiFields.add("brand");
    openapiFields.add("character");
    openapiFields.add("pain");
    openapiFields.add("product");
    openapiFields.add("scene");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner
  */
  public static StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSeedStatHotKeywordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

