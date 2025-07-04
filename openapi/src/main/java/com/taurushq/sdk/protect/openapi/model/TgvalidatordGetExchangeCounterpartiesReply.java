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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordExchangeCounterparty;
import java.io.IOException;
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
 * TgvalidatordGetExchangeCounterpartiesReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordGetExchangeCounterpartiesReply {
  public static final String SERIALIZED_NAME_EXCHANGES_TOTAL_VALUATION = "exchangesTotalValuation";
  @SerializedName(SERIALIZED_NAME_EXCHANGES_TOTAL_VALUATION)
  private String exchangesTotalValuation;

  public static final String SERIALIZED_NAME_EXCHANGES = "exchanges";
  @SerializedName(SERIALIZED_NAME_EXCHANGES)
  private List<TgvalidatordExchangeCounterparty> exchanges = new ArrayList<>();

  public TgvalidatordGetExchangeCounterpartiesReply() {
  }

  public TgvalidatordGetExchangeCounterpartiesReply exchangesTotalValuation(String exchangesTotalValuation) {
    this.exchangesTotalValuation = exchangesTotalValuation;
    return this;
  }

  /**
   * Total valuation of all exchanges in the base currency main unit (CHF, EUR, USD etc...)
   * @return exchangesTotalValuation
   */
  @javax.annotation.Nullable
  public String getExchangesTotalValuation() {
    return exchangesTotalValuation;
  }

  public void setExchangesTotalValuation(String exchangesTotalValuation) {
    this.exchangesTotalValuation = exchangesTotalValuation;
  }


  public TgvalidatordGetExchangeCounterpartiesReply exchanges(List<TgvalidatordExchangeCounterparty> exchanges) {
    this.exchanges = exchanges;
    return this;
  }

  public TgvalidatordGetExchangeCounterpartiesReply addExchangesItem(TgvalidatordExchangeCounterparty exchangesItem) {
    if (this.exchanges == null) {
      this.exchanges = new ArrayList<>();
    }
    this.exchanges.add(exchangesItem);
    return this;
  }

  /**
   * Get exchanges
   * @return exchanges
   */
  @javax.annotation.Nullable
  public List<TgvalidatordExchangeCounterparty> getExchanges() {
    return exchanges;
  }

  public void setExchanges(List<TgvalidatordExchangeCounterparty> exchanges) {
    this.exchanges = exchanges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordGetExchangeCounterpartiesReply tgvalidatordGetExchangeCounterpartiesReply = (TgvalidatordGetExchangeCounterpartiesReply) o;
    return Objects.equals(this.exchangesTotalValuation, tgvalidatordGetExchangeCounterpartiesReply.exchangesTotalValuation) &&
        Objects.equals(this.exchanges, tgvalidatordGetExchangeCounterpartiesReply.exchanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangesTotalValuation, exchanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordGetExchangeCounterpartiesReply {\n");
    sb.append("    exchangesTotalValuation: ").append(toIndentedString(exchangesTotalValuation)).append("\n");
    sb.append("    exchanges: ").append(toIndentedString(exchanges)).append("\n");
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
    openapiFields.add("exchangesTotalValuation");
    openapiFields.add("exchanges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordGetExchangeCounterpartiesReply
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordGetExchangeCounterpartiesReply.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordGetExchangeCounterpartiesReply is not found in the empty JSON string", TgvalidatordGetExchangeCounterpartiesReply.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordGetExchangeCounterpartiesReply.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordGetExchangeCounterpartiesReply` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("exchangesTotalValuation") != null && !jsonObj.get("exchangesTotalValuation").isJsonNull()) && !jsonObj.get("exchangesTotalValuation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchangesTotalValuation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchangesTotalValuation").toString()));
      }
      if (jsonObj.get("exchanges") != null && !jsonObj.get("exchanges").isJsonNull()) {
        JsonArray jsonArrayexchanges = jsonObj.getAsJsonArray("exchanges");
        if (jsonArrayexchanges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("exchanges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `exchanges` to be an array in the JSON string but got `%s`", jsonObj.get("exchanges").toString()));
          }

          // validate the optional field `exchanges` (array)
          for (int i = 0; i < jsonArrayexchanges.size(); i++) {
            TgvalidatordExchangeCounterparty.validateJsonElement(jsonArrayexchanges.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordGetExchangeCounterpartiesReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordGetExchangeCounterpartiesReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordGetExchangeCounterpartiesReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordGetExchangeCounterpartiesReply.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordGetExchangeCounterpartiesReply>() {
           @Override
           public void write(JsonWriter out, TgvalidatordGetExchangeCounterpartiesReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordGetExchangeCounterpartiesReply read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordGetExchangeCounterpartiesReply given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordGetExchangeCounterpartiesReply
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordGetExchangeCounterpartiesReply
   */
  public static TgvalidatordGetExchangeCounterpartiesReply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordGetExchangeCounterpartiesReply.class);
  }

  /**
   * Convert an instance of TgvalidatordGetExchangeCounterpartiesReply to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

