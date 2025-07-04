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
import com.taurushq.sdk.protect.openapi.model.InternalUserAttribute;
import com.taurushq.sdk.protect.openapi.model.InternalUserKeyContainer;
import com.taurushq.sdk.protect.openapi.model.InternalUserVisibilityGroup;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordInternalUserApiKey;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordInternalUserGroup;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * TgvalidatordInternalUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T17:07:27.988152+02:00[Europe/Zurich]", comments = "Generator version: 7.9.0")
public class TgvalidatordInternalUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_EXTERNAL_USER_ID = "externalUserId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USER_ID)
  private String externalUserId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_PASSWORD_CHANGED = "passwordChanged";
  @SerializedName(SERIALIZED_NAME_PASSWORD_CHANGED)
  private Boolean passwordChanged;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "publicKey";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<TgvalidatordInternalUserGroup> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENFORCED_IN_RULES = "enforcedInRules";
  @SerializedName(SERIALIZED_NAME_ENFORCED_IN_RULES)
  private Boolean enforcedInRules;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private OffsetDateTime updateDate;

  public static final String SERIALIZED_NAME_TOTP_ENABLED = "totpEnabled";
  @SerializedName(SERIALIZED_NAME_TOTP_ENABLED)
  private Boolean totpEnabled;

  public static final String SERIALIZED_NAME_KEY_CONTAINER = "keyContainer";
  @SerializedName(SERIALIZED_NAME_KEY_CONTAINER)
  private InternalUserKeyContainer keyContainer;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "lastLogin";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private OffsetDateTime lastLogin;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<InternalUserAttribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_API_KEYS = "apiKeys";
  @SerializedName(SERIALIZED_NAME_API_KEYS)
  private List<TgvalidatordInternalUserApiKey> apiKeys = new ArrayList<>();

  public static final String SERIALIZED_NAME_VISIBILITY_GROUPS = "visibilityGroups";
  @SerializedName(SERIALIZED_NAME_VISIBILITY_GROUPS)
  private List<InternalUserVisibilityGroup> visibilityGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_PUBLIC_KEY_ENFORCED_IN_RULES = "publicKeyEnforcedInRules";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_ENFORCED_IN_RULES)
  private Boolean publicKeyEnforcedInRules;

  public TgvalidatordInternalUser() {
  }

  public TgvalidatordInternalUser id(String id) {
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


  public TgvalidatordInternalUser tenantId(String tenantId) {
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


  public TgvalidatordInternalUser externalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

  /**
   * Get externalUserId
   * @return externalUserId
   */
  @javax.annotation.Nullable
  public String getExternalUserId() {
    return externalUserId;
  }

  public void setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
  }


  public TgvalidatordInternalUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public TgvalidatordInternalUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public TgvalidatordInternalUser status(String status) {
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


  public TgvalidatordInternalUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public TgvalidatordInternalUser roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public TgvalidatordInternalUser addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nullable
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public TgvalidatordInternalUser passwordChanged(Boolean passwordChanged) {
    this.passwordChanged = passwordChanged;
    return this;
  }

  /**
   * Get passwordChanged
   * @return passwordChanged
   */
  @javax.annotation.Nullable
  public Boolean getPasswordChanged() {
    return passwordChanged;
  }

  public void setPasswordChanged(Boolean passwordChanged) {
    this.passwordChanged = passwordChanged;
  }


  public TgvalidatordInternalUser publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
   */
  @javax.annotation.Nullable
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public TgvalidatordInternalUser groups(List<TgvalidatordInternalUserGroup> groups) {
    this.groups = groups;
    return this;
  }

  public TgvalidatordInternalUser addGroupsItem(TgvalidatordInternalUserGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   */
  @javax.annotation.Nullable
  public List<TgvalidatordInternalUserGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<TgvalidatordInternalUserGroup> groups) {
    this.groups = groups;
  }


  public TgvalidatordInternalUser enforcedInRules(Boolean enforcedInRules) {
    this.enforcedInRules = enforcedInRules;
    return this;
  }

  /**
   * Get enforcedInRules
   * @return enforcedInRules
   */
  @javax.annotation.Nullable
  public Boolean getEnforcedInRules() {
    return enforcedInRules;
  }

  public void setEnforcedInRules(Boolean enforcedInRules) {
    this.enforcedInRules = enforcedInRules;
  }


  public TgvalidatordInternalUser creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public TgvalidatordInternalUser updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  public TgvalidatordInternalUser totpEnabled(Boolean totpEnabled) {
    this.totpEnabled = totpEnabled;
    return this;
  }

  /**
   * Get totpEnabled
   * @return totpEnabled
   */
  @javax.annotation.Nullable
  public Boolean getTotpEnabled() {
    return totpEnabled;
  }

  public void setTotpEnabled(Boolean totpEnabled) {
    this.totpEnabled = totpEnabled;
  }


  public TgvalidatordInternalUser keyContainer(InternalUserKeyContainer keyContainer) {
    this.keyContainer = keyContainer;
    return this;
  }

  /**
   * Get keyContainer
   * @return keyContainer
   */
  @javax.annotation.Nullable
  public InternalUserKeyContainer getKeyContainer() {
    return keyContainer;
  }

  public void setKeyContainer(InternalUserKeyContainer keyContainer) {
    this.keyContainer = keyContainer;
  }


  public TgvalidatordInternalUser username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public TgvalidatordInternalUser lastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Get lastLogin
   * @return lastLogin
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public TgvalidatordInternalUser attributes(List<InternalUserAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public TgvalidatordInternalUser addAttributesItem(InternalUserAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public List<InternalUserAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<InternalUserAttribute> attributes) {
    this.attributes = attributes;
  }


  public TgvalidatordInternalUser apiKeys(List<TgvalidatordInternalUserApiKey> apiKeys) {
    this.apiKeys = apiKeys;
    return this;
  }

  public TgvalidatordInternalUser addApiKeysItem(TgvalidatordInternalUserApiKey apiKeysItem) {
    if (this.apiKeys == null) {
      this.apiKeys = new ArrayList<>();
    }
    this.apiKeys.add(apiKeysItem);
    return this;
  }

  /**
   * Get apiKeys
   * @return apiKeys
   */
  @javax.annotation.Nullable
  public List<TgvalidatordInternalUserApiKey> getApiKeys() {
    return apiKeys;
  }

  public void setApiKeys(List<TgvalidatordInternalUserApiKey> apiKeys) {
    this.apiKeys = apiKeys;
  }


  public TgvalidatordInternalUser visibilityGroups(List<InternalUserVisibilityGroup> visibilityGroups) {
    this.visibilityGroups = visibilityGroups;
    return this;
  }

  public TgvalidatordInternalUser addVisibilityGroupsItem(InternalUserVisibilityGroup visibilityGroupsItem) {
    if (this.visibilityGroups == null) {
      this.visibilityGroups = new ArrayList<>();
    }
    this.visibilityGroups.add(visibilityGroupsItem);
    return this;
  }

  /**
   * Get visibilityGroups
   * @return visibilityGroups
   */
  @javax.annotation.Nullable
  public List<InternalUserVisibilityGroup> getVisibilityGroups() {
    return visibilityGroups;
  }

  public void setVisibilityGroups(List<InternalUserVisibilityGroup> visibilityGroups) {
    this.visibilityGroups = visibilityGroups;
  }


  public TgvalidatordInternalUser publicKeyEnforcedInRules(Boolean publicKeyEnforcedInRules) {
    this.publicKeyEnforcedInRules = publicKeyEnforcedInRules;
    return this;
  }

  /**
   * Get publicKeyEnforcedInRules
   * @return publicKeyEnforcedInRules
   */
  @javax.annotation.Nullable
  public Boolean getPublicKeyEnforcedInRules() {
    return publicKeyEnforcedInRules;
  }

  public void setPublicKeyEnforcedInRules(Boolean publicKeyEnforcedInRules) {
    this.publicKeyEnforcedInRules = publicKeyEnforcedInRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TgvalidatordInternalUser tgvalidatordInternalUser = (TgvalidatordInternalUser) o;
    return Objects.equals(this.id, tgvalidatordInternalUser.id) &&
        Objects.equals(this.tenantId, tgvalidatordInternalUser.tenantId) &&
        Objects.equals(this.externalUserId, tgvalidatordInternalUser.externalUserId) &&
        Objects.equals(this.firstName, tgvalidatordInternalUser.firstName) &&
        Objects.equals(this.lastName, tgvalidatordInternalUser.lastName) &&
        Objects.equals(this.status, tgvalidatordInternalUser.status) &&
        Objects.equals(this.email, tgvalidatordInternalUser.email) &&
        Objects.equals(this.roles, tgvalidatordInternalUser.roles) &&
        Objects.equals(this.passwordChanged, tgvalidatordInternalUser.passwordChanged) &&
        Objects.equals(this.publicKey, tgvalidatordInternalUser.publicKey) &&
        Objects.equals(this.groups, tgvalidatordInternalUser.groups) &&
        Objects.equals(this.enforcedInRules, tgvalidatordInternalUser.enforcedInRules) &&
        Objects.equals(this.creationDate, tgvalidatordInternalUser.creationDate) &&
        Objects.equals(this.updateDate, tgvalidatordInternalUser.updateDate) &&
        Objects.equals(this.totpEnabled, tgvalidatordInternalUser.totpEnabled) &&
        Objects.equals(this.keyContainer, tgvalidatordInternalUser.keyContainer) &&
        Objects.equals(this.username, tgvalidatordInternalUser.username) &&
        Objects.equals(this.lastLogin, tgvalidatordInternalUser.lastLogin) &&
        Objects.equals(this.attributes, tgvalidatordInternalUser.attributes) &&
        Objects.equals(this.apiKeys, tgvalidatordInternalUser.apiKeys) &&
        Objects.equals(this.visibilityGroups, tgvalidatordInternalUser.visibilityGroups) &&
        Objects.equals(this.publicKeyEnforcedInRules, tgvalidatordInternalUser.publicKeyEnforcedInRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, externalUserId, firstName, lastName, status, email, roles, passwordChanged, publicKey, groups, enforcedInRules, creationDate, updateDate, totpEnabled, keyContainer, username, lastLogin, attributes, apiKeys, visibilityGroups, publicKeyEnforcedInRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TgvalidatordInternalUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    passwordChanged: ").append(toIndentedString(passwordChanged)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    enforcedInRules: ").append(toIndentedString(enforcedInRules)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    totpEnabled: ").append(toIndentedString(totpEnabled)).append("\n");
    sb.append("    keyContainer: ").append(toIndentedString(keyContainer)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
    sb.append("    visibilityGroups: ").append(toIndentedString(visibilityGroups)).append("\n");
    sb.append("    publicKeyEnforcedInRules: ").append(toIndentedString(publicKeyEnforcedInRules)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("tenantId");
    openapiFields.add("externalUserId");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("status");
    openapiFields.add("email");
    openapiFields.add("roles");
    openapiFields.add("passwordChanged");
    openapiFields.add("publicKey");
    openapiFields.add("groups");
    openapiFields.add("enforcedInRules");
    openapiFields.add("creationDate");
    openapiFields.add("updateDate");
    openapiFields.add("totpEnabled");
    openapiFields.add("keyContainer");
    openapiFields.add("username");
    openapiFields.add("lastLogin");
    openapiFields.add("attributes");
    openapiFields.add("apiKeys");
    openapiFields.add("visibilityGroups");
    openapiFields.add("publicKeyEnforcedInRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TgvalidatordInternalUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TgvalidatordInternalUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TgvalidatordInternalUser is not found in the empty JSON string", TgvalidatordInternalUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TgvalidatordInternalUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TgvalidatordInternalUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("externalUserId") != null && !jsonObj.get("externalUserId").isJsonNull()) && !jsonObj.get("externalUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalUserId").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull() && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      if ((jsonObj.get("publicKey") != null && !jsonObj.get("publicKey").isJsonNull()) && !jsonObj.get("publicKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicKey").toString()));
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            TgvalidatordInternalUserGroup.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
      // validate the optional field `keyContainer`
      if (jsonObj.get("keyContainer") != null && !jsonObj.get("keyContainer").isJsonNull()) {
        InternalUserKeyContainer.validateJsonElement(jsonObj.get("keyContainer"));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            InternalUserAttribute.validateJsonElement(jsonArrayattributes.get(i));
          };
        }
      }
      if (jsonObj.get("apiKeys") != null && !jsonObj.get("apiKeys").isJsonNull()) {
        JsonArray jsonArrayapiKeys = jsonObj.getAsJsonArray("apiKeys");
        if (jsonArrayapiKeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("apiKeys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `apiKeys` to be an array in the JSON string but got `%s`", jsonObj.get("apiKeys").toString()));
          }

          // validate the optional field `apiKeys` (array)
          for (int i = 0; i < jsonArrayapiKeys.size(); i++) {
            TgvalidatordInternalUserApiKey.validateJsonElement(jsonArrayapiKeys.get(i));
          };
        }
      }
      if (jsonObj.get("visibilityGroups") != null && !jsonObj.get("visibilityGroups").isJsonNull()) {
        JsonArray jsonArrayvisibilityGroups = jsonObj.getAsJsonArray("visibilityGroups");
        if (jsonArrayvisibilityGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("visibilityGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `visibilityGroups` to be an array in the JSON string but got `%s`", jsonObj.get("visibilityGroups").toString()));
          }

          // validate the optional field `visibilityGroups` (array)
          for (int i = 0; i < jsonArrayvisibilityGroups.size(); i++) {
            InternalUserVisibilityGroup.validateJsonElement(jsonArrayvisibilityGroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TgvalidatordInternalUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TgvalidatordInternalUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TgvalidatordInternalUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TgvalidatordInternalUser.class));

       return (TypeAdapter<T>) new TypeAdapter<TgvalidatordInternalUser>() {
           @Override
           public void write(JsonWriter out, TgvalidatordInternalUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TgvalidatordInternalUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TgvalidatordInternalUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TgvalidatordInternalUser
   * @throws IOException if the JSON string is invalid with respect to TgvalidatordInternalUser
   */
  public static TgvalidatordInternalUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TgvalidatordInternalUser.class);
  }

  /**
   * Convert an instance of TgvalidatordInternalUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

