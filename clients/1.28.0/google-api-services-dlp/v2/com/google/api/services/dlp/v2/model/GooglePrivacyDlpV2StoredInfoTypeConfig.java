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

package com.google.api.services.dlp.v2.model;

/**
 * Configuration for a StoredInfoType.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2StoredInfoTypeConfig extends com.google.api.client.json.GenericJson {

  /**
   * Description of the StoredInfoType (max 256 characters).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display name of the StoredInfoType (max 256 characters).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2LargeCustomDictionaryConfig largeCustomDictionary;

  /**
   * Description of the StoredInfoType (max 256 characters).
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the StoredInfoType (max 256 characters).
   * @param description description or {@code null} for none
   */
  public GooglePrivacyDlpV2StoredInfoTypeConfig setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display name of the StoredInfoType (max 256 characters).
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name of the StoredInfoType (max 256 characters).
   * @param displayName displayName or {@code null} for none
   */
  public GooglePrivacyDlpV2StoredInfoTypeConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2LargeCustomDictionaryConfig getLargeCustomDictionary() {
    return largeCustomDictionary;
  }

  /**
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * @param largeCustomDictionary largeCustomDictionary or {@code null} for none
   */
  public GooglePrivacyDlpV2StoredInfoTypeConfig setLargeCustomDictionary(GooglePrivacyDlpV2LargeCustomDictionaryConfig largeCustomDictionary) {
    this.largeCustomDictionary = largeCustomDictionary;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2StoredInfoTypeConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2StoredInfoTypeConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2StoredInfoTypeConfig clone() {
    return (GooglePrivacyDlpV2StoredInfoTypeConfig) super.clone();
  }

}
