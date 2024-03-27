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
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2RequestAccountInfosInner;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2RequestAllAccountByCompany;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2RequestAllAccountsInner;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2ShareMode;
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
 * ToolsAppManagementBpShareCancelV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolsAppManagementBpShareCancelV2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_INFOS = "account_infos";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFOS)
  private List<ToolsAppManagementBpShareCancelV2RequestAccountInfosInner> accountInfos = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY = "all_account_by_company";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY)
  private ToolsAppManagementBpShareCancelV2RequestAllAccountByCompany allAccountByCompany = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNTS = "all_accounts";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNTS)
  private List<ToolsAppManagementBpShareCancelV2RequestAllAccountsInner> allAccounts = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private Long organizationId = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private ToolsAppManagementBpShareCancelV2ShareMode shareMode = null;

  public ToolsAppManagementBpShareCancelV2Request() {
  }

  public ToolsAppManagementBpShareCancelV2Request accountInfos(List<ToolsAppManagementBpShareCancelV2RequestAccountInfosInner> accountInfos) {
    
    this.accountInfos = accountInfos;
    return this;
  }

  public ToolsAppManagementBpShareCancelV2Request addAccountInfosItem(ToolsAppManagementBpShareCancelV2RequestAccountInfosInner accountInfosItem) {
    if (this.accountInfos == null) {
      this.accountInfos = new ArrayList<>();
    }
    this.accountInfos.add(accountInfosItem);
    return this;
  }

   /**
   * 
   * @return accountInfos
  **/
  @javax.annotation.Nullable
  public List<ToolsAppManagementBpShareCancelV2RequestAccountInfosInner> getAccountInfos() {
    return accountInfos;
  }


  public void setAccountInfos(List<ToolsAppManagementBpShareCancelV2RequestAccountInfosInner> accountInfos) {
    this.accountInfos = accountInfos;
  }


  public ToolsAppManagementBpShareCancelV2Request allAccountByCompany(ToolsAppManagementBpShareCancelV2RequestAllAccountByCompany allAccountByCompany) {
    
    this.allAccountByCompany = allAccountByCompany;
    return this;
  }

   /**
   * Get allAccountByCompany
   * @return allAccountByCompany
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2RequestAllAccountByCompany getAllAccountByCompany() {
    return allAccountByCompany;
  }


  public void setAllAccountByCompany(ToolsAppManagementBpShareCancelV2RequestAllAccountByCompany allAccountByCompany) {
    this.allAccountByCompany = allAccountByCompany;
  }


  public ToolsAppManagementBpShareCancelV2Request allAccounts(List<ToolsAppManagementBpShareCancelV2RequestAllAccountsInner> allAccounts) {
    
    this.allAccounts = allAccounts;
    return this;
  }

  public ToolsAppManagementBpShareCancelV2Request addAllAccountsItem(ToolsAppManagementBpShareCancelV2RequestAllAccountsInner allAccountsItem) {
    if (this.allAccounts == null) {
      this.allAccounts = new ArrayList<>();
    }
    this.allAccounts.add(allAccountsItem);
    return this;
  }

   /**
   * 
   * @return allAccounts
  **/
  @javax.annotation.Nullable
  public List<ToolsAppManagementBpShareCancelV2RequestAllAccountsInner> getAllAccounts() {
    return allAccounts;
  }


  public void setAllAccounts(List<ToolsAppManagementBpShareCancelV2RequestAllAccountsInner> allAccounts) {
    this.allAccounts = allAccounts;
  }


  public ToolsAppManagementBpShareCancelV2Request organizationId(Long organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  public Long getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  public ToolsAppManagementBpShareCancelV2Request packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 
   * @return packageId
  **/
  @javax.annotation.Nonnull
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public ToolsAppManagementBpShareCancelV2Request shareMode(ToolsAppManagementBpShareCancelV2ShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementBpShareCancelV2ShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(ToolsAppManagementBpShareCancelV2ShareMode shareMode) {
    this.shareMode = shareMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementBpShareCancelV2Request toolsAppManagementBpShareCancelV2Request = (ToolsAppManagementBpShareCancelV2Request) o;
    return Objects.equals(this.accountInfos, toolsAppManagementBpShareCancelV2Request.accountInfos) &&
        Objects.equals(this.allAccountByCompany, toolsAppManagementBpShareCancelV2Request.allAccountByCompany) &&
        Objects.equals(this.allAccounts, toolsAppManagementBpShareCancelV2Request.allAccounts) &&
        Objects.equals(this.organizationId, toolsAppManagementBpShareCancelV2Request.organizationId) &&
        Objects.equals(this.packageId, toolsAppManagementBpShareCancelV2Request.packageId) &&
        Objects.equals(this.shareMode, toolsAppManagementBpShareCancelV2Request.shareMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfos, allAccountByCompany, allAccounts, organizationId, packageId, shareMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareCancelV2Request {\n");
    sb.append("    accountInfos: ").append(toIndentedString(accountInfos)).append("\n");
    sb.append("    allAccountByCompany: ").append(toIndentedString(allAccountByCompany)).append("\n");
    sb.append("    allAccounts: ").append(toIndentedString(allAccounts)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
    openapiFields.add("account_infos");
    openapiFields.add("all_account_by_company");
    openapiFields.add("all_accounts");
    openapiFields.add("organization_id");
    openapiFields.add("package_id");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organization_id");
    openapiRequiredFields.add("package_id");
    openapiRequiredFields.add("share_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementBpShareCancelV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareCancelV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareCancelV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareCancelV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareCancelV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareCancelV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareCancelV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareCancelV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareCancelV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareCancelV2Request
  */
  public static ToolsAppManagementBpShareCancelV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareCancelV2Request.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareCancelV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

