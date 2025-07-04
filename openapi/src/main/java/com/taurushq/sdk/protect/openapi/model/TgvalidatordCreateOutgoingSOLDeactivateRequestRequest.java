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
 * TgvalidatordCreateOutgoingSOLDeactivateRequestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordCreateOutgoingSOLDeactivateRequestRequest {
  public static final String SERIALIZED_NAME_FROM_ADDRESS_ID = "fromAddressId";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS_ID)
  private String fromAddressId;

  public static final String SERIALIZED_NAME_FEE_LIMIT = "feeLimit";
  @SerializedName(SERIALIZED_NAME_FEE_LIMIT)
  private String feeLimit;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_USE_UNCONFIRMED_FUNDS = "useUnconfirmedFunds";
  @SerializedName(SERIALIZED_NAME_USE_UNCONFIRMED_FUNDS)
  private Boolean useUnconfirmedFunds;

  public static final String SERIALIZED_NAME_EXTERNAL_REQUEST_ID = "externalRequestId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_REQUEST_ID)
  private String externalRequestId;

  public TgvalidatordCreateOutgoingSOLDeactivateRequestRequest() {
  }

  public TgvalidatordCreateOutgoingSOLDeactivateRequestRequest fromAddressId(String fromAddressId) {
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


  public TgvalidatordCreateOutgoingSOLDeactivateRequestRequest feeLimit(String feeLimit) {
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


  public TgvalidatordCreateOutgoingSOLDeactivateRequestRequest comment(String comment) {
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


  public TgvalidatordCreateOutgoingSOLDeactivateRequestRequest useUnconfirmedFunds(Boolean useUnconfirmedFunds) {
    this.useUnconfirmedFunds = useUnconfirmedFunds;
    return this;
  }

  /**
   * Get useUnconfirmedFunds
   * @return useUnconfirmedFunds
   */
  @javax.annotation.Nullable
  public Boolean getUseUnconfirmedFunds() {
    return useUnconfirmedFunds;
  }

  public void setUseUnconfirmedFunds(Boolean useUnconfirmedFunds) {
    this.useUnconfirmedFunds = useUnconfirmedFunds;
  }


  public TgvalidatordCreateOutgoingSOLDeactivateRequestRequest externalRequestId(String externalRequestId) {
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
    TgvalidatordCreateOutgoingSOLDeactivateRequestRequest tgvalidatordCreateOutgoingSOLDeactivateRequestRequest = (TgvalidatordCreateOutgoingSOLDeactivateRequestRequest) o;
    return Objects.equals(this.fromAddressId, tgvalidatordCreateOutgoingSOLDeactivateRequestRequest.fromAddressId) &&
        Objects.equals(this.feeLimit, tgvalidatordCreateOutgoingSOLDeactivateRequestRequest.feeLimit) &&
        Objects.equals(this.comment, tgvalidatordCreateOutgoingSOLDeactivateRequestRequest.comment) &&
        Objects.equals(this.useUnconfirmedFunds, tgvalidatordCreateOutgoingSOLDeactivateRequestRequest.useUnconfirmedFunds) &&
        Objects.equals(this.externalRequestId, tgvalidatordCreateOutgoingSOLDeactivateRequestRequest.externalRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddressId, feeLimit, comment, useUnconfirmedFunds, externalRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordCreateOutgoingSOLDeactivateRequestRequest {\n");
    sb.append("    fromAddressId: ").append(toIndentedString(fromAddressId)).append("\n");
    sb.append("    feeLimit: ").append(toIndentedString(feeLimit)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    useUnconfirmedFunds: ").append(toIndentedString(useUnconfirmedFunds)).append("\n");
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
    openapiFields.add("feeLimit");
    openapiFields.add("comment");
    openapiFields.add("useUnconfirmedFunds");
    openapiFields.add("externalRequestId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fromAddressId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordCreateOutgoingSOLDeactivateRequestRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordCreateOutgoingSOLDeactivateRequestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordCreateOutgoingSOLDeactivateRequestRequest is not found in the empty JSON string", TgvalidatordCreateOutgoingSOLDeactivateRequestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordCreateOutgoingSOLDeactivateRequestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordCreateOutgoingSOLDeactivateRequestRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TgvalidatordCreateOutgoingSOLDeactivateRequestRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("fromAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromAddressId").toString()));
      }
      if ((jsonObj.get("feeLimit") != null && !jsonObj.get("feeLimit").isJsonNull()) && !jsonObj.get("feeLimit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feeLimit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feeLimit").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("externalRequestId") != null && !jsonObj.get("externalRequestId").isJsonNull()) && !jsonObj.get("externalRequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalRequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalRequestId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordCreateOutgoingSOLDeactivateRequestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordCreateOutgoingSOLDeactivateRequestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordCreateOutgoingSOLDeactivateRequestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordCreateOutgoingSOLDeactivateRequestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordCreateOutgoingSOLDeactivateRequestRequest>() {
           @Override
           public void write(JsonWriter out, TgvalidatordCreateOutgoingSOLDeactivateRequestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordCreateOutgoingSOLDeactivateRequestRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordCreateOutgoingSOLDeactivateRequestRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordCreateOutgoingSOLDeactivateRequestRequest
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordCreateOutgoingSOLDeactivateRequestRequest
   */
  public static TgvalidatordCreateOutgoingSOLDeactivateRequestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordCreateOutgoingSOLDeactivateRequestRequest.class);
  }

  /**
   * Convert an instance of TgvalidatordCreateOutgoingSOLDeactivateRequestRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

