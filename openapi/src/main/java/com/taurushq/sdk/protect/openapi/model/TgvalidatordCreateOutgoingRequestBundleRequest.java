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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCreateOutgoingRequestRequest;
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
 * TgvalidatordCreateOutgoingRequestBundleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordCreateOutgoingRequestBundleRequest {
  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<TgvalidatordCreateOutgoingRequestRequest> requests = new ArrayList<>();

  public TgvalidatordCreateOutgoingRequestBundleRequest() {
  }

  public TgvalidatordCreateOutgoingRequestBundleRequest requests(List<TgvalidatordCreateOutgoingRequestRequest> requests) {
    this.requests = requests;
    return this;
  }

  public TgvalidatordCreateOutgoingRequestBundleRequest addRequestsItem(TgvalidatordCreateOutgoingRequestRequest requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

  /**
   * Get requests
   * @return requests
   */
  @javax.annotation.Nonnull
  public List<TgvalidatordCreateOutgoingRequestRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<TgvalidatordCreateOutgoingRequestRequest> requests) {
    this.requests = requests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordCreateOutgoingRequestBundleRequest tgvalidatordCreateOutgoingRequestBundleRequest = (TgvalidatordCreateOutgoingRequestBundleRequest) o;
    return Objects.equals(this.requests, tgvalidatordCreateOutgoingRequestBundleRequest.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordCreateOutgoingRequestBundleRequest {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("requests");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordCreateOutgoingRequestBundleRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordCreateOutgoingRequestBundleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordCreateOutgoingRequestBundleRequest is not found in the empty JSON string", TgvalidatordCreateOutgoingRequestBundleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordCreateOutgoingRequestBundleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordCreateOutgoingRequestBundleRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TgvalidatordCreateOutgoingRequestBundleRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
      }

      JsonArray jsonArrayrequests = jsonObj.getAsJsonArray("requests");
      // validate the required field `requests` (array)
      for (int i = 0; i < jsonArrayrequests.size(); i++) {
        TgvalidatordCreateOutgoingRequestRequest.validateJsonElement(jsonArrayrequests.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordCreateOutgoingRequestBundleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordCreateOutgoingRequestBundleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordCreateOutgoingRequestBundleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordCreateOutgoingRequestBundleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordCreateOutgoingRequestBundleRequest>() {
           @Override
           public void write(JsonWriter out, TgvalidatordCreateOutgoingRequestBundleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordCreateOutgoingRequestBundleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordCreateOutgoingRequestBundleRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordCreateOutgoingRequestBundleRequest
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordCreateOutgoingRequestBundleRequest
   */
  public static TgvalidatordCreateOutgoingRequestBundleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordCreateOutgoingRequestBundleRequest.class);
  }

  /**
   * Convert an instance of TgvalidatordCreateOutgoingRequestBundleRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

