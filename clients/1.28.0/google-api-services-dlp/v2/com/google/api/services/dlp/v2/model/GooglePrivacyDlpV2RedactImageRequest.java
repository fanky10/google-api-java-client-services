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
 * Request to search for potentially sensitive info in an image and redact it by covering it with a
 * colored rectangle.
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
public final class GooglePrivacyDlpV2RedactImageRequest extends com.google.api.client.json.GenericJson {

  /**
   * The content must be PNG, JPEG, SVG or BMP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2ByteContentItem byteItem;

  /**
   * The configuration for specifying what content to redact from images.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2ImageRedactionConfig> imageRedactionConfigs;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2ImageRedactionConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2ImageRedactionConfig.class);
  }

  /**
   * Whether the response should include findings along with the redacted image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeFindings;

  /**
   * Configuration for the inspector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InspectConfig inspectConfig;

  /**
   * The content must be PNG, JPEG, SVG or BMP.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2ByteContentItem getByteItem() {
    return byteItem;
  }

  /**
   * The content must be PNG, JPEG, SVG or BMP.
   * @param byteItem byteItem or {@code null} for none
   */
  public GooglePrivacyDlpV2RedactImageRequest setByteItem(GooglePrivacyDlpV2ByteContentItem byteItem) {
    this.byteItem = byteItem;
    return this;
  }

  /**
   * The configuration for specifying what content to redact from images.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2ImageRedactionConfig> getImageRedactionConfigs() {
    return imageRedactionConfigs;
  }

  /**
   * The configuration for specifying what content to redact from images.
   * @param imageRedactionConfigs imageRedactionConfigs or {@code null} for none
   */
  public GooglePrivacyDlpV2RedactImageRequest setImageRedactionConfigs(java.util.List<GooglePrivacyDlpV2ImageRedactionConfig> imageRedactionConfigs) {
    this.imageRedactionConfigs = imageRedactionConfigs;
    return this;
  }

  /**
   * Whether the response should include findings along with the redacted image.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeFindings() {
    return includeFindings;
  }

  /**
   * Whether the response should include findings along with the redacted image.
   * @param includeFindings includeFindings or {@code null} for none
   */
  public GooglePrivacyDlpV2RedactImageRequest setIncludeFindings(java.lang.Boolean includeFindings) {
    this.includeFindings = includeFindings;
    return this;
  }

  /**
   * Configuration for the inspector.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InspectConfig getInspectConfig() {
    return inspectConfig;
  }

  /**
   * Configuration for the inspector.
   * @param inspectConfig inspectConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2RedactImageRequest setInspectConfig(GooglePrivacyDlpV2InspectConfig inspectConfig) {
    this.inspectConfig = inspectConfig;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2RedactImageRequest set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2RedactImageRequest) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2RedactImageRequest clone() {
    return (GooglePrivacyDlpV2RedactImageRequest) super.clone();
  }

}
