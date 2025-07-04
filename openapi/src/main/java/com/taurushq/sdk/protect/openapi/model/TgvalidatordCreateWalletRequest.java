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
 * TgvalidatordCreateWalletRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordCreateWalletRequest {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private String container;

  public static final String SERIALIZED_NAME_IS_OMNIBUS = "isOmnibus";
  @SerializedName(SERIALIZED_NAME_IS_OMNIBUS)
  private Boolean isOmnibus;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_VISIBILITY_GROUP_I_D = "visibilityGroupID";
  @SerializedName(SERIALIZED_NAME_VISIBILITY_GROUP_I_D)
  private String visibilityGroupID;

  public TgvalidatordCreateWalletRequest() {
  }

  public TgvalidatordCreateWalletRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * You should either specify the currency OR the blockchain and the network
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TgvalidatordCreateWalletRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TgvalidatordCreateWalletRequest container(String container) {
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


  public TgvalidatordCreateWalletRequest isOmnibus(Boolean isOmnibus) {
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


  public TgvalidatordCreateWalletRequest comment(String comment) {
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


  public TgvalidatordCreateWalletRequest customerId(String customerId) {
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


  public TgvalidatordCreateWalletRequest blockchain(String blockchain) {
    this.blockchain = blockchain;
    return this;
  }

  /**
   * You should either specify the currency OR the blockchain and the network
   * @return blockchain
   */
  @javax.annotation.Nullable
  public String getBlockchain() {
    return blockchain;
  }

  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public TgvalidatordCreateWalletRequest network(String network) {
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


  public TgvalidatordCreateWalletRequest visibilityGroupID(String visibilityGroupID) {
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
    TgvalidatordCreateWalletRequest tgvalidatordCreateWalletRequest = (TgvalidatordCreateWalletRequest) o;
    return Objects.equals(this.currency, tgvalidatordCreateWalletRequest.currency) &&
        Objects.equals(this.name, tgvalidatordCreateWalletRequest.name) &&
        Objects.equals(this.container, tgvalidatordCreateWalletRequest.container) &&
        Objects.equals(this.isOmnibus, tgvalidatordCreateWalletRequest.isOmnibus) &&
        Objects.equals(this.comment, tgvalidatordCreateWalletRequest.comment) &&
        Objects.equals(this.customerId, tgvalidatordCreateWalletRequest.customerId) &&
        Objects.equals(this.blockchain, tgvalidatordCreateWalletRequest.blockchain) &&
        Objects.equals(this.network, tgvalidatordCreateWalletRequest.network) &&
        Objects.equals(this.visibilityGroupID, tgvalidatordCreateWalletRequest.visibilityGroupID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, name, container, isOmnibus, comment, customerId, blockchain, network, visibilityGroupID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordCreateWalletRequest {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    isOmnibus: ").append(toIndentedString(isOmnibus)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("name");
    openapiFields.add("container");
    openapiFields.add("isOmnibus");
    openapiFields.add("comment");
    openapiFields.add("customerId");
    openapiFields.add("blockchain");
    openapiFields.add("network");
    openapiFields.add("visibilityGroupID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordCreateWalletRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordCreateWalletRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordCreateWalletRequest is not found in the empty JSON string", TgvalidatordCreateWalletRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordCreateWalletRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordCreateWalletRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TgvalidatordCreateWalletRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("container") != null && !jsonObj.get("container").isJsonNull()) && !jsonObj.get("container").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `container` to be a primitive type in the JSON string but got `%s`", jsonObj.get("container").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("blockchain") != null && !jsonObj.get("blockchain").isJsonNull()) && !jsonObj.get("blockchain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockchain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blockchain").toString()));
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
       if (!TgvalidatordCreateWalletRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordCreateWalletRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordCreateWalletRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordCreateWalletRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordCreateWalletRequest>() {
           @Override
           public void write(JsonWriter out, TgvalidatordCreateWalletRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordCreateWalletRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordCreateWalletRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordCreateWalletRequest
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordCreateWalletRequest
   */
  public static TgvalidatordCreateWalletRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordCreateWalletRequest.class);
  }

  /**
   * Convert an instance of TgvalidatordCreateWalletRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

