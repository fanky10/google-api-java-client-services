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
 * Version of a StoredInfoType, including the configuration used to build it, create timestamp, and
 * current state.
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
public final class GooglePrivacyDlpV2StoredInfoTypeVersion extends com.google.api.client.json.GenericJson {

  /**
   * StoredInfoType configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2StoredInfoTypeConfig config;

  /**
   * Create timestamp of the version. Read-only, determined by the system when the version is
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Errors that occurred when creating this storedInfoType version, or anomalies detected in the
   * storedInfoType data that render it unusable. Only the five most recent errors will be
   * displayed, with the most recent error appearing first. For example, some of the data for stored
   * custom dictionaries is put in the user's Google Cloud Storage bucket, and if this data is
   * modified or deleted by the user or another system, the dictionary becomes invalid. If any
   * errors occur, fix the problem indicated by the error message and use the UpdateStoredInfoType
   * API method to create another version of the storedInfoType to continue using it, reusing the
   * same `config` if it was not the source of the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2Error> errors;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2Error used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2Error.class);
  }

  /**
   * Stored info type version state. Read-only, updated by the system during dictionary creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * StoredInfoType configuration.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2StoredInfoTypeConfig getConfig() {
    return config;
  }

  /**
   * StoredInfoType configuration.
   * @param config config or {@code null} for none
   */
  public GooglePrivacyDlpV2StoredInfoTypeVersion setConfig(GooglePrivacyDlpV2StoredInfoTypeConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Create timestamp of the version. Read-only, determined by the system when the version is
   * created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Create timestamp of the version. Read-only, determined by the system when the version is
   * created.
   * @param createTime createTime or {@code null} for none
   */
  public GooglePrivacyDlpV2StoredInfoTypeVersion setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Errors that occurred when creating this storedInfoType version, or anomalies detected in the
   * storedInfoType data that render it unusable. Only the five most recent errors will be
   * displayed, with the most recent error appearing first. For example, some of the data for stored
   * custom dictionaries is put in the user's Google Cloud Storage bucket, and if this data is
   * modified or deleted by the user or another system, the dictionary becomes invalid. If any
   * errors occur, fix the problem indicated by the error message and use the UpdateStoredInfoType
   * API method to create another version of the storedInfoType to continue using it, reusing the
   * same `config` if it was not the source of the error.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2Error> getErrors() {
    return errors;
  }

  /**
   * Errors that occurred when creating this storedInfoType version, or anomalies detected in the
   * storedInfoType data that render it unusable. Only the five most recent errors will be
   * displayed, with the most recent error appearing first. For example, some of the data for stored
   * custom dictionaries is put in the user's Google Cloud Storage bucket, and if this data is
   * modified or deleted by the user or another system, the dictionary becomes invalid. If any
   * errors occur, fix the problem indicated by the error message and use the UpdateStoredInfoType
   * API method to create another version of the storedInfoType to continue using it, reusing the
   * same `config` if it was not the source of the error.
   * @param errors errors or {@code null} for none
   */
  public GooglePrivacyDlpV2StoredInfoTypeVersion setErrors(java.util.List<GooglePrivacyDlpV2Error> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Stored info type version state. Read-only, updated by the system during dictionary creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Stored info type version state. Read-only, updated by the system during dictionary creation.
   * @param state state or {@code null} for none
   */
  public GooglePrivacyDlpV2StoredInfoTypeVersion setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2StoredInfoTypeVersion set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2StoredInfoTypeVersion) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2StoredInfoTypeVersion clone() {
    return (GooglePrivacyDlpV2StoredInfoTypeVersion) super.clone();
  }

}
