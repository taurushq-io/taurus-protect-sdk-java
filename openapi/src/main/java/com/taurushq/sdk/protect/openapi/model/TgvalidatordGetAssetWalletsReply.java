/*
 * Taurus-PROTECT APIs
 * Taurus-PROTECT APIs description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.taurushq.sdk.protect.openapi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordResponseCursor;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordWalletInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.taurushq.sdk.protect.openapi.JSON;

/**
 * TgvalidatordGetAssetWalletsReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordGetAssetWalletsReply {
  public static final String SERIALIZED_NAME_WALLETS = "wallets";
  @SerializedName(SERIALIZED_NAME_WALLETS)
  private List<TgvalidatordWalletInfo> wallets = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "totalItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private String totalItems;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private byte[] next;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private TgvalidatordResponseCursor cursor;

  public TgvalidatordGetAssetWalletsReply() {
  }

  public TgvalidatordGetAssetWalletsReply wallets(List<TgvalidatordWalletInfo> wallets) {
    this.wallets = wallets;
    return this;
  }

  public TgvalidatordGetAssetWalletsReply addWalletsItem(TgvalidatordWalletInfo walletsItem) {
    if (this.wallets == null) {
      this.wallets = new ArrayList<>();
    }
    this.wallets.add(walletsItem);
    return this;
  }

  /**
   * Get wallets
   * @return wallets
   */
  @javax.annotation.Nullable
  public List<TgvalidatordWalletInfo> getWallets() {
    return wallets;
  }

  public void setWallets(List<TgvalidatordWalletInfo> wallets) {
    this.wallets = wallets;
  }


  public TgvalidatordGetAssetWalletsReply totalItems(String totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * Get totalItems
   * @return totalItems
   */
  @javax.annotation.Nullable
  public String getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(String totalItems) {
    this.totalItems = totalItems;
  }


  public TgvalidatordGetAssetWalletsReply next(byte[] next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   */
  @javax.annotation.Nullable
  public byte[] getNext() {
    return next;
  }

  public void setNext(byte[] next) {
    this.next = next;
  }


  public TgvalidatordGetAssetWalletsReply cursor(TgvalidatordResponseCursor cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
   */
  @javax.annotation.Nullable
  public TgvalidatordResponseCursor getCursor() {
    return cursor;
  }

  public void setCursor(TgvalidatordResponseCursor cursor) {
    this.cursor = cursor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordGetAssetWalletsReply tgvalidatordGetAssetWalletsReply = (TgvalidatordGetAssetWalletsReply) o;
    return Objects.equals(this.wallets, tgvalidatordGetAssetWalletsReply.wallets) &&
        Objects.equals(this.totalItems, tgvalidatordGetAssetWalletsReply.totalItems) &&
        Arrays.equals(this.next, tgvalidatordGetAssetWalletsReply.next) &&
        Objects.equals(this.cursor, tgvalidatordGetAssetWalletsReply.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wallets, totalItems, Arrays.hashCode(next), cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordGetAssetWalletsReply {\n");
    sb.append("    wallets: ").append(toIndentedString(wallets)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
    openapiFields.add("wallets");
    openapiFields.add("totalItems");
    openapiFields.add("next");
    openapiFields.add("cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordGetAssetWalletsReply
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordGetAssetWalletsReply.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordGetAssetWalletsReply is not found in the empty JSON string", TgvalidatordGetAssetWalletsReply.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordGetAssetWalletsReply.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordGetAssetWalletsReply` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("wallets") != null && !jsonObj.get("wallets").isJsonNull()) {
        JsonArray jsonArraywallets = jsonObj.getAsJsonArray("wallets");
        if (jsonArraywallets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("wallets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `wallets` to be an array in the JSON string but got `%s`", jsonObj.get("wallets").toString()));
          }

          // validate the optional field `wallets` (array)
          for (int i = 0; i < jsonArraywallets.size(); i++) {
            TgvalidatordWalletInfo.validateJsonElement(jsonArraywallets.get(i));
          };
        }
      }
      if ((jsonObj.get("totalItems") != null && !jsonObj.get("totalItems").isJsonNull()) && !jsonObj.get("totalItems").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalItems` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalItems").toString()));
      }
      // validate the optional field `cursor`
      if (jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) {
        TgvalidatordResponseCursor.validateJsonElement(jsonObj.get("cursor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordGetAssetWalletsReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordGetAssetWalletsReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordGetAssetWalletsReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordGetAssetWalletsReply.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordGetAssetWalletsReply>() {
           @Override
           public void write(JsonWriter out, TgvalidatordGetAssetWalletsReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordGetAssetWalletsReply read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordGetAssetWalletsReply given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordGetAssetWalletsReply
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordGetAssetWalletsReply
   */
  public static TgvalidatordGetAssetWalletsReply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordGetAssetWalletsReply.class);
  }

  /**
   * Convert an instance of TgvalidatordGetAssetWalletsReply to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

