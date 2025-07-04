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
 * ScoreServiceRefreshWLAScoreBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class ScoreServiceRefreshWLAScoreBody {
  public static final String SERIALIZED_NAME_SCORE_PROVIDER = "scoreProvider";
  @SerializedName(SERIALIZED_NAME_SCORE_PROVIDER)
  private String scoreProvider;

  public ScoreServiceRefreshWLAScoreBody() {
  }

  public ScoreServiceRefreshWLAScoreBody scoreProvider(String scoreProvider) {
    this.scoreProvider = scoreProvider;
    return this;
  }

  /**
   * Get scoreProvider
   * @return scoreProvider
   */
  @javax.annotation.Nullable
  public String getScoreProvider() {
    return scoreProvider;
  }

  public void setScoreProvider(String scoreProvider) {
    this.scoreProvider = scoreProvider;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreServiceRefreshWLAScoreBody scoreServiceRefreshWLAScoreBody = (ScoreServiceRefreshWLAScoreBody) o;
    return Objects.equals(this.scoreProvider, scoreServiceRefreshWLAScoreBody.scoreProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scoreProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreServiceRefreshWLAScoreBody {\n");
    sb.append("    scoreProvider: ").append(toIndentedString(scoreProvider)).append("\n");
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
    openapiFields.add("scoreProvider");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ScoreServiceRefreshWLAScoreBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScoreServiceRefreshWLAScoreBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScoreServiceRefreshWLAScoreBody is not found in the empty JSON string", ScoreServiceRefreshWLAScoreBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScoreServiceRefreshWLAScoreBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScoreServiceRefreshWLAScoreBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scoreProvider") != null && !jsonObj.get("scoreProvider").isJsonNull()) && !jsonObj.get("scoreProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scoreProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scoreProvider").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScoreServiceRefreshWLAScoreBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScoreServiceRefreshWLAScoreBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScoreServiceRefreshWLAScoreBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScoreServiceRefreshWLAScoreBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ScoreServiceRefreshWLAScoreBody>() {
           @Override
           public void write(JsonWriter out, ScoreServiceRefreshWLAScoreBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScoreServiceRefreshWLAScoreBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ScoreServiceRefreshWLAScoreBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScoreServiceRefreshWLAScoreBody
   * @throws IOException if the JSON string is invalid with respect to ScoreServiceRefreshWLAScoreBody
   */
  public static ScoreServiceRefreshWLAScoreBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScoreServiceRefreshWLAScoreBody.class);
  }

  /**
   * Convert an instance of ScoreServiceRefreshWLAScoreBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

