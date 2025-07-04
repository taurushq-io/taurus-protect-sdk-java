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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordGroupStatus;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * TgvalidatordGetAllGroupsStatusReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordGetAllGroupsStatusReply {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private String total;

  public static final String SERIALIZED_NAME_WORKING = "working";
  @SerializedName(SERIALIZED_NAME_WORKING)
  private String working;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private String failed;

  public static final String SERIALIZED_NAME_CLUSTER_GROUP_STATUS = "clusterGroupStatus";
  @SerializedName(SERIALIZED_NAME_CLUSTER_GROUP_STATUS)
  private String clusterGroupStatus;

  public static final String SERIALIZED_NAME_COMPONENT_STATUS = "componentStatus";
  @SerializedName(SERIALIZED_NAME_COMPONENT_STATUS)
  private Map<String, TgvalidatordGroupStatus> componentStatus = new HashMap<>();

  public TgvalidatordGetAllGroupsStatusReply() {
  }

  public TgvalidatordGetAllGroupsStatusReply total(String total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }


  public TgvalidatordGetAllGroupsStatusReply working(String working) {
    this.working = working;
    return this;
  }

  /**
   * Get working
   * @return working
   */
  @javax.annotation.Nullable
  public String getWorking() {
    return working;
  }

  public void setWorking(String working) {
    this.working = working;
  }


  public TgvalidatordGetAllGroupsStatusReply failed(String failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Get failed
   * @return failed
   */
  @javax.annotation.Nullable
  public String getFailed() {
    return failed;
  }

  public void setFailed(String failed) {
    this.failed = failed;
  }


  public TgvalidatordGetAllGroupsStatusReply clusterGroupStatus(String clusterGroupStatus) {
    this.clusterGroupStatus = clusterGroupStatus;
    return this;
  }

  /**
   * Get clusterGroupStatus
   * @return clusterGroupStatus
   */
  @javax.annotation.Nullable
  public String getClusterGroupStatus() {
    return clusterGroupStatus;
  }

  public void setClusterGroupStatus(String clusterGroupStatus) {
    this.clusterGroupStatus = clusterGroupStatus;
  }


  public TgvalidatordGetAllGroupsStatusReply componentStatus(Map<String, TgvalidatordGroupStatus> componentStatus) {
    this.componentStatus = componentStatus;
    return this;
  }

  public TgvalidatordGetAllGroupsStatusReply putComponentStatusItem(String key, TgvalidatordGroupStatus componentStatusItem) {
    if (this.componentStatus == null) {
      this.componentStatus = new HashMap<>();
    }
    this.componentStatus.put(key, componentStatusItem);
    return this;
  }

  /**
   * Get componentStatus
   * @return componentStatus
   */
  @javax.annotation.Nullable
  public Map<String, TgvalidatordGroupStatus> getComponentStatus() {
    return componentStatus;
  }

  public void setComponentStatus(Map<String, TgvalidatordGroupStatus> componentStatus) {
    this.componentStatus = componentStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordGetAllGroupsStatusReply tgvalidatordGetAllGroupsStatusReply = (TgvalidatordGetAllGroupsStatusReply) o;
    return Objects.equals(this.total, tgvalidatordGetAllGroupsStatusReply.total) &&
        Objects.equals(this.working, tgvalidatordGetAllGroupsStatusReply.working) &&
        Objects.equals(this.failed, tgvalidatordGetAllGroupsStatusReply.failed) &&
        Objects.equals(this.clusterGroupStatus, tgvalidatordGetAllGroupsStatusReply.clusterGroupStatus) &&
        Objects.equals(this.componentStatus, tgvalidatordGetAllGroupsStatusReply.componentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, working, failed, clusterGroupStatus, componentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordGetAllGroupsStatusReply {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    working: ").append(toIndentedString(working)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    clusterGroupStatus: ").append(toIndentedString(clusterGroupStatus)).append("\n");
    sb.append("    componentStatus: ").append(toIndentedString(componentStatus)).append("\n");
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
    openapiFields.add("total");
    openapiFields.add("working");
    openapiFields.add("failed");
    openapiFields.add("clusterGroupStatus");
    openapiFields.add("componentStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordGetAllGroupsStatusReply
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordGetAllGroupsStatusReply.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordGetAllGroupsStatusReply is not found in the empty JSON string", TgvalidatordGetAllGroupsStatusReply.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordGetAllGroupsStatusReply.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordGetAllGroupsStatusReply` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("total") != null && !jsonObj.get("total").isJsonNull()) && !jsonObj.get("total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total").toString()));
      }
      if ((jsonObj.get("working") != null && !jsonObj.get("working").isJsonNull()) && !jsonObj.get("working").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `working` to be a primitive type in the JSON string but got `%s`", jsonObj.get("working").toString()));
      }
      if ((jsonObj.get("failed") != null && !jsonObj.get("failed").isJsonNull()) && !jsonObj.get("failed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failed").toString()));
      }
      if ((jsonObj.get("clusterGroupStatus") != null && !jsonObj.get("clusterGroupStatus").isJsonNull()) && !jsonObj.get("clusterGroupStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clusterGroupStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clusterGroupStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordGetAllGroupsStatusReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordGetAllGroupsStatusReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordGetAllGroupsStatusReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordGetAllGroupsStatusReply.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordGetAllGroupsStatusReply>() {
           @Override
           public void write(JsonWriter out, TgvalidatordGetAllGroupsStatusReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordGetAllGroupsStatusReply read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordGetAllGroupsStatusReply given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordGetAllGroupsStatusReply
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordGetAllGroupsStatusReply
   */
  public static TgvalidatordGetAllGroupsStatusReply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordGetAllGroupsStatusReply.class);
  }

  /**
   * Convert an instance of TgvalidatordGetAllGroupsStatusReply to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

