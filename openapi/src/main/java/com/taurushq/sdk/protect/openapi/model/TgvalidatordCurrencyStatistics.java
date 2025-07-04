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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCurrency;
import java.io.IOException;
import java.util.Arrays;

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
 * TgvalidatordCurrencyStatistics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordCurrencyStatistics {
  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_AVG_BALANCE_PER_ADDRESS = "avgBalancePerAddress";
  @SerializedName(SERIALIZED_NAME_AVG_BALANCE_PER_ADDRESS)
  private String avgBalancePerAddress;

  public static final String SERIALIZED_NAME_ADDRESSES_COUNT = "addressesCount";
  @SerializedName(SERIALIZED_NAME_ADDRESSES_COUNT)
  private String addressesCount;

  public static final String SERIALIZED_NAME_WALLETS_COUNT = "walletsCount";
  @SerializedName(SERIALIZED_NAME_WALLETS_COUNT)
  private String walletsCount;

  public static final String SERIALIZED_NAME_TOTAL_BALANCE = "totalBalance";
  @SerializedName(SERIALIZED_NAME_TOTAL_BALANCE)
  private String totalBalance;

  public static final String SERIALIZED_NAME_BASE_CURRENCY_TOTAL_VALUE = "baseCurrencyTotalValue";
  @SerializedName(SERIALIZED_NAME_BASE_CURRENCY_TOTAL_VALUE)
  private String baseCurrencyTotalValue;

  public static final String SERIALIZED_NAME_BASE_CURRENCY_TOTAL_VALUE_MAIN_UNIT = "baseCurrencyTotalValueMainUnit";
  @SerializedName(SERIALIZED_NAME_BASE_CURRENCY_TOTAL_VALUE_MAIN_UNIT)
  private String baseCurrencyTotalValueMainUnit;

  public static final String SERIALIZED_NAME_CURRENCY_INFO = "currencyInfo";
  @SerializedName(SERIALIZED_NAME_CURRENCY_INFO)
  private TgvalidatordCurrency currencyInfo;

  public TgvalidatordCurrencyStatistics() {
  }

  public TgvalidatordCurrencyStatistics symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
   */
  @javax.annotation.Nullable
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public TgvalidatordCurrencyStatistics blockchain(String blockchain) {
    this.blockchain = blockchain;
    return this;
  }

  /**
   * Get blockchain
   * @return blockchain
   */
  @javax.annotation.Nullable
  public String getBlockchain() {
    return blockchain;
  }

  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public TgvalidatordCurrencyStatistics avgBalancePerAddress(String avgBalancePerAddress) {
    this.avgBalancePerAddress = avgBalancePerAddress;
    return this;
  }

  /**
   * Balance in the smallest currency unit, based on the currency decimals. Example: 1500000000000000000 WEI (smallest ETH unit) corresponds to 1.5 ETH (ETH has 18 decimals places)
   * @return avgBalancePerAddress
   */
  @javax.annotation.Nullable
  public String getAvgBalancePerAddress() {
    return avgBalancePerAddress;
  }

  public void setAvgBalancePerAddress(String avgBalancePerAddress) {
    this.avgBalancePerAddress = avgBalancePerAddress;
  }


  public TgvalidatordCurrencyStatistics addressesCount(String addressesCount) {
    this.addressesCount = addressesCount;
    return this;
  }

  /**
   * Get addressesCount
   * @return addressesCount
   */
  @javax.annotation.Nullable
  public String getAddressesCount() {
    return addressesCount;
  }

  public void setAddressesCount(String addressesCount) {
    this.addressesCount = addressesCount;
  }


  public TgvalidatordCurrencyStatistics walletsCount(String walletsCount) {
    this.walletsCount = walletsCount;
    return this;
  }

  /**
   * Get walletsCount
   * @return walletsCount
   */
  @javax.annotation.Nullable
  public String getWalletsCount() {
    return walletsCount;
  }

  public void setWalletsCount(String walletsCount) {
    this.walletsCount = walletsCount;
  }


  public TgvalidatordCurrencyStatistics totalBalance(String totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  /**
   * Get totalBalance
   * @return totalBalance
   */
  @javax.annotation.Nullable
  public String getTotalBalance() {
    return totalBalance;
  }

  public void setTotalBalance(String totalBalance) {
    this.totalBalance = totalBalance;
  }


  public TgvalidatordCurrencyStatistics baseCurrencyTotalValue(String baseCurrencyTotalValue) {
    this.baseCurrencyTotalValue = baseCurrencyTotalValue;
    return this;
  }

  /**
   * Get baseCurrencyTotalValue
   * @return baseCurrencyTotalValue
   */
  @javax.annotation.Nullable
  public String getBaseCurrencyTotalValue() {
    return baseCurrencyTotalValue;
  }

  public void setBaseCurrencyTotalValue(String baseCurrencyTotalValue) {
    this.baseCurrencyTotalValue = baseCurrencyTotalValue;
  }


  public TgvalidatordCurrencyStatistics baseCurrencyTotalValueMainUnit(String baseCurrencyTotalValueMainUnit) {
    this.baseCurrencyTotalValueMainUnit = baseCurrencyTotalValueMainUnit;
    return this;
  }

  /**
   * Get baseCurrencyTotalValueMainUnit
   * @return baseCurrencyTotalValueMainUnit
   */
  @javax.annotation.Nullable
  public String getBaseCurrencyTotalValueMainUnit() {
    return baseCurrencyTotalValueMainUnit;
  }

  public void setBaseCurrencyTotalValueMainUnit(String baseCurrencyTotalValueMainUnit) {
    this.baseCurrencyTotalValueMainUnit = baseCurrencyTotalValueMainUnit;
  }


  public TgvalidatordCurrencyStatistics currencyInfo(TgvalidatordCurrency currencyInfo) {
    this.currencyInfo = currencyInfo;
    return this;
  }

  /**
   * Get currencyInfo
   * @return currencyInfo
   */
  @javax.annotation.Nullable
  public TgvalidatordCurrency getCurrencyInfo() {
    return currencyInfo;
  }

  public void setCurrencyInfo(TgvalidatordCurrency currencyInfo) {
    this.currencyInfo = currencyInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordCurrencyStatistics tgvalidatordCurrencyStatistics = (TgvalidatordCurrencyStatistics) o;
    return Objects.equals(this.symbol, tgvalidatordCurrencyStatistics.symbol) &&
        Objects.equals(this.blockchain, tgvalidatordCurrencyStatistics.blockchain) &&
        Objects.equals(this.avgBalancePerAddress, tgvalidatordCurrencyStatistics.avgBalancePerAddress) &&
        Objects.equals(this.addressesCount, tgvalidatordCurrencyStatistics.addressesCount) &&
        Objects.equals(this.walletsCount, tgvalidatordCurrencyStatistics.walletsCount) &&
        Objects.equals(this.totalBalance, tgvalidatordCurrencyStatistics.totalBalance) &&
        Objects.equals(this.baseCurrencyTotalValue, tgvalidatordCurrencyStatistics.baseCurrencyTotalValue) &&
        Objects.equals(this.baseCurrencyTotalValueMainUnit, tgvalidatordCurrencyStatistics.baseCurrencyTotalValueMainUnit) &&
        Objects.equals(this.currencyInfo, tgvalidatordCurrencyStatistics.currencyInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, blockchain, avgBalancePerAddress, addressesCount, walletsCount, totalBalance, baseCurrencyTotalValue, baseCurrencyTotalValueMainUnit, currencyInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordCurrencyStatistics {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    avgBalancePerAddress: ").append(toIndentedString(avgBalancePerAddress)).append("\n");
    sb.append("    addressesCount: ").append(toIndentedString(addressesCount)).append("\n");
    sb.append("    walletsCount: ").append(toIndentedString(walletsCount)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
    sb.append("    baseCurrencyTotalValue: ").append(toIndentedString(baseCurrencyTotalValue)).append("\n");
    sb.append("    baseCurrencyTotalValueMainUnit: ").append(toIndentedString(baseCurrencyTotalValueMainUnit)).append("\n");
    sb.append("    currencyInfo: ").append(toIndentedString(currencyInfo)).append("\n");
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
    openapiFields.add("symbol");
    openapiFields.add("blockchain");
    openapiFields.add("avgBalancePerAddress");
    openapiFields.add("addressesCount");
    openapiFields.add("walletsCount");
    openapiFields.add("totalBalance");
    openapiFields.add("baseCurrencyTotalValue");
    openapiFields.add("baseCurrencyTotalValueMainUnit");
    openapiFields.add("currencyInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordCurrencyStatistics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordCurrencyStatistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordCurrencyStatistics is not found in the empty JSON string", TgvalidatordCurrencyStatistics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordCurrencyStatistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordCurrencyStatistics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("blockchain") != null && !jsonObj.get("blockchain").isJsonNull()) && !jsonObj.get("blockchain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockchain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blockchain").toString()));
      }
      if ((jsonObj.get("avgBalancePerAddress") != null && !jsonObj.get("avgBalancePerAddress").isJsonNull()) && !jsonObj.get("avgBalancePerAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avgBalancePerAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avgBalancePerAddress").toString()));
      }
      if ((jsonObj.get("addressesCount") != null && !jsonObj.get("addressesCount").isJsonNull()) && !jsonObj.get("addressesCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressesCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressesCount").toString()));
      }
      if ((jsonObj.get("walletsCount") != null && !jsonObj.get("walletsCount").isJsonNull()) && !jsonObj.get("walletsCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletsCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletsCount").toString()));
      }
      if ((jsonObj.get("totalBalance") != null && !jsonObj.get("totalBalance").isJsonNull()) && !jsonObj.get("totalBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalBalance").toString()));
      }
      if ((jsonObj.get("baseCurrencyTotalValue") != null && !jsonObj.get("baseCurrencyTotalValue").isJsonNull()) && !jsonObj.get("baseCurrencyTotalValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseCurrencyTotalValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseCurrencyTotalValue").toString()));
      }
      if ((jsonObj.get("baseCurrencyTotalValueMainUnit") != null && !jsonObj.get("baseCurrencyTotalValueMainUnit").isJsonNull()) && !jsonObj.get("baseCurrencyTotalValueMainUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseCurrencyTotalValueMainUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseCurrencyTotalValueMainUnit").toString()));
      }
      // validate the optional field `currencyInfo`
      if (jsonObj.get("currencyInfo") != null && !jsonObj.get("currencyInfo").isJsonNull()) {
        TgvalidatordCurrency.validateJsonElement(jsonObj.get("currencyInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordCurrencyStatistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordCurrencyStatistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordCurrencyStatistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordCurrencyStatistics.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordCurrencyStatistics>() {
           @Override
           public void write(JsonWriter out, TgvalidatordCurrencyStatistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordCurrencyStatistics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordCurrencyStatistics given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordCurrencyStatistics
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordCurrencyStatistics
   */
  public static TgvalidatordCurrencyStatistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordCurrencyStatistics.class);
  }

  /**
   * Convert an instance of TgvalidatordCurrencyStatistics to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

