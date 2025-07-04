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
 * TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest {
  public static final String SERIALIZED_NAME_FROM_ADDRESS_ID = "fromAddressId";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS_ID)
  private String fromAddressId;

  public static final String SERIALIZED_NAME_TO_VALIDATOR_ADDRESS_ID = "toValidatorAddressId";
  @SerializedName(SERIALIZED_NAME_TO_VALIDATOR_ADDRESS_ID)
  private String toValidatorAddressId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_FEE_LIMIT = "feeLimit";
  @SerializedName(SERIALIZED_NAME_FEE_LIMIT)
  private String feeLimit;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_TRANSACTION_REFERENCE = "transactionReference";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REFERENCE)
  private String transactionReference;

  public static final String SERIALIZED_NAME_EXTERNAL_REQUEST_ID = "externalRequestId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_REQUEST_ID)
  private String externalRequestId;

  public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest() {
  }

  public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest fromAddressId(String fromAddressId) {
    this.fromAddressId = fromAddressId;
    return this;
  }

  /**
   * Get fromAddressId
   * @return fromAddressId
   */
  @javax.annotation.Nonnull
  public String getFromAddressId() {
    return fromAddressId;
  }

  public void setFromAddressId(String fromAddressId) {
    this.fromAddressId = fromAddressId;
  }


  public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest toValidatorAddressId(String toValidatorAddressId) {
    this.toValidatorAddressId = toValidatorAddressId;
    return this;
  }

  /**
   * Get toValidatorAddressId
   * @return toValidatorAddressId
   */
  @javax.annotation.Nonnull
  public String getToValidatorAddressId() {
    return toValidatorAddressId;
  }

  public void setToValidatorAddressId(String toValidatorAddressId) {
    this.toValidatorAddressId = toValidatorAddressId;
  }


  public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest feeLimit(String feeLimit) {
    this.feeLimit = feeLimit;
    return this;
  }

  /**
   * Get feeLimit
   * @return feeLimit
   */
  @javax.annotation.Nullable
  public String getFeeLimit() {
    return feeLimit;
  }

  public void setFeeLimit(String feeLimit) {
    this.feeLimit = feeLimit;
  }


  public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest gasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

  /**
   * Get gasLimit
   * @return gasLimit
   */
  @javax.annotation.Nullable
  public String getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest comment(String comment) {
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


  public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest transactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
    return this;
  }

  /**
   * DEPRECATED - use externalRequestId instead
   * @return transactionReference
   */
  @javax.annotation.Nullable
  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }


  public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest externalRequestId(String externalRequestId) {
    this.externalRequestId = externalRequestId;
    return this;
  }

  /**
   * Identifier for the request in the user&#39;s system. This must be unique. Attempting to create a request with an existing externalRequestId will do nothing and return the originally created request
   * @return externalRequestId
   */
  @javax.annotation.Nullable
  public String getExternalRequestId() {
    return externalRequestId;
  }

  public void setExternalRequestId(String externalRequestId) {
    this.externalRequestId = externalRequestId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest tgvalidatordCreateOutgoingCosmosUndelegateRequestRequest = (TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest) o;
    return Objects.equals(this.fromAddressId, tgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.fromAddressId) &&
        Objects.equals(this.toValidatorAddressId, tgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.toValidatorAddressId) &&
        Objects.equals(this.amount, tgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.amount) &&
        Objects.equals(this.feeLimit, tgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.feeLimit) &&
        Objects.equals(this.gasLimit, tgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.gasLimit) &&
        Objects.equals(this.comment, tgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.comment) &&
        Objects.equals(this.transactionReference, tgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.transactionReference) &&
        Objects.equals(this.externalRequestId, tgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.externalRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddressId, toValidatorAddressId, amount, feeLimit, gasLimit, comment, transactionReference, externalRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest {\n");
    sb.append("    fromAddressId: ").append(toIndentedString(fromAddressId)).append("\n");
    sb.append("    toValidatorAddressId: ").append(toIndentedString(toValidatorAddressId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    feeLimit: ").append(toIndentedString(feeLimit)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    externalRequestId: ").append(toIndentedString(externalRequestId)).append("\n");
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
    openapiFields.add("fromAddressId");
    openapiFields.add("toValidatorAddressId");
    openapiFields.add("amount");
    openapiFields.add("feeLimit");
    openapiFields.add("gasLimit");
    openapiFields.add("comment");
    openapiFields.add("transactionReference");
    openapiFields.add("externalRequestId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fromAddressId");
    openapiRequiredFields.add("toValidatorAddressId");
    openapiRequiredFields.add("amount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest is not found in the empty JSON string", TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("fromAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromAddressId").toString()));
      }
      if (!jsonObj.get("toValidatorAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toValidatorAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toValidatorAddressId").toString()));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("feeLimit") != null && !jsonObj.get("feeLimit").isJsonNull()) && !jsonObj.get("feeLimit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feeLimit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feeLimit").toString()));
      }
      if ((jsonObj.get("gasLimit") != null && !jsonObj.get("gasLimit").isJsonNull()) && !jsonObj.get("gasLimit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gasLimit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gasLimit").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("transactionReference") != null && !jsonObj.get("transactionReference").isJsonNull()) && !jsonObj.get("transactionReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionReference").toString()));
      }
      if ((jsonObj.get("externalRequestId") != null && !jsonObj.get("externalRequestId").isJsonNull()) && !jsonObj.get("externalRequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalRequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalRequestId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest>() {
           @Override
           public void write(JsonWriter out, TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest
   */
  public static TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest.class);
  }

  /**
   * Convert an instance of TgvalidatordCreateOutgoingCosmosUndelegateRequestRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

