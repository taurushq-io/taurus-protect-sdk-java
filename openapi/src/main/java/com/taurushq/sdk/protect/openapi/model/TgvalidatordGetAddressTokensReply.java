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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordAssetBalance;
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
 * TgvalidatordGetAddressTokensReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordGetAddressTokensReply {
  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private List<TgvalidatordAssetBalance> balances = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private String total;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private byte[] next;

  public static final String SERIALIZED_NAME_TOTAL_ASSET_BALANCE = "totalAssetBalance";
  @SerializedName(SERIALIZED_NAME_TOTAL_ASSET_BALANCE)
  private TgvalidatordAssetBalance totalAssetBalance;

  public TgvalidatordGetAddressTokensReply() {
  }

  public TgvalidatordGetAddressTokensReply balances(List<TgvalidatordAssetBalance> balances) {
    this.balances = balances;
    return this;
  }

  public TgvalidatordGetAddressTokensReply addBalancesItem(TgvalidatordAssetBalance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * Get balances
   * @return balances
   */
  @javax.annotation.Nullable
  public List<TgvalidatordAssetBalance> getBalances() {
    return balances;
  }

  public void setBalances(List<TgvalidatordAssetBalance> balances) {
    this.balances = balances;
  }


  public TgvalidatordGetAddressTokensReply total(String total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }


  public TgvalidatordGetAddressTokensReply next(byte[] next) {
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


  public TgvalidatordGetAddressTokensReply totalAssetBalance(TgvalidatordAssetBalance totalAssetBalance) {
    this.totalAssetBalance = totalAssetBalance;
    return this;
  }

  /**
   * Get totalAssetBalance
   * @return totalAssetBalance
   */
  @javax.annotation.Nullable
  public TgvalidatordAssetBalance getTotalAssetBalance() {
    return totalAssetBalance;
  }

  public void setTotalAssetBalance(TgvalidatordAssetBalance totalAssetBalance) {
    this.totalAssetBalance = totalAssetBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordGetAddressTokensReply tgvalidatordGetAddressTokensReply = (TgvalidatordGetAddressTokensReply) o;
    return Objects.equals(this.balances, tgvalidatordGetAddressTokensReply.balances) &&
        Objects.equals(this.total, tgvalidatordGetAddressTokensReply.total) &&
        Arrays.equals(this.next, tgvalidatordGetAddressTokensReply.next) &&
        Objects.equals(this.totalAssetBalance, tgvalidatordGetAddressTokensReply.totalAssetBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, total, Arrays.hashCode(next), totalAssetBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordGetAddressTokensReply {\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    totalAssetBalance: ").append(toIndentedString(totalAssetBalance)).append("\n");
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
    openapiFields.add("balances");
    openapiFields.add("total");
    openapiFields.add("next");
    openapiFields.add("totalAssetBalance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordGetAddressTokensReply
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordGetAddressTokensReply.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordGetAddressTokensReply is not found in the empty JSON string", TgvalidatordGetAddressTokensReply.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordGetAddressTokensReply.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordGetAddressTokensReply` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("balances") != null && !jsonObj.get("balances").isJsonNull()) {
        JsonArray jsonArraybalances = jsonObj.getAsJsonArray("balances");
        if (jsonArraybalances != null) {
          // ensure the json data is an array
          if (!jsonObj.get("balances").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `balances` to be an array in the JSON string but got `%s`", jsonObj.get("balances").toString()));
          }

          // validate the optional field `balances` (array)
          for (int i = 0; i < jsonArraybalances.size(); i++) {
            TgvalidatordAssetBalance.validateJsonElement(jsonArraybalances.get(i));
          };
        }
      }
      if ((jsonObj.get("total") != null && !jsonObj.get("total").isJsonNull()) && !jsonObj.get("total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total").toString()));
      }
      // validate the optional field `totalAssetBalance`
      if (jsonObj.get("totalAssetBalance") != null && !jsonObj.get("totalAssetBalance").isJsonNull()) {
        TgvalidatordAssetBalance.validateJsonElement(jsonObj.get("totalAssetBalance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordGetAddressTokensReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordGetAddressTokensReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordGetAddressTokensReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordGetAddressTokensReply.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordGetAddressTokensReply>() {
           @Override
           public void write(JsonWriter out, TgvalidatordGetAddressTokensReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordGetAddressTokensReply read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordGetAddressTokensReply given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordGetAddressTokensReply
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordGetAddressTokensReply
   */
  public static TgvalidatordGetAddressTokensReply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordGetAddressTokensReply.class);
  }

  /**
   * Convert an instance of TgvalidatordGetAddressTokensReply to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

