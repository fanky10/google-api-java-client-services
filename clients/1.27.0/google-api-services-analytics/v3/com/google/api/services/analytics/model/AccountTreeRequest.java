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

package com.google.api.services.analytics.model;

/**
 * JSON template for an Analytics account tree requests. The account tree request is used in the
 * provisioning api to create an account, property, and view (profile). It contains the basic
 * information required to make these fields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountTreeRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountName;

  /**
   * Resource type for account ticket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profileName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timezone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webpropertyName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String websiteUrl;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountName() {
    return accountName;
  }

  /**
   * @param accountName accountName or {@code null} for none
   */
  public AccountTreeRequest setAccountName(java.lang.String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Resource type for account ticket.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for account ticket.
   * @param kind kind or {@code null} for none
   */
  public AccountTreeRequest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProfileName() {
    return profileName;
  }

  /**
   * @param profileName profileName or {@code null} for none
   */
  public AccountTreeRequest setProfileName(java.lang.String profileName) {
    this.profileName = profileName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTimezone() {
    return timezone;
  }

  /**
   * @param timezone timezone or {@code null} for none
   */
  public AccountTreeRequest setTimezone(java.lang.String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWebpropertyName() {
    return webpropertyName;
  }

  /**
   * @param webpropertyName webpropertyName or {@code null} for none
   */
  public AccountTreeRequest setWebpropertyName(java.lang.String webpropertyName) {
    this.webpropertyName = webpropertyName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWebsiteUrl() {
    return websiteUrl;
  }

  /**
   * @param websiteUrl websiteUrl or {@code null} for none
   */
  public AccountTreeRequest setWebsiteUrl(java.lang.String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  @Override
  public AccountTreeRequest set(String fieldName, Object value) {
    return (AccountTreeRequest) super.set(fieldName, value);
  }

  @Override
  public AccountTreeRequest clone() {
    return (AccountTreeRequest) super.clone();
  }

}
