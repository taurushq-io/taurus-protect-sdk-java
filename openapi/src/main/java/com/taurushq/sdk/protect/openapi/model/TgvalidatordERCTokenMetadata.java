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
 * TgvalidatordERCTokenMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordERCTokenMetadata {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private String decimals;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_BASE64_DATA = "base64Data";
  @SerializedName(SERIALIZED_NAME_BASE64_DATA)
  private String base64Data;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public TgvalidatordERCTokenMetadata() {
  }

  public TgvalidatordERCTokenMetadata name(String name) {
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


  public TgvalidatordERCTokenMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public TgvalidatordERCTokenMetadata decimals(String decimals) {
    this.decimals = decimals;
    return this;
  }

  /**
   * Get decimals
   * @return decimals
   */
  @javax.annotation.Nullable
  public String getDecimals() {
    return decimals;
  }

  public void setDecimals(String decimals) {
    this.decimals = decimals;
  }


  public TgvalidatordERCTokenMetadata dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
   */
  @javax.annotation.Nullable
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public TgvalidatordERCTokenMetadata base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }

  /**
   * Get base64Data
   * @return base64Data
   */
  @javax.annotation.Nullable
  public String getBase64Data() {
    return base64Data;
  }

  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }


  public TgvalidatordERCTokenMetadata uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
   */
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordERCTokenMetadata tgvalidatordERCTokenMetadata = (TgvalidatordERCTokenMetadata) o;
    return Objects.equals(this.name, tgvalidatordERCTokenMetadata.name) &&
        Objects.equals(this.description, tgvalidatordERCTokenMetadata.description) &&
        Objects.equals(this.decimals, tgvalidatordERCTokenMetadata.decimals) &&
        Objects.equals(this.dataType, tgvalidatordERCTokenMetadata.dataType) &&
        Objects.equals(this.base64Data, tgvalidatordERCTokenMetadata.base64Data) &&
        Objects.equals(this.uri, tgvalidatordERCTokenMetadata.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, decimals, dataType, base64Data, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordERCTokenMetadata {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(base64Data)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("decimals");
    openapiFields.add("dataType");
    openapiFields.add("base64Data");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordERCTokenMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordERCTokenMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordERCTokenMetadata is not found in the empty JSON string", TgvalidatordERCTokenMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordERCTokenMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordERCTokenMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("decimals") != null && !jsonObj.get("decimals").isJsonNull()) && !jsonObj.get("decimals").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decimals` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decimals").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if ((jsonObj.get("base64Data") != null && !jsonObj.get("base64Data").isJsonNull()) && !jsonObj.get("base64Data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base64Data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base64Data").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordERCTokenMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordERCTokenMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordERCTokenMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordERCTokenMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordERCTokenMetadata>() {
           @Override
           public void write(JsonWriter out, TgvalidatordERCTokenMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordERCTokenMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordERCTokenMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordERCTokenMetadata
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordERCTokenMetadata
   */
  public static TgvalidatordERCTokenMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordERCTokenMetadata.class);
  }

  /**
   * Convert an instance of TgvalidatordERCTokenMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

