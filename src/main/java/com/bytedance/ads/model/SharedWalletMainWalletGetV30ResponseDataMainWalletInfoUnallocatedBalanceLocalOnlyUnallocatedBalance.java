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
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceAvailableBalance;
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceUnavailableBalance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * 巨量本地推业务线待分配余额(单位元)
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-27T11:08:36.266445256+08:00[PRC]")
public class SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance {
  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "available_balance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceAvailableBalance availableBalance = null;

  public static final String SERIALIZED_NAME_UNAVAILABLE_BALANCE = "unavailable_balance";
  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceUnavailableBalance unavailableBalance = null;

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance() {
  }

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance availableBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceAvailableBalance availableBalance) {
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceAvailableBalance getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceAvailableBalance availableBalance) {
    this.availableBalance = availableBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance unavailableBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceUnavailableBalance unavailableBalance) {
    
    this.unavailableBalance = unavailableBalance;
    return this;
  }

   /**
   * Get unavailableBalance
   * @return unavailableBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceUnavailableBalance getUnavailableBalance() {
    return unavailableBalance;
  }


  public void setUnavailableBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalanceUnavailableBalance unavailableBalance) {
    this.unavailableBalance = unavailableBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance sharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance = (SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance) o;
    return Objects.equals(this.availableBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance.availableBalance) &&
        Objects.equals(this.unavailableBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance.unavailableBalance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableBalance, unavailableBalance);
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
    sb.append("class SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance {\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    unavailableBalance: ").append(toIndentedString(unavailableBalance)).append("\n");
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
    openapiFields.add("available_balance");
    openapiFields.add("unavailable_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance>() {
           @Override
           public void write(JsonWriter out, SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance
  * @throws IOException if the JSON string is invalid with respect to SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance
  */
  public static SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance.class);
  }

 /**
  * Convert an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

