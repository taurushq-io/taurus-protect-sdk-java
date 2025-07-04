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
 * TgvalidatordInitRemoteFeePayerRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordInitRemoteFeePayerRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXTERNAL_GROUP_ID = "externalGroupId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_GROUP_ID)
  private String externalGroupId;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_USER_KEY = "userKey";
  @SerializedName(SERIALIZED_NAME_USER_KEY)
  private String userKey;

  public static final String SERIALIZED_NAME_ENCRYPTION_KEY = "encryptionKey";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_KEY)
  private String encryptionKey;

  public static final String SERIALIZED_NAME_FORWARDER_ID = "forwarderId";
  @SerializedName(SERIALIZED_NAME_FORWARDER_ID)
  private String forwarderId;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creatorId";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_FEE_PAYER_ADDRESS_ID = "feePayerAddressId";
  @SerializedName(SERIALIZED_NAME_FEE_PAYER_ADDRESS_ID)
  private String feePayerAddressId;

  public TgvalidatordInitRemoteFeePayerRequest() {
  }

  public TgvalidatordInitRemoteFeePayerRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public TgvalidatordInitRemoteFeePayerRequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public TgvalidatordInitRemoteFeePayerRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public TgvalidatordInitRemoteFeePayerRequest externalGroupId(String externalGroupId) {
    this.externalGroupId = externalGroupId;
    return this;
  }

  /**
   * Get externalGroupId
   * @return externalGroupId
   */
  @javax.annotation.Nullable
  public String getExternalGroupId() {
    return externalGroupId;
  }

  public void setExternalGroupId(String externalGroupId) {
    this.externalGroupId = externalGroupId;
  }


  public TgvalidatordInitRemoteFeePayerRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public TgvalidatordInitRemoteFeePayerRequest userKey(String userKey) {
    this.userKey = userKey;
    return this;
  }

  /**
   * Get userKey
   * @return userKey
   */
  @javax.annotation.Nullable
  public String getUserKey() {
    return userKey;
  }

  public void setUserKey(String userKey) {
    this.userKey = userKey;
  }


  public TgvalidatordInitRemoteFeePayerRequest encryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
    return this;
  }

  /**
   * Get encryptionKey
   * @return encryptionKey
   */
  @javax.annotation.Nullable
  public String getEncryptionKey() {
    return encryptionKey;
  }

  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }


  public TgvalidatordInitRemoteFeePayerRequest forwarderId(String forwarderId) {
    this.forwarderId = forwarderId;
    return this;
  }

  /**
   * Get forwarderId
   * @return forwarderId
   */
  @javax.annotation.Nullable
  public String getForwarderId() {
    return forwarderId;
  }

  public void setForwarderId(String forwarderId) {
    this.forwarderId = forwarderId;
  }


  public TgvalidatordInitRemoteFeePayerRequest creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * Get creatorId
   * @return creatorId
   */
  @javax.annotation.Nullable
  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public TgvalidatordInitRemoteFeePayerRequest feePayerAddressId(String feePayerAddressId) {
    this.feePayerAddressId = feePayerAddressId;
    return this;
  }

  /**
   * Get feePayerAddressId
   * @return feePayerAddressId
   */
  @javax.annotation.Nullable
  public String getFeePayerAddressId() {
    return feePayerAddressId;
  }

  public void setFeePayerAddressId(String feePayerAddressId) {
    this.feePayerAddressId = feePayerAddressId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordInitRemoteFeePayerRequest tgvalidatordInitRemoteFeePayerRequest = (TgvalidatordInitRemoteFeePayerRequest) o;
    return Objects.equals(this.tenantId, tgvalidatordInitRemoteFeePayerRequest.tenantId) &&
        Objects.equals(this.url, tgvalidatordInitRemoteFeePayerRequest.url) &&
        Objects.equals(this.email, tgvalidatordInitRemoteFeePayerRequest.email) &&
        Objects.equals(this.externalGroupId, tgvalidatordInitRemoteFeePayerRequest.externalGroupId) &&
        Objects.equals(this.password, tgvalidatordInitRemoteFeePayerRequest.password) &&
        Objects.equals(this.userKey, tgvalidatordInitRemoteFeePayerRequest.userKey) &&
        Objects.equals(this.encryptionKey, tgvalidatordInitRemoteFeePayerRequest.encryptionKey) &&
        Objects.equals(this.forwarderId, tgvalidatordInitRemoteFeePayerRequest.forwarderId) &&
        Objects.equals(this.creatorId, tgvalidatordInitRemoteFeePayerRequest.creatorId) &&
        Objects.equals(this.feePayerAddressId, tgvalidatordInitRemoteFeePayerRequest.feePayerAddressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, url, email, externalGroupId, password, userKey, encryptionKey, forwarderId, creatorId, feePayerAddressId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordInitRemoteFeePayerRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalGroupId: ").append(toIndentedString(externalGroupId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userKey: ").append(toIndentedString(userKey)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    forwarderId: ").append(toIndentedString(forwarderId)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    feePayerAddressId: ").append(toIndentedString(feePayerAddressId)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("url");
    openapiFields.add("email");
    openapiFields.add("externalGroupId");
    openapiFields.add("password");
    openapiFields.add("userKey");
    openapiFields.add("encryptionKey");
    openapiFields.add("forwarderId");
    openapiFields.add("creatorId");
    openapiFields.add("feePayerAddressId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordInitRemoteFeePayerRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordInitRemoteFeePayerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordInitRemoteFeePayerRequest is not found in the empty JSON string", TgvalidatordInitRemoteFeePayerRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordInitRemoteFeePayerRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordInitRemoteFeePayerRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("externalGroupId") != null && !jsonObj.get("externalGroupId").isJsonNull()) && !jsonObj.get("externalGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalGroupId").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("userKey") != null && !jsonObj.get("userKey").isJsonNull()) && !jsonObj.get("userKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userKey").toString()));
      }
      if ((jsonObj.get("encryptionKey") != null && !jsonObj.get("encryptionKey").isJsonNull()) && !jsonObj.get("encryptionKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptionKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptionKey").toString()));
      }
      if ((jsonObj.get("forwarderId") != null && !jsonObj.get("forwarderId").isJsonNull()) && !jsonObj.get("forwarderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `forwarderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("forwarderId").toString()));
      }
      if ((jsonObj.get("creatorId") != null && !jsonObj.get("creatorId").isJsonNull()) && !jsonObj.get("creatorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creatorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creatorId").toString()));
      }
      if ((jsonObj.get("feePayerAddressId") != null && !jsonObj.get("feePayerAddressId").isJsonNull()) && !jsonObj.get("feePayerAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feePayerAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feePayerAddressId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordInitRemoteFeePayerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordInitRemoteFeePayerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordInitRemoteFeePayerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordInitRemoteFeePayerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordInitRemoteFeePayerRequest>() {
           @Override
           public void write(JsonWriter out, TgvalidatordInitRemoteFeePayerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordInitRemoteFeePayerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordInitRemoteFeePayerRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordInitRemoteFeePayerRequest
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordInitRemoteFeePayerRequest
   */
  public static TgvalidatordInitRemoteFeePayerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordInitRemoteFeePayerRequest.class);
  }

  /**
   * Convert an instance of TgvalidatordInitRemoteFeePayerRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

