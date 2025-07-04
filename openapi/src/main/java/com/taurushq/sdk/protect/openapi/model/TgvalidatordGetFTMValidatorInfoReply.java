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
 * TgvalidatordGetFTMValidatorInfoReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordGetFTMValidatorInfoReply {
  public static final String SERIALIZED_NAME_VALIDATOR_I_D = "validatorID";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_I_D)
  private String validatorID;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_TOTAL_STAKE = "totalStake";
  @SerializedName(SERIALIZED_NAME_TOTAL_STAKE)
  private String totalStake;

  public static final String SERIALIZED_NAME_SELF_STAKE = "selfStake";
  @SerializedName(SERIALIZED_NAME_SELF_STAKE)
  private String selfStake;

  public static final String SERIALIZED_NAME_DEACTIVATED_AT_DATE_UNIX = "deactivatedAtDateUnix";
  @SerializedName(SERIALIZED_NAME_DEACTIVATED_AT_DATE_UNIX)
  private String deactivatedAtDateUnix;

  public static final String SERIALIZED_NAME_CREATED_AT_DATE_UNIX = "createdAtDateUnix";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_DATE_UNIX)
  private String createdAtDateUnix;

  public TgvalidatordGetFTMValidatorInfoReply() {
  }

  public TgvalidatordGetFTMValidatorInfoReply validatorID(String validatorID) {
    this.validatorID = validatorID;
    return this;
  }

  /**
   * Get validatorID
   * @return validatorID
   */
  @javax.annotation.Nullable
  public String getValidatorID() {
    return validatorID;
  }

  public void setValidatorID(String validatorID) {
    this.validatorID = validatorID;
  }


  public TgvalidatordGetFTMValidatorInfoReply address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public TgvalidatordGetFTMValidatorInfoReply isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   */
  @javax.annotation.Nullable
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public TgvalidatordGetFTMValidatorInfoReply totalStake(String totalStake) {
    this.totalStake = totalStake;
    return this;
  }

  /**
   * Get totalStake
   * @return totalStake
   */
  @javax.annotation.Nullable
  public String getTotalStake() {
    return totalStake;
  }

  public void setTotalStake(String totalStake) {
    this.totalStake = totalStake;
  }


  public TgvalidatordGetFTMValidatorInfoReply selfStake(String selfStake) {
    this.selfStake = selfStake;
    return this;
  }

  /**
   * Get selfStake
   * @return selfStake
   */
  @javax.annotation.Nullable
  public String getSelfStake() {
    return selfStake;
  }

  public void setSelfStake(String selfStake) {
    this.selfStake = selfStake;
  }


  public TgvalidatordGetFTMValidatorInfoReply deactivatedAtDateUnix(String deactivatedAtDateUnix) {
    this.deactivatedAtDateUnix = deactivatedAtDateUnix;
    return this;
  }

  /**
   * Get deactivatedAtDateUnix
   * @return deactivatedAtDateUnix
   */
  @javax.annotation.Nullable
  public String getDeactivatedAtDateUnix() {
    return deactivatedAtDateUnix;
  }

  public void setDeactivatedAtDateUnix(String deactivatedAtDateUnix) {
    this.deactivatedAtDateUnix = deactivatedAtDateUnix;
  }


  public TgvalidatordGetFTMValidatorInfoReply createdAtDateUnix(String createdAtDateUnix) {
    this.createdAtDateUnix = createdAtDateUnix;
    return this;
  }

  /**
   * Get createdAtDateUnix
   * @return createdAtDateUnix
   */
  @javax.annotation.Nullable
  public String getCreatedAtDateUnix() {
    return createdAtDateUnix;
  }

  public void setCreatedAtDateUnix(String createdAtDateUnix) {
    this.createdAtDateUnix = createdAtDateUnix;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordGetFTMValidatorInfoReply tgvalidatordGetFTMValidatorInfoReply = (TgvalidatordGetFTMValidatorInfoReply) o;
    return Objects.equals(this.validatorID, tgvalidatordGetFTMValidatorInfoReply.validatorID) &&
        Objects.equals(this.address, tgvalidatordGetFTMValidatorInfoReply.address) &&
        Objects.equals(this.isActive, tgvalidatordGetFTMValidatorInfoReply.isActive) &&
        Objects.equals(this.totalStake, tgvalidatordGetFTMValidatorInfoReply.totalStake) &&
        Objects.equals(this.selfStake, tgvalidatordGetFTMValidatorInfoReply.selfStake) &&
        Objects.equals(this.deactivatedAtDateUnix, tgvalidatordGetFTMValidatorInfoReply.deactivatedAtDateUnix) &&
        Objects.equals(this.createdAtDateUnix, tgvalidatordGetFTMValidatorInfoReply.createdAtDateUnix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validatorID, address, isActive, totalStake, selfStake, deactivatedAtDateUnix, createdAtDateUnix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordGetFTMValidatorInfoReply {\n");
    sb.append("    validatorID: ").append(toIndentedString(validatorID)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    totalStake: ").append(toIndentedString(totalStake)).append("\n");
    sb.append("    selfStake: ").append(toIndentedString(selfStake)).append("\n");
    sb.append("    deactivatedAtDateUnix: ").append(toIndentedString(deactivatedAtDateUnix)).append("\n");
    sb.append("    createdAtDateUnix: ").append(toIndentedString(createdAtDateUnix)).append("\n");
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
    openapiFields.add("validatorID");
    openapiFields.add("address");
    openapiFields.add("isActive");
    openapiFields.add("totalStake");
    openapiFields.add("selfStake");
    openapiFields.add("deactivatedAtDateUnix");
    openapiFields.add("createdAtDateUnix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordGetFTMValidatorInfoReply
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordGetFTMValidatorInfoReply.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordGetFTMValidatorInfoReply is not found in the empty JSON string", TgvalidatordGetFTMValidatorInfoReply.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordGetFTMValidatorInfoReply.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordGetFTMValidatorInfoReply` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("validatorID") != null && !jsonObj.get("validatorID").isJsonNull()) && !jsonObj.get("validatorID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validatorID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validatorID").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("totalStake") != null && !jsonObj.get("totalStake").isJsonNull()) && !jsonObj.get("totalStake").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalStake` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalStake").toString()));
      }
      if ((jsonObj.get("selfStake") != null && !jsonObj.get("selfStake").isJsonNull()) && !jsonObj.get("selfStake").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selfStake` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selfStake").toString()));
      }
      if ((jsonObj.get("deactivatedAtDateUnix") != null && !jsonObj.get("deactivatedAtDateUnix").isJsonNull()) && !jsonObj.get("deactivatedAtDateUnix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deactivatedAtDateUnix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deactivatedAtDateUnix").toString()));
      }
      if ((jsonObj.get("createdAtDateUnix") != null && !jsonObj.get("createdAtDateUnix").isJsonNull()) && !jsonObj.get("createdAtDateUnix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAtDateUnix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAtDateUnix").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordGetFTMValidatorInfoReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordGetFTMValidatorInfoReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordGetFTMValidatorInfoReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordGetFTMValidatorInfoReply.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordGetFTMValidatorInfoReply>() {
           @Override
           public void write(JsonWriter out, TgvalidatordGetFTMValidatorInfoReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordGetFTMValidatorInfoReply read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordGetFTMValidatorInfoReply given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordGetFTMValidatorInfoReply
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordGetFTMValidatorInfoReply
   */
  public static TgvalidatordGetFTMValidatorInfoReply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordGetFTMValidatorInfoReply.class);
  }

  /**
   * Convert an instance of TgvalidatordGetFTMValidatorInfoReply to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

