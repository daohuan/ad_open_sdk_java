/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorUpdateV30AnchorInfoPrivateChatButton;
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
 * 私信锚点，当anchor_type&#x3D;PRIVATE_CHAT必填
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class NativeAnchorUpdateV30RequestAnchorInfoPrivateChat {
  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private NativeAnchorUpdateV30AnchorInfoPrivateChatButton button = null;

  public static final String SERIALIZED_NAME_CHAT_GUIDE = "chat_guide";
  @SerializedName(SERIALIZED_NAME_CHAT_GUIDE)
  private String chatGuide = null;

  public static final String SERIALIZED_NAME_TOOLS_NAME = "tools_name";
  @SerializedName(SERIALIZED_NAME_TOOLS_NAME)
  private String toolsName = null;

  public NativeAnchorUpdateV30RequestAnchorInfoPrivateChat() {
  }

  public NativeAnchorUpdateV30RequestAnchorInfoPrivateChat button(NativeAnchorUpdateV30AnchorInfoPrivateChatButton button) {
    
    this.button = button;
    return this;
  }

   /**
   * Get button
   * @return button
  **/
  @javax.annotation.Nonnull
  public NativeAnchorUpdateV30AnchorInfoPrivateChatButton getButton() {
    return button;
  }


  public void setButton(NativeAnchorUpdateV30AnchorInfoPrivateChatButton button) {
    this.button = button;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoPrivateChat chatGuide(String chatGuide) {
    
    this.chatGuide = chatGuide;
    return this;
  }

   /**
   * 咨询引导文案，如私信获取一对一解答，不超过9个字
   * @return chatGuide
  **/
  @javax.annotation.Nonnull
  public String getChatGuide() {
    return chatGuide;
  }


  public void setChatGuide(String chatGuide) {
    this.chatGuide = chatGuide;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoPrivateChat toolsName(String toolsName) {
    
    this.toolsName = toolsName;
    return this;
  }

   /**
   * 工具名称，例如直播间私信咨询/在线咨询等，不超过20个字
   * @return toolsName
  **/
  @javax.annotation.Nonnull
  public String getToolsName() {
    return toolsName;
  }


  public void setToolsName(String toolsName) {
    this.toolsName = toolsName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorUpdateV30RequestAnchorInfoPrivateChat nativeAnchorUpdateV30RequestAnchorInfoPrivateChat = (NativeAnchorUpdateV30RequestAnchorInfoPrivateChat) o;
    return Objects.equals(this.button, nativeAnchorUpdateV30RequestAnchorInfoPrivateChat.button) &&
        Objects.equals(this.chatGuide, nativeAnchorUpdateV30RequestAnchorInfoPrivateChat.chatGuide) &&
        Objects.equals(this.toolsName, nativeAnchorUpdateV30RequestAnchorInfoPrivateChat.toolsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(button, chatGuide, toolsName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorUpdateV30RequestAnchorInfoPrivateChat {\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    chatGuide: ").append(toIndentedString(chatGuide)).append("\n");
    sb.append("    toolsName: ").append(toIndentedString(toolsName)).append("\n");
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
    openapiFields.add("button");
    openapiFields.add("chat_guide");
    openapiFields.add("tools_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("button");
    openapiRequiredFields.add("chat_guide");
    openapiRequiredFields.add("tools_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorUpdateV30RequestAnchorInfoPrivateChat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorUpdateV30RequestAnchorInfoPrivateChat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoPrivateChat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorUpdateV30RequestAnchorInfoPrivateChat.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoPrivateChat>() {
           @Override
           public void write(JsonWriter out, NativeAnchorUpdateV30RequestAnchorInfoPrivateChat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorUpdateV30RequestAnchorInfoPrivateChat read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorUpdateV30RequestAnchorInfoPrivateChat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorUpdateV30RequestAnchorInfoPrivateChat
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorUpdateV30RequestAnchorInfoPrivateChat
  */
  public static NativeAnchorUpdateV30RequestAnchorInfoPrivateChat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorUpdateV30RequestAnchorInfoPrivateChat.class);
  }

 /**
  * Convert an instance of NativeAnchorUpdateV30RequestAnchorInfoPrivateChat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

