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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordScimMeta;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordScimResource;
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
 * TgvalidatordScimCreateGroupReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordScimCreateGroupReply {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<String> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private TgvalidatordScimMeta meta;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<TgvalidatordScimResource> members = new ArrayList<>();

  public TgvalidatordScimCreateGroupReply() {
  }

  public TgvalidatordScimCreateGroupReply schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public TgvalidatordScimCreateGroupReply addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

  /**
   * Get schemas
   * @return schemas
   */
  @javax.annotation.Nullable
  public List<String> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }


  public TgvalidatordScimCreateGroupReply id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public TgvalidatordScimCreateGroupReply externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public TgvalidatordScimCreateGroupReply displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public TgvalidatordScimCreateGroupReply meta(TgvalidatordScimMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public TgvalidatordScimMeta getMeta() {
    return meta;
  }

  public void setMeta(TgvalidatordScimMeta meta) {
    this.meta = meta;
  }


  public TgvalidatordScimCreateGroupReply members(List<TgvalidatordScimResource> members) {
    this.members = members;
    return this;
  }

  public TgvalidatordScimCreateGroupReply addMembersItem(TgvalidatordScimResource membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Get members
   * @return members
   */
  @javax.annotation.Nullable
  public List<TgvalidatordScimResource> getMembers() {
    return members;
  }

  public void setMembers(List<TgvalidatordScimResource> members) {
    this.members = members;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordScimCreateGroupReply tgvalidatordScimCreateGroupReply = (TgvalidatordScimCreateGroupReply) o;
    return Objects.equals(this.schemas, tgvalidatordScimCreateGroupReply.schemas) &&
        Objects.equals(this.id, tgvalidatordScimCreateGroupReply.id) &&
        Objects.equals(this.externalId, tgvalidatordScimCreateGroupReply.externalId) &&
        Objects.equals(this.displayName, tgvalidatordScimCreateGroupReply.displayName) &&
        Objects.equals(this.meta, tgvalidatordScimCreateGroupReply.meta) &&
        Objects.equals(this.members, tgvalidatordScimCreateGroupReply.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, externalId, displayName, meta, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordScimCreateGroupReply {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("externalId");
    openapiFields.add("displayName");
    openapiFields.add("meta");
    openapiFields.add("members");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordScimCreateGroupReply
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordScimCreateGroupReply.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordScimCreateGroupReply is not found in the empty JSON string", TgvalidatordScimCreateGroupReply.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordScimCreateGroupReply.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordScimCreateGroupReply` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("schemas") != null && !jsonObj.get("schemas").isJsonNull() && !jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        TgvalidatordScimMeta.validateJsonElement(jsonObj.get("meta"));
      }
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull()) {
        JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
        if (jsonArraymembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
          }

          // validate the optional field `members` (array)
          for (int i = 0; i < jsonArraymembers.size(); i++) {
            TgvalidatordScimResource.validateJsonElement(jsonArraymembers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordScimCreateGroupReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordScimCreateGroupReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordScimCreateGroupReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordScimCreateGroupReply.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordScimCreateGroupReply>() {
           @Override
           public void write(JsonWriter out, TgvalidatordScimCreateGroupReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordScimCreateGroupReply read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordScimCreateGroupReply given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordScimCreateGroupReply
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordScimCreateGroupReply
   */
  public static TgvalidatordScimCreateGroupReply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordScimCreateGroupReply.class);
  }

  /**
   * Convert an instance of TgvalidatordScimCreateGroupReply to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

