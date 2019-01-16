/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.androidenterprise.model;

/**
 * A Users resource represents an account associated with an enterprise. The account may be specific
 * to a device or to an individual user (who can then use the account across multiple devices). The
 * account may provide access to managed Google Play only, or to other Google services, depending on
 * the identity model: - The Google managed domain identity model requires synchronization to Google
 * account sources (via primaryEmail).  - The managed Google Play Accounts identity model provides a
 * dynamic means for enterprises to create user or device accounts as needed. These accounts provide
 * access to managed Google Play.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class User extends com.google.api.client.json.GenericJson {

  /**
   * A unique identifier you create for this user, such as "user342" or "asset#44418". Do not use
   * personally identifiable information (PII) for this property. Must always be set for EMM-managed
   * users. Not set for Google-managed users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountIdentifier;

  /**
   * The type of account that this user represents. A userAccount can be installed on multiple
   * devices, but a deviceAccount is specific to a single device. An EMM-managed user (emmManaged)
   * can be either type (userAccount, deviceAccount), but a Google-managed user (googleManaged) is
   * always a userAccount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountType;

  /**
   * The name that will appear in user interfaces. Setting this property is optional when creating
   * EMM-managed users. If you do set this property, use something generic about the organization
   * (such as "Example, Inc.") or your name (as EMM). Not used for Google-managed user accounts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The unique ID for the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "androidenterprise#user".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The entity that manages the user. With googleManaged users, the source of truth is Google so
   * EMMs have to make sure a Google Account exists for the user. With emmManaged users, the EMM is
   * in charge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managementType;

  /**
   * The user's primary email address, for example, "jsmith@example.com". Will always be set for
   * Google managed users and not set for EMM managed users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryEmail;

  /**
   * A unique identifier you create for this user, such as "user342" or "asset#44418". Do not use
   * personally identifiable information (PII) for this property. Must always be set for EMM-managed
   * users. Not set for Google-managed users.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountIdentifier() {
    return accountIdentifier;
  }

  /**
   * A unique identifier you create for this user, such as "user342" or "asset#44418". Do not use
   * personally identifiable information (PII) for this property. Must always be set for EMM-managed
   * users. Not set for Google-managed users.
   * @param accountIdentifier accountIdentifier or {@code null} for none
   */
  public User setAccountIdentifier(java.lang.String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

  /**
   * The type of account that this user represents. A userAccount can be installed on multiple
   * devices, but a deviceAccount is specific to a single device. An EMM-managed user (emmManaged)
   * can be either type (userAccount, deviceAccount), but a Google-managed user (googleManaged) is
   * always a userAccount.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountType() {
    return accountType;
  }

  /**
   * The type of account that this user represents. A userAccount can be installed on multiple
   * devices, but a deviceAccount is specific to a single device. An EMM-managed user (emmManaged)
   * can be either type (userAccount, deviceAccount), but a Google-managed user (googleManaged) is
   * always a userAccount.
   * @param accountType accountType or {@code null} for none
   */
  public User setAccountType(java.lang.String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * The name that will appear in user interfaces. Setting this property is optional when creating
   * EMM-managed users. If you do set this property, use something generic about the organization
   * (such as "Example, Inc.") or your name (as EMM). Not used for Google-managed user accounts.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name that will appear in user interfaces. Setting this property is optional when creating
   * EMM-managed users. If you do set this property, use something generic about the organization
   * (such as "Example, Inc.") or your name (as EMM). Not used for Google-managed user accounts.
   * @param displayName displayName or {@code null} for none
   */
  public User setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The unique ID for the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique ID for the user.
   * @param id id or {@code null} for none
   */
  public User setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "androidenterprise#user".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "androidenterprise#user".
   * @param kind kind or {@code null} for none
   */
  public User setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The entity that manages the user. With googleManaged users, the source of truth is Google so
   * EMMs have to make sure a Google Account exists for the user. With emmManaged users, the EMM is
   * in charge.
   * @return value or {@code null} for none
   */
  public java.lang.String getManagementType() {
    return managementType;
  }

  /**
   * The entity that manages the user. With googleManaged users, the source of truth is Google so
   * EMMs have to make sure a Google Account exists for the user. With emmManaged users, the EMM is
   * in charge.
   * @param managementType managementType or {@code null} for none
   */
  public User setManagementType(java.lang.String managementType) {
    this.managementType = managementType;
    return this;
  }

  /**
   * The user's primary email address, for example, "jsmith@example.com". Will always be set for
   * Google managed users and not set for EMM managed users.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryEmail() {
    return primaryEmail;
  }

  /**
   * The user's primary email address, for example, "jsmith@example.com". Will always be set for
   * Google managed users and not set for EMM managed users.
   * @param primaryEmail primaryEmail or {@code null} for none
   */
  public User setPrimaryEmail(java.lang.String primaryEmail) {
    this.primaryEmail = primaryEmail;
    return this;
  }

  @Override
  public User set(String fieldName, Object value) {
    return (User) super.set(fieldName, value);
  }

  @Override
  public User clone() {
    return (User) super.clone();
  }

}
