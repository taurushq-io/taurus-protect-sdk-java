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
 * TenantConfigNFTMinting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TenantConfigNFTMinting {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_PUBLIC_BASE_U_R_L = "publicBaseURL";
  @SerializedName(SERIALIZED_NAME_PUBLIC_BASE_U_R_L)
  private String publicBaseURL;

  public TenantConfigNFTMinting() {
  }

  public TenantConfigNFTMinting enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public TenantConfigNFTMinting publicBaseURL(String publicBaseURL) {
    this.publicBaseURL = publicBaseURL;
    return this;
  }

  /**
   * Get publicBaseURL
   * @return publicBaseURL
   */
  @javax.annotation.Nullable
  public String getPublicBaseURL() {
    return publicBaseURL;
  }

  public void setPublicBaseURL(String publicBaseURL) {
    this.publicBaseURL = publicBaseURL;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantConfigNFTMinting tenantConfigNFTMinting = (TenantConfigNFTMinting) o;
    return Objects.equals(this.enabled, tenantConfigNFTMinting.enabled) &&
        Objects.equals(this.publicBaseURL, tenantConfigNFTMinting.publicBaseURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, publicBaseURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantConfigNFTMinting {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    publicBaseURL: ").append(toIndentedString(publicBaseURL)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("publicBaseURL");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TenantConfigNFTMinting
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TenantConfigNFTMinting.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TenantConfigNFTMinting is not found in the empty JSON string", TenantConfigNFTMinting.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TenantConfigNFTMinting.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TenantConfigNFTMinting` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("publicBaseURL") != null && !jsonObj.get("publicBaseURL").isJsonNull()) && !jsonObj.get("publicBaseURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicBaseURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicBaseURL").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TenantConfigNFTMinting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TenantConfigNFTMinting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TenantConfigNFTMinting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TenantConfigNFTMinting.class));

       return (TypeAdapter<T>) new TypeAdapter<TenantConfigNFTMinting>() {
           @Override
           public void write(JsonWriter out, TenantConfigNFTMinting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TenantConfigNFTMinting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TenantConfigNFTMinting given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TenantConfigNFTMinting
   * @throws IOException if the JSON string is invalid with respect to TenantConfigNFTMinting
   */
  public static TenantConfigNFTMinting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TenantConfigNFTMinting.class);
  }

  /**
   * Convert an instance of TenantConfigNFTMinting to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

