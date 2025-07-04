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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordBalance;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCurrency;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordWalletAttribute;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * TgvalidatordWalletInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordWalletInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private TgvalidatordBalance balance;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_COIN = "coin";
  @SerializedName(SERIALIZED_NAME_COIN)
  private String coin;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private String container;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private String seed;

  public static final String SERIALIZED_NAME_ACCOUNT_PATH = "accountPath";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_PATH)
  private String accountPath;

  public static final String SERIALIZED_NAME_IS_OMNIBUS = "isOmnibus";
  @SerializedName(SERIALIZED_NAME_IS_OMNIBUS)
  private Boolean isOmnibus;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private OffsetDateTime updateDate;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_ADDRESSES_COUNT = "addressesCount";
  @SerializedName(SERIALIZED_NAME_ADDRESSES_COUNT)
  private String addressesCount;

  public static final String SERIALIZED_NAME_CURRENCY_INFO = "currencyInfo";
  @SerializedName(SERIALIZED_NAME_CURRENCY_INFO)
  private TgvalidatordCurrency currencyInfo;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<TgvalidatordWalletAttribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_VISIBILITY_GROUP_I_D = "visibilityGroupID";
  @SerializedName(SERIALIZED_NAME_VISIBILITY_GROUP_I_D)
  private String visibilityGroupID;

  public TgvalidatordWalletInfo() {
  }

  public TgvalidatordWalletInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public TgvalidatordWalletInfo balance(TgvalidatordBalance balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  @javax.annotation.Nullable
  public TgvalidatordBalance getBalance() {
    return balance;
  }

  public void setBalance(TgvalidatordBalance balance) {
    this.balance = balance;
  }


  public TgvalidatordWalletInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TgvalidatordWalletInfo coin(String coin) {
    this.coin = coin;
    return this;
  }

  /**
   * Get coin
   * @return coin
   */
  @javax.annotation.Nullable
  public String getCoin() {
    return coin;
  }

  public void setCoin(String coin) {
    this.coin = coin;
  }


  public TgvalidatordWalletInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TgvalidatordWalletInfo container(String container) {
    this.container = container;
    return this;
  }

  /**
   * Get container
   * @return container
   */
  @javax.annotation.Nullable
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }


  public TgvalidatordWalletInfo seed(String seed) {
    this.seed = seed;
    return this;
  }

  /**
   * Get seed
   * @return seed
   */
  @javax.annotation.Nullable
  public String getSeed() {
    return seed;
  }

  public void setSeed(String seed) {
    this.seed = seed;
  }


  public TgvalidatordWalletInfo accountPath(String accountPath) {
    this.accountPath = accountPath;
    return this;
  }

  /**
   * Get accountPath
   * @return accountPath
   */
  @javax.annotation.Nullable
  public String getAccountPath() {
    return accountPath;
  }

  public void setAccountPath(String accountPath) {
    this.accountPath = accountPath;
  }


  public TgvalidatordWalletInfo isOmnibus(Boolean isOmnibus) {
    this.isOmnibus = isOmnibus;
    return this;
  }

  /**
   * Get isOmnibus
   * @return isOmnibus
   */
  @javax.annotation.Nullable
  public Boolean getIsOmnibus() {
    return isOmnibus;
  }

  public void setIsOmnibus(Boolean isOmnibus) {
    this.isOmnibus = isOmnibus;
  }


  public TgvalidatordWalletInfo creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public TgvalidatordWalletInfo updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  public TgvalidatordWalletInfo customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public TgvalidatordWalletInfo comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public TgvalidatordWalletInfo disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
   */
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public TgvalidatordWalletInfo blockchain(String blockchain) {
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


  public TgvalidatordWalletInfo addressesCount(String addressesCount) {
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


  public TgvalidatordWalletInfo currencyInfo(TgvalidatordCurrency currencyInfo) {
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


  public TgvalidatordWalletInfo attributes(List<TgvalidatordWalletAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public TgvalidatordWalletInfo addAttributesItem(TgvalidatordWalletAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public List<TgvalidatordWalletAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<TgvalidatordWalletAttribute> attributes) {
    this.attributes = attributes;
  }


  public TgvalidatordWalletInfo network(String network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
   */
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }


  public TgvalidatordWalletInfo visibilityGroupID(String visibilityGroupID) {
    this.visibilityGroupID = visibilityGroupID;
    return this;
  }

  /**
   * Get visibilityGroupID
   * @return visibilityGroupID
   */
  @javax.annotation.Nullable
  public String getVisibilityGroupID() {
    return visibilityGroupID;
  }

  public void setVisibilityGroupID(String visibilityGroupID) {
    this.visibilityGroupID = visibilityGroupID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordWalletInfo tgvalidatordWalletInfo = (TgvalidatordWalletInfo) o;
    return Objects.equals(this.id, tgvalidatordWalletInfo.id) &&
        Objects.equals(this.balance, tgvalidatordWalletInfo.balance) &&
        Objects.equals(this.currency, tgvalidatordWalletInfo.currency) &&
        Objects.equals(this.coin, tgvalidatordWalletInfo.coin) &&
        Objects.equals(this.name, tgvalidatordWalletInfo.name) &&
        Objects.equals(this.container, tgvalidatordWalletInfo.container) &&
        Objects.equals(this.seed, tgvalidatordWalletInfo.seed) &&
        Objects.equals(this.accountPath, tgvalidatordWalletInfo.accountPath) &&
        Objects.equals(this.isOmnibus, tgvalidatordWalletInfo.isOmnibus) &&
        Objects.equals(this.creationDate, tgvalidatordWalletInfo.creationDate) &&
        Objects.equals(this.updateDate, tgvalidatordWalletInfo.updateDate) &&
        Objects.equals(this.customerId, tgvalidatordWalletInfo.customerId) &&
        Objects.equals(this.comment, tgvalidatordWalletInfo.comment) &&
        Objects.equals(this.disabled, tgvalidatordWalletInfo.disabled) &&
        Objects.equals(this.blockchain, tgvalidatordWalletInfo.blockchain) &&
        Objects.equals(this.addressesCount, tgvalidatordWalletInfo.addressesCount) &&
        Objects.equals(this.currencyInfo, tgvalidatordWalletInfo.currencyInfo) &&
        Objects.equals(this.attributes, tgvalidatordWalletInfo.attributes) &&
        Objects.equals(this.network, tgvalidatordWalletInfo.network) &&
        Objects.equals(this.visibilityGroupID, tgvalidatordWalletInfo.visibilityGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, balance, currency, coin, name, container, seed, accountPath, isOmnibus, creationDate, updateDate, customerId, comment, disabled, blockchain, addressesCount, currencyInfo, attributes, network, visibilityGroupID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordWalletInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    accountPath: ").append(toIndentedString(accountPath)).append("\n");
    sb.append("    isOmnibus: ").append(toIndentedString(isOmnibus)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    addressesCount: ").append(toIndentedString(addressesCount)).append("\n");
    sb.append("    currencyInfo: ").append(toIndentedString(currencyInfo)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    visibilityGroupID: ").append(toIndentedString(visibilityGroupID)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("balance");
    openapiFields.add("currency");
    openapiFields.add("coin");
    openapiFields.add("name");
    openapiFields.add("container");
    openapiFields.add("seed");
    openapiFields.add("accountPath");
    openapiFields.add("isOmnibus");
    openapiFields.add("creationDate");
    openapiFields.add("updateDate");
    openapiFields.add("customerId");
    openapiFields.add("comment");
    openapiFields.add("disabled");
    openapiFields.add("blockchain");
    openapiFields.add("addressesCount");
    openapiFields.add("currencyInfo");
    openapiFields.add("attributes");
    openapiFields.add("network");
    openapiFields.add("visibilityGroupID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordWalletInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordWalletInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordWalletInfo is not found in the empty JSON string", TgvalidatordWalletInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordWalletInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordWalletInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `balance`
      if (jsonObj.get("balance") != null && !jsonObj.get("balance").isJsonNull()) {
        TgvalidatordBalance.validateJsonElement(jsonObj.get("balance"));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("coin") != null && !jsonObj.get("coin").isJsonNull()) && !jsonObj.get("coin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coin").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("container") != null && !jsonObj.get("container").isJsonNull()) && !jsonObj.get("container").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `container` to be a primitive type in the JSON string but got `%s`", jsonObj.get("container").toString()));
      }
      if ((jsonObj.get("seed") != null && !jsonObj.get("seed").isJsonNull()) && !jsonObj.get("seed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seed").toString()));
      }
      if ((jsonObj.get("accountPath") != null && !jsonObj.get("accountPath").isJsonNull()) && !jsonObj.get("accountPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountPath").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("blockchain") != null && !jsonObj.get("blockchain").isJsonNull()) && !jsonObj.get("blockchain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockchain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blockchain").toString()));
      }
      if ((jsonObj.get("addressesCount") != null && !jsonObj.get("addressesCount").isJsonNull()) && !jsonObj.get("addressesCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressesCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressesCount").toString()));
      }
      // validate the optional field `currencyInfo`
      if (jsonObj.get("currencyInfo") != null && !jsonObj.get("currencyInfo").isJsonNull()) {
        TgvalidatordCurrency.validateJsonElement(jsonObj.get("currencyInfo"));
      }
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            TgvalidatordWalletAttribute.validateJsonElement(jsonArrayattributes.get(i));
          };
        }
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if ((jsonObj.get("visibilityGroupID") != null && !jsonObj.get("visibilityGroupID").isJsonNull()) && !jsonObj.get("visibilityGroupID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibilityGroupID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibilityGroupID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordWalletInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordWalletInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordWalletInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordWalletInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordWalletInfo>() {
           @Override
           public void write(JsonWriter out, TgvalidatordWalletInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordWalletInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordWalletInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordWalletInfo
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordWalletInfo
   */
  public static TgvalidatordWalletInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordWalletInfo.class);
  }

  /**
   * Convert an instance of TgvalidatordWalletInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

