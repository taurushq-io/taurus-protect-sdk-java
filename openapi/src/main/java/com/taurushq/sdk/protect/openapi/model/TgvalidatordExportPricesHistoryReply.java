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
 * TgvalidatordExportPricesHistoryReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordExportPricesHistoryReply {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public TgvalidatordExportPricesHistoryReply() {
  }

  public TgvalidatordExportPricesHistoryReply result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nullable
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  public TgvalidatordExportPricesHistoryReply period(String period) {
    this.period = period;
    return this;
  }

  /**
   * Period between the points of the history. See https://golang.org/pkg/time/#Duration.String for the format.
   * @return period
   */
  @javax.annotation.Nullable
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordExportPricesHistoryReply tgvalidatordExportPricesHistoryReply = (TgvalidatordExportPricesHistoryReply) o;
    return Objects.equals(this.result, tgvalidatordExportPricesHistoryReply.result) &&
        Objects.equals(this.period, tgvalidatordExportPricesHistoryReply.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordExportPricesHistoryReply {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
    openapiFields.add("result");
    openapiFields.add("period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordExportPricesHistoryReply
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordExportPricesHistoryReply.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordExportPricesHistoryReply is not found in the empty JSON string", TgvalidatordExportPricesHistoryReply.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordExportPricesHistoryReply.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordExportPricesHistoryReply` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if ((jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) && !jsonObj.get("period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordExportPricesHistoryReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordExportPricesHistoryReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordExportPricesHistoryReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordExportPricesHistoryReply.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordExportPricesHistoryReply>() {
           @Override
           public void write(JsonWriter out, TgvalidatordExportPricesHistoryReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordExportPricesHistoryReply read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordExportPricesHistoryReply given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordExportPricesHistoryReply
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordExportPricesHistoryReply
   */
  public static TgvalidatordExportPricesHistoryReply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordExportPricesHistoryReply.class);
  }

  /**
   * Convert an instance of TgvalidatordExportPricesHistoryReply to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

