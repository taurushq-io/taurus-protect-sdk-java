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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordHealthReport;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * TgvalidatordHealth
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordHealth {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_COMPONENT_NAME = "componentName";
  @SerializedName(SERIALIZED_NAME_COMPONENT_NAME)
  private String componentName;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "componentId";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private String componentId;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_HEALTH_CHECK = "healthCheck";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK)
  private String healthCheck;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_REPORT = "report";
  @SerializedName(SERIALIZED_NAME_REPORT)
  private TgvalidatordHealthReport report;

  public static final String SERIALIZED_NAME_LAST_UPDATE_DATE = "lastUpdateDate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_DATE)
  private OffsetDateTime lastUpdateDate;

  public static final String SERIALIZED_NAME_VALID_UNTIL_DATE = "validUntilDate";
  @SerializedName(SERIALIZED_NAME_VALID_UNTIL_DATE)
  private OffsetDateTime validUntilDate;

  public TgvalidatordHealth() {
  }

  public TgvalidatordHealth tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public TgvalidatordHealth componentName(String componentName) {
    this.componentName = componentName;
    return this;
  }

  /**
   * Get componentName
   * @return componentName
   */
  @javax.annotation.Nullable
  public String getComponentName() {
    return componentName;
  }

  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }


  public TgvalidatordHealth componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   * @return componentId
   */
  @javax.annotation.Nullable
  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }


  public TgvalidatordHealth group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  public TgvalidatordHealth healthCheck(String healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

  /**
   * Get healthCheck
   * @return healthCheck
   */
  @javax.annotation.Nullable
  public String getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(String healthCheck) {
    this.healthCheck = healthCheck;
  }


  public TgvalidatordHealth status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public TgvalidatordHealth report(TgvalidatordHealthReport report) {
    this.report = report;
    return this;
  }

  /**
   * Get report
   * @return report
   */
  @javax.annotation.Nullable
  public TgvalidatordHealthReport getReport() {
    return report;
  }

  public void setReport(TgvalidatordHealthReport report) {
    this.report = report;
  }


  public TgvalidatordHealth lastUpdateDate(OffsetDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

  /**
   * Get lastUpdateDate
   * @return lastUpdateDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(OffsetDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public TgvalidatordHealth validUntilDate(OffsetDateTime validUntilDate) {
    this.validUntilDate = validUntilDate;
    return this;
  }

  /**
   * Get validUntilDate
   * @return validUntilDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getValidUntilDate() {
    return validUntilDate;
  }

  public void setValidUntilDate(OffsetDateTime validUntilDate) {
    this.validUntilDate = validUntilDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordHealth tgvalidatordHealth = (TgvalidatordHealth) o;
    return Objects.equals(this.tenantId, tgvalidatordHealth.tenantId) &&
        Objects.equals(this.componentName, tgvalidatordHealth.componentName) &&
        Objects.equals(this.componentId, tgvalidatordHealth.componentId) &&
        Objects.equals(this.group, tgvalidatordHealth.group) &&
        Objects.equals(this.healthCheck, tgvalidatordHealth.healthCheck) &&
        Objects.equals(this.status, tgvalidatordHealth.status) &&
        Objects.equals(this.report, tgvalidatordHealth.report) &&
        Objects.equals(this.lastUpdateDate, tgvalidatordHealth.lastUpdateDate) &&
        Objects.equals(this.validUntilDate, tgvalidatordHealth.validUntilDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, componentName, componentId, group, healthCheck, status, report, lastUpdateDate, validUntilDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordHealth {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("componentName");
    openapiFields.add("componentId");
    openapiFields.add("group");
    openapiFields.add("healthCheck");
    openapiFields.add("status");
    openapiFields.add("report");
    openapiFields.add("lastUpdateDate");
    openapiFields.add("validUntilDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordHealth
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordHealth.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordHealth is not found in the empty JSON string", TgvalidatordHealth.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordHealth.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordHealth` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("componentName") != null && !jsonObj.get("componentName").isJsonNull()) && !jsonObj.get("componentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentName").toString()));
      }
      if ((jsonObj.get("componentId") != null && !jsonObj.get("componentId").isJsonNull()) && !jsonObj.get("componentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("componentId").toString()));
      }
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if ((jsonObj.get("healthCheck") != null && !jsonObj.get("healthCheck").isJsonNull()) && !jsonObj.get("healthCheck").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `healthCheck` to be a primitive type in the JSON string but got `%s`", jsonObj.get("healthCheck").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `report`
      if (jsonObj.get("report") != null && !jsonObj.get("report").isJsonNull()) {
        TgvalidatordHealthReport.validateJsonElement(jsonObj.get("report"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordHealth.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordHealth' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordHealth> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordHealth.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordHealth>() {
           @Override
           public void write(JsonWriter out, TgvalidatordHealth value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordHealth read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordHealth given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordHealth
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordHealth
   */
  public static TgvalidatordHealth fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordHealth.class);
  }

  /**
   * Convert an instance of TgvalidatordHealth to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

