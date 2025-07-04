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
 * TgvalidatordRequestBundleDetailsSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordRequestBundleDetailsSource {
  public static final String SERIALIZED_NAME_TOTAL_SOURCES = "totalSources";
  @SerializedName(SERIALIZED_NAME_TOTAL_SOURCES)
  private String totalSources;

  public static final String SERIALIZED_NAME_FROM_WALLET_ID = "fromWalletId";
  @SerializedName(SERIALIZED_NAME_FROM_WALLET_ID)
  private String fromWalletId;

  public static final String SERIALIZED_NAME_FROM_ADDRESS_ID = "fromAddressId";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS_ID)
  private String fromAddressId;

  public TgvalidatordRequestBundleDetailsSource() {
  }

  public TgvalidatordRequestBundleDetailsSource totalSources(String totalSources) {
    this.totalSources = totalSources;
    return this;
  }

  /**
   * Get totalSources
   * @return totalSources
   */
  @javax.annotation.Nullable
  public String getTotalSources() {
    return totalSources;
  }

  public void setTotalSources(String totalSources) {
    this.totalSources = totalSources;
  }


  public TgvalidatordRequestBundleDetailsSource fromWalletId(String fromWalletId) {
    this.fromWalletId = fromWalletId;
    return this;
  }

  /**
   * Get fromWalletId
   * @return fromWalletId
   */
  @javax.annotation.Nullable
  public String getFromWalletId() {
    return fromWalletId;
  }

  public void setFromWalletId(String fromWalletId) {
    this.fromWalletId = fromWalletId;
  }


  public TgvalidatordRequestBundleDetailsSource fromAddressId(String fromAddressId) {
    this.fromAddressId = fromAddressId;
    return this;
  }

  /**
   * Get fromAddressId
   * @return fromAddressId
   */
  @javax.annotation.Nullable
  public String getFromAddressId() {
    return fromAddressId;
  }

  public void setFromAddressId(String fromAddressId) {
    this.fromAddressId = fromAddressId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordRequestBundleDetailsSource tgvalidatordRequestBundleDetailsSource = (TgvalidatordRequestBundleDetailsSource) o;
    return Objects.equals(this.totalSources, tgvalidatordRequestBundleDetailsSource.totalSources) &&
        Objects.equals(this.fromWalletId, tgvalidatordRequestBundleDetailsSource.fromWalletId) &&
        Objects.equals(this.fromAddressId, tgvalidatordRequestBundleDetailsSource.fromAddressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSources, fromWalletId, fromAddressId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordRequestBundleDetailsSource {\n");
    sb.append("    totalSources: ").append(toIndentedString(totalSources)).append("\n");
    sb.append("    fromWalletId: ").append(toIndentedString(fromWalletId)).append("\n");
    sb.append("    fromAddressId: ").append(toIndentedString(fromAddressId)).append("\n");
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
    openapiFields.add("totalSources");
    openapiFields.add("fromWalletId");
    openapiFields.add("fromAddressId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordRequestBundleDetailsSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordRequestBundleDetailsSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordRequestBundleDetailsSource is not found in the empty JSON string", TgvalidatordRequestBundleDetailsSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordRequestBundleDetailsSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordRequestBundleDetailsSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("totalSources") != null && !jsonObj.get("totalSources").isJsonNull()) && !jsonObj.get("totalSources").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalSources` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalSources").toString()));
      }
      if ((jsonObj.get("fromWalletId") != null && !jsonObj.get("fromWalletId").isJsonNull()) && !jsonObj.get("fromWalletId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromWalletId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromWalletId").toString()));
      }
      if ((jsonObj.get("fromAddressId") != null && !jsonObj.get("fromAddressId").isJsonNull()) && !jsonObj.get("fromAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromAddressId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordRequestBundleDetailsSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordRequestBundleDetailsSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordRequestBundleDetailsSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordRequestBundleDetailsSource.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordRequestBundleDetailsSource>() {
           @Override
           public void write(JsonWriter out, TgvalidatordRequestBundleDetailsSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordRequestBundleDetailsSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordRequestBundleDetailsSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordRequestBundleDetailsSource
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordRequestBundleDetailsSource
   */
  public static TgvalidatordRequestBundleDetailsSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordRequestBundleDetailsSource.class);
  }

  /**
   * Convert an instance of TgvalidatordRequestBundleDetailsSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

