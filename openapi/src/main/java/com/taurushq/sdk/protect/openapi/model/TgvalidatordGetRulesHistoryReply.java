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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordRules;
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
 * TgvalidatordGetRulesHistoryReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordGetRulesHistoryReply {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<TgvalidatordRules> result = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "totalItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private String totalItems;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private byte[] cursor;

  public TgvalidatordGetRulesHistoryReply() {
  }

  public TgvalidatordGetRulesHistoryReply result(List<TgvalidatordRules> result) {
    this.result = result;
    return this;
  }

  public TgvalidatordGetRulesHistoryReply addResultItem(TgvalidatordRules resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nullable
  public List<TgvalidatordRules> getResult() {
    return result;
  }

  public void setResult(List<TgvalidatordRules> result) {
    this.result = result;
  }


  public TgvalidatordGetRulesHistoryReply totalItems(String totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * Get totalItems
   * @return totalItems
   */
  @javax.annotation.Nullable
  public String getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(String totalItems) {
    this.totalItems = totalItems;
  }


  public TgvalidatordGetRulesHistoryReply cursor(byte[] cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
   */
  @javax.annotation.Nullable
  public byte[] getCursor() {
    return cursor;
  }

  public void setCursor(byte[] cursor) {
    this.cursor = cursor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordGetRulesHistoryReply tgvalidatordGetRulesHistoryReply = (TgvalidatordGetRulesHistoryReply) o;
    return Objects.equals(this.result, tgvalidatordGetRulesHistoryReply.result) &&
        Objects.equals(this.totalItems, tgvalidatordGetRulesHistoryReply.totalItems) &&
        Arrays.equals(this.cursor, tgvalidatordGetRulesHistoryReply.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, totalItems, Arrays.hashCode(cursor));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordGetRulesHistoryReply {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
    openapiFields.add("totalItems");
    openapiFields.add("cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordGetRulesHistoryReply
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordGetRulesHistoryReply.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordGetRulesHistoryReply is not found in the empty JSON string", TgvalidatordGetRulesHistoryReply.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordGetRulesHistoryReply.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordGetRulesHistoryReply` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        JsonArray jsonArrayresult = jsonObj.getAsJsonArray("result");
        if (jsonArrayresult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("result").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `result` to be an array in the JSON string but got `%s`", jsonObj.get("result").toString()));
          }

          // validate the optional field `result` (array)
          for (int i = 0; i < jsonArrayresult.size(); i++) {
            TgvalidatordRules.validateJsonElement(jsonArrayresult.get(i));
          };
        }
      }
      if ((jsonObj.get("totalItems") != null && !jsonObj.get("totalItems").isJsonNull()) && !jsonObj.get("totalItems").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalItems` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalItems").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordGetRulesHistoryReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordGetRulesHistoryReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordGetRulesHistoryReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordGetRulesHistoryReply.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordGetRulesHistoryReply>() {
           @Override
           public void write(JsonWriter out, TgvalidatordGetRulesHistoryReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordGetRulesHistoryReply read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordGetRulesHistoryReply given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordGetRulesHistoryReply
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordGetRulesHistoryReply
   */
  public static TgvalidatordGetRulesHistoryReply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordGetRulesHistoryReply.class);
  }

  /**
   * Convert an instance of TgvalidatordGetRulesHistoryReply to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

